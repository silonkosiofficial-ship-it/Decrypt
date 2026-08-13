package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class c implements android.text.InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43898a;

    public c(int i6) {
        this.f43898a = i6;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i6, int i10, android.text.Spanned spanned, int i11, int i12) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned);
            sb.replace(i11, i12, charSequence.subSequence(i6, i10).toString());
            if (java.lang.Integer.parseInt(sb.toString()) <= this.f43898a) {
                return null;
            }
            return "";
        } catch (java.lang.NumberFormatException unused) {
            return "";
        }
    }
}
