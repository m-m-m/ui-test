/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.menu;

import java.util.ArrayList;
import java.util.List;

import io.github.mmm.ui.api.widget.menu.UiAbstractMenuItem;
import io.github.mmm.ui.api.widget.menu.UiMenu;
import io.github.mmm.ui.test.TestToggleGroup;

/**
 * Implementation of {@link UiMenu} for testing.
 *
 * @since 1.0.0
 */
public class TestMenu extends TestAbstractMenuItem implements UiMenu {

  private final List<UiAbstractMenuItem> children;

  private TestToggleGroup toggleGroup;

  /**
   * The constructor.
   */
  public TestMenu() {

    super();
    this.children = new ArrayList<>();
  }

  @Override
  public void addChild(UiAbstractMenuItem child, int index) {

    if (index == -1) {
      this.children.add(child);
    } else {
      this.children.add(index, child);
    }
  }

  @Override
  public boolean removeChild(UiAbstractMenuItem child) {

    boolean removed = this.children.remove(child);
    return removed;
  }

  @Override
  public UiAbstractMenuItem removeChild(int index) {

    UiAbstractMenuItem childItem = this.children.remove(index);
    return childItem;
  }

  @Override
  public int getChildCount() {

    return this.children.size();
  }

  @Override
  public int getChildIndex(UiAbstractMenuItem child) {

    return this.children.indexOf(child);
  }

  @Override
  public UiAbstractMenuItem getChild(int index) {

    if ((index < 0) || (index >= this.children.size())) {
      return null;
    }
    return this.children.get(index);
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
