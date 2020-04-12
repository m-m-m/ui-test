/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.panel;

import io.github.mmm.ui.api.widget.input.UiInput;
import io.github.mmm.ui.api.widget.panel.UiFormGroup;
import io.github.mmm.ui.test.widget.composite.TestValuedComposite;

/**
 * Implementation of {@link UiFormGroup} for testing.
 *
 * @param <V> type of the {@link #getValue() value}.
 * @since 1.0.0
 */
public class TestFormGroup<V> extends TestValuedComposite<UiInput<?>, V> implements UiFormGroup<V> {

  private String name;

  private boolean collapsed;

  private boolean collapsible;

  /**
   * The constructor.
   */
  public TestFormGroup() {

    super();
    this.collapsible = true;
  }

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public boolean isCollapsed() {

    return this.collapsed;
  }

  @Override
  public void setCollapsed(boolean collapsed) {

    this.collapsed = collapsed;
  }

  @Override
  public boolean isCollapsible() {

    return this.collapsible;
  }

  @Override
  public void setCollapsible(boolean collapsible) {

    this.collapsible = collapsible;
  }

}
