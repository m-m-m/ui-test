/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.time;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.time.UiDateInput;
import io.github.mmm.ui.test.widget.time.TestDateInput;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiDateInput}.
 *
 * @since 1.0.0
 */
public class TestFactoryDateInput implements UiSingleWidgetFactoryNative<UiDateInput> {

  @Override
  public Class<UiDateInput> getType() {

    return UiDateInput.class;
  }

  @Override
  public UiDateInput create() {

    return new TestDateInput();
  }

}
