package org.tguduru.guice.bind.multi;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Guduru, Thirupathi Reddy
 */
public class MultiImplementationDemo {
    public static void main(final String[] args) {
        final Injector injector = Guice.createInjector(new MultiImplementationModule());
        final LoggingInjection logging = injector.getInstance(LoggingInjection.class);
        final SysoutInjection sysout = injector.getInstance(SysoutInjection.class);
        logging.doWork();
        sysout.doWork();
    }
}
