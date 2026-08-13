package p200u;

/* JADX INFO: renamed from: u.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7174i0 {
    public static final long a(double d6, double d10, double d11, double d12, double d13) {
        double dSqrt = 2.0d * d10 * java.lang.Math.sqrt(d6);
        double d14 = (dSqrt * dSqrt) - (4.0d * d6);
        double d15 = -dSqrt;
        p200u.C7196x c7196xA = p200u.AbstractC7197y.a(d14);
        c7196xA.f55126a += d15;
        c7196xA.f55126a *= 0.5d;
        c7196xA.f55127b *= 0.5d;
        p200u.C7196x c7196xA2 = p200u.AbstractC7197y.a(d14);
        double d16 = -1;
        c7196xA2.f55126a *= d16;
        c7196xA2.f55127b *= d16;
        c7196xA2.f55126a += d15;
        c7196xA2.f55126a *= 0.5d;
        c7196xA2.f55127b *= 0.5d;
        return d(c7196xA, c7196xA2, d10, d11, d12, d13);
    }

    public static final long b(float f6, float f10, float f11, float f12, float f13) {
        if (f10 == 0.0f) {
            return 9223372036854L;
        }
        return a(f6, f10, f11, f12, f13);
    }

    private static final double c(p200u.C7196x c7196x, double d6, double d10, double d11) {
        double d12;
        double d13 = d11;
        double dF = c7196x.f();
        double d14 = dF * d6;
        double d15 = d10 - d14;
        double dLog = java.lang.Math.log(java.lang.Math.abs(d13 / d6)) / dF;
        double dLog2 = java.lang.Math.log(java.lang.Math.abs(d13 / d15));
        double dLog3 = dLog2;
        int i6 = 0;
        while (true) {
            d12 = dLog3 / dF;
            if (i6 >= 6) {
                break;
            }
            dLog3 = dLog2 - java.lang.Math.log(java.lang.Math.abs(d12));
            i6++;
        }
        if (!((java.lang.Double.isInfinite(dLog) || java.lang.Double.isNaN(dLog)) ? false : true)) {
            dLog = d12;
        } else {
            if (!(!((java.lang.Double.isInfinite(d12) || java.lang.Double.isNaN(d12)) ? false : true))) {
                dLog = java.lang.Math.max(dLog, d12);
            }
        }
        double d16 = (-(d14 + d15)) / (dF * d15);
        double d17 = dF * d16;
        double dExp = (java.lang.Math.exp(d17) * d6) + (d15 * d16 * java.lang.Math.exp(d17));
        if (java.lang.Double.isNaN(d16) || d16 <= 0.0d) {
            d13 = -d13;
        } else if (d16 <= 0.0d || (-dExp) >= d13) {
            dLog = (-(2.0d / dF)) - (d6 / d15);
        } else {
            if (d15 < 0.0d && d6 > 0.0d) {
                dLog = 0.0d;
            }
            d13 = -d13;
        }
        double dAbs = Double.MAX_VALUE;
        int i10 = 0;
        while (dAbs > 0.001d && i10 < 100) {
            i10++;
            double d18 = dF * dLog;
            double d19 = d13;
            double dExp2 = dLog - ((((d6 + (d15 * dLog)) * java.lang.Math.exp(d18)) + d13) / ((((((double) 1) + d18) * d15) + d14) * java.lang.Math.exp(d18)));
            dAbs = java.lang.Math.abs(dLog - dExp2);
            dLog = dExp2;
            d13 = d19;
        }
        return dLog;
    }

    private static final long d(p200u.C7196x c7196x, p200u.C7196x c7196x2, double d6, double d10, double d11, double d12) {
        double dG;
        double d13 = d10;
        if (d11 == 0.0d && d13 == 0.0d) {
            return 0L;
        }
        if (d11 < 0.0d) {
            d13 = -d13;
        }
        double dAbs = java.lang.Math.abs(d11);
        if (d6 > 1.0d) {
            dG = e(c7196x, c7196x2, dAbs, d13, d12);
        } else {
            double d14 = d13;
            dG = d6 < 1.0d ? g(c7196x, dAbs, d14, d12) : c(c7196x, dAbs, d14, d12);
        }
        return (long) (dG * 1000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    private static final double e(p200u.C7196x c7196x, p200u.C7196x c7196x2, double d6, double d10, double d11) {
        double dLog;
        double d12;
        double d13;
        double d14;
        int i6;
        double d15 = d11;
        double dF = c7196x.f();
        double dF2 = c7196x2.f();
        double d16 = dF - dF2;
        double d17 = ((dF * d6) - d10) / d16;
        double d18 = d6 - d17;
        double dLog2 = java.lang.Math.log(java.lang.Math.abs(d15 / d18)) / dF;
        double dLog3 = java.lang.Math.log(java.lang.Math.abs(d15 / d17)) / dF2;
        if (!((java.lang.Double.isInfinite(dLog2) || java.lang.Double.isNaN(dLog2)) ? false : true)) {
            dLog = dLog3;
        } else {
            if (!(!((java.lang.Double.isInfinite(dLog3) || java.lang.Double.isNaN(dLog3)) ? false : true))) {
                dLog2 = java.lang.Math.max(dLog2, dLog3);
            }
            dLog = dLog2;
        }
        double d19 = d18 * dF;
        double dLog4 = java.lang.Math.log(d19 / ((-d17) * dF2)) / (dF2 - dF);
        if (!java.lang.Double.isNaN(dLog4) && dLog4 > 0.0d) {
            if (dLog4 > 0.0d) {
                d12 = d17;
                if ((-f(d18, dF, dLog4, d17, dF2)) < d15) {
                    if (d12 > 0.0d && d18 < 0.0d) {
                        dLog = 0.0d;
                    }
                }
                d13 = d12 * dF2;
                if (java.lang.Math.abs((java.lang.Math.exp(dF * dLog) * d19) + (java.lang.Math.exp(dF2 * dLog) * d13)) < 1.0E-4d) {
                    return dLog;
                }
                d14 = Double.MAX_VALUE;
                i6 = 0;
                while (d14 > 0.001d && i6 < 100) {
                    i6++;
                    double d20 = dF * dLog;
                    double d21 = dF2 * dLog;
                    double dExp = dLog - ((((java.lang.Math.exp(d20) * d18) + (java.lang.Math.exp(d21) * d12)) + d15) / ((java.lang.Math.exp(d20) * d19) + (java.lang.Math.exp(d21) * d13)));
                    double dAbs = java.lang.Math.abs(dLog - dExp);
                    dLog = dExp;
                    d14 = dAbs;
                }
                return dLog;
            }
            d12 = d17;
            dLog = java.lang.Math.log((-((d12 * dF2) * dF2)) / (d19 * dF)) / d16;
            d13 = d12 * dF2;
            if (java.lang.Math.abs((java.lang.Math.exp(dF * dLog) * d19) + (java.lang.Math.exp(dF2 * dLog) * d13)) < 1.0E-4d) {
                return dLog;
            }
            d14 = Double.MAX_VALUE;
            i6 = 0;
            while (d14 > 0.001d) {
                i6++;
                double d22 = dF * dLog;
                double d23 = dF2 * dLog;
                double dExp2 = dLog - ((((java.lang.Math.exp(d22) * d18) + (java.lang.Math.exp(d23) * d12)) + d15) / ((java.lang.Math.exp(d22) * d19) + (java.lang.Math.exp(d23) * d13)));
                double dAbs2 = java.lang.Math.abs(dLog - dExp2);
                dLog = dExp2;
                d14 = dAbs2;
            }
            return dLog;
        }
        d12 = d17;
        d15 = -d15;
        d13 = d12 * dF2;
        if (java.lang.Math.abs((java.lang.Math.exp(dF * dLog) * d19) + (java.lang.Math.exp(dF2 * dLog) * d13)) < 1.0E-4d) {
            return dLog;
        }
        d14 = Double.MAX_VALUE;
        i6 = 0;
        while (d14 > 0.001d) {
            i6++;
            double d24 = dF * dLog;
            double d25 = dF2 * dLog;
            double dExp3 = dLog - ((((java.lang.Math.exp(d24) * d18) + (java.lang.Math.exp(d25) * d12)) + d15) / ((java.lang.Math.exp(d24) * d19) + (java.lang.Math.exp(d25) * d13)));
            double dAbs3 = java.lang.Math.abs(dLog - dExp3);
            dLog = dExp3;
            d14 = dAbs3;
        }
        return dLog;
    }

    private static final double f(double d6, double d10, double d11, double d12, double d13) {
        return (d6 * java.lang.Math.exp(d10 * d11)) + (d12 * java.lang.Math.exp(d13 * d11));
    }

    private static final double g(p200u.C7196x c7196x, double d6, double d10, double d11) {
        double dF = c7196x.f();
        double dE = (d10 - (dF * d6)) / c7196x.e();
        return java.lang.Math.log(d11 / java.lang.Math.sqrt((d6 * d6) + (dE * dE))) / dF;
    }
}
