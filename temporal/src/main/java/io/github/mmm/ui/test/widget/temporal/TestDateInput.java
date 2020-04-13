/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.temporal;

import java.time.LocalDate;

import io.github.mmm.ui.api.widget.temporal.UiDateInput;
import io.github.mmm.ui.test.widget.input.TestTextualInput;

/**
 * Implementation of {@link UiDateInput} for testing.
 *
 * @since 1.0.0
 */
public class TestDateInput extends TestTextualInput<LocalDate> implements UiDateInput {

  /**
   * The constructor.
   */
  public TestDateInput() {

    super();
  }

  @Override
  public void setValue(LocalDate value, boolean forUser) {

    super.setValue(value, forUser);
    if (value == null) {
      setText("");
    } else {
      setText(value.toString());
    }
  }

  @Override
  public void setText(String text) {

    super.setText(text);
    LocalDate value = null;
    if (!isEmpty(text)) {
      value = LocalDate.parse(text);
    }
    super.setValue(value, false);
  }

}
