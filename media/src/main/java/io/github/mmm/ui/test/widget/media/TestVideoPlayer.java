/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.media;

import io.github.mmm.ui.api.widget.img.UiImage;
import io.github.mmm.ui.api.widget.media.UiVideoPlayer;

/**
 * Implementation of {@link UiVideoPlayer} for testing.
 *
 * @since 1.0.0
 */
public class TestVideoPlayer extends TestMediaWidget implements UiVideoPlayer {

  private UiImage image;

  /**
   * The constructor.
   */
  public TestVideoPlayer() {

    super();
  }

  @Override
  public UiImage getImage() {

    return this.image;
  }

  @Override
  public void setImage(UiImage image) {

    this.image = image;
  }

}
