/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.button;

import io.github.mmm.ui.api.widget.button.UiAbstractButton;
import io.github.mmm.ui.api.widget.img.UiAbstractImage;
import io.github.mmm.ui.test.widget.TestClickableWidget;

/**
 * Implementation of {@link UiAbstractButton} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestAbstractButton extends TestClickableWidget implements UiAbstractButton {

  private UiAbstractImage icon;

  /**
   * The constructor.
   */
  public TestAbstractButton() {

    super();
  }

  @Override
  public UiAbstractImage getImage() {

    return this.icon;
  }

  @Override
  public void setImage(UiAbstractImage icon) {

    this.icon = icon;
  }

}
