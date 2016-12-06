package org.brainunity.data.persistence.model;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public abstract class AbstractDomainModel implements DomainModel {
    private String guid;

    @Override
    public String getGuid() {
        return guid;
    }

    @Override
    public void setGuid( final String guid ) {
        this.guid = guid;
    }
}
