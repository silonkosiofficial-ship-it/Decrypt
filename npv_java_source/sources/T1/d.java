package T1;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.text.InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.widget.TextView f12904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.emoji2.text.f.AbstractC0423f f12905b;

    private static class a extends androidx.emoji2.text.f.AbstractC0423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.ref.Reference f12906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.ref.Reference f12907b;

        a(android.widget.TextView textView, T1.d dVar) {
            this.f12906a = new java.lang.ref.WeakReference(textView);
            this.f12907b = new java.lang.ref.WeakReference(dVar);
        }

        private boolean c(android.widget.TextView textView, android.text.InputFilter inputFilter) {
            android.text.InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (android.text.InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0423f
        public void b() {
            java.lang.CharSequence text;
            java.lang.CharSequence charSequenceR;
            super.b();
            android.widget.TextView textView = (android.widget.TextView) this.f12906a.get();
            if (c(textView, (android.text.InputFilter) this.f12907b.get()) && textView.isAttachedToWindow() && text != (charSequenceR = androidx.emoji2.text.f.c().r((text = textView.getText())))) {
                int selectionStart = android.text.Selection.getSelectionStart(charSequenceR);
                int selectionEnd = android.text.Selection.getSelectionEnd(charSequenceR);
                textView.setText(charSequenceR);
                if (charSequenceR instanceof android.text.Spannable) {
                    T1.d.b((android.text.Spannable) charSequenceR, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(android.widget.TextView textView) {
        this.f12904a = textView;
    }

    private androidx.emoji2.text.f.AbstractC0423f a() {
        if (this.f12905b == null) {
            this.f12905b = new T1.d.a(this.f12904a, this);
        }
        return this.f12905b;
    }

    static void b(android.text.Spannable spannable, int i6, int i10) {
        if (i6 >= 0 && i10 >= 0) {
            android.text.Selection.setSelection(spannable, i6, i10);
        } else if (i6 >= 0) {
            android.text.Selection.setSelection(spannable, i6);
        } else if (i10 >= 0) {
            android.text.Selection.setSelection(spannable, i10);
        }
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i6, int i10, android.text.Spanned spanned, int i11, int i12) {
        if (this.f12904a.isInEditMode()) {
            return charSequence;
        }
        int iG = androidx.emoji2.text.f.c().g();
        if (iG != 0) {
            if (iG == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == this.f12904a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i6 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i6, i10);
                }
                return androidx.emoji2.text.f.c().s(charSequence, 0, charSequence.length());
            }
            if (iG != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().v(a());
        return charSequence;
    }
}
