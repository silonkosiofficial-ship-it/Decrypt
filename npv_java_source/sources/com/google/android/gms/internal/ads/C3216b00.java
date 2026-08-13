package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3216b00 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f34186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XM f34187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f34188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f34189d;

    public C3216b00(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.XM xm, com.google.android.gms.internal.ads.C4546n70 c4546n70, java.lang.String str) {
        this.f34186a = yk0;
        this.f34187b = xm;
        this.f34189d = c4546n70;
        this.f34188c = str;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f34186a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.a00
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f33983a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C3325c00 c() {
        com.google.android.gms.internal.ads.XM xm = this.f34187b;
        return new com.google.android.gms.internal.ads.C3325c00(xm.b(this.f34189d.f37513f, this.f34188c), xm.a());
    }
}
