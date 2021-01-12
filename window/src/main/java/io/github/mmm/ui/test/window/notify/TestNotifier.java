/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.window.notify;

import io.github.mmm.ui.api.notify.UiNotification;
import io.github.mmm.ui.api.window.notiy.AbstractUiNotifier;

/**
 * Implementation of {@link io.github.mmm.ui.api.window.notiy.UiPopupNotifier} for JavaFx.
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
