/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI form widgets for testing.
 * 
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.form {

  requires transitive io.github.mmm.ui.api.form;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.form.TestFactoryFormGroup, //
      io.github.mmm.ui.test.factory.form.TestFactoryFormPanel //
  ;

  exports io.github.mmm.ui.test.widget.form;

}
