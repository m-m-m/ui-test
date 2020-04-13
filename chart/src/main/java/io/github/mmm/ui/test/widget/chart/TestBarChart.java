/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.chart;

import io.github.mmm.ui.api.datatype.chart.UiDataSeries;
import io.github.mmm.ui.api.widget.chart.UiBarChart;

/**
 * Implementation of {@link UiBarChart} for testing.
 *
 * @since 1.0.0
 */
public abstract class TestBarChart extends TestChart<UiDataSeries> implements UiBarChart {

  /**
   * The constructor.
   */
  public TestBarChart() {

    super();
  }

  @Override
  public void setSeriesLabels(String... labels) {

  }

}
