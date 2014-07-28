package org.guice.demo.module;

import org.guice.demo.module.service.Hello;
import org.guice.demo.module.service.Log;
import org.guice.demo.module.service.impl.HelloService;
import org.guice.demo.module.service.impl.LogService;

import com.google.inject.AbstractModule;

/**
 * Modified on : Jul 27, 2014 10:00:24 PM
 *
 */
public class Module extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		this.bind(Hello.class).to(HelloService.class);
		this.bind(Log.class).to(LogService.class);
	}

}
