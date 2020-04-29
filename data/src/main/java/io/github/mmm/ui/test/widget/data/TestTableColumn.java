/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.data;

import java.util.Comparator;

import io.github.mmm.base.sort.SortOrder;
import io.github.mmm.ui.api.widget.data.UiAbstractDataWidget.ColumnAdapter;
import io.github.mmm.ui.api.widget.data.UiColumn;
import io.github.mmm.ui.test.widget.TestWidget;
import io.github.mmm.value.PropertyPath;

/**
 * Implementation of {@link UiColumn} for JavaFx.
 *
 * @param <R> type of the row data. Typically a {@link io.github.mmm.bean.Bean}.
 * @param <V> type of the value for the cells in this column.
 * @since 1.0.0
 */
public class TestTableColumn<R, V> extends TestWidget implements UiColumn<R, V> {

  private ColumnAdapter<R, V> adapter;

  private PropertyPath<V> property;

  private boolean filtering;

  private String title;

  private boolean resizable;

  private SortOrder sortOrder;

  private Comparator<V> sortComparator;

  /**
   * The constructor.
   */
  public TestTableColumn() {

    super();
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
  public boolean isResizable() {

    return this.resizable;
  }

  @Override
  public void setResizable(boolean resizable) {

    this.resizable = resizable;
  }

  @Override
  public boolean isFiltering() {

    return this.filtering;
  }

  @Override
  public void setFiltering(boolean filtering) {

    if (this.filtering == filtering) {
      return;
    }
    // TODO: implement filter and show/hide here...
    this.filtering = filtering;
  }

  @Override
  public String getFilterText() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SortOrder getSortOrder() {

    return this.sortOrder;
  }

  @Override
  public Comparator<V> getSortComparator() {

    return this.sortComparator;
  }

  @Override
  public void setSortComparator(Comparator<V> sortComparator) {

    this.sortComparator = sortComparator;
  }

  /**
   * @param property the {@link PropertyPath property} to bind to this column.
   */
  public void setProperty(PropertyPath<V> property) {

    this.property = property;
  }

  /**
   * @param adapter the {@link io.github.mmm.ui.api.widget.data.UiAbstractDataWidget.ColumnAdapter}.
   */
  public void setAdapter(ColumnAdapter<R, V> adapter) {

    this.adapter = adapter;
  }

}
