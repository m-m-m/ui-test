/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import io.github.mmm.ui.api.event.UiEventListener;
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
  public UiMenuItem addItem(String text, UiEventListener listener, int index) {

    TestMenuItem item = new TestMenuItem();
    if (text != null) {
      item.setText(text);
    }
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
