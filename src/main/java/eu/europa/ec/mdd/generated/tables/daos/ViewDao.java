/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.tables.View;
import eu.europa.ec.mdd.generated.tables.records.ViewRecord;

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
public class ViewDao extends DAOImpl<ViewRecord, eu.europa.ec.mdd.generated.tables.pojos.View, String> {

  /**
   * Create a new ViewDao without any configuration
   */
  public ViewDao() {
    super(View.VIEW, eu.europa.ec.mdd.generated.tables.pojos.View.class);
  }

  /**
   * Create a new ViewDao with an attached configuration
   */
  @Autowired
  public ViewDao(Configuration configuration) {
    super(View.VIEW, eu.europa.ec.mdd.generated.tables.pojos.View.class, configuration);
  }

  @Override
  public String getId(eu.europa.ec.mdd.generated.tables.pojos.View object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
    return fetchRange(View.VIEW.ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchById(String... values) {
    return fetch(View.VIEW.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public eu.europa.ec.mdd.generated.tables.pojos.View fetchOneById(String value) {
    return fetchOne(View.VIEW.ID, value);
  }

  /**
   * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
    return fetchRange(View.VIEW.NAME, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchByName(String... values) {
    return fetch(View.VIEW.NAME, values);
  }

  /**
   * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
    return fetchRange(View.VIEW.DESCRIPTION, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchByDescription(String... values) {
    return fetch(View.VIEW.DESCRIPTION, values);
  }

  /**
   * Fetch records that have <code>draft BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchRangeOfDraft(Boolean lowerInclusive, Boolean upperInclusive) {
    return fetchRange(View.VIEW.DRAFT, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>draft IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchByDraft(Boolean... values) {
    return fetch(View.VIEW.DRAFT, values);
  }

  /**
   * Fetch records that have <code>created BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchRangeOfCreated(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
    return fetchRange(View.VIEW.CREATED, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.View> fetchByCreated(LocalDateTime... values) {
    return fetch(View.VIEW.CREATED, values);
  }
}