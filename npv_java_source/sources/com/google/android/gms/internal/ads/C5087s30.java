package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5087s30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f38632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f38633b;

    public C5087s30(com.google.android.gms.internal.ads.C2585Lq c2585Lq, java.util.concurrent.Executor executor, java.lang.String str, android.content.pm.PackageInfo packageInfo, int i6) {
        this.f38632a = executor;
        this.f38633b = str;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.f(com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(this.f38633b), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.q30
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.C5197t30((java.lang.String) obj);
            }
        }, this.f38632a), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.r30
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f38428a.c((java.lang.Throwable) obj);
            }
        }, this.f38632a);
    }

    final /* synthetic */ P4.d c(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5197t30(this.f38633b));
    }
}
