/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.img;

import io.github.mmm.ui.api.UiScreen;
import io.github.mmm.ui.api.datatype.UiSize;
import io.github.mmm.ui.api.widget.img.UiImage;

/**
 * Implementation of {@link UiImage} for testing.
 *
 * @since 1.0.0
 */
public class TestImage extends TestAbstractImage implements UiImage {

  private String source;

  private UiSize width;

  private UiSize height;

  /**
   * The constructor.
   */
  public TestImage() {

    super();
    this.width = UiSize.AUTO;
    this.height = UiSize.AUTO;
  }

  @Override
  public String getSource() {

    return this.source;
  }

  @Override
  public void setSource(String source) {

    this.source = source;
  }

  @Override
  public UiSize getWidth() {

    return this.width;
  }

  @Override
  public double getWidthInPixel() {

    return this.width.toPixel(UiScreen.get().getWidthInPixel());
  }

  @Override
  public void setWidth(UiSize width) {

    this.width = width;
  }

  @Override
  public UiSize getHeight() {

    return this.height;
  }

  @Override
  public double getHeightInPixel() {

    return this.height.toPixel(UiScreen.get().getHeightInPixel());
  }

  @Override
  public void setHeight(UiSize height) {

    this.height = height;
  }

}
