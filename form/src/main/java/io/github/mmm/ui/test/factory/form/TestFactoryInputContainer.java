/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.form;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.form.UiInputContainer;
import io.github.mmm.ui.test.widget.form.TestInputContainer;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiInputContainer}.
 *
 * @since 1.0.0
 */
@SuppressWarnings("rawtypes")
public class TestFactoryInputContainer implements UiSingleWidgetFactoryNative<UiInputContainer> {

  @Override
  public Class<UiInputContainer> getType() {

    return UiInputContainer.class;
  }

  @Override
  public UiInputContainer create() {

    return new TestInputContainer();
  }

}
