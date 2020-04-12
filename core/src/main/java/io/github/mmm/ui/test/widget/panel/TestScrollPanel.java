/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.datatype.UiScrollBarVisibility;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.panel.UiScrollPanel;
import io.github.mmm.ui.test.widget.composite.TestComposite;

/**
 * Implementation of {@link UiScrollPanel} for JavaFx.
 *
 * @since 1.0.0
 */
public class TestScrollPanel extends TestComposite<UiRegularWidget> implements UiScrollPanel {

  private UiRegularWidget child;

  private UiScrollBarVisibility horizontalScrolling;

  private UiScrollBarVisibility verticalScrolling;

  /**
   * The constructor.
   */
  public TestScrollPanel() {

    super();
    this.horizontalScrolling = UiScrollBarVisibility.AUTO;
    this.verticalScrolling = UiScrollBarVisibility.AUTO;
  }

  @Override
  public void setChild(UiRegularWidget child) {

    if (this.child == child) {
      return;
    }
    if (this.child != null) {
      setParent(this.child, null);
    }
    this.child = child;
    setParent(this.child, this);
  }

  @Override
  public UiRegularWidget getChild() {

    return this.child;
  }

  @Override
  public UiScrollBarVisibility getHorizontalScrolling() {

    return this.horizontalScrolling;
  }

  @Override
  public void setHorizontalScrolling(UiScrollBarVisibility scrolling) {

    this.horizontalScrolling = scrolling;
  }

  @Override
  public UiScrollBarVisibility getVerticalScrolling() {

    return this.verticalScrolling;
  }

  @Override
  public void setVerticalScrolling(UiScrollBarVisibility scrolling) {

    this.verticalScrolling = scrolling;
  }

}
