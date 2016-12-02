package org.brainunity.core.persistence.query;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface Query<T> {
    QueryResult<T> execute();
}
