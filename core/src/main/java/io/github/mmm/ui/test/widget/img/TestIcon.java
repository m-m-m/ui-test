/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.img;

import io.github.mmm.ui.api.widget.img.UiIcon;

/**
 * Implementation of {@link UiIcon} for testing.
 *
 * @since 1.0.0
 */
public class TestIcon extends TestAbstractImage implements UiIcon {

  private String iconId;

  private double size;

  /**
   * The constructor.
   */
  public TestIcon() {

    super();
    this.size = 1;
  }

  @Override
  public String getIconId() {

    return this.iconId;
  }

  @Override
  public void setIconId(String iconId) {

    this.iconId = iconId;
  }

  @Override
  public double getSize() {

    return this.size;
  }

  @Override
  public void setSize(double size) {

    if (size <= 0) {
      size = 1;
    }
    this.size = size;
  }

}
