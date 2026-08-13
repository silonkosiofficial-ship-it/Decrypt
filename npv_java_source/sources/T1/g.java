package T1;

/* JADX INFO: loaded from: classes.dex */
final class g implements android.text.TextWatcher {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.widget.EditText f12915C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f12916D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.emoji2.text.f.AbstractC0423f f12917E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f12918F = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12919G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f12920H = true;

    private static class a extends androidx.emoji2.text.f.AbstractC0423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.ref.Reference f12921a;

        a(android.widget.EditText editText) {
            this.f12921a = new java.lang.ref.WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0423f
        public void b() {
            super.b();
            T1.g.b((android.widget.EditText) this.f12921a.get(), 1);
        }
    }

    g(android.widget.EditText editText, boolean z6) {
        this.f12915C = editText;
        this.f12916D = z6;
    }

    private androidx.emoji2.text.f.AbstractC0423f a() {
        if (this.f12917E == null) {
            this.f12917E = new T1.g.a(this.f12915C);
        }
        return this.f12917E;
    }

    static void b(android.widget.EditText editText, int i6) {
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            android.text.Editable editableText = editText.getEditableText();
            int selectionStart = android.text.Selection.getSelectionStart(editableText);
            int selectionEnd = android.text.Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().r(editableText);
            T1.d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f12920H && (this.f12916D || androidx.emoji2.text.f.k())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
    }

    public void c(boolean z6) {
        if (this.f12920H != z6) {
            if (this.f12917E != null) {
                androidx.emoji2.text.f.c().w(this.f12917E);
            }
            this.f12920H = z6;
            if (z6) {
                b(this.f12915C, androidx.emoji2.text.f.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
        if (this.f12915C.isInEditMode() || d() || i10 > i11 || !(charSequence instanceof android.text.Spannable)) {
            return;
        }
        int iG = androidx.emoji2.text.f.c().g();
        if (iG != 0) {
            if (iG == 1) {
                androidx.emoji2.text.f.c().u((android.text.Spannable) charSequence, i6, i6 + i11, this.f12918F, this.f12919G);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().v(a());
    }
}
