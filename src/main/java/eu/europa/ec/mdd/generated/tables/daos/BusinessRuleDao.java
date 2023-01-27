/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.enums.BusinessRuleContext;
import eu.europa.ec.mdd.generated.enums.BusinessRuleSeverity;
import eu.europa.ec.mdd.generated.enums.BusinessRuleType;
import eu.europa.ec.mdd.generated.tables.BusinessRule;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class BusinessRuleDao extends DAOImpl<BusinessRuleRecord, eu.europa.ec.mdd.generated.tables.pojos.BusinessRule, String> {

  /**
   * Create a new BusinessRuleDao without any configuration
   */
  public BusinessRuleDao() {
    super(BusinessRule.BUSINESS_RULE, eu.europa.ec.mdd.generated.tables.pojos.BusinessRule.class);
  }

  /**
   * Create a new BusinessRuleDao with an attached configuration
   */
  @Autowired
  public BusinessRuleDao(Configuration configuration) {
    super(BusinessRule.BUSINESS_RULE, eu.europa.ec.mdd.generated.tables.pojos.BusinessRule.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.BusinessRule object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchById(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.BusinessRule fetchOneById(String value) {
    return fetchOne(BusinessRule.BUSINESS_RULE.ID, value);
  }

  /**
   * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfType(BusinessRuleType lowerInclusive, BusinessRuleType upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.TYPE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>type IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByType(BusinessRuleType... values) {
    return fetch(BusinessRule.BUSINESS_RULE.TYPE, values);
  }

  /**
   * Fetch records that have <code>field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByFieldId(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.FIELD_ID, values);
  }

  /**
   * Fetch records that have <code>pattern_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfPatternId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.PATTERN_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>pattern_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByPatternId(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.PATTERN_ID, values);
  }

  /**
   * Fetch records that have <code>interval_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfIntervalId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.INTERVAL_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>interval_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByIntervalId(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.INTERVAL_ID, values);
  }

  /**
   * Fetch records that have <code>notice_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfNoticeId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.NOTICE_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>notice_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByNoticeId(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.NOTICE_ID, values);
  }

  /**
   * Fetch records that have <code>condition_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfConditionId(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CONDITION_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>condition_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByConditionId(Integer... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CONDITION_ID, values);
  }

  /**
   * Fetch records that have <code>expression_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfExpressionId(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.EXPRESSION_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>expression_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByExpressionId(Integer... values) {
    return fetch(BusinessRule.BUSINESS_RULE.EXPRESSION_ID, values);
  }

  /**
   * Fetch records that have <code>code_list_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfCodeListId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CODE_LIST_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>code_list_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByCodeListId(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CODE_LIST_ID, values);
  }

  /**
   * Fetch records that have <code>code_list_parent BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfCodeListParent(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CODE_LIST_PARENT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>code_list_parent IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByCodeListParent(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CODE_LIST_PARENT, values);
  }

  /**
   * Fetch records that have <code>can_modify BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfCanModify(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CAN_MODIFY, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>can_modify IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByCanModify(Boolean... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CAN_MODIFY, values);
  }

  /**
   * Fetch records that have <code>can_add BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfCanAdd(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CAN_ADD, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>can_add IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByCanAdd(Boolean... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CAN_ADD, values);
  }

  /**
   * Fetch records that have <code>can_remove BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfCanRemove(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CAN_REMOVE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>can_remove IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByCanRemove(Boolean... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CAN_REMOVE, values);
  }

  /**
   * Fetch records that have <code>context BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfContext(BusinessRuleContext lowerInclusive, BusinessRuleContext upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CONTEXT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>context IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByContext(BusinessRuleContext... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CONTEXT, values);
  }

  /**
   * Fetch records that have <code>context_node BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfContextNode(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.CONTEXT_NODE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>context_node IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByContextNode(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.CONTEXT_NODE, values);
  }

  /**
   * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.DESCRIPTION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByDescription(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.DESCRIPTION, values);
  }

  /**
   * Fetch records that have <code>severity BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfSeverity(BusinessRuleSeverity lowerInclusive, BusinessRuleSeverity upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.SEVERITY, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>severity IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchBySeverity(BusinessRuleSeverity... values) {
    return fetch(BusinessRule.BUSINESS_RULE.SEVERITY, values);
  }

  /**
   * Fetch records that have <code>stage BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfStage(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.STAGE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>stage IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByStage(Integer... values) {
    return fetch(BusinessRule.BUSINESS_RULE.STAGE, values);
  }

  /**
   * Fetch records that have <code>draft BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfDraft(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.DRAFT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>draft IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByDraft(Boolean... values) {
    return fetch(BusinessRule.BUSINESS_RULE.DRAFT, values);
  }

  /**
   * Fetch records that have <code>draft_reason BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchRangeOfDraftReason(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRule.BUSINESS_RULE.DRAFT_REASON, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>draft_reason IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRule> fetchByDraftReason(String... values) {
    return fetch(BusinessRule.BUSINESS_RULE.DRAFT_REASON, values);
  }
}
