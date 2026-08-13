package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
final class d implements java.util.Comparator {
    d() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.common.api.Scope) obj).e().compareTo(((com.google.android.gms.common.api.Scope) obj2).e());
    }
}
