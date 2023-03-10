/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum NoticeNoticeType implements EnumType {

  can_desg("can-desg"),

  can_modif("can-modif"),

  can_social("can-social"),

  can_standard("can-standard"),

  cn_desg("cn-desg"),

  cn_social("cn-social"),

  cn_standard("cn-standard"),

  pin_buyer("pin-buyer"),

  pin_cfc_social("pin-cfc-social"),

  pin_cfc_standard("pin-cfc-standard"),

  pin_only("pin-only"),

  pin_rtl("pin-rtl"),

  qu_sy("qu-sy"),

  subco("subco"),

  veat("veat"),

  brin_ecs("brin-ecs"),

  brin_eeig("brin-eeig"),

  pin_tran("pin-tran"),

  can_tran("can-tran"),

  unknown("unknown");

  private final String literal;

  private NoticeNoticeType(String literal) {
    this.literal = literal;
  }

  @Override
  public Catalog getCatalog() {
    return null;
  }

  @Override
  public Schema getSchema() {
    return null;
  }

  @Override
  public String getName() {
    return "notice_notice_type";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
