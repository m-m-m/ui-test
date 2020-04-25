/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test;

import io.github.mmm.ui.api.UiToggleGroup;
import io.github.mmm.ui.api.factory.UiToggleGroupFactory;

/**
 * Implementation of {@link UiToggleGroupFactory} for testing.
 *
 * @since 1.0.0
 */
public class TestToggleGroupFactory implements UiToggleGroupFactory {

  @Override
  public UiToggleGroup create() {

    return new TestToggleGroup();
  }

}
