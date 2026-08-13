package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f33070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33071c;

    public XA0() {
        this.f33069a = -9223372036854775807L;
        this.f33070b = -3.4028235E38f;
        this.f33071c = -9223372036854775807L;
    }

    /* synthetic */ XA0(com.google.android.gms.internal.ads.ZA0 za0, com.google.android.gms.internal.ads.YA0 ya0) {
        this.f33069a = za0.f33511a;
        this.f33070b = za0.f33512b;
        this.f33071c = za0.f33513c;
    }

    public final com.google.android.gms.internal.ads.XA0 d(long j6) {
        boolean z6 = true;
        if (j6 < 0) {
            if (j6 == -9223372036854775807L) {
                j6 = -9223372036854775807L;
            } else {
                z6 = false;
            }
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f33071c = j6;
        return this;
    }

    public final com.google.android.gms.internal.ads.XA0 e(long j6) {
        this.f33069a = j6;
        return this;
    }

    public final com.google.android.gms.internal.ads.XA0 f(float f6) {
        boolean z6 = true;
        if (f6 <= 0.0f && f6 != -3.4028235E38f) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f33070b = f6;
        return this;
    }

    public final com.google.android.gms.internal.ads.ZA0 g() {
        return new com.google.android.gms.internal.ads.ZA0(this, null);
    }
}
