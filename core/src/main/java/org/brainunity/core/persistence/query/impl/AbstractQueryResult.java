package org.brainunity.core.persistence.query.impl;

import org.brainunity.core.persistence.mapper.DataMapper;
import org.brainunity.core.persistence.query.QueryResult;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public abstract class AbstractQueryResult<T> implements QueryResult<T> {
    private DataMapper<T> dataMapper;
}
