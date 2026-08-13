package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {
    /* JADX WARN: Code duplicated, block: B:100:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:120:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    public static final long a(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        int i6;
        int i10;
        int i11;
        float fD;
        float fC;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float fD2;
        float fC2;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f13;
        long jG;
        if (cVar.g()) {
            float f14 = f12 < 0.0f ? 0.0f : f12;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i28 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f6 < 0.0f ? 0.0f : f6;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i29 = i28 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i30 = i29 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            f13 = f11 >= 0.0f ? f11 : 0.0f;
            jG = p087i7.G.g(i30 | ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 255.0f) + 0.5f))) << 32;
        } else {
            if (!(cVar.a() == 3)) {
                p141o0.H1.a("Color only works with ColorSpaces with 3 components");
            }
            int iB = cVar.b();
            if (!(iB != -1)) {
                p141o0.H1.a("Unknown color space, please use a color space in ColorSpaces");
            }
            float fD3 = cVar.d(0);
            float fC3 = cVar.c(0);
            if (f6 >= fD3) {
                fD3 = f6;
            }
            if (fD3 <= fC3) {
                fC3 = fD3;
            }
            int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fC3);
            int i31 = iFloatToRawIntBits3 >>> 31;
            int i32 = (iFloatToRawIntBits3 >>> 23) & 255;
            int i33 = iFloatToRawIntBits3 & 8388607;
            int i34 = 31;
            if (i32 == 255) {
                i10 = i33 != 0 ? 512 : 0;
                i6 = 31;
            } else {
                i6 = i32 - 112;
                if (i6 >= 31) {
                    i6 = 49;
                    i10 = 0;
                } else if (i6 <= 0) {
                    if (i6 >= -10) {
                        int i35 = (i33 | 8388608) >> (1 - i6);
                        if ((i35 & 4096) != 0) {
                            i35 += 8192;
                        }
                        i10 = i35 >> 13;
                    } else {
                        i10 = 0;
                    }
                    i6 = 0;
                } else {
                    int i36 = i33 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i11 = (((i6 << 10) | i36) + 1) | (i31 << 15);
                    } else {
                        i10 = i36;
                    }
                    short s6 = (short) i11;
                    fD = cVar.d(1);
                    fC = cVar.c(1);
                    if (f10 >= fD) {
                        fD = f10;
                    }
                    if (fD <= fC) {
                        fC = fD;
                    }
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i15 = 49;
                            i17 = 0;
                        } else if (i15 <= 0) {
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i15 = 0;
                        } else {
                            i16 = i14 >> 13;
                            if ((iFloatToRawIntBits & 4096) != 0) {
                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                            } else {
                                i17 = i16;
                            }
                            short s10 = (short) i18;
                            fD2 = cVar.d(2);
                            fC2 = cVar.c(2);
                            if (f11 >= fD2) {
                                fD2 = f11;
                            }
                            if (fD2 <= fC2) {
                                fC2 = fD2;
                            }
                            iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fC2);
                            i20 = iFloatToRawIntBits2 >>> 31;
                            i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                            i22 = 8388607 & iFloatToRawIntBits2;
                            if (i21 == 255) {
                                i25 = i22 == 0 ? 0 : 512;
                            } else {
                                i23 = i21 - 112;
                                if (i23 >= 31) {
                                    i34 = 49;
                                } else if (i23 <= 0) {
                                    i24 = i22 >> 13;
                                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                                        i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                    } else {
                                        i25 = i24;
                                        i34 = i23;
                                    }
                                    short s11 = (short) i26;
                                    f13 = f12 >= 0.0f ? f12 : 0.0f;
                                    jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16);
                                } else if (i23 >= -10) {
                                    i27 = (i22 | 8388608) >> (1 - i23);
                                    if ((i27 & 4096) != 0) {
                                        i27 += 8192;
                                    }
                                    i25 = i27 >> 13;
                                    i34 = 0;
                                } else {
                                    i34 = 0;
                                }
                                i25 = 0;
                            }
                            i26 = (i20 << 15) | (i34 << 10) | i25;
                            short s12 = (short) i26;
                            if (f12 >= 0.0f) {
                            }
                            jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16);
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s13 = (short) i18;
                    fD2 = cVar.d(2);
                    fC2 = cVar.c(2);
                    if (f11 >= fD2) {
                        fD2 = f11;
                    }
                    if (fD2 <= fC2) {
                        fC2 = fD2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fC2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 == 0 ? 0 : 512;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i34 = 49;
                        } else if (i23 <= 0) {
                            i24 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                            } else {
                                i25 = i24;
                                i34 = i23;
                            }
                            short s14 = (short) i26;
                            if (f12 >= 0.0f) {
                            }
                            jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16);
                        } else if (i23 >= -10) {
                            i27 = (i22 | 8388608) >> (1 - i23);
                            if ((i27 & 4096) != 0) {
                                i27 += 8192;
                            }
                            i25 = i27 >> 13;
                            i34 = 0;
                        } else {
                            i34 = 0;
                        }
                        i25 = 0;
                    }
                    i26 = (i20 << 15) | (i34 << 10) | i25;
                    short s15 = (short) i26;
                    if (f12 >= 0.0f) {
                    }
                    jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s6) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16);
                }
            }
            i11 = i10 | (i31 << 15) | (i6 << 10);
            short s16 = (short) i11;
            fD = cVar.d(1);
            fC = cVar.c(1);
            if (f10 >= fD) {
                fD = f10;
            }
            if (fD <= fC) {
                fC = fD;
            }
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
            i12 = iFloatToRawIntBits >>> 31;
            i13 = (iFloatToRawIntBits >>> 23) & 255;
            i14 = iFloatToRawIntBits & 8388607;
            if (i13 == 255) {
                if (i14 != 0) {
                    i17 = 512;
                } else {
                    i17 = 0;
                }
                i15 = 31;
            } else {
                i15 = i13 - 112;
                if (i15 >= 31) {
                    i15 = 49;
                    i17 = 0;
                } else if (i15 <= 0) {
                    if (i15 >= -10) {
                        i19 = (i14 | 8388608) >> (1 - i15);
                        if ((i19 & 4096) != 0) {
                            i19 += 8192;
                        }
                        i17 = i19 >> 13;
                    } else {
                        i17 = 0;
                    }
                    i15 = 0;
                } else {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s17 = (short) i18;
                    fD2 = cVar.d(2);
                    fC2 = cVar.c(2);
                    if (f11 >= fD2) {
                        fD2 = f11;
                    }
                    if (fD2 <= fC2) {
                        fC2 = fD2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fC2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 == 0 ? 0 : 512;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i34 = 49;
                        } else if (i23 <= 0) {
                            i24 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                            } else {
                                i25 = i24;
                                i34 = i23;
                            }
                            short s18 = (short) i26;
                            if (f12 >= 0.0f) {
                            }
                            jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s18)) << 16);
                        } else if (i23 >= -10) {
                            i27 = (i22 | 8388608) >> (1 - i23);
                            if ((i27 & 4096) != 0) {
                                i27 += 8192;
                            }
                            i25 = i27 >> 13;
                            i34 = 0;
                        } else {
                            i34 = 0;
                        }
                        i25 = 0;
                    }
                    i26 = (i20 << 15) | (i34 << 10) | i25;
                    short s19 = (short) i26;
                    if (f12 >= 0.0f) {
                    }
                    jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s19)) << 16);
                }
            }
            i18 = i17 | (i12 << 15) | (i15 << 10);
            short s110 = (short) i18;
            fD2 = cVar.d(2);
            fC2 = cVar.c(2);
            if (f11 >= fD2) {
                fD2 = f11;
            }
            if (fD2 <= fC2) {
                fC2 = fD2;
            }
            iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fC2);
            i20 = iFloatToRawIntBits2 >>> 31;
            i21 = (iFloatToRawIntBits2 >>> 23) & 255;
            i22 = 8388607 & iFloatToRawIntBits2;
            if (i21 == 255) {
                i25 = i22 == 0 ? 0 : 512;
            } else {
                i23 = i21 - 112;
                if (i23 >= 31) {
                    i34 = 49;
                } else if (i23 <= 0) {
                    i24 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                    } else {
                        i25 = i24;
                        i34 = i23;
                    }
                    short s111 = (short) i26;
                    if (f12 >= 0.0f) {
                    }
                    jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s16) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((65535 & ((long) s111)) << 16);
                } else if (i23 >= -10) {
                    i27 = (i22 | 8388608) >> (1 - i23);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i25 = i27 >> 13;
                    i34 = 0;
                } else {
                    i34 = 0;
                }
                i25 = 0;
            }
            i26 = (i20 << 15) | (i34 << 10) | i25;
            short s112 = (short) i26;
            if (f12 >= 0.0f) {
            }
            jG = (((long) iB) & 63) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s16) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((65535 & ((long) s112)) << 16);
        }
        return p141o0.C7016y0.j(p087i7.G.g(jG));
    }

    public static final long b(int i6) {
        return p141o0.C7016y0.j(p087i7.G.g(p087i7.G.g(i6) << 32));
    }

    public static final long c(int i6, int i10, int i11, int i12) {
        return b(((i6 & 255) << 16) | ((i12 & 255) << 24) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static final long d(long j6) {
        return p141o0.C7016y0.j(p087i7.G.g(j6 << 32));
    }

    public static /* synthetic */ long e(float f6, float f10, float f11, float f12, p151p0.c cVar, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            f12 = 1.0f;
        }
        if ((i6 & 16) != 0) {
            cVar = p151p0.g.f52623a.w();
        }
        return a(f6, f10, f11, f12, cVar);
    }

    public static /* synthetic */ long f(int i6, int i10, int i11, int i12, int i13, java.lang.Object obj) {
        if ((i13 & 8) != 0) {
            i12 = 255;
        }
        return c(i6, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    public static final long g(float f6, float f10, float f11, float f12, p151p0.c cVar) {
        int i6;
        int i10;
        int i11;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long jMax;
        if (cVar.g()) {
            jMax = p087i7.G.g((((((int) ((f12 * 255.0f) + 0.5f)) << 24) | (((int) ((f6 * 255.0f) + 0.5f)) << 16)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f11) + 0.5f))) << 32;
        } else {
            int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f6);
            int i26 = iFloatToRawIntBits3 >>> 31;
            int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
            int i28 = iFloatToRawIntBits3 & 8388607;
            int i29 = 0;
            if (i27 == 255) {
                i10 = i28 != 0 ? 512 : 0;
                i6 = 31;
            } else {
                i6 = i27 - 112;
                if (i6 >= 31) {
                    i10 = 0;
                    i6 = 49;
                } else if (i6 > 0) {
                    int i30 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i11 = (((i6 << 10) | i30) + 1) | (i26 << 15);
                    } else {
                        i10 = i30;
                    }
                    short s6 = (short) i11;
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f10);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i15 = 49;
                        } else if (i15 <= 0) {
                            i16 = i14 >> 13;
                            if ((iFloatToRawIntBits & 4096) != 0) {
                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                            } else {
                                i17 = i16;
                            }
                            short s10 = (short) i18;
                            iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f11);
                            i20 = iFloatToRawIntBits2 >>> 31;
                            i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                            i22 = 8388607 & iFloatToRawIntBits2;
                            if (i21 == 255) {
                                i29 = i22 == 0 ? 0 : 512;
                                i23 = 31;
                            } else {
                                i23 = i21 - 112;
                                if (i23 >= 31) {
                                    i23 = 49;
                                } else if (i23 <= 0) {
                                    i29 = i22 >> 13;
                                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                                        i24 = (((i23 << 10) | i29) + 1) | (i20 << 15);
                                    }
                                    jMax = ((((long) s10) & 65535) << 32) | ((((long) s6) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                                } else if (i23 >= -10) {
                                    i25 = (i22 | 8388608) >> (1 - i23);
                                    if ((i25 & 4096) != 0) {
                                        i25 += 8192;
                                    }
                                    i23 = 0;
                                    i29 = i25 >> 13;
                                } else {
                                    i23 = 0;
                                }
                            }
                            i24 = (i20 << 15) | (i23 << 10) | i29;
                            jMax = ((((long) s10) & 65535) << 32) | ((((long) s6) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                        } else if (i15 >= -10) {
                            i19 = (i14 | 8388608) >> (1 - i15);
                            if ((i19 & 4096) != 0) {
                                i19 += 8192;
                            }
                            i17 = i19 >> 13;
                            i15 = 0;
                        } else {
                            i17 = 0;
                            i15 = 0;
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s11 = (short) i18;
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f11);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i29 = i22 == 0 ? 0 : 512;
                        i23 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i23 = 49;
                        } else if (i23 <= 0) {
                            i29 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i24 = (((i23 << 10) | i29) + 1) | (i20 << 15);
                            }
                            jMax = ((((long) s11) & 65535) << 32) | ((((long) s6) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                        } else if (i23 >= -10) {
                            i25 = (i22 | 8388608) >> (1 - i23);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i23 = 0;
                            i29 = i25 >> 13;
                        } else {
                            i23 = 0;
                        }
                    }
                    i24 = (i20 << 15) | (i23 << 10) | i29;
                    jMax = ((((long) s11) & 65535) << 32) | ((((long) s6) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                } else if (i6 >= -10) {
                    int i31 = (i28 | 8388608) >> (1 - i6);
                    if ((i31 & 4096) != 0) {
                        i31 += 8192;
                    }
                    i10 = i31 >> 13;
                    i6 = 0;
                } else {
                    i10 = 0;
                    i6 = 0;
                }
            }
            i11 = i10 | (i26 << 15) | (i6 << 10);
            short s12 = (short) i11;
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f10);
            i12 = iFloatToRawIntBits >>> 31;
            i13 = (iFloatToRawIntBits >>> 23) & 255;
            i14 = iFloatToRawIntBits & 8388607;
            if (i13 == 255) {
                if (i14 != 0) {
                    i17 = 512;
                } else {
                    i17 = 0;
                }
                i15 = 31;
            } else {
                i15 = i13 - 112;
                if (i15 >= 31) {
                    i17 = 0;
                    i15 = 49;
                } else if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s13 = (short) i18;
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f11);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i29 = i22 == 0 ? 0 : 512;
                        i23 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i23 = 49;
                        } else if (i23 <= 0) {
                            i29 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i24 = (((i23 << 10) | i29) + 1) | (i20 << 15);
                            }
                            jMax = ((((long) s13) & 65535) << 32) | ((((long) s12) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                        } else if (i23 >= -10) {
                            i25 = (i22 | 8388608) >> (1 - i23);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i23 = 0;
                            i29 = i25 >> 13;
                        } else {
                            i23 = 0;
                        }
                    }
                    i24 = (i20 << 15) | (i23 << 10) | i29;
                    jMax = ((((long) s13) & 65535) << 32) | ((((long) s12) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                } else if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                    i15 = 0;
                } else {
                    i17 = 0;
                    i15 = 0;
                }
            }
            i18 = i17 | (i12 << 15) | (i15 << 10);
            short s14 = (short) i18;
            iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f11);
            i20 = iFloatToRawIntBits2 >>> 31;
            i21 = (iFloatToRawIntBits2 >>> 23) & 255;
            i22 = 8388607 & iFloatToRawIntBits2;
            if (i21 == 255) {
                i29 = i22 == 0 ? 0 : 512;
                i23 = 31;
            } else {
                i23 = i21 - 112;
                if (i23 >= 31) {
                    i23 = 49;
                } else if (i23 <= 0) {
                    i29 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i24 = (((i23 << 10) | i29) + 1) | (i20 << 15);
                    }
                    jMax = ((((long) s14) & 65535) << 32) | ((((long) s12) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
                } else if (i23 >= -10) {
                    i25 = (i22 | 8388608) >> (1 - i23);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i23 = 0;
                    i29 = i25 >> 13;
                } else {
                    i23 = 0;
                }
            }
            i24 = (i20 << 15) | (i23 << 10) | i29;
            jMax = ((((long) s14) & 65535) << 32) | ((((long) s12) & 65535) << 48) | ((((long) ((short) i24)) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.b()) & 63);
        }
        return p141o0.C7016y0.j(p087i7.G.g(jMax));
    }

    public static final long h(long j6, long j10) {
        long jK = p141o0.C7016y0.k(j6, p141o0.C7016y0.r(j10));
        float fP = p141o0.C7016y0.p(j10);
        float fP2 = p141o0.C7016y0.p(jK);
        float f6 = 1.0f - fP2;
        float f10 = (fP * f6) + fP2;
        return g(f10 == 0.0f ? 0.0f : ((p141o0.C7016y0.t(jK) * fP2) + ((p141o0.C7016y0.t(j10) * fP) * f6)) / f10, f10 == 0.0f ? 0.0f : ((p141o0.C7016y0.s(jK) * fP2) + ((p141o0.C7016y0.s(j10) * fP) * f6)) / f10, f10 != 0.0f ? ((p141o0.C7016y0.q(jK) * fP2) + ((p141o0.C7016y0.q(j10) * fP) * f6)) / f10 : 0.0f, f10, p141o0.C7016y0.r(j10));
    }

    public static final long i(long j6, long j10, float f6) {
        p151p0.c cVarT = p151p0.g.f52623a.t();
        long jK = p141o0.C7016y0.k(j6, cVarT);
        long jK2 = p141o0.C7016y0.k(j10, cVarT);
        float fP = p141o0.C7016y0.p(jK);
        float fT = p141o0.C7016y0.t(jK);
        float fS = p141o0.C7016y0.s(jK);
        float fQ = p141o0.C7016y0.q(jK);
        float fP2 = p141o0.C7016y0.p(jK2);
        float fT2 = p141o0.C7016y0.t(jK2);
        float fS2 = p141o0.C7016y0.s(jK2);
        float fQ2 = p141o0.C7016y0.q(jK2);
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return p141o0.C7016y0.k(g(p002a1.b.b(fT, fT2, f6), p002a1.b.b(fS, fS2, f6), p002a1.b.b(fQ, fQ2, f6), p002a1.b.b(fP, fP2, f6), cVarT), p141o0.C7016y0.r(j10));
    }

    public static final float j(long j6) {
        p151p0.c cVarR = p141o0.C7016y0.r(j6);
        if (!p151p0.b.e(cVarR.e(), p151p0.b.f52614a.b())) {
            p141o0.H1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((java.lang.Object) p151p0.b.h(cVarR.e())));
        }
        p247y7.AbstractC7350t.d(cVarR, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        p151p0.j jVarE = ((p151p0.x) cVarR).E();
        float fA = (float) ((jVarE.a(p141o0.C7016y0.t(j6)) * 0.2126d) + (jVarE.a(p141o0.C7016y0.s(j6)) * 0.7152d) + (jVarE.a(p141o0.C7016y0.q(j6)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int k(long j6) {
        return (int) p087i7.G.g(p141o0.C7016y0.k(j6, p151p0.g.f52623a.w()) >>> 32);
    }
}
