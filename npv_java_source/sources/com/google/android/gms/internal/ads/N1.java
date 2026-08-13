package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class N1 extends com.google.android.gms.internal.ads.F0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30138b;

    public N1(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        super(interfaceC5300u0);
        com.google.android.gms.internal.ads.LC.d(interfaceC5300u0.e() >= j6);
        this.f30138b = j6;
    }

    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long d() {
        return super.d() - this.f30138b;
    }

    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long e() {
        return super.e() - this.f30138b;
    }

    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long f() {
        return super.f() - this.f30138b;
    }
}
