/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.records;


import eu.europa.ec.mdd.generated.enums.BusinessRuleSourceBrsStatus;
import eu.europa.ec.mdd.generated.enums.BusinessRuleSourceImplementationStatus;
import eu.europa.ec.mdd.generated.tables.BusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.interfaces.IBusinessRuleSource;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessRuleSourceRecord extends UpdatableRecordImpl<BusinessRuleSourceRecord> implements Record18<String, String, BusinessRuleSourceBrsStatus, BusinessRuleSourceImplementationStatus, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String, Boolean, LocalDateTime, LocalDateTime>, IBusinessRuleSource {

  private static final long serialVersionUID = 1L;

  /**
   * Setter for <code>business_rule_source.id</code>.
   */
  @Override
  public void setId(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>business_rule_source.id</code>.
   */
  @Override
  public String getId() {
    return (String) get(0);
  }

  /**
   * Setter for <code>business_rule_source.rule_text</code>.
   */
  @Override
  public void setRuleText(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>business_rule_source.rule_text</code>.
   */
  @Override
  public String getRuleText() {
    return (String) get(1);
  }

  /**
   * Setter for <code>business_rule_source.brs_status</code>.
   */
  @Override
  public void setBrsStatus(BusinessRuleSourceBrsStatus value) {
    set(2, value);
  }

  /**
   * Getter for <code>business_rule_source.brs_status</code>.
   */
  @Override
  public BusinessRuleSourceBrsStatus getBrsStatus() {
    return (BusinessRuleSourceBrsStatus) get(2);
  }

  /**
   * Setter for <code>business_rule_source.implementation_status</code>.
   */
  @Override
  public void setImplementationStatus(BusinessRuleSourceImplementationStatus value) {
    set(3, value);
  }

  /**
   * Getter for <code>business_rule_source.implementation_status</code>.
   */
  @Override
  public BusinessRuleSourceImplementationStatus getImplementationStatus() {
    return (BusinessRuleSourceImplementationStatus) get(3);
  }

  /**
   * Setter for <code>business_rule_source.comment</code>.
   */
  @Override
  public void setComment(String value) {
    set(4, value);
  }

  /**
   * Getter for <code>business_rule_source.comment</code>.
   */
  @Override
  public String getComment() {
    return (String) get(4);
  }

  /**
   * Setter for <code>business_rule_source.source_name</code>.
   */
  @Override
  public void setSourceName(String value) {
    set(5, value);
  }

  /**
   * Getter for <code>business_rule_source.source_name</code>.
   */
  @Override
  public String getSourceName() {
    return (String) get(5);
  }

  /**
   * Setter for <code>business_rule_source.source_version</code>.
   */
  @Override
  public void setSourceVersion(String value) {
    set(6, value);
  }

  /**
   * Getter for <code>business_rule_source.source_version</code>.
   */
  @Override
  public String getSourceVersion() {
    return (String) get(6);
  }

  /**
   * Setter for <code>business_rule_source.source_br_id</code>.
   */
  @Override
  public void setSourceBrId(String value) {
    set(7, value);
  }

  /**
   * Getter for <code>business_rule_source.source_br_id</code>.
   */
  @Override
  public String getSourceBrId() {
    return (String) get(7);
  }

  /**
   * Setter for <code>business_rule_source.tedxml_br_id</code>.
   */
  @Override
  public void setTedxmlBrId(String value) {
    set(8, value);
  }

  /**
   * Getter for <code>business_rule_source.tedxml_br_id</code>.
   */
  @Override
  public String getTedxmlBrId() {
    return (String) get(8);
  }

  /**
   * Setter for <code>business_rule_source.bt_bg_csv</code>.
   */
  @Override
  public void setBtBgCsv(String value) {
    set(9, value);
  }

  /**
   * Getter for <code>business_rule_source.bt_bg_csv</code>.
   */
  @Override
  public String getBtBgCsv() {
    return (String) get(9);
  }

  /**
   * Setter for <code>business_rule_source.rule_author</code>.
   */
  @Override
  public void setRuleAuthor(String value) {
    set(10, value);
  }

  /**
   * Getter for <code>business_rule_source.rule_author</code>.
   */
  @Override
  public String getRuleAuthor() {
    return (String) get(10);
  }

  /**
   * Setter for <code>business_rule_source.rule_created</code>.
   */
  @Override
  public void setRuleCreated(LocalDateTime value) {
    set(11, value);
  }

  /**
   * Getter for <code>business_rule_source.rule_created</code>.
   */
  @Override
  public LocalDateTime getRuleCreated() {
    return (LocalDateTime) get(11);
  }

  /**
   * Setter for <code>business_rule_source.rule_modified</code>.
   */
  @Override
  public void setRuleModified(LocalDateTime value) {
    set(12, value);
  }

  /**
   * Getter for <code>business_rule_source.rule_modified</code>.
   */
  @Override
  public LocalDateTime getRuleModified() {
    return (LocalDateTime) get(12);
  }

  /**
   * Setter for <code>business_rule_source.db_updated_on</code>.
   */
  @Override
  public void setDbUpdatedOn(LocalDateTime value) {
    set(13, value);
  }

  /**
   * Getter for <code>business_rule_source.db_updated_on</code>.
   */
  @Override
  public LocalDateTime getDbUpdatedOn() {
    return (LocalDateTime) get(13);
  }

  /**
   * Setter for <code>business_rule_source.db_updated_by</code>.
   */
  @Override
  public void setDbUpdatedBy(String value) {
    set(14, value);
  }

  /**
   * Getter for <code>business_rule_source.db_updated_by</code>.
   */
  @Override
  public String getDbUpdatedBy() {
    return (String) get(14);
  }

  /**
   * Setter for <code>business_rule_source.db_generated</code>.
   */
  @Override
  public void setDbGenerated(Boolean value) {
    set(15, value);
  }

  /**
   * Getter for <code>business_rule_source.db_generated</code>.
   */
  @Override
  public Boolean getDbGenerated() {
    return (Boolean) get(15);
  }

  /**
   * Setter for <code>business_rule_source.db_created</code>.
   */
  @Override
  public void setDbCreated(LocalDateTime value) {
    set(16, value);
  }

  /**
   * Getter for <code>business_rule_source.db_created</code>.
   */
  @Override
  public LocalDateTime getDbCreated() {
    return (LocalDateTime) get(16);
  }

  /**
   * Setter for <code>business_rule_source.db_imported</code>.
   */
  @Override
  public void setDbImported(LocalDateTime value) {
    set(17, value);
  }

  /**
   * Getter for <code>business_rule_source.db_imported</code>.
   */
  @Override
  public LocalDateTime getDbImported() {
    return (LocalDateTime) get(17);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record18 type implementation
  // -------------------------------------------------------------------------

  @Override
  public Row18<String, String, BusinessRuleSourceBrsStatus, BusinessRuleSourceImplementationStatus, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String, Boolean, LocalDateTime, LocalDateTime> fieldsRow() {
    return (Row18) super.fieldsRow();
  }

  @Override
  public Row18<String, String, BusinessRuleSourceBrsStatus, BusinessRuleSourceImplementationStatus, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String, Boolean, LocalDateTime, LocalDateTime> valuesRow() {
    return (Row18) super.valuesRow();
  }

  @Override
  public Field<String> field1() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.ID;
  }

  @Override
  public Field<String> field2() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_TEXT;
  }

  @Override
  public Field<BusinessRuleSourceBrsStatus> field3() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.BRS_STATUS;
  }

  @Override
  public Field<BusinessRuleSourceImplementationStatus> field4() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.IMPLEMENTATION_STATUS;
  }

  @Override
  public Field<String> field5() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.COMMENT;
  }

  @Override
  public Field<String> field6() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_NAME;
  }

  @Override
  public Field<String> field7() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_VERSION;
  }

  @Override
  public Field<String> field8() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.SOURCE_BR_ID;
  }

  @Override
  public Field<String> field9() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.TEDXML_BR_ID;
  }

  @Override
  public Field<String> field10() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.BT_BG_CSV;
  }

  @Override
  public Field<String> field11() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_AUTHOR;
  }

  @Override
  public Field<LocalDateTime> field12() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_CREATED;
  }

  @Override
  public Field<LocalDateTime> field13() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.RULE_MODIFIED;
  }

  @Override
  public Field<LocalDateTime> field14() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_ON;
  }

  @Override
  public Field<String> field15() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_UPDATED_BY;
  }

  @Override
  public Field<Boolean> field16() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_GENERATED;
  }

  @Override
  public Field<LocalDateTime> field17() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_CREATED;
  }

  @Override
  public Field<LocalDateTime> field18() {
    return BusinessRuleSource.BUSINESS_RULE_SOURCE.DB_IMPORTED;
  }

  @Override
  public String component1() {
    return getId();
  }

  @Override
  public String component2() {
    return getRuleText();
  }

  @Override
  public BusinessRuleSourceBrsStatus component3() {
    return getBrsStatus();
  }

  @Override
  public BusinessRuleSourceImplementationStatus component4() {
    return getImplementationStatus();
  }

  @Override
  public String component5() {
    return getComment();
  }

  @Override
  public String component6() {
    return getSourceName();
  }

  @Override
  public String component7() {
    return getSourceVersion();
  }

  @Override
  public String component8() {
    return getSourceBrId();
  }

  @Override
  public String component9() {
    return getTedxmlBrId();
  }

  @Override
  public String component10() {
    return getBtBgCsv();
  }

  @Override
  public String component11() {
    return getRuleAuthor();
  }

  @Override
  public LocalDateTime component12() {
    return getRuleCreated();
  }

  @Override
  public LocalDateTime component13() {
    return getRuleModified();
  }

  @Override
  public LocalDateTime component14() {
    return getDbUpdatedOn();
  }

  @Override
  public String component15() {
    return getDbUpdatedBy();
  }

  @Override
  public Boolean component16() {
    return getDbGenerated();
  }

  @Override
  public LocalDateTime component17() {
    return getDbCreated();
  }

  @Override
  public LocalDateTime component18() {
    return getDbImported();
  }

  @Override
  public String value1() {
    return getId();
  }

  @Override
  public String value2() {
    return getRuleText();
  }

  @Override
  public BusinessRuleSourceBrsStatus value3() {
    return getBrsStatus();
  }

  @Override
  public BusinessRuleSourceImplementationStatus value4() {
    return getImplementationStatus();
  }

  @Override
  public String value5() {
    return getComment();
  }

  @Override
  public String value6() {
    return getSourceName();
  }

  @Override
  public String value7() {
    return getSourceVersion();
  }

  @Override
  public String value8() {
    return getSourceBrId();
  }

  @Override
  public String value9() {
    return getTedxmlBrId();
  }

  @Override
  public String value10() {
    return getBtBgCsv();
  }

  @Override
  public String value11() {
    return getRuleAuthor();
  }

  @Override
  public LocalDateTime value12() {
    return getRuleCreated();
  }

  @Override
  public LocalDateTime value13() {
    return getRuleModified();
  }

  @Override
  public LocalDateTime value14() {
    return getDbUpdatedOn();
  }

  @Override
  public String value15() {
    return getDbUpdatedBy();
  }

  @Override
  public Boolean value16() {
    return getDbGenerated();
  }

  @Override
  public LocalDateTime value17() {
    return getDbCreated();
  }

  @Override
  public LocalDateTime value18() {
    return getDbImported();
  }

  @Override
  public BusinessRuleSourceRecord value1(String value) {
    setId(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value2(String value) {
    setRuleText(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value3(BusinessRuleSourceBrsStatus value) {
    setBrsStatus(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value4(BusinessRuleSourceImplementationStatus value) {
    setImplementationStatus(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value5(String value) {
    setComment(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value6(String value) {
    setSourceName(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value7(String value) {
    setSourceVersion(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value8(String value) {
    setSourceBrId(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value9(String value) {
    setTedxmlBrId(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value10(String value) {
    setBtBgCsv(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value11(String value) {
    setRuleAuthor(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value12(LocalDateTime value) {
    setRuleCreated(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value13(LocalDateTime value) {
    setRuleModified(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value14(LocalDateTime value) {
    setDbUpdatedOn(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value15(String value) {
    setDbUpdatedBy(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value16(Boolean value) {
    setDbGenerated(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value17(LocalDateTime value) {
    setDbCreated(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord value18(LocalDateTime value) {
    setDbImported(value);
    return this;
  }

  @Override
  public BusinessRuleSourceRecord values(String value1, String value2, BusinessRuleSourceBrsStatus value3, BusinessRuleSourceImplementationStatus value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, LocalDateTime value12, LocalDateTime value13, LocalDateTime value14, String value15, Boolean value16, LocalDateTime value17, LocalDateTime value18) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    value7(value7);
    value8(value8);
    value9(value9);
    value10(value10);
    value11(value11);
    value12(value12);
    value13(value13);
    value14(value14);
    value15(value15);
    value16(value16);
    value17(value17);
    value18(value18);
    return this;
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IBusinessRuleSource from) {
    setId(from.getId());
    setRuleText(from.getRuleText());
    setBrsStatus(from.getBrsStatus());
    setImplementationStatus(from.getImplementationStatus());
    setComment(from.getComment());
    setSourceName(from.getSourceName());
    setSourceVersion(from.getSourceVersion());
    setSourceBrId(from.getSourceBrId());
    setTedxmlBrId(from.getTedxmlBrId());
    setBtBgCsv(from.getBtBgCsv());
    setRuleAuthor(from.getRuleAuthor());
    setRuleCreated(from.getRuleCreated());
    setRuleModified(from.getRuleModified());
    setDbUpdatedOn(from.getDbUpdatedOn());
    setDbUpdatedBy(from.getDbUpdatedBy());
    setDbGenerated(from.getDbGenerated());
    setDbCreated(from.getDbCreated());
    setDbImported(from.getDbImported());
  }

  @Override
  public <E extends IBusinessRuleSource> E into(E into) {
    into.from(this);
    return into;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached BusinessRuleSourceRecord
   */
  public BusinessRuleSourceRecord() {
    super(BusinessRuleSource.BUSINESS_RULE_SOURCE);
  }

  /**
   * Create a detached, initialised BusinessRuleSourceRecord
   */
  public BusinessRuleSourceRecord(String id, String ruleText, BusinessRuleSourceBrsStatus brsStatus, BusinessRuleSourceImplementationStatus implementationStatus, String comment, String sourceName, String sourceVersion, String sourceBrId, String tedxmlBrId, String btBgCsv, String ruleAuthor, LocalDateTime ruleCreated, LocalDateTime ruleModified, LocalDateTime dbUpdatedOn, String dbUpdatedBy, Boolean dbGenerated, LocalDateTime dbCreated, LocalDateTime dbImported) {
    super(BusinessRuleSource.BUSINESS_RULE_SOURCE);

    setId(id);
    setRuleText(ruleText);
    setBrsStatus(brsStatus);
    setImplementationStatus(implementationStatus);
    setComment(comment);
    setSourceName(sourceName);
    setSourceVersion(sourceVersion);
    setSourceBrId(sourceBrId);
    setTedxmlBrId(tedxmlBrId);
    setBtBgCsv(btBgCsv);
    setRuleAuthor(ruleAuthor);
    setRuleCreated(ruleCreated);
    setRuleModified(ruleModified);
    setDbUpdatedOn(dbUpdatedOn);
    setDbUpdatedBy(dbUpdatedBy);
    setDbGenerated(dbGenerated);
    setDbCreated(dbCreated);
    setDbImported(dbImported);
  }
}
