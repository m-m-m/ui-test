/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.composite;

import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.api.widget.composite.UiFailureComposite;

/**
 * Implementation of {@link UiFailureComposite} for testing.
 *
 * @param <C> type of the {@link #getChild(int) child widgets}.
 * @since 1.0.0
 */
public abstract class TestFailureComposite<C extends UiWidget> extends TestMutableComposite<C>
    implements UiFailureComposite<C> {

  /**
   * The constructor.
   */
  public TestFailureComposite() {

    super();
  }
}
