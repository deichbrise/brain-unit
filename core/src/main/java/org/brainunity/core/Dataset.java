package org.brainunity.core;

import org.brainunity.core.util.GuidGenerator;
import org.brainunity.core.util.TimestampUtil;

import java.sql.Timestamp;

/**
 * @author pascalstammer
 * @version 27.11.16.
 */
public class Dataset<T> {
    private String dataSetId;
    private Timestamp creationTime;
    private Timestamp updateTime;

    public Dataset() {
        dataSetId = GuidGenerator.generateGuid();
        creationTime = TimestampUtil.fromCurrentTimeMillis();
        updateTime = creationTime;
    }

    protected void update() {
        updateTime = TimestampUtil.fromCurrentTimeMillis();
    }

    public String getDataSetId() {
        return dataSetId;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }
}
