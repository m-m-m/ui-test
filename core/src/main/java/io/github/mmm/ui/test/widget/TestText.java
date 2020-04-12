/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.datatype.UiTextAlignment;
import io.github.mmm.ui.api.widget.UiText;

/**
 * Implementation of {@link UiText} for testing.
 *
 * @since 1.0.0
 */
public class TestText extends TestWidget implements UiText {

  private UiTextAlignment alignment;

  /**
   * The constructor.
   */
  public TestText() {

    super();
    this.alignment = UiTextAlignment.LEFT;
  }

  @Override
  public UiTextAlignment getAlignment() {

    return this.alignment;
  }

  @Override
  public void setAlignment(UiTextAlignment alignment) {

    this.alignment = alignment;
  }

}
