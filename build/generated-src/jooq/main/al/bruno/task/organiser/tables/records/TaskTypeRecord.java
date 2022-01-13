/*
 * This file is generated by jOOQ.
 */
package al.bruno.task.organiser.tables.records;


import al.bruno.task.organiser.tables.TaskType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskTypeRecord extends UpdatableRecordImpl<TaskTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>task_type._id</code>.
     */
    public void set_Id(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>task_type._id</code>.
     */
    public Integer get_Id() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>task_type._task_type</code>.
     */
    public void set_TaskType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>task_type._task_type</code>.
     */
    public String get_TaskType() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TaskType.TASK_TYPE._ID;
    }

    @Override
    public Field<String> field2() {
        return TaskType.TASK_TYPE._TASK_TYPE;
    }

    @Override
    public Integer component1() {
        return get_Id();
    }

    @Override
    public String component2() {
        return get_TaskType();
    }

    @Override
    public Integer value1() {
        return get_Id();
    }

    @Override
    public String value2() {
        return get_TaskType();
    }

    @Override
    public TaskTypeRecord value1(Integer value) {
        set_Id(value);
        return this;
    }

    @Override
    public TaskTypeRecord value2(String value) {
        set_TaskType(value);
        return this;
    }

    @Override
    public TaskTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskTypeRecord
     */
    public TaskTypeRecord() {
        super(TaskType.TASK_TYPE);
    }

    /**
     * Create a detached, initialised TaskTypeRecord
     */
    public TaskTypeRecord(Integer _Id, String _TaskType) {
        super(TaskType.TASK_TYPE);

        set_Id(_Id);
        set_TaskType(_TaskType);
    }
}
