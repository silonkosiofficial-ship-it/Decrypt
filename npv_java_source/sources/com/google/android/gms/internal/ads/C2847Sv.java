package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2847Sv implements com.google.android.gms.internal.ads.HO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f31804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2955Vv f31805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Long f31806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f31807d;

    /* synthetic */ C2847Sv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.C2955Vv c2955Vv, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f31804a = c2331Ev;
        this.f31805b = c2955Vv;
    }

    @Override // com.google.android.gms.internal.ads.HO
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.HO a(long j6) {
        this.f31806c = java.lang.Long.valueOf(j6);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HO
    public final com.google.android.gms.internal.ads.IO c() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f31806c, java.lang.Long.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f31807d, java.lang.String.class);
        return new com.google.android.gms.internal.ads.C2883Tv(this.f31804a, this.f31805b, this.f31806c, this.f31807d, null);
    }

    @Override // com.google.android.gms.internal.ads.HO
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.HO o(java.lang.String str) {
        str.getClass();
        this.f31807d = str;
        return this;
    }
}
