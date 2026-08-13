package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Jm0 implements com.google.android.gms.internal.ads.InterfaceC2683Oh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Pv0 f28751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f28752c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28755f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Ts0 f28750a = new com.google.android.gms.internal.ads.Ts0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28753d = 8000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28754e = 8000;

    public final com.google.android.gms.internal.ads.Jm0 b(boolean z6) {
        this.f28755f = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.Jm0 c(int i6) {
        this.f28753d = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.Jm0 d(int i6) {
        this.f28754e = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.Jm0 e(com.google.android.gms.internal.ads.Pv0 pv0) {
        this.f28751b = pv0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Jm0 f(java.lang.String str) {
        this.f28752c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C4619np0 a() {
        com.google.android.gms.internal.ads.C4619np0 c4619np0 = new com.google.android.gms.internal.ads.C4619np0(this.f28752c, this.f28753d, this.f28754e, this.f28755f, false, this.f28750a, null, false, null);
        com.google.android.gms.internal.ads.Pv0 pv0 = this.f28751b;
        if (pv0 != null) {
            c4619np0.b(pv0);
        }
        return c4619np0;
    }
}
