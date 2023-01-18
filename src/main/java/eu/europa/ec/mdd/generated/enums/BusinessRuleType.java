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
public enum BusinessRuleType implements EnumType {

  mandatory("mandatory"),

  pattern_matching("pattern_matching"),

  interval("interval"),

  value_check("value_check"),

  other("other"),

  co_constraint("co_constraint"),

  complex("complex"),

  changeable("changeable"),

  continue_procedure("continue_procedure"),

  lawfulness("lawfulness"),

  forbidden("forbidden"),

  non_repeatable("non_repeatable");

  private final String literal;

  private BusinessRuleType(String literal) {
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
    return "business_rule_type";
  }

  @Override
  public String getLiteral() {
    return literal;
  }
}
