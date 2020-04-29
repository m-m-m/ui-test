/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.event.UiValueChangeEvent;
import io.github.mmm.ui.api.widget.input.UiInput;
import io.github.mmm.ui.api.widget.value.UiValidatableWidget;
import io.github.mmm.validation.Validator;

/**
 * Implementation of {@link UiInput} using JavaFx.
 *
 * @param <V> type of {@link #getValue() value}.
 * @since 1.0.0
 */
public abstract class TestActiveValidatableWidget<V> extends TestActiveWidget implements UiValidatableWidget<V> {

  private Validator<? super V> validator;

  private V value;

  private V originalValue;

  private long modificationTimestamp;

  /**
   * The constructor.
   */
  public TestActiveValidatableWidget() {

    super();
    this.validator = Validator.none();
    this.modificationTimestamp = -1;
  }

  @Override
  public V getValueOrThrow() {

    return this.value;
  }

  @Override
  public void setValue(V value, boolean forUser) {

    updateModificationTimestamp(!forUser);
    if (!forUser) {
      setOriginalValue(value);
    }
    this.value = value;
    fireEvent(new UiValueChangeEvent(this, true));
  }

  @Override
  public V getOriginalValue() {

    return this.originalValue;
  }

  @Override
  public void setOriginalValue(V originalValue) {

    this.originalValue = originalValue;
  }

  @Override
  public Validator<? super V> getValidator() {

    return this.validator;
  }

  @Override
  public void setValidator(Validator<? super V> validator) {

    if (validator == null) {
      this.validator = Validator.none();
    } else {
      this.validator = validator;
    }
    setMandatory(this.validator.isMandatory());
  }

  /**
   * @param mandatory the mandatory (required) flag.
   */
  protected void setMandatory(boolean mandatory) {

  }

  @Override
  public long getModificationTimestamp() {

    return this.modificationTimestamp;
  }

  private void updateModificationTimestamp(boolean reset) {

    if (reset) {
      this.modificationTimestamp = -1;
    } else {
      this.modificationTimestamp = System.currentTimeMillis();
    }
  }

}
