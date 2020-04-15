/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.tab;

import java.util.function.Supplier;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.tab.UiTab;
import io.github.mmm.ui.api.widget.tab.UiTabPanel;
import io.github.mmm.ui.test.widget.composite.TestMutableComposite;

/**
 * Implementation of {@link UiTabPanel} for testing.
 *
 * @since 1.0.0
 */
public class TestTabPanel extends TestMutableComposite<UiTab> implements UiTabPanel {

  private UiTab activeChild;

  /**
   * The constructor.
   */
  public TestTabPanel() {

    super();
  }

  @Override
  public UiTab addTab(String text, UiRegularWidget child) {

    TestTab tab = new TestTab();
    tab.setText(text);
    tab.setChild(child);
    addChild(tab);
    return tab;
  }

  @Override
  public UiTab addTab(String text, Supplier<UiRegularWidget> childSupplier) {

    TestTab tab = new TestTab();
    tab.setText(text);
    tab.setChild(childSupplier);
    addChild(tab);
    return tab;
  }

  @Override
  public UiTab getActiveChild() {

    return this.activeChild;
  }

  @Override
  public int getActiveChildIndex() {

    return this.children.indexOf(this.activeChild);
  }

  @Override
  public boolean setActiveChild(UiTab child) {

    this.activeChild = child;
    return true;
  }

}
