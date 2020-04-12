/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test;

import io.github.mmm.ui.api.attribute.AttributeWriteSizeInPixel;
import io.github.mmm.ui.spi.AbstractUiScreen;

/**
 * Implementation of {@link io.github.mmm.ui.api.UiScreen} for testing.
 *
 * @since 1.0.0
 */
public class TestScreen extends AbstractUiScreen implements AttributeWriteSizeInPixel {

  /**
   * The constructor.
   */
  public TestScreen() {

    super();
  }

  @Override
  public void setWidthInPixel(double width) {

    this.width = width;
  }

  @Override
  public void setHeightInPixel(double height) {

    this.height = height;
  }

  @Override
  protected void doUpdate() {

    if (this.width == 0) {
      this.width = 1024;
    }
    if (this.height == 0) {
      this.height = 768;
    }
    if (this.dpi == 0) {
      this.dpi = 192;
    }
  }

}
