/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.attribute.AttributeWriteText;
import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.spi.widget.AbstractUiNativeWidgetWrapper;

/**
 * Implementation of {@link UiWidget} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestWidget extends AbstractUiNativeWidgetWrapper<Void> implements AttributeWriteText {

  /** The widget that is currently focussed. */
  protected static TestWidget focussedWidget;

  private String text;

  /**
   * The constructor.
   */
  public TestWidget() {

    super();
  }

  @Override
  public Void getWidget() {

    return null;
  }

  @Override
  protected void setIdNative(String id) {

    // nothing to do, just a mock
  }

  @Override
  protected void setTooltipNative(String newTooltip) {

    // nothing to do, just a mock
  }

  @Override
  public String getText() {

    return this.text;
  }

  @Override
  public void setText(String text) {

    this.text = text;
  }

  @Override
  protected void setVisibleNative(boolean visible) {

  }

  @Override
  protected void setEnabledNative(boolean enabled) {

  }

  @Override
  protected void setReadOnlyNative(boolean readOnly) {

  }

}
