package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4865q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4645o2 f38145a = new java.lang.Object() { // from class: com.google.android.gms.internal.ads.o2
    };

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[SYNTHETIC] */
    public static final com.google.android.gms.internal.ads.C2227Cb a(byte[] bArr, int i6, com.google.android.gms.internal.ads.C4645o2 c4645o2, com.google.android.gms.internal.ads.R1 r6) {
        java.lang.String strConcat;
        boolean z6;
        com.google.android.gms.internal.ads.C4755p2 c4755p2;
        int i10;
        int iE;
        com.google.android.gms.internal.ads.AbstractC4974r2 abstractC4974r2L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(bArr, i6);
        boolean z10 = false;
        if (c5128sR.r() < 10) {
            strConcat = "Data too short to be an ID3 tag";
        } else {
            int iE2 = c5128sR.E();
            if (iE2 == 4801587) {
                int iC = c5128sR.C();
                c5128sR.m(1);
                int iC2 = c5128sR.C();
                int iB = c5128sR.B();
                if (iC != 2) {
                    if (iC == 3) {
                        if ((iC2 & 64) != 0) {
                            int iW = c5128sR.w();
                            c5128sR.m(iW);
                            iB -= iW + 4;
                        }
                    } else if (iC == 4) {
                        if ((iC2 & 64) != 0) {
                            int iB2 = c5128sR.B();
                            c5128sR.m(iB2 - 4);
                            iB -= iB2;
                        }
                        if ((iC2 & 16) != 0) {
                            iB -= 10;
                        }
                    } else {
                        strConcat = "Skipped ID3 tag with unsupported majorVersion=" + iC;
                    }
                    if (iC < 4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    c4755p2 = new com.google.android.gms.internal.ads.C4755p2(iC, z6, iB);
                } else if ((iC2 & 64) != 0) {
                    strConcat = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                } else {
                    if (iC < 4 || (iC2 & 128) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    c4755p2 = new com.google.android.gms.internal.ads.C4755p2(iC, z6, iB);
                }
                if (c4755p2 == null) {
                    return null;
                }
                int iT = c5128sR.t();
                i10 = c4755p2.f37903a == 2 ? 6 : 10;
                iE = c4755p2.f37905c;
                if (c4755p2.f37904b) {
                    iE = e(c5128sR, c4755p2.f37905c);
                }
                c5128sR.k(iT + iE);
                if (!j(c5128sR, c4755p2.f37903a, i10, false)) {
                    if (c4755p2.f37903a == 4 || !j(c5128sR, 4, i10, true)) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c4755p2.f37903a);
                        return null;
                    }
                    z10 = true;
                }
                while (c5128sR.r() >= i10) {
                    abstractC4974r2L = l(c4755p2.f37903a, c5128sR, z10, i10, c4645o2);
                    if (abstractC4974r2L != null) {
                        arrayList.add(abstractC4974r2L);
                    }
                }
                return new com.google.android.gms.internal.ads.C2227Cb(arrayList);
            }
            strConcat = "Unexpected first three bytes of ID3 tag header: 0x".concat(java.lang.String.format("%06X", java.lang.Integer.valueOf(iE2)));
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.f("Id3Decoder", strConcat);
        c4755p2 = null;
        if (c4755p2 == null) {
            return null;
        }
        int iT2 = c5128sR.t();
        if (c4755p2.f37903a == 2) {
        }
        iE = c4755p2.f37905c;
        if (c4755p2.f37904b) {
            iE = e(c5128sR, c4755p2.f37905c);
        }
        c5128sR.k(iT2 + iE);
        if (!j(c5128sR, c4755p2.f37903a, i10, false)) {
            if (c4755p2.f37903a == 4) {
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c4755p2.f37903a);
            return null;
        }
        while (c5128sR.r() >= i10) {
            abstractC4974r2L = l(c4755p2.f37903a, c5128sR, z10, i10, c4645o2);
            if (abstractC4974r2L != null) {
                arrayList.add(abstractC4974r2L);
            }
        }
        return new com.google.android.gms.internal.ads.C2227Cb(arrayList);
    }

    private static int b(int i6) {
        return (i6 == 0 || i6 == 3) ? 1 : 2;
    }

    private static int c(byte[] bArr, int i6, int i10) {
        int iD = d(bArr, i6);
        if (i10 == 0 || i10 == 3) {
            return iD;
        }
        while (true) {
            int length = bArr.length;
            if (iD >= length - 1) {
                return length;
            }
            int i11 = iD + 1;
            if ((iD - i6) % 2 == 0 && bArr[i11] == 0) {
                return iD;
            }
            iD = d(bArr, i11);
        }
    }

    private static int d(byte[] bArr, int i6) {
        while (true) {
            int length = bArr.length;
            if (i6 >= length) {
                return length;
            }
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
    }

    private static int e(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        byte[] bArrN = c5128sR.n();
        int iT = c5128sR.t();
        int i10 = iT;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iT + i6) {
                return i6;
            }
            if ((bArrN[i10] & 255) == 255 && bArrN[i11] == 0) {
                java.lang.System.arraycopy(bArrN, i10 + 2, bArrN, i11, (i6 - (i10 - iT)) - 2);
                i6--;
            }
            i10 = i11;
        }
    }

    private static com.google.android.gms.internal.ads.AbstractC3398ci0 f(byte[] bArr, int i6, int i10) {
        if (i10 >= bArr.length) {
            return com.google.android.gms.internal.ads.AbstractC3398ci0.P("");
        }
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        while (true) {
            int iC = c(bArr, i10, i6);
            if (i10 >= iC) {
                break;
            }
            c3083Zh0.g(new java.lang.String(bArr, i10, iC - i10, i(i6)));
            i10 = b(i6) + iC;
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0J = c3083Zh0.j();
        return abstractC3398ci0J.isEmpty() ? com.google.android.gms.internal.ads.AbstractC3398ci0.P("") : abstractC3398ci0J;
    }

    private static java.lang.String g(byte[] bArr, int i6, int i10, java.nio.charset.Charset charset) {
        return (i10 <= i6 || i10 > bArr.length) ? "" : new java.lang.String(bArr, i6, i10 - i6, charset);
    }

    private static java.lang.String h(int i6, int i10, int i11, int i12, int i13) {
        return i6 == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i13));
    }

    private static java.nio.charset.Charset i(int i6) {
        if (i6 == 1) {
            return java.nio.charset.StandardCharsets.UTF_16;
        }
        if (i6 != 2) {
            return i6 != 3 ? java.nio.charset.StandardCharsets.ISO_8859_1 : java.nio.charset.StandardCharsets.UTF_8;
        }
        return java.nio.charset.StandardCharsets.UTF_16BE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean j(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10, boolean z6) {
        boolean z10;
        int iE;
        long jE;
        int iG;
        int i11;
        int iT = c5128sR.t();
        while (true) {
            try {
                z10 = true;
                z10 = true;
                int i12 = 1;
                int i13 = 1;
                if (c5128sR.r() >= i10) {
                    if (i6 >= 3) {
                        iE = c5128sR.w();
                        jE = c5128sR.K();
                        iG = c5128sR.G();
                    } else {
                        iE = c5128sR.E();
                        jE = c5128sR.E();
                        iG = 0;
                    }
                    if (iE != 0 || jE != 0 || iG != 0) {
                        if (i6 != 4 || z6) {
                            if (i6 == 4) {
                                if ((iG & 64) != 0) {
                                    i12 = 0;
                                }
                                int i14 = i12;
                                i13 = iG & 1;
                                i11 = i14;
                            } else if (i6 == 3) {
                                if ((iG & 32) != 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if ((iG & 128) != 0) {
                                    i13 = 0;
                                }
                            } else {
                                i11 = 0;
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                i11 += 4;
                            }
                            if (jE >= i11 && c5128sR.r() >= jE) {
                                c5128sR.m((int) jE);
                            }
                        } else if ((8421504 & jE) == 0) {
                            long j6 = ((jE >> 16) & 255) << 14;
                            jE = ((jE >> 24) << 21) | j6 | (jE & 255) | (((jE >> 8) & 255) << 7);
                            if (i6 == 4) {
                                if ((iG & 64) != 0) {
                                    i12 = 0;
                                }
                                int i15 = i12;
                                i13 = iG & 1;
                                i11 = i15;
                            } else if (i6 == 3) {
                                if ((iG & 32) != 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if ((iG & 128) != 0) {
                                    i13 = 0;
                                }
                            } else {
                                i11 = 0;
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                i11 += 4;
                            }
                            if (jE >= i11) {
                                c5128sR.m((int) jE);
                            }
                        }
                        z10 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (java.lang.Throwable th) {
                c5128sR.l(iT);
                throw th;
            }
        }
        c5128sR.l(iT);
        return z10;
    }

    private static byte[] k(byte[] bArr, int i6, int i10) {
        return i10 <= i6 ? com.google.android.gms.internal.ads.EW.f27066f : java.util.Arrays.copyOfRange(bArr, i6, i10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15251. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static com.google.android.gms.internal.ads.AbstractC4974r2 l(int r35, com.google.android.gms.internal.ads.C5128sR r36, boolean r37, int r38, com.google.android.gms.internal.ads.C4645o2 r39) {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4865q2.l(int, com.google.android.gms.internal.ads.sR, boolean, int, com.google.android.gms.internal.ads.o2):com.google.android.gms.internal.ads.r2");
    }
}
