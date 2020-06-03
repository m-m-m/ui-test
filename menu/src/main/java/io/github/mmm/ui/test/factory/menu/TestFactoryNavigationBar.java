/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.menu;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.menu.UiNavigationBar;
import io.github.mmm.ui.test.widget.menu.TestNavigationBar;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiNavigationBar}.
 *
 * @since 1.0.0
 */
public class TestFactoryNavigationBar implements UiSingleWidgetFactoryNative<UiNavigationBar> {

  @Override
  public Class<UiNavigationBar> getType() {

    return UiNavigationBar.class;
  }

  @Override
  public UiNavigationBar create() {

    return new TestNavigationBar();
  }

}
