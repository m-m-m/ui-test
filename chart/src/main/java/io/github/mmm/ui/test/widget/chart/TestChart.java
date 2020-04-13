/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.chart;

import io.github.mmm.base.placement.Direction;
import io.github.mmm.ui.api.datatype.chart.UiDataSet;
import io.github.mmm.ui.api.widget.chart.UiChart;
import io.github.mmm.ui.test.widget.TestWidget;

/**
 * Implementation of {@link UiChart} for testing.
 *
 * @param <D> type of the chart {@link io.github.mmm.ui.api.datatype.chart.UiDataSet#getData() data}.
 * @since 1.0.0
 */
public abstract class TestChart<D> extends TestWidget implements UiChart<D> {

  private Direction legendPlacement;

  private String title;

  /**
   * The constructor.
   */
  public TestChart() {

    super();
    setLegendPlacement(Direction.DOWN);
  }

  @Override
  public String getTitle() {

    return this.title;
  }

  @Override
  public void setTitle(String title) {

    this.title = title;
  }

  @Override
  public Direction getLegnedPlacement() {

    return this.legendPlacement;
  }

  @Override
  public void setLegendPlacement(Direction placement) {

    this.legendPlacement = placement;
  }

  @SuppressWarnings("unchecked")
  @Override
  public void setData(UiDataSet<D>... dataSets) {

  }

}
