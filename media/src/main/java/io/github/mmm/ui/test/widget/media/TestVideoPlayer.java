/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.media;

import io.github.mmm.ui.api.widget.img.UiAbstractImage;
import io.github.mmm.ui.api.widget.media.UiVideoPlayer;

/**
 * Implementation of {@link UiVideoPlayer} for testing.
 *
 * @since 1.0.0
 */
public class TestVideoPlayer extends TestMediaWidget implements UiVideoPlayer {

  private UiAbstractImage image;

  /**
   * The constructor.
   */
  public TestVideoPlayer() {

    super();
  }

  @Override
  public UiAbstractImage getImage() {

    return this.image;
  }

  @Override
  public void setImage(UiAbstractImage image) {

    this.image = image;
  }

}
