package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
class j implements j$.time.format.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long[] f47837f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.time.temporal.s f47838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f47839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f47840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.format.D f47841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f47842e;

    j(j$.time.temporal.s sVar, int i6, int i10, j$.time.format.D d6) {
        this.f47838a = sVar;
        this.f47839b = i6;
        this.f47840c = i10;
        this.f47841d = d6;
        this.f47842e = 0;
    }

    protected j(j$.time.temporal.s sVar, int i6, int i10, j$.time.format.D d6, int i11) {
        this.f47838a = sVar;
        this.f47839b = i6;
        this.f47840c = i10;
        this.f47841d = d6;
        this.f47842e = i11;
    }

    long b(j$.time.format.x xVar, long j6) {
        return j6;
    }

    boolean c(j$.time.format.v vVar) {
        int i6 = this.f47842e;
        return i6 == -1 || (i6 > 0 && this.f47839b == this.f47840c && this.f47841d == j$.time.format.D.NOT_NEGATIVE);
    }

    int d(j$.time.format.v vVar, long j6, int i6, int i10) {
        return vVar.o(this.f47838a, j6, i6, i10);
    }

    j$.time.format.j e() {
        if (this.f47842e == -1) {
            return this;
        }
        return new j$.time.format.j(this.f47838a, this.f47839b, this.f47840c, this.f47841d, -1);
    }

    j$.time.format.j f(int i6) {
        int i10 = this.f47842e + i6;
        return new j$.time.format.j(this.f47838a, this.f47839b, this.f47840c, this.f47841d, i10);
    }

    @Override // j$.time.format.f
    public boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        j$.time.temporal.s sVar = this.f47838a;
        java.lang.Long lE = xVar.e(sVar);
        if (lE == null) {
            return false;
        }
        long jB = b(xVar, lE.longValue());
        j$.time.format.DecimalStyle decimalStyleB = xVar.b();
        java.lang.String string = jB == Long.MIN_VALUE ? "9223372036854775808" : java.lang.Long.toString(java.lang.Math.abs(jB));
        int length = string.length();
        int i6 = this.f47840c;
        if (length > i6) {
            throw new j$.time.DateTimeException("Field " + sVar + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i6);
        }
        java.lang.String strA = decimalStyleB.a(string);
        int i10 = this.f47839b;
        j$.time.format.D d6 = this.f47841d;
        if (jB >= 0) {
            int i11 = j$.time.format.AbstractC6705c.f47830a[d6.ordinal()];
            if (i11 == 1 ? !(i10 >= 19 || jB < f47837f[i10]) : i11 == 2) {
                sb.append(decimalStyleB.e());
            }
        } else {
            int i12 = j$.time.format.AbstractC6705c.f47830a[d6.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb.append(decimalStyleB.d());
            } else if (i12 == 4) {
                throw new j$.time.DateTimeException("Field " + sVar + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - strA.length(); i13++) {
            sb.append(decimalStyleB.f());
        }
        sb.append(strA);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    @Override // j$.time.format.f
    public int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10;
        boolean z6;
        boolean z10;
        int i11;
        java.math.BigInteger bigIntegerDivide;
        long j6;
        long j10;
        int length = charSequence.length();
        if (i6 == length) {
            return ~i6;
        }
        char cCharAt = charSequence.charAt(i6);
        char cE = vVar.g().e();
        int i12 = this.f47840c;
        j$.time.format.D d6 = this.f47841d;
        int i13 = this.f47839b;
        int i14 = 0;
        if (cCharAt == cE) {
            if (!d6.n(true, vVar.l(), i13 == i12)) {
                return ~i6;
            }
            i10 = i6 + 1;
            z10 = true;
            z6 = false;
        } else if (cCharAt == vVar.g().d()) {
            if (!d6.n(false, vVar.l(), i13 == i12)) {
                return ~i6;
            }
            i10 = i6 + 1;
            z6 = true;
            z10 = false;
        } else {
            if (d6 == j$.time.format.D.ALWAYS && vVar.l()) {
                return ~i6;
            }
            i10 = i6;
            z6 = false;
            z10 = false;
        }
        int i15 = (vVar.l() || c(vVar)) ? i13 : 1;
        int i16 = i10 + i15;
        if (i16 > length) {
            return ~i10;
        }
        if (!vVar.l() && !c(vVar)) {
            i12 = 9;
        }
        int i17 = this.f47842e;
        int iMax = java.lang.Math.max(i17, 0) + i12;
        while (true) {
            java.math.BigInteger bigIntegerAdd = null;
            if (i14 >= 2) {
                i11 = i10;
                bigIntegerDivide = null;
                j6 = 0;
                break;
            }
            int iMin = java.lang.Math.min(iMax + i10, length);
            int i18 = i10;
            long j11 = 0;
            while (i18 < iMin) {
                int i19 = i18 + 1;
                int iB = vVar.g().b(charSequence.charAt(i18));
                if (iB < 0) {
                    if (i18 >= i16) {
                        break;
                    }
                    return ~i10;
                }
                if (i19 - i10 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = java.math.BigInteger.valueOf(j11);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(java.math.BigInteger.TEN).add(java.math.BigInteger.valueOf(iB));
                } else {
                    j11 = (j11 * 10) + ((long) iB);
                }
                iMin = iMin;
                i18 = i19;
            }
            if (i17 <= 0 || i14 != 0) {
                i11 = i18;
                bigIntegerDivide = bigIntegerAdd;
                j6 = j11;
                break;
            }
            iMax = java.lang.Math.max(i15, (i18 - i10) - i17);
            i14++;
        }
        if (z6) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(java.math.BigInteger.ZERO) && vVar.l()) {
                    return ~(i10 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j6 == 0 && vVar.l()) {
                    return ~(i10 - 1);
                }
                j10 = -j6;
            }
            if (bigIntegerDivide != null) {
                return d(vVar, j10, i10, i11);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(java.math.BigInteger.TEN);
                i11--;
            }
            return d(vVar, bigIntegerDivide.longValue(), i10, i11);
        }
        if (d6 == j$.time.format.D.EXCEEDS_PAD && vVar.l()) {
            int i20 = i11 - i10;
            if (z10) {
                if (i20 <= i13) {
                    return ~(i10 - 1);
                }
            } else if (i20 > i13) {
                return ~i10;
            }
        }
        j10 = j6;
        if (bigIntegerDivide != null) {
            return d(vVar, j10, i10, i11);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(java.math.BigInteger.TEN);
            i11--;
        }
        return d(vVar, bigIntegerDivide.longValue(), i10, i11);
    }

    public java.lang.String toString() {
        int i6 = this.f47840c;
        j$.time.temporal.s sVar = this.f47838a;
        j$.time.format.D d6 = this.f47841d;
        int i10 = this.f47839b;
        if (i10 == 1 && i6 == 19 && d6 == j$.time.format.D.NORMAL) {
            return "Value(" + sVar + ")";
        }
        if (i10 == i6 && d6 == j$.time.format.D.NOT_NEGATIVE) {
            return "Value(" + sVar + "," + i10 + ")";
        }
        return "Value(" + sVar + "," + i10 + "," + i6 + "," + d6 + ")";
    }
}
