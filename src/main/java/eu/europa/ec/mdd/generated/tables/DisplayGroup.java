/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Indexes;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.tables.records.DisplayGroupRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DisplayGroup extends TableImpl<DisplayGroupRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>display_group</code>
   */
  public static final DisplayGroup DISPLAY_GROUP = new DisplayGroup();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<DisplayGroupRecord> getRecordType() {
    return DisplayGroupRecord.class;
  }

  /**
   * The column <code>display_group.id</code>.
   */
  public final TableField<DisplayGroupRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>display_group.parent_id</code>.
   */
  public final TableField<DisplayGroupRecord, String> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group.notice_id</code>.
   */
  public final TableField<DisplayGroupRecord, String> NOTICE_ID = createField(DSL.name("notice_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>display_group.name</code>.
   */
  public final TableField<DisplayGroupRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group.sort_order</code>.
   */
  public final TableField<DisplayGroupRecord, Integer> SORT_ORDER = createField(DSL.name("sort_order"), SQLDataType.INTEGER, this, "");

  /**
   * The column <code>display_group.readonly</code>.
   */
  public final TableField<DisplayGroupRecord, Boolean> READONLY = createField(DSL.name("readonly"), SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>display_group.hidden</code>.
   */
  public final TableField<DisplayGroupRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>display_group.section</code>.
   */
  public final TableField<DisplayGroupRecord, Boolean> SECTION = createField(DSL.name("section"), SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>display_group.collapsed</code>.
   */
  public final TableField<DisplayGroupRecord, Boolean> COLLAPSED = createField(DSL.name("collapsed"), SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>display_group.node_id</code>.
   */
  public final TableField<DisplayGroupRecord, String> NODE_ID = createField(DSL.name("node_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group.field_id</code>.
   */
  public final TableField<DisplayGroupRecord, String> FIELD_ID = createField(DSL.name("field_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group.display_type</code>.
   */
  public final TableField<DisplayGroupRecord, String> DISPLAY_TYPE = createField(DSL.name("display_type"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group.value_source</code>.
   */
  public final TableField<DisplayGroupRecord, String> VALUE_SOURCE = createField(DSL.name("value_source"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>display_group._repeatable</code>.
   */
  public final TableField<DisplayGroupRecord, Boolean> _REPEATABLE = createField(DSL.name("_repeatable"), SQLDataType.BOOLEAN, this, "");

  /**
   * The column <code>display_group._instance_list</code>.
   */
  public final TableField<DisplayGroupRecord, String> _INSTANCE_LIST = createField(DSL.name("_instance_list"), SQLDataType.VARCHAR(45), this, "");

  /**
   * The column <code>display_group._instance_id_field</code>.
   */
  public final TableField<DisplayGroupRecord, String> _INSTANCE_ID_FIELD = createField(DSL.name("_instance_id_field"), SQLDataType.VARCHAR(45), this, "");

  /**
   * The column <code>display_group._value_list</code>. valueList as CSV
   */
  public final TableField<DisplayGroupRecord, String> _VALUE_LIST = createField(DSL.name("_value_list"), SQLDataType.VARCHAR(45), this, "valueList as CSV");

  private DisplayGroup(Name alias, Table<DisplayGroupRecord> aliased) {
    this(alias, aliased, null);
  }

  private DisplayGroup(Name alias, Table<DisplayGroupRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>display_group</code> table reference
   */
  public DisplayGroup(String alias) {
    this(DSL.name(alias), DISPLAY_GROUP);
  }

  /**
   * Create an aliased <code>display_group</code> table reference
   */
  public DisplayGroup(Name alias) {
    this(alias, DISPLAY_GROUP);
  }

  /**
   * Create a <code>display_group</code> table reference
   */
  public DisplayGroup() {
    this(DSL.name("display_group"), null);
  }

  public <O extends Record> DisplayGroup(Table<O> child, ForeignKey<O, DisplayGroupRecord> key) {
    super(child, key, DISPLAY_GROUP);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.DISPLAY_GROUP_FK_DISPLAY_GROUP_DISPLAY_GROUP1_IDX1, Indexes.DISPLAY_GROUP_FK_DISPLAY_GROUP_FIELD1_IDX1, Indexes.DISPLAY_GROUP_FK_DISPLAY_GROUP_NODE1_IDX, Indexes.DISPLAY_GROUP_FK_DISPLAY_GROUP_NOTICE1_IDX);
  }

  @Override
  public UniqueKey<DisplayGroupRecord> getPrimaryKey() {
    return Keys.KEY_DISPLAY_GROUP_PRIMARY;
  }

  @Override
  public List<UniqueKey<DisplayGroupRecord>> getKeys() {
    return Arrays.<UniqueKey<DisplayGroupRecord>>asList(Keys.KEY_DISPLAY_GROUP_PRIMARY, Keys.KEY_DISPLAY_GROUP_UNIQUE_FIELDS_BY_NOTICE);
  }

  @Override
  public List<ForeignKey<DisplayGroupRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<DisplayGroupRecord, ?>>asList(Keys.FK_DISPLAY_GROUP_DISPLAY_GROUP1, Keys.FK_DISPLAY_GROUP_NOTICE, Keys.FK_DISPLAY_GROUP_NODE1, Keys.FK_DISPLAY_GROUP_FIELD1);
  }

  private transient DisplayGroup _displayGroup;
  private transient Notice _notice;
  private transient Node _node;
  private transient eu.europa.ec.mdd.generated.tables.Field _field;

  public DisplayGroup displayGroup() {
    if (_displayGroup == null)
      _displayGroup = new DisplayGroup(this, Keys.FK_DISPLAY_GROUP_DISPLAY_GROUP1);

    return _displayGroup;
  }

  public Notice notice() {
    if (_notice == null)
      _notice = new Notice(this, Keys.FK_DISPLAY_GROUP_NOTICE);

    return _notice;
  }

  public Node node() {
    if (_node == null)
      _node = new Node(this, Keys.FK_DISPLAY_GROUP_NODE1);

    return _node;
  }

  public eu.europa.ec.mdd.generated.tables.Field field() {
    if (_field == null)
      _field = new eu.europa.ec.mdd.generated.tables.Field(this, Keys.FK_DISPLAY_GROUP_FIELD1);

    return _field;
  }

  @Override
  public DisplayGroup as(String alias) {
    return new DisplayGroup(DSL.name(alias), this);
  }

  @Override
  public DisplayGroup as(Name alias) {
    return new DisplayGroup(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public DisplayGroup rename(String name) {
    return new DisplayGroup(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public DisplayGroup rename(Name name) {
    return new DisplayGroup(name, null);
  }

  // -------------------------------------------------------------------------
  // Row17 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row17<String, String, String, String, Integer, Boolean, Boolean, Boolean, Boolean, String, String, String, String, Boolean, String, String, String> fieldsRow() {
    return (Row17) super.fieldsRow();
  }
}
