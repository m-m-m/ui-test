/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.navigation;

import java.util.Objects;

import io.github.mmm.ui.api.event.UiClickEvent;
import io.github.mmm.ui.api.event.UiValueChangeEvent;
import io.github.mmm.ui.api.widget.composite.UiComposite;
import io.github.mmm.ui.api.widget.navigation.UiMenuItemCheckbox;
import io.github.mmm.ui.test.TestToggleGroup;
import io.github.mmm.ui.test.widget.input.TestAbstractRadioButton;

/**
 * Implementation of {@link UiMenuItemCheckbox} for testing.
 *
 * @since 1.0.0
 */
public class TestMenuItemCheckbox extends TestAbstractRadioButton implements UiMenuItemCheckbox {

  private Boolean value;

  /**
   * The constructor.
   */
  public TestMenuItemCheckbox() {

    super();
    this.value = Boolean.FALSE;
  }

  @Override
  public Boolean getValue() {

    return this.value;
  }

  @Override
  public void setValue(Boolean value) {

    if (Objects.equals(this.value, value)) {
      return;
    }
    this.value = value;
    fireEvent(new UiValueChangeEvent(this, true));
  }

  @Override
  protected void setParent(UiComposite<?> parent) {

    super.setParent(parent);
    if (parent instanceof TestMenu) {
      TestToggleGroup group = ((TestMenu) parent).getToggleGroup();
      group.add(this);
    }
  }

  @Override
  public void click() {

    setSelected(!Boolean.TRUE.equals(this.value));
    fireEvent(new UiClickEvent(this, true));
  }
}
