/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.composite;

import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.api.widget.composite.UiCollapsibleComposite;
import io.github.mmm.ui.api.widget.panel.UiCollapsiblePanel;

/**
 * Implementation of {@link UiCollapsiblePanel} for testing.
 *
 * @param <C> type of the {@link #getChild(int) child widgets}.
 * @since 1.0.0
 */
public class TestCollapsibleComposite<C extends UiWidget> extends TestMutableComposite<C>
    implements UiCollapsibleComposite<C> {

  private boolean collapsed;

  private boolean collapsible;

  /**
   * The constructor.
   */
  public TestCollapsibleComposite() {

    super();
    this.collapsible = true;
  }

  @Override
  public boolean isCollapsed() {

    return this.collapsed;
  }

  @Override
  public void setCollapsed(boolean collapsed) {

    this.collapsed = collapsed;
  }

  @Override
  public boolean isCollapsible() {

    return this.collapsible;
  }

  @Override
  public void setCollapsible(boolean collapsible) {

    this.collapsible = collapsible;
  }

}
