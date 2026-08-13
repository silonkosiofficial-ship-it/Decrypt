package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3073Zc0 extends com.google.android.gms.internal.ads.AbstractC2965Wc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f33626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f33631f;

    C3073Zc0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null clientVersion");
        }
        this.f33626a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 b(boolean z6) {
        this.f33631f = (byte) (this.f33631f | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 c(boolean z6) {
        this.f33631f = (byte) (this.f33631f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 d(boolean z6) {
        this.f33628c = true;
        this.f33631f = (byte) (this.f33631f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 e(long j6) {
        this.f33630e = 300L;
        this.f33631f = (byte) (this.f33631f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 f(long j6) {
        this.f33629d = 100L;
        this.f33631f = (byte) (this.f33631f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC2965Wc0 g(boolean z6) {
        this.f33627b = z6;
        this.f33631f = (byte) (this.f33631f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2965Wc0
    public final com.google.android.gms.internal.ads.AbstractC3001Xc0 h() {
        java.lang.String str;
        if (this.f33631f == 63 && (str = this.f33626a) != null) {
            return new com.google.android.gms.internal.ads.C3279bd0(str, this.f33627b, this.f33628c, false, this.f33629d, false, this.f33630e, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f33626a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f33631f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f33631f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f33631f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f33631f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f33631f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f33631f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
