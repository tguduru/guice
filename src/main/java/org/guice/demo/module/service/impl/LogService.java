package org.guice.demo.module.service.impl;

import org.guice.demo.module.service.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Modified on : Jul 27, 2014 10:29:42 PM
 *
 */
public class LogService implements Log {
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public void log() {
		LOGGER.info("Logging from LogService");
	}
}
