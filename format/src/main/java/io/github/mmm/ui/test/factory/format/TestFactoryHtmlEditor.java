/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.format;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.format.UiHtmlEditor;
import io.github.mmm.ui.test.widget.format.TestHtmlEditor;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiHtmlEditor}.
 *
 * @since 1.0.0
 */
public class TestFactoryHtmlEditor implements UiSingleWidgetFactoryNative<UiHtmlEditor> {

  @Override
  public Class<UiHtmlEditor> getType() {

    return UiHtmlEditor.class;
  }

  @Override
  public UiHtmlEditor create() {

    return new TestHtmlEditor();
  }

}
