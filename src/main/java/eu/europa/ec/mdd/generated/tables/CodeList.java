/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.enums.CodeListType;
import eu.europa.ec.mdd.generated.tables.records.CodeListRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class CodeList extends TableImpl<CodeListRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>code_list</code>
   */
  public static final CodeList CODE_LIST = new CodeList();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<CodeListRecord> getRecordType() {
    return CodeListRecord.class;
  }

  /**
   * The column <code>code_list.id</code>.
   */
  public final TableField<CodeListRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>code_list.description</code>.
   */
  public final TableField<CodeListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>code_list.official</code>.
   */
  public final TableField<CodeListRecord, Boolean> OFFICIAL = createField(DSL.name("official"), SQLDataType.BOOLEAN.nullable(false), this, "");

  /**
   * The column <code>code_list.type</code>.
   */
  public final TableField<CodeListRecord, CodeListType> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(12).nullable(false).defaultValue(DSL.inline("flat", SQLDataType.VARCHAR)).asEnumDataType(eu.europa.ec.mdd.generated.enums.CodeListType.class), this, "");

  /**
   * The column <code>code_list.parent_id</code>.
   */
  public final TableField<CodeListRecord, String> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>code_list.source_canonical_uri</code>.
   */
  public final TableField<CodeListRecord, String> SOURCE_CANONICAL_URI = createField(DSL.name("source_canonical_uri"), SQLDataType.VARCHAR(1024), this, "");

  /**
   * The column <code>code_list.source_version</code>.
   */
  public final TableField<CodeListRecord, String> SOURCE_VERSION = createField(DSL.name("source_version"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>code_list.source_short_name</code>.
   */
  public final TableField<CodeListRecord, String> SOURCE_SHORT_NAME = createField(DSL.name("source_short_name"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>code_list.source_long_name</code>.
   */
  public final TableField<CodeListRecord, String> SOURCE_LONG_NAME = createField(DSL.name("source_long_name"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>code_list.source_long_name_list_id</code>.
   */
  public final TableField<CodeListRecord, String> SOURCE_LONG_NAME_LIST_ID = createField(DSL.name("source_long_name_list_id"), SQLDataType.VARCHAR(1024), this, "");

  /**
   * The column <code>code_list.created</code>.
   */
  public final TableField<CodeListRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

  /**
   * The column <code>code_list.imported</code>.
   */
  public final TableField<CodeListRecord, LocalDateTime> IMPORTED = createField(DSL.name("imported"), SQLDataType.LOCALDATETIME(0), this, "");

  private CodeList(Name alias, Table<CodeListRecord> aliased) {
    this(alias, aliased, null);
  }

  private CodeList(Name alias, Table<CodeListRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>code_list</code> table reference
   */
  public CodeList(String alias) {
    this(DSL.name(alias), CODE_LIST);
  }

  /**
   * Create an aliased <code>code_list</code> table reference
   */
  public CodeList(Name alias) {
    this(alias, CODE_LIST);
  }

  /**
   * Create a <code>code_list</code> table reference
   */
  public CodeList() {
    this(DSL.name("code_list"), null);
  }

  public <O extends Record> CodeList(Table<O> child, ForeignKey<O, CodeListRecord> key) {
    super(child, key, CODE_LIST);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public UniqueKey<CodeListRecord> getPrimaryKey() {
    return Keys.KEY_CODE_LIST_PRIMARY;
  }

  @Override
  public List<UniqueKey<CodeListRecord>> getKeys() {
    return Arrays.<UniqueKey<CodeListRecord>>asList(Keys.KEY_CODE_LIST_PRIMARY);
  }

  @Override
  public CodeList as(String alias) {
    return new CodeList(DSL.name(alias), this);
  }

  @Override
  public CodeList as(Name alias) {
    return new CodeList(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public CodeList rename(String name) {
    return new CodeList(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public CodeList rename(Name name) {
    return new CodeList(name, null);
  }

  // -------------------------------------------------------------------------
  // Row12 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row12<String, String, Boolean, CodeListType, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row12) super.fieldsRow();
  }
}
