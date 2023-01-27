/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.Code;
import eu.europa.ec.mdd.generated.tables.interfaces.ICode;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeRecord extends UpdatableRecordImpl<CodeRecord> implements Record3<String, String, String>, ICode {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>code.value</code>.
   */
  @Override
  public void setValue(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>code.value</code>.
   */
  @Override
  public String getValue() {
    return (String) get(0);
  }

  /**
   * Setter for <code>code.code_list_id</code>.
   */
  @Override
  public void setCodeListId(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>code.code_list_id</code>.
   */
  @Override
  public String getCodeListId() {
    return (String) get(1);
  }

  /**
   * Setter for <code>code.description</code>.
   */
  @Override
  public void setDescription(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>code.description</code>.
   */
  @Override
  public String getDescription() {
    return (String) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record2<String, String> key() {
    return (Record2) super.key();
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
    return Code.CODE.VALUE;
  }

  @Override
  public Field<String> field2() {
    return Code.CODE.CODE_LIST_ID;
  }

  @Override
  public Field<String> field3() {
    return Code.CODE.DESCRIPTION;
  }

  @Override
  public String component1() {
    return getValue();
  }

  @Override
  public String component2() {
    return getCodeListId();
  }

  @Override
  public String component3() {
    return getDescription();
  }

  @Override
  public String value1() {
    return getValue();
  }

  @Override
  public String value2() {
    return getCodeListId();
  }

  @Override
  public String value3() {
    return getDescription();
  }

  @Override
  public CodeRecord value1(String value) {
    setValue(value);
    return this;
  }

  @Override
  public CodeRecord value2(String value) {
    setCodeListId(value);
    return this;
  }

  @Override
  public CodeRecord value3(String value) {
    setDescription(value);
    return this;
  }

  @Override
  public CodeRecord values(String value1, String value2, String value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ICode from) {
    setValue(from.getValue());
    setCodeListId(from.getCodeListId());
    setDescription(from.getDescription());
  }

  @Override
  public <E extends ICode> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached CodeRecord
   */
  public CodeRecord() {
    super(Code.CODE);
  }

  /**
   * Create a detached, initialised CodeRecord
   */
  public CodeRecord(String value, String codeListId, String description) {
    super(Code.CODE);

    setValue(value);
    setCodeListId(codeListId);
    setDescription(description);
  }
}