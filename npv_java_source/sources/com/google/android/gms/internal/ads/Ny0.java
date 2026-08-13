package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Ny0 extends com.google.android.gms.internal.ads.Sy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f30417a;

    public Ny0(java.lang.String str) {
        this.f30417a = str;
    }

    @Override // com.google.android.gms.internal.ads.Sy0
    public final void a(java.lang.String str) {
        java.lang.String str2 = this.f30417a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        sb.toString();
    }
}
