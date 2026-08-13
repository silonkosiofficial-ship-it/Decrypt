package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.material.chip.Chip f43843C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.material.textfield.TextInputLayout f43844D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.widget.EditText f43845E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.text.TextWatcher f43846F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.widget.TextView f43847G;

    private class b extends com.google.android.material.internal.j {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (android.text.TextUtils.isEmpty(editable)) {
                com.google.android.material.timepicker.ChipTextInputComboView.this.f43843C.setText(com.google.android.material.timepicker.ChipTextInputComboView.this.c("00"));
                return;
            }
            java.lang.String strC = com.google.android.material.timepicker.ChipTextInputComboView.this.c(editable);
            com.google.android.material.chip.Chip chip = com.google.android.material.timepicker.ChipTextInputComboView.this.f43843C;
            if (android.text.TextUtils.isEmpty(strC)) {
                strC = com.google.android.material.timepicker.ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) layoutInflaterFrom.inflate(p125m4.g.f50659g, (android.view.ViewGroup) this, false);
        this.f43843C = chip;
        chip.setAccessibilityClassName("android.view.View");
        com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) layoutInflaterFrom.inflate(p125m4.g.f50660h, (android.view.ViewGroup) this, false);
        this.f43844D = textInputLayout;
        android.widget.EditText editText = textInputLayout.getEditText();
        this.f43845E = editText;
        editText.setVisibility(4);
        com.google.android.material.timepicker.ChipTextInputComboView.b bVar = new com.google.android.material.timepicker.ChipTextInputComboView.b();
        this.f43846F = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f43847G = (android.widget.TextView) findViewById(p125m4.e.f50638n);
        editText.setId(androidx.core.view.X.k());
        androidx.core.view.X.z0(this.f43847G, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String c(java.lang.CharSequence charSequence) {
        return com.google.android.material.timepicker.f.a(getResources(), charSequence);
    }

    private void d() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.f43845E.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f43843C.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        this.f43843C.setChecked(z6);
        this.f43845E.setVisibility(z6 ? 0 : 4);
        this.f43843C.setVisibility(z6 ? 8 : 0);
        if (isChecked()) {
            com.google.android.material.internal.n.k(this.f43845E, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f43843C.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i6, java.lang.Object obj) {
        this.f43843C.setTag(i6, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f43843C.toggle();
    }
}
