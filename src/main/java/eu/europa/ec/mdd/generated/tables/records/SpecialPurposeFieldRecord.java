/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.SpecialPurposeField;
import eu.europa.ec.mdd.generated.tables.interfaces.ISpecialPurposeField;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpecialPurposeFieldRecord extends UpdatableRecordImpl<SpecialPurposeFieldRecord> implements Record3<String, String, String>, ISpecialPurposeField {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>special_purpose_field.id</code>.
   */
  @Override
  public void setId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>special_purpose_field.id</code>.
   */
  @Override
  public String getId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>special_purpose_field.description</code>.
   */
  @Override
  public void setDescription(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>special_purpose_field.description</code>.
   */
  @Override
  public String getDescription() {
    return (String) get(1);
  }

  /**
   * Setter for <code>special_purpose_field.field_id</code>.
   */
  @Override
  public void setFieldId(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>special_purpose_field.field_id</code>.
   */
  @Override
  public String getFieldId() {
    return (String) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row3<String, String, String> fieldsRow() {
    return (Row3) super.fieldsRow();
  }

  @Override
  public Row3<String, String, String> valuesRow() {
    return (Row3) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return SpecialPurposeField.SPECIAL_PURPOSE_FIELD.ID;
  }

  @Override
  public Field<String> field2() {
    return SpecialPurposeField.SPECIAL_PURPOSE_FIELD.DESCRIPTION;
  }

  @Override
  public Field<String> field3() {
    return SpecialPurposeField.SPECIAL_PURPOSE_FIELD.FIELD_ID;
  }

  @Override
  public String component1() {
    return getId();
  }

  @Override
  public String component2() {
    return getDescription();
  }

  @Override
  public String component3() {
    return getFieldId();
  }

  @Override
  public String value1() {
    return getId();
  }

  @Override
  public String value2() {
    return getDescription();
  }

  @Override
  public String value3() {
    return getFieldId();
  }

  @Override
  public SpecialPurposeFieldRecord value1(String value) {
    setId(value);
    return this;
  }

  @Override
  public SpecialPurposeFieldRecord value2(String value) {
    setDescription(value);
    return this;
  }

  @Override
  public SpecialPurposeFieldRecord value3(String value) {
    setFieldId(value);
    return this;
  }

  @Override
  public SpecialPurposeFieldRecord values(String value1, String value2, String value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ISpecialPurposeField from) {
    setId(from.getId());
    setDescription(from.getDescription());
    setFieldId(from.getFieldId());
  }

  @Override
  public <E extends ISpecialPurposeField> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached SpecialPurposeFieldRecord
   */
  public SpecialPurposeFieldRecord() {
    super(SpecialPurposeField.SPECIAL_PURPOSE_FIELD);
  }

  /**
   * Create a detached, initialised SpecialPurposeFieldRecord
   */
  public SpecialPurposeFieldRecord(String id, String description, String fieldId) {
    super(SpecialPurposeField.SPECIAL_PURPOSE_FIELD);

    setId(id);
    setDescription(description);
    setFieldId(fieldId);
  }
}
