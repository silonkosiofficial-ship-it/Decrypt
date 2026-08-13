package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5899zS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5239tS f40301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f40302b;

    public C5899zS(com.google.android.gms.internal.ads.C5239tS c5239tS, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f40301a = c5239tS;
        this.f40302b = yk0;
    }

    public final void a(com.google.android.gms.internal.ads.Y80 y80) {
        final com.google.android.gms.internal.ads.C5239tS c5239tS = this.f40301a;
        j$.util.Objects.requireNonNull(c5239tS);
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f40302b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.xS
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return c5239tS.getWritableDatabase();
            }
        }), new com.google.android.gms.internal.ads.C5789yS(this, y80), this.f40302b);
    }
}
