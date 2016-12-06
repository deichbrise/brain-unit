package org.brainunity.core.unit;

import org.brainunity.core.action.Action;
import org.brainunity.core.context.Context;
import org.brainunity.core.unit.Unit;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public abstract class AbstractUnit implements Unit {
    private List<Action> actions;
    public void activate() {}
    public void finish() {}
}
