/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.composite;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.composite.UiSlot;

/**
 * Implementation of {@link UiSlot} for JavaFx.
 *
 * @since 1.0.0
 */
public class TestSlot extends TestComposite<UiRegularWidget> implements UiSlot {

  private UiRegularWidget child;

  /**
   * The constructor.
   */
  public TestSlot() {

    super();
  }

  @Override
  public UiRegularWidget getChild() {

    return this.child;
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

}
