/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.interfaces;


import eu.europa.ec.mdd.generated.enums.BusinessRuleContext;
import eu.europa.ec.mdd.generated.enums.BusinessRuleSeverity;
import eu.europa.ec.mdd.generated.enums.BusinessRuleType;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IBusinessRule extends Serializable {

  /**
   * Setter for <code>business_rule.id</code>.
   */
  public void setId(String value);

  /**
   * Getter for <code>business_rule.id</code>.
   */
  public String getId();

  /**
   * Setter for <code>business_rule.type</code>.
   */
  public void setType(BusinessRuleType value);

  /**
   * Getter for <code>business_rule.type</code>.
   */
  public BusinessRuleType getType();

  /**
   * Setter for <code>business_rule.field_id</code>.
   */
  public void setFieldId(String value);

  /**
   * Getter for <code>business_rule.field_id</code>.
   */
  public String getFieldId();

  /**
   * Setter for <code>business_rule.pattern_id</code>.
   */
  public void setPatternId(String value);

  /**
   * Getter for <code>business_rule.pattern_id</code>.
   */
  public String getPatternId();

  /**
   * Setter for <code>business_rule.interval_id</code>.
   */
  public void setIntervalId(String value);

  /**
   * Getter for <code>business_rule.interval_id</code>.
   */
  public String getIntervalId();

  /**
   * Setter for <code>business_rule.notice_id</code>. null means all notices
   */
  public void setNoticeId(String value);

  /**
   * Getter for <code>business_rule.notice_id</code>. null means all notices
   */
  public String getNoticeId();

  /**
   * Setter for <code>business_rule.condition_id</code>.
   */
  public void setConditionId(Integer value);

  /**
   * Getter for <code>business_rule.condition_id</code>.
   */
  public Integer getConditionId();

  /**
   * Setter for <code>business_rule.expression_id</code>.
   */
  public void setExpressionId(Integer value);

  /**
   * Getter for <code>business_rule.expression_id</code>.
   */
  public Integer getExpressionId();

  /**
   * Setter for <code>business_rule.code_list_id</code>.
   */
  public void setCodeListId(String value);

  /**
   * Getter for <code>business_rule.code_list_id</code>.
   */
  public String getCodeListId();

  /**
   * Setter for <code>business_rule.code_list_parent</code>.
   */
  public void setCodeListParent(String value);

  /**
   * Getter for <code>business_rule.code_list_parent</code>.
   */
  public String getCodeListParent();

  /**
   * Setter for <code>business_rule.can_modify</code>. null means applies to first repeatable parent (expects one)
   */
  public void setCanModify(Boolean value);

  /**
   * Getter for <code>business_rule.can_modify</code>. null means applies to first repeatable parent (expects one)
   */
  public Boolean getCanModify();

  /**
   * Setter for <code>business_rule.can_add</code>. Change notice related
   */
  public void setCanAdd(Boolean value);

  /**
   * Getter for <code>business_rule.can_add</code>. Change notice related
   */
  public Boolean getCanAdd();

  /**
   * Setter for <code>business_rule.can_remove</code>. Change notice related
   */
  public void setCanRemove(Boolean value);

  /**
   * Getter for <code>business_rule.can_remove</code>. Change notice related
   */
  public Boolean getCanRemove();

  /**
   * Setter for <code>business_rule.context</code>.
   */
  public void setContext(BusinessRuleContext value);

  /**
   * Getter for <code>business_rule.context</code>.
   */
  public BusinessRuleContext getContext();

  /**
   * Setter for <code>business_rule.context_node</code>.
   */
  public void setContextNode(String value);

  /**
   * Getter for <code>business_rule.context_node</code>.
   */
  public String getContextNode();

  /**
   * Setter for <code>business_rule.description</code>.
   */
  public void setDescription(String value);

  /**
   * Getter for <code>business_rule.description</code>.
   */
  public String getDescription();

  /**
   * Setter for <code>business_rule.severity</code>.
   */
  public void setSeverity(BusinessRuleSeverity value);

  /**
   * Getter for <code>business_rule.severity</code>.
   */
  public BusinessRuleSeverity getSeverity();

  /**
   * Setter for <code>business_rule.stage</code>.
   */
  public void setStage(Integer value);

  /**
   * Getter for <code>business_rule.stage</code>.
   */
  public Integer getStage();

  /**
   * Setter for <code>business_rule.draft</code>. Drafts are excluded from the export
   */
  public void setDraft(Boolean value);

  /**
   * Getter for <code>business_rule.draft</code>. Drafts are excluded from the export
   */
  public Boolean getDraft();

  /**
   * Setter for <code>business_rule.draft_reason</code>.
   */
  public void setDraftReason(String value);

  /**
   * Getter for <code>business_rule.draft_reason</code>.
   */
  public String getDraftReason();

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  /**
   * Load data from another generated Record/POJO implementing the common interface IBusinessRule
   */
  public void from(IBusinessRule from);

  /**
   * Copy data into another generated Record/POJO implementing the common interface IBusinessRule
   */
  public <E extends IBusinessRule> E into(E into);
}
