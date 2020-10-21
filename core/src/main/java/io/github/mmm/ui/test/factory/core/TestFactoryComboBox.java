/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.input.UiComboBox;
import io.github.mmm.ui.test.widget.input.TestComboBox;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiComboBox}.
 *
 * @since 1.0.0
 */
@SuppressWarnings("rawtypes")
public class TestFactoryComboBox implements UiSingleWidgetFactoryNative<UiComboBox> {

  @Override
  public Class<UiComboBox> getType() {

    return UiComboBox.class;
  }

  @Override
  public UiComboBox create() {

    return new TestComboBox();
  }

}
