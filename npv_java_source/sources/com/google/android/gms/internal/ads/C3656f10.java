package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3656f10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f35245a;

    public C3656f10(com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f35245a = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f35245a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.e10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.C3766g10(p174r3.v.w().b(), p174r3.v.w().m());
            }
        });
    }
}
