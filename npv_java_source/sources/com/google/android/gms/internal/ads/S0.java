package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class S0 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R0 f31515b;

    public S0(long j6, long j10) {
        this.f31514a = j6;
        com.google.android.gms.internal.ads.U0 u6 = j10 == 0 ? com.google.android.gms.internal.ads.U0.f32077c : new com.google.android.gms.internal.ads.U0(0L, j10);
        this.f31515b = new com.google.android.gms.internal.ads.R0(u6, u6);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f31514a;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        return this.f31515b;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return false;
    }
}
