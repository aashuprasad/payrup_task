package com.example.payruptask.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.payruptask.network.models.Contacts;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selectedContact")) {
      Contacts selectedContact;
      if (Parcelable.class.isAssignableFrom(Contacts.class) || Serializable.class.isAssignableFrom(Contacts.class)) {
        selectedContact = (Contacts) bundle.get("selectedContact");
      } else {
        throw new UnsupportedOperationException(Contacts.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedContact", selectedContact);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedContact\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    if (savedStateHandle.contains("selectedContact")) {
      Contacts selectedContact;
      selectedContact = savedStateHandle.get("selectedContact");
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedContact", selectedContact);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedContact\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Contacts getSelectedContact() {
    return (Contacts) arguments.get("selectedContact");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("selectedContact")) {
      Contacts selectedContact = (Contacts) arguments.get("selectedContact");
      if (Parcelable.class.isAssignableFrom(Contacts.class) || selectedContact == null) {
        __result.putParcelable("selectedContact", Parcelable.class.cast(selectedContact));
      } else if (Serializable.class.isAssignableFrom(Contacts.class)) {
        __result.putSerializable("selectedContact", Serializable.class.cast(selectedContact));
      } else {
        throw new UnsupportedOperationException(Contacts.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("selectedContact")) {
      Contacts selectedContact = (Contacts) arguments.get("selectedContact");
      if (Parcelable.class.isAssignableFrom(Contacts.class) || selectedContact == null) {
        __result.set("selectedContact", Parcelable.class.cast(selectedContact));
      } else if (Serializable.class.isAssignableFrom(Contacts.class)) {
        __result.set("selectedContact", Serializable.class.cast(selectedContact));
      } else {
        throw new UnsupportedOperationException(Contacts.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("selectedContact") != that.arguments.containsKey("selectedContact")) {
      return false;
    }
    if (getSelectedContact() != null ? !getSelectedContact().equals(that.getSelectedContact()) : that.getSelectedContact() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedContact() != null ? getSelectedContact().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "selectedContact=" + getSelectedContact()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Contacts selectedContact) {
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedContact", selectedContact);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSelectedContact(@NonNull Contacts selectedContact) {
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedContact", selectedContact);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Contacts getSelectedContact() {
      return (Contacts) arguments.get("selectedContact");
    }
  }
}
