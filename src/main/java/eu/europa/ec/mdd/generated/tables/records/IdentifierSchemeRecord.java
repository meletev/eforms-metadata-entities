/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.IdentifierScheme;
import eu.europa.ec.mdd.generated.tables.interfaces.IIdentifierScheme;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IdentifierSchemeRecord extends UpdatableRecordImpl<IdentifierSchemeRecord> implements Record3<String, String, String>, IIdentifierScheme {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>identifier_scheme.id</code>.
   */
  @Override
  public void setId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>identifier_scheme.id</code>.
   */
  @Override
  public String getId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>identifier_scheme.scheme_name</code>.
   */
  @Override
  public void setSchemeName(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>identifier_scheme.scheme_name</code>.
   */
  @Override
  public String getSchemeName() {
    return (String) get(1);
  }

  /**
   * Setter for <code>identifier_scheme.id_prefix</code>.
   */
  @Override
  public void setIdPrefix(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>identifier_scheme.id_prefix</code>.
   */
  @Override
  public String getIdPrefix() {
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
    return IdentifierScheme.IDENTIFIER_SCHEME.ID;
  }

  @Override
  public Field<String> field2() {
    return IdentifierScheme.IDENTIFIER_SCHEME.SCHEME_NAME;
  }

  @Override
  public Field<String> field3() {
    return IdentifierScheme.IDENTIFIER_SCHEME.ID_PREFIX;
  }

  @Override
  public String component1() {
    return getId();
  }

  @Override
  public String component2() {
    return getSchemeName();
  }

  @Override
  public String component3() {
    return getIdPrefix();
  }

  @Override
  public String value1() {
    return getId();
  }

  @Override
  public String value2() {
    return getSchemeName();
  }

  @Override
  public String value3() {
    return getIdPrefix();
  }

  @Override
  public IdentifierSchemeRecord value1(String value) {
    setId(value);
    return this;
  }

  @Override
  public IdentifierSchemeRecord value2(String value) {
    setSchemeName(value);
    return this;
  }

  @Override
  public IdentifierSchemeRecord value3(String value) {
    setIdPrefix(value);
    return this;
  }

  @Override
  public IdentifierSchemeRecord values(String value1, String value2, String value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IIdentifierScheme from) {
    setId(from.getId());
    setSchemeName(from.getSchemeName());
    setIdPrefix(from.getIdPrefix());
  }

  @Override
  public <E extends IIdentifierScheme> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached IdentifierSchemeRecord
   */
  public IdentifierSchemeRecord() {
    super(IdentifierScheme.IDENTIFIER_SCHEME);
  }

  /**
   * Create a detached, initialised IdentifierSchemeRecord
   */
  public IdentifierSchemeRecord(String id, String schemeName, String idPrefix) {
    super(IdentifierScheme.IDENTIFIER_SCHEME);

    setId(id);
    setSchemeName(schemeName);
    setIdPrefix(idPrefix);
  }
}