package com.example.payruptask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"bindAddress", "", "textView", "Landroid/widget/TextView;", "data", "Lcom/example/payruptask/network/models/Contacts;", "bindAnimationRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "bindCompany", "bindStatus", "statusImageView", "Landroid/widget/ImageView;", "status", "Lcom/example/payruptask/overview/ContactsAPIStatus;", "app_debug"})
public final class Binding_AdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindAnimationRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.payruptask.network.models.Contacts> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.example.payruptask.overview.ContactsAPIStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"addressData"})
    public static final void bindAddress(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    com.example.payruptask.network.models.Contacts data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"companyData"})
    public static final void bindCompany(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    com.example.payruptask.network.models.Contacts data) {
    }
}