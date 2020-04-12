/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.UiText;
import io.github.mmm.ui.test.widget.TestText;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiText}.
 *
 * @since 1.0.0
 */
public class TestFactoryText implements UiSingleWidgetFactoryNative<UiText> {

  @Override
  public Class<UiText> getType() {

    return UiText.class;
  }

  @Override
  public UiText create() {

    return new TestText();
  }

}
