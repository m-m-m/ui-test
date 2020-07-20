/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the implementation of UI chart widgets for testing.
 *
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative
 */
@SuppressWarnings("rawtypes") //
module io.github.mmm.ui.test.chart {

  requires transitive io.github.mmm.ui.api.chart;

  requires transitive io.github.mmm.ui.test.core;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative with //
      io.github.mmm.ui.test.factory.chart.TestFactoryBarChartVertical, //
      io.github.mmm.ui.test.factory.chart.TestFactoryBarChartHorizontal, //
      io.github.mmm.ui.test.factory.chart.TestFactoryLineChart, //
      io.github.mmm.ui.test.factory.chart.TestFactoryPieChart;

  exports io.github.mmm.ui.test.widget.chart;

}
