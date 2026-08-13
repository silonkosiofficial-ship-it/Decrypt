package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static final D0.K a(A.F f6, int i6, int i10, int i11, int i12, int i13, D0.M m6, java.util.List list, D0.X[] xArr, int i14, int i15, int[] iArr, int i16) throws java.lang.Throwable {
        int[] iArr2;
        long j6;
        long j10;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.Integer num;
        int i18;
        int iK;
        int i19;
        java.lang.String str3;
        int i20;
        float f10;
        java.lang.String str4;
        float f11;
        long j11;
        int i21;
        int i22;
        java.lang.String str5;
        int i23;
        int i24;
        java.lang.String str6;
        long j12;
        int i25;
        java.lang.String str7;
        java.lang.String str8;
        int i26;
        float f12;
        float f13;
        char c6;
        int i27;
        int i28;
        int[] iArr3;
        int i29;
        java.util.List list2 = list;
        int i30 = i15;
        int i31 = i30 - i14;
        int i32 = 0;
        int i33 = i14;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int[] iArr4 = new int[i31];
        long j13 = i13;
        float f14 = 0.0f;
        int i38 = 0;
        while (true) {
            if (i33 >= i30) {
                break;
            }
            int i39 = i38;
            D0.G g6 = (D0.G) list2.get(i33);
            A.H hC = A.D.c(g6);
            float fE = A.D.e(hC);
            i37 = (i37 != 0 || A.D.f(hC)) ? 1 : i32;
            if (fE > 0.0f) {
                i36++;
                i33 = i33;
                j13 = j13;
                iArr3 = iArr4;
                i31 = i31;
                f14 += fE;
                i29 = i32;
            } else {
                if (i12 != Integer.MAX_VALUE && hC != null) {
                    hC.c();
                }
                int i40 = i11 - i35;
                D0.X xU = xArr[i33];
                if (xU == null) {
                    xU = g6.U(A.E.a(f6, 0, 0, i11 != Integer.MAX_VALUE ? E7.j.d(i40, i32) : Integer.MAX_VALUE, i12, false, 16, null));
                }
                D0.X x6 = xU;
                int i41 = f6.i(x6);
                int iG = f6.g(x6);
                iArr3 = iArr4;
                iArr3[i33 - i14] = i41;
                i29 = 0;
                int iMin = java.lang.Math.min(i13, E7.j.d(i40 - i41, 0));
                i35 = i41 + iMin + i35;
                int iMax = java.lang.Math.max(i39, iG);
                xArr[i33] = x6;
                i39 = iMax;
                i34 = iMin;
                i36 = i36;
            }
            i33++;
            iArr4 = iArr3;
            i32 = i29;
            f14 = f14;
            i31 = i31;
            i38 = i39;
            j13 = j13;
        }
        int i42 = i38;
        long j14 = j13;
        int[] iArr5 = iArr4;
        int i43 = i31;
        float f15 = f14;
        int i44 = i32;
        int i45 = i35;
        int i46 = i36;
        if (i46 == 0) {
            i19 = i45 - i34;
            iArr2 = iArr5;
            iK = i44;
            i17 = i6;
            i18 = i42;
            num = null;
        } else {
            int i47 = i11 != Integer.MAX_VALUE ? i11 : i6;
            iArr2 = iArr5;
            long j15 = ((long) (i46 - 1)) * j14;
            long jE = E7.j.e(((long) (i47 - i45)) - j15, 0L);
            float f16 = jE / f15;
            int i48 = i14;
            long jRound = jE;
            while (true) {
                j6 = jE;
                j10 = j15;
                str = "arrangementSpacingPx ";
                str2 = "targetSpace ";
                if (i48 >= i30) {
                    break;
                }
                float fE2 = A.D.e(A.D.c((D0.G) list2.get(i48)));
                float f17 = f16 * fE2;
                try {
                    jRound -= (long) java.lang.Math.round(f17);
                    i48++;
                    list2 = list;
                    i30 = i15;
                    jE = j6;
                    j15 = j10;
                } catch (java.lang.IllegalArgumentException e6) {
                    throw new java.lang.IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i11 + "mainAxisMin " + i6 + "targetSpace " + i47 + "arrangementSpacingPx " + j14 + "weightChildrenCount " + i46 + "fixedSpace " + i45 + "arrangementSpacingTotal " + j10 + "remainingToTarget " + j6 + "totalWeight " + f15 + "weightUnitSpace " + f16 + "itemWeight " + fE2 + "weightedSize " + f17).initCause(e6);
                }
            }
            i17 = i6;
            float f18 = f15;
            java.lang.String str9 = "weightedSize ";
            java.lang.String str10 = "weightUnitSpace ";
            java.lang.String str11 = "totalWeight ";
            long j16 = j6;
            java.lang.String str12 = "remainingToTarget ";
            long j17 = j10;
            java.lang.String str13 = "arrangementSpacingTotal ";
            long j18 = j14;
            int i49 = i42;
            int i50 = 0;
            int i51 = i14;
            while (i51 < i15) {
                if (xArr[i51] == null) {
                    D0.G g10 = (D0.G) list.get(i51);
                    A.H hC2 = A.D.c(g10);
                    float fE3 = A.D.e(hC2);
                    java.lang.String str14 = str;
                    int i52 = i47;
                    if (i12 != Integer.MAX_VALUE && hC2 != null) {
                        hC2.c();
                    }
                    if (fE3 <= 0.0f) {
                        throw new java.lang.IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int iB = A7.a.b(jRound);
                    java.lang.String str15 = str2;
                    jRound -= (long) iB;
                    float f19 = f16 * fE3;
                    int iMax2 = java.lang.Math.max(0, java.lang.Math.round(f19) + iB);
                    try {
                        try {
                            if (A.D.b(hC2)) {
                                c6 = 65535;
                                int i53 = iMax2 != Integer.MAX_VALUE ? iMax2 : 0;
                                j12 = j17;
                                str7 = str14;
                                i26 = iMax2;
                                str8 = str15;
                                int i54 = i53;
                                i25 = i52;
                                i23 = i46;
                                i24 = i45;
                                f12 = f16;
                                str6 = str9;
                                f13 = f18;
                                j11 = j18;
                                D0.X xU2 = g10.U(f6.d(i54, 0, i26, i12, true));
                                int i55 = f6.i(xU2);
                                int iG2 = f6.g(xU2);
                                iArr2[i51 - i14] = i55;
                                i50 += i55;
                                int iMax3 = java.lang.Math.max(i49, iG2);
                                xArr[i51] = xU2;
                                i49 = iMax3;
                                str4 = str6;
                                f11 = f13;
                                f10 = f12;
                                j17 = j12;
                                str3 = str7;
                                str5 = str8;
                                i21 = i25;
                                i22 = i23;
                                i20 = i24;
                            } else {
                                c6 = 65535;
                            }
                            D0.X xU3 = g10.U(f6.d(i54, 0, i26, i12, true));
                            int i56 = f6.i(xU3);
                            int iG3 = f6.g(xU3);
                            iArr2[i51 - i14] = i56;
                            i50 += i56;
                            int iMax4 = java.lang.Math.max(i49, iG3);
                            xArr[i51] = xU3;
                            i49 = iMax4;
                            str4 = str6;
                            f11 = f13;
                            f10 = f12;
                            j17 = j12;
                            str3 = str7;
                            str5 = str8;
                            i21 = i25;
                            i22 = i23;
                            i20 = i24;
                        } catch (java.lang.IllegalArgumentException e10) {
                            e = e10;
                            throw new java.lang.IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i11 + "mainAxisMin " + i17 + str8 + i25 + str7 + j11 + "weightChildrenCount " + i23 + "fixedSpace " + i24 + str13 + j12 + str12 + j16 + str11 + f13 + str10 + f12 + "weight " + fE3 + str6 + f19 + "crossAxisDesiredSize " + ((java.lang.Object) null) + "remainderUnit " + iB + "childMainAxisSize " + i26).initCause(e);
                        }
                        j12 = j17;
                        str7 = str14;
                        i26 = iMax2;
                        str8 = str15;
                        int i57 = i53;
                        i25 = i52;
                        i23 = i46;
                        i24 = i45;
                        f12 = f16;
                        str6 = str9;
                        f13 = f18;
                        j11 = j18;
                    } catch (java.lang.IllegalArgumentException e11) {
                        e = e11;
                        i23 = i46;
                        i24 = i45;
                        str6 = str9;
                        j12 = j17;
                        i25 = i52;
                        str7 = str14;
                        str8 = str15;
                        i26 = iMax2;
                        f12 = f16;
                        f13 = f18;
                        j11 = j18;
                    }
                } else {
                    str3 = str;
                    i20 = i45;
                    f10 = f16;
                    str4 = str9;
                    f11 = f18;
                    j11 = j18;
                    i21 = i47;
                    i22 = i46;
                    str5 = str2;
                }
                i51++;
                str2 = str5;
                i47 = i21;
                str = str3;
                i46 = i22;
                i45 = i20;
                j16 = j16;
                f16 = f10;
                str10 = str10;
                str11 = str11;
                str12 = str12;
                str13 = str13;
                j18 = j11;
                f18 = f11;
                str9 = str4;
            }
            int i58 = i45;
            num = null;
            i18 = i49;
            iK = E7.j.k((int) (((long) i50) + j17), 0, i11 - i58);
            i19 = i58;
        }
        if (i37 != 0) {
            int iMax5 = 0;
            int iMax6 = 0;
            for (int i59 = i14; i59 < i15; i59++) {
                D0.X x10 = xArr[i59];
                p247y7.AbstractC7350t.c(x10);
                A.AbstractC0780n abstractC0780nA = A.D.a(A.D.d(x10));
                java.lang.Integer numB = abstractC0780nA != null ? abstractC0780nA.b(x10) : num;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iG4 = f6.g(x10);
                    iMax5 = java.lang.Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iG4;
                    }
                    iMax6 = java.lang.Math.max(iMax6, iG4 - iIntValue);
                }
            }
            i27 = iMax6;
            i28 = iMax5;
        } else {
            i27 = 0;
            i28 = 0;
        }
        int iMax7 = java.lang.Math.max(E7.j.d(i19 + iK, 0), i17);
        int iMax8 = java.lang.Math.max(i18, java.lang.Math.max(i10, i27 + i28));
        int[] iArr6 = new int[i43];
        for (int i60 = 0; i60 < i43; i60++) {
            iArr6[i60] = 0;
        }
        f6.f(iMax7, iArr2, iArr6, m6);
        return f6.h(xArr, m6, i28, iArr6, iMax7, iMax8, iArr, i16, i14, i15);
    }
}
