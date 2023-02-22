// Generated by data binding compiler. Do not edit!
package com.example.payruptask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.payruptask.R;
import com.example.payruptask.overview.OverviewFragment;
import com.example.payruptask.overview.OverviewViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOverviewBinding extends ViewDataBinding {
  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView address;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView addressTV;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView company;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView companyTV;

  @NonNull
  public final RecyclerView contactListAction;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView phone;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView phoneTV;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView selectContact;

  @NonNull
  public final ImageView statusImage;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView username;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView usernameTV;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView website;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView websiteTV;

  @Bindable
  protected OverviewFragment mOverview;

  @Bindable
  protected OverviewViewModel mViewModel;

  protected FragmentOverviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView address, TextView addressTV, TextView company, TextView companyTV,
      RecyclerView contactListAction, TextView phone, TextView phoneTV, TextView selectContact,
      ImageView statusImage, TextView username, TextView usernameTV, TextView website,
      TextView websiteTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.addressTV = addressTV;
    this.company = company;
    this.companyTV = companyTV;
    this.contactListAction = contactListAction;
    this.phone = phone;
    this.phoneTV = phoneTV;
    this.selectContact = selectContact;
    this.statusImage = statusImage;
    this.username = username;
    this.usernameTV = usernameTV;
    this.website = website;
    this.websiteTV = websiteTV;
  }

  public abstract void setOverview(@Nullable OverviewFragment overview);

  @Nullable
  public OverviewFragment getOverview() {
    return mOverview;
  }

  public abstract void setViewModel(@Nullable OverviewViewModel viewModel);

  @Nullable
  public OverviewViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_overview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOverviewBinding>inflateInternal(inflater, R.layout.fragment_overview, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_overview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOverviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOverviewBinding>inflateInternal(inflater, R.layout.fragment_overview, null, false, component);
  }

  public static FragmentOverviewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentOverviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOverviewBinding)bind(component, view, R.layout.fragment_overview);
  }
}