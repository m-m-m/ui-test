/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.window;

import io.github.mmm.ui.api.attribute.AttributeWriteMaximized;
import io.github.mmm.ui.api.attribute.AttributeWriteMinimized;
import io.github.mmm.ui.api.attribute.AttributeWritePositionRange;
import io.github.mmm.ui.api.attribute.AttributeWriteSizeRange;
import io.github.mmm.ui.api.datatype.UiEnabledFlags;
import io.github.mmm.ui.api.event.UiHideEvent;
import io.github.mmm.ui.api.event.UiShowEvent;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.composite.UiComposite;
import io.github.mmm.ui.api.widget.window.UiAbstractWindow;
import io.github.mmm.ui.test.widget.composite.TestMutableComposite;

/**
 * Implementation of {@link UiAbstractWindow} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractWindow extends TestMutableComposite<UiRegularWidget>
    implements UiAbstractWindow, AttributeWriteMinimized, AttributeWriteMaximized {

  /**
   * @see #getPosition()
   * @see #getSize()
   */
  protected final TestAbstractWindowPositionAndSize positionAndSize;

  private boolean resizable;

  private String title;

  private boolean maximized;

  private boolean minimized;

  /**
   * The constructor.
   */
  public TestAbstractWindow() {

    super();
    this.positionAndSize = new TestAbstractWindowPositionAndSize();
  }

  @Override
  protected boolean isVisibleWithoutRoot() {

    return true;
  }

  @Override
  public UiAbstractWindow getParent() {

    return (UiAbstractWindow) super.getParent();
  }

  @Override
  protected void setParent(UiComposite<?> parent) {

    assert ((parent == null) || (parent instanceof UiAbstractWindow));
    super.setParent(parent);
  }

  @Override
  protected void setVisibleNative(boolean visible) {

    if (visible) {
      this.positionAndSize.centerOnScreen(false);
      fireEvent(new UiShowEvent(this, true));
    } else {
      fireEvent(new UiHideEvent(this, true));
    }
  }

  @Override
  public AttributeWritePositionRange getPosition() {

    return this.positionAndSize;
  }

  @Override
  public AttributeWriteSizeRange getSize() {

    return this.positionAndSize;
  }

  @Override
  public boolean isResizable() {

    return this.resizable;
  }

  @Override
  public void setResizable(boolean resizable) {

    this.resizable = resizable;
  }

  @Override
  public String getTitle() {

    return this.title;
  }

  @Override
  public void setTitle(String title) {

    this.title = title;
  }

  @Override
  protected void setEnabledNative(boolean enabled) {

    for (UiRegularWidget child : this.children) {
      child.setEnabled(enabled, UiEnabledFlags.PARENT);
    }
  }

  @Override
  public boolean isMaximized() {

    return this.maximized;
  }

  @Override
  public void setMaximized(boolean maximized) {

    this.maximized = maximized;
  }

  @Override
  public boolean isMinimized() {

    return this.minimized;
  }

  @Override
  public void setMinimized(boolean minimized) {

    this.minimized = minimized;
  }

  @Override
  protected final void doDispose() {

    setVisible(false);
    super.doDispose();
  }

}
