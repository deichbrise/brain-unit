package org.brainunity.core.encoder;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public class GenericEncoder<T> extends AbstractEncoder<T> {

    private Class<T> modelClass;

    public GenericEncoder(Class<T> clazz) {
        modelClass = clazz;
    }

    public Row encode( final T object ) {
        return null;
    }

    public T decode( final Row row ) {
        return null;
    }
}
