/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.enums.NoticeFormType;
import eu.europa.ec.mdd.generated.enums.NoticeLegalBasis;
import eu.europa.ec.mdd.generated.enums.NoticeNoticeType;
import eu.europa.ec.mdd.generated.tables.interfaces.INotice;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Notice implements INotice {

  private static final long serialVersionUID = 1L;

  private String           id;
  private NoticeLegalBasis legalBasis;
  private NoticeFormType   formType;
  private NoticeNoticeType noticeType;
  private String           documentTypeId;
  private String           description;

  public Notice() {}

  public Notice(INotice value) {
    this.id = value.getId();
    this.legalBasis = value.getLegalBasis();
    this.formType = value.getFormType();
    this.noticeType = value.getNoticeType();
    this.documentTypeId = value.getDocumentTypeId();
    this.description = value.getDescription();
  }

  public Notice(
    String           id,
    NoticeLegalBasis legalBasis,
    NoticeFormType   formType,
    NoticeNoticeType noticeType,
    String           documentTypeId,
    String           description
  ) {
    this.id = id;
    this.legalBasis = legalBasis;
    this.formType = formType;
    this.noticeType = noticeType;
    this.documentTypeId = documentTypeId;
    this.description = description;
  }

  /**
   * Getter for <code>notice.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>notice.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>notice.legal_basis</code>.
   */
  @Override
  public NoticeLegalBasis getLegalBasis() {
    return this.legalBasis;
  }

  /**
   * Setter for <code>notice.legal_basis</code>.
   */
  @Override
  public void setLegalBasis(NoticeLegalBasis legalBasis) {
    this.legalBasis = legalBasis;
  }

  /**
   * Getter for <code>notice.form_type</code>.
   */
  @Override
  public NoticeFormType getFormType() {
    return this.formType;
  }

  /**
   * Setter for <code>notice.form_type</code>.
   */
  @Override
  public void setFormType(NoticeFormType formType) {
    this.formType = formType;
  }

  /**
   * Getter for <code>notice.notice_type</code>.
   */
  @Override
  public NoticeNoticeType getNoticeType() {
    return this.noticeType;
  }

  /**
   * Setter for <code>notice.notice_type</code>.
   */
  @Override
  public void setNoticeType(NoticeNoticeType noticeType) {
    this.noticeType = noticeType;
  }

  /**
   * Getter for <code>notice.document_type_id</code>.
   */
  @Override
  public String getDocumentTypeId() {
    return this.documentTypeId;
  }

  /**
   * Setter for <code>notice.document_type_id</code>.
   */
  @Override
  public void setDocumentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
  }

  /**
   * Getter for <code>notice.description</code>.
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Setter for <code>notice.description</code>.
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Notice (");

    sb.append(id);
    sb.append(", ").append(legalBasis);
    sb.append(", ").append(formType);
    sb.append(", ").append(noticeType);
    sb.append(", ").append(documentTypeId);
    sb.append(", ").append(description);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(INotice from) {
    setId(from.getId());
    setLegalBasis(from.getLegalBasis());
    setFormType(from.getFormType());
    setNoticeType(from.getNoticeType());
    setDocumentTypeId(from.getDocumentTypeId());
    setDescription(from.getDescription());
  }

  @Override
  public <E extends INotice> E into(E into) {
    into.from(this);
    return into;
  }
}