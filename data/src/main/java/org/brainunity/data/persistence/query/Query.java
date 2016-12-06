package org.brainunity.data.persistence.query;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface Query<T> {
    QueryResult<T> execute();
}
