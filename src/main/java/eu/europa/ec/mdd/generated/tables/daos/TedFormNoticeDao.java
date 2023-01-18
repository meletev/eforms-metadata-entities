/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.daos;


import eu.europa.ec.mdd.generated.tables.TedFormNotice;
import eu.europa.ec.mdd.generated.tables.records.TedFormNoticeRecord;

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
public class TedFormNoticeDao extends DAOImpl<TedFormNoticeRecord, eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice, Record2<String, String>> {

  /**
   * Create a new TedFormNoticeDao without any configuration
   */
  public TedFormNoticeDao() {
    super(TedFormNotice.TED_FORM_NOTICE, eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice.class);
  }

  /**
   * Create a new TedFormNoticeDao with an attached configuration
   */
  @Autowired
  public TedFormNoticeDao(Configuration configuration) {
    super(TedFormNotice.TED_FORM_NOTICE, eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice.class, configuration);
  }

  @Override
  public Record2<String, String> getId(eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice object) {
    return compositeKeyRecord(object.getNoticeId(), object.getTedFormId());
  }

  /**
   * Fetch records that have <code>notice_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice> fetchRangeOfNoticeId(String lowerInclusive, String upperInclusive) {
    return fetchRange(TedFormNotice.TED_FORM_NOTICE.NOTICE_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>notice_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice> fetchByNoticeId(String... values) {
    return fetch(TedFormNotice.TED_FORM_NOTICE.NOTICE_ID, values);
  }

  /**
   * Fetch records that have <code>ted_form_id BETWEEN lowerInclusive AND upperInclusive</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice> fetchRangeOfTedFormId(String lowerInclusive, String upperInclusive) {
    return fetchRange(TedFormNotice.TED_FORM_NOTICE.TED_FORM_ID, lowerInclusive, upperInclusive);
  }

  /**
   * Fetch records that have <code>ted_form_id IN (values)</code>
   */
  public List<eu.europa.ec.mdd.generated.tables.pojos.TedFormNotice> fetchByTedFormId(String... values) {
    return fetch(TedFormNotice.TED_FORM_NOTICE.TED_FORM_ID, values);
  }
}
