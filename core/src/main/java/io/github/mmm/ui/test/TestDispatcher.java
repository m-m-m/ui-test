/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test;

import java.util.concurrent.Callable;

import io.github.mmm.ui.spi.AbstractUiDispatcher;

/**
 * Implementation of {@link io.github.mmm.ui.api.UiDispatcher} for testing.
 *
 * @since 1.0.0
 */
public class TestDispatcher extends AbstractUiDispatcher {

  /**
   * The constructor.
   */
  public TestDispatcher() {

    super();
  }

  @Override
  public boolean isDispatchThread() {

    return true;
  }

  @Override
  public void invokeAsynchron(Runnable task) {

    // TODO
    task.run();
  }

  @Override
  public void invokeTimer(Runnable task, int delayMilliseconds) {

    // TODO Auto-generated method stub

  }

  @Override
  public void invokeTimer(Callable<Boolean> task, int delayMilliseconds) {

    // TODO Auto-generated method stub

  }

}
