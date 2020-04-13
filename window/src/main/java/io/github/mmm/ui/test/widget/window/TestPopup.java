/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.window;

import io.github.mmm.ui.api.datatype.UiEnabledFlags;
import io.github.mmm.ui.api.widget.panel.UiButtonPanel;
import io.github.mmm.ui.api.widget.window.UiPopup;

/**
 * Implementation of {@link UiPopup} for testing.
 *
 * @since 1.0.0
 */
public class TestPopup extends TestChildWindow implements UiPopup {

  private final UiButtonPanel buttonPanel;

  /**
   * The constructor.
   */
  public TestPopup() {

    super();
    this.buttonPanel = UiButtonPanel.of();
  }

  @Override
  public UiButtonPanel getButtonPanel() {

    return this.buttonPanel;
  }

  @Override
  protected void setEnabledNative(boolean enabled) {

    super.setEnabledNative(enabled);
    this.buttonPanel.setEnabled(enabled, UiEnabledFlags.PARENT);
  }

}
