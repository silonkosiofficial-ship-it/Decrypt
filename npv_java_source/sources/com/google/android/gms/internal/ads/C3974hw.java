package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3974hw implements B3.InterfaceC0798d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f36175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4555nC f36176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B3.B f36177c;

    /* synthetic */ C3974hw(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f36175a = c2331Ev;
    }

    @Override // B3.InterfaceC0798d
    public final B3.AbstractC0799e c() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36176b, com.google.android.gms.internal.ads.C4555nC.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36177c, B3.B.class);
        return new com.google.android.gms.internal.ads.C4082iw(this.f36175a, this.f36177c, new com.google.android.gms.internal.ads.NA(), new com.google.android.gms.internal.ads.OB(), new com.google.android.gms.internal.ads.C5345uO(), this.f36176b, null, null, null);
    }

    @Override // B3.InterfaceC0798d
    public final /* bridge */ /* synthetic */ B3.InterfaceC0798d d(com.google.android.gms.internal.ads.C4555nC c4555nC) {
        this.f36176b = c4555nC;
        return this;
    }

    @Override // B3.InterfaceC0798d
    public final /* bridge */ /* synthetic */ B3.InterfaceC0798d e(B3.B b6) {
        this.f36177c = b6;
        return this;
    }
}
