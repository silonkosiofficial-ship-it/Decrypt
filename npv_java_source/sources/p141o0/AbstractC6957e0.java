package p141o0;

/* JADX INFO: renamed from: o0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6957e0 {
    public static final long b(float f6, float f10, float f11, float f12, float[] fArr, int i6) {
        float f13 = (f10 - f6) * 3.0f;
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        int iF = f(f13, f14, f15, fArr, i6);
        float f16 = (f14 - f13) * 2.0f;
        int iG = iF + g((-f16) / (((f15 - f14) * 2.0f) - f16), fArr, i6 + iF);
        float fMin = java.lang.Math.min(f6, f12);
        float fMax = java.lang.Math.max(f6, f12);
        for (int i10 = 0; i10 < iG; i10++) {
            float fD = d(f6, f10, f11, f12, fArr[i10]);
            fMin = java.lang.Math.min(fMin, fD);
            fMax = java.lang.Math.max(fMax, fD);
        }
        return p170r.AbstractC7032g.a(fMin, fMax);
    }

    public static final float c(float f6, float f10, float f11) {
        return ((((((f6 - f10) + 0.33333334f) * f11) + (f10 - (2.0f * f6))) * f11) + f6) * 3.0f * f11;
    }

    private static final float d(float f6, float f10, float f11, float f12, float f13) {
        float f14 = (f12 + ((f10 - f11) * 3.0f)) - f6;
        return (((((f14 * f13) + (((f11 - (2.0f * f10)) + f6) * 3.0f)) * f13) + ((f10 - f6) * 3.0f)) * f13) + f6;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    public static final float e(float f6, float f10, float f11, float f12) {
        double d6 = f6;
        double d10 = ((d6 - (((double) f10) * 2.0d)) + ((double) f11)) * 3.0d;
        double d11 = ((double) (f10 - f6)) * 3.0d;
        double d12 = ((double) (-f6)) + (((double) (f10 - f11)) * 3.0d) + ((double) f12);
        if (java.lang.Math.abs(d12 - 0.0d) < 1.0E-7d) {
            if (java.lang.Math.abs(d10 - 0.0d) < 1.0E-7d) {
                if (java.lang.Math.abs(d11 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f13 = (float) ((-d6) / d11);
                if (f13 < 0.0f) {
                    if (f13 >= -8.34465E-7f) {
                        return 0.0f;
                    }
                } else {
                    if (f13 <= 1.0f) {
                        return f13;
                    }
                    if (f13 <= 1.0000008f) {
                        return 1.0f;
                    }
                }
                return Float.NaN;
            }
            double dSqrt = java.lang.Math.sqrt((d11 * d11) - ((4.0d * d10) * d6));
            double d13 = d10 * 2.0d;
            float f14 = (float) ((dSqrt - d11) / d13);
            if (f14 < 0.0f) {
                if (f14 >= -8.34465E-7f) {
                    f14 = 0.0f;
                } else {
                    f14 = Float.NaN;
                }
            } else if (f14 > 1.0f) {
                if (f14 <= 1.0000008f) {
                    f14 = 1.0f;
                } else {
                    f14 = Float.NaN;
                }
            }
            if (!java.lang.Float.isNaN(f14)) {
                return f14;
            }
            float f15 = (float) (((-d11) - dSqrt) / d13);
            if (f15 < 0.0f) {
                if (f15 >= -8.34465E-7f) {
                    return 0.0f;
                }
            } else {
                if (f15 <= 1.0f) {
                    return f15;
                }
                if (f15 <= 1.0000008f) {
                    return 1.0f;
                }
            }
            return Float.NaN;
        }
        double d14 = d10 / d12;
        double d15 = d11 / d12;
        double d16 = d6 / d12;
        double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
        double d18 = (((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15)) + (d16 * 27.0d)) / 54.0d;
        double d19 = d17 * d17 * d17;
        double d20 = (d18 * d18) + d19;
        double d21 = d14 / 3.0d;
        if (d20 >= 0.0d) {
            if (d20 != 0.0d) {
                double dSqrt2 = java.lang.Math.sqrt(d20);
                float fA = (float) (((double) (p002a1.b.a((float) ((-d18) + dSqrt2)) - p002a1.b.a((float) (d18 + dSqrt2)))) - d21);
                if (fA < 0.0f) {
                    if (fA >= -8.34465E-7f) {
                        return 0.0f;
                    }
                } else {
                    if (fA <= 1.0f) {
                        return fA;
                    }
                    if (fA <= 1.0000008f) {
                        return 1.0f;
                    }
                }
                return Float.NaN;
            }
            float f16 = -p002a1.b.a((float) d18);
            float f17 = (float) d21;
            float f18 = (2.0f * f16) - f17;
            if (f18 < 0.0f) {
                if (f18 >= -8.34465E-7f) {
                    f18 = 0.0f;
                } else {
                    f18 = Float.NaN;
                }
            } else if (f18 > 1.0f) {
                if (f18 <= 1.0000008f) {
                    f18 = 1.0f;
                } else {
                    f18 = Float.NaN;
                }
            }
            if (!java.lang.Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (-f16) - f17;
            if (f19 < 0.0f) {
                if (f19 >= -8.34465E-7f) {
                    return 0.0f;
                }
            } else {
                if (f19 <= 1.0f) {
                    return f19;
                }
                if (f19 <= 1.0000008f) {
                    return 1.0f;
                }
            }
            return Float.NaN;
        }
        double dSqrt3 = java.lang.Math.sqrt(-d19);
        double d22 = (-d18) / dSqrt3;
        if (d22 < -1.0d) {
            d22 = -1.0d;
        }
        if (d22 > 1.0d) {
            d22 = 1.0d;
        }
        double dAcos = java.lang.Math.acos(d22);
        double dA = p002a1.b.a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((java.lang.Math.cos(dAcos / 3.0d) * dA) - d21);
        if (fCos < 0.0f) {
            if (fCos >= -8.34465E-7f) {
                fCos = 0.0f;
            } else {
                fCos = Float.NaN;
            }
        } else if (fCos > 1.0f) {
            if (fCos <= 1.0000008f) {
                fCos = 1.0f;
            } else {
                fCos = Float.NaN;
            }
        }
        if (!java.lang.Float.isNaN(fCos)) {
            return fCos;
        }
        float fCos2 = (float) ((java.lang.Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d21);
        if (fCos2 < 0.0f) {
            if (fCos2 >= -8.34465E-7f) {
                fCos2 = 0.0f;
            } else {
                fCos2 = Float.NaN;
            }
        } else if (fCos2 > 1.0f) {
            if (fCos2 <= 1.0000008f) {
                fCos2 = 1.0f;
            } else {
                fCos2 = Float.NaN;
            }
        }
        if (!java.lang.Float.isNaN(fCos2)) {
            return fCos2;
        }
        float fCos3 = (float) ((dA * java.lang.Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d21);
        if (fCos3 < 0.0f) {
            if (fCos3 >= -8.34465E-7f) {
                return 0.0f;
            }
        } else {
            if (fCos3 <= 1.0f) {
                return fCos3;
            }
            if (fCos3 <= 1.0000008f) {
                return 1.0f;
            }
        }
        return Float.NaN;
    }

    private static final int f(float f6, float f10, float f11, float[] fArr, int i6) {
        double d6 = f6;
        double d10 = f10;
        double d11 = f11;
        double d12 = d10 * 2.0d;
        double d13 = (d6 - d12) + d11;
        if (d13 == 0.0d) {
            if (d10 == d11) {
                return 0;
            }
            return g((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, i6);
        }
        double d14 = -java.lang.Math.sqrt((d10 * d10) - (d11 * d6));
        double d15 = (-d6) + d10;
        int iG = g((float) ((-(d14 + d15)) / d13), fArr, i6);
        int iG2 = iG + g((float) ((d14 - d15) / d13), fArr, i6 + iG);
        if (iG2 > 1) {
            float f12 = fArr[i6];
            int i10 = i6 + 1;
            float f13 = fArr[i10];
            if (f12 > f13) {
                fArr[i6] = f13;
                fArr[i10] = f12;
            } else if (f12 == f13) {
                return iG2 - 1;
            }
        }
        return iG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r0
  0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static final int g(float f6, float[] fArr, int i6) {
        float f10 = 0.0f;
        if (f6 >= 0.0f) {
            f10 = 1.0f;
            if (f6 > 1.0f) {
                if (f6 <= 1.0000008f) {
                    f6 = f10;
                } else {
                    f6 = Float.NaN;
                }
            }
        } else if (f6 >= -8.34465E-7f) {
            f6 = f10;
        } else {
            f6 = Float.NaN;
        }
        fArr[i6] = f6;
        return !java.lang.Float.isNaN(f6) ? 1 : 0;
    }
}
