package org.deichbrise.brainunit.core.util;

import java.util.UUID;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public class GuidGenerator {
    public static synchronized String generateGuid() {
        return UUID.randomUUID().toString();
    }
}
