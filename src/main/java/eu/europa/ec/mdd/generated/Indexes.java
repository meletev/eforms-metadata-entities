/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated;


import eu.europa.ec.mdd.generated.tables.BusinessRule;
import eu.europa.ec.mdd.generated.tables.BusinessRuleBusinessRuleSource;
import eu.europa.ec.mdd.generated.tables.BusinessTerm;
import eu.europa.ec.mdd.generated.tables.Code;
import eu.europa.ec.mdd.generated.tables.CodeListToCode;
import eu.europa.ec.mdd.generated.tables.DisplayGroup;
import eu.europa.ec.mdd.generated.tables.Field;
import eu.europa.ec.mdd.generated.tables.Node;
import eu.europa.ec.mdd.generated.tables.Notice;
import eu.europa.ec.mdd.generated.tables.NoticeToView;
import eu.europa.ec.mdd.generated.tables.OldViewTemplate;
import eu.europa.ec.mdd.generated.tables.TedFormNotice;
import eu.europa.ec.mdd.generated.tables.TedItem;
import eu.europa.ec.mdd.generated.tables.TedItemField;
import eu.europa.ec.mdd.generated.tables.TedXmlRaw;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

  // -------------------------------------------------------------------------
  // INDEX definitions
  // -------------------------------------------------------------------------

  public static final Index BUSINESS_TERM_BUSINESS_GROUP_ID = Internal.createIndex(DSL.name("business_group_id"), BusinessTerm.BUSINESS_TERM, new OrderField[] { BusinessTerm.BUSINESS_TERM.BUSINESS_GROUP_ID }, false);
  public static final Index BUSINESS_RULE_BUSINESS_RULE_SOURCE_BUSINESS_RULE_ID = Internal.createIndex(DSL.name("business_rule_id"), BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE, new OrderField[] { BusinessRuleBusinessRuleSource.BUSINESS_RULE_BUSINESS_RULE_SOURCE.BUSINESS_RULE_ID }, false);
  public static final Index FIELD_BUSINESS_TERM_ID = Internal.createIndex(DSL.name("business_term_id"), Field.FIELD, new OrderField[] { Field.FIELD.BUSINESS_TERM_ID }, false);
  public static final Index BUSINESS_RULE_CODE_LIST_ID = Internal.createIndex(DSL.name("code_list_id"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.CODE_LIST_ID }, false);
  public static final Index CODE_CODE_LIST_ID = Internal.createIndex(DSL.name("code_list_id"), Code.CODE, new OrderField[] { Code.CODE.CODE_LIST_ID }, false);
  public static final Index BUSINESS_RULE_CODE_LIST_PARENT = Internal.createIndex(DSL.name("code_list_parent"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.CODE_LIST_PARENT }, false);
  public static final Index CODE_LIST_TO_CODE_CODE_LIST_TO_CODE_IBFK_2 = Internal.createIndex(DSL.name("code_list_to_code_ibfk_2"), CodeListToCode.CODE_LIST_TO_CODE, new OrderField[] { CodeListToCode.CODE_LIST_TO_CODE.CODE_VALUE }, false);
  public static final Index BUSINESS_RULE_CONDITION_ID = Internal.createIndex(DSL.name("condition_id"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.CONDITION_ID }, false);
  public static final Index BUSINESS_RULE_CONTEXT_NODE = Internal.createIndex(DSL.name("context_node"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.CONTEXT_NODE }, false);
  public static final Index NOTICE_DOCUMENT_TYPE_ID = Internal.createIndex(DSL.name("document_type_id"), Notice.NOTICE, new OrderField[] { Notice.NOTICE.DOCUMENT_TYPE_ID }, false);
  public static final Index TED_ITEM_FIELD_FIELD_ID = Internal.createIndex(DSL.name("field_id"), TedItemField.TED_ITEM_FIELD, new OrderField[] { TedItemField.TED_ITEM_FIELD.FIELD_ID }, false);
  public static final Index DISPLAY_GROUP_FK_DISPLAY_GROUP_DISPLAY_GROUP1_IDX1 = Internal.createIndex(DSL.name("fk_display_group_display_group1_idx1"), DisplayGroup.DISPLAY_GROUP, new OrderField[] { DisplayGroup.DISPLAY_GROUP.PARENT_ID }, false);
  public static final Index DISPLAY_GROUP_FK_DISPLAY_GROUP_FIELD1_IDX1 = Internal.createIndex(DSL.name("fk_display_group_field1_idx1"), DisplayGroup.DISPLAY_GROUP, new OrderField[] { DisplayGroup.DISPLAY_GROUP.FIELD_ID }, false);
  public static final Index DISPLAY_GROUP_FK_DISPLAY_GROUP_NODE1_IDX = Internal.createIndex(DSL.name("fk_display_group_node1_idx"), DisplayGroup.DISPLAY_GROUP, new OrderField[] { DisplayGroup.DISPLAY_GROUP.NODE_ID }, false);
  public static final Index DISPLAY_GROUP_FK_DISPLAY_GROUP_NOTICE1_IDX = Internal.createIndex(DSL.name("fk_display_group_notice1_idx"), DisplayGroup.DISPLAY_GROUP, new OrderField[] { DisplayGroup.DISPLAY_GROUP.NOTICE_ID }, false);
  public static final Index NODE_FK_NODE_FIELD1_IDX = Internal.createIndex(DSL.name("fk_node_field1_idx"), Node.NODE, new OrderField[] { Node.NODE.IDENTIFIER_FIELD_ID }, false);
  public static final Index NOTICE_TO_VIEW_FK_NOTICE_TO_VIEW_NOTICE1_IDX = Internal.createIndex(DSL.name("fk_notice_to_view_notice1_idx"), NoticeToView.NOTICE_TO_VIEW, new OrderField[] { NoticeToView.NOTICE_TO_VIEW.NOTICE_ID }, false);
  public static final Index NOTICE_TO_VIEW_FK_NOTICE_TO_VIEW_VIEW1_IDX = Internal.createIndex(DSL.name("fk_notice_to_view_view1_idx"), NoticeToView.NOTICE_TO_VIEW, new OrderField[] { NoticeToView.NOTICE_TO_VIEW.VIEW_ID }, false);
  public static final Index OLD_VIEW_TEMPLATE_FK_VIEW_TEMPLATE_VIEW_1_IDX = Internal.createIndex(DSL.name("fk_view_template_view_1_idx"), OldViewTemplate.OLD_VIEW_TEMPLATE, new OrderField[] { OldViewTemplate.OLD_VIEW_TEMPLATE.VIEW_ID }, false);
  public static final Index OLD_VIEW_TEMPLATE_FK_VIEW_TEMPLATE_VIEW_TEMPLATE = Internal.createIndex(DSL.name("fk_view_template_view_template"), OldViewTemplate.OLD_VIEW_TEMPLATE, new OrderField[] { OldViewTemplate.OLD_VIEW_TEMPLATE.PARENT_ID }, false);
  public static final Index TED_ITEM_FORM_ID = Internal.createIndex(DSL.name("form_id"), TedItem.TED_ITEM, new OrderField[] { TedItem.TED_ITEM.FORM_ID }, false);
  public static final Index BUSINESS_RULE_INTERVAL_ID = Internal.createIndex(DSL.name("interval_id"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.INTERVAL_ID }, false);
  public static final Index BUSINESS_RULE_NOTICE_ID = Internal.createIndex(DSL.name("notice_id"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.NOTICE_ID }, false);
  public static final Index TED_ITEM_PARENT_ID = Internal.createIndex(DSL.name("parent_id"), TedItem.TED_ITEM, new OrderField[] { TedItem.TED_ITEM.PARENT_ID }, false);
  public static final Index BUSINESS_RULE_PATTERN_ID = Internal.createIndex(DSL.name("pattern_id"), BusinessRule.BUSINESS_RULE, new OrderField[] { BusinessRule.BUSINESS_RULE.PATTERN_ID }, false);
  public static final Index TED_FORM_NOTICE_TED_FORM_ID = Internal.createIndex(DSL.name("ted_form_id"), TedFormNotice.TED_FORM_NOTICE, new OrderField[] { TedFormNotice.TED_FORM_NOTICE.TED_FORM_ID }, false);
  public static final Index TED_XML_RAW_TED_ITEM_ID = Internal.createIndex(DSL.name("ted_item_id"), TedXmlRaw.TED_XML_RAW, new OrderField[] { TedXmlRaw.TED_XML_RAW.TED_ITEM_ID }, false);
}
