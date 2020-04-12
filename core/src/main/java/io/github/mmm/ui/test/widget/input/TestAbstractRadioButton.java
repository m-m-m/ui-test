/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.UiToggleGroup;
import io.github.mmm.ui.api.widget.value.UiAbstractRadioButton;
import io.github.mmm.ui.test.TestToggleGroup;

/**
 * Implementation of {@link UiAbstractRadioButton} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractRadioButton extends TestSelectionInput implements UiAbstractRadioButton {

  private TestToggleGroup toggleGroup;

  /**
   * The constructor.
   */
  public TestAbstractRadioButton() {

    super();
  }

  @Override
  public void setValue(Boolean value, boolean forUser) {

    super.setValue(value, forUser);
    if (this.toggleGroup != null) {
      this.toggleGroup.update(this);
    }
  }

  @Override
  public TestToggleGroup getToggleGroup() {

    return this.toggleGroup;
  }

  @Override
  public void setToggleGroup(UiToggleGroup group) {

    if (this.toggleGroup != null) {
      this.toggleGroup.remove(this);
    }
    this.toggleGroup = (TestToggleGroup) group;
    this.toggleGroup.add(this);
  }

}
