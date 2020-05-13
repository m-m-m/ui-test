/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.button;

import io.github.mmm.ui.api.widget.button.UiLink;

/**
 * Implementation of {@link UiLink} for testing.
 *
 * @since 1.0.0
 */
public class TestLink extends TestAbstractButton implements UiLink {

  private String href;

  /**
   * The constructor.
   */
  public TestLink() {

    super();
  }

  @Override
  public String getHref() {

    return this.href;
  }

  @Override
  public void setHref(String href) {

    this.href = href;
  }

}
