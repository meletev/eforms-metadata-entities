/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.tables.TedItemField;
import eu.europa.ec.mdd.generated.tables.records.TedItemFieldRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TedItemFieldDao extends DAOImpl<TedItemFieldRecord, eu.europa.ec.mdd.generated.tables.pojos.TedItemField, Record2<Integer, String>> {

  /**
   * Create a new TedItemFieldDao without any configuration
   */
  public TedItemFieldDao() {
    super(TedItemField.TED_ITEM_FIELD, eu.europa.ec.mdd.generated.tables.pojos.TedItemField.class);
  }

  /**
   * Create a new TedItemFieldDao with an attached configuration
   */
  @Autowired
  public TedItemFieldDao(Configuration configuration) {
    super(TedItemField.TED_ITEM_FIELD, eu.europa.ec.mdd.generated.tables.pojos.TedItemField.class, configuration);
  }

  @Override
  public Record2<Integer, String> getId(eu.europa.ec.mdd.generated.tables.pojos.TedItemField object) {
    return compositeKeyRecord(object.getTedItemId(), object.getFieldId());
  }

  /**
   * Fetch records that have <code>ted_item_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedItemField> fetchRangeOfTedItemId(Integer lowerInclusive, Integer upperInclusive) {
    return fetchRange(TedItemField.TED_ITEM_FIELD.TED_ITEM_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>ted_item_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedItemField> fetchByTedItemId(Integer... values) {
    return fetch(TedItemField.TED_ITEM_FIELD.TED_ITEM_ID, values);
  }

  /**
   * Fetch records that have <code>field_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedItemField> fetchRangeOfFieldId(String lowerInclusive, String upperInclusive) {
    return fetchRange(TedItemField.TED_ITEM_FIELD.FIELD_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>field_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedItemField> fetchByFieldId(String... values) {
    return fetch(TedItemField.TED_ITEM_FIELD.FIELD_ID, values);
  }
}
