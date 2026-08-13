package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3279bd0 extends com.google.android.gms.internal.ads.AbstractC3001Xc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f34351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f34354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34355e;

    /* synthetic */ C3279bd0(java.lang.String str, boolean z6, boolean z10, boolean z11, long j6, boolean z12, long j10, com.google.android.gms.internal.ads.AbstractC3169ad0 abstractC3169ad0) {
        this.f34351a = str;
        this.f34352b = z6;
        this.f34353c = z10;
        this.f34354d = j6;
        this.f34355e = j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final long a() {
        return this.f34355e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final long b() {
        return this.f34354d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final java.lang.String d() {
        return this.f34351a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final boolean e() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC3001Xc0) {
            com.google.android.gms.internal.ads.AbstractC3001Xc0 abstractC3001Xc0 = (com.google.android.gms.internal.ads.AbstractC3001Xc0) obj;
            if (this.f34351a.equals(abstractC3001Xc0.d()) && this.f34352b == abstractC3001Xc0.h() && this.f34353c == abstractC3001Xc0.g()) {
                abstractC3001Xc0.f();
                if (this.f34354d == abstractC3001Xc0.b()) {
                    abstractC3001Xc0.e();
                    if (this.f34355e == abstractC3001Xc0.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final boolean g() {
        return this.f34353c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3001Xc0
    public final boolean h() {
        return this.f34352b;
    }

    public final int hashCode() {
        return ((((((((((((this.f34351a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f34352b ? 1237 : 1231)) * 1000003) ^ (true != this.f34353c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f34354d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f34355e);
    }

    public final java.lang.String toString() {
        return "AdShield2Options{clientVersion=" + this.f34351a + ", shouldGetAdvertisingId=" + this.f34352b + ", isGooglePlayServicesAvailable=" + this.f34353c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f34354d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f34355e + "}";
    }
}
