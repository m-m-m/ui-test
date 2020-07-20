/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.navigation;

import io.github.mmm.ui.api.widget.composite.UiComposite;
import io.github.mmm.ui.api.widget.navigation.UiMenuItemRadioButton;
import io.github.mmm.ui.test.TestToggleGroup;
import io.github.mmm.ui.test.widget.input.TestAbstractRadioButton;

/**
 * Implementation of {@link UiMenuItemRadioButton} for testing.
 *
 * @since 1.0.0
 */
public class TestMenuItemRadioButton extends TestAbstractRadioButton implements UiMenuItemRadioButton {

  /**
   * The constructor.
   */
  public TestMenuItemRadioButton() {

    super();
  }

  @Override
  protected void setParent(UiComposite<?> parent) {

    super.setParent(parent);
    if (parent instanceof TestMenu) {
      TestToggleGroup group = ((TestMenu) parent).getToggleGroup();
      group.add(this);
    }
  }

}
