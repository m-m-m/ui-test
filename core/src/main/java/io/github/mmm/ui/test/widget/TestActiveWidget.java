/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.event.UiFocusGainEvent;
import io.github.mmm.ui.api.widget.UiActiveWidget;

/**
 * Implementation of {@link UiActiveWidget} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestActiveWidget extends TestWidget implements UiActiveWidget {

  private char accessKey;

  /**
   * The constructor.
   */
  public TestActiveWidget() {

    super();
    this.accessKey = ACCESS_KEY_NONE;
  }

  @Override
  public char getAccessKey() {

    return this.accessKey;
  }

  @Override
  public void setAccessKey(char accessKey) {

    this.accessKey = accessKey;
  }

  @Override
  public boolean isFocused() {

    return (focussedWidget == this);
  }

  @Override
  public boolean setFocused() {

    setProgrammaticEventType(UiFocusGainEvent.TYPE);
    focussedWidget = this;
    return true;
  }

}
