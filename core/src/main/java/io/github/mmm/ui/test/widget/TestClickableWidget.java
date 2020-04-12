/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.event.UiClickEvent;
import io.github.mmm.ui.api.widget.UiClickableWidget;

/**
 * Implementation of {@link UiClickableWidget} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestClickableWidget extends TestActiveWidget implements UiClickableWidget {

  /**
   * The constructor.
   */
  public TestClickableWidget() {

    super();
  }

  @Override
  public void click() {

    fireEvent(new UiClickEvent(this, true));
  }

}
