/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import java.util.Objects;

import io.github.mmm.ui.api.event.UiClickEvent;
import io.github.mmm.ui.api.event.UiValueChangeEvent;
import io.github.mmm.ui.api.widget.composite.UiComposite;
import io.github.mmm.ui.api.widget.menu.UiMenuItemRadioButton;
import io.github.mmm.ui.test.TestToggleGroup;
import io.github.mmm.ui.test.widget.input.TestAbstractRadioButton;

/**
 * Implementation of {@link UiMenuItemRadioButton} for testing.
 *
 * @since 1.0.0
 */
public class TestMenuItemRadioButton extends TestAbstractRadioButton implements UiMenuItemRadioButton {

  private Boolean value;

  /**
   * The constructor.
   */
  public TestMenuItemRadioButton() {

    super();
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

    setSelected(true);
    fireEvent(new UiClickEvent(this, true));
  }

}
