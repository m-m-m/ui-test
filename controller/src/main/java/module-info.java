/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of controller manager with routing and navigation for testing.
 */
module io.github.mmm.ui.test.controller {

  requires transitive io.github.mmm.ui.spi.controller;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.controller.UiNavigationManager with //
      io.github.mmm.ui.test.controller.TestNavigationManager;

}
