/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.tables.NoticeToView;
import eu.europa.ec.mdd.generated.tables.interfaces.INoticeToView;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NoticeToViewRecord extends UpdatableRecordImpl<NoticeToViewRecord> implements Record2<String, String>, INoticeToView {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>notice_to_view.notice_id</code>.
   */
  @Override
  public void setNoticeId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>notice_to_view.notice_id</code>.
   */
  @Override
  public String getNoticeId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>notice_to_view.view_id</code>.
   */
  @Override
  public void setViewId(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>notice_to_view.view_id</code>.
   */
  @Override
  public String getViewId() {
    return (String) get(1);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record2<String, String> key() {
    return (Record2) super.key();
  }

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row2<String, String> fieldsRow() {
    return (Row2) super.fieldsRow();
  }

  @Override
  public Row2<String, String> valuesRow() {
    return (Row2) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return NoticeToView.NOTICE_TO_VIEW.NOTICE_ID;
  }

  @Override
  public Field<String> field2() {
    return NoticeToView.NOTICE_TO_VIEW.VIEW_ID;
  }

  @Override
  public String component1() {
    return getNoticeId();
  }

  @Override
  public String component2() {
    return getViewId();
  }

  @Override
  public String value1() {
    return getNoticeId();
  }

  @Override
  public String value2() {
    return getViewId();
  }

  @Override
  public NoticeToViewRecord value1(String value) {
    setNoticeId(value);
    return this;
  }

  @Override
  public NoticeToViewRecord value2(String value) {
    setViewId(value);
    return this;
  }

  @Override
  public NoticeToViewRecord values(String value1, String value2) {
    value1(value1);
    value2(value2);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(INoticeToView from) {
    setNoticeId(from.getNoticeId());
    setViewId(from.getViewId());
  }

  @Override
  public <E extends INoticeToView> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached NoticeToViewRecord
   */
  public NoticeToViewRecord() {
    super(NoticeToView.NOTICE_TO_VIEW);
  }

  /**
   * Create a detached, initialised NoticeToViewRecord
   */
  public NoticeToViewRecord(String noticeId, String viewId) {
    super(NoticeToView.NOTICE_TO_VIEW);

    setNoticeId(noticeId);
    setViewId(viewId);
  }
}
