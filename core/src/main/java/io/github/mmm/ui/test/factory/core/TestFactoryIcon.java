/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.img.UiIcon;
import io.github.mmm.ui.test.widget.img.TestIcon;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiIcon}.
 *
 * @since 1.0.0
 */
public class TestFactoryIcon implements UiSingleWidgetFactoryNative<UiIcon> {

  @Override
  public Class<UiIcon> getType() {

    return UiIcon.class;
  }

  @Override
  public UiIcon create() {

    return new TestIcon();
  }

}
