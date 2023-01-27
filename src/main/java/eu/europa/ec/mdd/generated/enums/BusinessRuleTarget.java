/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * The situation in which the rule should be applied
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum BusinessRuleTarget implements EnumType {

  all("all"),

  ui("ui"),

  xml("xml");

  private final String literal;

  private BusinessRuleTarget(String literal) {
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
    return "business_rule_target";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
