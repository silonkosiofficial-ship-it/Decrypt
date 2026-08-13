package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VI0 extends com.google.android.gms.internal.ads.XI0 {
    protected VI0(com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr, int i6, com.google.android.gms.internal.ads.XJ0 xj0, long j6, long j10, long j11, int i10, int i11, float f6, float f10, java.util.List list, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        super(c2728Pm, iArr, 0);
        com.google.android.gms.internal.ads.AbstractC3398ci0.M(list);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.AbstractC3398ci0 a(com.google.android.gms.internal.ads.HJ0[] hj0Arr) {
        int i6;
        int i10;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i6 = 2;
            i10 = 1;
            if (i12 >= 2) {
                break;
            }
            com.google.android.gms.internal.ads.HJ0 hj0 = hj0Arr[i12];
            if (hj0 == null || hj0.f28010b.length <= 1) {
                arrayList.add(null);
            } else {
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                c3083Zh0.g(new com.google.android.gms.internal.ads.TI0(0L, 0L));
                arrayList.add(c3083Zh0);
            }
            i12++;
        }
        long[][] jArr = new long[2][];
        for (int i13 = 0; i13 < 2; i13++) {
            com.google.android.gms.internal.ads.HJ0 hj1 = hj0Arr[i13];
            if (hj1 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[hj1.f28010b.length];
                int i14 = 0;
                while (true) {
                    int[] iArr = hj1.f28010b;
                    if (i14 >= iArr.length) {
                        break;
                    }
                    long j6 = hj1.f28009a.b(iArr[i14]).f26569j;
                    long[] jArr2 = jArr[i13];
                    if (j6 == -1) {
                        j6 = 0;
                    }
                    jArr2[i14] = j6;
                    i14++;
                }
                java.util.Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            long[] jArr4 = jArr[i15];
            jArr3[i15] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        c(arrayList, jArr3);
        com.google.android.gms.internal.ads.InterfaceC4605ni0 interfaceC4605ni0C = com.google.android.gms.internal.ads.AbstractC2464Ii0.b(com.google.android.gms.internal.ads.AbstractC2648Ni0.c()).b(2).c();
        int i16 = 0;
        while (i16 < i6) {
            int length = jArr[i16].length;
            if (length > i10) {
                double[] dArr = new double[length];
                int i17 = i11;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double dLog = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    long j10 = jArr5[i17];
                    if (j10 != -1) {
                        dLog = java.lang.Math.log(j10);
                    }
                    dArr[i17] = dLog;
                    i17++;
                }
                int i18 = length - 1;
                double d6 = dArr[i18] - dArr[i11];
                int i19 = i11;
                while (i19 < i18) {
                    double d10 = dArr[i19];
                    i19++;
                    interfaceC4605ni0C.a(java.lang.Double.valueOf(d6 == 0.0d ? 1.0d : (((d10 + dArr[i19]) * 0.5d) - dArr[i11]) / d6), java.lang.Integer.valueOf(i16));
                    i11 = 0;
                }
            }
            i16++;
            i11 = 0;
            i6 = 2;
            i10 = 1;
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0M = com.google.android.gms.internal.ads.AbstractC3398ci0.M(interfaceC4605ni0C.t());
        for (int i20 = 0; i20 < abstractC3398ci0M.size(); i20++) {
            int iIntValue = ((java.lang.Integer) abstractC3398ci0M.get(i20)).intValue();
            int i21 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i21;
            jArr3[iIntValue] = jArr[iIntValue][i21];
            c(arrayList, jArr3);
        }
        for (int i22 = 0; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j11 = jArr3[i22];
                jArr3[i22] = j11 + j11;
            }
        }
        c(arrayList, jArr3);
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh1 = new com.google.android.gms.internal.ads.C3083Zh0();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh2 = (com.google.android.gms.internal.ads.C3083Zh0) arrayList.get(i23);
            c3083Zh1.g(c3083Zh2 == null ? com.google.android.gms.internal.ads.AbstractC3398ci0.O() : c3083Zh2.j());
        }
        return c3083Zh1.j();
    }

    private static void c(java.util.List list, long[] jArr) {
        long j6 = 0;
        for (int i6 = 0; i6 < 2; i6++) {
            j6 += jArr[i6];
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = (com.google.android.gms.internal.ads.C3083Zh0) list.get(i10);
            if (c3083Zh0 != null) {
                c3083Zh0.g(new com.google.android.gms.internal.ads.TI0(j6, jArr[i10]));
            }
        }
    }
}
