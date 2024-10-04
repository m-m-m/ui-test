/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import io.github.mmm.base.exception.ObjectMismatchException;
import io.github.mmm.base.exception.ObjectNotFoundException;
import io.github.mmm.base.sort.SortOrder;
import io.github.mmm.bean.ReadableBean;
import io.github.mmm.property.ReadableProperty;
import io.github.mmm.ui.api.UiLocalizer;
import io.github.mmm.ui.api.widget.data.UiColumn;
import io.github.mmm.ui.api.widget.data.UiDataTable;
import io.github.mmm.ui.test.widget.TestActiveValidatableWidget;
import io.github.mmm.value.PropertyPath;
import io.github.mmm.value.SimplePath;

/**
 * Implementation of {@link UiDataTable} for JavaFx.
 *
 * @param <R> type of the data for the rows displayed by this widget. Typically a {@link io.github.mmm.bean.Bean}.
 * @since 1.0.0
 */
public class TestDataList<R> extends TestActiveValidatableWidget<List<R>> implements UiDataTable<R> {

  private final List<TestTableColumn<R, ?>> columns;

  private R rowTemplate;

  private boolean showRowNumbers;

  private R selection;

  private List<R> selections;

  private boolean multiSelection;

  /**
   * The constructor.
   */
  public TestDataList() {

    super();
    this.columns = new ArrayList<>();
  }

  @Override
  public void setRowTemplate(R rowTemplate) {

    this.rowTemplate = rowTemplate;
  }

  @Override
  public <V> UiColumn<R, V> createColumn(PropertyPath<V> property) {

    assert verifyProperty(property);
    String title = UiLocalizer.get().localize(property.getName());
    TestTableColumn<R, V> column = createColumn(title);
    column.setProperty(property);
    return column;
  }

  private <V> boolean verifyProperty(PropertyPath<V> property) {

    Objects.requireNonNull(property, "property");
    Objects.requireNonNull(this.rowTemplate, "rowTemplate");
    if (this.rowTemplate instanceof ReadableBean) {
      ReadableBean bean = (ReadableBean) this.rowTemplate;
      String name = property.getName();
      ReadableProperty<?> beanProperty = bean.getProperty(name);
      if (beanProperty == null) {
        throw new ObjectNotFoundException("rowTemplate.Property", name);
      }
      if (!(property instanceof SimplePath)) {
        Class<V> valueClass = property.getValueClass();
        if (!Objects.equals(valueClass, beanProperty.getValueClass())) {
          throw new ObjectMismatchException(name + ".valueClass=" + beanProperty.getValueClass(), valueClass);
        }
      }
    } else {
      throw new IllegalStateException("Invalid rowTemplate: " + this.rowTemplate.getClass().getName());
    }
    return true;
  }

  @Override
  public <V> UiColumn<R, V> createColumn(String title, ColumnAdapter<R, V> adapter) {

    TestTableColumn<R, V> column = createColumn(title);
    column.setAdapter(adapter);
    return column;
  }

  private <V> TestTableColumn<R, V> createColumn(String title) {

    TestTableColumn<R, V> column = new TestTableColumn<>();
    column.setTitle(title);
    return column;
  }

  @Override
  public int getColumnCount() {

    return this.columns.size();
  }

  @Override
  public UiColumn<R, ?> getColumn(int index) {

    return this.columns.get(index);
  }

  @Override
  public void addColumn(UiColumn<R, ?> column, int index) {

    TestTableColumn<R, ?> fxColumn = (TestTableColumn<R, ?>) column;
    if (index == -1) {
      this.columns.add(fxColumn);
    } else {
      this.columns.add(index, fxColumn);
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public void sort(SortOrder order, UiColumn<R, ?>... sortColumns) {

    // TODO
    for (int i = sortColumns.length - 1; i >= 0; i--) {
      TestTableColumn<R, ?> column = (TestTableColumn<R, ?>) sortColumns[i];
      // column.setSortComparator(sortComparator);
    }
  }

  @Override
  public void setFilterHandler(FilterHandler<R> filterHandler) {

    // TODO Auto-generated method stub

  }

  @Override
  public boolean isShowRowNumbers() {

    return this.showRowNumbers;
  }

  @Override
  public void setShowRowNumbers(boolean showRowNumbers) {

    this.showRowNumbers = showRowNumbers;
  }

  @Override
  public R getSelection() {

    return this.selection;
  }

  @Override
  public void setSelection(R selection) {

    this.selection = selection;
  }

  @Override
  public List<R> getSelections() {

    return this.selections;
  }

  @Override
  public void setSelections(Collection<R> selection) {

    this.selections.clear();
    this.selections.addAll(selection);
  }

  @Override
  public boolean isMultiSelection() {

    return this.multiSelection;
  }

  @Override
  public void setMultiSelection(boolean multiSelection) {

    this.multiSelection = multiSelection;
  }

}
