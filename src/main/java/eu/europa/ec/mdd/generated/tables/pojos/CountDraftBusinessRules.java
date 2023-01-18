/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.enums.CountDraftBusinessRulesType;
import eu.europa.ec.mdd.generated.tables.interfaces.ICountDraftBusinessRules;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountDraftBusinessRules implements ICountDraftBusinessRules {

  private static final long serialVersionUID = 1L;

  private CountDraftBusinessRulesType type;
  private Long                        draft;
  private Long                        active;
  private Long                        total;

  public CountDraftBusinessRules() {}

  public CountDraftBusinessRules(ICountDraftBusinessRules value) {
    this.type = value.getType();
    this.draft = value.getDraft();
    this.active = value.getActive();
    this.total = value.getTotal();
  }

  public CountDraftBusinessRules(
    CountDraftBusinessRulesType type,
    Long                        draft,
    Long                        active,
    Long                        total
  ) {
    this.type = type;
    this.draft = draft;
    this.active = active;
    this.total = total;
  }

  /**
   * Getter for <code>count_draft_business_rules.type</code>.
   */
  @Override
  public CountDraftBusinessRulesType getType() {
    return this.type;
  }

  /**
   * Setter for <code>count_draft_business_rules.type</code>.
   */
  @Override
  public void setType(CountDraftBusinessRulesType type) {
    this.type = type;
  }

  /**
   * Getter for <code>count_draft_business_rules.draft</code>.
   */
  @Override
  public Long getDraft() {
    return this.draft;
  }

  /**
   * Setter for <code>count_draft_business_rules.draft</code>.
   */
  @Override
  public void setDraft(Long draft) {
    this.draft = draft;
  }

  /**
   * Getter for <code>count_draft_business_rules.active</code>.
   */
  @Override
  public Long getActive() {
    return this.active;
  }

  /**
   * Setter for <code>count_draft_business_rules.active</code>.
   */
  @Override
  public void setActive(Long active) {
    this.active = active;
  }

  /**
   * Getter for <code>count_draft_business_rules.total</code>.
   */
  @Override
  public Long getTotal() {
    return this.total;
  }

  /**
   * Setter for <code>count_draft_business_rules.total</code>.
   */
  @Override
  public void setTotal(Long total) {
    this.total = total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CountDraftBusinessRules (");

    sb.append(type);
    sb.append(", ").append(draft);
    sb.append(", ").append(active);
    sb.append(", ").append(total);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(ICountDraftBusinessRules from) {
    setType(from.getType());
    setDraft(from.getDraft());
    setActive(from.getActive());
    setTotal(from.getTotal());
  }

  @Override
  public <E extends ICountDraftBusinessRules> E into(E into) {
    into.from(this);
    return into;
  }
}
