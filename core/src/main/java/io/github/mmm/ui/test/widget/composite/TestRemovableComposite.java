/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.composite;

import io.github.mmm.ui.api.widget.UiWidget;
import io.github.mmm.ui.api.widget.composite.UiRemovableComposite;

/**
 * Implementation of {@link UiRemovableComposite} for testing.
 *
 * @param <C> type of the {@link #getChild(int) child widgets}.
 * @since 1.0.0
 */
public abstract class TestRemovableComposite<C extends UiWidget> extends TestComposite<C>
    implements UiRemovableComposite<C> {

  /**
   * The constructor.
   */
  public TestRemovableComposite() {

    super();
  }

  @Override
  public C removeChild(int index) {

    C child = this.children.remove(index);
    setParent(child, null);
    return child;
  }

}
