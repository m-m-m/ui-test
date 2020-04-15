/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI temporal widgets for testing.
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.temporal {

  requires transitive io.github.mmm.ui.api.temporal;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.temporal.TestFactoryDateInput, //
      io.github.mmm.ui.test.factory.temporal.TestFactoryDateTimeInput, //
      io.github.mmm.ui.test.factory.temporal.TestFactoryTimeInput;

}
