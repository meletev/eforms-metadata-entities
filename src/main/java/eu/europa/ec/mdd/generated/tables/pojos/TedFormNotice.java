/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.ITedFormNotice;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TedFormNotice implements ITedFormNotice {

  private static final long serialVersionUID = 1L;

  private String noticeId;
  private String tedFormId;

  public TedFormNotice() {}

  public TedFormNotice(ITedFormNotice value) {
    this.noticeId = value.getNoticeId();
    this.tedFormId = value.getTedFormId();
  }

  public TedFormNotice(
    String noticeId,
    String tedFormId
  ) {
    this.noticeId = noticeId;
    this.tedFormId = tedFormId;
  }

  /**
   * Getter for <code>ted_form_notice.notice_id</code>.
   */
  @Override
  public String getNoticeId() {
    return this.noticeId;
  }

  /**
   * Setter for <code>ted_form_notice.notice_id</code>.
   */
  @Override
  public void setNoticeId(String noticeId) {
    this.noticeId = noticeId;
  }

  /**
   * Getter for <code>ted_form_notice.ted_form_id</code>.
   */
  @Override
  public String getTedFormId() {
    return this.tedFormId;
  }

  /**
   * Setter for <code>ted_form_notice.ted_form_id</code>.
   */
  @Override
  public void setTedFormId(String tedFormId) {
    this.tedFormId = tedFormId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TedFormNotice (");

    sb.append(noticeId);
    sb.append(", ").append(tedFormId);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ITedFormNotice from) {
    setNoticeId(from.getNoticeId());
    setTedFormId(from.getTedFormId());
  }

  @Override
  public <E extends ITedFormNotice> E into(E into) {
    into.from(this);
    return into;
  }
}
