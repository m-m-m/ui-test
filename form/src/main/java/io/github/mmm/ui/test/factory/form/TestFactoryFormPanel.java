/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.form;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.form.UiFormPanel;
import io.github.mmm.ui.test.widget.form.TestFormPanel;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiFormPanel}.
 *
 * @since 1.0.0
 */
@SuppressWarnings("rawtypes")
public class TestFactoryFormPanel implements UiSingleWidgetFactoryNative<UiFormPanel> {

  @Override
  public Class<UiFormPanel> getType() {

    return UiFormPanel.class;
  }

  @Override
  public UiFormPanel create() {

    return new TestFormPanel();
  }

}
