package com.example.demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().and()
                .authorizeRequests()
                .antMatchers("/login.html").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginProcessingUrl("/check")
                .usernameParameter("username").passwordParameter("password").loginPage("/login.html").successForwardUrl("/")
                .and()
                .csrf().disable().logout().logoutUrl("/logout").clearAuthentication(true);
    }

}
