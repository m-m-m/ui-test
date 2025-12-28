/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.ui.api.UiToggleGroup;
import io.github.mmm.ui.api.event.UiEvent;
import io.github.mmm.ui.api.event.UiValueChangeEvent;
import io.github.mmm.ui.api.widget.input.UiRadioButton;
import io.github.mmm.ui.test.event.TestEventListener;

/**
 * Test of {@link TestRadioButton}.
 */
class TestRadioButtonTest extends Assertions {

  /**
   * Test of {@link TestRadioButton}s with {@link UiToggleGroup}.
   */
  @Test
  void testToggleGroup() {

    UiRadioButton option1 = UiRadioButton.of("option1");
    UiRadioButton option2 = UiRadioButton.of("option2");
    TestEventListener listener = new TestEventListener();
    option1.addListener(listener);
    option2.addListener(listener);
    UiToggleGroup group = UiToggleGroup.of();
    option1.setToggleGroup(group);
    option2.setToggleGroup(group);
    assertThat(option1.isSelected()).isFalse();
    assertThat(option2.isSelected()).isFalse();
    assertThat(listener.getEvents()).isEmpty();
    // act
    option1.setSelected(true);
    // assert
    assertThat(listener.getEvents()).hasSize(1);
    UiEvent event = listener.getLastEvent();
    assertThat(event.getType()).isEqualTo(UiValueChangeEvent.TYPE);
    assertThat(event.getSource()).isSameAs(option1);
    assertThat(option1.isSelected()).isTrue();
    assertThat(option2.isSelected()).isFalse();
    listener.clear();
    // act again
    option2.setSelected(true);
    // assert
    assertThat(listener.getEvents()).hasSize(2);
    event = listener.getEvents().get(0);
    assertThat(event.getType()).isEqualTo(UiValueChangeEvent.TYPE);
    assertThat(event.getSource()).isSameAs(option2);
    event = listener.getEvents().get(1);
    assertThat(event.getType()).isEqualTo(UiValueChangeEvent.TYPE);
    assertThat(event.getSource()).isSameAs(option1);
    assertThat(option1.isSelected()).isFalse();
    assertThat(option2.isSelected()).isTrue();
  }

}
