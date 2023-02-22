package com.example.payruptask.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/payruptask/overview/ContactListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/payruptask/network/models/Contacts;", "Lcom/example/payruptask/overview/ContactListAdapter$ContactsViewHolder;", "onClickListener", "Lcom/example/payruptask/overview/ContactListAdapter$OnClickListener;", "(Lcom/example/payruptask/overview/ContactListAdapter$OnClickListener;)V", "getOnClickListener", "()Lcom/example/payruptask/overview/ContactListAdapter$OnClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactsViewHolder", "DiffCallback", "OnClickListener", "app_debug"})
public final class ContactListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.payruptask.network.models.Contacts, com.example.payruptask.overview.ContactListAdapter.ContactsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.payruptask.overview.ContactListAdapter.OnClickListener onClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.payruptask.overview.ContactListAdapter.DiffCallback DiffCallback = null;
    
    public ContactListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.payruptask.overview.ContactListAdapter.OnClickListener onClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.payruptask.overview.ContactListAdapter.OnClickListener getOnClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.payruptask.overview.ContactListAdapter.ContactsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.payruptask.overview.ContactListAdapter.ContactsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/payruptask/overview/ContactListAdapter$ContactsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/payruptask/databinding/ContactListViewItemBinding;", "(Lcom/example/payruptask/databinding/ContactListViewItemBinding;)V", "bind", "", "contacts", "Lcom/example/payruptask/network/models/Contacts;", "app_debug"})
    public static final class ContactsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.payruptask.databinding.ContactListViewItemBinding binding;
        
        public ContactsViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.payruptask.databinding.ContactListViewItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts contacts) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/payruptask/overview/ContactListAdapter$OnClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/example/payruptask/network/models/Contacts;", "Lkotlin/ParameterName;", "name", "contacts", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.payruptask.network.models.Contacts, kotlin.Unit> clickListener = null;
        
        public OnClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.payruptask.network.models.Contacts, kotlin.Unit> clickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.payruptask.network.models.Contacts, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts contacts) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/payruptask/overview/ContactListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/payruptask/network/models/Contacts;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.payruptask.network.models.Contacts> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts oldItem, @org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts oldItem, @org.jetbrains.annotations.NotNull()
        com.example.payruptask.network.models.Contacts newItem) {
            return false;
        }
    }
}