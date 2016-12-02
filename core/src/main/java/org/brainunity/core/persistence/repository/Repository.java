package org.brainunity.core.persistence.repository;

import org.brainunity.core.model.DomainModel;

import java.util.List;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface Repository<T extends DomainModel> {
    List<T> findAll();
    T findByPrimaryKey(String pk);
}
