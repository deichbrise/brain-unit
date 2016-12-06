package org.brainunity.data.persistence.repository;

import org.brainunity.data.persistence.model.DomainModel;

import java.util.List;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface Repository<T extends DomainModel> {
    List<T> findAll();
    T findByPrimaryKey(String pk);
}
