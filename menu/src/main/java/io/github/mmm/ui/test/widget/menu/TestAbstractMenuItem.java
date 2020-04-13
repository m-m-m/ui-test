/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import io.github.mmm.ui.api.event.UiClickEvent;
import io.github.mmm.ui.api.widget.menu.UiAbstractActiveMenuItem;
import io.github.mmm.ui.test.widget.TestActiveWidget;

/**
 * Implementation of {@link UiAbstractActiveMenuItem} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractMenuItem extends TestActiveWidget implements UiAbstractActiveMenuItem {

  /**
   * The constructor.
   */
  public TestAbstractMenuItem() {

    super();
  }

  @Override
  public void click() {

    fireEvent(new UiClickEvent(this, true));
  }

}
