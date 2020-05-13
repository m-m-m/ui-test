/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.link;

import io.github.mmm.ui.api.widget.link.UiAbstractLink;
import io.github.mmm.ui.api.widget.link.UiExternalLink;

/**
 * Implementation of {@link UiAbstractLink} for testing.
 *
 * @since 1.0.0
 */
public class TestExternalLink extends TestAbstractLink implements UiExternalLink {

  private String url;

  /**
   * The constructor.
   */
  public TestExternalLink() {

    super();
  }

  @Override
  public String getUrl() {

    return this.url;
  }

  @Override
  public void setUrl(String url) {

    this.url = url;
  }

}
