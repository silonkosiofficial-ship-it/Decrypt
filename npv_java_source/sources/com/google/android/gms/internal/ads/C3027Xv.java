package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3027Xv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f33192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f33193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f33194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f33198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f33199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f33201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f33203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f33208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f33210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f33211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f33212w;

    public C3027Xv(int i6, int i10, float f6, float f10, int i11) {
        this.f33190a = i6;
        this.f33191b = i10;
        this.f33192c = f6;
        this.f33193d = f10;
        this.f33194e = i6 / i11;
        this.f33195f = i6 / 400;
        int i12 = i6 / 65;
        this.f33196g = i12;
        int i13 = i12 + i12;
        this.f33197h = i13;
        this.f33198i = new short[i13];
        int i14 = i13 * i10;
        this.f33199j = new short[i14];
        this.f33201l = new short[i14];
        this.f33203n = new short[i14];
    }

    private final int g(short[] sArr, int i6, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = this.f33191b * i6;
                iAbs += java.lang.Math.abs(sArr[i17 + i16] - sArr[(i17 + i10) + i16]);
            }
            int i18 = iAbs * i14;
            int i19 = i12 * i10;
            if (i18 < i19) {
                i12 = iAbs;
            }
            if (i18 < i19) {
                i14 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i15 * i10;
            if (i20 > i21) {
                i15 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.f33210u = i12 / i14;
        this.f33211v = i15 / i13;
        return i14;
    }

    private final void h(short[] sArr, int i6, int i10) {
        short[] sArrL = l(this.f33201l, this.f33202m, i10);
        this.f33201l = sArrL;
        int i11 = this.f33202m;
        int i12 = this.f33191b;
        java.lang.System.arraycopy(sArr, i6 * i12, sArrL, i11 * i12, i10 * i12);
        this.f33202m += i10;
    }

    private final void i(short[] sArr, int i6, int i10) {
        int i11;
        for (int i12 = 0; i12 < this.f33197h / i10; i12++) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f33191b;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i15 * i6) + (i11 * i12) + i13];
                    i13++;
                }
            }
            this.f33198i[i12] = (short) (i14 / i11);
        }
    }

    private static void j(int i6, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i6; i18++) {
                sArr[i17] = (short) (((sArr2[i15] * (i6 - i18)) + (sArr3[i16] * i18)) / i6);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    private final void k() {
        int iG;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j6;
        long j10;
        double d6 = this.f33192c / this.f33193d;
        int i15 = this.f33202m;
        int i16 = 0;
        int i17 = 1;
        if (d6 > 1.00001d || d6 < 0.99999d) {
            int i18 = this.f33200k;
            if (i18 >= this.f33197h) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f33207r;
                    if (i20 > 0) {
                        int iMin = java.lang.Math.min(this.f33197h, i20);
                        h(this.f33199j, i19, iMin);
                        this.f33207r -= iMin;
                        i19 += iMin;
                    } else {
                        short[] sArr = this.f33199j;
                        int i21 = this.f33190a;
                        int i22 = i21 > 4000 ? i21 / 4000 : i17;
                        if (this.f33191b == i17 && i22 == i17) {
                            iG = g(sArr, i19, this.f33195f, this.f33196g);
                        } else {
                            i(sArr, i19, i22);
                            int iG2 = g(this.f33198i, i16, this.f33195f / i22, this.f33196g / i22);
                            if (i22 != i17) {
                                int i23 = iG2 * i22;
                                int i24 = i22 * 4;
                                int i25 = this.f33195f;
                                int i26 = i23 - i24;
                                if (i26 >= i25) {
                                    i25 = i26;
                                }
                                int i27 = i23 + i24;
                                int i28 = this.f33196g;
                                if (i27 > i28) {
                                    i27 = i28;
                                }
                                if (this.f33191b == i17) {
                                    iG = g(sArr, i19, i25, i27);
                                } else {
                                    i(sArr, i19, i17);
                                    iG = g(this.f33198i, i16, i25, i27);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i29 = this.f33210u;
                        int i30 = (i29 == 0 || (i11 = this.f33208s) == 0 || this.f33211v > i29 * 3 || i29 + i29 <= this.f33209t * 3) ? iG : i11;
                        int i31 = i19 + i30;
                        this.f33209t = i29;
                        this.f33208s = iG;
                        double d10 = i30;
                        if (d6 > 1.0d) {
                            short[] sArr2 = this.f33199j;
                            double d11 = (-1.0d) + d6;
                            if (d6 >= 2.0d) {
                                double d12 = (d10 / d11) + this.f33212w;
                                int iRound = (int) java.lang.Math.round(d12);
                                this.f33212w = d12 - ((double) iRound);
                                i10 = iRound;
                            } else {
                                double d13 = ((d10 * (2.0d - d6)) / d11) + this.f33212w;
                                int iRound2 = (int) java.lang.Math.round(d13);
                                this.f33207r = iRound2;
                                this.f33212w = d13 - ((double) iRound2);
                                i10 = i30;
                            }
                            short[] sArrL = l(this.f33201l, this.f33202m, i10);
                            this.f33201l = sArrL;
                            j(i10, this.f33191b, sArrL, this.f33202m, sArr2, i19, sArr2, i31);
                            this.f33202m += i10;
                            i19 += i30 + i10;
                        } else {
                            int i32 = i30;
                            short[] sArr3 = this.f33199j;
                            double d14 = 1.0d - d6;
                            if (d6 < 0.5d) {
                                double d15 = ((d10 * d6) / d14) + this.f33212w;
                                int iRound3 = (int) java.lang.Math.round(d15);
                                this.f33212w = d15 - ((double) iRound3);
                                i6 = iRound3;
                            } else {
                                double d16 = ((d10 * ((d6 + d6) - 1.0d)) / d14) + this.f33212w;
                                int iRound4 = (int) java.lang.Math.round(d16);
                                this.f33207r = iRound4;
                                this.f33212w = d16 - ((double) iRound4);
                                i6 = i32;
                            }
                            int i33 = i32 + i6;
                            short[] sArrL2 = l(this.f33201l, this.f33202m, i33);
                            this.f33201l = sArrL2;
                            int i34 = this.f33191b;
                            java.lang.System.arraycopy(sArr3, i19 * i34, sArrL2, this.f33202m * i34, i34 * i32);
                            j(i6, this.f33191b, this.f33201l, this.f33202m + i32, sArr3, i31, sArr3, i19);
                            this.f33202m += i33;
                            i19 += i6;
                        }
                    }
                    if (this.f33197h + i19 > i18) {
                        break;
                    }
                    i16 = 0;
                    i17 = 1;
                }
                int i35 = this.f33200k - i19;
                short[] sArr4 = this.f33199j;
                int i36 = this.f33191b;
                java.lang.System.arraycopy(sArr4, i19 * i36, sArr4, 0, i36 * i35);
                this.f33200k = i35;
            }
        } else {
            h(this.f33199j, 0, this.f33200k);
            this.f33200k = 0;
        }
        float f6 = this.f33194e * this.f33193d;
        if (f6 == 1.0f || this.f33202m == i15) {
            return;
        }
        int i37 = this.f33190a;
        float f10 = i37 / f6;
        long j11 = i37;
        long j12 = (long) f10;
        while (j12 != 0 && j11 != 0 && j12 % 2 == 0 && j11 % 2 == 0) {
            j12 /= 2;
            j11 /= 2;
        }
        int i38 = this.f33202m - i15;
        short[] sArrL3 = l(this.f33203n, this.f33204o, i38);
        this.f33203n = sArrL3;
        short[] sArr5 = this.f33201l;
        int i39 = this.f33191b;
        java.lang.System.arraycopy(sArr5, i15 * i39, sArrL3, this.f33204o * i39, i39 * i38);
        this.f33202m = i15;
        this.f33204o += i38;
        int i40 = 0;
        while (true) {
            i12 = this.f33204o;
            i13 = i12 - 1;
            if (i40 >= i13) {
                break;
            }
            while (true) {
                i14 = this.f33205p + 1;
                j6 = i14;
                long j13 = j6 * j12;
                j10 = this.f33206q;
                if (j13 <= j10 * j11) {
                    break;
                }
                this.f33201l = l(this.f33201l, this.f33202m, 1);
                int i41 = 0;
                while (true) {
                    int i42 = this.f33191b;
                    if (i41 < i42) {
                        short[] sArr6 = this.f33201l;
                        int i43 = this.f33202m * i42;
                        short[] sArr7 = this.f33203n;
                        int i44 = (i40 * i42) + i41;
                        short s6 = sArr7[i44];
                        short s10 = sArr7[i44 + i42];
                        long j14 = ((long) this.f33206q) * j11;
                        int i45 = this.f33205p;
                        long j15 = j11;
                        long j16 = ((long) (i45 + 1)) * j12;
                        long j17 = j16 - (((long) i45) * j12);
                        long j18 = j16 - j14;
                        sArr6[i43 + i41] = (short) (((j18 * ((long) s6)) + ((j17 - j18) * ((long) s10))) / j17);
                        i41++;
                        j11 = j15;
                        j12 = j12;
                    }
                }
                this.f33206q++;
                this.f33202m++;
                j11 = j11;
                j12 = j12;
            }
            long j19 = j11;
            long j20 = j12;
            this.f33205p = i14;
            if (j6 == j19) {
                this.f33205p = 0;
                com.google.android.gms.internal.ads.LC.f(j10 == j20);
                this.f33206q = 0;
            }
            i40++;
            j11 = j19;
            j12 = j20;
        }
        if (i13 != 0) {
            short[] sArr8 = this.f33203n;
            int i46 = this.f33191b;
            java.lang.System.arraycopy(sArr8, i13 * i46, sArr8, 0, (i12 - i13) * i46);
            this.f33204o -= i13;
        }
    }

    private final short[] l(short[] sArr, int i6, int i10) {
        int length = sArr.length;
        int i11 = this.f33191b;
        int i12 = length / i11;
        return i6 + i10 <= i12 ? sArr : java.util.Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int a() {
        int i6 = this.f33202m * this.f33191b;
        return i6 + i6;
    }

    public final int b() {
        int i6 = this.f33200k * this.f33191b;
        return i6 + i6;
    }

    public final void c() {
        this.f33200k = 0;
        this.f33202m = 0;
        this.f33204o = 0;
        this.f33205p = 0;
        this.f33206q = 0;
        this.f33207r = 0;
        this.f33208s = 0;
        this.f33209t = 0;
        this.f33210u = 0;
        this.f33211v = 0;
        this.f33212w = 0.0d;
    }

    public final void d(java.nio.ShortBuffer shortBuffer) {
        int iMin = java.lang.Math.min(shortBuffer.remaining() / this.f33191b, this.f33202m);
        shortBuffer.put(this.f33201l, 0, this.f33191b * iMin);
        int i6 = this.f33202m - iMin;
        this.f33202m = i6;
        int i10 = this.f33191b;
        short[] sArr = this.f33201l;
        java.lang.System.arraycopy(sArr, iMin * i10, sArr, 0, i6 * i10);
    }

    public final void e() {
        int i6;
        int i10 = this.f33200k;
        int i11 = this.f33207r;
        int i12 = this.f33202m;
        float f6 = this.f33192c;
        float f10 = this.f33193d;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f6 / f10))) + ((double) i11)) + this.f33212w) + ((double) this.f33204o)) / ((double) (this.f33194e * f10))) + 0.5d));
        this.f33212w = 0.0d;
        int i14 = this.f33197h;
        this.f33199j = l(this.f33199j, i10, i14 + i14 + i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f33197h;
            int i17 = this.f33191b;
            i6 = i16 + i16;
            if (i15 >= i6 * i17) {
                break;
            }
            this.f33199j[(i17 * i10) + i15] = 0;
            i15++;
        }
        this.f33200k += i6;
        k();
        if (this.f33202m > i13) {
            this.f33202m = i13;
        }
        this.f33200k = 0;
        this.f33207r = 0;
        this.f33204o = 0;
    }

    public final void f(java.nio.ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i6 = this.f33191b;
        int i10 = iRemaining / i6;
        int i11 = i6 * i10;
        short[] sArrL = l(this.f33199j, this.f33200k, i10);
        this.f33199j = sArrL;
        shortBuffer.get(sArrL, this.f33200k * this.f33191b, (i11 + i11) / 2);
        this.f33200k += i10;
        k();
    }
}
