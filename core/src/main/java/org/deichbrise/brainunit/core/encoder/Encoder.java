package org.deichbrise.brainunit.core.encoder;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public interface Encoder<T> {
    Row encode(T object);
    T decode(Row row);
}
