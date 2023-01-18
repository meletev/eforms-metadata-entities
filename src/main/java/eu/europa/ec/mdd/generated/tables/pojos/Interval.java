/*
 * This file is generated by jOOQ.
 */
package eu.europa.ec.mdd.generated.tables.pojos;


import eu.europa.ec.mdd.generated.tables.interfaces.IInterval;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Interval implements IInterval {

  private static final long serialVersionUID = 1L;

  private String id;
  private String lowerValue;
  private String higherValue;

  public Interval() {}

  public Interval(IInterval value) {
    this.id = value.getId();
    this.lowerValue = value.getLowerValue();
    this.higherValue = value.getHigherValue();
  }

  public Interval(
    String id,
    String lowerValue,
    String higherValue
  ) {
    this.id = id;
    this.lowerValue = lowerValue;
    this.higherValue = higherValue;
  }

  /**
   * Getter for <code>interval.id</code>.
   */
  @Override
  public String getId() {
    return this.id;
  }

  /**
   * Setter for <code>interval.id</code>.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for <code>interval.lower_value</code>.
   */
  @Override
  public String getLowerValue() {
    return this.lowerValue;
  }

  /**
   * Setter for <code>interval.lower_value</code>.
   */
  @Override
  public void setLowerValue(String lowerValue) {
    this.lowerValue = lowerValue;
  }

  /**
   * Getter for <code>interval.higher_value</code>.
   */
  @Override
  public String getHigherValue() {
    return this.higherValue;
  }

  /**
   * Setter for <code>interval.higher_value</code>.
   */
  @Override
  public void setHigherValue(String higherValue) {
    this.higherValue = higherValue;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Interval (");

    sb.append(id);
    sb.append(", ").append(lowerValue);
    sb.append(", ").append(higherValue);

    sb.append(")");
    return sb.toString();
  }

  // -------------------------------------------------------------------------
  // FROM and INTO
  // -------------------------------------------------------------------------

  @Override
  public void from(IInterval from) {
    setId(from.getId());
    setLowerValue(from.getLowerValue());
    setHigherValue(from.getHigherValue());
  }

  @Override
  public <E extends IInterval> E into(E into) {
    into.from(this);
    return into;
  }
}
