package com.example.web.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebServerConfig {

	/**
	 * 配置Tomcat
	 */
	@Bean
	public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory() {
		TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory();
		tomcatFactory.setPort(8080);
		tomcatFactory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
			@Override
			public void customize(Connector connector) {
				Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
				// 设置最大连接数
				protocol.setMaxConnections(2000);
				// 设置最大线程数
				protocol.setMaxThreads(2000);
				protocol.setConnectionTimeout(30000);
			}
		});
		return tomcatFactory;
	}

	/**
	 * 配置过滤器
	 */
	@Bean
	public FilterRegistrationBean characterFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new CharacterFilter());
		registration.addUrlPatterns("/*"); //
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("characterFilter");
		return registration;
	}
	@Bean
	public FilterRegistrationBean loginFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new LoginFilter());
		registration.addUrlPatterns("/pm/*"); //
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("loginFilter");
		return registration;
	}

}
