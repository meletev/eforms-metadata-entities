/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.enums.FieldPrivacyCode;
import eu.europa.ec.mdd.generated.enums.FieldType;
import eu.europa.ec.mdd.generated.tables.Field;
import eu.europa.ec.mdd.generated.tables.records.FieldRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class FieldDao extends DAOImpl<FieldRecord, eu.europa.ec.mdd.generated.tables.pojos.Field, String> {

  /**
   * Create a new FieldDao without any configuration
   */
  public FieldDao() {
    super(Field.FIELD, eu.europa.ec.mdd.generated.tables.pojos.Field.class);
  }

  /**
   * Create a new FieldDao with an attached configuration
   */
  @Autowired
  public FieldDao(Configuration configuration) {
    super(Field.FIELD, eu.europa.ec.mdd.generated.tables.pojos.Field.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.Field object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchById(String... values) {
    return fetch(Field.FIELD.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.Field fetchOneById(String value) {
    return fetchOne(Field.FIELD.ID, value);
  }

  /**
   * Fetch records that have <code>business_term_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfBusinessTermId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.BUSINESS_TERM_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>business_term_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByBusinessTermId(String... values) {
    return fetch(Field.FIELD.BUSINESS_TERM_ID, values);
  }

  /**
   * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.DESCRIPTION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByDescription(String... values) {
    return fetch(Field.FIELD.DESCRIPTION, values);
  }

  /**
   * Fetch records that have <code>relative_path BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfRelativePath(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.RELATIVE_PATH, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>relative_path IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByRelativePath(String... values) {
    return fetch(Field.FIELD.RELATIVE_PATH, values);
  }

  /**
   * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfType(FieldType lowerInclusive, FieldType upperInclusive) {
    return fetchRange(Field.FIELD.TYPE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>type IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByType(FieldType... values) {
    return fetch(Field.FIELD.TYPE, values);
  }

  /**
   * Fetch records that have <code>id_schemes BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfIdSchemes(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.ID_SCHEMES, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id_schemes IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByIdSchemes(String... values) {
    return fetch(Field.FIELD.ID_SCHEMES, values);
  }

  /**
   * Fetch records that have <code>max_length BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfMaxLength(UInteger lowerInclusive, UInteger upperInclusive) {
    return fetchRange(Field.FIELD.MAX_LENGTH, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>max_length IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByMaxLength(UInteger... values) {
    return fetch(Field.FIELD.MAX_LENGTH, values);
  }

  /**
   * Fetch records that have <code>parent_node_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfParentNodeId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.PARENT_NODE_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>parent_node_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByParentNodeId(String... values) {
    return fetch(Field.FIELD.PARENT_NODE_ID, values);
  }

  /**
   * Fetch records that have <code>repeatable BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfRepeatable(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(Field.FIELD.REPEATABLE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>repeatable IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByRepeatable(Boolean... values) {
    return fetch(Field.FIELD.REPEATABLE, values);
  }

  /**
   * Fetch records that have <code>multilingual BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfMultilingual(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(Field.FIELD.MULTILINGUAL, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>multilingual IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByMultilingual(Boolean... values) {
    return fetch(Field.FIELD.MULTILINGUAL, values);
  }

  /**
   * Fetch records that have <code>privacy_code BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfPrivacyCode(FieldPrivacyCode lowerInclusive, FieldPrivacyCode upperInclusive) {
    return fetchRange(Field.FIELD.PRIVACY_CODE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>privacy_code IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByPrivacyCode(FieldPrivacyCode... values) {
    return fetch(Field.FIELD.PRIVACY_CODE, values);
  }

  /**
   * Fetch records that have <code>privacy_unpublished_field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfPrivacyUnpublishedFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.PRIVACY_UNPUBLISHED_FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>privacy_unpublished_field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByPrivacyUnpublishedFieldId(String... values) {
    return fetch(Field.FIELD.PRIVACY_UNPUBLISHED_FIELD_ID, values);
  }

  /**
   * Fetch records that have <code>privacy_reason_code_field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfPrivacyReasonCodeFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.PRIVACY_REASON_CODE_FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>privacy_reason_code_field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByPrivacyReasonCodeFieldId(String... values) {
    return fetch(Field.FIELD.PRIVACY_REASON_CODE_FIELD_ID, values);
  }

  /**
   * Fetch records that have <code>privacy_reason_description_field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfPrivacyReasonDescriptionFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.PRIVACY_REASON_DESCRIPTION_FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>privacy_reason_description_field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByPrivacyReasonDescriptionFieldId(String... values) {
    return fetch(Field.FIELD.PRIVACY_REASON_DESCRIPTION_FIELD_ID, values);
  }

  /**
   * Fetch records that have <code>privacy_publication_date_field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchRangeOfPrivacyPublicationDateFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(Field.FIELD.PRIVACY_PUBLICATION_DATE_FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>privacy_publication_date_field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.Field> fetchByPrivacyPublicationDateFieldId(String... values) {
    return fetch(Field.FIELD.PRIVACY_PUBLICATION_DATE_FIELD_ID, values);
  }
}
