package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LJ0 extends com.google.android.gms.internal.ads.PJ0 {
    @Override // com.google.android.gms.internal.ads.PJ0
    public final com.google.android.gms.internal.ads.QJ0 f(com.google.android.gms.internal.ads.DB0[] db0Arr, com.google.android.gms.internal.ads.PI0 pi0, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        boolean z6;
        int[] iArr;
        int[] iArr2 = new int[3];
        com.google.android.gms.internal.ads.C2728Pm[][] c2728PmArr = new com.google.android.gms.internal.ads.C2728Pm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i6 = 0; i6 < 3; i6++) {
            int i10 = pi0.f30686a;
            c2728PmArr[i6] = new com.google.android.gms.internal.ads.C2728Pm[i10];
            iArr3[i6] = new int[i10][];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = db0Arr[i12].d();
        }
        int i13 = 0;
        while (i13 < pi0.f30686a) {
            com.google.android.gms.internal.ads.C2728Pm c2728PmB = pi0.b(i13);
            int i14 = c2728PmB.f30779c;
            int i15 = i11;
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < i11) {
                com.google.android.gms.internal.ads.DB0 db0 = db0Arr[i16];
                int iMax = 0;
                for (int i18 = 0; i18 < c2728PmB.f30777a; i18++) {
                    iMax = java.lang.Math.max(iMax, db0.h(c2728PmB.b(i18)) & 7);
                }
                boolean z11 = iArr2[i16] == 0;
                if (iMax > i17) {
                    z10 = z11;
                    i15 = i16;
                    i17 = iMax;
                } else if (iMax == i17 && i14 == 5 && !z10 && z11) {
                    i15 = i16;
                    i17 = iMax;
                    z10 = true;
                }
                i16++;
                i11 = 2;
            }
            if (i15 == i11) {
                iArr = new int[c2728PmB.f30777a];
            } else {
                com.google.android.gms.internal.ads.DB0 db1 = db0Arr[i15];
                int[] iArr5 = new int[c2728PmB.f30777a];
                for (int i19 = 0; i19 < c2728PmB.f30777a; i19++) {
                    iArr5[i19] = db1.h(c2728PmB.b(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i15];
            c2728PmArr[i15][i20] = c2728PmB;
            iArr3[i15][i20] = iArr;
            iArr2[i15] = i20 + 1;
            i13++;
            i11 = 2;
        }
        int i21 = i11;
        boolean z12 = true;
        com.google.android.gms.internal.ads.PI0[] pi0Arr = new com.google.android.gms.internal.ads.PI0[i21];
        java.lang.String[] strArr = new java.lang.String[i21];
        int[] iArr6 = new int[i21];
        int i22 = 0;
        while (i22 < i21) {
            int i23 = iArr2[i22];
            pi0Arr[i22] = new com.google.android.gms.internal.ads.PI0((com.google.android.gms.internal.ads.C2728Pm[]) com.google.android.gms.internal.ads.EW.n(c2728PmArr[i22], i23));
            iArr3[i22] = (int[][]) com.google.android.gms.internal.ads.EW.n(iArr3[i22], i23);
            strArr[i22] = db0Arr[i22].Y();
            iArr6[i22] = db0Arr[i22].b();
            i22++;
            i21 = 2;
        }
        int i24 = i21;
        com.google.android.gms.internal.ads.KJ0 kj0 = new com.google.android.gms.internal.ads.KJ0(strArr, iArr6, pi0Arr, iArr4, iArr3, new com.google.android.gms.internal.ads.PI0((com.google.android.gms.internal.ads.C2728Pm[]) com.google.android.gms.internal.ads.EW.n(c2728PmArr[i24], iArr2[i24])));
        android.util.Pair pairK = k(kj0, iArr3, iArr4, lh0, abstractC4942qm);
        com.google.android.gms.internal.ads.MJ0[] mj0Arr = (com.google.android.gms.internal.ads.MJ0[]) pairK.second;
        java.util.List[] listArr = new java.util.List[mj0Arr.length];
        for (int i25 = 0; i25 < mj0Arr.length; i25++) {
            com.google.android.gms.internal.ads.MJ0 mj0 = mj0Arr[i25];
            listArr[i25] = mj0 != null ? com.google.android.gms.internal.ads.AbstractC3398ci0.P(mj0) : com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        }
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        int i26 = 0;
        for (int i27 = 2; i26 < i27; i27 = 2) {
            com.google.android.gms.internal.ads.PI0 pi0D = kj0.d(i26);
            java.util.List list = listArr[i26];
            int i28 = 0;
            while (i28 < pi0D.f30686a) {
                com.google.android.gms.internal.ads.C2728Pm c2728PmB2 = pi0D.b(i28);
                boolean z13 = kj0.a(i26, i28, false) != 0 ? z12 : false;
                int i29 = c2728PmB2.f30777a;
                int[] iArr7 = new int[i29];
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 < c2728PmB2.f30777a; i30++) {
                    iArr7[i30] = kj0.b(i26, i28, i30) & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        com.google.android.gms.internal.ads.MJ0 mj1 = (com.google.android.gms.internal.ads.MJ0) list.get(i31);
                        if (mj1.i().equals(c2728PmB2) && mj1.G(i30) != -1) {
                            z6 = true;
                            break;
                        }
                        i31++;
                    }
                    zArr[i30] = z6;
                }
                c3083Zh0.g(new com.google.android.gms.internal.ads.C2399Gp(c2728PmB2, z13, iArr7, zArr));
                i28++;
                z12 = true;
            }
            i26++;
            z12 = true;
        }
        com.google.android.gms.internal.ads.PI0 pi0E = kj0.e();
        for (int i32 = 0; i32 < pi0E.f30686a; i32++) {
            com.google.android.gms.internal.ads.C2728Pm c2728PmB3 = pi0E.b(i32);
            int[] iArr8 = new int[c2728PmB3.f30777a];
            java.util.Arrays.fill(iArr8, 0);
            c3083Zh0.g(new com.google.android.gms.internal.ads.C2399Gp(c2728PmB3, false, iArr8, new boolean[c2728PmB3.f30777a]));
        }
        return new com.google.android.gms.internal.ads.QJ0((com.google.android.gms.internal.ads.EB0[]) pairK.first, (com.google.android.gms.internal.ads.IJ0[]) pairK.second, new com.google.android.gms.internal.ads.C3852gq(c3083Zh0.j()), kj0);
    }

    @Override // com.google.android.gms.internal.ads.PJ0
    public final void g(java.lang.Object obj) {
    }

    protected abstract android.util.Pair k(com.google.android.gms.internal.ads.KJ0 kj0, int[][][] iArr, int[] iArr2, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm);
}
