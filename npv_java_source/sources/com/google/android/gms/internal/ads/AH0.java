package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class AH0 implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f25104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5885zH0 f25106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f25107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25108e;

    public AH0(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, int i6, com.google.android.gms.internal.ads.InterfaceC5885zH0 interfaceC5885zH0) {
        com.google.android.gms.internal.ads.LC.d(i6 > 0);
        this.f25104a = interfaceC4825pi0;
        this.f25105b = i6;
        this.f25106c = interfaceC5885zH0;
        this.f25107d = new byte[1];
        this.f25108e = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        int i11 = this.f25108e;
        if (i11 == 0) {
            int i12 = 0;
            if (this.f25104a.H(this.f25107d, 0, 1) != -1) {
                int i13 = (this.f25107d[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iH = this.f25104a.H(bArr2, i12, i14);
                        if (iH != -1) {
                            i12 += iH;
                            i14 -= iH;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr2[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.f25106c.b(new com.google.android.gms.internal.ads.C5128sR(bArr2, i13));
                    }
                }
                i11 = this.f25105b;
                this.f25108e = i11;
            }
            return -1;
        }
        int iH2 = this.f25104a.H(bArr, i6, java.lang.Math.min(i11, i10));
        if (iH2 != -1) {
            this.f25108e -= iH2;
        }
        return iH2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
        pv0.getClass();
        this.f25104a.b(pv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f25104a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        return this.f25104a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        throw new java.lang.UnsupportedOperationException();
    }
}
