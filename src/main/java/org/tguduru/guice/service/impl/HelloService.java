package org.tguduru.guice.service.impl;

import org.tguduru.guice.service.Hello;

/**
 * A Simple dao prints a message
 * @author Guduru, Thirupathi Reddy
 * Modified on : Jul 27, 2014 10:33:46 PM
 */
public class HelloService implements Hello {
    public void sayHello() {
        System.out.println("Hello World !!!");
    }
}
