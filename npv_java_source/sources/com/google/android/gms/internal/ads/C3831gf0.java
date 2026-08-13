package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3831gf0 extends com.google.android.gms.internal.ads.AbstractC2532Kf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f35651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f35652c;

    C3831gf0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532Kf0
    public final com.google.android.gms.internal.ads.AbstractC2532Kf0 a(java.lang.String str) {
        this.f35651b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532Kf0
    public final com.google.android.gms.internal.ads.AbstractC2532Kf0 b(int i6) {
        this.f35650a = i6;
        this.f35652c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532Kf0
    public final com.google.android.gms.internal.ads.AbstractC2605Mf0 c() {
        if (this.f35652c == 1) {
            return new com.google.android.gms.internal.ads.C4050if0(this.f35650a, this.f35651b, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: statusCode");
    }
}
