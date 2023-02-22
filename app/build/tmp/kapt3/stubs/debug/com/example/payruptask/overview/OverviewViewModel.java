package com.example.payruptask.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/example/payruptask/overview/OverviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_contacts", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/payruptask/network/models/Contacts;", "_navigateToSelectedContact", "_status", "Lcom/example/payruptask/overview/ContactsAPIStatus;", "contacts", "Landroidx/lifecycle/LiveData;", "getContacts", "()Landroidx/lifecycle/LiveData;", "navigateToSelectedContact", "getNavigateToSelectedContact", "status", "getStatus", "displayContactDetails", "", "contact", "displayContactDetailsComplete", "getContactsProperties", "app_debug"})
public final class OverviewViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.payruptask.overview.ContactsAPIStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.payruptask.network.models.Contacts>> _contacts = null;
    private final androidx.lifecycle.MutableLiveData<com.example.payruptask.network.models.Contacts> _navigateToSelectedContact = null;
    
    public OverviewViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts> getNavigateToSelectedContact() {
        return null;
    }
    
    private final void getContactsProperties() {
    }
    
    public final void displayContactDetails(@org.jetbrains.annotations.NotNull()
    com.example.payruptask.network.models.Contacts contact) {
    }
    
    public final void displayContactDetailsComplete() {
    }
}