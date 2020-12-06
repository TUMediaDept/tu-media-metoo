package com.tumedia.metoo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.tumedia.metoo.service.member.MemberService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MemberService memberService;

	@Autowired
	private Environment env;
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
    public void configure(WebSecurity web) throws Exception {
    	if (Arrays.asList(env.getActiveProfiles()).contains("T"))
    	{
    		web.ignoring().antMatchers(
    				"/resources/**",
    				"/images/**",
    				"/api/images/**",
    				"/api/servletimages",
    				"/admin/**",
    				"/favicon.ico");
    	}
    	else
    	{
    		web.ignoring().antMatchers(
    				"/resources/**",
    				"/images/**",
    				"/api/images/**",
    				"/api/servletimages",
    				"/favicon.ico");
    	}
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

    	if (Arrays.asList(env.getActiveProfiles()).contains("T"))
    	{
    		http.csrf().disable();
    		
    		http.authorizeRequests()
    		.antMatchers("/**").permitAll()
    		.and()
    		.logout()
    		.logoutUrl("/auth/logout")
    		.invalidateHttpSession(true)
    		.logoutSuccessUrl("/auth/login")
    		;
    	}
    	else
    	{
    		http.csrf();
//        	.ignoringAntMatchers("/api/admin/statistics/selectData")
//        	.ignoringAntMatchers("/api/admin/statistics/updateData")
//        	;

    		http.authorizeRequests()
    		// 페이지 권한 설정
    		.antMatchers("/resources/**").permitAll()
    		.antMatchers("/admin/**").hasRole("ADMIN")
    		.antMatchers("/api/admin/**").hasRole("ADMIN")
    		.anyRequest().authenticated()
    		.and()
    		// 로그인 설정
    		.formLogin()
    		.loginPage("/auth/login")
    		.usernameParameter("username")
    		.passwordParameter("password")
    		.loginProcessingUrl("/auth/loginProcess")
    		.defaultSuccessUrl("/", true)
    		.permitAll()
    		.and()
    		// 로그아웃 설정
    		.logout()
    		.logoutRequestMatcher(new AntPathRequestMatcher("/auth/logout"))
    		.logoutSuccessUrl("/auth/login")
    		.invalidateHttpSession(true)
    		.and()
    		// 403 예외처리 핸들링
    		.exceptionHandling().accessDeniedPage("/auth/accessDenied");
    	}

    }

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
//    }

//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }

}