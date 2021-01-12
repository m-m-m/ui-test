
/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of the UI framework for testing.
 *
 * @provides io.github.mmm.ui.api.notify.UiNotifier
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.window {

  requires transitive io.github.mmm.ui.api.window;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.notify.UiNotifier with //
      io.github.mmm.ui.test.window.notify.TestNotifier;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.window.TestFactoryMainWindow, //
      io.github.mmm.ui.test.factory.window.TestFactoryPopup, //
      io.github.mmm.ui.test.factory.window.TestFactoryWindow;

  exports io.github.mmm.ui.test.widget.window;

}
