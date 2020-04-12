/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.panel.UiMutablePanel;
import io.github.mmm.ui.test.widget.composite.TestMutableComposite;

/**
 * Implementation of {@link UiMutablePanel} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestMutablePanel extends TestMutableComposite<UiRegularWidget> implements UiMutablePanel {

  /**
   * The constructor.
   */
  public TestMutablePanel() {

    super();
  }

}
