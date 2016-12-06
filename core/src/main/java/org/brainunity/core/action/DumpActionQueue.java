package org.brainunity.core.action;

import org.spark_project.jetty.util.ArrayQueue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author pascalstammer
 * @version 06.12.16.
 */
public class DumpActionQueue extends LinkedList<Action> implements ActionQueue {}
