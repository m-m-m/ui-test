/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI media widgets for testing.
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.media {

  requires transitive io.github.mmm.ui.api.media;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.media.TestFactoryAudioPlayer, //
      io.github.mmm.ui.test.factory.media.TestFactoryMediaPlayer, //
      io.github.mmm.ui.test.factory.media.TestFactoryVideoPlayer //
  ;

}
