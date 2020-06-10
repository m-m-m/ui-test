/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import io.github.mmm.ui.api.event.UiClickEventListener;
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

    TestMenuItemCheckbox checkbox = new TestMenuItemCheckbox();
    checkbox.setText(text);
    checkbox.addListener(listener);
    addChild(checkbox, index);
    return checkbox;
  }

  @Override
  public UiMenuItemRadioButton addRadioButton(String text, UiClickEventListener listener, int index) {

    TestMenuItemRadioButton radio = new TestMenuItemRadioButton();
    radio.setText(text);
    radio.addListener(listener);
    addChild(radio, index);
    return radio;
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
