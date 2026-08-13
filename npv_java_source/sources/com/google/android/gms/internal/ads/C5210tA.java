package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5210tA implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2505Jk0 f38892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5430vA f38893b;

    C5210tA(com.google.android.gms.internal.ads.C5430vA c5430vA, com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0) {
        this.f38892a = interfaceC2505Jk0;
        this.f38893b = c5430vA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        this.f38892a.a(th);
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.pA
            @Override // java.lang.Runnable
            public final void run() {
                this.f37949C.d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C5430vA.b(this.f38893b, ((com.google.android.gms.internal.ads.C4661oA) obj).f37729a, this.f38892a);
    }
}
