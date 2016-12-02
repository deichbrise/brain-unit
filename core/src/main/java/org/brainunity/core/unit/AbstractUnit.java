package org.brainunity.core.unit;

import org.brainunity.core.context.Context;
import org.brainunity.core.unit.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public abstract class AbstractUnit implements Unit {

    private List<Unit> preProcessorUnits;
    private List<Unit> postProcessorUnits;
    private Context context;

    protected void runPreProcessorCycle() {
        getPreProcessorUnits().forEach( unit -> {
            if(unit.isRunnableInCurrentUnit( this )) {
                unit.run();
            }
        });
    }

    public void run() {
        runPreProcessorCycle();
        execute();
        runPostProcessorCycle();
    }

    protected abstract void execute();

    protected void runPostProcessorCycle() {
        getPostProcessorUnits().forEach( unit -> {
            if(unit.isRunnableInCurrentUnit( this )) {
                unit.run();
            }
        });
    }

    protected abstract void expandParamaters();

    protected void save(Object object) {

    }

    protected void save(List<?> objects) {

    }

    public List<Unit> getPreProcessorUnits() {
        return preProcessorUnits;
    }

    public void setPreProcessorUnits( final List<Unit> preProcessorUnits ) {
        this.preProcessorUnits = preProcessorUnits;
    }

    public List<Unit> getPostProcessorUnits() {
        return postProcessorUnits;
    }

    public void setPostProcessorUnits( final List<Unit> postProcessorUnits ) {
        this.postProcessorUnits = postProcessorUnits;
    }

    public Context getContext() {
        return context;
    }

    public void setContext( final Context context ) {
        this.context = context;
    }
}
