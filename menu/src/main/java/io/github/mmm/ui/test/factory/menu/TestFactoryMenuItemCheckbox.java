/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.menu;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.menu.UiMenuItemCheckbox;
import io.github.mmm.ui.test.widget.menu.TestMenuItemCheckbox;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiMenuItemCheckbox}.
 *
 * @since 1.0.0
 */
public class TestFactoryMenuItemCheckbox implements UiSingleWidgetFactoryNative<UiMenuItemCheckbox> {

  @Override
  public Class<UiMenuItemCheckbox> getType() {

    return UiMenuItemCheckbox.class;
  }

  @Override
  public UiMenuItemCheckbox create() {

    return new TestMenuItemCheckbox();
  }

}
