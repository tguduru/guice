/**
 *
 */
package org.guice.demo;

import org.guice.demo.module.Module;
import org.guice.demo.module.service.ProcessingService;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Modified on : Jul 27, 2014
 *
 */
public class GuiceDemo {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Injector injector = Guice.createInjector(new Module());
		final ProcessingService service = injector
				.getInstance(ProcessingService.class);
		service.processMessage();
	}

}
