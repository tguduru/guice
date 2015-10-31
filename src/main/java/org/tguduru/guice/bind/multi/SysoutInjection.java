package org.tguduru.guice.bind.multi;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.tguduru.guice.service.Log;

/**
 * Constructor injection with {@link SysoutInjection}
 * @author Guduru, Thirupathi Reddy
 */
public class SysoutInjection {
    private Log log;

    @Inject
    public SysoutInjection(@Named("sysout") final Log log) {
        this.log = log;
    }

    public void doWork(){
        log.log();
    }
}
