package org.brainunity.core.persistence.query;

import org.apache.spark.sql.Dataset;
import org.brainunity.core.persistence.Paging;

import java.util.List;

/**
 * @author pascalstammer
 * @version 02.12.16.
 */
public interface QueryResult<T> {
    Dataset<T> toDataset();
    List<T> toList();
    Paging<T> toPaging(int pagingSize);
}
