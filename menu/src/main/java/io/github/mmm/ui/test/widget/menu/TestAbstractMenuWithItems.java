/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import io.github.mmm.ui.api.event.UiClickEventListener;
import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.api.widget.menu.UiAbstractMenuEntry;
import io.github.mmm.ui.api.widget.menu.UiAbstractMenuWithItems;
import io.github.mmm.ui.api.widget.menu.UiMenuItem;
import io.github.mmm.ui.api.widget.menu.UiMenuItemSeparator;

/**
 * Implementation of {@link UiAbstractMenuWithItems} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractMenuWithItems extends TestAbstractMenu<UiAbstractMenuEntry>
    implements UiAbstractMenuWithItems {

  /**
   * The constructor.
   */
  public TestAbstractMenuWithItems() {

    super();
  }

  @Override
  public UiMenuItem addItem(String text, UiClickEventListener listener, int index) {

    TestMenuItem item = new TestMenuItem();
    UiWidget.initText(item, text);
    if (listener != null) {
      item.addListener(listener);
    }
    addChild(item, index);
    return item;
  }

  @Override
  public UiMenuItemSeparator addSeparator(int index) {

    TestMenuItemSeparator separator = new TestMenuItemSeparator();
    addChild(separator, index);
    return separator;
  }

}
