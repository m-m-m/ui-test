/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.button;

import io.github.mmm.ui.api.widget.button.UiButton;

/**
 * Implementation of {@link UiButton} for testing.
 *
 * @since 1.0.0
 */
public class TestButton extends TestAbstractButton implements UiButton {

  /**
   * The constructor.
   */
  public TestButton() {

    super();
    getStyles().add(STYLE);
  }

}
