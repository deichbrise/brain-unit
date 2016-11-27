package org.deichbrise.brainunit.core;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public interface Unit {
    Dataset transform(Dataset dataset);
    void addPreProcessingUnit(Unit preProcessingUnit);
    void addPostProcessingUnit(Unit postProcessingUnit);
}
