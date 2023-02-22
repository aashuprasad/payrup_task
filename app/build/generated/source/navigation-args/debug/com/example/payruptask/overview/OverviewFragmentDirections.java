package com.example.payruptask.overview;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.payruptask.R;
import com.example.payruptask.network.models.Contacts;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OverviewFragmentDirections {
  private OverviewFragmentDirections() {
  }

  @NonNull
  public static ActionShowDetail actionShowDetail(@NonNull Contacts selectedContact) {
    return new ActionShowDetail(selectedContact);
  }

  public static class ActionShowDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionShowDetail(@NonNull Contacts selectedContact) {
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedContact", selectedContact);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionShowDetail setSelectedContact(@NonNull Contacts selectedContact) {
      if (selectedContact == null) {
        throw new IllegalArgumentException("Argument \"selectedContact\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedContact", selectedContact);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.actionShowDetail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Contacts getSelectedContact() {
      return (Contacts) arguments.get("selectedContact");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionShowDetail that = (ActionShowDetail) object;
      if (arguments.containsKey("selectedContact") != that.arguments.containsKey("selectedContact")) {
        return false;
      }
      if (getSelectedContact() != null ? !getSelectedContact().equals(that.getSelectedContact()) : that.getSelectedContact() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedContact() != null ? getSelectedContact().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionShowDetail(actionId=" + getActionId() + "){"
          + "selectedContact=" + getSelectedContact()
          + "}";
    }
  }
}
