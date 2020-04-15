/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI tab widgets for testing.
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.tab {

  requires transitive io.github.mmm.ui.api.tab;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.tab.TestFactoryTabPanel //
  ;

}
