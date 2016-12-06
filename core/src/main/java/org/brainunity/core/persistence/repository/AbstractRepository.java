package org.brainunity.core.persistence.repository;

import org.brainunity.core.model.DomainModel;
import org.brainunity.core.persistence.query.Query;
import org.brainunity.core.persistence.query.factory.QueryFactory;

import java.lang.reflect.ParameterizedType;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public abstract class AbstractRepository<T extends DomainModel> implements Repository<T> {
    private QueryFactory queryFactory;

    protected Query<T> createQuery() {
        return getQueryFactory().createQueryForType( getRepositoryClass() );
    }

    public QueryFactory getQueryFactory() {
        return queryFactory;
    }

    public void setQueryFactory( final QueryFactory queryFactory ) {
        this.queryFactory = queryFactory;
    }

    protected Class<T> getRepositoryClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
