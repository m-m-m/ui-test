/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of data widgets for testing.
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.data {

  requires transitive io.github.mmm.ui.api.data;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.data.TestFactoryDataList;

  exports io.github.mmm.ui.test.widget.data;

}
