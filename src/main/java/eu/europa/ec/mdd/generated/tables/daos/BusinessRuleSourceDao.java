/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.enums.BusinessRuleSourceBrsStatus;
import eu.europa.ec.mdd.generated.enums.BusinessRuleSourceImplementationStatus;
import eu.europa.ec.mdd.generated.tables.BusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleSourceRecord;

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
public class BusinessRuleSourceDao extends DAOImpl<BusinessRuleSourceRecord, eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource, String> {

  /**
   * Create a new BusinessRuleSourceDao without any configuration
   */
  public BusinessRuleSourceDao() {
    super(BusinessRuleSource.BUSINESS_RULE_SOURCE, eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource.class);
  }

  /**
   * Create a new BusinessRuleSourceDao with an attached configuration
   */
  @Autowired
  public BusinessRuleSourceDao(Configuration configuration) {
    super(BusinessRuleSource.BUSINESS_RULE_SOURCE, eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchById(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource fetchOneById(String value) {
    return fetchOne(BusinessRuleSource.BUSINESS_RULE_SOURCE.ID, value);
  }

  /**
   * Fetch records that have <code>rule_text BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfRuleText(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_TEXT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>rule_text IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByRuleText(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_TEXT, values);
  }

  /**
   * Fetch records that have <code>brs_status BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfBrsStatus(BusinessRuleSourceBrsStatus lowerInclusive, BusinessRuleSourceBrsStatus upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.BRS_STATUS, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>brs_status IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByBrsStatus(BusinessRuleSourceBrsStatus... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.BRS_STATUS, values);
  }

  /**
   * Fetch records that have <code>implementation_status BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfImplementationStatus(BusinessRuleSourceImplementationStatus lowerInclusive, BusinessRuleSourceImplementationStatus upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.IMPLEMENTATION_STATUS, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>implementation_status IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByImplementationStatus(BusinessRuleSourceImplementationStatus... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.IMPLEMENTATION_STATUS, values);
  }

  /**
   * Fetch records that have <code>comment BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfComment(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.COMMENT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>comment IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByComment(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.COMMENT, values);
  }

  /**
   * Fetch records that have <code>source_name BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfSourceName(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_NAME, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>source_name IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchBySourceName(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_NAME, values);
  }

  /**
   * Fetch records that have <code>source_version BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfSourceVersion(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_VERSION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>source_version IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchBySourceVersion(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_VERSION, values);
  }

  /**
   * Fetch records that have <code>source_br_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfSourceBrId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_BR_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>source_br_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchBySourceBrId(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_BR_ID, values);
  }

  /**
   * Fetch records that have <code>tedxml_br_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfTedxmlBrId(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.TEDXML_BR_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>tedxml_br_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByTedxmlBrId(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.TEDXML_BR_ID, values);
  }

  /**
   * Fetch records that have <code>bt_bg_csv BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfBtBgCsv(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.BT_BG_CSV, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>bt_bg_csv IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByBtBgCsv(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.BT_BG_CSV, values);
  }

  /**
   * Fetch records that have <code>rule_author BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfRuleAuthor(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_AUTHOR, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>rule_author IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByRuleAuthor(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_AUTHOR, values);
  }

  /**
   * Fetch records that have <code>rule_created BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfRuleCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_CREATED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>rule_created IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByRuleCreated(LocalDateTime... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_CREATED, values);
  }

  /**
   * Fetch records that have <code>rule_modified BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfRuleModified(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_MODIFIED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>rule_modified IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByRuleModified(LocalDateTime... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_MODIFIED, values);
  }

  /**
   * Fetch records that have <code>db_updated_on BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfDbUpdatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_ON, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>db_updated_on IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByDbUpdatedOn(LocalDateTime... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_ON, values);
  }

  /**
   * Fetch records that have <code>db_updated_by BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfDbUpdatedBy(String lowerInclusive, String upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_BY, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>db_updated_by IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByDbUpdatedBy(String... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_BY, values);
  }

  /**
   * Fetch records that have <code>db_generated BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfDbGenerated(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_GENERATED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>db_generated IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByDbGenerated(Boolean... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_GENERATED, values);
  }

  /**
   * Fetch records that have <code>db_created BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfDbCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_CREATED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>db_created IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByDbCreated(LocalDateTime... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_CREATED, values);
  }

  /**
   * Fetch records that have <code>db_imported BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchRangeOfDbImported(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_IMPORTED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>db_imported IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.BusinessRuleSource> fetchByDbImported(LocalDateTime... values) {
    return fetch(BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_IMPORTED, values);
  }
}