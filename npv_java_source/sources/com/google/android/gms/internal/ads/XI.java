package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class XI implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.view.View f33110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ZI f33111b;

    XI(com.google.android.gms.internal.ads.ZI zi, android.view.View view) {
        this.f33110a = view;
        this.f33111b = zi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25627m5)).booleanValue()) {
            p174r3.v.s().w(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.f33111b.N(this.f33110a, (com.google.android.gms.internal.ads.QT) obj);
    }
}
