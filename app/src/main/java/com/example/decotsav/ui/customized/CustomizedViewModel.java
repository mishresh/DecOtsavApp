package com.example.decotsav.ui.customized;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomizedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CustomizedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Customized fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}