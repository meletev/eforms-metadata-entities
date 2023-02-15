/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.IdentifierReference;
import eu.europa.ec.mdd.generated.tables.interfaces.IIdentifierReference;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IdentifierReferenceRecord extends UpdatableRecordImpl<IdentifierReferenceRecord> implements Record2<String, String>, IIdentifierReference {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>identifier_reference.identifier_scheme_id</code>.
   */
  @Override
  public void setIdentifierSchemeId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>identifier_reference.identifier_scheme_id</code>.
   */
  @Override
  public String getIdentifierSchemeId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>identifier_reference.field_id</code>.
   */
  @Override
  public void setFieldId(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>identifier_reference.field_id</code>.
   */
  @Override
  public String getFieldId() {
    return (String) get(1);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record2<String, String> key() {
    return (Record2) super.key();
  }

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row2<String, String> fieldsRow() {
    return (Row2) super.fieldsRow();
  }

  @Override
  public Row2<String, String> valuesRow() {
    return (Row2) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return IdentifierReference.IDENTIFIER_REFERENCE.IDENTIFIER_SCHEME_ID;
  }

  @Override
  public Field<String> field2() {
    return IdentifierReference.IDENTIFIER_REFERENCE.FIELD_ID;
  }

  @Override
  public String component1() {
    return getIdentifierSchemeId();
  }

  @Override
  public String component2() {
    return getFieldId();
  }

  @Override
  public String value1() {
    return getIdentifierSchemeId();
  }

  @Override
  public String value2() {
    return getFieldId();
  }

  @Override
  public IdentifierReferenceRecord value1(String value) {
    setIdentifierSchemeId(value);
    return this;
  }

  @Override
  public IdentifierReferenceRecord value2(String value) {
    setFieldId(value);
    return this;
  }

  @Override
  public IdentifierReferenceRecord values(String value1, String value2) {
    value1(value1);
    value2(value2);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IIdentifierReference from) {
    setIdentifierSchemeId(from.getIdentifierSchemeId());
    setFieldId(from.getFieldId());
  }

  @Override
  public <E extends IIdentifierReference> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached IdentifierReferenceRecord
   */
  public IdentifierReferenceRecord() {
    super(IdentifierReference.IDENTIFIER_REFERENCE);
  }

  /**
   * Create a detached, initialised IdentifierReferenceRecord
   */
  public IdentifierReferenceRecord(String identifierSchemeId, String fieldId) {
    super(IdentifierReference.IDENTIFIER_REFERENCE);

    setIdentifierSchemeId(identifierSchemeId);
    setFieldId(fieldId);
  }
}