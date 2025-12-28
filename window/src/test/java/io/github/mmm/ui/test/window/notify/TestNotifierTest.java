/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.window.notify;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.ui.api.notify.UiNotification;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.UiText;
import io.github.mmm.ui.api.widget.panel.UiHorizontalPanel;
import io.github.mmm.ui.api.widget.window.UiPopup;
import io.github.mmm.ui.api.window.notiy.UiPopupNotifier;

/**
 * Test of {@link TestNotifier}.
 */
public class TestNotifierTest extends Assertions {

  /** Test of {@link TestNotifier#createPopupOk(io.github.mmm.ui.api.notify.UiNotification)}. */
  @Test
  public void testCreatePopup() {

    // arrange
    UiNotification notification = UiNotification.ofInfo("Hello World!", "Cool Title");
    // act
    UiPopup popup = UiPopupNotifier.get().createPopupOk(notification);
    // assert
    assertThat(popup).isNotNull();
    assertThat(popup.isVisible()).isFalse();
    assertThat(popup.getTitle()).isEqualTo(notification.getTitle());
    UiRegularWidget child0 = popup.getChild(0);
    assertThat(child0).isInstanceOf(UiHorizontalPanel.class);
    UiRegularWidget child0_1 = ((UiHorizontalPanel) child0).getChild(1);
    assertThat(child0_1).isInstanceOf(UiText.class);
    UiText text = (UiText) child0_1;
    assertThat(text.getText()).isEqualTo(notification.getMessage());
  }

}
