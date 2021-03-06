/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.media;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.media.UiVideoPlayer;
import io.github.mmm.ui.test.widget.media.TestVideoPlayer;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiVideoPlayer}.
 *
 * @since 1.0.0
 */
public class TestFactoryVideoPlayer implements UiSingleWidgetFactoryNative<UiVideoPlayer> {

  @Override
  public Class<UiVideoPlayer> getType() {

    return UiVideoPlayer.class;
  }

  @Override
  public UiVideoPlayer create() {

    return new TestVideoPlayer();
  }

}
