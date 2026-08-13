package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5320uA implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2505Jk0 f39124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5430vA f39125b;

    C5320uA(com.google.android.gms.internal.ads.C5430vA c5430vA, com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        this.f39124a = interfaceC2505Jk0;
        this.f39125b = c5430vA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pA
            @Override // java.lang.Runnable
            public final void run() {
                this.f37949C.d();
            }
        });
        this.f39124a.a(th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pA
            @Override // java.lang.Runnable
            public final void run() {
                this.f37949C.d();
            }
        });
        this.f39124a.c((com.google.android.gms.internal.ads.AbstractC3673fA) obj);
    }
}
