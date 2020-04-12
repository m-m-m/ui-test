/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.composite;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.composite.UiTab;
import io.github.mmm.ui.test.widget.TestActiveWidget;

/**
 * Implementation of {@link UiTab} for testing.
 *
 * @since 1.0.0
 */
public class TestTab extends TestActiveWidget implements UiTab {

  private UiRegularWidget child;

  private boolean closable;

  /**
   * The constructor.
   */
  public TestTab() {

    super();
  }

  @Override
  public void setChild(UiRegularWidget child) {

    if (child == this.child) {
      return;
    }
    if (this.child != null) {
      setParent(this.child, null);
    }
    this.child = child;
    setParent(child, this);
  }

  @Override
  public UiRegularWidget getChild() {

    return this.child;
  }

  @Override
  public boolean isClosable() {

    return this.closable;
  }

  @Override
  public void setClosable(boolean closable) {

    this.closable = closable;
  }

}
