package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class O9 implements com.google.android.gms.internal.ads.InterfaceC2823Sd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2747Qc0 f30454a;

    O9(com.google.android.gms.internal.ads.Q9 q10, com.google.android.gms.internal.ads.C2747Qc0 c2747Qc0) {
        this.f30454a = c2747Qc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2823Sd0
    public final boolean a(java.io.File file) {
        try {
            return this.f30454a.a(file);
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }
}
