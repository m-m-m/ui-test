/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.temporal;

import java.time.LocalDateTime;

import io.github.mmm.ui.api.widget.temporal.UiDateTimeInput;
import io.github.mmm.ui.test.widget.input.TestTextualInput;

/**
 * Implementation of {@link UiDateTimeInput} for testing.
 *
 * @since 1.0.0
 */
public class TestDateTimeInput extends TestTextualInput<LocalDateTime> implements UiDateTimeInput {

  /**
   * The constructor.
   */
  public TestDateTimeInput() {

    super();
  }

  @Override
  public void setValue(LocalDateTime value, boolean forUser) {

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
    LocalDateTime value = null;
    if (!isEmpty(text)) {
      value = LocalDateTime.parse(text);
    }
    super.setValue(value, false);
  }

}
