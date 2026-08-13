package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5416v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f39314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39315b = 0;

    static {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        f39314a = "OpusHead".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int a(int i6) {
        return (i6 >> 24) & 255;
    }

    public static com.google.android.gms.internal.ads.C2227Cb b(com.google.android.gms.internal.ads.C4257kZ c4257kZ) {
        com.google.android.gms.internal.ads.JY jy;
        com.google.android.gms.internal.ads.LZ lzC = c4257kZ.c(1751411826);
        com.google.android.gms.internal.ads.LZ lzC2 = c4257kZ.c(1801812339);
        com.google.android.gms.internal.ads.LZ lzC3 = c4257kZ.c(1768715124);
        if (lzC != null && lzC2 != null && lzC3 != null && i(lzC.f29519b) == 1835299937) {
            com.google.android.gms.internal.ads.C5128sR c5128sR = lzC2.f29519b;
            c5128sR.l(12);
            int iW = c5128sR.w();
            java.lang.String[] strArr = new java.lang.String[iW];
            for (int i6 = 0; i6 < iW; i6++) {
                int iW2 = c5128sR.w();
                c5128sR.m(4);
                strArr[i6] = c5128sR.b(iW2 - 8, java.nio.charset.StandardCharsets.UTF_8);
            }
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = lzC3.f29519b;
            c5128sR2.l(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (c5128sR2.r() > 8) {
                int iT = c5128sR2.t() + c5128sR2.w();
                int iW3 = c5128sR2.w() - 1;
                if (iW3 < 0 || iW3 >= iW) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", "Skipped metadata with unknown key index: " + iW3);
                } else {
                    java.lang.String str = strArr[iW3];
                    while (true) {
                        int iT2 = c5128sR2.t();
                        if (iT2 >= iT) {
                            jy = null;
                            break;
                        }
                        int iW4 = c5128sR2.w();
                        if (c5128sR2.w() == 1684108385) {
                            int iW5 = c5128sR2.w();
                            int iW6 = c5128sR2.w();
                            int i10 = iW4 - 16;
                            byte[] bArr = new byte[i10];
                            c5128sR2.h(bArr, 0, i10);
                            jy = new com.google.android.gms.internal.ads.JY(str, bArr, iW6, iW5);
                            break;
                        }
                        c5128sR2.l(iT2 + iW4);
                    }
                    if (jy != null) {
                        arrayList.add(jy);
                    }
                }
                c5128sR2.l(iT);
            }
            if (!arrayList.isEmpty()) {
                return new com.google.android.gms.internal.ads.C2227Cb(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    public static com.google.android.gms.internal.ads.C2227Cb c(com.google.android.gms.internal.ads.LZ lz) {
        int iD;
        com.google.android.gms.internal.ads.C5128sR c5128sR = lz.f29519b;
        c5128sR.l(8);
        com.google.android.gms.internal.ads.C2227Cb c2227Cb = new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, new com.google.android.gms.internal.ads.InterfaceC3274bb[0]);
        while (c5128sR.r() >= 8) {
            int iT = c5128sR.t();
            int iW = c5128sR.w() + iT;
            int iW2 = c5128sR.w();
            com.google.android.gms.internal.ads.C2227Cb c2227Cb2 = null;
            if (iW2 == 1835365473) {
                c5128sR.l(iT);
                c5128sR.m(8);
                g(c5128sR);
                while (c5128sR.t() < iW) {
                    int iT2 = c5128sR.t();
                    int iW3 = c5128sR.w() + iT2;
                    if (c5128sR.w() == 1768715124) {
                        c5128sR.l(iT2);
                        c5128sR.m(8);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (c5128sR.t() < iW3) {
                            com.google.android.gms.internal.ads.InterfaceC3274bb interfaceC3274bbA = com.google.android.gms.internal.ads.D3.a(c5128sR);
                            if (interfaceC3274bbA != null) {
                                arrayList.add(interfaceC3274bbA);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c2227Cb2 = new com.google.android.gms.internal.ads.C2227Cb(arrayList);
                            break;
                        }
                        break;
                    }
                    c5128sR.l(iW3);
                }
            } else {
                if (iW2 == 1936553057) {
                    c5128sR.l(iT);
                    c5128sR.m(12);
                    while (c5128sR.t() < iW) {
                        int iT3 = c5128sR.t();
                        int iW4 = c5128sR.w();
                        if (c5128sR.w() == 1935766900) {
                            if (iW4 < 16) {
                                break;
                            }
                            c5128sR.m(4);
                            int i6 = -1;
                            int i10 = 0;
                            for (int i11 = 0; i11 < 2; i11++) {
                                int iC = c5128sR.C();
                                int iC2 = c5128sR.C();
                                if (iC == 0) {
                                    i6 = iC2;
                                } else if (iC == 1) {
                                    i10 = iC2;
                                }
                            }
                            if (i6 == 12) {
                                iD = 240;
                            } else if (i6 == 13) {
                                iD = 120;
                            } else if (i6 == 21 && c5128sR.r() >= 8 && c5128sR.t() + 8 <= iW) {
                                int iW5 = c5128sR.w();
                                int iW6 = c5128sR.w();
                                if (iW5 < 12 || iW6 != 1936877170) {
                                    iD = -2147483647;
                                } else {
                                    iD = c5128sR.D();
                                }
                            } else {
                                iD = -2147483647;
                            }
                            if (iD == -2147483647) {
                                break;
                            }
                            c2227Cb2 = new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, new com.google.android.gms.internal.ads.N2(iD, i10));
                            break;
                        }
                        c5128sR.l(iT3 + iW4);
                    }
                } else if (iW2 == -1451722374) {
                    c2227Cb = c2227Cb.d(l(c5128sR));
                }
                c5128sR.l(iW);
            }
            c2227Cb = c2227Cb.d(c2227Cb2);
            c5128sR.l(iW);
        }
        return c2227Cb;
    }

    public static com.google.android.gms.internal.ads.W30 d(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        long J10;
        long J11;
        c5128sR.l(8);
        if (a(c5128sR.w()) == 0) {
            J10 = c5128sR.K();
            J11 = c5128sR.K();
        } else {
            J10 = c5128sR.J();
            J11 = c5128sR.J();
        }
        return new com.google.android.gms.internal.ads.W30(J10, J11, c5128sR.K());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0275  */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b4 A[DONT_INVERT, LOOP:13: B:110:0x02b4->B:114:0x02be, LOOP_START, PHI: r19
  0x02b4: PHI (r19v3 int) = (r19v2 int), (r19v4 int) binds: [B:109:0x02b2, B:114:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02be A[LOOP:13: B:110:0x02b4->B:114:0x02be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02c5 A[EDGE_INSN: B:115:0x02c5->B:116:0x02c6 BREAK  A[LOOP:13: B:110:0x02b4->B:114:0x02be]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0306  */
    /* JADX WARN: Code duplicated, block: B:130:0x0307 A[PHI: r1
  0x0307: PHI (r1v11 int) = (r1v10 int), (r1v14 int) binds: [B:116:0x02c6, B:129:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0352  */
    /* JADX WARN: Code duplicated, block: B:134:0x0355  */
    /* JADX WARN: Code duplicated, block: B:271:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1 A[PHI: r9
  0x01b1: PHI (r9v5 int) = (r9v4 int), (r9v4 int), (r9v33 int), (r9v4 int) binds: [B:40:0x00f3, B:47:0x010f, B:64:0x01b0, B:46:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd A[LOOP:11: B:69:0x01d5->B:72:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223 A[LOOP:12: B:80:0x0223->B:83:0x0228, LOOP_START, PHI: r12 r19 r29
  0x0223: PHI (r12v17 int) = (r12v14 int), (r12v18 int) binds: [B:78:0x0220, B:83:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r19v6 int) = (r19v2 int), (r19v7 int) binds: [B:78:0x0220, B:83:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r29v3 int) = (r29v1 int), (r29v7 int) binds: [B:78:0x0220, B:83:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0228 A[LOOP:12: B:80:0x0223->B:83:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0241  */
    /* JADX WARN: Code duplicated, block: B:89:0x0244  */
    /* JADX WARN: Code duplicated, block: B:92:0x024d  */
    /* JADX WARN: Code duplicated, block: B:93:0x024f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
    public static com.google.android.gms.internal.ads.Q3 e(com.google.android.gms.internal.ads.N3 n6, com.google.android.gms.internal.ads.C4257kZ c4257kZ, com.google.android.gms.internal.ads.I0 i6) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.InterfaceC4647o3 c5086s3;
        boolean z6;
        int iF;
        int iF2;
        int iF3;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i10;
        com.google.android.gms.internal.ads.N3 n10;
        int iF4;
        int i11;
        int i12;
        int i13;
        int i14;
        long j6;
        long j10;
        int iF5;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        long j11;
        int i19;
        int[] iArr2;
        java.lang.String str;
        long j12;
        boolean zA;
        int i20;
        int iW;
        int iC;
        int i21;
        int i22;
        int iW2;
        int iF6;
        int i23;
        int[] iArr3;
        com.google.android.gms.internal.ads.N3 n3A;
        int[] iArr4;
        boolean z11;
        int length;
        com.google.android.gms.internal.ads.N3 n3A2 = n6;
        com.google.android.gms.internal.ads.LZ lzC = c4257kZ.c(1937011578);
        if (lzC != null) {
            c5086s3 = new com.google.android.gms.internal.ads.C4976r3(lzC, n3A2.f30153g);
        } else {
            com.google.android.gms.internal.ads.LZ lzC2 = c4257kZ.c(1937013298);
            if (lzC2 == null) {
                throw com.google.android.gms.internal.ads.C4708of.a("Track has no sample table size information", null);
            }
            c5086s3 = new com.google.android.gms.internal.ads.C5086s3(lzC2);
        }
        int iB = c5086s3.b();
        if (iB == 0) {
            return new com.google.android.gms.internal.ads.Q3(n6, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (n3A2.f30148b == 2) {
            long j13 = n3A2.f30152f;
            if (j13 > 0) {
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = n3A2.f30153g.b();
                c4682oK0B.i(iB / (j13 / 1000000.0f));
                n3A2 = n3A2.a(c4682oK0B.H());
            }
        }
        com.google.android.gms.internal.ads.N3 n11 = n3A2;
        com.google.android.gms.internal.ads.LZ lzC3 = c4257kZ.c(1937007471);
        if (lzC3 == null) {
            lzC3 = c4257kZ.c(1668232756);
            lzC3.getClass();
            z6 = true;
        } else {
            z6 = false;
        }
        com.google.android.gms.internal.ads.LZ lzC4 = c4257kZ.c(1937011555);
        lzC4.getClass();
        com.google.android.gms.internal.ads.C5128sR c5128sR = lzC4.f29519b;
        com.google.android.gms.internal.ads.LZ lzC5 = c4257kZ.c(1937011827);
        lzC5.getClass();
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = lzC5.f29519b;
        com.google.android.gms.internal.ads.LZ lzC6 = c4257kZ.c(1937011571);
        com.google.android.gms.internal.ads.C5128sR c5128sR3 = lzC6 != null ? lzC6.f29519b : null;
        com.google.android.gms.internal.ads.LZ lzC7 = c4257kZ.c(1668576371);
        com.google.android.gms.internal.ads.C5128sR c5128sR4 = lzC7 != null ? lzC7.f29519b : null;
        com.google.android.gms.internal.ads.C4097j3 c4097j3 = new com.google.android.gms.internal.ads.C4097j3(c5128sR, lzC3.f29519b, z6);
        c5128sR2.l(12);
        int iF7 = c5128sR2.F() - 1;
        int iF8 = c5128sR2.F();
        int iF9 = c5128sR2.F();
        if (c5128sR4 != null) {
            c5128sR4.l(12);
            iF = c5128sR4.F();
        } else {
            iF = 0;
        }
        if (c5128sR3 != null) {
            c5128sR3.l(12);
            iF3 = c5128sR3.F();
            if (iF3 > 0) {
                iF2 = c5128sR3.F() - 1;
            } else {
                iF2 = -1;
                c5128sR3 = null;
            }
        } else {
            iF2 = -1;
            iF3 = 0;
        }
        int iA = c5086s3.a();
        com.google.android.gms.internal.ads.D d6 = n11.f30153g;
        if (iA != -1) {
            java.lang.String str2 = d6.f26574o;
            if ((!"audio/raw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/g711-alaw".equals(str2)) || iF7 != 0) {
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                jArrCopyOf2 = new long[iB];
                iArrCopyOf2 = new int[iB];
                i10 = iF7;
                n10 = n11;
                iF4 = iF2;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                j6 = 0;
                j10 = 0;
                iF5 = 0;
                while (true) {
                    if (i12 >= iB) {
                        iF8 = iF8;
                        break;
                    }
                    j12 = j6;
                    zA = true;
                    while (true) {
                        if (i14 != 0) {
                            i20 = i14;
                            break;
                        }
                        zA = c4097j3.a();
                        if (!zA) {
                            i20 = 0;
                            break;
                        }
                        int i24 = iF8;
                        long j14 = c4097j3.f36541d;
                        i14 = c4097j3.f36540c;
                        j12 = j14;
                        iF8 = i24;
                        iF9 = iF9;
                        iB = iB;
                    }
                    if (!zA) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i12);
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i12);
                        jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i12);
                        iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i12);
                        iB = i12;
                        break;
                    }
                    iW = i11;
                    if (c5128sR4 != null) {
                        while (iF5 == 0) {
                            if (iF <= 0) {
                                iF5 = 0;
                                break;
                            }
                            iF--;
                            iF5 = c5128sR4.F();
                            iW = c5128sR4.w();
                        }
                        iF5--;
                    }
                    jArrCopyOf[i12] = j12;
                    iC = c5086s3.c();
                    iArrCopyOf[i12] = iC;
                    if (iC > i13) {
                        i21 = iC;
                    } else {
                        i21 = i13;
                    }
                    jArrCopyOf2[i12] = j10 + ((long) iW);
                    if (c5128sR3 == null) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    iArrCopyOf2[i12] = i22;
                    if (i12 == iF4) {
                        iArrCopyOf2[i12] = 1;
                        iF3--;
                        if (iF3 > 0) {
                            c5128sR3.getClass();
                            iF4 = c5128sR3.F() - 1;
                        }
                    }
                    com.google.android.gms.internal.ads.C5128sR c5128sR5 = c5128sR3;
                    iW2 = iF9;
                    long[] jArr3 = jArrCopyOf2;
                    j10 += (long) iW2;
                    iF6 = iF8 - 1;
                    if (iF6 == 0) {
                        if (i10 > 0) {
                            iF6 = c5128sR2.F();
                            i10--;
                            iW2 = c5128sR2.w();
                        } else {
                            iF6 = 0;
                        }
                    }
                    long[] jArr4 = jArrCopyOf;
                    long j15 = j12 + ((long) iArrCopyOf[i12]);
                    i14 = i20 - 1;
                    i12++;
                    iF9 = iW2;
                    jArrCopyOf2 = jArr3;
                    iB = iB;
                    i13 = i21;
                    i11 = iW;
                    iF8 = iF6;
                    c5128sR3 = c5128sR5;
                    j6 = j15;
                    jArrCopyOf = jArr4;
                    iArrCopyOf = iArrCopyOf;
                }
                long j16 = j10 + ((long) i11);
                if (c5128sR4 == null) {
                    z10 = true;
                    break;
                }
                while (true) {
                    if (iF <= 0) {
                        z10 = true;
                        break;
                    }
                    if (c5128sR4.F() != 0) {
                        z10 = false;
                        break;
                    }
                    c5128sR4.w();
                    iF--;
                }
                if (iF3 != 0) {
                    n10 = n10;
                    z10 = z10;
                    jArrCopyOf = jArrCopyOf;
                    i15 = i14;
                    i16 = iF8;
                    i17 = i10;
                    i18 = iF5;
                    int i25 = n10.f30147a;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(i25);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(iF3);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i16);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i15);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i17);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb.toString());
                } else if (iF8 == 0) {
                    if (i14 != 0) {
                        iF3 = 0;
                        i15 = i14;
                    } else if (i10 != 0) {
                        iF3 = 0;
                        i15 = 0;
                    } else if (iF5 != 0) {
                        iF3 = 0;
                        i15 = 0;
                        i17 = 0;
                        n10 = n10;
                        z10 = z10;
                        jArrCopyOf = jArrCopyOf;
                        i18 = iF5;
                        i16 = 0;
                        int i26 = n10.f30147a;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Inconsistent stbl box for track ");
                        sb2.append(i26);
                        sb2.append(": remainingSynchronizationSamples ");
                        sb2.append(iF3);
                        sb2.append(", remainingSamplesAtTimestampDelta ");
                        sb2.append(i16);
                        sb2.append(", remainingSamplesInChunk ");
                        sb2.append(i15);
                        sb2.append(", remainingTimestampDeltaChanges ");
                        sb2.append(i17);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i18);
                        if (true != z10) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb2.toString());
                    } else if (z10) {
                        n10 = n10;
                        jArrCopyOf = jArrCopyOf;
                    } else {
                        i16 = 0;
                        iF3 = 0;
                        i15 = 0;
                        i17 = 0;
                        i18 = 0;
                        z10 = false;
                        n10 = n10;
                        jArrCopyOf = jArrCopyOf;
                        int i27 = n10.f30147a;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("Inconsistent stbl box for track ");
                        sb3.append(i27);
                        sb3.append(": remainingSynchronizationSamples ");
                        sb3.append(iF3);
                        sb3.append(", remainingSamplesAtTimestampDelta ");
                        sb3.append(i16);
                        sb3.append(", remainingSamplesInChunk ");
                        sb3.append(i15);
                        sb3.append(", remainingTimestampDeltaChanges ");
                        sb3.append(i17);
                        sb3.append(", remainingSamplesAtTimestampOffset ");
                        sb3.append(i18);
                        if (true != z10) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb3.append(str);
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb3.toString());
                    }
                    i17 = i10;
                    i18 = iF5;
                    i16 = 0;
                    int i28 = n10.f30147a;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append("Inconsistent stbl box for track ");
                    sb4.append(i28);
                    sb4.append(": remainingSynchronizationSamples ");
                    sb4.append(iF3);
                    sb4.append(", remainingSamplesAtTimestampDelta ");
                    sb4.append(i16);
                    sb4.append(", remainingSamplesInChunk ");
                    sb4.append(i15);
                    sb4.append(", remainingTimestampDeltaChanges ");
                    sb4.append(i17);
                    sb4.append(", remainingSamplesAtTimestampOffset ");
                    sb4.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb4.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb4.toString());
                } else {
                    iF3 = 0;
                    n10 = n10;
                    z10 = z10;
                    jArrCopyOf = jArrCopyOf;
                    i15 = i14;
                    i16 = iF8;
                    i17 = i10;
                    i18 = iF5;
                    int i29 = n10.f30147a;
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append("Inconsistent stbl box for track ");
                    sb5.append(i29);
                    sb5.append(": remainingSynchronizationSamples ");
                    sb5.append(iF3);
                    sb5.append(", remainingSamplesAtTimestampDelta ");
                    sb5.append(i16);
                    sb5.append(", remainingSamplesInChunk ");
                    sb5.append(i15);
                    sb5.append(", remainingTimestampDeltaChanges ");
                    sb5.append(i17);
                    sb5.append(", remainingSamplesAtTimestampOffset ");
                    sb5.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb5.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb5.toString());
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                jArr2 = jArrCopyOf2;
                j11 = j16;
                i19 = i13;
                iB = iB;
                iArr2 = iArrCopyOf2;
            } else if (iF == 0 && iF3 == 0) {
                int i30 = c4097j3.f36538a;
                long[] jArr5 = new long[i30];
                int[] iArr5 = new int[i30];
                while (c4097j3.a()) {
                    int i31 = c4097j3.f36539b;
                    jArr5[i31] = c4097j3.f36541d;
                    iArr5[i31] = c4097j3.f36540c;
                }
                long j17 = iF9;
                int i32 = 8192 / iA;
                int i33 = 0;
                for (int i34 = 0; i34 < i30; i34++) {
                    int i35 = iArr5[i34];
                    int i36 = com.google.android.gms.internal.ads.EW.f27061a;
                    i33 += ((i35 + i32) - 1) / i32;
                }
                long[] jArr6 = new long[i33];
                int[] iArr6 = new int[i33];
                long[] jArr7 = new long[i33];
                int[] iArr7 = new int[i33];
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                while (i38 < i30) {
                    int i41 = iArr5[i38];
                    long j18 = jArr5[i38];
                    int i42 = i40;
                    int i43 = i30;
                    int iMax = i39;
                    int i44 = i42;
                    long[] jArr8 = jArr5;
                    int i45 = i41;
                    while (i45 > 0) {
                        int iMin = java.lang.Math.min(i32, i45);
                        jArr6[i44] = j18;
                        int[] iArr8 = iArr5;
                        int i46 = iA * iMin;
                        iArr6[i44] = i46;
                        iMax = java.lang.Math.max(iMax, i46);
                        jArr7[i44] = ((long) i37) * j17;
                        iArr7[i44] = 1;
                        j18 += (long) iArr6[i44];
                        i37 += iMin;
                        i45 -= iMin;
                        i44++;
                        iA = iA;
                        i32 = i32;
                        iArr5 = iArr8;
                    }
                    i38++;
                    i32 = i32;
                    jArr5 = jArr8;
                    iArr5 = iArr5;
                    int i47 = i44;
                    i39 = iMax;
                    i30 = i43;
                    i40 = i47;
                }
                j11 = j17 * ((long) i37);
                jArr = jArr6;
                iArr = iArr6;
                jArr2 = jArr7;
                n10 = n11;
                i19 = i39;
                iArr2 = iArr7;
            } else {
                iF7 = 0;
                jArrCopyOf = new long[iB];
                iArrCopyOf = new int[iB];
                jArrCopyOf2 = new long[iB];
                iArrCopyOf2 = new int[iB];
                i10 = iF7;
                n10 = n11;
                iF4 = iF2;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                j6 = 0;
                j10 = 0;
                iF5 = 0;
                while (true) {
                    if (i12 >= iB) {
                        iF8 = iF8;
                        break;
                    }
                    j12 = j6;
                    zA = true;
                    while (true) {
                        if (i14 != 0) {
                            i20 = i14;
                            break;
                        }
                        zA = c4097j3.a();
                        if (!zA) {
                            i20 = 0;
                            break;
                        }
                        int i210 = iF8;
                        long j19 = c4097j3.f36541d;
                        i14 = c4097j3.f36540c;
                        j12 = j19;
                        iF8 = i210;
                        iF9 = iF9;
                        iB = iB;
                    }
                    if (!zA) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i12);
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i12);
                        jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i12);
                        iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i12);
                        iB = i12;
                        break;
                    }
                    iW = i11;
                    if (c5128sR4 != null) {
                        while (iF5 == 0) {
                            if (iF <= 0) {
                                iF5 = 0;
                                break;
                            }
                            iF--;
                            iF5 = c5128sR4.F();
                            iW = c5128sR4.w();
                        }
                        iF5--;
                    }
                    jArrCopyOf[i12] = j12;
                    iC = c5086s3.c();
                    iArrCopyOf[i12] = iC;
                    if (iC > i13) {
                        i21 = iC;
                    } else {
                        i21 = i13;
                    }
                    jArrCopyOf2[i12] = j10 + ((long) iW);
                    if (c5128sR3 == null) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    iArrCopyOf2[i12] = i22;
                    if (i12 == iF4) {
                        iArrCopyOf2[i12] = 1;
                        iF3--;
                        if (iF3 > 0) {
                            c5128sR3.getClass();
                            iF4 = c5128sR3.F() - 1;
                        }
                    }
                    com.google.android.gms.internal.ads.C5128sR c5128sR6 = c5128sR3;
                    iW2 = iF9;
                    long[] jArr9 = jArrCopyOf2;
                    j10 += (long) iW2;
                    iF6 = iF8 - 1;
                    if (iF6 == 0) {
                        if (i10 > 0) {
                            iF6 = c5128sR2.F();
                            i10--;
                            iW2 = c5128sR2.w();
                        } else {
                            iF6 = 0;
                        }
                    }
                    long[] jArr10 = jArrCopyOf;
                    long j110 = j12 + ((long) iArrCopyOf[i12]);
                    i14 = i20 - 1;
                    i12++;
                    iF9 = iW2;
                    jArrCopyOf2 = jArr9;
                    iB = iB;
                    i13 = i21;
                    i11 = iW;
                    iF8 = iF6;
                    c5128sR3 = c5128sR6;
                    j6 = j110;
                    jArrCopyOf = jArr10;
                    iArrCopyOf = iArrCopyOf;
                }
                long j111 = j10 + ((long) i11);
                if (c5128sR4 == null) {
                    z10 = true;
                    break;
                }
                while (true) {
                    if (iF <= 0) {
                        z10 = true;
                        break;
                    }
                    if (c5128sR4.F() != 0) {
                        z10 = false;
                        break;
                    }
                    c5128sR4.w();
                    iF--;
                }
                if (iF3 != 0) {
                    n10 = n10;
                    z10 = z10;
                    jArrCopyOf = jArrCopyOf;
                    i15 = i14;
                    i16 = iF8;
                    i17 = i10;
                    i18 = iF5;
                    int i211 = n10.f30147a;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("Inconsistent stbl box for track ");
                    sb6.append(i211);
                    sb6.append(": remainingSynchronizationSamples ");
                    sb6.append(iF3);
                    sb6.append(", remainingSamplesAtTimestampDelta ");
                    sb6.append(i16);
                    sb6.append(", remainingSamplesInChunk ");
                    sb6.append(i15);
                    sb6.append(", remainingTimestampDeltaChanges ");
                    sb6.append(i17);
                    sb6.append(", remainingSamplesAtTimestampOffset ");
                    sb6.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb6.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb6.toString());
                } else if (iF8 == 0) {
                    if (i14 != 0) {
                        iF3 = 0;
                        i15 = i14;
                    } else if (i10 != 0) {
                        iF3 = 0;
                        i15 = 0;
                    } else if (iF5 != 0) {
                        iF3 = 0;
                        i15 = 0;
                        i17 = 0;
                        n10 = n10;
                        z10 = z10;
                        jArrCopyOf = jArrCopyOf;
                        i18 = iF5;
                        i16 = 0;
                        int i212 = n10.f30147a;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("Inconsistent stbl box for track ");
                        sb7.append(i212);
                        sb7.append(": remainingSynchronizationSamples ");
                        sb7.append(iF3);
                        sb7.append(", remainingSamplesAtTimestampDelta ");
                        sb7.append(i16);
                        sb7.append(", remainingSamplesInChunk ");
                        sb7.append(i15);
                        sb7.append(", remainingTimestampDeltaChanges ");
                        sb7.append(i17);
                        sb7.append(", remainingSamplesAtTimestampOffset ");
                        sb7.append(i18);
                        if (true != z10) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb7.append(str);
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb7.toString());
                    } else if (z10) {
                        i16 = 0;
                        iF3 = 0;
                        i15 = 0;
                        i17 = 0;
                        i18 = 0;
                        z10 = false;
                        n10 = n10;
                        jArrCopyOf = jArrCopyOf;
                        int i213 = n10.f30147a;
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append("Inconsistent stbl box for track ");
                        sb8.append(i213);
                        sb8.append(": remainingSynchronizationSamples ");
                        sb8.append(iF3);
                        sb8.append(", remainingSamplesAtTimestampDelta ");
                        sb8.append(i16);
                        sb8.append(", remainingSamplesInChunk ");
                        sb8.append(i15);
                        sb8.append(", remainingTimestampDeltaChanges ");
                        sb8.append(i17);
                        sb8.append(", remainingSamplesAtTimestampOffset ");
                        sb8.append(i18);
                        if (true != z10) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sb8.append(str);
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb8.toString());
                    } else {
                        n10 = n10;
                        jArrCopyOf = jArrCopyOf;
                    }
                    i17 = i10;
                    i18 = iF5;
                    i16 = 0;
                    int i214 = n10.f30147a;
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append("Inconsistent stbl box for track ");
                    sb9.append(i214);
                    sb9.append(": remainingSynchronizationSamples ");
                    sb9.append(iF3);
                    sb9.append(", remainingSamplesAtTimestampDelta ");
                    sb9.append(i16);
                    sb9.append(", remainingSamplesInChunk ");
                    sb9.append(i15);
                    sb9.append(", remainingTimestampDeltaChanges ");
                    sb9.append(i17);
                    sb9.append(", remainingSamplesAtTimestampOffset ");
                    sb9.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb9.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb9.toString());
                } else {
                    iF3 = 0;
                    n10 = n10;
                    z10 = z10;
                    jArrCopyOf = jArrCopyOf;
                    i15 = i14;
                    i16 = iF8;
                    i17 = i10;
                    i18 = iF5;
                    int i215 = n10.f30147a;
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append("Inconsistent stbl box for track ");
                    sb10.append(i215);
                    sb10.append(": remainingSynchronizationSamples ");
                    sb10.append(iF3);
                    sb10.append(", remainingSamplesAtTimestampDelta ");
                    sb10.append(i16);
                    sb10.append(", remainingSamplesInChunk ");
                    sb10.append(i15);
                    sb10.append(", remainingTimestampDeltaChanges ");
                    sb10.append(i17);
                    sb10.append(", remainingSamplesAtTimestampOffset ");
                    sb10.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb10.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb10.toString());
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                jArr2 = jArrCopyOf2;
                j11 = j111;
                i19 = i13;
                iB = iB;
                iArr2 = iArrCopyOf2;
            }
        } else {
            jArrCopyOf = new long[iB];
            iArrCopyOf = new int[iB];
            jArrCopyOf2 = new long[iB];
            iArrCopyOf2 = new int[iB];
            i10 = iF7;
            n10 = n11;
            iF4 = iF2;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            j6 = 0;
            j10 = 0;
            iF5 = 0;
            while (true) {
                if (i12 >= iB) {
                    iF8 = iF8;
                    break;
                }
                j12 = j6;
                zA = true;
                while (true) {
                    if (i14 != 0) {
                        i20 = i14;
                        break;
                    }
                    zA = c4097j3.a();
                    if (!zA) {
                        i20 = 0;
                        break;
                    }
                    int i216 = iF8;
                    long j112 = c4097j3.f36541d;
                    i14 = c4097j3.f36540c;
                    j12 = j112;
                    iF8 = i216;
                    iF9 = iF9;
                    iB = iB;
                }
                if (!zA) {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i12);
                    iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i12);
                    jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i12);
                    iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i12);
                    iB = i12;
                    break;
                }
                iW = i11;
                if (c5128sR4 != null) {
                    while (iF5 == 0) {
                        if (iF <= 0) {
                            iF5 = 0;
                            break;
                        }
                        iF--;
                        iF5 = c5128sR4.F();
                        iW = c5128sR4.w();
                    }
                    iF5--;
                }
                jArrCopyOf[i12] = j12;
                iC = c5086s3.c();
                iArrCopyOf[i12] = iC;
                if (iC > i13) {
                    i21 = iC;
                } else {
                    i21 = i13;
                }
                jArrCopyOf2[i12] = j10 + ((long) iW);
                if (c5128sR3 == null) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                iArrCopyOf2[i12] = i22;
                if (i12 == iF4) {
                    iArrCopyOf2[i12] = 1;
                    iF3--;
                    if (iF3 > 0) {
                        c5128sR3.getClass();
                        iF4 = c5128sR3.F() - 1;
                    }
                }
                com.google.android.gms.internal.ads.C5128sR c5128sR7 = c5128sR3;
                iW2 = iF9;
                long[] jArr11 = jArrCopyOf2;
                j10 += (long) iW2;
                iF6 = iF8 - 1;
                if (iF6 == 0) {
                    if (i10 > 0) {
                        iF6 = c5128sR2.F();
                        i10--;
                        iW2 = c5128sR2.w();
                    } else {
                        iF6 = 0;
                    }
                }
                long[] jArr12 = jArrCopyOf;
                long j113 = j12 + ((long) iArrCopyOf[i12]);
                i14 = i20 - 1;
                i12++;
                iF9 = iW2;
                jArrCopyOf2 = jArr11;
                iB = iB;
                i13 = i21;
                i11 = iW;
                iF8 = iF6;
                c5128sR3 = c5128sR7;
                j6 = j113;
                jArrCopyOf = jArr12;
                iArrCopyOf = iArrCopyOf;
            }
            long j114 = j10 + ((long) i11);
            if (c5128sR4 == null) {
                z10 = true;
                break;
            }
            while (true) {
                if (iF <= 0) {
                    z10 = true;
                    break;
                }
                if (c5128sR4.F() != 0) {
                    z10 = false;
                    break;
                }
                c5128sR4.w();
                iF--;
            }
            if (iF3 != 0) {
                n10 = n10;
                z10 = z10;
                jArrCopyOf = jArrCopyOf;
                i15 = i14;
                i16 = iF8;
                i17 = i10;
                i18 = iF5;
                int i217 = n10.f30147a;
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append("Inconsistent stbl box for track ");
                sb11.append(i217);
                sb11.append(": remainingSynchronizationSamples ");
                sb11.append(iF3);
                sb11.append(", remainingSamplesAtTimestampDelta ");
                sb11.append(i16);
                sb11.append(", remainingSamplesInChunk ");
                sb11.append(i15);
                sb11.append(", remainingTimestampDeltaChanges ");
                sb11.append(i17);
                sb11.append(", remainingSamplesAtTimestampOffset ");
                sb11.append(i18);
                if (true != z10) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb11.append(str);
                com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb11.toString());
            } else if (iF8 == 0) {
                if (i14 != 0) {
                    iF3 = 0;
                    i15 = i14;
                } else if (i10 != 0) {
                    iF3 = 0;
                    i15 = 0;
                } else if (iF5 != 0) {
                    iF3 = 0;
                    i15 = 0;
                    i17 = 0;
                    n10 = n10;
                    z10 = z10;
                    jArrCopyOf = jArrCopyOf;
                    i18 = iF5;
                    i16 = 0;
                    int i218 = n10.f30147a;
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append("Inconsistent stbl box for track ");
                    sb12.append(i218);
                    sb12.append(": remainingSynchronizationSamples ");
                    sb12.append(iF3);
                    sb12.append(", remainingSamplesAtTimestampDelta ");
                    sb12.append(i16);
                    sb12.append(", remainingSamplesInChunk ");
                    sb12.append(i15);
                    sb12.append(", remainingTimestampDeltaChanges ");
                    sb12.append(i17);
                    sb12.append(", remainingSamplesAtTimestampOffset ");
                    sb12.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb12.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb12.toString());
                } else if (z10) {
                    i16 = 0;
                    iF3 = 0;
                    i15 = 0;
                    i17 = 0;
                    i18 = 0;
                    z10 = false;
                    n10 = n10;
                    jArrCopyOf = jArrCopyOf;
                    int i219 = n10.f30147a;
                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                    sb13.append("Inconsistent stbl box for track ");
                    sb13.append(i219);
                    sb13.append(": remainingSynchronizationSamples ");
                    sb13.append(iF3);
                    sb13.append(", remainingSamplesAtTimestampDelta ");
                    sb13.append(i16);
                    sb13.append(", remainingSamplesInChunk ");
                    sb13.append(i15);
                    sb13.append(", remainingTimestampDeltaChanges ");
                    sb13.append(i17);
                    sb13.append(", remainingSamplesAtTimestampOffset ");
                    sb13.append(i18);
                    if (true != z10) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sb13.append(str);
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb13.toString());
                } else {
                    n10 = n10;
                    jArrCopyOf = jArrCopyOf;
                }
                i17 = i10;
                i18 = iF5;
                i16 = 0;
                int i2110 = n10.f30147a;
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                sb14.append("Inconsistent stbl box for track ");
                sb14.append(i2110);
                sb14.append(": remainingSynchronizationSamples ");
                sb14.append(iF3);
                sb14.append(", remainingSamplesAtTimestampDelta ");
                sb14.append(i16);
                sb14.append(", remainingSamplesInChunk ");
                sb14.append(i15);
                sb14.append(", remainingTimestampDeltaChanges ");
                sb14.append(i17);
                sb14.append(", remainingSamplesAtTimestampOffset ");
                sb14.append(i18);
                if (true != z10) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb14.append(str);
                com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb14.toString());
            } else {
                iF3 = 0;
                n10 = n10;
                z10 = z10;
                jArrCopyOf = jArrCopyOf;
                i15 = i14;
                i16 = iF8;
                i17 = i10;
                i18 = iF5;
                int i2111 = n10.f30147a;
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                sb15.append("Inconsistent stbl box for track ");
                sb15.append(i2111);
                sb15.append(": remainingSynchronizationSamples ");
                sb15.append(iF3);
                sb15.append(", remainingSamplesAtTimestampDelta ");
                sb15.append(i16);
                sb15.append(", remainingSamplesInChunk ");
                sb15.append(i15);
                sb15.append(", remainingTimestampDeltaChanges ");
                sb15.append(i17);
                sb15.append(", remainingSamplesAtTimestampOffset ");
                sb15.append(i18);
                if (true != z10) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb15.append(str);
                com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", sb15.toString());
            }
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            jArr2 = jArrCopyOf2;
            j11 = j114;
            i19 = i13;
            iB = iB;
            iArr2 = iArrCopyOf2;
        }
        long j20 = n10.f30149c;
        java.math.RoundingMode roundingMode = java.math.RoundingMode.DOWN;
        long jM = com.google.android.gms.internal.ads.EW.M(j11, 1000000L, j20, roundingMode);
        long[] jArr13 = n10.f30155i;
        if (jArr13 == null) {
            com.google.android.gms.internal.ads.EW.f(jArr2, 1000000L, n10.f30149c);
            return new com.google.android.gms.internal.ads.Q3(n10, jArr, iArr, i19, jArr2, iArr2, jM);
        }
        com.google.android.gms.internal.ads.N3 n12 = n10;
        int[] iArr9 = iArr2;
        if (jArr13.length == 1 && n12.f30148b == 1 && (length = jArr2.length) >= 2) {
            long[] jArr14 = n12.f30156j;
            jArr14.getClass();
            long j21 = jArr14[0];
            long jM2 = j21 + com.google.android.gms.internal.ads.EW.M(jArr13[0], n12.f30149c, n12.f30150d, roundingMode);
            int i48 = length - 1;
            int iMax2 = java.lang.Math.max(0, java.lang.Math.min(4, i48));
            int iMax3 = java.lang.Math.max(0, java.lang.Math.min(length - 4, i48));
            long j22 = jArr2[0];
            if (j22 <= j21 && j21 < jArr2[iMax2] && jArr2[iMax3] < jM2 && jM2 <= j11) {
                long jM3 = com.google.android.gms.internal.ads.EW.M(j21 - j22, n12.f30153g.f26552E, n12.f30149c, roundingMode);
                long jM4 = com.google.android.gms.internal.ads.EW.M(j11 - jM2, n12.f30153g.f26552E, n12.f30149c, roundingMode);
                if (jM3 != 0) {
                    if (jM3 <= 2147483647L && jM4 <= 2147483647L) {
                        i6.f28363a = (int) jM3;
                        i6.f28364b = (int) jM4;
                        com.google.android.gms.internal.ads.EW.f(jArr2, 1000000L, n12.f30149c);
                        return new com.google.android.gms.internal.ads.Q3(n12, jArr, iArr, i19, jArr2, iArr9, com.google.android.gms.internal.ads.EW.M(n12.f30155i[0], 1000000L, n12.f30150d, roundingMode));
                    }
                } else if (jM4 != 0) {
                    jM3 = 0;
                    if (jM3 <= 2147483647L) {
                        i6.f28363a = (int) jM3;
                        i6.f28364b = (int) jM4;
                        com.google.android.gms.internal.ads.EW.f(jArr2, 1000000L, n12.f30149c);
                        return new com.google.android.gms.internal.ads.Q3(n12, jArr, iArr, i19, jArr2, iArr9, com.google.android.gms.internal.ads.EW.M(n12.f30155i[0], 1000000L, n12.f30150d, roundingMode));
                    }
                }
            }
        }
        long[] jArr15 = n12.f30155i;
        int length2 = jArr15.length;
        if (length2 == 1) {
            if (jArr15[0] == 0) {
                long[] jArr16 = n12.f30156j;
                jArr16.getClass();
                long j23 = jArr16[0];
                for (int i49 = 0; i49 < jArr2.length; i49++) {
                    jArr2[i49] = com.google.android.gms.internal.ads.EW.M(jArr2[i49] - j23, 1000000L, n12.f30149c, java.math.RoundingMode.DOWN);
                }
                return new com.google.android.gms.internal.ads.Q3(n12, jArr, iArr, i19, jArr2, iArr9, com.google.android.gms.internal.ads.EW.M(j11 - j23, 1000000L, n12.f30149c, java.math.RoundingMode.DOWN));
            }
            length2 = 1;
        }
        boolean z12 = n12.f30148b == 1;
        long[] jArr17 = n12.f30156j;
        int[] iArr10 = new int[length2];
        int[] iArr11 = new int[length2];
        jArr17.getClass();
        int i50 = 0;
        boolean z13 = false;
        int iS = 0;
        int i51 = 0;
        while (true) {
            long[] jArr18 = n12.f30155i;
            i23 = i19;
            iArr3 = iArr;
            if (i51 >= jArr18.length) {
                break;
            }
            long j24 = jArr17[i51];
            if (j24 != -1) {
                boolean z14 = z13;
                int i52 = iS;
                long jM5 = com.google.android.gms.internal.ads.EW.M(jArr18[i51], n12.f30149c, n12.f30150d, java.math.RoundingMode.DOWN);
                iArr10[i51] = com.google.android.gms.internal.ads.EW.v(jArr2, j24, true, true);
                while (true) {
                    int i53 = iArr10[i51];
                    if (i53 < 0 || (iArr9[i53] & 1) != 0) {
                        break;
                    }
                    iArr10[i51] = i53 - 1;
                }
                long j25 = j24 + jM5;
                iS = com.google.android.gms.internal.ads.EW.s(jArr2, j25, z12, false);
                iArr11[i51] = iS;
                if (n12.f30148b == 2) {
                    while (true) {
                        iS = iArr11[i51];
                        if (iS >= jArr2.length - 1) {
                            break;
                        }
                        int i54 = iS + 1;
                        if (jArr2[i54] > j25) {
                            break;
                        }
                        iArr11[i51] = i54;
                    }
                }
                int i55 = iArr10[i51];
                i50 += iS - i55;
                z11 = z14 | (i52 != i55);
            } else {
                z11 = z13;
            }
            i51++;
            i19 = i23;
            z13 = z11;
            jArr = jArr;
            iArr = iArr3;
        }
        long[] jArr19 = jArr;
        boolean z15 = z13 | (i50 != iB);
        long[] jArr20 = z15 ? new long[i50] : jArr19;
        int[] iArr12 = z15 ? new int[i50] : iArr3;
        int i56 = true == z15 ? 0 : i23;
        int[] iArr13 = z15 ? new int[i50] : iArr9;
        long[] jArr21 = new long[i50];
        int i57 = i56;
        boolean z16 = false;
        int i58 = 0;
        int i59 = 0;
        long j26 = 0;
        while (i59 < n12.f30155i.length) {
            long j27 = n12.f30156j[i59];
            int i60 = iArr10[i59];
            int i61 = iArr11[i59];
            int[] iArr14 = iArr10;
            if (z15) {
                int i62 = i61 - i60;
                java.lang.System.arraycopy(jArr19, i60, jArr20, i58, i62);
                iArr4 = iArr3;
                java.lang.System.arraycopy(iArr4, i60, iArr12, i58, i62);
                java.lang.System.arraycopy(iArr9, i60, iArr13, i58, i62);
            } else {
                iArr4 = iArr3;
            }
            while (i60 < i61) {
                int[] iArr15 = iArr9;
                int i63 = i59;
                long j28 = n12.f30150d;
                java.math.RoundingMode roundingMode2 = java.math.RoundingMode.DOWN;
                long jM6 = com.google.android.gms.internal.ads.EW.M(j26, 1000000L, j28, roundingMode2);
                int[] iArr16 = iArr4;
                long jM7 = com.google.android.gms.internal.ads.EW.M(jArr2[i60] - j27, 1000000L, n12.f30149c, roundingMode2);
                z16 = (!(jM7 >= 0)) | z16;
                jArr21[i58] = jM6 + jM7;
                if (z15 && iArr12[i58] > i57) {
                    i57 = iArr16[i60];
                }
                i58++;
                i60++;
                iArr9 = iArr15;
                iArr4 = iArr16;
                i59 = i63;
            }
            iArr3 = iArr4;
            int i64 = i59;
            j26 += n12.f30155i[i64];
            i59 = i64 + 1;
            iArr9 = iArr9;
            iArr10 = iArr14;
            iArr11 = iArr11;
        }
        long jM8 = com.google.android.gms.internal.ads.EW.M(j26, 1000000L, n12.f30150d, java.math.RoundingMode.DOWN);
        if (z16) {
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B2 = n12.f30153g.b();
            c4682oK0B2.j(true);
            n3A = n12.a(c4682oK0B2.H());
        } else {
            n3A = n12;
        }
        return new com.google.android.gms.internal.ads.Q3(n3A, jArr20, iArr12, i57, jArr21, iArr13, jM8);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.List f(com.google.android.gms.internal.ads.C4257kZ r72, com.google.android.gms.internal.ads.I0 r73, long r74, com.google.android.gms.internal.ads.EH0 r76, boolean r77, boolean r78, com.google.android.gms.internal.ads.InterfaceC4821pg0 r79) {
        /*
            Method dump skipped, instruction units count: 3568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC5416v3.f(com.google.android.gms.internal.ads.kZ, com.google.android.gms.internal.ads.I0, long, com.google.android.gms.internal.ads.EH0, boolean, boolean, com.google.android.gms.internal.ads.pg0):java.util.List");
    }

    public static void g(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iT = c5128sR.t();
        c5128sR.m(4);
        if (c5128sR.w() != 1751411826) {
            iT += 4;
        }
        c5128sR.l(iT);
    }

    private static int h(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iC = c5128sR.C();
        int i6 = iC & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        while ((iC & 128) == 128) {
            iC = c5128sR.C();
            i6 = (i6 << 7) | (iC & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
        }
        return i6;
    }

    private static int i(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        c5128sR.l(16);
        return c5128sR.w();
    }

    private static android.util.Pair j(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.O3 o6;
        android.util.Pair pairCreate;
        int i11;
        int i12;
        byte[] bArr;
        int iT = c5128sR.t();
        while (iT - i6 < i10) {
            c5128sR.l(iT);
            int iW = c5128sR.w();
            com.google.android.gms.internal.ads.AbstractC5630x0.b(iW > 0, "childAtomSize must be positive");
            if (c5128sR.w() == 1936289382) {
                int i13 = iT + 8;
                int i14 = 0;
                int i15 = -1;
                java.lang.String strB = null;
                java.lang.Integer numValueOf = null;
                while (i13 - iT < iW) {
                    c5128sR.l(i13);
                    int iW2 = c5128sR.w();
                    int iW3 = c5128sR.w();
                    if (iW3 == 1718775137) {
                        numValueOf = java.lang.Integer.valueOf(c5128sR.w());
                    } else if (iW3 == 1935894637) {
                        c5128sR.m(4);
                        strB = c5128sR.b(4, java.nio.charset.StandardCharsets.UTF_8);
                    } else if (iW3 == 1935894633) {
                        i15 = i13;
                        i14 = iW2;
                    }
                    i13 += iW2;
                }
                if ("cenc".equals(strB) || "cbc1".equals(strB) || "cens".equals(strB) || "cbcs".equals(strB)) {
                    com.google.android.gms.internal.ads.AbstractC5630x0.b(numValueOf != null, "frma atom is mandatory");
                    com.google.android.gms.internal.ads.AbstractC5630x0.b(i15 != -1, "schi atom is mandatory");
                    int i16 = i15 + 8;
                    while (true) {
                        if (i16 - i15 >= i14) {
                            o6 = null;
                            break;
                        }
                        c5128sR.l(i16);
                        int iW4 = c5128sR.w();
                        if (c5128sR.w() == 1952804451) {
                            int iA = a(c5128sR.w());
                            c5128sR.m(1);
                            if (iA == 0) {
                                c5128sR.m(1);
                                i11 = 0;
                                i12 = 0;
                            } else {
                                int iC = c5128sR.C();
                                int i17 = (iC & 240) >> 4;
                                i11 = iC & 15;
                                i12 = i17;
                            }
                            boolean z6 = c5128sR.C() == 1;
                            int iC2 = c5128sR.C();
                            byte[] bArr2 = new byte[16];
                            c5128sR.h(bArr2, 0, 16);
                            if (z6 && iC2 == 0) {
                                int iC3 = c5128sR.C();
                                byte[] bArr3 = new byte[iC3];
                                c5128sR.h(bArr3, 0, iC3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            o6 = new com.google.android.gms.internal.ads.O3(z6, strB, iC2, bArr2, i12, i11, bArr);
                            break;
                        }
                        i16 += iW4;
                    }
                    com.google.android.gms.internal.ads.AbstractC5630x0.b(o6 != null, "tenc atom is mandatory");
                    int i18 = com.google.android.gms.internal.ads.EW.f27061a;
                    pairCreate = android.util.Pair.create(numValueOf, o6);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iT += iW;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146 A[PHI: r3
  0x0146: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:71:0x0138, B:72:0x013a, B:77:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    private static com.google.android.gms.internal.ads.PA0 k(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iD;
        int iD2;
        java.lang.String str;
        com.google.android.gms.internal.ads.Oz0 oz0 = new com.google.android.gms.internal.ads.Oz0();
        byte[] bArrN = c5128sR.n();
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArrN, bArrN.length);
        rq.l(c5128sR.t() * 8);
        rq.o(1);
        int iD3 = rq.d(3);
        rq.n(6);
        boolean zP = rq.p();
        boolean zP2 = rq.p();
        int i6 = 10;
        boolean z6 = false;
        if (iD3 == 2) {
            if (!zP) {
                zP = false;
                iD3 = 2;
                if (iD3 <= 2) {
                    if (true != zP) {
                        i6 = 8;
                    }
                }
            } else if (true == zP2) {
                i6 = 12;
            }
            oz0.f(i6);
            oz0.a(i6);
        } else if (iD3 <= 2) {
            if (true != zP) {
                i6 = 8;
            }
            oz0.f(i6);
            oz0.a(i6);
        }
        int i10 = 13;
        rq.n(13);
        rq.m();
        int iD4 = rq.d(4);
        if (iD4 != 1) {
            str = "Unsupported obu_type: " + iD4;
        } else if (rq.p()) {
            str = "Unsupported obu_extension_flag";
        } else {
            boolean zP3 = rq.p();
            rq.m();
            if (!zP3 || rq.d(8) <= 127) {
                int iD5 = rq.d(3);
                rq.m();
                if (rq.p()) {
                    str = "Unsupported reduced_still_picture_header";
                } else if (rq.p()) {
                    str = "Unsupported timing_info_present_flag";
                } else {
                    if (!rq.p()) {
                        int iD6 = rq.d(5);
                        for (int i11 = 0; i11 <= iD6; i11++) {
                            rq.n(12);
                            if (rq.d(5) > 7) {
                                rq.m();
                            }
                        }
                        int iD7 = rq.d(4);
                        int iD8 = rq.d(4);
                        rq.n(iD7 + 1);
                        rq.n(iD8 + 1);
                        if (rq.p()) {
                            rq.n(7);
                        }
                        rq.n(7);
                        boolean zP4 = rq.p();
                        if (zP4) {
                            rq.n(2);
                        }
                        if ((rq.p() || rq.d(1) > 0) && !rq.p()) {
                            rq.n(1);
                        }
                        if (zP4) {
                            rq.n(3);
                        }
                        rq.n(3);
                        boolean zP5 = rq.p();
                        if (iD5 != 2) {
                            if (iD5 != 1) {
                            }
                            if (rq.p()) {
                                int iD9 = rq.d(8);
                                iD = rq.d(8);
                                int iD10 = rq.d(8);
                                if (!z6 || iD9 != 1) {
                                    i10 = iD;
                                    iD2 = rq.d(1);
                                } else if (iD != 13) {
                                    iD9 = 1;
                                    i10 = iD;
                                    iD2 = rq.d(1);
                                } else if (iD10 == 0) {
                                    iD2 = 1;
                                    iD9 = 1;
                                } else {
                                    iD9 = 1;
                                    iD2 = rq.d(1);
                                }
                                oz0.c(com.google.android.gms.internal.ads.PA0.a(iD9));
                                oz0.b(iD2 != 1 ? 2 : 1);
                                oz0.d(com.google.android.gms.internal.ads.PA0.b(i10));
                            }
                            return oz0.g();
                        }
                        if (zP5) {
                            rq.m();
                        }
                        if (rq.p()) {
                            z6 = true;
                        }
                        if (rq.p()) {
                            int iD11 = rq.d(8);
                            iD = rq.d(8);
                            int iD12 = rq.d(8);
                            if (!z6) {
                                i10 = iD;
                                iD2 = rq.d(1);
                            } else {
                                i10 = iD;
                                iD2 = rq.d(1);
                            }
                            oz0.c(com.google.android.gms.internal.ads.PA0.a(iD11));
                            oz0.b(iD2 != 1 ? 2 : 1);
                            oz0.d(com.google.android.gms.internal.ads.PA0.b(i10));
                        }
                        return oz0.g();
                    }
                    str = "Unsupported initial_display_delay_present_flag";
                }
            } else {
                str = "Excessive obu_size";
            }
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.e("BoxParsers", str);
        return oz0.g();
    }

    private static com.google.android.gms.internal.ads.C2227Cb l(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        short sE = c5128sR.e();
        c5128sR.m(2);
        java.lang.String strB = c5128sR.b(sE, java.nio.charset.StandardCharsets.UTF_8);
        int iMax = java.lang.Math.max(strB.lastIndexOf(43), strB.lastIndexOf(45));
        try {
            return new com.google.android.gms.internal.ads.C2227Cb(-9223372036854775807L, new com.google.android.gms.internal.ads.C5195t20(java.lang.Float.parseFloat(strB.substring(0, iMax)), java.lang.Float.parseFloat(strB.substring(iMax, strB.length() - 1))));
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.C4317l3 m(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        c5128sR.l(i6 + 12);
        c5128sR.m(1);
        h(c5128sR);
        c5128sR.m(2);
        int iC = c5128sR.C();
        if ((iC & 128) != 0) {
            c5128sR.m(2);
        }
        if ((iC & 64) != 0) {
            c5128sR.m(c5128sR.C());
        }
        if ((iC & 32) != 0) {
            c5128sR.m(2);
        }
        c5128sR.m(1);
        h(c5128sR);
        java.lang.String strD = com.google.android.gms.internal.ads.AbstractC3606ed.d(c5128sR.C());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new com.google.android.gms.internal.ads.C4317l3(strD, null, -1L, -1L);
        }
        c5128sR.m(4);
        long jK = c5128sR.K();
        long jK2 = c5128sR.K();
        c5128sR.m(1);
        int iH = h(c5128sR);
        byte[] bArr = new byte[iH];
        c5128sR.h(bArr, 0, iH);
        return new com.google.android.gms.internal.ads.C4317l3(strD, bArr, jK2 <= 0 ? -1L : jK2, jK > 0 ? jK : -1L);
    }

    private static java.nio.ByteBuffer n() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:247:0x0518 A[PHI: r1 r14 r23
  0x0518: PHI (r1v55 java.lang.String) = (r1v48 java.lang.String), (r1v56 java.lang.String), (r1v48 java.lang.String), (r1v48 java.lang.String) binds: [B:222:0x0482, B:224:0x0490, B:220:0x0458, B:219:0x0454] A[DONT_GENERATE, DONT_INLINE]
  0x0518: PHI (r14v7 int) = (r34v1 int), (r34v1 int), (r14v9 int), (r14v10 int) binds: [B:222:0x0482, B:224:0x0490, B:220:0x0458, B:219:0x0454] A[DONT_GENERATE, DONT_INLINE]
  0x0518: PHI (r23v2 com.google.android.gms.internal.ads.l3) = 
  (r23v1 com.google.android.gms.internal.ads.l3)
  (r23v3 com.google.android.gms.internal.ads.l3)
  (r23v1 com.google.android.gms.internal.ads.l3)
  (r23v1 com.google.android.gms.internal.ads.l3)
 binds: [B:222:0x0482, B:224:0x0490, B:220:0x0458, B:219:0x0454] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    private static void o(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10, int i11, int i12, java.lang.String str, boolean z6, com.google.android.gms.internal.ads.EH0 eh0, com.google.android.gms.internal.ads.C4867q3 c4867q3, int i13) throws com.google.android.gms.internal.ads.C4708of {
        int iG;
        int iW;
        int i14;
        int i15;
        int i16;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        com.google.android.gms.internal.ads.D d6;
        java.lang.String str3;
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = c5128sR;
        int i22 = i10;
        int i23 = i11;
        com.google.android.gms.internal.ads.EH0 eh0B = eh0;
        c5128sR2.l(i22 + 16);
        if (z6) {
            iG = c5128sR.G();
            c5128sR2.m(6);
        } else {
            c5128sR2.m(8);
            iG = 0;
        }
        if (iG == 0 || iG == 1) {
            int iG2 = c5128sR.G();
            c5128sR2.m(6);
            int iD = c5128sR.D();
            c5128sR2.l(c5128sR.t() - 4);
            iW = c5128sR.w();
            if (iG == 1) {
                c5128sR2.m(16);
            }
            i14 = iD;
            i15 = iG2;
            i16 = -1;
        } else {
            if (iG != 2) {
                return;
            }
            c5128sR2.m(16);
            int iRound = (int) java.lang.Math.round(java.lang.Double.longBitsToDouble(c5128sR.J()));
            int iF = c5128sR.F();
            c5128sR2.m(4);
            int iF2 = c5128sR.F();
            int iF3 = c5128sR.F();
            int i24 = iF3 & 1;
            int i25 = iF3 & 2;
            if (i24 == 0) {
                if (iF2 == 8) {
                    i16 = 3;
                } else if (iF2 == 16) {
                    i16 = i25 != 0 ? 268435456 : 2;
                } else if (iF2 == 24) {
                    i16 = i25 != 0 ? 1342177280 : 21;
                } else if (iF2 == 32) {
                    i16 = i25 != 0 ? 1610612736 : 22;
                } else {
                    i16 = -1;
                }
            } else if (iF2 == 32) {
                i16 = 4;
            } else {
                i16 = -1;
            }
            c5128sR2.m(8);
            i14 = iRound;
            i15 = iF;
            iW = 0;
        }
        if (i6 == 1767992678) {
            i14 = -1;
        }
        if (i6 == 1767992678) {
            i15 = -1;
        }
        int iT = c5128sR.t();
        int iIntValue = 1701733217;
        if (i6 == 1701733217) {
            android.util.Pair pairJ = j(c5128sR2, i22, i23);
            if (pairJ != null) {
                iIntValue = ((java.lang.Integer) pairJ.first).intValue();
                eh0B = eh0B == null ? null : eh0B.b(((com.google.android.gms.internal.ads.O3) pairJ.second).f30438b);
                c4867q3.f38158a[i13] = (com.google.android.gms.internal.ads.O3) pairJ.second;
            }
            c5128sR2.l(iT);
        } else {
            iIntValue = i6;
        }
        java.lang.String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                i16 = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i16 == -1) {
                    str2 = "audio/raw";
                    i16 = 2;
                }
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
            }
            str2 = "audio/raw";
        } else {
            str2 = "audio/raw";
            i16 = 2;
        }
        int i26 = i16;
        java.util.List listP = null;
        com.google.android.gms.internal.ads.C4317l3 c4317l3M = null;
        java.lang.String str5 = null;
        while (iT - i22 < i23) {
            c5128sR2.l(iT);
            int iW2 = c5128sR.w();
            java.lang.String str6 = "childAtomSize must be positive";
            com.google.android.gms.internal.ads.AbstractC5630x0.b(iW2 > 0, "childAtomSize must be positive");
            int iW3 = c5128sR.w();
            i14 = i14;
            if (iW3 == 1835557187) {
                c5128sR2.l(iT + 8);
                c5128sR2.m(1);
                int iC = c5128sR.C();
                c5128sR2.m(1);
                if (j$.util.Objects.equals(str2, str4)) {
                    i17 = 0;
                    str3 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(iC));
                } else {
                    i17 = 0;
                    str3 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(iC));
                }
                int iG3 = c5128sR.G();
                byte[] bArr = new byte[iG3];
                c5128sR2.h(bArr, i17, iG3);
                listP = listP == null ? com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr) : com.google.android.gms.internal.ads.AbstractC3398ci0.Q(bArr, (byte[]) listP.get(i17));
                str5 = str3;
            } else {
                str4 = str4;
                i17 = 0;
                if (iW3 == 1835557200) {
                    c5128sR2.l(iT + 8);
                    int iC2 = c5128sR.C();
                    if (iC2 > 0) {
                        byte[] bArr2 = new byte[iC2];
                        c5128sR2.h(bArr2, 0, iC2);
                        if (listP == null) {
                            listP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr2);
                        } else {
                            listP = com.google.android.gms.internal.ads.AbstractC3398ci0.Q((byte[]) listP.get(0), bArr2);
                            i14 = i14;
                            i20 = iW;
                        }
                    } else {
                        i14 = i14;
                        i20 = iW;
                        i14 = i14;
                    }
                } else {
                    if (iW3 == 1702061171) {
                        i18 = iT;
                        i19 = -1;
                    } else if (z6 && iW3 == 2002876005) {
                        int iT2 = c5128sR.t();
                        com.google.android.gms.internal.ads.AbstractC5630x0.b(iT2 >= iT, null);
                        while (true) {
                            if (iT2 - iT >= iW2) {
                                i18 = -1;
                                i19 = -1;
                                break;
                            }
                            c5128sR2.l(iT2);
                            int iW4 = c5128sR.w();
                            com.google.android.gms.internal.ads.AbstractC5630x0.b(iW4 > 0, str6);
                            java.lang.String str7 = str6;
                            if (c5128sR.w() == 1702061171) {
                                i18 = iT2;
                                i19 = -1;
                                break;
                            } else {
                                iT2 += iW4;
                                str6 = str7;
                            }
                        }
                    } else {
                        if (iW3 == 1684103987) {
                            c5128sR2.l(iT + 8);
                            d6 = com.google.android.gms.internal.ads.S.c(c5128sR2, java.lang.Integer.toString(i12), str, eh0B);
                        } else if (iW3 == 1684366131) {
                            c5128sR2.l(iT + 8);
                            d6 = com.google.android.gms.internal.ads.S.d(c5128sR2, java.lang.Integer.toString(i12), str, eh0B);
                        } else if (iW3 == 1684103988) {
                            c5128sR2.l(iT + 8);
                            java.lang.String string = java.lang.Integer.toString(i12);
                            int i27 = com.google.android.gms.internal.ads.V.f32322b;
                            c5128sR2.m(1);
                            int iC3 = c5128sR.C() & 32;
                            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                            c4682oK0.m(string);
                            c4682oK0.B("audio/ac4");
                            c4682oK0.r0(2);
                            c4682oK0.C(1 != (iC3 >> 5) ? 44100 : 48000);
                            c4682oK0.f(eh0B);
                            c4682oK0.q(str);
                            c4867q3.f38159b = c4682oK0.H();
                            i14 = i14;
                            i20 = iW;
                            i14 = i14;
                        } else if (iW3 != 1684892784) {
                            if (iW3 == 1684305011 || iW3 == 1969517683) {
                                com.google.android.gms.internal.ads.C4682oK0 c4682oK1 = new com.google.android.gms.internal.ads.C4682oK0();
                                c4682oK1.l(i12);
                                c4682oK1.B(str2);
                                c4682oK1.r0(i15);
                                i14 = i14;
                                c4682oK1.C(i14);
                                c4682oK1.f(eh0B);
                                c4682oK1.q(str);
                                c4867q3.f38159b = c4682oK1.H();
                            } else if (iW3 == 1682927731) {
                                int i28 = iW2 - 8;
                                byte[] bArr3 = f39314a;
                                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + i28);
                                c5128sR2.l(iT + 8);
                                c5128sR2.h(bArrCopyOf, bArr3.length, i28);
                                listP = com.google.android.gms.internal.ads.P0.e(bArrCopyOf);
                                i14 = i14;
                                i20 = iW;
                            } else {
                                if (iW3 == 1684425825) {
                                    byte[] bArr4 = new byte[iW2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    c5128sR2.l(iT + 12);
                                    c5128sR2.h(bArr4, 4, iW2 - 12);
                                    listP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr4);
                                } else if (iW3 == 1634492771) {
                                    int i29 = iW2 - 12;
                                    byte[] bArr5 = new byte[i29];
                                    c5128sR2.l(iT + 12);
                                    c5128sR2.h(bArr5, 0, i29);
                                    int i30 = com.google.android.gms.internal.ads.ND.f30202d;
                                    com.google.android.gms.internal.ads.C5128sR c5128sR3 = new com.google.android.gms.internal.ads.C5128sR(bArr5);
                                    c5128sR3.l(9);
                                    int iC4 = c5128sR3.C();
                                    c5128sR3.l(20);
                                    android.util.Pair pairCreate = android.util.Pair.create(java.lang.Integer.valueOf(c5128sR3.F()), java.lang.Integer.valueOf(iC4));
                                    int iIntValue2 = ((java.lang.Integer) pairCreate.first).intValue();
                                    int iIntValue3 = ((java.lang.Integer) pairCreate.second).intValue();
                                    i14 = iIntValue2;
                                    listP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr5);
                                    i20 = iW;
                                    i15 = iIntValue3;
                                } else if (iW3 == 1767990114) {
                                    c5128sR2.l(iT + 9);
                                    int iB = com.google.android.gms.internal.ads.AbstractC2466Ij0.b(c5128sR.L());
                                    byte[] bArr6 = new byte[iB];
                                    c5128sR2.h(bArr6, 0, iB);
                                    listP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr6);
                                } else {
                                    i14 = i14;
                                }
                                i14 = i14;
                                i20 = iW;
                            }
                            i20 = iW;
                            i14 = i14;
                        } else {
                            if (iW <= 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iW, null);
                            }
                            i14 = iW;
                            i20 = i14;
                            i15 = 2;
                        }
                        c4867q3.f38159b = d6;
                        i14 = i14;
                        i20 = iW;
                        i14 = i14;
                    }
                    if (i18 != i19) {
                        c4317l3M = m(c5128sR2, i18);
                        str2 = c4317l3M.f37058a;
                        byte[] bArr7 = c4317l3M.f37059b;
                        if (bArr7 == null) {
                            i20 = iW;
                        } else if ("audio/vorbis".equals(str2)) {
                            com.google.android.gms.internal.ads.C5128sR c5128sR4 = new com.google.android.gms.internal.ads.C5128sR(bArr7);
                            int i31 = 1;
                            c5128sR4.m(1);
                            int i32 = 0;
                            while (true) {
                                if (c5128sR4.r() <= 0) {
                                    i20 = iW;
                                    i21 = 255;
                                    break;
                                }
                                i20 = iW;
                                i21 = 255;
                                if (c5128sR4.v() != 255) {
                                    break;
                                }
                                c5128sR4.m(i31);
                                i32 += 255;
                                iW = i20;
                                i31 = 1;
                            }
                            int iC5 = i32 + c5128sR4.C();
                            int i33 = 0;
                            while (c5128sR4.r() > 0 && c5128sR4.v() == i21) {
                                c5128sR4.m(1);
                                i33 += i21;
                            }
                            int iC6 = i33 + c5128sR4.C();
                            byte[] bArr8 = new byte[iC5];
                            int iT3 = c5128sR4.t();
                            java.lang.System.arraycopy(bArr7, iT3, bArr8, 0, iC5);
                            int i34 = iT3 + iC5 + iC6;
                            int length = bArr7.length - i34;
                            byte[] bArr9 = new byte[length];
                            java.lang.System.arraycopy(bArr7, i34, bArr9, 0, length);
                            listP = com.google.android.gms.internal.ads.AbstractC3398ci0.Q(bArr8, bArr9);
                        } else {
                            i20 = iW;
                            if ("audio/mp4a-latm".equals(str2)) {
                                com.google.android.gms.internal.ads.M mA = com.google.android.gms.internal.ads.O.a(bArr7);
                                i14 = mA.f29621a;
                                i15 = mA.f29622b;
                                str5 = mA.f29623c;
                            } else {
                                i14 = i14;
                            }
                            listP = com.google.android.gms.internal.ads.AbstractC3398ci0.P(bArr7);
                        }
                        i14 = i14;
                    } else {
                        i20 = iW;
                        i14 = i14;
                    }
                }
                iT += iW2;
                c5128sR2 = c5128sR;
                i22 = i10;
                i23 = i11;
                str4 = str4;
                iW = i20;
            }
            i20 = iW;
            iT += iW2;
            c5128sR2 = c5128sR;
            i22 = i10;
            i23 = i11;
            str4 = str4;
            iW = i20;
        }
        int i35 = i14;
        if (c4867q3.f38159b != null || str2 == null) {
            return;
        }
        com.google.android.gms.internal.ads.C4682oK0 c4682oK2 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK2.l(i12);
        c4682oK2.B(str2);
        c4682oK2.a(str5);
        c4682oK2.r0(i15);
        c4682oK2.C(i35);
        c4682oK2.u(i26);
        c4682oK2.n(listP);
        c4682oK2.f(eh0B);
        c4682oK2.q(str);
        if (c4317l3M != null) {
            c4682oK2.q0(com.google.android.gms.internal.ads.AbstractC2466Ij0.e(c4317l3M.f37060c));
            c4682oK2.v(com.google.android.gms.internal.ads.AbstractC2466Ij0.e(c4317l3M.f37061d));
        }
        c4867q3.f38159b = c4682oK2.H();
    }
}
