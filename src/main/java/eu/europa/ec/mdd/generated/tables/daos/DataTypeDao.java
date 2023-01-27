/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.tables.DataType;
import eu.europa.ec.mdd.generated.tables.records.DataTypeRecord;

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
public class DataTypeDao extends DAOImpl<DataTypeRecord, eu.europa.ec.mdd.generated.tables.pojos.DataType, String> {

  /**
   * Create a new DataTypeDao without any configuration
   */
  public DataTypeDao() {
    super(DataType.DATA_TYPE, eu.europa.ec.mdd.generated.tables.pojos.DataType.class);
  }

  /**
   * Create a new DataTypeDao with an attached configuration
   */
  @Autowired
  public DataTypeDao(Configuration configuration) {
    super(DataType.DATA_TYPE, eu.europa.ec.mdd.generated.tables.pojos.DataType.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.DataType object) {
    return object.getIdEforms();
  }

  /**
   * Fetch records that have <code>id_eforms BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfIdEforms(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.ID_EFORMS, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id_eforms IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByIdEforms(String... values) {
    return fetch(DataType.DATA_TYPE.ID_EFORMS, values);
  }

  /**
   * Fetch a unique record that has <code>id_eforms = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.DataType fetchOneByIdEforms(String value) {
    return fetchOne(DataType.DATA_TYPE.ID_EFORMS, value);
  }

  /**
   * Fetch records that have <code>regulation BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfRegulation(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.REGULATION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>regulation IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByRegulation(String... values) {
    return fetch(DataType.DATA_TYPE.REGULATION, values);
  }

  /**
   * Fetch records that have <code>text_area_possible BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfTextAreaPossible(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.TEXT_AREA_POSSIBLE, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>text_area_possible IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByTextAreaPossible(Boolean... values) {
    return fetch(DataType.DATA_TYPE.TEXT_AREA_POSSIBLE, values);
  }

  /**
   * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.DESCRIPTION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByDescription(String... values) {
    return fetch(DataType.DATA_TYPE.DESCRIPTION, values);
  }

  /**
   * Fetch records that have <code>display_type_default BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfDisplayTypeDefault(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.DISPLAY_TYPE_DEFAULT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>display_type_default IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByDisplayTypeDefault(String... values) {
    return fetch(DataType.DATA_TYPE.DISPLAY_TYPE_DEFAULT, values);
  }

  /**
   * Fetch records that have <code>display_type_1 BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfDisplayType_1(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.DISPLAY_TYPE_1, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>display_type_1 IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByDisplayType_1(String... values) {
    return fetch(DataType.DATA_TYPE.DISPLAY_TYPE_1, values);
  }

  /**
   * Fetch records that have <code>display_type_2 BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchRangeOfDisplayType_2(String lowerInclusive, String upperInclusive) {
    return fetchRange(DataType.DATA_TYPE.DISPLAY_TYPE_2, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>display_type_2 IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.DataType> fetchByDisplayType_2(String... values) {
    return fetch(DataType.DATA_TYPE.DISPLAY_TYPE_2, values);
  }
}