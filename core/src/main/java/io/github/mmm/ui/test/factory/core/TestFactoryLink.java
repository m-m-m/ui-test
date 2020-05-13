/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.core;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.button.UiLink;
import io.github.mmm.ui.test.widget.button.TestLink;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiLink}.
 *
 * @since 1.0.0
 */
public class TestFactoryLink implements UiSingleWidgetFactoryNative<UiLink> {

  @Override
  public Class<UiLink> getType() {

    return UiLink.class;
  }

  @Override
  public UiLink create() {

    return new TestLink();
  }

}
