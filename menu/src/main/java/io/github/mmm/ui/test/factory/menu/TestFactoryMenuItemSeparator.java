/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.menu;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.menu.UiMenuItemSeparator;
import io.github.mmm.ui.test.widget.menu.TestMenuItemSeparator;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiMenuItemSeparator}.
 *
 * @since 1.0.0
 */
public class TestFactoryMenuItemSeparator implements UiSingleWidgetFactoryNative<UiMenuItemSeparator> {

  @Override
  public Class<UiMenuItemSeparator> getType() {

    return UiMenuItemSeparator.class;
  }

  @Override
  public UiMenuItemSeparator create() {

    return new TestMenuItemSeparator();
  }

}
