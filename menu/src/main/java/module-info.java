
/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;

/**
 * Provides the implementation of the UI framework based on JavaFx.
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.menu {

  requires transitive io.github.mmm.ui.api.menu;

  requires transitive io.github.mmm.ui.test.core;

  provides UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenu, //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenuBar, //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenuItem, //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenuItemCheckbox, //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenuItemRadioButton, //
      io.github.mmm.ui.test.factory.menu.TestFactoryMenuItemSeparator //
  ;
}
