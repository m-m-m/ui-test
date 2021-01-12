/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.window;

import io.github.mmm.ui.api.widget.composite.UiComposite;
import io.github.mmm.ui.api.widget.window.UiAbstractWindow;
import io.github.mmm.ui.api.widget.window.UiChildWindow;

/**
 * Implementation of {@link UiChildWindow} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestChildWindow extends TestAbstractWindow implements UiChildWindow {

  private boolean closable;

  private boolean movable;

  /**
   * The constructor.
   */
  public TestChildWindow() {

    super();
    this.closable = true;
    this.movable = true;
  }

  @Override
  protected boolean isInitiallyVisible() {

    return false;
  }

  @Override
  protected boolean isVisibleWithoutRoot() {

    return true;
  }

  @Override
  public UiAbstractWindow getParent() {

    return super.getParent();
  }

  @Override
  protected void setParent(UiComposite<?> parent) {

    assert ((parent == null) || (parent instanceof UiAbstractWindow));
    super.setParent(parent);
  }

  @Override
  public boolean isClosable() {

    return this.closable;
  }

  @Override
  public void setClosable(boolean closable) {

    this.closable = closable;
  }

  @Override
  public boolean isMovable() {

    return this.movable;
  }

  @Override
  public void setMovable(boolean movable) {

    this.movable = movable;
  }

  @Override
  public void centerOnScreen() {

    this.positionAndSize.centerOnScreen(true);
  }

}
