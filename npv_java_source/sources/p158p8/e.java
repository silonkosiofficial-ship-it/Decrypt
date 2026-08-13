package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52776d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.io.InputStream f52778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52779g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f52783k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52780h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52782j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f52784l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f52785m = 67108864;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f52773a = new byte[4096];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52775c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52777e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52781i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52774b = false;

    private e(java.io.InputStream inputStream) {
        this.f52778f = inputStream;
    }

    public static int A(int i6, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i6 & 128) == 0) {
            return i6;
        }
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw p158p8.k.k();
            }
            i10 |= (i12 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw p158p8.k.k();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw p158p8.k.f();
    }

    private void M() {
        int i6 = this.f52775c + this.f52776d;
        this.f52775c = i6;
        int i10 = this.f52781i + i6;
        int i11 = this.f52782j;
        if (i10 <= i11) {
            this.f52776d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f52776d = i12;
        this.f52775c = i6 - i12;
    }

    private void N(int i6) throws p158p8.k {
        if (!S(i6)) {
            throw p158p8.k.k();
        }
    }

    private void R(int i6) throws p158p8.k {
        if (i6 < 0) {
            throw p158p8.k.g();
        }
        int i10 = this.f52781i;
        int i11 = this.f52777e;
        int i12 = i10 + i11 + i6;
        int i13 = this.f52782j;
        if (i12 > i13) {
            Q((i13 - i10) - i11);
            throw p158p8.k.k();
        }
        int i14 = this.f52775c;
        int i15 = i14 - i11;
        this.f52777e = i14;
        while (true) {
            N(1);
            int i16 = i6 - i15;
            int i17 = this.f52775c;
            if (i16 <= i17) {
                this.f52777e = i16;
                return;
            } else {
                i15 += i17;
                this.f52777e = i17;
            }
        }
    }

    private boolean S(int i6) throws java.io.IOException {
        int i10 = this.f52777e;
        int i11 = i10 + i6;
        int i12 = this.f52775c;
        if (i11 <= i12) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i6);
            sb.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.f52781i + i10 + i6 <= this.f52782j && this.f52778f != null) {
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.f52773a;
                    java.lang.System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f52781i += i10;
                this.f52775c -= i10;
                this.f52777e = 0;
            }
            java.io.InputStream inputStream = this.f52778f;
            byte[] bArr2 = this.f52773a;
            int i13 = this.f52775c;
            int i14 = inputStream.read(bArr2, i13, bArr2.length - i13);
            if (i14 == 0 || i14 < -1 || i14 > this.f52773a.length) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i14);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            if (i14 > 0) {
                this.f52775c += i14;
                if ((this.f52781i + i6) - this.f52785m > 0) {
                    throw p158p8.k.j();
                }
                M();
                if (this.f52775c >= i6) {
                    return true;
                }
                return S(i6);
            }
        }
        return false;
    }

    public static int b(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long c(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    private void d(int i6) throws p158p8.k {
        if (this.f52775c - this.f52777e < i6) {
            N(i6);
        }
    }

    public static p158p8.e g(java.io.InputStream inputStream) {
        return new p158p8.e(inputStream);
    }

    private byte[] w(int i6) throws p158p8.k {
        if (i6 <= 0) {
            if (i6 == 0) {
                return p158p8.j.f52821a;
            }
            throw p158p8.k.g();
        }
        int i10 = this.f52781i;
        int i11 = this.f52777e;
        int i12 = i10 + i11 + i6;
        int i13 = this.f52782j;
        if (i12 > i13) {
            Q((i13 - i10) - i11);
            throw p158p8.k.k();
        }
        if (i6 < 4096) {
            byte[] bArr = new byte[i6];
            int i14 = this.f52775c - i11;
            java.lang.System.arraycopy(this.f52773a, i11, bArr, 0, i14);
            this.f52777e = this.f52775c;
            int i15 = i6 - i14;
            d(i15);
            java.lang.System.arraycopy(this.f52773a, 0, bArr, i14, i15);
            this.f52777e = i15;
            return bArr;
        }
        int i16 = this.f52775c;
        this.f52781i = i10 + i16;
        this.f52777e = 0;
        this.f52775c = 0;
        int length = i16 - i11;
        int i17 = i6 - length;
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        while (i17 > 0) {
            int iMin = java.lang.Math.min(i17, 4096);
            byte[] bArr2 = new byte[iMin];
            int i18 = 0;
            while (i18 < iMin) {
                java.io.InputStream inputStream = this.f52778f;
                int i19 = inputStream == null ? -1 : inputStream.read(bArr2, i18, iMin - i18);
                if (i19 == -1) {
                    throw p158p8.k.k();
                }
                this.f52781i += i19;
                i18 += i19;
            }
            i17 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i6];
        java.lang.System.arraycopy(this.f52773a, i11, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public long B() {
        long j6;
        long j10;
        long j11;
        int i6 = this.f52777e;
        int i10 = this.f52775c;
        if (i10 != i6) {
            byte[] bArr = this.f52773a;
            int i11 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f52777e = i11;
                return b6;
            }
            if (i10 - i11 >= 9) {
                int i12 = i6 + 2;
                long j12 = (bArr[i11] << 7) ^ b6;
                if (j12 >= 0) {
                    int i13 = i6 + 3;
                    long j13 = j12 ^ ((long) (bArr[i12] << 14));
                    if (j13 >= 0) {
                        j11 = 16256;
                    } else {
                        i12 = i6 + 4;
                        j12 = j13 ^ ((long) (bArr[i13] << 21));
                        if (j12 < 0) {
                            j10 = -2080896;
                        } else {
                            i13 = i6 + 5;
                            j13 = j12 ^ (((long) bArr[i12]) << 28);
                            if (j13 >= 0) {
                                j11 = 266354560;
                            } else {
                                i12 = i6 + 6;
                                j12 = j13 ^ (((long) bArr[i13]) << 35);
                                if (j12 >= 0) {
                                    i13 = i6 + 7;
                                    j13 = j12 ^ (((long) bArr[i12]) << 42);
                                    if (j13 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i12 = i6 + 8;
                                        j12 = j13 ^ (((long) bArr[i13]) << 49);
                                        if (j12 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i6 + 9;
                                            long j14 = (j12 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i12 = i6 + 10;
                                                if (bArr[i13] >= 0) {
                                                    j6 = j14;
                                                }
                                            } else {
                                                j6 = j14;
                                                i12 = i13;
                                            }
                                        }
                                    }
                                    this.f52777e = i12;
                                    return j6;
                                }
                                j10 = -34093383808L;
                            }
                        }
                    }
                    j6 = j13 ^ j11;
                    i12 = i13;
                    this.f52777e = i12;
                    return j6;
                }
                j10 = -128;
                j6 = j12 ^ j10;
                this.f52777e = i12;
                return j6;
            }
        }
        return C();
    }

    long C() throws p158p8.k {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            byte bV = v();
            j6 |= ((long) (bV & 127)) << i6;
            if ((bV & 128) == 0) {
                return j6;
            }
        }
        throw p158p8.k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public java.lang.String H() {
        int iZ = z();
        int i6 = this.f52775c;
        int i10 = this.f52777e;
        if (iZ > i6 - i10 || iZ <= 0) {
            return iZ == 0 ? "" : new java.lang.String(w(iZ), "UTF-8");
        }
        java.lang.String str = new java.lang.String(this.f52773a, i10, iZ, "UTF-8");
        this.f52777e += iZ;
        return str;
    }

    public java.lang.String I() throws p158p8.k {
        byte[] bArrW;
        int iZ = z();
        int i6 = this.f52777e;
        if (iZ <= this.f52775c - i6 && iZ > 0) {
            bArrW = this.f52773a;
            this.f52777e = i6 + iZ;
        } else {
            if (iZ == 0) {
                return "";
            }
            bArrW = w(iZ);
            i6 = 0;
        }
        if (p158p8.x.f(bArrW, i6, i6 + iZ)) {
            return new java.lang.String(bArrW, i6, iZ, "UTF-8");
        }
        throw p158p8.k.d();
    }

    public int J() throws p158p8.k {
        if (f()) {
            this.f52779g = 0;
            return 0;
        }
        int iZ = z();
        this.f52779g = iZ;
        if (p158p8.y.a(iZ) != 0) {
            return this.f52779g;
        }
        throw p158p8.k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i6, p158p8.f fVar) throws p158p8.k {
        int iB = p158p8.y.b(i6);
        if (iB == 0) {
            long jS = s();
            fVar.n0(i6);
            fVar.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            fVar.n0(i6);
            fVar.U(jY);
            return true;
        }
        if (iB == 2) {
            p158p8.d dVarK = k();
            fVar.n0(i6);
            fVar.O(dVarK);
            return true;
        }
        if (iB == 3) {
            fVar.n0(i6);
            P(fVar);
            int iC = p158p8.y.c(p158p8.y.a(i6), 4);
            a(iC);
            fVar.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw p158p8.k.e();
        }
        int iX = x();
        fVar.n0(i6);
        fVar.T(iX);
        return true;
    }

    public void P(p158p8.f fVar) throws p158p8.k {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, fVar));
    }

    public void Q(int i6) throws p158p8.k {
        int i10 = this.f52775c;
        int i11 = this.f52777e;
        if (i6 > i10 - i11 || i6 < 0) {
            R(i6);
        } else {
            this.f52777e = i11 + i6;
        }
    }

    public void a(int i6) throws p158p8.k {
        if (this.f52779g != i6) {
            throw p158p8.k.b();
        }
    }

    public int e() {
        int i6 = this.f52782j;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - (this.f52781i + this.f52777e);
    }

    public boolean f() {
        return this.f52777e == this.f52775c && !S(1);
    }

    public void h(int i6) {
        this.f52782j = i6;
        M();
    }

    public int i(int i6) throws p158p8.k {
        if (i6 < 0) {
            throw p158p8.k.g();
        }
        int i10 = i6 + this.f52781i + this.f52777e;
        int i11 = this.f52782j;
        if (i10 > i11) {
            throw p158p8.k.k();
        }
        this.f52782j = i10;
        M();
        return i11;
    }

    public boolean j() {
        return B() != 0;
    }

    public p158p8.d k() {
        int iZ = z();
        int i6 = this.f52775c;
        int i10 = this.f52777e;
        if (iZ > i6 - i10 || iZ <= 0) {
            return iZ == 0 ? p158p8.d.f52766C : new p158p8.o(w(iZ));
        }
        p158p8.d cVar = (this.f52774b && this.f52780h) ? new p158p8.c(this.f52773a, this.f52777e, iZ) : p158p8.d.n(this.f52773a, i10, iZ);
        this.f52777e += iZ;
        return cVar;
    }

    public double l() {
        return java.lang.Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return java.lang.Float.intBitsToFloat(x());
    }

    public void q(int i6, p8.p.a aVar, p158p8.g gVar) throws p158p8.k {
        int i10 = this.f52783k;
        if (i10 >= this.f52784l) {
            throw p158p8.k.h();
        }
        this.f52783k = i10 + 1;
        aVar.g0(this, gVar);
        a(p158p8.y.c(i6, 4));
        this.f52783k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p158p8.p t(p158p8.r rVar, p158p8.g gVar) throws p158p8.k {
        int iZ = z();
        if (this.f52783k >= this.f52784l) {
            throw p158p8.k.h();
        }
        int i6 = i(iZ);
        this.f52783k++;
        p158p8.p pVar = (p158p8.p) rVar.a(this, gVar);
        a(0);
        this.f52783k--;
        h(i6);
        return pVar;
    }

    public void u(p8.p.a aVar, p158p8.g gVar) throws p158p8.k {
        int iZ = z();
        if (this.f52783k >= this.f52784l) {
            throw p158p8.k.h();
        }
        int i6 = i(iZ);
        this.f52783k++;
        aVar.g0(this, gVar);
        a(0);
        this.f52783k--;
        h(i6);
    }

    public byte v() throws p158p8.k {
        if (this.f52777e == this.f52775c) {
            N(1);
        }
        byte[] bArr = this.f52773a;
        int i6 = this.f52777e;
        this.f52777e = i6 + 1;
        return bArr[i6];
    }

    public int x() throws p158p8.k {
        int i6 = this.f52777e;
        if (this.f52775c - i6 < 4) {
            N(4);
            i6 = this.f52777e;
        }
        byte[] bArr = this.f52773a;
        this.f52777e = i6 + 4;
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public long y() throws p158p8.k {
        int i6 = this.f52777e;
        if (this.f52775c - i6 < 8) {
            N(8);
            i6 = this.f52777e;
        }
        byte[] bArr = this.f52773a;
        this.f52777e = i6 + 8;
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
    }

    public int z() {
        int i6;
        int i10 = this.f52777e;
        int i11 = this.f52775c;
        if (i11 != i10) {
            byte[] bArr = this.f52773a;
            int i12 = i10 + 1;
            byte b6 = bArr[i10];
            if (b6 >= 0) {
                this.f52777e = i12;
                return b6;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b6;
                long j6 = i14;
                if (j6 < 0) {
                    i6 = (int) ((-128) ^ j6);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    long j10 = i16;
                    if (j10 >= 0) {
                        i6 = (int) (16256 ^ j10);
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        long j11 = i18;
                        if (j11 < 0) {
                            i6 = (int) ((-2080896) ^ j11);
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (int) (((long) (i18 ^ (b10 << 28))) ^ 266354560);
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i6 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i19;
                            }
                            i6 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f52777e = i13;
                return i6;
            }
        }
        return (int) C();
    }
}
