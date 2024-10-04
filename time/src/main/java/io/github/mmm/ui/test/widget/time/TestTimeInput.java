/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.time;

import java.time.LocalTime;

import io.github.mmm.ui.api.widget.time.UiTimeInput;
import io.github.mmm.ui.test.widget.input.TestTextualInput;

/**
 * Implementation of {@link UiTimeInput} for testing.
 *
 * @since 1.0.0
 */
public class TestTimeInput extends TestTextualInput<LocalTime> implements UiTimeInput {

  /**
   * The constructor.
   */
  public TestTimeInput() {

    super();
  }

  @Override
  public void setValue(LocalTime value, boolean forUser) {

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
    LocalTime value = null;
    if (!isEmpty(text)) {
      value = LocalTime.parse(text);
    }
    super.setValue(value, false);
  }
}
