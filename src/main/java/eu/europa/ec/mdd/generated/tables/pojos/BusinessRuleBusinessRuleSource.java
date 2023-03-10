/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IBusinessRuleBusinessRuleSource;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessRuleBusinessRuleSource implements IBusinessRuleBusinessRuleSource {

  private static final long serialVersionUID = 1L;

  private String businessRuleSourceId;
  private String businessRuleId;

  public BusinessRuleBusinessRuleSource() {}

  public BusinessRuleBusinessRuleSource(IBusinessRuleBusinessRuleSource value) {
    this.businessRuleSourceId = value.getBusinessRuleSourceId();
    this.businessRuleId = value.getBusinessRuleId();
  }

  public BusinessRuleBusinessRuleSource(
    String businessRuleSourceId,
    String businessRuleId
  ) {
    this.businessRuleSourceId = businessRuleSourceId;
    this.businessRuleId = businessRuleId;
  }

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  @Override
  public String getBusinessRuleSourceId() {
    return this.businessRuleSourceId;
  }

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_source_id</code>.
   */
  @Override
  public void setBusinessRuleSourceId(String businessRuleSourceId) {
    this.businessRuleSourceId = businessRuleSourceId;
  }

  /**
   * Getter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  @Override
  public String getBusinessRuleId() {
    return this.businessRuleId;
  }

  /**
   * Setter for <code>business_rule_business_rule_source.business_rule_id</code>.
   */
  @Override
  public void setBusinessRuleId(String businessRuleId) {
    this.businessRuleId = businessRuleId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BusinessRuleBusinessRuleSource (");

    sb.append(businessRuleSourceId);
    sb.append(", ").append(businessRuleId);

    sb.append(")");
    return sb.toString();
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
}
