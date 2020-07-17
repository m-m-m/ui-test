/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.attribute.AttributeWritePlaceholder;
import io.github.mmm.ui.api.datatype.bitmask.BitMask;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.form.UiInputContainer;
import io.github.mmm.ui.api.widget.input.UiInput;
import io.github.mmm.ui.test.widget.TestActiveValidatableWidget;
import io.github.mmm.ui.test.widget.TestLabel;

/**
 * Implementation of {@link UiInput} using JavaFx.
 *
 * @param <V> type of {@link #getValue() value}.
 * @since 1.0.0
 */
public abstract class TestInput<V> extends TestActiveValidatableWidget<V>
    implements UiInput<V>, AttributeWritePlaceholder {

  private String name;

  private TestLabel nameWidget;

  private UiInputContainer<V> containerWidget;

  private String placeholder;

  private String prefix;

  private String suffix;

  /**
   * The constructor.
   */
  public TestInput() {

    super();
  }

  @Override
  public String getName() {

    if (this.nameWidget == null) {
      return this.name;
    } else {
      return this.nameWidget.getText();
    }
  }

  @Override
  public void setName(String name) {

    if (this.nameWidget == null) {
      this.name = name;
    } else {
      this.nameWidget.setText(name);
    }
  }

  @Override
  public boolean hasNameWidget() {

    return (this.nameWidget != null);
  }

  @Override
  public TestLabel getNameWidget() {

    if (this.nameWidget == null) {
      this.nameWidget = new TestLabel();
      if (this.name != null) {
        this.nameWidget.setText(this.name);
      }
      if (getValidator().isMandatory()) {
        this.nameWidget.getStyles().add(STYLE_MANDATORY);
      }
      doSetVisibleState(this.nameWidget, doGetVisibleState(this));
      String id = getId();
      if (id != null) {
        this.nameWidget.setId(id + "_label");
      }
    }
    return this.nameWidget;
  }

  @Override
  public boolean hasContainerWidget() {

    return (this.containerWidget != null);
  }

  @Override
  public UiRegularWidget getContainerWidget() {

    if (this.containerWidget == null) {
      this.containerWidget = UiInputContainer.of(this);
    }
    return this.containerWidget;
  }

  @Override
  public String getPrefix() {

    return this.prefix;
  }

  @Override
  public void setPrefix(String prefix) {

    this.prefix = prefix;
  }

  @Override
  public String getSuffix() {

    return this.suffix;
  }

  @Override
  public void setSuffix(String suffix) {

    this.suffix = suffix;
  }

  @Override
  public void setVisible(boolean visible, BitMask flagMode) {

    super.setVisible(visible, flagMode);
    if (this.nameWidget != null) {
      this.nameWidget.setVisible(visible, flagMode);
    }
  }

  @Override
  protected void setMandatory(boolean mandatory) {

    super.setMandatory(mandatory);
    if (this.nameWidget != null) {
      if (mandatory) {
        this.nameWidget.getStyles().add(STYLE_MANDATORY);
      } else {
        this.nameWidget.getStyles().remove(STYLE_MANDATORY);
      }
    }
  }

  @Override
  public String getPlaceholder() {

    return this.placeholder;
  }

  @Override
  public void setPlaceholder(String placeholder) {

    this.placeholder = placeholder;
  }

}
