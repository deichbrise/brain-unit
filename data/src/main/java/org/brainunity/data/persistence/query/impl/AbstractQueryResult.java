package org.brainunity.data.persistence.query.impl;

import org.brainunity.data.persistence.mapper.DataMapper;
import org.brainunity.data.persistence.query.QueryResult;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public abstract class AbstractQueryResult<T> implements QueryResult<T> {
    private DataMapper<T> dataMapper;
}
