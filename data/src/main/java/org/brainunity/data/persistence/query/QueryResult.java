package org.brainunity.data.persistence.query;

import org.brainunity.data.persistence.Paging;

import java.util.List;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface QueryResult<T> {
    List<T> toList();

    Paging<T> toPaging( int pagingSize );
}
