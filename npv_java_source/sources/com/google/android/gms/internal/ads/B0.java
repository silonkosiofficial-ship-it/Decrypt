package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B0 {
    public static com.google.android.gms.internal.ads.C2227Cb a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6) {
        com.google.android.gms.internal.ads.C2227Cb c2227CbA = new com.google.android.gms.internal.ads.K0().a(interfaceC5300u0, z6 ? null : com.google.android.gms.internal.ads.AbstractC4865q2.f38145a);
        if (c2227CbA == null || c2227CbA.a() == 0) {
            return null;
        }
        return c2227CbA;
    }

    public static com.google.android.gms.internal.ads.D0 b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        c5128sR.m(1);
        int iE = c5128sR.E();
        long jT = c5128sR.t();
        long j6 = iE;
        int i6 = iE / 18;
        long[] jArrCopyOf = new long[i6];
        long[] jArrCopyOf2 = new long[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            long J10 = c5128sR.J();
            if (J10 == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = J10;
            jArrCopyOf2[i10] = c5128sR.J();
            c5128sR.m(2);
        }
        c5128sR.m((int) ((jT + j6) - ((long) c5128sR.t())));
        return new com.google.android.gms.internal.ads.D0(jArrCopyOf, jArrCopyOf2);
    }
}
