package com.stackroute.httphttpszullconfigpoc;

import com.stackroute.httphttpszullconfigpoc.filters.ErrorFilter;
import com.stackroute.httphttpszullconfigpoc.filters.PostFilter;
import com.stackroute.httphttpszullconfigpoc.filters.PreFilter;
import com.stackroute.httphttpszullconfigpoc.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class HttpHttpsZullConfigPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpHttpsZullConfigPocApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
