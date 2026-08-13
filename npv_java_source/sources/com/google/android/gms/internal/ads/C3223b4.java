package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3223b4 extends com.google.android.gms.internal.ads.AbstractC3661f4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f34203o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f34204p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34205n;

    C3223b4() {
    }

    public static boolean j(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        return k(c5128sR, f34203o);
    }

    private static boolean k(com.google.android.gms.internal.ads.C5128sR c5128sR, byte[] bArr) {
        if (c5128sR.r() < 8) {
            return false;
        }
        int iT = c5128sR.t();
        byte[] bArr2 = new byte[8];
        c5128sR.h(bArr2, 0, 8);
        c5128sR.l(iT);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final long a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        return f(com.google.android.gms.internal.ads.P0.d(c5128sR.n()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f34205n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6, com.google.android.gms.internal.ads.C3332c4 c3332c4) {
        com.google.android.gms.internal.ads.D dH;
        if (k(c5128sR, f34203o)) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(c5128sR.n(), c5128sR.u());
            int i6 = bArrCopyOf[9] & 255;
            java.util.List listE = com.google.android.gms.internal.ads.P0.e(bArrCopyOf);
            if (c3332c4.f34441a == null) {
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                c4682oK0.B("audio/opus");
                c4682oK0.r0(i6);
                c4682oK0.C(48000);
                c4682oK0.n(listE);
                dH = c4682oK0.H();
                c3332c4.f34441a = dH;
                return true;
            }
            return true;
        }
        if (!k(c5128sR, f34204p)) {
            com.google.android.gms.internal.ads.LC.b(c3332c4.f34441a);
            return false;
        }
        com.google.android.gms.internal.ads.LC.b(c3332c4.f34441a);
        if (!this.f34205n) {
            this.f34205n = true;
            c5128sR.m(8);
            com.google.android.gms.internal.ads.C2227Cb c2227CbB = com.google.android.gms.internal.ads.AbstractC3765g1.b(com.google.android.gms.internal.ads.AbstractC3398ci0.N(com.google.android.gms.internal.ads.AbstractC3765g1.c(c5128sR, false, false).f34628a));
            if (c2227CbB != null) {
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = c3332c4.f34441a.b();
                c4682oK0B.t(c2227CbB.d(c3332c4.f34441a.f26571l));
                dH = c4682oK0B.H();
                c3332c4.f34441a = dH;
                return true;
            }
        }
        return true;
    }
}
