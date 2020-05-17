/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI temporal widgets for testing.
 *
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.number {

  requires transitive io.github.mmm.ui.api.number;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.number.TestFactoryBigDecimalInput, //
      io.github.mmm.ui.test.factory.number.TestFactoryBigIntegerInput, //
      io.github.mmm.ui.test.factory.number.TestFactoryDoubleInput, //
      io.github.mmm.ui.test.factory.number.TestFactoryIntegerInput, //
      io.github.mmm.ui.test.factory.number.TestFactoryIntegerSlider, //
      io.github.mmm.ui.test.factory.number.TestFactoryLongInput, //
      io.github.mmm.ui.test.factory.number.TestFactoryLongSlider //
  ;
}
