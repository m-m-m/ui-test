/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.tab;

import java.util.function.Supplier;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.tab.UiTab;
import io.github.mmm.ui.test.widget.TestActiveWidget;

/**
 * Implementation of {@link UiTab} for testing.
 *
 * @since 1.0.0
 */
public class TestTab extends TestActiveWidget implements UiTab {

  private UiRegularWidget child;

  private Supplier<UiRegularWidget> childSupplier;

  private boolean closable;

  /**
   * The constructor.
   */
  public TestTab() {

    super();
  }

  @Override
  public UiRegularWidget getChild() {

    if ((this.child == null) && (this.childSupplier != null)) {
      setChild(this.childSupplier.get());
      assert (this.child != null);
      this.childSupplier = null;
    }
    return this.child;
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

  /**
   * @param childSupplier the {@link Supplier} {@link Supplier#get() providing} the {@link #getChild() child widget}.
   */
  public void setChild(Supplier<UiRegularWidget> childSupplier) {

    this.childSupplier = childSupplier;
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
