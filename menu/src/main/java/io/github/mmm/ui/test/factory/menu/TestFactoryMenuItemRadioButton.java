/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.menu;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.menu.UiMenuItemRadioButton;
import io.github.mmm.ui.test.widget.menu.TestMenuItemRadioButton;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiMenuItemRadioButton}.
 *
 * @since 1.0.0
 */
public class TestFactoryMenuItemRadioButton implements UiSingleWidgetFactoryNative<UiMenuItemRadioButton> {

  @Override
  public Class<UiMenuItemRadioButton> getType() {

    return UiMenuItemRadioButton.class;
  }

  @Override
  public UiMenuItemRadioButton create() {

    return new TestMenuItemRadioButton();
  }

}
