package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3105a0 f32962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32967f;

    public X(com.google.android.gms.internal.ads.InterfaceC3105a0 interfaceC3105a0, long j6, long j10, long j11, long j12, long j13, long j14) {
        this.f32962a = interfaceC3105a0;
        this.f32963b = j6;
        this.f32964c = j11;
        this.f32965d = j12;
        this.f32966e = j13;
        this.f32967f = j14;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f32963b;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.U0 u6 = new com.google.android.gms.internal.ads.U0(j6, com.google.android.gms.internal.ads.Z.f(this.f32962a.b(j6), 0L, this.f32964c, this.f32965d, this.f32966e, this.f32967f));
        return new com.google.android.gms.internal.ads.R0(u6, u6);
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }

    public final long k(long j6) {
        return this.f32962a.b(j6);
    }
}
