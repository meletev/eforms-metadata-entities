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
public enum LabelAssetType implements EnumType {

  business_term("business-term"),

  field("field"),

  node("node"),

  group("group"),

  view("view"),

  notice("notice"),

  codelist("codelist"),

  code("code"),

  indicator("indicator"),

  auxiliary("auxiliary"),

  rule("rule"),

  expression("expression"),

  interval("interval"),

  pattern("pattern");

  private final String literal;

  private LabelAssetType(String literal) {
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
    return "label_asset_type";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
