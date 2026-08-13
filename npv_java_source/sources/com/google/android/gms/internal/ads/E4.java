package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class E4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f26874h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f26875i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f26876j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Paint f26877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Paint f26878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.Canvas f26879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5638x4 f26880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5528w4 f26881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D4 f26882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.Bitmap f26883g;

    public E4(java.util.List list) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR((byte[]) list.get(0));
        int iG = c5128sR.G();
        int iG2 = c5128sR.G();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f26877a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f26878b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f26879c = new android.graphics.Canvas();
        this.f26880d = new com.google.android.gms.internal.ads.C5638x4(719, 575, 0, 719, 0, 575);
        this.f26881e = new com.google.android.gms.internal.ads.C5528w4(0, g(), h(), i());
        this.f26882f = new com.google.android.gms.internal.ads.D4(iG, iG2);
    }

    private static int b(int i6, int i10, int i11, int i12) {
        return (i6 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    private static com.google.android.gms.internal.ads.C5528w4 c(com.google.android.gms.internal.ads.RQ rq, int i6) {
        int[] iArr;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i10 = 8;
        int iD5 = rq.d(8);
        rq.n(8);
        int[] iArrG = g();
        int[] iArrH = h();
        int[] iArrI = i();
        int i11 = i6 - 2;
        while (i11 > 0) {
            int iD6 = rq.d(i10);
            int iD7 = rq.d(i10);
            if ((iD7 & 128) != 0) {
                iArr = iArrG;
            } else {
                iArr = (iD7 & 64) != 0 ? iArrH : iArrI;
            }
            if ((iD7 & 1) != 0) {
                iD3 = rq.d(i10);
                iD4 = rq.d(i10);
                iD = rq.d(i10);
                iD2 = rq.d(i10);
                i11 -= 6;
            } else {
                int iD8 = rq.d(6) << 2;
                int iD9 = rq.d(4) << 4;
                i11 -= 4;
                iD = rq.d(4) << 4;
                iD2 = rq.d(2) << 6;
                iD3 = iD8;
                iD4 = iD9;
            }
            if (iD3 == 0) {
                iD2 = 255;
            }
            if (iD3 == 0) {
                iD = 0;
            }
            if (iD3 == 0) {
                iD4 = 0;
            }
            double d6 = iD3;
            double d10 = iD4 - 128;
            double d11 = iD - 128;
            iArr[iD6] = b((byte) (255 - (iD2 & 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d6 + (1.402d * d10)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) ((d6 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d6 + (d11 * 1.772d)), 255)));
            iD5 = iD5;
            i10 = 8;
        }
        return new com.google.android.gms.internal.ads.C5528w4(iD5, iArrG, iArrH, iArrI);
    }

    private static com.google.android.gms.internal.ads.C5748y4 d(com.google.android.gms.internal.ads.RQ rq) {
        byte[] bArr;
        int iD = rq.d(16);
        rq.n(4);
        int iD2 = rq.d(2);
        boolean zP = rq.p();
        rq.n(1);
        byte[] bArr2 = com.google.android.gms.internal.ads.EW.f27066f;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = rq.d(16);
                int iD4 = rq.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    rq.i(bArr2, 0, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    rq.i(bArr, 0, iD4);
                }
            }
            return new com.google.android.gms.internal.ads.C5748y4(iD, zP, bArr2, bArr);
        }
        rq.n(rq.d(8) * 16);
        bArr = bArr2;
        return new com.google.android.gms.internal.ads.C5748y4(iD, zP, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0211  */
    /* JADX WARN: Code duplicated, block: B:119:0x0220 A[LOOP:3: B:88:0x016a->B:119:0x0220, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x021a A[SYNTHETIC] */
    private static void e(byte[] bArr, int[] iArr, int i6, int i10, int i11, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c6;
        char c10;
        int iD;
        int i12;
        int iD2;
        int i13;
        int i14;
        int iD3;
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArr, bArr.length);
        int i15 = i10;
        int i16 = i11;
        byte[] bArrF = null;
        byte[] bArrF2 = null;
        byte[] bArrF3 = null;
        while (rq.a() != 0) {
            int i17 = 8;
            int iD4 = rq.d(8);
            if (iD4 != 240) {
                int i18 = 4;
                int i19 = 1;
                int i20 = 2;
                switch (iD4) {
                    case 16:
                        int i21 = 1;
                        if (i6 == 3) {
                            if (bArrF == null) {
                                bArr3 = f26875i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrF;
                            }
                        } else if (i6 != 2) {
                            bArr2 = null;
                        } else if (bArrF3 == null) {
                            bArr3 = f26874h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrF3;
                        }
                        int i22 = i15;
                        int i23 = 0;
                        while (true) {
                            int iD5 = rq.d(2);
                            if (iD5 != 0) {
                                iD = i21;
                            } else {
                                if (rq.p()) {
                                    iD = rq.d(3) + 3;
                                    iD5 = rq.d(2);
                                } else {
                                    if (rq.p()) {
                                        iD = i21;
                                        iD5 = 0;
                                    } else {
                                        int iD6 = rq.d(2);
                                        if (iD6 == 0) {
                                            c6 = 4;
                                            c10 = '\b';
                                            i23 = i21;
                                            iD5 = 0;
                                            iD = 0;
                                        } else if (iD6 == i21) {
                                            c6 = 4;
                                            c10 = '\b';
                                            i23 = i23;
                                            iD = 2;
                                            iD5 = 0;
                                        } else if (iD6 == 2) {
                                            c6 = 4;
                                            c10 = '\b';
                                            iD = rq.d(4) + 12;
                                            iD5 = rq.d(2);
                                            i23 = i23;
                                        } else if (iD6 != 3) {
                                            iD5 = 0;
                                            iD = 0;
                                        } else {
                                            c10 = '\b';
                                            iD = rq.d(8) + 29;
                                            iD5 = rq.d(2);
                                            i23 = i23;
                                            c6 = 4;
                                        }
                                    }
                                    c6 = 4;
                                    c10 = '\b';
                                }
                                if (iD == 0 && paint != null) {
                                    int i24 = i16 + 1;
                                    float f6 = i16;
                                    if (bArr2 != 0) {
                                        iD5 = bArr2[iD5];
                                    }
                                    paint.setColor(iArr[iD5]);
                                    canvas.drawRect(i22, f6, i22 + iD, i24, paint);
                                }
                                i22 += iD;
                                if (i23 != 0) {
                                    rq.f();
                                    i15 = i22;
                                } else {
                                    i23 = i23;
                                    i21 = 1;
                                }
                            }
                            c6 = 4;
                            c10 = '\b';
                            if (iD == 0) {
                            }
                            i22 += iD;
                            if (i23 != 0) {
                                rq.f();
                                i15 = i22;
                            } else {
                                i23 = i23;
                                i21 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i6 == 3 ? bArrF2 == null ? f26876j : bArrF2 : null;
                        int i25 = i15;
                        boolean z6 = false;
                        while (true) {
                            int iD7 = rq.d(i18);
                            if (iD7 != 0) {
                                i12 = 1;
                                z6 = z6;
                            } else if (rq.p()) {
                                if (rq.p()) {
                                    int iD8 = rq.d(i20);
                                    if (iD8 == 0) {
                                        i12 = 1;
                                    } else if (iD8 == 1) {
                                        i12 = i20;
                                    } else if (iD8 == i20) {
                                        iD2 = rq.d(i18) + 9;
                                    } else if (iD8 != 3) {
                                        z6 = z6;
                                        iD7 = 0;
                                        i12 = 0;
                                    } else {
                                        iD2 = rq.d(i17) + 25;
                                    }
                                    iD7 = 0;
                                } else {
                                    iD2 = rq.d(i20) + i18;
                                }
                                z6 = z6;
                                i12 = iD2;
                                iD7 = rq.d(i18);
                            } else {
                                int iD9 = rq.d(3);
                                if (iD9 != 0) {
                                    i12 = iD9 + 2;
                                    iD7 = 0;
                                } else {
                                    z6 = true;
                                    iD7 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 == 0 || paint == null) {
                                i13 = i20;
                            } else {
                                int i26 = i16 + 1;
                                float f10 = i16;
                                if (bArr4 != 0) {
                                    iD7 = bArr4[iD7];
                                }
                                paint.setColor(iArr[iD7]);
                                i13 = 2;
                                canvas.drawRect(i25, f10, i25 + i12, i26, paint);
                            }
                            i25 += i12;
                            if (z6) {
                                rq.f();
                                i15 = i25;
                            } else {
                                i20 = i13;
                                z6 = z6;
                                i18 = 4;
                                i17 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i27 = i15;
                        int i28 = 0;
                        while (true) {
                            int iD10 = rq.d(8);
                            if (iD10 != 0) {
                                i14 = i28;
                                iD3 = i19;
                            } else if (rq.p()) {
                                i14 = i28;
                                iD3 = rq.d(7);
                                iD10 = rq.d(8);
                            } else {
                                int iD11 = rq.d(7);
                                if (iD11 != 0) {
                                    i14 = i28;
                                    iD3 = iD11;
                                    iD10 = 0;
                                } else {
                                    i14 = i19;
                                    iD10 = 0;
                                    iD3 = 0;
                                }
                            }
                            if (iD3 != 0 && paint != null) {
                                paint.setColor(iArr[iD10]);
                                canvas.drawRect(i27, i16, i27 + iD3, i16 + 1, paint);
                            }
                            i27 += iD3;
                            if (i14 != 0) {
                                i15 = i27;
                            } else {
                                i19 = i19;
                                i28 = i14;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iD4) {
                            case 32:
                                bArrF3 = f(4, 4, rq);
                                break;
                            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                bArrF = f(4, 8, rq);
                                break;
                            case 34:
                                bArrF2 = f(16, 8, rq);
                                break;
                        }
                        break;
                }
            } else {
                i16 += 2;
                i15 = i10;
            }
        }
    }

    private static byte[] f(int i6, int i10, com.google.android.gms.internal.ads.RQ rq) {
        byte[] bArr = new byte[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            bArr[i11] = (byte) rq.d(i10);
        }
        return bArr;
    }

    private static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            int i10 = i6 & 4;
            int i11 = i6 & 2;
            int i12 = i6 & 1;
            if (i6 < 8) {
                iArr[i6] = b(255, 1 != i12 ? 0 : 255, i11 != 0 ? 255 : 0, i10 != 0 ? 255 : 0);
            } else {
                int i13 = com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i14 = 1 != i12 ? 0 : 127;
                int i15 = i11 != 0 ? 127 : 0;
                if (i10 == 0) {
                    i13 = 0;
                }
                iArr[i6] = b(255, i14, i15, i13);
            }
        }
        return iArr;
    }

    private static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            if (i6 < 8) {
                iArr[i6] = b(63, 1 != (i6 & 1) ? 0 : 255, (i6 & 2) != 0 ? 255 : 0, (i6 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i6 & 136;
                if (i10 == 0) {
                    iArr[i6] = b(255, (1 != (i6 & 1) ? 0 : 85) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i6] = b(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, (1 != (i6 & 1) ? 0 : 85) + ((i6 & 16) != 0 ? 170 : 0), ((i6 & 2) != 0 ? 85 : 0) + ((i6 & 32) != 0 ? 170 : 0), ((i6 & 4) == 0 ? 0 : 85) + ((i6 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i6] = b(255, (1 != (i6 & 1) ? 0 : 43) + com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION + ((i6 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i6] = b(255, (1 != (i6 & 1) ? 0 : 43) + ((i6 & 16) != 0 ? 85 : 0), ((i6 & 2) != 0 ? 43 : 0) + ((i6 & 32) != 0 ? 85 : 0), ((i6 & 4) == 0 ? 0 : 43) + ((i6 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        com.google.android.gms.internal.ads.C4099j4 c4099j4;
        char c6;
        char c10;
        int i11;
        android.util.SparseArray sparseArray;
        int i12;
        com.google.android.gms.internal.ads.B4 b6;
        int i13;
        int iD;
        int iD2;
        com.google.android.gms.internal.ads.C5528w4 c5528w4;
        java.lang.Object obj;
        com.google.android.gms.internal.ads.C5748y4 c5748y4;
        int iD3;
        int iD4;
        int i14;
        int iD5;
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArr, i6 + i10);
        rq.l(i6);
        while (rq.a() >= 48 && rq.d(8) == 15) {
            com.google.android.gms.internal.ads.D4 d6 = this.f26882f;
            int iD6 = rq.d(8);
            int iD7 = rq.d(16);
            int iD8 = rq.d(16);
            int iB = rq.b() + iD8;
            if (iD8 * 8 > rq.a()) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("DvbParser", "Data field length exceeds limit");
                rq.n(rq.a());
            } else {
                switch (iD6) {
                    case 16:
                        if (iD7 == d6.f26597a) {
                            com.google.android.gms.internal.ads.C5858z4 c5858z4 = d6.f26605i;
                            int iD9 = rq.d(8);
                            int iD10 = rq.d(4);
                            int iD11 = rq.d(2);
                            rq.n(2);
                            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                            for (int i15 = iD8 - 2; i15 > 0; i15 -= 6) {
                                int iD12 = rq.d(8);
                                rq.n(8);
                                sparseArray2.put(iD12, new com.google.android.gms.internal.ads.A4(rq.d(16), rq.d(16)));
                            }
                            com.google.android.gms.internal.ads.C5858z4 c5858z5 = new com.google.android.gms.internal.ads.C5858z4(iD9, iD10, iD11, sparseArray2);
                            if (c5858z5.f40202b != 0) {
                                d6.f26605i = c5858z5;
                                d6.f26599c.clear();
                                d6.f26600d.clear();
                                d6.f26601e.clear();
                            } else if (c5858z4 != null) {
                                if (c5858z4.f40201a != c5858z5.f40201a) {
                                    d6.f26605i = c5858z5;
                                }
                            }
                        }
                        break;
                    case 17:
                        com.google.android.gms.internal.ads.C5858z4 c5858z6 = d6.f26605i;
                        if (iD7 == d6.f26597a && c5858z6 != null) {
                            int iD13 = rq.d(8);
                            rq.n(4);
                            boolean zP = rq.p();
                            rq.n(3);
                            int iD14 = rq.d(16);
                            int iD15 = rq.d(16);
                            int iD16 = rq.d(3);
                            int iD17 = rq.d(3);
                            rq.n(2);
                            int iD18 = rq.d(8);
                            int iD19 = rq.d(8);
                            int iD20 = rq.d(4);
                            int iD21 = rq.d(2);
                            rq.n(2);
                            int i16 = iD8 - 10;
                            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
                            while (i16 > 0) {
                                int iD22 = rq.d(16);
                                int iD23 = rq.d(2);
                                int iD24 = rq.d(2);
                                int iD25 = rq.d(12);
                                rq.n(4);
                                int iD26 = rq.d(12);
                                int i17 = i16 - 6;
                                if (iD23 == 1) {
                                    i16 -= 8;
                                    i13 = iD23;
                                    iD = rq.d(8);
                                    iD2 = rq.d(8);
                                } else if (iD23 == 2) {
                                    iD23 = 2;
                                    i16 -= 8;
                                    i13 = iD23;
                                    iD = rq.d(8);
                                    iD2 = rq.d(8);
                                } else {
                                    i13 = iD23;
                                    i16 = i17;
                                    iD = 0;
                                    iD2 = 0;
                                }
                                sparseArray3.put(iD22, new com.google.android.gms.internal.ads.C4(i13, iD24, iD25, iD26, iD, iD2));
                            }
                            com.google.android.gms.internal.ads.B4 b10 = new com.google.android.gms.internal.ads.B4(iD13, zP, iD14, iD15, iD16, iD17, iD18, iD19, iD20, iD21, sparseArray3);
                            if (c5858z6.f40202b == 0 && (b6 = (com.google.android.gms.internal.ads.B4) d6.f26599c.get(b10.f25882a)) != null) {
                                int i18 = 0;
                                while (true) {
                                    android.util.SparseArray sparseArray4 = b6.f25891j;
                                    if (i18 < sparseArray4.size()) {
                                        b10.f25891j.put(sparseArray4.keyAt(i18), (com.google.android.gms.internal.ads.C4) sparseArray4.valueAt(i18));
                                        i18++;
                                    }
                                }
                            }
                            sparseArray = d6.f26599c;
                            i12 = b10.f25882a;
                            obj = b10;
                            sparseArray.put(i12, obj);
                        }
                        break;
                    case 18:
                        if (iD7 == d6.f26597a) {
                            com.google.android.gms.internal.ads.C5528w4 c5528w4C = c(rq, iD8);
                            sparseArray = d6.f26600d;
                            c5528w4 = c5528w4C;
                        } else if (iD7 == d6.f26598b) {
                            com.google.android.gms.internal.ads.C5528w4 c5528w4C2 = c(rq, iD8);
                            sparseArray = d6.f26602f;
                            c5528w4 = c5528w4C2;
                        }
                        i12 = c5528w4.f39515a;
                        obj = c5528w4;
                        sparseArray.put(i12, obj);
                        break;
                    case 19:
                        if (iD7 == d6.f26597a) {
                            com.google.android.gms.internal.ads.C5748y4 c5748y4D = d(rq);
                            sparseArray = d6.f26601e;
                            c5748y4 = c5748y4D;
                        } else if (iD7 == d6.f26598b) {
                            com.google.android.gms.internal.ads.C5748y4 c5748y4D2 = d(rq);
                            sparseArray = d6.f26603g;
                            c5748y4 = c5748y4D2;
                        }
                        i12 = c5748y4.f39980a;
                        obj = c5748y4;
                        sparseArray.put(i12, obj);
                        break;
                    case 20:
                        if (iD7 == d6.f26597a) {
                            rq.n(4);
                            boolean zP2 = rq.p();
                            rq.n(3);
                            int iD27 = rq.d(16);
                            int iD28 = rq.d(16);
                            if (zP2) {
                                int iD29 = rq.d(16);
                                iD3 = rq.d(16);
                                iD5 = rq.d(16);
                                iD4 = rq.d(16);
                                i14 = iD29;
                            } else {
                                iD3 = iD27;
                                iD4 = iD28;
                                i14 = 0;
                                iD5 = 0;
                            }
                            d6.f26604h = new com.google.android.gms.internal.ads.C5638x4(iD27, iD28, i14, iD3, iD5, iD4);
                        }
                        break;
                }
                rq.o(iB - rq.b());
            }
        }
        com.google.android.gms.internal.ads.D4 d10 = this.f26882f;
        com.google.android.gms.internal.ads.C5858z4 c5858z7 = d10.f26605i;
        if (c5858z7 == null) {
            c4099j4 = new com.google.android.gms.internal.ads.C4099j4(com.google.android.gms.internal.ads.AbstractC3398ci0.O(), -9223372036854775807L, -9223372036854775807L);
        } else {
            com.google.android.gms.internal.ads.C5638x4 c5638x4 = d10.f26604h;
            if (c5638x4 == null) {
                c5638x4 = this.f26880d;
            }
            android.graphics.Bitmap bitmap = this.f26883g;
            if (bitmap == null || c5638x4.f39772a + 1 != bitmap.getWidth() || c5638x4.f39773b + 1 != this.f26883g.getHeight()) {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(c5638x4.f39772a + 1, c5638x4.f39773b + 1, android.graphics.Bitmap.Config.ARGB_8888);
                this.f26883g = bitmapCreateBitmap;
                this.f26879c.setBitmap(bitmapCreateBitmap);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.util.SparseArray sparseArray5 = c5858z7.f40203c;
            int i19 = 0;
            while (i19 < sparseArray5.size()) {
                this.f26879c.save();
                com.google.android.gms.internal.ads.A4 a6 = (com.google.android.gms.internal.ads.A4) sparseArray5.valueAt(i19);
                com.google.android.gms.internal.ads.B4 b11 = (com.google.android.gms.internal.ads.B4) this.f26882f.f26599c.get(sparseArray5.keyAt(i19));
                int i20 = a6.f25034a + c5638x4.f39774c;
                int i21 = a6.f25035b + c5638x4.f39776e;
                this.f26879c.clipRect(i20, i21, java.lang.Math.min(b11.f25884c + i20, c5638x4.f39775d), java.lang.Math.min(b11.f25885d + i21, c5638x4.f39777f));
                com.google.android.gms.internal.ads.C5528w4 c5528w5 = (com.google.android.gms.internal.ads.C5528w4) this.f26882f.f26600d.get(b11.f25887f);
                if (c5528w5 == null) {
                    c5528w5 = (com.google.android.gms.internal.ads.C5528w4) this.f26882f.f26602f.get(b11.f25887f);
                    if (c5528w5 == null) {
                        c5528w5 = this.f26881e;
                    }
                }
                android.util.SparseArray sparseArray6 = b11.f25891j;
                int i22 = 0;
                while (i22 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i22);
                    com.google.android.gms.internal.ads.C4 c11 = (com.google.android.gms.internal.ads.C4) sparseArray6.valueAt(i22);
                    com.google.android.gms.internal.ads.C5748y4 c5748y5 = (com.google.android.gms.internal.ads.C5748y4) this.f26882f.f26601e.get(iKeyAt);
                    if (c5748y5 == null) {
                        c5748y5 = (com.google.android.gms.internal.ads.C5748y4) this.f26882f.f26603g.get(iKeyAt);
                    }
                    if (c5748y5 != null) {
                        android.graphics.Paint paint = c5748y5.f39981b ? null : this.f26877a;
                        int i23 = b11.f25886e;
                        int i24 = c11.f26137a + i20;
                        int i25 = c11.f26138b + i21;
                        android.graphics.Canvas canvas = this.f26879c;
                        int[] iArr = i23 == 3 ? c5528w5.f39518d : i23 == 2 ? c5528w5.f39517c : c5528w5.f39516b;
                        android.graphics.Paint paint2 = paint;
                        e(c5748y5.f39982c, iArr, i23, i24, i25, paint2, canvas);
                        e(c5748y5.f39983d, iArr, i23, i24, i25 + 1, paint2, canvas);
                    }
                    i22++;
                    sparseArray5 = sparseArray5;
                    sparseArray6 = sparseArray6;
                    i19 = i19;
                }
                android.util.SparseArray sparseArray7 = sparseArray5;
                int i26 = i19;
                float f6 = i21;
                float f10 = i20;
                if (b11.f25883b) {
                    int i27 = b11.f25886e;
                    c6 = 3;
                    if (i27 == 3) {
                        i11 = c5528w5.f39518d[b11.f25888g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i11 = i27 == 2 ? c5528w5.f39517c[b11.f25889h] : c5528w5.f39516b[b11.f25890i];
                    }
                    this.f26878b.setColor(i11);
                    this.f26879c.drawRect(f10, f6, b11.f25884c + i20, b11.f25885d + i21, this.f26878b);
                } else {
                    c6 = 3;
                    c10 = 2;
                }
                com.google.android.gms.internal.ads.C2185Ax c2185Ax = new com.google.android.gms.internal.ads.C2185Ax();
                c2185Ax.c(android.graphics.Bitmap.createBitmap(this.f26883g, i20, i21, b11.f25884c, b11.f25885d));
                c2185Ax.h(f10 / c5638x4.f39772a);
                c2185Ax.i(0);
                c2185Ax.e(f6 / c5638x4.f39773b, 0);
                c2185Ax.f(0);
                c2185Ax.k(b11.f25884c / c5638x4.f39772a);
                c2185Ax.d(b11.f25885d / c5638x4.f39773b);
                arrayList.add(c2185Ax.p());
                this.f26879c.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                this.f26879c.restore();
                i19 = i26 + 1;
                sparseArray5 = sparseArray7;
            }
            c4099j4 = new com.google.android.gms.internal.ads.C4099j4(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC5000rF.b(c4099j4);
    }
}
