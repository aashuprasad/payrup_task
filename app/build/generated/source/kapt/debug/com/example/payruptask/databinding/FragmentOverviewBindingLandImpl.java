package com.example.payruptask.databinding;
import com.example.payruptask.R;
import com.example.payruptask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOverviewBindingLandImpl extends FragmentOverviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.selectContact, 8);
        sViewsWithIds.put(R.id.username, 9);
        sViewsWithIds.put(R.id.phone, 10);
        sViewsWithIds.put(R.id.address, 11);
        sViewsWithIds.put(R.id.website, 12);
        sViewsWithIds.put(R.id.company, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOverviewBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentOverviewBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            );
        this.addressTV.setTag(null);
        this.companyTV.setTag(null);
        this.contactListAction.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.phoneTV.setTag(null);
        this.statusImage.setTag(null);
        this.usernameTV.setTag(null);
        this.websiteTV.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.overview == variableId) {
            setOverview((com.example.payruptask.overview.OverviewFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.payruptask.overview.OverviewViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOverview(@Nullable com.example.payruptask.overview.OverviewFragment Overview) {
        this.mOverview = Overview;
    }
    public void setViewModel(@Nullable com.example.payruptask.overview.OverviewViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContacts((androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>>) object, fieldId);
            case 1 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus>) object, fieldId);
            case 2 :
                return onChangeViewModelNavigateToSelectedContact((androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelContacts(androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>> ViewModelContacts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNavigateToSelectedContact(androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts> ViewModelNavigateToSelectedContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>> viewModelContacts = null;
        com.example.payruptask.network.models.Company viewModelNavigateToSelectedContactComponent2 = null;
        java.lang.String viewModelNavigateToSelectedContactComponent1ToString = null;
        java.lang.String viewModelNavigateToSelectedContactComponent6 = null;
        java.lang.String viewModelNavigateToSelectedContactComponent8 = null;
        java.util.List<com.example.payruptask.network.models.Contacts> viewModelContactsGetValue = null;
        androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus> viewModelStatus = null;
        com.example.payruptask.network.models.Contacts viewModelNavigateToSelectedContactGetValue = null;
        androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts> viewModelNavigateToSelectedContact = null;
        com.example.payruptask.network.models.Address viewModelNavigateToSelectedContactComponent1 = null;
        com.example.payruptask.overview.ContactsAPIStatus viewModelStatusGetValue = null;
        java.lang.String viewModelNavigateToSelectedContactComponent2ToString = null;
        com.example.payruptask.overview.OverviewViewModel viewModel = mViewModel;
        java.lang.String viewModelNavigateToSelectedContactComponent5 = null;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contacts
                        viewModelContacts = viewModel.getContacts();
                    }
                    updateLiveDataRegistration(0, viewModelContacts);


                    if (viewModelContacts != null) {
                        // read viewModel.contacts.getValue()
                        viewModelContactsGetValue = viewModelContacts.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(1, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.navigateToSelectedContact
                        viewModelNavigateToSelectedContact = viewModel.getNavigateToSelectedContact();
                    }
                    updateLiveDataRegistration(2, viewModelNavigateToSelectedContact);


                    if (viewModelNavigateToSelectedContact != null) {
                        // read viewModel.navigateToSelectedContact.getValue()
                        viewModelNavigateToSelectedContactGetValue = viewModelNavigateToSelectedContact.getValue();
                    }


                    if (viewModelNavigateToSelectedContactGetValue != null) {
                        // read viewModel.navigateToSelectedContact.getValue().component2()
                        viewModelNavigateToSelectedContactComponent2 = viewModelNavigateToSelectedContactGetValue.component2();
                        // read viewModel.navigateToSelectedContact.getValue().component6()
                        viewModelNavigateToSelectedContactComponent6 = viewModelNavigateToSelectedContactGetValue.component6();
                        // read viewModel.navigateToSelectedContact.getValue().component8()
                        viewModelNavigateToSelectedContactComponent8 = viewModelNavigateToSelectedContactGetValue.component8();
                        // read viewModel.navigateToSelectedContact.getValue().component1()
                        viewModelNavigateToSelectedContactComponent1 = viewModelNavigateToSelectedContactGetValue.component1();
                        // read viewModel.navigateToSelectedContact.getValue().component5()
                        viewModelNavigateToSelectedContactComponent5 = viewModelNavigateToSelectedContactGetValue.component5();
                    }


                    if (viewModelNavigateToSelectedContactComponent2 != null) {
                        // read viewModel.navigateToSelectedContact.getValue().component2().toString()
                        viewModelNavigateToSelectedContactComponent2ToString = viewModelNavigateToSelectedContactComponent2.toString();
                    }
                    if (viewModelNavigateToSelectedContactComponent1 != null) {
                        // read viewModel.navigateToSelectedContact.getValue().component1().toString()
                        viewModelNavigateToSelectedContactComponent1ToString = viewModelNavigateToSelectedContactComponent1.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressTV, viewModelNavigateToSelectedContactComponent2ToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.companyTV, viewModelNavigateToSelectedContactComponent1ToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phoneTV, viewModelNavigateToSelectedContactComponent6);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.usernameTV, viewModelNavigateToSelectedContactComponent5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.websiteTV, viewModelNavigateToSelectedContactComponent8);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.example.payruptask.Binding_AdaptersKt.bindAnimationRecyclerView(this.contactListAction, viewModelContactsGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.example.payruptask.Binding_AdaptersKt.bindStatus(this.statusImage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contacts
        flag 1 (0x2L): viewModel.status
        flag 2 (0x3L): viewModel.navigateToSelectedContact
        flag 3 (0x4L): overview
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}