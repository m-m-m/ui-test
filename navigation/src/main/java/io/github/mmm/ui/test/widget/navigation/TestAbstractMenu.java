/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.navigation;

import io.github.mmm.ui.api.widget.navigation.UiAbstractMenu;
import io.github.mmm.ui.api.widget.navigation.UiAbstractMenuEntry;
import io.github.mmm.ui.api.widget.navigation.UiAdvancedMenu;
import io.github.mmm.ui.test.widget.composite.TestRemovableComposite;

/**
 * Implementation of {@link UiAbstractMenu} for testing.
 *
 * @param <C> type of the {@link #getChild(int) child entries}.
 * @since 1.0.0
 */
public abstract class TestAbstractMenu<C extends UiAbstractMenuEntry> extends TestRemovableComposite<C>
    implements UiAbstractMenu<C> {

  /**
   * The constructor.
   */
  public TestAbstractMenu() {

    super();
  }

  @SuppressWarnings("unchecked")
  @Override
  public UiAdvancedMenu addMenu(String text, int index) {

    TestMenu menu = new TestMenu();
    menu.setText(text);
    addChild((C) menu, index);
    return menu;
  }

  void addChild(C child, int index) {

    setParent(child, this);
    if (index == -1) {
      this.children.add(child);
    } else {
      this.children.add(index, child);
    }
  }

}
