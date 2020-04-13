/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.media;

import io.github.mmm.ui.api.datatype.media.UiMedia;
import io.github.mmm.ui.api.widget.media.UiMediaWidget;
import io.github.mmm.ui.test.widget.TestActiveWidget;

/**
 * Implementation of {@link UiMediaWidget} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestMediaWidget extends TestActiveWidget implements UiMediaWidget {

  private UiMedia media;

  private boolean playing;

  private double volume;

  private boolean muted;

  private double position;

  private double duration;

  /**
   * The constructor.
   */
  public TestMediaWidget() {

    super();
  }

  @Override
  public UiMedia getMedia() {

    return this.media;
  }

  @Override
  public void setMedia(UiMedia media) {

    this.media = media;
  }

  @Override
  public boolean isPlaying() {

    return this.playing;
  }

  @Override
  public void setPlaying(boolean playing) {

    this.playing = playing;
  }

  @Override
  public double getVolume() {

    return this.volume;
  }

  @Override
  public void setVolume(double volume) {

    this.volume = volume;
  }

  @Override
  public boolean isMuted() {

    return this.muted;
  }

  @Override
  public void setMuted(boolean muted) {

    this.muted = muted;
  }

  @Override
  public double getPosition() {

    return this.position;
  }

  @Override
  public void setPosition(double position) {

    this.position = position;
  }

  @Override
  public double getDuration() {

    return this.duration;
  }

}
