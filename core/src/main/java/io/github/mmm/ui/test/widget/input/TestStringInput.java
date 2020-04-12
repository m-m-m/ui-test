/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.widget.input.UiStringInput;

/**
 * Implementation of {@link TestTextualInput} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestStringInput extends TestTextualInput<String> implements UiStringInput {

  /**
   * The constructor.
   */
  public TestStringInput() {

    super();
  }

  @Override
  public String getValueOrThrow() {

    return getText();
  }

  @Override
  public void setValue(String value, boolean forUser) {

    setText(value);
    super.setValue(value, forUser);
  }

}
