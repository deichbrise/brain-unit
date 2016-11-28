package org.brainunity.core.parameters;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public class ParamaterSet {
    private Map<String, String> paramters = new Hashtable<String, String>();

    public Map<String, String> getParamters() {
        return paramters;
    }

    public void setParamters( final Map<String, String> paramters ) {
        this.paramters = paramters;
    }
}
