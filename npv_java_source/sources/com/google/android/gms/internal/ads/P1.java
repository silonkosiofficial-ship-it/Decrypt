package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class P1 implements com.google.android.gms.internal.ads.InterfaceC5520w0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f30615C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5520w0 f30616D;

    public P1(long j6, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f30615C = j6;
        this.f30616D = interfaceC5520w0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void Q() {
        this.f30616D.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final void R(com.google.android.gms.internal.ads.T0 t6) {
        this.f30616D.R(new com.google.android.gms.internal.ads.O1(this, t6, t6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520w0
    public final com.google.android.gms.internal.ads.InterfaceC3107a1 S(int i6, int i10) {
        return this.f30616D.S(i6, i10);
    }
}
