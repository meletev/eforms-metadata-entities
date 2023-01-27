/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IBusinessRuleBusinessRuleSource extends Serializable {

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  public void setBusinessRuleSourceId(String value);

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  public String getBusinessRuleSourceId();

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  public void setBusinessRuleId(String value);

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  public String getBusinessRuleId();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IBusinessRuleBusinessRuleSource
   */
  public void from(IBusinessRuleBusinessRuleSource from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IBusinessRuleBusinessRuleSource
   */
  public <E extends IBusinessRuleBusinessRuleSource> E into(E into);
}