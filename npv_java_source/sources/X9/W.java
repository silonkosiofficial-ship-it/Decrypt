package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends X9.C1839g {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient byte[][] f16107H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int[] f16108I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(byte[][] bArr, int[] iArr) {
        super(X9.C1839g.f16150G.o());
        p247y7.AbstractC7350t.f(bArr, "segments");
        p247y7.AbstractC7350t.f(iArr, "directory");
        this.f16107H = bArr;
        this.f16108I = iArr;
    }

    private final X9.C1839g S() {
        return new X9.C1839g(N());
    }

    @Override // X9.C1839g
    public int A(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "other");
        return S().A(bArr, i6);
    }

    @Override // X9.C1839g
    public boolean C(int i6, X9.C1839g c1839g, int i10, int i11) {
        p247y7.AbstractC7350t.f(c1839g, "other");
        if (i6 < 0 || i6 > I() - i11) {
            return false;
        }
        int i12 = i11 + i6;
        int iB = Y9.e.b(this, i6);
        while (i6 < i12) {
            int i13 = iB == 0 ? 0 : Q()[iB - 1];
            int i14 = Q()[iB] - i13;
            int i15 = Q()[R().length + iB];
            int iMin = java.lang.Math.min(i12, i14 + i13) - i6;
            if (!c1839g.D(i10, R()[iB], i15 + (i6 - i13), iMin)) {
                return false;
            }
            i10 += iMin;
            i6 += iMin;
            iB++;
        }
        return true;
    }

    @Override // X9.C1839g
    public boolean D(int i6, byte[] bArr, int i10, int i11) {
        p247y7.AbstractC7350t.f(bArr, "other");
        if (i6 < 0 || i6 > I() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int i12 = i11 + i6;
        int iB = Y9.e.b(this, i6);
        while (i6 < i12) {
            int i13 = iB == 0 ? 0 : Q()[iB - 1];
            int i14 = Q()[iB] - i13;
            int i15 = Q()[R().length + iB];
            int iMin = java.lang.Math.min(i12, i14 + i13) - i6;
            if (!X9.AbstractC1834b.a(R()[iB], i15 + (i6 - i13), bArr, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i6 += iMin;
            iB++;
        }
        return true;
    }

    @Override // X9.C1839g
    public X9.C1839g K(int i6, int i10) {
        int iE = X9.AbstractC1834b.e(this, i10);
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("beginIndex=" + i6 + " < 0").toString());
        }
        if (iE > I()) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + iE + " > length(" + I() + ')').toString());
        }
        int i11 = iE - i6;
        if (i11 < 0) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + i6).toString());
        }
        if (i6 == 0 && iE == I()) {
            return this;
        }
        if (i6 == iE) {
            return X9.C1839g.f16150G;
        }
        int iB = Y9.e.b(this, i6);
        int iB2 = Y9.e.b(this, iE - 1);
        byte[][] bArr = (byte[][]) p097j7.AbstractC6872n.r(R(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i12 = iB;
            int i13 = 0;
            while (true) {
                iArr[i13] = java.lang.Math.min(Q()[i12] - i6, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = Q()[R().length + i12];
                if (i12 == iB2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iB != 0 ? Q()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i6 - i15);
        return new X9.W(bArr, iArr);
    }

    @Override // X9.C1839g
    public X9.C1839g M() {
        return S().M();
    }

    @Override // X9.C1839g
    public byte[] N() {
        byte[] bArr = new byte[I()];
        int length = R().length;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < length) {
            int i12 = Q()[length + i6];
            int i13 = Q()[i6];
            int i14 = i13 - i10;
            p097j7.AbstractC6872n.g(R()[i6], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i6++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // X9.C1839g
    public void P(X9.C1836d c1836d, int i6, int i10) {
        p247y7.AbstractC7350t.f(c1836d, "buffer");
        int i11 = i6 + i10;
        int iB = Y9.e.b(this, i6);
        while (i6 < i11) {
            int i12 = iB == 0 ? 0 : Q()[iB - 1];
            int i13 = Q()[iB] - i12;
            int i14 = Q()[R().length + iB];
            int iMin = java.lang.Math.min(i11, i13 + i12) - i6;
            int i15 = i14 + (i6 - i12);
            X9.U u6 = new X9.U(R()[iB], i15, i15 + iMin, true, false);
            X9.U u10 = c1836d.f16138C;
            if (u10 == null) {
                u6.f16101g = u6;
                u6.f16100f = u6;
                c1836d.f16138C = u6;
            } else {
                p247y7.AbstractC7350t.c(u10);
                X9.U u11 = u10.f16101g;
                p247y7.AbstractC7350t.c(u11);
                u11.c(u6);
            }
            i6 += iMin;
            iB++;
        }
        c1836d.c1(c1836d.d1() + ((long) i10));
    }

    public final int[] Q() {
        return this.f16108I;
    }

    public final byte[][] R() {
        return this.f16107H;
    }

    @Override // X9.C1839g
    public java.lang.String e() {
        return S().e();
    }

    @Override // X9.C1839g
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X9.C1839g) {
            X9.C1839g c1839g = (X9.C1839g) obj;
            if (c1839g.I() == I() && C(0, c1839g, 0, I())) {
                return true;
            }
        }
        return false;
    }

    @Override // X9.C1839g
    public int hashCode() {
        int iQ = q();
        if (iQ != 0) {
            return iQ;
        }
        int length = R().length;
        int i6 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i6 < length) {
            int i12 = Q()[length + i6];
            int i13 = Q()[i6];
            byte[] bArr = R()[i6];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i6++;
            i11 = i13;
        }
        E(i10);
        return i10;
    }

    @Override // X9.C1839g
    public X9.C1839g i(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        p247y7.AbstractC7350t.f(str, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        int length = R().length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            int i11 = Q()[length + i6];
            int i12 = Q()[i6];
            messageDigest.update(R()[i6], i11, i12 - i10);
            i6++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        p247y7.AbstractC7350t.c(bArrDigest);
        return new X9.C1839g(bArrDigest);
    }

    @Override // X9.C1839g
    public int r() {
        return Q()[R().length - 1];
    }

    @Override // X9.C1839g
    public java.lang.String t() {
        return S().t();
    }

    @Override // X9.C1839g
    public java.lang.String toString() {
        return S().toString();
    }

    @Override // X9.C1839g
    public int v(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "other");
        return S().v(bArr, i6);
    }

    @Override // X9.C1839g
    public byte[] x() {
        return N();
    }

    @Override // X9.C1839g
    public byte y(int i6) {
        X9.AbstractC1834b.b(Q()[R().length - 1], i6, 1L);
        int iB = Y9.e.b(this, i6);
        return R()[iB][(i6 - (iB == 0 ? 0 : Q()[iB - 1])) + Q()[R().length + iB]];
    }
}
