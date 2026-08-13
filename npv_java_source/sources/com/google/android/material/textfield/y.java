package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
class y extends com.google.android.material.textfield.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.widget.EditText f43831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.view.View.OnClickListener f43832g;

    y(com.google.android.material.textfield.r rVar, int i6) {
        super(rVar);
        this.f43830e = p125m4.d.f50598a;
        this.f43832g = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f43829C.y(view);
            }
        };
        if (i6 != 0) {
            this.f43830e = i6;
        }
    }

    private boolean w() {
        android.widget.EditText editText = this.f43831f;
        return editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
    }

    private static boolean x(android.widget.EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(android.view.View view) {
        android.widget.EditText editText;
        android.text.method.PasswordTransformationMethod passwordTransformationMethod;
        android.widget.EditText editText2 = this.f43831f;
        if (editText2 == null) {
            return;
        }
        int selectionEnd = editText2.getSelectionEnd();
        if (w()) {
            editText = this.f43831f;
            passwordTransformationMethod = null;
        } else {
            editText = this.f43831f;
            passwordTransformationMethod = android.text.method.PasswordTransformationMethod.getInstance();
        }
        editText.setTransformationMethod(passwordTransformationMethod);
        if (selectionEnd >= 0) {
            this.f43831f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // com.google.android.material.textfield.s
    void b(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return p125m4.h.f50692v;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return this.f43830e;
    }

    @Override // com.google.android.material.textfield.s
    android.view.View.OnClickListener f() {
        return this.f43832g;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    void n(android.widget.EditText editText) {
        this.f43831f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        if (x(this.f43831f)) {
            this.f43831f.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        android.widget.EditText editText = this.f43831f;
        if (editText != null) {
            editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }
}
