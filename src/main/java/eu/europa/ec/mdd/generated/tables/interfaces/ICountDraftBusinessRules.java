/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import eu.europa.ec.mdd.generated.enums.CountDraftBusinessRulesType;

import java.io.Serializable;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICountDraftBusinessRules extends Serializable {

  /**
   * Setter for <code>count_draft_business_rules.type</code>.
   */
  public void setType(CountDraftBusinessRulesType value);

  /**
   * Getter for <code>count_draft_business_rules.type</code>.
   */
  public CountDraftBusinessRulesType getType();

  /**
   * Setter for <code>count_draft_business_rules.draft</code>.
   */
  public void setDraft(Long value);

  /**
   * Getter for <code>count_draft_business_rules.draft</code>.
   */
  public Long getDraft();

  /**
   * Setter for <code>count_draft_business_rules.active</code>.
   */
  public void setActive(Long value);

  /**
   * Getter for <code>count_draft_business_rules.active</code>.
   */
  public Long getActive();

  /**
   * Setter for <code>count_draft_business_rules.total</code>.
   */
  public void setTotal(Long value);

  /**
   * Getter for <code>count_draft_business_rules.total</code>.
   */
  public Long getTotal();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface ICountDraftBusinessRules
   */
  public void from(ICountDraftBusinessRules from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface ICountDraftBusinessRules
   */
  public <E extends ICountDraftBusinessRules> E into(E into);
}
