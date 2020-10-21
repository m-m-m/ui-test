/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import io.github.mmm.ui.api.event.UiClickEventListener;
import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.api.widget.menu.UiAdvancedMenu;
import io.github.mmm.ui.api.widget.menu.UiMenuItemCheckbox;
import io.github.mmm.ui.api.widget.menu.UiMenuItemRadioButton;
import io.github.mmm.ui.test.TestToggleGroup;

/**
 * Implementation of {@link UiAdvancedMenu} for testing.
 *
 * @since 1.0.0
 */
public class TestMenu extends TestAbstractMenuWithItems implements UiAdvancedMenu {

  private TestToggleGroup toggleGroup;

  /**
   * The constructor.
   */
  public TestMenu() {

    super();
  }

  @Override
  public UiMenuItemCheckbox addCheckbox(String text, UiClickEventListener listener, int index) {

    TestMenuItemCheckbox item = new TestMenuItemCheckbox();
    UiWidget.initText(item, text);
    item.addListener(listener);
    addChild(item, index);
    return item;
  }

  @Override
  public UiMenuItemRadioButton addRadioButton(String text, UiClickEventListener listener, int index) {

    TestMenuItemRadioButton item = new TestMenuItemRadioButton();
    UiWidget.initText(item, text);
    item.addListener(listener);
    addChild(item, index);
    return item;
  }

  /**
   * @return the {@link TestToggleGroup}.
   */
  public TestToggleGroup getToggleGroup() {

    if (this.toggleGroup == null) {
      this.toggleGroup = new TestToggleGroup();
    }
    return this.toggleGroup;
  }

}
