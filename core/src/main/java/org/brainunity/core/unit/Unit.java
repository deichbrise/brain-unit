package org.brainunity.core.unit;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public interface Unit {
    void run();
    void addPreProcessingUnit(Unit preProcessingUnit);
    void addPostProcessingUnit(Unit postProcessingUnit);
    boolean isRunnableInCurrentUnit(Unit currentUnit);
}
