package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class N30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.Yk0 f30159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.List f30160b;

    public N30(com.google.android.gms.internal.ads.Cif cif, com.google.android.gms.internal.ads.Yk0 yk0, java.util.List list) {
        this.f30159a = yk0;
        this.f30160b = list;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f30159a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.M30
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.O30(this.f29645a.f30160b);
            }
        });
    }
}
