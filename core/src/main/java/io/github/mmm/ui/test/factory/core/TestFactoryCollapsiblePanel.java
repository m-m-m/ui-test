/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.panel.UiCollapsiblePanel;
import io.github.mmm.ui.test.widget.panel.TestCollapsiblePanel;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiCollapsiblePanel}.
 *
 * @since 1.0.0
 */
public class TestFactoryCollapsiblePanel implements UiSingleWidgetFactoryNative<UiCollapsiblePanel> {

  @Override
  public Class<UiCollapsiblePanel> getType() {

    return UiCollapsiblePanel.class;
  }

  @Override
  public UiCollapsiblePanel create() {

    return new TestCollapsiblePanel();
  }

}
