package org.tguduru.guice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tguduru.guice.service.Log;

/**
 * A simple dao prints a message.
 * @author Guduru, Thirupathi Reddy
 *         Modified on : Jul 27, 2014 10:29:42 PM
 */
public class LogService implements Log {
    Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public void log() {
        LOGGER.info("Logging from LogService");
    }
}
