package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class V3 implements com.google.android.gms.internal.ads.InterfaceC3113a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E0 f32403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D0 f32404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32405c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32406d = -1;

    public V3(com.google.android.gms.internal.ads.E0 e6, com.google.android.gms.internal.ads.D0 d6) {
        this.f32403a = e6;
        this.f32404b = d6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final long a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        long j6 = this.f32406d;
        if (j6 < 0) {
            return -1L;
        }
        this.f32406d = -1L;
        return -(j6 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final void b(long j6) {
        long[] jArr = this.f32404b.f26586a;
        this.f32406d = jArr[com.google.android.gms.internal.ads.EW.v(jArr, j6, true, true)];
    }

    public final void c(long j6) {
        this.f32405c = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final com.google.android.gms.internal.ads.T0 d() {
        com.google.android.gms.internal.ads.LC.f(this.f32405c != -1);
        return new com.google.android.gms.internal.ads.C0(this.f32403a, this.f32405c);
    }
}
