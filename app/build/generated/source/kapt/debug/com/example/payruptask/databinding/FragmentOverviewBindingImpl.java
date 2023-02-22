package com.example.payruptask.databinding;
import com.example.payruptask.R;
import com.example.payruptask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOverviewBindingImpl extends FragmentOverviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOverviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentOverviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , null
            , null
            , null
            , null
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , null
            , null
            , null
            , (android.widget.ImageView) bindings[2]
            , null
            , null
            , null
            , null
            );
        this.contactListAction.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelContacts((androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContacts(androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>> ViewModelContacts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.util.List<com.example.payruptask.network.models.Contacts> viewModelContactsGetValue = null;
        androidx.lifecycle.LiveData<com.example.payruptask.overview.ContactsAPIStatus> viewModelStatus = null;
        androidx.lifecycle.LiveData<java.util.List<com.example.payruptask.network.models.Contacts>> viewModelContacts = null;
        com.example.payruptask.overview.ContactsAPIStatus viewModelStatusGetValue = null;
        com.example.payruptask.overview.OverviewViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contacts
                        viewModelContacts = viewModel.getContacts();
                    }
                    updateLiveDataRegistration(1, viewModelContacts);


                    if (viewModelContacts != null) {
                        // read viewModel.contacts.getValue()
                        viewModelContactsGetValue = viewModelContacts.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.example.payruptask.Binding_AdaptersKt.bindAnimationRecyclerView(this.contactListAction, viewModelContactsGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.payruptask.Binding_AdaptersKt.bindStatus(this.statusImage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.contacts
        flag 2 (0x3L): overview
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}