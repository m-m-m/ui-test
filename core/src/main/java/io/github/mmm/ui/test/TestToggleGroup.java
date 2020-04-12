/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test;

import java.util.HashSet;
import java.util.Set;

import io.github.mmm.ui.api.UiToggleGroup;
import io.github.mmm.ui.test.widget.input.TestAbstractRadioButton;

/**
 * Implementation of {@link UiToggleGroup} for testing.
 *
 * @since 1.0.0
 */
public class TestToggleGroup implements UiToggleGroup {

  private final Set<TestAbstractRadioButton> radioButtons;

  private TestAbstractRadioButton selectedRadioButton;

  /**
   * The constructor.
   */
  public TestToggleGroup() {

    super();
    this.radioButtons = new HashSet<>();
  }

  @Override
  public Set<TestAbstractRadioButton> getGroup() {

    return this.radioButtons;
  }

  /**
   * @param radioButton the {@link TestAbstractRadioButton} to add.
   */
  public void add(TestAbstractRadioButton radioButton) {

    boolean added = this.radioButtons.add(radioButton);
    if (added && (this.selectedRadioButton != null) && radioButton.isSelected()) {
      radioButton.setSelected(false);
    }
  }

  /**
   * @param radioButton the {@link TestAbstractRadioButton} to remove.
   */
  public void remove(TestAbstractRadioButton radioButton) {

    this.radioButtons.remove(radioButton);
    if (this.selectedRadioButton == radioButton) {
      this.selectedRadioButton = null;
    }
  }

  /**
   * @param radioButton the {@link TestAbstractRadioButton} that has just updated its
   *        {@link TestAbstractRadioButton#isSelected() selected flag}.
   */
  public void update(TestAbstractRadioButton radioButton) {

    if (radioButton.isSelected()) {
      if ((this.selectedRadioButton != null) && (this.selectedRadioButton != radioButton)) {
        this.selectedRadioButton.setSelected(false);
      }
      this.selectedRadioButton = radioButton;
    } else {
      if (this.selectedRadioButton == radioButton) {
        this.selectedRadioButton = null;
      }
    }
  }

}
