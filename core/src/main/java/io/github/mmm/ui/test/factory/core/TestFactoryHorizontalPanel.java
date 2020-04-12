/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.panel.UiHorizontalPanel;
import io.github.mmm.ui.test.widget.panel.FxHorizontalPanel;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiHorizontalPanel}.
 *
 * @since 1.0.0
 */
public class TestFactoryHorizontalPanel implements UiSingleWidgetFactoryNative<UiHorizontalPanel> {

  @Override
  public Class<UiHorizontalPanel> getType() {

    return UiHorizontalPanel.class;
  }

  @Override
  public UiHorizontalPanel create() {

    return new FxHorizontalPanel();
  }

}
