package org.brainunity.core.persistence.query.factory;

import org.brainunity.core.persistence.query.Query;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface QueryFactory {
    <T> Query<T> createQueryForType(Class<T> clazz);
}
