package org.deichbrise.brainunit.core.util;


import java.sql.Timestamp;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public class TimestampUtil {
    static public Timestamp fromCurrentTimeMillis() {
        return new Timestamp( System.currentTimeMillis() );
    }
}
