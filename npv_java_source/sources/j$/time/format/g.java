package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class g extends j$.time.format.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f47834g;

    g(j$.time.temporal.s sVar, int i6, int i10, boolean z6) {
        this(sVar, i6, i10, z6, 0);
        j$.util.Objects.requireNonNull(sVar, "field");
        if (!sVar.n().g()) {
            throw new java.lang.IllegalArgumentException(j$.time.b.a("Field must have a fixed set of values: ", sVar));
        }
        if (i6 < 0 || i6 > 9) {
            throw new java.lang.IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i6);
        }
        if (i10 < 1 || i10 > 9) {
            throw new java.lang.IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i10);
        }
        if (i10 >= i6) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i10 + " < " + i6);
    }

    g(j$.time.temporal.s sVar, int i6, int i10, boolean z6, int i11) {
        super(sVar, i6, i10, j$.time.format.D.NOT_NEGATIVE, i11);
        this.f47834g = z6;
    }

    @Override // j$.time.format.j
    final boolean c(j$.time.format.v vVar) {
        return vVar.l() && this.f47839b == this.f47840c && !this.f47834g;
    }

    @Override // j$.time.format.j
    final j$.time.format.j e() {
        if (this.f47842e == -1) {
            return this;
        }
        return new j$.time.format.g(this.f47838a, this.f47839b, this.f47840c, this.f47834g, -1);
    }

    @Override // j$.time.format.j
    final j$.time.format.j f(int i6) {
        return new j$.time.format.g(this.f47838a, this.f47839b, this.f47840c, this.f47834g, this.f47842e + i6);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        j$.time.temporal.s sVar = this.f47838a;
        java.lang.Long lE = xVar.e(sVar);
        if (lE == null) {
            return false;
        }
        j$.time.format.DecimalStyle decimalStyleB = xVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.v vVarN = sVar.n();
        vVarN.b(jLongValue, sVar);
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(vVarN.e());
        java.math.BigDecimal bigDecimalAdd = java.math.BigDecimal.valueOf(vVarN.d()).subtract(bigDecimalValueOf).add(java.math.BigDecimal.ONE);
        java.math.BigDecimal bigDecimalSubtract = java.math.BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.FLOOR;
        java.math.BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z6 = this.f47834g;
        int i6 = this.f47839b;
        if (iScale != 0) {
            java.lang.String strA = decimalStyleB.a(bigDecimal.setScale(java.lang.Math.min(java.lang.Math.max(bigDecimal.scale(), i6), this.f47840c), roundingMode).toPlainString().substring(2));
            if (z6) {
                sb.append(decimalStyleB.c());
            }
            sb.append(strA);
            return true;
        }
        if (i6 <= 0) {
            return true;
        }
        if (z6) {
            sb.append(decimalStyleB.c());
        }
        for (int i10 = 0; i10 < i6; i10++) {
            sb.append(decimalStyleB.f());
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        int i10 = (vVar.l() || c(vVar)) ? this.f47839b : 0;
        int i11 = (vVar.l() || c(vVar)) ? this.f47840c : 9;
        int length = charSequence.length();
        if (i6 == length) {
            return i10 > 0 ? ~i6 : i6;
        }
        if (this.f47834g) {
            if (charSequence.charAt(i6) != vVar.g().c()) {
                return i10 > 0 ? ~i6 : i6;
            }
            i6++;
        }
        int i12 = i6;
        int i13 = i10 + i12;
        if (i13 > length) {
            return ~i12;
        }
        int iMin = java.lang.Math.min(i11 + i12, length);
        int i14 = 0;
        int i15 = i12;
        while (i15 < iMin) {
            int i16 = i15 + 1;
            int iB = vVar.g().b(charSequence.charAt(i15));
            if (iB < 0) {
                if (i16 >= i13) {
                    break;
                }
                return ~i12;
            }
            i14 = (i14 * 10) + iB;
            i15 = i16;
        }
        java.math.BigDecimal bigDecimalMovePointLeft = new java.math.BigDecimal(i14).movePointLeft(i15 - i12);
        j$.time.temporal.v vVarN = this.f47838a.n();
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(vVarN.e());
        return vVar.o(this.f47838a, bigDecimalMovePointLeft.multiply(java.math.BigDecimal.valueOf(vVarN.d()).subtract(bigDecimalValueOf).add(java.math.BigDecimal.ONE)).setScale(0, java.math.RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i12, i15);
    }

    @Override // j$.time.format.j
    public final java.lang.String toString() {
        return "Fraction(" + this.f47838a + "," + this.f47839b + "," + this.f47840c + (this.f47834g ? ",DecimalPoint" : "") + ")";
    }
}
