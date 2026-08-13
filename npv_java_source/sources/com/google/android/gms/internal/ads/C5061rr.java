package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5061rr implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5281tr f38564a;

    C5061rr(com.google.android.gms.internal.ads.AbstractC5281tr abstractC5281tr) {
        this.f38564a = abstractC5281tr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        this.f38564a.f39041b.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void c(java.lang.Object obj) {
        this.f38564a.f39041b.set(1);
    }
}
