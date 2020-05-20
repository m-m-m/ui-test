/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.form;

import io.github.mmm.ui.api.widget.form.UiInputContainer;
import io.github.mmm.ui.api.widget.input.UiInput;
import io.github.mmm.ui.test.widget.TestWidget;
import io.github.mmm.ui.test.widget.input.TestInput;

/**
 * {@link TestInput#getContainerWidget() Input container widget} for testing.
 *
 * @param <V> type of the {@link UiInput#getValue() input value}.
 * @since 1.0.0
 */
public class TestInputContainer<V> extends TestWidget implements UiInputContainer<V> {

  private UiInput<V> child;

  /**
   * The constructor.
   */
  public TestInputContainer() {

    super();
    getStyles().add(STYLE);
  }

  @Override
  public UiInput<V> getChild() {

    return this.child;
  }

  @Override
  public void setChild(UiInput<V> child) {

    this.child = child;
    setParent(child, this);
    setParent(child.getNameWidget(), this);
  }

}
