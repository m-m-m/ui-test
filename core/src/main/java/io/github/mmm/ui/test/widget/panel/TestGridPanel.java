/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.panel.UiGridPanel;
import io.github.mmm.ui.api.widget.panel.UiGridRow;
import io.github.mmm.ui.test.widget.composite.TestMutableComposite;

/**
 * Implementation of {@link UiGridPanel} for testing.
 *
 * @since 1.0.0
 */
public class TestGridPanel extends TestMutableComposite<UiGridRow> implements UiGridPanel {

  /**
   * The constructor.
   */
  public TestGridPanel() {

    super();
  }

  @Override
  public UiGridRow addRow(int index) {

    TestGridRow row = new TestGridRow();
    addChild(row, index);
    return row;
  }

}
