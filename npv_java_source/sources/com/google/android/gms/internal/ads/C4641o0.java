package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4641o0 implements com.google.android.gms.internal.ads.InterfaceC3107a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f37703a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        com.google.android.gms.internal.ads.Y0.b(this, c5128sR, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void b(long j6, int i6, int i10, int i11, com.google.android.gms.internal.ads.Z0 z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void c(com.google.android.gms.internal.ads.D d6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ void d(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final /* synthetic */ int e(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6) {
        return com.google.android.gms.internal.ads.Y0.a(this, interfaceC4884qB0, i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final int f(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, int i6, boolean z6, int i10) throws java.io.EOFException {
        int iH = interfaceC4884qB0.H(this.f37703a, 0, java.lang.Math.min(4096, i6));
        if (iH != -1) {
            return iH;
        }
        if (z6) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3107a1
    public final void g(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10) {
        c5128sR.m(i6);
    }
}
