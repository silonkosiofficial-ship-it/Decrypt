package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class W3 extends com.google.android.gms.internal.ads.AbstractC3661f4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.E0 f32656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.V3 f32657o;

    W3() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final long a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        if (!j(c5128sR.n())) {
            return -1L;
        }
        int i6 = (c5128sR.n()[2] & 255) >> 4;
        if (i6 == 6) {
            c5128sR.m(4);
            c5128sR.N();
        } else if (i6 == 7) {
            i6 = 7;
            c5128sR.m(4);
            c5128sR.N();
        }
        int iA = com.google.android.gms.internal.ads.A0.a(c5128sR, i6);
        c5128sR.l(0);
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f32656n = null;
            this.f32657o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6, com.google.android.gms.internal.ads.C3332c4 c3332c4) {
        byte[] bArrN = c5128sR.n();
        com.google.android.gms.internal.ads.E0 e6 = this.f32656n;
        if (e6 == null) {
            com.google.android.gms.internal.ads.E0 e10 = new com.google.android.gms.internal.ads.E0(bArrN, 17);
            this.f32656n = e10;
            c3332c4.f34441a = e10.c(java.util.Arrays.copyOfRange(bArrN, 9, c5128sR.u()), null);
            return true;
        }
        if ((bArrN[0] & 127) == 3) {
            com.google.android.gms.internal.ads.D0 d0B = com.google.android.gms.internal.ads.B0.b(c5128sR);
            com.google.android.gms.internal.ads.E0 e0F = e6.f(d0B);
            this.f32656n = e0F;
            this.f32657o = new com.google.android.gms.internal.ads.V3(e0F, d0B);
            return true;
        }
        if (!j(bArrN)) {
            return true;
        }
        com.google.android.gms.internal.ads.V3 v6 = this.f32657o;
        if (v6 != null) {
            v6.c(j6);
            c3332c4.f34442b = this.f32657o;
        }
        c3332c4.f34441a.getClass();
        return false;
    }
}
