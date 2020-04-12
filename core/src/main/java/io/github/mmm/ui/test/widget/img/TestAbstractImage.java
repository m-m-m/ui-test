/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.img;

import io.github.mmm.ui.api.widget.img.UiAbstractImage;
import io.github.mmm.ui.test.widget.TestWidget;

/**
 * Implementation of {@link UiAbstractImage} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractImage extends TestWidget implements UiAbstractImage {

  private String altText;

  /**
   * The constructor.
   */
  public TestAbstractImage() {

    super();
  }

  @Override
  public String getAltText() {

    return this.altText;
  }

  @Override
  public void setAltText(String altText) {

    this.altText = altText;
  }

}
