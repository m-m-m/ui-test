/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.panel.UiGridRow;

/**
 * Implementation of {@link UiGridRow} for testing.
 *
 * @since 1.0.0
 */
public class TestGridRow extends TestMutablePanel implements UiGridRow {

  /**
   * The constructor.
   */
  public TestGridRow() {

    super();
  }

  @Override
  public void addChild(UiRegularWidget child, int index, int colspan, int rowspan) {

    addChild(child, index);
  }

}
