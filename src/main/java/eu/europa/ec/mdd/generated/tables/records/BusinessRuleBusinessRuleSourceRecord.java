/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.BusinessRuleBusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.interfaces.IBusinessRuleBusinessRuleSource;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessRuleBusinessRuleSourceRecord extends UpdatableRecordImpl<BusinessRuleBusinessRuleSourceRecord> implements Record2<String, String>, IBusinessRuleBusinessRuleSource {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  @Override
  public void setBusinessRuleSourceId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  @Override
  public String getBusinessRuleSourceId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  @Override
  public void setBusinessRuleId(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  @Override
  public String getBusinessRuleId() {
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
    return BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_SOURCE_ID;
  }

  @Override
  public Field<String> field2() {
    return BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_ID;
  }

  @Override
  public String component1() {
    return getBusinessRuleSourceId();
  }

  @Override
  public String component2() {
    return getBusinessRuleId();
  }

  @Override
  public String value1() {
    return getBusinessRuleSourceId();
  }

  @Override
  public String value2() {
    return getBusinessRuleId();
  }

  @Override
  public BusinessRuleBusinessRuleSourceRecord value1(String value) {
    setBusinessRuleSourceId(value);
    return this;
  }

  @Override
  public BusinessRuleBusinessRuleSourceRecord value2(String value) {
    setBusinessRuleId(value);
    return this;
  }

  @Override
  public BusinessRuleBusinessRuleSourceRecord values(String value1, String value2) {
    value1(value1);
    value2(value2);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IBusinessRuleBusinessRuleSource from) {
    setBusinessRuleSourceId(from.getBusinessRuleSourceId());
    setBusinessRuleId(from.getBusinessRuleId());
  }

  @Override
  public <E extends IBusinessRuleBusinessRuleSource> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached BusinessRuleBusinessRuleSourceRecord
   */
  public BusinessRuleBusinessRuleSourceRecord() {
    super(BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE);
  }

  /**
   * Create a detached, initialised BusinessRuleBusinessRuleSourceRecord
   */
  public BusinessRuleBusinessRuleSourceRecord(String businessRuleSourceId, String businessRuleId) {
    super(BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE);

    setBusinessRuleSourceId(businessRuleSourceId);
    setBusinessRuleId(businessRuleId);
  }
}
