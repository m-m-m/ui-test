/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.form;

import io.github.mmm.ui.api.widget.form.UiFormPanel;
import io.github.mmm.ui.api.widget.input.UiAbstractInput;
import io.github.mmm.ui.test.widget.composite.TestValuedComposite;

/**
 * Implementation of {@link UiFormPanel} using JavaFx.
 *
 * @param <V> type of the {@link #getValue() value}.
 * @since 1.0.0
 */
public class TestFormPanel<V> extends TestValuedComposite<UiAbstractInput<?>, V> implements UiFormPanel<V> {

  /**
   * The constructor.
   */
  public TestFormPanel() {

    super();
    getStyles().add(STYLE);
  }

}
