/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.window;

import io.github.mmm.ui.api.UiScreen;
import io.github.mmm.ui.spi.window.UiWindowPositionAndSize;

/**
 * Implementation of {@link UiWindowPositionAndSize} for testing.
 *
 * @since 1.0.0
 */
public class TestAbstractWindowPositionAndSize extends UiWindowPositionAndSize {

  private final UiScreen screen;

  /**
   * The constructor.
   */
  public TestAbstractWindowPositionAndSize() {

    super();
    this.screen = UiScreen.get();
  }

  @Override
  protected double getScreenWidth() {

    return this.screen.getWidthInPixel();
  }

  @Override
  protected double getScreenHeight() {

    return this.screen.getHeightInPixel();
  }

}
