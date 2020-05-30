/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.panel.UiGridPanel;
import io.github.mmm.ui.test.widget.panel.TestGridPanel;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiGridPanel}.
 *
 * @since 1.0.0
 */
public class TestFactoryGridPanel implements UiSingleWidgetFactoryNative<UiGridPanel> {

  @Override
  public Class<UiGridPanel> getType() {

    return UiGridPanel.class;
  }

  @Override
  public UiGridPanel create() {

    return new TestGridPanel();
  }

}
