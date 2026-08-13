package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4094j10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f36535b;

    C4094j10(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f36535b = yk0;
        this.f36534a = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f36535b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.i10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f36213a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C4204k10 c() {
        p174r3.v.t();
        return new com.google.android.gms.internal.ads.C4204k10(p214v3.E0.Y(this.f36534a));
    }
}
