/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.base.number.NumberType;
import io.github.mmm.base.range.WritableRange;
import io.github.mmm.ui.api.widget.input.UiSlider;
import io.github.mmm.ui.spi.range.NumericRange;
import io.github.mmm.validation.Validator;

/**
 * Implementation of {@link UiSlider} for testing.
 *
 * @param <V> type of the {@link #getValue() value}.
 * @since 1.0.0
 */
public abstract class TestSlider<V extends Number> extends TestInput<V> implements UiSlider<V> {

  private final NumericRange<V> range;

  private boolean textVisible;

  private boolean textEditable;

  private double value;

  /**
   * The constructor.
   */
  public TestSlider() {

    super();
    this.range = new NumericRange<>(getNumberType());
  }

  /**
   * @return the {@link NumberType} for the underlying {@link Number}.
   */
  protected abstract NumberType<V> getNumberType();

  @Override
  public WritableRange<V> getRange() {

    return this.range;
  }

  @Override
  public V getValueOrThrow() {

    if (this.textEditable) {
      return getNumberType().valueOf(getText());
    } else {
      return getNumberType().valueOf(Double.valueOf(this.value));
    }

  }

  @Override
  public void setValue(V value, boolean forUser) {

    this.value = 0;
    if (value != null) {
      this.value = this.range.clip(value).doubleValue();
    }
    setText(Double.toString(this.value));
    super.setValue(value, forUser);
  }

  @Override
  public void setValidator(Validator<? super V> validator) {

    super.setValidator(validator);
    this.range.setValidator(validator);
  }

  @Override
  public boolean isTextVisible() {

    return this.textVisible;
  }

  @Override
  public void setTextVisible(boolean textVisible) {

    this.textVisible = textVisible;
  }

  @Override
  public boolean isTextEditable() {

    return this.textEditable;
  }

  @Override
  public void setTextEditable(boolean textEditable) {

    this.textEditable = textEditable;
  }

}
