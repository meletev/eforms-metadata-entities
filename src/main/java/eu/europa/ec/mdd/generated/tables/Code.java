/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Indexes;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.tables.records.CodeRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Code extends TableImpl<CodeRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>code</code>
   */
  public static final Code CODE = new Code();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<CodeRecord> getRecordType() {
    return CodeRecord.class;
  }

  /**
   * The column <code>code.value</code>.
   */
  public final TableField<CodeRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>code.code_list_id</code>.
   */
  public final TableField<CodeRecord, String> CODE_LIST_ID = createField(DSL.name("code_list_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>code.description</code>.
   */
  public final TableField<CodeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

  private Code(Name alias, Table<CodeRecord> aliased) {
    this(alias, aliased, null);
  }

  private Code(Name alias, Table<CodeRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>code</code> table reference
   */
  public Code(String alias) {
    this(DSL.name(alias), CODE);
  }

  /**
   * Create an aliased <code>code</code> table reference
   */
  public Code(Name alias) {
    this(alias, CODE);
  }

  /**
   * Create a <code>code</code> table reference
   */
  public Code() {
    this(DSL.name("code"), null);
  }

  public <O extends Record> Code(Table<O> child, ForeignKey<O, CodeRecord> key) {
    super(child, key, CODE);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.CODE_CODE_LIST_ID);
  }

  @Override
  public UniqueKey<CodeRecord> getPrimaryKey() {
    return Keys.KEY_CODE_PRIMARY;
  }

  @Override
  public List<UniqueKey<CodeRecord>> getKeys() {
    return Arrays.<UniqueKey<CodeRecord>>asList(Keys.KEY_CODE_PRIMARY);
  }

  @Override
  public List<ForeignKey<CodeRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<CodeRecord, ?>>asList(Keys.CODE_IBFK_1);
  }

  private transient CodeList _codeList;

  public CodeList codeList() {
    if (_codeList == null)
      _codeList = new CodeList(this, Keys.CODE_IBFK_1);

    return _codeList;
  }

  @Override
  public Code as(String alias) {
    return new Code(DSL.name(alias), this);
  }

  @Override
  public Code as(Name alias) {
    return new Code(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public Code rename(String name) {
    return new Code(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Code rename(Name name) {
    return new Code(name, null);
  }

  // -------------------------------------------------------------------------
  // Row3 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row3<String, String, String> fieldsRow() {
    return (Row3) super.fieldsRow();
  }
}
