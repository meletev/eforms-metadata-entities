/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables;


import eu.europa.ec.mdd.generated.DefaultSchema;
import eu.europa.ec.mdd.generated.Indexes;
import eu.europa.ec.mdd.generated.Keys;
import eu.europa.ec.mdd.generated.enums.FieldPrivacyCode;
import eu.europa.ec.mdd.generated.enums.FieldType;
import eu.europa.ec.mdd.generated.tables.records.FieldRecord;

import java.util.Arrays;
import java.util.List;

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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Field extends TableImpl<FieldRecord> {

  private static final long serialVersionUID = 1L;

  /**
   * The reference instance of <code>field</code>
   */
  public static final Field FIELD = new Field();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<FieldRecord> getRecordType() {
    return FieldRecord.class;
  }

  /**
   * The column <code>field.id</code>.
   */
  public final TableField<FieldRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>field.business_term_id</code>.
   */
  public final TableField<FieldRecord, String> BUSINESS_TERM_ID = createField(DSL.name("business_term_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.description</code>.
   */
  public final TableField<FieldRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.relative_path</code>.
   */
  public final TableField<FieldRecord, String> RELATIVE_PATH = createField(DSL.name("relative_path"), SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>field.type</code>.
   */
  public final TableField<FieldRecord, FieldType> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(17).nullable(false).asEnumDataType(eu.europa.ec.mdd.generated.enums.FieldType.class), this, "");

  /**
   * The column <code>field.preset_value</code>.
   */
  public final TableField<FieldRecord, String> PRESET_VALUE = createField(DSL.name("preset_value"), SQLDataType.VARCHAR(1024), this, "");

  /**
   * The column <code>field.identifier_scheme_id</code>.
   */
  public final TableField<FieldRecord, String> IDENTIFIER_SCHEME_ID = createField(DSL.name("identifier_scheme_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.caption_field_id</code>.
   */
  public final TableField<FieldRecord, String> CAPTION_FIELD_ID = createField(DSL.name("caption_field_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.max_length</code>. Maximum number of characters allowed
   */
  public final TableField<FieldRecord, UInteger> MAX_LENGTH = createField(DSL.name("max_length"), SQLDataType.INTEGERUNSIGNED, this, "Maximum number of characters allowed");

  /**
   * The column <code>field.parent_node_id</code>.
   */
  public final TableField<FieldRecord, String> PARENT_NODE_ID = createField(DSL.name("parent_node_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.repeatable</code>. Indicates if the field can appear multiple times under its parent
   */
  public final TableField<FieldRecord, Boolean> REPEATABLE = createField(DSL.name("repeatable"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Indicates if the field can appear multiple times under its parent");

  /**
   * The column <code>field.multilingual</code>. Indicates if the field contains language-dependent text
   */
  public final TableField<FieldRecord, Boolean> MULTILINGUAL = createField(DSL.name("multilingual"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "Indicates if the field contains language-dependent text");

  /**
   * The column <code>field.privacy_code</code>.
   */
  public final TableField<FieldRecord, FieldPrivacyCode> PRIVACY_CODE = createField(DSL.name("privacy_code"), SQLDataType.VARCHAR(11).asEnumDataType(eu.europa.ec.mdd.generated.enums.FieldPrivacyCode.class), this, "");

  /**
   * The column <code>field.privacy_unpublished_field_id</code>.
   */
  public final TableField<FieldRecord, String> PRIVACY_UNPUBLISHED_FIELD_ID = createField(DSL.name("privacy_unpublished_field_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.privacy_reason_code_field_id</code>.
   */
  public final TableField<FieldRecord, String> PRIVACY_REASON_CODE_FIELD_ID = createField(DSL.name("privacy_reason_code_field_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.privacy_reason_description_field_id</code>.
   */
  public final TableField<FieldRecord, String> PRIVACY_REASON_DESCRIPTION_FIELD_ID = createField(DSL.name("privacy_reason_description_field_id"), SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>field.privacy_publication_date_field_id</code>.
   */
  public final TableField<FieldRecord, String> PRIVACY_PUBLICATION_DATE_FIELD_ID = createField(DSL.name("privacy_publication_date_field_id"), SQLDataType.VARCHAR(255), this, "");

  private Field(Name alias, Table<FieldRecord> aliased) {
    this(alias, aliased, null);
  }

  private Field(Name alias, Table<FieldRecord> aliased, org.jooq.Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>field</code> table reference
   */
  public Field(String alias) {
    this(DSL.name(alias), FIELD);
  }

  /**
   * Create an aliased <code>field</code> table reference
   */
  public Field(Name alias) {
    this(alias, FIELD);
  }

  /**
   * Create a <code>field</code> table reference
   */
  public Field() {
    this(DSL.name("field"), null);
  }

  public <O extends Record> Field(Table<O> child, ForeignKey<O, FieldRecord> key) {
    super(child, key, FIELD);
  }

  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.FIELD_BUSINESS_TERM_ID, Indexes.FIELD_FK_FIELD_ID_SCHEME1_IDX);
  }

  @Override
  public UniqueKey<FieldRecord> getPrimaryKey() {
    return Keys.KEY_FIELD_PRIMARY;
  }

  @Override
  public List<UniqueKey<FieldRecord>> getKeys() {
    return Arrays.<UniqueKey<FieldRecord>>asList(Keys.KEY_FIELD_PRIMARY);
  }

  @Override
  public List<ForeignKey<FieldRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<FieldRecord, ?>>asList(Keys.FIELD_IBFK_1, Keys.FK_FIELD_ID_SCHEME1, Keys.CAPTION_FIELD_ID_IBFK_3, Keys.PARENT_NODE_ID_IBFK_2);
  }

  private transient BusinessTerm _businessTerm;
  private transient IdentifierScheme _identifierScheme;
  private transient Field _field;
  private transient Node _node;

  public BusinessTerm businessTerm() {
    if (_businessTerm == null)
      _businessTerm = new BusinessTerm(this, Keys.FIELD_IBFK_1);

    return _businessTerm;
  }

  public IdentifierScheme identifierScheme() {
    if (_identifierScheme == null)
      _identifierScheme = new IdentifierScheme(this, Keys.FK_FIELD_ID_SCHEME1);

    return _identifierScheme;
  }

  public Field field() {
    if (_field == null)
      _field = new Field(this, Keys.CAPTION_FIELD_ID_IBFK_3);

    return _field;
  }

  public Node node() {
    if (_node == null)
      _node = new Node(this, Keys.PARENT_NODE_ID_IBFK_2);

    return _node;
  }

  @Override
  public Field as(String alias) {
    return new Field(DSL.name(alias), this);
  }

  @Override
  public Field as(Name alias) {
    return new Field(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public Field rename(String name) {
    return new Field(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Field rename(Name name) {
    return new Field(name, null);
  }

  // -------------------------------------------------------------------------
  // Row17 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row17<String, String, String, String, FieldType, String, String, String, UInteger, String, Boolean, Boolean, FieldPrivacyCode, String, String, String, String> fieldsRow() {
    return (Row17) super.fieldsRow();
  }
}
