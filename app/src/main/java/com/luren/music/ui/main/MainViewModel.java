package com.luren.music.ui.main;

import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private static final String SEAECH_MODE = "SEARCH_MODE";
    private static final String SEAECH_TEXT = "SEARCH_TEXT";
    private SavedStateHandle state;

    public MainViewModel(SavedStateHandle savedStateHandle) {
        state = savedStateHandle;
        state.set(SEAECH_MODE, "song");
        state.set(SEAECH_TEXT, "");
    }

    public MutableLiveData<String> getSearchMode() {
        return state.getLiveData(SEAECH_MODE);
    }

    public MutableLiveData<String> getSearchText() {
        return state.getLiveData(SEAECH_TEXT);
    }

    public void updateSearchMode(String searchMode) {
        state.getLiveData(SEAECH_MODE).setValue(searchMode);
    }

    public void updateSearchText(String searchText) {
        state.getLiveData(SEAECH_TEXT).setValue(searchText);
    }
}
