/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated;


import eu.europa.ec.mdd.generated.tables.AuditLog;
import eu.europa.ec.mdd.generated.tables.BusinessRule;
import eu.europa.ec.mdd.generated.tables.BusinessRuleBusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.BusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.BusinessTerm;
import eu.europa.ec.mdd.generated.tables.Code;
import eu.europa.ec.mdd.generated.tables.CodeList;
import eu.europa.ec.mdd.generated.tables.CodeListToCode;
import eu.europa.ec.mdd.generated.tables.Condition;
import eu.europa.ec.mdd.generated.tables.DataType;
import eu.europa.ec.mdd.generated.tables.Databasechangeloglock;
import eu.europa.ec.mdd.generated.tables.DisplayGroup;
import eu.europa.ec.mdd.generated.tables.DocumentType;
import eu.europa.ec.mdd.generated.tables.Field;
import eu.europa.ec.mdd.generated.tables.IdentifierReference;
import eu.europa.ec.mdd.generated.tables.IdentifierScheme;
import eu.europa.ec.mdd.generated.tables.Interval;
import eu.europa.ec.mdd.generated.tables.Label;
import eu.europa.ec.mdd.generated.tables.Node;
import eu.europa.ec.mdd.generated.tables.Notice;
import eu.europa.ec.mdd.generated.tables.NoticeToView;
import eu.europa.ec.mdd.generated.tables.OldViewTemplate;
import eu.europa.ec.mdd.generated.tables.Pattern;
import eu.europa.ec.mdd.generated.tables.SpecialPurposeField;
import eu.europa.ec.mdd.generated.tables.SpecialPurposeNode;
import eu.europa.ec.mdd.generated.tables.TedForm;
import eu.europa.ec.mdd.generated.tables.TedFormNotice;
import eu.europa.ec.mdd.generated.tables.TedItem;
import eu.europa.ec.mdd.generated.tables.TedItemField;
import eu.europa.ec.mdd.generated.tables.TedXmlRaw;
import eu.europa.ec.mdd.generated.tables.Version;
import eu.europa.ec.mdd.generated.tables.View;
import eu.europa.ec.mdd.generated.tables.ViewRelationships;
import eu.europa.ec.mdd.generated.tables.ViewStructure;
import eu.europa.ec.mdd.generated.tables.ViewTemplate;
import eu.europa.ec.mdd.generated.tables.records.AuditLogRecord;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleBusinessRuleSourceRecord;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleRecord;
import eu.europa.ec.mdd.generated.tables.records.BusinessRuleSourceRecord;
import eu.europa.ec.mdd.generated.tables.records.BusinessTermRecord;
import eu.europa.ec.mdd.generated.tables.records.CodeListRecord;
import eu.europa.ec.mdd.generated.tables.records.CodeListToCodeRecord;
import eu.europa.ec.mdd.generated.tables.records.CodeRecord;
import eu.europa.ec.mdd.generated.tables.records.ConditionRecord;
import eu.europa.ec.mdd.generated.tables.records.DataTypeRecord;
import eu.europa.ec.mdd.generated.tables.records.DatabasechangeloglockRecord;
import eu.europa.ec.mdd.generated.tables.records.DisplayGroupRecord;
import eu.europa.ec.mdd.generated.tables.records.DocumentTypeRecord;
import eu.europa.ec.mdd.generated.tables.records.FieldRecord;
import eu.europa.ec.mdd.generated.tables.records.IdentifierReferenceRecord;
import eu.europa.ec.mdd.generated.tables.records.IdentifierSchemeRecord;
import eu.europa.ec.mdd.generated.tables.records.IntervalRecord;
import eu.europa.ec.mdd.generated.tables.records.LabelRecord;
import eu.europa.ec.mdd.generated.tables.records.NodeRecord;
import eu.europa.ec.mdd.generated.tables.records.NoticeRecord;
import eu.europa.ec.mdd.generated.tables.records.NoticeToViewRecord;
import eu.europa.ec.mdd.generated.tables.records.OldViewTemplateRecord;
import eu.europa.ec.mdd.generated.tables.records.PatternRecord;
import eu.europa.ec.mdd.generated.tables.records.SpecialPurposeFieldRecord;
import eu.europa.ec.mdd.generated.tables.records.SpecialPurposeNodeRecord;
import eu.europa.ec.mdd.generated.tables.records.TedFormNoticeRecord;
import eu.europa.ec.mdd.generated.tables.records.TedFormRecord;
import eu.europa.ec.mdd.generated.tables.records.TedItemFieldRecord;
import eu.europa.ec.mdd.generated.tables.records.TedItemRecord;
import eu.europa.ec.mdd.generated.tables.records.TedXmlRawRecord;
import eu.europa.ec.mdd.generated.tables.records.VersionRecord;
import eu.europa.ec.mdd.generated.tables.records.ViewRecord;
import eu.europa.ec.mdd.generated.tables.records.ViewRelationshipsRecord;
import eu.europa.ec.mdd.generated.tables.records.ViewStructureRecord;
import eu.europa.ec.mdd.generated.tables.records.ViewTemplateRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  public static final UniqueKey<AuditLogRecord> KEY_AUDIT_LOG_PRIMARY = Internal.createUniqueKey(AuditLog.AUDIT_LOG, DSL.name("KEY_audit_log_PRIMARY"), new TableField[] { AuditLog.AUDIT_LOG.ID }, true);
  public static final UniqueKey<BusinessRuleRecord> KEY_BUSINESS_RULE_PRIMARY = Internal.createUniqueKey(BusinessRule.BUSINESS_RULE, DSL.name("KEY_business_rule_PRIMARY"), new TableField[] { BusinessRule.BUSINESS_RULE.ID }, true);
  public static final UniqueKey<BusinessRuleRecord> KEY_BUSINESS_RULE_UNIQUE_CONTEXT = Internal.createUniqueKey(BusinessRule.BUSINESS_RULE, DSL.name("KEY_business_rule_unique_context"), new TableField[] { BusinessRule.BUSINESS_RULE.TYPE, BusinessRule.BUSINESS_RULE.FIELD_ID, BusinessRule.BUSINESS_RULE.NOTICE_ID, BusinessRule.BUSINESS_RULE.CONDITION_ID, BusinessRule.BUSINESS_RULE.DRAFT }, true);
  public static final UniqueKey<BusinessRuleBusinessRuleSourceRecord> KEY_BUSINESS_RULE_BUSINESS_RULE_SOURCE_PRIMARY = Internal.createUniqueKey(BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE, DSL.name("KEY_business_rule_business_rule_source_PRIMARY"), new TableField[] { BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_SOURCE_ID, BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_ID }, true);
  public static final UniqueKey<BusinessRuleSourceRecord> KEY_BUSINESS_RULE_SOURCE_PRIMARY = Internal.createUniqueKey(BusinessRuleSource.BUSINESS_RULE_SOURCE, DSL.name("KEY_business_rule_source_PRIMARY"), new TableField[] { BusinessRuleSource.BUSINESS_RULE_SOURCE.ID }, true);
  public static final UniqueKey<BusinessTermRecord> KEY_BUSINESS_TERM_PRIMARY = Internal.createUniqueKey(BusinessTerm.BUSINESS_TERM, DSL.name("KEY_business_term_PRIMARY"), new TableField[] { BusinessTerm.BUSINESS_TERM.ID }, true);
  public static final UniqueKey<CodeRecord> KEY_CODE_PRIMARY = Internal.createUniqueKey(Code.CODE, DSL.name("KEY_code_PRIMARY"), new TableField[] { Code.CODE.VALUE, Code.CODE.CODE_LIST_ID }, true);
  public static final UniqueKey<CodeListRecord> KEY_CODE_LIST_PRIMARY = Internal.createUniqueKey(CodeList.CODE_LIST, DSL.name("KEY_code_list_PRIMARY"), new TableField[] { CodeList.CODE_LIST.ID }, true);
  public static final UniqueKey<CodeListToCodeRecord> KEY_CODE_LIST_TO_CODE_PRIMARY = Internal.createUniqueKey(CodeListToCode.CODE_LIST_TO_CODE, DSL.name("KEY_code_list_to_code_PRIMARY"), new TableField[] { CodeListToCode.CODE_LIST_TO_CODE.CODE_LIST_ID, CodeListToCode.CODE_LIST_TO_CODE.CODE_VALUE, CodeListToCode.CODE_LIST_TO_CODE.CODE_CODE_LIST_ID }, true);
  public static final UniqueKey<ConditionRecord> KEY_CONDITION_PRIMARY = Internal.createUniqueKey(Condition.CONDITION, DSL.name("KEY_condition_PRIMARY"), new TableField[] { Condition.CONDITION.ID }, true);
  public static final UniqueKey<DataTypeRecord> KEY_DATA_TYPE_PRIMARY = Internal.createUniqueKey(DataType.DATA_TYPE, DSL.name("KEY_data_type_PRIMARY"), new TableField[] { DataType.DATA_TYPE.ID_EFORMS }, true);
  public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("KEY_DATABASECHANGELOGLOCK_PRIMARY"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
  public static final UniqueKey<DisplayGroupRecord> KEY_DISPLAY_GROUP_PRIMARY = Internal.createUniqueKey(DisplayGroup.DISPLAY_GROUP, DSL.name("KEY_display_group_PRIMARY"), new TableField[] { DisplayGroup.DISPLAY_GROUP.ID }, true);
  public static final UniqueKey<DisplayGroupRecord> KEY_DISPLAY_GROUP_UNIQUE_FIELDS_BY_NOTICE = Internal.createUniqueKey(DisplayGroup.DISPLAY_GROUP, DSL.name("KEY_display_group_unique_fields_by_notice"), new TableField[] { DisplayGroup.DISPLAY_GROUP.NOTICE_ID, DisplayGroup.DISPLAY_GROUP.FIELD_ID }, true);
  public static final UniqueKey<DocumentTypeRecord> KEY_DOCUMENT_TYPE_PRIMARY = Internal.createUniqueKey(DocumentType.DOCUMENT_TYPE, DSL.name("KEY_document_type_PRIMARY"), new TableField[] { DocumentType.DOCUMENT_TYPE.ID }, true);
  public static final UniqueKey<FieldRecord> KEY_FIELD_PRIMARY = Internal.createUniqueKey(Field.FIELD, DSL.name("KEY_field_PRIMARY"), new TableField[] { Field.FIELD.ID }, true);
  public static final UniqueKey<IdentifierReferenceRecord> KEY_IDENTIFIER_REFERENCE_PRIMARY = Internal.createUniqueKey(IdentifierReference.IDENTIFIER_REFERENCE, DSL.name("KEY_identifier_reference_PRIMARY"), new TableField[] { IdentifierReference.IDENTIFIER_REFERENCE.IDENTIFIER_SCHEME_ID, IdentifierReference.IDENTIFIER_REFERENCE.FIELD_ID }, true);
  public static final UniqueKey<IdentifierSchemeRecord> KEY_IDENTIFIER_SCHEME_PRIMARY = Internal.createUniqueKey(IdentifierScheme.IDENTIFIER_SCHEME, DSL.name("KEY_identifier_scheme_PRIMARY"), new TableField[] { IdentifierScheme.IDENTIFIER_SCHEME.ID }, true);
  public static final UniqueKey<IntervalRecord> KEY_INTERVAL_PRIMARY = Internal.createUniqueKey(Interval.INTERVAL, DSL.name("KEY_interval_PRIMARY"), new TableField[] { Interval.INTERVAL.ID }, true);
  public static final UniqueKey<LabelRecord> KEY_LABEL_PRIMARY = Internal.createUniqueKey(Label.LABEL, DSL.name("KEY_label_PRIMARY"), new TableField[] { Label.LABEL.ID }, true);
  public static final UniqueKey<NodeRecord> KEY_NODE_PRIMARY = Internal.createUniqueKey(Node.NODE, DSL.name("KEY_node_PRIMARY"), new TableField[] { Node.NODE.ID }, true);
  public static final UniqueKey<NoticeRecord> KEY_NOTICE_PRIMARY = Internal.createUniqueKey(Notice.NOTICE, DSL.name("KEY_notice_PRIMARY"), new TableField[] { Notice.NOTICE.ID }, true);
  public static final UniqueKey<NoticeToViewRecord> KEY_NOTICE_TO_VIEW_PRIMARY = Internal.createUniqueKey(NoticeToView.NOTICE_TO_VIEW, DSL.name("KEY_notice_to_view_PRIMARY"), new TableField[] { NoticeToView.NOTICE_TO_VIEW.NOTICE_ID, NoticeToView.NOTICE_TO_VIEW.VIEW_ID }, true);
  public static final UniqueKey<OldViewTemplateRecord> KEY_OLD_VIEW_TEMPLATE_PRIMARY = Internal.createUniqueKey(OldViewTemplate.OLD_VIEW_TEMPLATE, DSL.name("KEY_old_view_template_PRIMARY"), new TableField[] { OldViewTemplate.OLD_VIEW_TEMPLATE.ID }, true);
  public static final UniqueKey<PatternRecord> KEY_PATTERN_PRIMARY = Internal.createUniqueKey(Pattern.PATTERN, DSL.name("KEY_pattern_PRIMARY"), new TableField[] { Pattern.PATTERN.ID }, true);
  public static final UniqueKey<SpecialPurposeFieldRecord> KEY_SPECIAL_PURPOSE_FIELD_DESCRIPTION = Internal.createUniqueKey(SpecialPurposeField.SPECIAL_PURPOSE_FIELD, DSL.name("KEY_special_purpose_field_description"), new TableField[] { SpecialPurposeField.SPECIAL_PURPOSE_FIELD.DESCRIPTION }, true);
  public static final UniqueKey<SpecialPurposeFieldRecord> KEY_SPECIAL_PURPOSE_FIELD_FIELD_ID = Internal.createUniqueKey(SpecialPurposeField.SPECIAL_PURPOSE_FIELD, DSL.name("KEY_special_purpose_field_field_id"), new TableField[] { SpecialPurposeField.SPECIAL_PURPOSE_FIELD.FIELD_ID }, true);
  public static final UniqueKey<SpecialPurposeFieldRecord> KEY_SPECIAL_PURPOSE_FIELD_PRIMARY = Internal.createUniqueKey(SpecialPurposeField.SPECIAL_PURPOSE_FIELD, DSL.name("KEY_special_purpose_field_PRIMARY"), new TableField[] { SpecialPurposeField.SPECIAL_PURPOSE_FIELD.ID }, true);
  public static final UniqueKey<SpecialPurposeNodeRecord> KEY_SPECIAL_PURPOSE_NODE_DESCRIPTION = Internal.createUniqueKey(SpecialPurposeNode.SPECIAL_PURPOSE_NODE, DSL.name("KEY_special_purpose_node_description"), new TableField[] { SpecialPurposeNode.SPECIAL_PURPOSE_NODE.DESCRIPTION }, true);
  public static final UniqueKey<SpecialPurposeNodeRecord> KEY_SPECIAL_PURPOSE_NODE_NODE_ID = Internal.createUniqueKey(SpecialPurposeNode.SPECIAL_PURPOSE_NODE, DSL.name("KEY_special_purpose_node_node_id"), new TableField[] { SpecialPurposeNode.SPECIAL_PURPOSE_NODE.NODE_ID }, true);
  public static final UniqueKey<SpecialPurposeNodeRecord> KEY_SPECIAL_PURPOSE_NODE_PRIMARY = Internal.createUniqueKey(SpecialPurposeNode.SPECIAL_PURPOSE_NODE, DSL.name("KEY_special_purpose_node_PRIMARY"), new TableField[] { SpecialPurposeNode.SPECIAL_PURPOSE_NODE.ID }, true);
  public static final UniqueKey<TedFormRecord> KEY_TED_FORM_PRIMARY = Internal.createUniqueKey(TedForm.TED_FORM, DSL.name("KEY_ted_form_PRIMARY"), new TableField[] { TedForm.TED_FORM.ID }, true);
  public static final UniqueKey<TedFormNoticeRecord> KEY_TED_FORM_NOTICE_PRIMARY = Internal.createUniqueKey(TedFormNotice.TED_FORM_NOTICE, DSL.name("KEY_ted_form_notice_PRIMARY"), new TableField[] { TedFormNotice.TED_FORM_NOTICE.NOTICE_ID, TedFormNotice.TED_FORM_NOTICE.TED_FORM_ID }, true);
  public static final UniqueKey<TedItemRecord> KEY_TED_ITEM_PRIMARY = Internal.createUniqueKey(TedItem.TED_ITEM, DSL.name("KEY_ted_item_PRIMARY"), new TableField[] { TedItem.TED_ITEM.ID }, true);
  public static final UniqueKey<TedItemFieldRecord> KEY_TED_ITEM_FIELD_PRIMARY = Internal.createUniqueKey(TedItemField.TED_ITEM_FIELD, DSL.name("KEY_ted_item_field_PRIMARY"), new TableField[] { TedItemField.TED_ITEM_FIELD.TED_ITEM_ID, TedItemField.TED_ITEM_FIELD.FIELD_ID }, true);
  public static final UniqueKey<TedXmlRawRecord> KEY_TED_XML_RAW_PRIMARY = Internal.createUniqueKey(TedXmlRaw.TED_XML_RAW, DSL.name("KEY_ted_xml_raw_PRIMARY"), new TableField[] { TedXmlRaw.TED_XML_RAW.ID }, true);
  public static final UniqueKey<VersionRecord> KEY_VERSION_PRIMARY = Internal.createUniqueKey(Version.VERSION, DSL.name("KEY_version_PRIMARY"), new TableField[] { Version.VERSION.ID }, true);
  public static final UniqueKey<ViewRecord> KEY_VIEW_PRIMARY = Internal.createUniqueKey(View.VIEW, DSL.name("KEY_view_PRIMARY"), new TableField[] { View.VIEW.ID }, true);
  public static final UniqueKey<ViewStructureRecord> KEY_VIEW_STRUCTURE_PRIMARY = Internal.createUniqueKey(ViewStructure.VIEW_STRUCTURE, DSL.name("KEY_view_structure_PRIMARY"), new TableField[] { ViewStructure.VIEW_STRUCTURE.ID }, true);
  public static final UniqueKey<ViewTemplateRecord> KEY_VIEW_TEMPLATE_PRIMARY = Internal.createUniqueKey(ViewTemplate.VIEW_TEMPLATE, DSL.name("KEY_view_template_PRIMARY"), new TableField[] { ViewTemplate.VIEW_TEMPLATE.ID }, true);

  // -------------------------------------------------------------------------
  // FOREIGN KEY definitions
  // -------------------------------------------------------------------------

  public static final ForeignKey<BusinessRuleRecord, FieldRecord> BUSINESS_RULE_IBFK_1 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_1"), new TableField[] { BusinessRule.BUSINESS_RULE.FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, CodeListRecord> BUSINESS_RULE_IBFK_10 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_10"), new TableField[] { BusinessRule.BUSINESS_RULE.CODE_LIST_PARENT }, Keys.KEY_CODE_LIST_PRIMARY, new TableField[] { CodeList.CODE_LIST.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, CodeListRecord> BUSINESS_RULE_IBFK_2 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_2"), new TableField[] { BusinessRule.BUSINESS_RULE.CODE_LIST_ID }, Keys.KEY_CODE_LIST_PRIMARY, new TableField[] { CodeList.CODE_LIST.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, NoticeRecord> BUSINESS_RULE_IBFK_3 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_3"), new TableField[] { BusinessRule.BUSINESS_RULE.NOTICE_ID }, Keys.KEY_NOTICE_PRIMARY, new TableField[] { Notice.NOTICE.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, ConditionRecord> BUSINESS_RULE_IBFK_4 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_4"), new TableField[] { BusinessRule.BUSINESS_RULE.CONDITION_ID }, Keys.KEY_CONDITION_PRIMARY, new TableField[] { Condition.CONDITION.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, PatternRecord> BUSINESS_RULE_IBFK_5 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_5"), new TableField[] { BusinessRule.BUSINESS_RULE.PATTERN_ID }, Keys.KEY_PATTERN_PRIMARY, new TableField[] { Pattern.PATTERN.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, IntervalRecord> BUSINESS_RULE_IBFK_7 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_7"), new TableField[] { BusinessRule.BUSINESS_RULE.INTERVAL_ID }, Keys.KEY_INTERVAL_PRIMARY, new TableField[] { Interval.INTERVAL.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, ConditionRecord> BUSINESS_RULE_IBFK_8 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_8"), new TableField[] { BusinessRule.BUSINESS_RULE.EXPRESSION_ID }, Keys.KEY_CONDITION_PRIMARY, new TableField[] { Condition.CONDITION.ID }, true);
  public static final ForeignKey<BusinessRuleRecord, NodeRecord> BUSINESS_RULE_IBFK_9 = Internal.createForeignKey(BusinessRule.BUSINESS_RULE, DSL.name("business_rule_ibfk_9"), new TableField[] { BusinessRule.BUSINESS_RULE.CONTEXT_NODE }, Keys.KEY_NODE_PRIMARY, new TableField[] { Node.NODE.ID }, true);
  public static final ForeignKey<BusinessRuleBusinessRuleSourceRecord, BusinessRuleSourceRecord> BUSINESS_RULE_BUSINESS_RULE_SOURCE_IBFK_1 = Internal.createForeignKey(BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE, DSL.name("business_rule_business_rule_source_ibfk_1"), new TableField[] { BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_SOURCE_ID }, Keys.KEY_BUSINESS_RULE_SOURCE_PRIMARY, new TableField[] { BusinessRuleSource.BUSINESS_RULE_SOURCE.ID }, true);
  public static final ForeignKey<BusinessRuleBusinessRuleSourceRecord, BusinessRuleRecord> BUSINESS_RULE_BUSINESS_RULE_SOURCE_IBFK_2 = Internal.createForeignKey(BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE, DSL.name("business_rule_business_rule_source_ibfk_2"), new TableField[] { BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_ID }, Keys.KEY_BUSINESS_RULE_PRIMARY, new TableField[] { BusinessRule.BUSINESS_RULE.ID }, true);
  public static final ForeignKey<BusinessTermRecord, BusinessTermRecord> BUSINESS_TERM_IBFK_1 = Internal.createForeignKey(BusinessTerm.BUSINESS_TERM, DSL.name("business_term_ibfk_1"), new TableField[] { BusinessTerm.BUSINESS_TERM.BUSINESS_GROUP_ID }, Keys.KEY_BUSINESS_TERM_PRIMARY, new TableField[] { BusinessTerm.BUSINESS_TERM.ID }, true);
  public static final ForeignKey<CodeRecord, CodeListRecord> CODE_IBFK_1 = Internal.createForeignKey(Code.CODE, DSL.name("code_ibfk_1"), new TableField[] { Code.CODE.CODE_LIST_ID }, Keys.KEY_CODE_LIST_PRIMARY, new TableField[] { CodeList.CODE_LIST.ID }, true);
  public static final ForeignKey<DisplayGroupRecord, DisplayGroupRecord> FK_DISPLAY_GROUP_DISPLAY_GROUP1 = Internal.createForeignKey(DisplayGroup.DISPLAY_GROUP, DSL.name("fk_display_group_display_group1"), new TableField[] { DisplayGroup.DISPLAY_GROUP.PARENT_ID }, Keys.KEY_DISPLAY_GROUP_PRIMARY, new TableField[] { DisplayGroup.DISPLAY_GROUP.ID }, true);
  public static final ForeignKey<DisplayGroupRecord, FieldRecord> FK_DISPLAY_GROUP_FIELD1 = Internal.createForeignKey(DisplayGroup.DISPLAY_GROUP, DSL.name("fk_display_group_field1"), new TableField[] { DisplayGroup.DISPLAY_GROUP.FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<DisplayGroupRecord, NodeRecord> FK_DISPLAY_GROUP_NODE1 = Internal.createForeignKey(DisplayGroup.DISPLAY_GROUP, DSL.name("fk_display_group_node1"), new TableField[] { DisplayGroup.DISPLAY_GROUP.NODE_ID }, Keys.KEY_NODE_PRIMARY, new TableField[] { Node.NODE.ID }, true);
  public static final ForeignKey<DisplayGroupRecord, NoticeRecord> FK_DISPLAY_GROUP_NOTICE = Internal.createForeignKey(DisplayGroup.DISPLAY_GROUP, DSL.name("fk_display_group_notice"), new TableField[] { DisplayGroup.DISPLAY_GROUP.NOTICE_ID }, Keys.KEY_NOTICE_PRIMARY, new TableField[] { Notice.NOTICE.ID }, true);
  public static final ForeignKey<FieldRecord, FieldRecord> CAPTION_FIELD_ID_IBFK_3 = Internal.createForeignKey(Field.FIELD, DSL.name("caption_field_id_ibfk_3"), new TableField[] { Field.FIELD.CAPTION_FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<FieldRecord, BusinessTermRecord> FIELD_IBFK_1 = Internal.createForeignKey(Field.FIELD, DSL.name("field_ibfk_1"), new TableField[] { Field.FIELD.BUSINESS_TERM_ID }, Keys.KEY_BUSINESS_TERM_PRIMARY, new TableField[] { BusinessTerm.BUSINESS_TERM.ID }, true);
  public static final ForeignKey<FieldRecord, IdentifierSchemeRecord> FK_FIELD_ID_SCHEME1 = Internal.createForeignKey(Field.FIELD, DSL.name("fk_field_id_scheme1"), new TableField[] { Field.FIELD.IDENTIFIER_SCHEME_ID }, Keys.KEY_IDENTIFIER_SCHEME_PRIMARY, new TableField[] { IdentifierScheme.IDENTIFIER_SCHEME.ID }, true);
  public static final ForeignKey<FieldRecord, NodeRecord> PARENT_NODE_ID_IBFK_2 = Internal.createForeignKey(Field.FIELD, DSL.name("parent_node_id_ibfk_2"), new TableField[] { Field.FIELD.PARENT_NODE_ID }, Keys.KEY_NODE_PRIMARY, new TableField[] { Node.NODE.ID }, true);
  public static final ForeignKey<IdentifierReferenceRecord, FieldRecord> FK_ID_REF_FIELD1 = Internal.createForeignKey(IdentifierReference.IDENTIFIER_REFERENCE, DSL.name("fk_id_ref_field1"), new TableField[] { IdentifierReference.IDENTIFIER_REFERENCE.FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<IdentifierReferenceRecord, IdentifierSchemeRecord> ID_REF_ID_SCHEME_ID_FK = Internal.createForeignKey(IdentifierReference.IDENTIFIER_REFERENCE, DSL.name("id_ref_id_scheme_id_fk"), new TableField[] { IdentifierReference.IDENTIFIER_REFERENCE.IDENTIFIER_SCHEME_ID }, Keys.KEY_IDENTIFIER_SCHEME_PRIMARY, new TableField[] { IdentifierScheme.IDENTIFIER_SCHEME.ID }, true);
  public static final ForeignKey<NodeRecord, FieldRecord> FK_NODE_FIELD1 = Internal.createForeignKey(Node.NODE, DSL.name("fk_node_field1"), new TableField[] { Node.NODE.IDENTIFIER_FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<NoticeRecord, DocumentTypeRecord> NOTICE_IBFK_1 = Internal.createForeignKey(Notice.NOTICE, DSL.name("notice_ibfk_1"), new TableField[] { Notice.NOTICE.DOCUMENT_TYPE_ID }, Keys.KEY_DOCUMENT_TYPE_PRIMARY, new TableField[] { DocumentType.DOCUMENT_TYPE.ID }, true);
  public static final ForeignKey<NoticeToViewRecord, NoticeRecord> FK_NOTICE_TO_VIEW_NOTICE1 = Internal.createForeignKey(NoticeToView.NOTICE_TO_VIEW, DSL.name("fk_notice_to_view_notice1"), new TableField[] { NoticeToView.NOTICE_TO_VIEW.NOTICE_ID }, Keys.KEY_NOTICE_PRIMARY, new TableField[] { Notice.NOTICE.ID }, true);
  public static final ForeignKey<NoticeToViewRecord, ViewRecord> FK_NOTICE_TO_VIEW_VIEW1 = Internal.createForeignKey(NoticeToView.NOTICE_TO_VIEW, DSL.name("fk_notice_to_view_view1"), new TableField[] { NoticeToView.NOTICE_TO_VIEW.VIEW_ID }, Keys.KEY_VIEW_PRIMARY, new TableField[] { View.VIEW.ID }, true);
  public static final ForeignKey<OldViewTemplateRecord, ViewRecord> FK_VIEW_TEMPLATE_VIEW_1 = Internal.createForeignKey(OldViewTemplate.OLD_VIEW_TEMPLATE, DSL.name("fk_view_template_view_1"), new TableField[] { OldViewTemplate.OLD_VIEW_TEMPLATE.VIEW_ID }, Keys.KEY_VIEW_PRIMARY, new TableField[] { View.VIEW.ID }, true);
  public static final ForeignKey<SpecialPurposeFieldRecord, FieldRecord> SPECIAL_PURPOSE_FIELD_FIELD_ID_FK = Internal.createForeignKey(SpecialPurposeField.SPECIAL_PURPOSE_FIELD, DSL.name("special_purpose_field_field_id_fk"), new TableField[] { SpecialPurposeField.SPECIAL_PURPOSE_FIELD.FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<SpecialPurposeNodeRecord, NodeRecord> SPECIAL_PURPOSE_NODE_ID_FK = Internal.createForeignKey(SpecialPurposeNode.SPECIAL_PURPOSE_NODE, DSL.name("special_purpose_node_id_fk"), new TableField[] { SpecialPurposeNode.SPECIAL_PURPOSE_NODE.NODE_ID }, Keys.KEY_NODE_PRIMARY, new TableField[] { Node.NODE.ID }, true);
  public static final ForeignKey<TedFormNoticeRecord, NoticeRecord> TED_FORM_NOTICE_IBFK_1 = Internal.createForeignKey(TedFormNotice.TED_FORM_NOTICE, DSL.name("ted_form_notice_ibfk_1"), new TableField[] { TedFormNotice.TED_FORM_NOTICE.NOTICE_ID }, Keys.KEY_NOTICE_PRIMARY, new TableField[] { Notice.NOTICE.ID }, true);
  public static final ForeignKey<TedFormNoticeRecord, TedFormRecord> TED_FORM_NOTICE_IBFK_2 = Internal.createForeignKey(TedFormNotice.TED_FORM_NOTICE, DSL.name("ted_form_notice_ibfk_2"), new TableField[] { TedFormNotice.TED_FORM_NOTICE.TED_FORM_ID }, Keys.KEY_TED_FORM_PRIMARY, new TableField[] { TedForm.TED_FORM.ID }, true);
  public static final ForeignKey<TedItemRecord, TedItemRecord> TED_ITEM_IBFK_1 = Internal.createForeignKey(TedItem.TED_ITEM, DSL.name("ted_item_ibfk_1"), new TableField[] { TedItem.TED_ITEM.PARENT_ID }, Keys.KEY_TED_ITEM_PRIMARY, new TableField[] { TedItem.TED_ITEM.ID }, true);
  public static final ForeignKey<TedItemRecord, TedFormRecord> TED_ITEM_IBFK_2 = Internal.createForeignKey(TedItem.TED_ITEM, DSL.name("ted_item_ibfk_2"), new TableField[] { TedItem.TED_ITEM.FORM_ID }, Keys.KEY_TED_FORM_PRIMARY, new TableField[] { TedForm.TED_FORM.ID }, true);
  public static final ForeignKey<TedItemFieldRecord, FieldRecord> TED_ITEM_FIELD_IBFK_1 = Internal.createForeignKey(TedItemField.TED_ITEM_FIELD, DSL.name("ted_item_field_ibfk_1"), new TableField[] { TedItemField.TED_ITEM_FIELD.FIELD_ID }, Keys.KEY_FIELD_PRIMARY, new TableField[] { Field.FIELD.ID }, true);
  public static final ForeignKey<TedItemFieldRecord, TedItemRecord> TED_ITEM_FIELD_IBFK_2 = Internal.createForeignKey(TedItemField.TED_ITEM_FIELD, DSL.name("ted_item_field_ibfk_2"), new TableField[] { TedItemField.TED_ITEM_FIELD.TED_ITEM_ID }, Keys.KEY_TED_ITEM_PRIMARY, new TableField[] { TedItem.TED_ITEM.ID }, true);
  public static final ForeignKey<TedXmlRawRecord, TedItemRecord> TED_XML_RAW_IBFK_1 = Internal.createForeignKey(TedXmlRaw.TED_XML_RAW, DSL.name("ted_xml_raw_ibfk_1"), new TableField[] { TedXmlRaw.TED_XML_RAW.TED_ITEM_ID }, Keys.KEY_TED_ITEM_PRIMARY, new TableField[] { TedItem.TED_ITEM.ID }, true);
  public static final ForeignKey<ViewRelationshipsRecord, ViewRecord> FK_VIEW_ID_IDX = Internal.createForeignKey(ViewRelationships.VIEW_RELATIONSHIPS, DSL.name("fk_view_id_idx"), new TableField[] { ViewRelationships.VIEW_RELATIONSHIPS.VIEW_ID }, Keys.KEY_VIEW_PRIMARY, new TableField[] { View.VIEW.ID }, true);
  public static final ForeignKey<ViewRelationshipsRecord, ViewStructureRecord> FK_VIEW_STRUCTURE_ID_IDX = Internal.createForeignKey(ViewRelationships.VIEW_RELATIONSHIPS, DSL.name("fk_view_structure_id_idx"), new TableField[] { ViewRelationships.VIEW_RELATIONSHIPS.VIEW_STRUCTURE_ID }, Keys.KEY_VIEW_STRUCTURE_PRIMARY, new TableField[] { ViewStructure.VIEW_STRUCTURE.ID }, true);
  public static final ForeignKey<ViewRelationshipsRecord, ViewTemplateRecord> FK_VIEW_TEMPLATE_ID_IDX = Internal.createForeignKey(ViewRelationships.VIEW_RELATIONSHIPS, DSL.name("fk_view_template_id_idx"), new TableField[] { ViewRelationships.VIEW_RELATIONSHIPS.VIEW_TEMPLATE_ID }, Keys.KEY_VIEW_TEMPLATE_PRIMARY, new TableField[] { ViewTemplate.VIEW_TEMPLATE.ID }, true);
}
