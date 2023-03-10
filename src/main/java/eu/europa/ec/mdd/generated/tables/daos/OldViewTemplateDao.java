/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.tables.OldViewTemplate;
import eu.europa.ec.mdd.generated.tables.records.OldViewTemplateRecord;

import java.time.LocalDateTime;
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
public class OldViewTemplateDao extends DAOImpl<OldViewTemplateRecord, eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate, String> {

  /**
   * Create a new OldViewTemplateDao without any configuration
   */
  public OldViewTemplateDao() {
    super(OldViewTemplate.OLD_VIEW_TEMPLATE, eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate.class);
  }

  /**
   * Create a new OldViewTemplateDao with an attached configuration
   */
  @Autowired
  public OldViewTemplateDao(Configuration configuration) {
    super(OldViewTemplate.OLD_VIEW_TEMPLATE, eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchById(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate fetchOneById(String value) {
    return fetchOne(OldViewTemplate.OLD_VIEW_TEMPLATE.ID, value);
  }

  /**
   * Fetch records that have <code>parent_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfParentId(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.PARENT_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>parent_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByParentId(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.PARENT_ID, values);
  }

  /**
   * Fetch records that have <code>view_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfViewId(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.VIEW_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>view_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByViewId(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.VIEW_ID, values);
  }

  /**
   * Fetch records that have <code>sort_order BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfSortOrder(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.SORT_ORDER, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>sort_order IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchBySortOrder(Integer... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.SORT_ORDER, values);
  }

  /**
   * Fetch records that have <code>number BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfNumber(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.NUMBER, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>number IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByNumber(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.NUMBER, values);
  }

  /**
   * Fetch records that have <code>template BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfTemplate(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.TEMPLATE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>template IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByTemplate(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.TEMPLATE, values);
  }

  /**
   * Fetch records that have <code>created BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.CREATED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByCreated(LocalDateTime... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.CREATED, values);
  }

  /**
   * Fetch records that have <code>imported BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfImported(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.IMPORTED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>imported IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByImported(LocalDateTime... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.IMPORTED, values);
  }

  /**
   * Fetch records that have <code>repeats_with_node BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfRepeatsWithNode(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.REPEATS_WITH_NODE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>repeats_with_node IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByRepeatsWithNode(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.REPEATS_WITH_NODE, values);
  }

  /**
   * Fetch records that have <code>repeats_with_field BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfRepeatsWithField(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.REPEATS_WITH_FIELD, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>repeats_with_field IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByRepeatsWithField(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.REPEATS_WITH_FIELD, values);
  }

  /**
   * Fetch records that have <code>context BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchRangeOfContext(String lowerInclusive, String upperInclusive) {
    return fetchRange(OldViewTemplate.OLD_VIEW_TEMPLATE.CONTEXT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>context IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.OldViewTemplate> fetchByContext(String... values) {
    return fetch(OldViewTemplate.OLD_VIEW_TEMPLATE.CONTEXT, values);
  }
}
