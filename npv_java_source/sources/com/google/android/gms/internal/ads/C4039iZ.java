package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4039iZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f36309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f36311c;

    public C4039iZ(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C3022Xq c3022Xq) {
        this.f36309a = yk0;
        this.f36310b = c4546n70;
        this.f36311c = c3022Xq;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f36309a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.hZ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f36087a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C4147jZ c() {
        return new com.google.android.gms.internal.ads.C4147jZ(this.f36310b.f37517j, this.f36311c.m());
    }
}
