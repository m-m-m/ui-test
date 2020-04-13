/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.factory.chart;

import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.widget.chart.UiLineChart;
import io.github.mmm.ui.test.widget.chart.TestLineChart;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiLineChart}.
 *
 * @since 1.0.0
 */
public class TestFactoryLineChart implements UiSingleWidgetFactoryNative<UiLineChart> {

  @Override
  public Class<UiLineChart> getType() {

    return UiLineChart.class;
  }

  @Override
  public UiLineChart create() {

    return new TestLineChart();
  }

}
