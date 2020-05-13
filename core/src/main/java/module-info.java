/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of the UI core for testing.
 *
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative
 * @provides io.github.mmm.ui.api.factory.UiToggleGroupFactory
 * @provides io.github.mmm.ui.api.UiDispatcher
 * @provides io.github.mmm.ui.api.UiScreen
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.core {

  requires transitive io.github.mmm.ui.spi.core;

  requires transitive io.github.mmm.ui.api.form;

  // TODO bug in JPMS or Eclipse as this is already a transitive dependency of ui
  requires transitive io.github.mmm.value;

  // TODO bug in JPMS or Eclipse as this is already a transitive dependency of ui
  requires transitive io.github.mmm.validation.main;

  provides io.github.mmm.ui.api.UiScreen with //
      io.github.mmm.ui.test.TestScreen;

  provides io.github.mmm.ui.api.UiDispatcher with //
      io.github.mmm.ui.test.TestDispatcher;

  provides io.github.mmm.ui.api.factory.UiToggleGroupFactory with //
      io.github.mmm.ui.test.TestToggleGroupFactory;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.core.TestFactoryButton, //
      io.github.mmm.ui.test.factory.core.TestFactoryButtonPanel, //
      io.github.mmm.ui.test.factory.core.TestFactoryCheckbox, //
      io.github.mmm.ui.test.factory.core.TestFactoryCollapsiblePanel, //
      io.github.mmm.ui.test.factory.core.TestFactoryHorizontalPanel, //
      io.github.mmm.ui.test.factory.core.TestFactoryImage, //
      io.github.mmm.ui.test.factory.core.TestFactoryIntegerInput, //
      io.github.mmm.ui.test.factory.core.TestFactoryIntegerSlider, //
      io.github.mmm.ui.test.factory.core.TestFactoryLabel, //
      io.github.mmm.ui.test.factory.core.TestFactoryLink, //
      io.github.mmm.ui.test.factory.core.TestFactoryPasswordInput, //
      io.github.mmm.ui.test.factory.core.TestFactoryRadioButton, //
      io.github.mmm.ui.test.factory.core.TestFactoryRadioChoice, //
      io.github.mmm.ui.test.factory.core.TestFactorySlot, //
      io.github.mmm.ui.test.factory.core.TestFactoryScrollPanel, //
      io.github.mmm.ui.test.factory.core.TestFactoryText, //
      io.github.mmm.ui.test.factory.core.TestFactoryTextInput, //
      io.github.mmm.ui.test.factory.core.TestFactoryTextArea, //
      io.github.mmm.ui.test.factory.core.TestFactoryVerticalPanel //
  ;

  exports io.github.mmm.ui.test;

  exports io.github.mmm.ui.test.widget;

  exports io.github.mmm.ui.test.widget.composite;

  exports io.github.mmm.ui.test.widget.input;

}
