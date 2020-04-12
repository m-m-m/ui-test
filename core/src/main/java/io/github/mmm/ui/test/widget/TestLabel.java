/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.widget.UiLabel;

/**
 * Implementation of {@link UiLabel} for testing.
 *
 * @since 1.0.0
 */
public class TestLabel extends TestWidget implements UiLabel {

  private String text;

  /**
   * The constructor.
   */
  public TestLabel() {

    super();
  }

  @Override
  public String getText() {

    return this.text;
  }

  @Override
  public void setText(String text) {

    this.text = text;
  }

}
