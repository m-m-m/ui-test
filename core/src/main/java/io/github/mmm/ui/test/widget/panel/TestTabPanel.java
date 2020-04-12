/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.composite.UiTab;
import io.github.mmm.ui.api.widget.panel.UiTabPanel;
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
