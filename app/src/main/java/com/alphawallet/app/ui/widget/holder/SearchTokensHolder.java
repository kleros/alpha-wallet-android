package com.alphawallet.app.ui.widget.holder;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.alphawallet.app.R;
import com.alphawallet.app.ui.widget.entity.ManageTokensData;

public class SearchTokensHolder extends BinderViewHolder<ManageTokensData> {
    public static final int VIEW_TYPE = 2021;

    EditText editSearch;
    TextWatcher textWatcher;

    @Override
    public void bind(@Nullable ManageTokensData data, @NonNull Bundle addition) {
        editSearch.addTextChangedListener(textWatcher);
        editSearch.setOnEditorActionListener((textView, actionId, event) -> actionId == EditorInfo.IME_ACTION_SEARCH);
    }

    public SearchTokensHolder(int res_id, ViewGroup parent, TextWatcher textWatcher) {
        super(res_id, parent);
        this.editSearch = findViewById(R.id.edit_search);
        this.textWatcher = textWatcher;
    }
}