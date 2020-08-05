/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.menu;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.menu.UiMenuBar;
import io.github.mmm.ui.test.widget.menu.TestMenuBar;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiMenuBar}.
 *
 * @since 1.0.0
 */
public class TestFactoryMenuBar implements UiSingleWidgetFactoryNative<UiMenuBar> {

  private static UiMenuBar menuBar;

  @Override
  public Class<UiMenuBar> getType() {

    return UiMenuBar.class;
  }

  @Override
  public UiMenuBar create() {

    if (menuBar == null) {
      menuBar = new TestMenuBar();
    }
    return menuBar;
  }

}
