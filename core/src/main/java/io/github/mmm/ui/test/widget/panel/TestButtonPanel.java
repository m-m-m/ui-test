/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.button.UiAbstractButton;
import io.github.mmm.ui.api.widget.panel.UiButtonPanel;
import io.github.mmm.ui.test.widget.composite.TestMutableComposite;

/**
 * Implementation of {@link UiButtonPanel} for testing.
 *
 * @since 1.0.0
 */
public class TestButtonPanel extends TestMutableComposite<UiAbstractButton> implements UiButtonPanel {

  /**
   * The constructor.
   */
  public TestButtonPanel() {

    super();
    getStyles().add(STYLE);
  }

}
