/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.chart;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.chart.UiPieChart;
import io.github.mmm.ui.test.widget.chart.TestPieChart;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiPieChart}.
 *
 * @since 1.0.0
 */
public class TestFactoryPieChart implements UiSingleWidgetFactoryNative<UiPieChart> {

  @Override
  public Class<UiPieChart> getType() {

    return UiPieChart.class;
  }

  @Override
  public UiPieChart create() {

    return new TestPieChart();
  }

}
