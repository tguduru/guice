package org.tguduru.guice.service.impl;

import org.tguduru.guice.service.Log;

/**
 * A Simple implementation of {@link org.tguduru.guice.service.Log} which logs messages onto console.
 * @author Guduru, Thirupathi Reddy
 */
public class SysoutLogService implements Log{
    @Override
    public void log() {
        System.out.println("Logging onto console");
    }
}
