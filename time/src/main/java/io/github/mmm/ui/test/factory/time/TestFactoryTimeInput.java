/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.time;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.time.UiTimeInput;
import io.github.mmm.ui.test.widget.time.TestTimeInput;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiTimeInput}.
 *
 * @since 1.0.0
 */
public class TestFactoryTimeInput implements UiSingleWidgetFactoryNative<UiTimeInput> {

  @Override
  public Class<UiTimeInput> getType() {

    return UiTimeInput.class;
  }

  @Override
  public UiTimeInput create() {

    return new TestTimeInput();
  }

}
