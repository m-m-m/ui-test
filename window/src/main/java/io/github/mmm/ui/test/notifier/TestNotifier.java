/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.notifier;

import io.github.mmm.ui.api.datatype.UiNotification;
import io.github.mmm.ui.api.notifier.AbstractUiNotifier;

/**
 * Implementation of {@link io.github.mmm.ui.api.notifier.UiNotifier} for JavaFx.
 *
 * @since 1.0.0
 */
public class TestNotifier extends AbstractUiNotifier {

  /**
   * The constructor.
   */
  public TestNotifier() {

    super();
  }

  @Override
  public void showGrowl(UiNotification notification) {

    // nothing to do, just a mock...
  }
}
