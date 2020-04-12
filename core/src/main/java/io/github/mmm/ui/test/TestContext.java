/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test;

import io.github.mmm.ui.api.UiDispatcher;
import io.github.mmm.ui.api.UiToggleGroup;
import io.github.mmm.ui.spi.AbstractUiContext;

/**
 * Implementation of {@link io.github.mmm.ui.api.UiContext} for testing.
 *
 * @since 1.0.0
 */
public class TestContext extends AbstractUiContext {

  private final TestDispatcher dispatcher;

  /**
   * The constructor.
   */
  public TestContext() {

    super();
    this.dispatcher = new TestDispatcher();
  }

  @Override
  public UiDispatcher getDispatcher() {

    return this.dispatcher;
  }

  @Override
  public UiToggleGroup createToggleGroup() {

    return new TestToggleGroup();
  }

}
