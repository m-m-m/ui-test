/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.event.UiClickEvent;
import io.github.mmm.ui.api.widget.input.UiCheckbox;
import io.github.mmm.ui.api.widget.input.UiTextInput;

/**
 * Implementation of {@link UiTextInput} for testing.
 *
 * @since 1.0.0
 */
public class TestCheckbox extends TestSelectionInput implements UiCheckbox {

  /**
   * The constructor.
   */
  public TestCheckbox() {

    super();
  }

  @Override
  public void click() {

    setValueForUser(Boolean.valueOf(!isSelected()));
    fireEvent(new UiClickEvent(this, true));
  }

}
