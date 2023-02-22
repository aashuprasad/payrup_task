package com.example.payruptask.databinding;
import com.example.payruptask.R;
import com.example.payruptask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.username, 6);
        sViewsWithIds.put(R.id.phone, 7);
        sViewsWithIds.put(R.id.address, 8);
        sViewsWithIds.put(R.id.website, 9);
        sViewsWithIds.put(R.id.company, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            );
        this.addressTV.setTag(null);
        this.companyTV.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.phoneTV.setTag(null);
        this.usernameTV.setTag(null);
        this.websiteTV.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.payruptask.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.payruptask.detail.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedContact((androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectedContact(androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts> ViewModelSelectedContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelSelectedContactComponent6 = null;
        java.lang.String viewModelSelectedContactComponent5 = null;
        com.example.payruptask.network.models.Contacts viewModelSelectedContactGetValue = null;
        androidx.lifecycle.LiveData<com.example.payruptask.network.models.Contacts> viewModelSelectedContact = null;
        com.example.payruptask.detail.DetailViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedContactComponent8 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedContact
                    viewModelSelectedContact = viewModel.getSelectedContact();
                }
                updateLiveDataRegistration(0, viewModelSelectedContact);


                if (viewModelSelectedContact != null) {
                    // read viewModel.selectedContact.getValue()
                    viewModelSelectedContactGetValue = viewModelSelectedContact.getValue();
                }


                if (viewModelSelectedContactGetValue != null) {
                    // read viewModel.selectedContact.getValue().component6()
                    viewModelSelectedContactComponent6 = viewModelSelectedContactGetValue.component6();
                    // read viewModel.selectedContact.getValue().component5()
                    viewModelSelectedContactComponent5 = viewModelSelectedContactGetValue.component5();
                    // read viewModel.selectedContact.getValue().component8()
                    viewModelSelectedContactComponent8 = viewModelSelectedContactGetValue.component8();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.payruptask.Binding_AdaptersKt.bindAddress(this.addressTV, viewModelSelectedContactGetValue);
            com.example.payruptask.Binding_AdaptersKt.bindCompany(this.companyTV, viewModelSelectedContactGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phoneTV, viewModelSelectedContactComponent6);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.usernameTV, viewModelSelectedContactComponent5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.websiteTV, viewModelSelectedContactComponent8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedContact
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}