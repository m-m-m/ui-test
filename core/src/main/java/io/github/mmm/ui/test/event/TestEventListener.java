/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.event;

import java.util.ArrayList;
import java.util.List;

import io.github.mmm.ui.api.event.UiEvent;
import io.github.mmm.ui.api.event.UiEventListener;

/**
 * Implementation of {@link UiEventListener} for testing.
 *
 * @since 1.0.0
 */
public class TestEventListener implements UiEventListener {

  private final List<UiEvent> events;

  /**
   * The constructor.
   */
  public TestEventListener() {

    super();
    this.events = new ArrayList<>();
  }

  /**
   * @return the {@link List} of the received {@link UiEvent}s.
   */
  public List<UiEvent> getEvents() {

    return this.events;
  }

  /**
   * @return the last {@link UiEvent} that has been received or {@code null} if no event was received.
   */
  public UiEvent getLastEvent() {

    int size = this.events.size();
    if (size == 0) {
      return null;
    }
    return this.events.get(size - 1);
  }

  @Override
  public void onEvent(UiEvent event) {

    this.events.add(event);
  }

  /**
   * {@link List#clear() Clears} the event {@link List}.
   */
  public void clear() {

    this.events.clear();
  }

}
