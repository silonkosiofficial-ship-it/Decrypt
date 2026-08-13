package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f33147a;

    XZ(com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f33147a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f33147a.H0(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.WZ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.YZ(p174r3.v.c().a() - p174r3.v.s().j().i().a());
            }
        });
    }
}
