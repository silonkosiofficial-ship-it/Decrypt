package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2048h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f22002f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.datastore.preferences.protobuf.C2049i f22006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22007e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends androidx.datastore.preferences.protobuf.AbstractC2048h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f22008g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f22009h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f22010i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22011j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22012k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22013l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f22014m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f22015n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f22016o;

        private b(byte[] bArr, int i6, int i10, boolean z6) {
            super();
            this.f22016o = Integer.MAX_VALUE;
            this.f22008g = bArr;
            this.f22010i = i10 + i6;
            this.f22012k = i6;
            this.f22013l = i6;
            this.f22009h = z6;
        }

        private void M() {
            int i6 = this.f22010i + this.f22011j;
            this.f22010i = i6;
            int i10 = i6 - this.f22013l;
            int i11 = this.f22016o;
            if (i10 <= i11) {
                this.f22011j = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f22011j = i12;
            this.f22010i = i6 - i12;
        }

        private void P() throws androidx.datastore.preferences.protobuf.C2065z {
            if (this.f22010i - this.f22012k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws androidx.datastore.preferences.protobuf.C2065z {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f22008g;
                int i10 = this.f22012k;
                this.f22012k = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        private void R() throws androidx.datastore.preferences.protobuf.C2065z {
            for (int i6 = 0; i6 < 10; i6++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public java.lang.String A() throws androidx.datastore.preferences.protobuf.C2065z {
            int iJ = J();
            if (iJ > 0) {
                int i6 = this.f22010i;
                int i10 = this.f22012k;
                if (iJ <= i6 - i10) {
                    java.lang.String strE = androidx.datastore.preferences.protobuf.q0.e(this.f22008g, i10, iJ);
                    this.f22012k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            throw androidx.datastore.preferences.protobuf.C2065z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int B() throws androidx.datastore.preferences.protobuf.C2065z {
            if (e()) {
                this.f22014m = 0;
                return 0;
            }
            int iJ = J();
            this.f22014m = iJ;
            if (androidx.datastore.preferences.protobuf.r0.a(iJ) != 0) {
                return this.f22014m;
            }
            throw androidx.datastore.preferences.protobuf.C2065z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean E(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            int iB = androidx.datastore.preferences.protobuf.r0.b(i6);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(androidx.datastore.preferences.protobuf.r0.c(androidx.datastore.preferences.protobuf.r0.a(i6), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            O(4);
            return true;
        }

        public byte F() throws androidx.datastore.preferences.protobuf.C2065z {
            int i6 = this.f22012k;
            if (i6 == this.f22010i) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            byte[] bArr = this.f22008g;
            this.f22012k = i6 + 1;
            return bArr[i6];
        }

        public byte[] G(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 > 0) {
                int i10 = this.f22010i;
                int i11 = this.f22012k;
                if (i6 <= i10 - i11) {
                    int i12 = i6 + i11;
                    this.f22012k = i12;
                    return java.util.Arrays.copyOfRange(this.f22008g, i11, i12);
                }
            }
            if (i6 > 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            if (i6 == 0) {
                return androidx.datastore.preferences.protobuf.AbstractC2064y.f22237d;
            }
            throw androidx.datastore.preferences.protobuf.C2065z.g();
        }

        public int H() throws androidx.datastore.preferences.protobuf.C2065z {
            int i6 = this.f22012k;
            if (this.f22010i - i6 < 4) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            byte[] bArr = this.f22008g;
            this.f22012k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long I() throws androidx.datastore.preferences.protobuf.C2065z {
            int i6 = this.f22012k;
            if (this.f22010i - i6 < 8) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            byte[] bArr = this.f22008g;
            this.f22012k = i6 + 8;
            return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
        }

        public int J() {
            int i6;
            int i10 = this.f22012k;
            int i11 = this.f22010i;
            if (i11 != i10) {
                byte[] bArr = this.f22008g;
                int i12 = i10 + 1;
                byte b6 = bArr[i10];
                if (b6 >= 0) {
                    this.f22012k = i12;
                    return b6;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b6;
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i6 = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i6 = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b10 = bArr[i17];
                                int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
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
                    this.f22012k = i13;
                    return i6;
                }
            }
            return (int) L();
        }

        public long K() {
            long j6;
            long j10;
            long j11;
            int i6 = this.f22012k;
            int i10 = this.f22010i;
            if (i10 != i6) {
                byte[] bArr = this.f22008g;
                int i11 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 >= 0) {
                    this.f22012k = i11;
                    return b6;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i6 + 2;
                    int i13 = (bArr[i11] << 7) ^ b6;
                    if (i13 < 0) {
                        j6 = i13 ^ (-128);
                    } else {
                        int i14 = i6 + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j6 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i6 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j6 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i6 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i6 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i6 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i6 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i6 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i6 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j6 = j16;
                                            }
                                        }
                                    }
                                    j6 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j6 = j14 ^ j11;
                            }
                        }
                    }
                    this.f22012k = i12;
                    return j6;
                }
            }
            return L();
        }

        long L() throws androidx.datastore.preferences.protobuf.C2065z {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                byte bF = F();
                j6 |= ((long) (bF & 127)) << i6;
                if ((bF & 128) == 0) {
                    return j6;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        public void N() throws androidx.datastore.preferences.protobuf.C2065z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 >= 0) {
                int i10 = this.f22010i;
                int i11 = this.f22012k;
                if (i6 <= i10 - i11) {
                    this.f22012k = i11 + i6;
                    return;
                }
            }
            if (i6 >= 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            throw androidx.datastore.preferences.protobuf.C2065z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public void a(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (this.f22014m != i6) {
                throw androidx.datastore.preferences.protobuf.C2065z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int d() {
            return this.f22012k - this.f22013l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean e() {
            return this.f22012k == this.f22010i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public void k(int i6) {
            this.f22016o = i6;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int l(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            int iD = i6 + d();
            if (iD < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.h();
            }
            int i10 = this.f22016o;
            if (iD > i10) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            this.f22016o = iD;
            M();
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public androidx.datastore.preferences.protobuf.AbstractC2047g n() {
            int iJ = J();
            if (iJ > 0) {
                int i6 = this.f22010i;
                int i10 = this.f22012k;
                if (iJ <= i6 - i10) {
                    androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047gW = (this.f22009h && this.f22015n) ? androidx.datastore.preferences.protobuf.AbstractC2047g.W(this.f22008g, i10, iJ) : androidx.datastore.preferences.protobuf.AbstractC2047g.o(this.f22008g, i10, iJ);
                    this.f22012k += iJ;
                    return abstractC2047gW;
                }
            }
            return iJ == 0 ? androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D : androidx.datastore.preferences.protobuf.AbstractC2047g.V(G(iJ));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public double o() {
            return java.lang.Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public float s() {
            return java.lang.Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int x() {
            return androidx.datastore.preferences.protobuf.AbstractC2048h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long y() {
            return androidx.datastore.preferences.protobuf.AbstractC2048h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public java.lang.String z() throws androidx.datastore.preferences.protobuf.C2065z {
            int iJ = J();
            if (iJ > 0) {
                int i6 = this.f22010i;
                int i10 = this.f22012k;
                if (iJ <= i6 - i10) {
                    java.lang.String str = new java.lang.String(this.f22008g, i10, iJ, androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
                    this.f22012k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            throw androidx.datastore.preferences.protobuf.C2065z.m();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends androidx.datastore.preferences.protobuf.AbstractC2048h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final java.io.InputStream f22017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f22018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f22019i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f22020j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f22021k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f22022l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f22023m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f22024n;

        private c(java.io.InputStream inputStream, int i6) {
            super();
            this.f22024n = Integer.MAX_VALUE;
            androidx.datastore.preferences.protobuf.AbstractC2064y.b(inputStream, "input");
            this.f22017g = inputStream;
            this.f22018h = new byte[i6];
            this.f22019i = 0;
            this.f22021k = 0;
            this.f22023m = 0;
        }

        private static int F(java.io.InputStream inputStream) throws androidx.datastore.preferences.protobuf.C2065z {
            try {
                return inputStream.available();
            } catch (androidx.datastore.preferences.protobuf.C2065z e6) {
                e6.j();
                throw e6;
            }
        }

        private static int G(java.io.InputStream inputStream, byte[] bArr, int i6, int i10) throws androidx.datastore.preferences.protobuf.C2065z {
            try {
                return inputStream.read(bArr, i6, i10);
            } catch (androidx.datastore.preferences.protobuf.C2065z e6) {
                e6.j();
                throw e6;
            }
        }

        private androidx.datastore.preferences.protobuf.AbstractC2047g H(int i6) throws java.io.IOException {
            byte[] bArrK = K(i6);
            if (bArrK != null) {
                return androidx.datastore.preferences.protobuf.AbstractC2047g.n(bArrK);
            }
            int i10 = this.f22021k;
            int i11 = this.f22019i;
            int length = i11 - i10;
            this.f22023m += i11;
            this.f22021k = 0;
            this.f22019i = 0;
            java.util.List<byte[]> listL = L(i6 - length);
            byte[] bArr = new byte[i6];
            java.lang.System.arraycopy(this.f22018h, i10, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return androidx.datastore.preferences.protobuf.AbstractC2047g.V(bArr);
        }

        private byte[] J(int i6, boolean z6) throws java.io.IOException {
            byte[] bArrK = K(i6);
            if (bArrK != null) {
                return z6 ? (byte[]) bArrK.clone() : bArrK;
            }
            int i10 = this.f22021k;
            int i11 = this.f22019i;
            int length = i11 - i10;
            this.f22023m += i11;
            this.f22021k = 0;
            this.f22019i = 0;
            java.util.List<byte[]> listL = L(i6 - length);
            byte[] bArr = new byte[i6];
            java.lang.System.arraycopy(this.f22018h, i10, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] K(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 == 0) {
                return androidx.datastore.preferences.protobuf.AbstractC2064y.f22237d;
            }
            if (i6 < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            int i10 = this.f22023m;
            int i11 = this.f22021k;
            int i12 = i10 + i11 + i6;
            if (i12 - this.f22005c > 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.l();
            }
            int i13 = this.f22024n;
            if (i12 > i13) {
                V((i13 - i10) - i11);
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            int i14 = this.f22019i - i11;
            int i15 = i6 - i14;
            if (i15 >= 4096 && i15 > F(this.f22017g)) {
                return null;
            }
            byte[] bArr = new byte[i6];
            java.lang.System.arraycopy(this.f22018h, this.f22021k, bArr, 0, i14);
            this.f22023m += this.f22019i;
            this.f22021k = 0;
            this.f22019i = 0;
            while (i14 < i6) {
                int iG = G(this.f22017g, bArr, i14, i6 - i14);
                if (iG == -1) {
                    throw androidx.datastore.preferences.protobuf.C2065z.m();
                }
                this.f22023m += iG;
                i14 += iG;
            }
            return bArr;
        }

        private java.util.List L(int i6) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i6 > 0) {
                int iMin = java.lang.Math.min(i6, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.f22017g.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw androidx.datastore.preferences.protobuf.C2065z.m();
                    }
                    this.f22023m += i11;
                    i10 += i11;
                }
                i6 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i6 = this.f22019i + this.f22020j;
            this.f22019i = i6;
            int i10 = this.f22023m + i6;
            int i11 = this.f22024n;
            if (i10 <= i11) {
                this.f22020j = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f22020j = i12;
            this.f22019i = i6 - i12;
        }

        private void S(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (a0(i6)) {
                return;
            }
            if (i6 <= (this.f22005c - this.f22023m) - this.f22021k) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            throw androidx.datastore.preferences.protobuf.C2065z.l();
        }

        private static long T(java.io.InputStream inputStream, long j6) throws androidx.datastore.preferences.protobuf.C2065z {
            try {
                return inputStream.skip(j6);
            } catch (androidx.datastore.preferences.protobuf.C2065z e6) {
                e6.j();
                throw e6;
            }
        }

        private void W(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            int i10 = this.f22023m;
            int i11 = this.f22021k;
            int i12 = i10 + i11 + i6;
            int i13 = this.f22024n;
            if (i12 > i13) {
                V((i13 - i10) - i11);
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            this.f22023m = i10 + i11;
            int i14 = this.f22019i - i11;
            this.f22019i = 0;
            this.f22021k = 0;
            while (i14 < i6) {
                try {
                    long j6 = i6 - i14;
                    long jT = T(this.f22017g, j6);
                    if (jT < 0 || jT > j6) {
                        throw new java.lang.IllegalStateException(this.f22017g.getClass() + "#skip returned invalid result: " + jT + "\nThe InputStream implementation is buggy.");
                    }
                    if (jT == 0) {
                        break;
                    } else {
                        i14 += (int) jT;
                    }
                } catch (java.lang.Throwable th) {
                    this.f22023m += i14;
                    R();
                    throw th;
                }
            }
            this.f22023m += i14;
            R();
            if (i14 >= i6) {
                return;
            }
            int i15 = this.f22019i;
            int i16 = i15 - this.f22021k;
            this.f22021k = i15;
            while (true) {
                S(1);
                int i17 = i6 - i16;
                int i18 = this.f22019i;
                if (i17 <= i18) {
                    this.f22021k = i17;
                    return;
                } else {
                    i16 += i18;
                    this.f22021k = i18;
                }
            }
        }

        private void X() throws androidx.datastore.preferences.protobuf.C2065z {
            if (this.f22019i - this.f22021k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() throws androidx.datastore.preferences.protobuf.C2065z {
            for (int i6 = 0; i6 < 10; i6++) {
                byte[] bArr = this.f22018h;
                int i10 = this.f22021k;
                this.f22021k = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        private void Z() throws androidx.datastore.preferences.protobuf.C2065z {
            for (int i6 = 0; i6 < 10; i6++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        private boolean a0(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            int i10 = this.f22021k;
            int i11 = i10 + i6;
            int i12 = this.f22019i;
            if (i11 <= i12) {
                throw new java.lang.IllegalStateException("refillBuffer() called when " + i6 + " bytes were already available in buffer");
            }
            int i13 = this.f22005c;
            int i14 = this.f22023m;
            if (i6 > (i13 - i14) - i10 || i14 + i10 + i6 > this.f22024n) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.f22018h;
                    java.lang.System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f22023m += i10;
                this.f22019i -= i10;
                this.f22021k = 0;
            }
            java.io.InputStream inputStream = this.f22017g;
            byte[] bArr2 = this.f22018h;
            int i15 = this.f22019i;
            int iG = G(inputStream, bArr2, i15, java.lang.Math.min(bArr2.length - i15, (this.f22005c - this.f22023m) - i15));
            if (iG == 0 || iG < -1 || iG > this.f22018h.length) {
                throw new java.lang.IllegalStateException(this.f22017g.getClass() + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
            }
            if (iG <= 0) {
                return false;
            }
            this.f22019i += iG;
            R();
            if (this.f22019i >= i6) {
                return true;
            }
            return a0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public java.lang.String A() throws java.io.IOException {
            byte[] bArrJ;
            int iO = O();
            int i6 = this.f22021k;
            int i10 = this.f22019i;
            if (iO <= i10 - i6 && iO > 0) {
                bArrJ = this.f22018h;
                this.f22021k = i6 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                i6 = 0;
                if (iO <= i10) {
                    S(iO);
                    bArrJ = this.f22018h;
                    this.f22021k = iO;
                } else {
                    bArrJ = J(iO, false);
                }
            }
            return androidx.datastore.preferences.protobuf.q0.e(bArrJ, i6, iO);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int B() throws androidx.datastore.preferences.protobuf.C2065z {
            if (e()) {
                this.f22022l = 0;
                return 0;
            }
            int iO = O();
            this.f22022l = iO;
            if (androidx.datastore.preferences.protobuf.r0.a(iO) != 0) {
                return this.f22022l;
            }
            throw androidx.datastore.preferences.protobuf.C2065z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int C() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long D() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean E(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            int iB = androidx.datastore.preferences.protobuf.r0.b(i6);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(O());
                return true;
            }
            if (iB == 3) {
                U();
                a(androidx.datastore.preferences.protobuf.r0.c(androidx.datastore.preferences.protobuf.r0.a(i6), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw androidx.datastore.preferences.protobuf.C2065z.e();
            }
            V(4);
            return true;
        }

        public byte I() throws androidx.datastore.preferences.protobuf.C2065z {
            if (this.f22021k == this.f22019i) {
                S(1);
            }
            byte[] bArr = this.f22018h;
            int i6 = this.f22021k;
            this.f22021k = i6 + 1;
            return bArr[i6];
        }

        public int M() throws androidx.datastore.preferences.protobuf.C2065z {
            int i6 = this.f22021k;
            if (this.f22019i - i6 < 4) {
                S(4);
                i6 = this.f22021k;
            }
            byte[] bArr = this.f22018h;
            this.f22021k = i6 + 4;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }

        public long N() throws androidx.datastore.preferences.protobuf.C2065z {
            int i6 = this.f22021k;
            if (this.f22019i - i6 < 8) {
                S(8);
                i6 = this.f22021k;
            }
            byte[] bArr = this.f22018h;
            this.f22021k = i6 + 8;
            return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
        }

        public int O() {
            int i6;
            int i10 = this.f22021k;
            int i11 = this.f22019i;
            if (i11 != i10) {
                byte[] bArr = this.f22018h;
                int i12 = i10 + 1;
                byte b6 = bArr[i10];
                if (b6 >= 0) {
                    this.f22021k = i12;
                    return b6;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b6;
                    if (i14 < 0) {
                        i6 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i6 = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i6 = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b10 = bArr[i17];
                                int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
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
                    this.f22021k = i13;
                    return i6;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j6;
            long j10;
            long j11;
            int i6 = this.f22021k;
            int i10 = this.f22019i;
            if (i10 != i6) {
                byte[] bArr = this.f22018h;
                int i11 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 >= 0) {
                    this.f22021k = i11;
                    return b6;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i6 + 2;
                    int i13 = (bArr[i11] << 7) ^ b6;
                    if (i13 < 0) {
                        j6 = i13 ^ (-128);
                    } else {
                        int i14 = i6 + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j6 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i6 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j6 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i6 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i6 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i6 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i6 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i6 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i6 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j6 = j16;
                                            }
                                        }
                                    }
                                    j6 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j6 = j14 ^ j11;
                            }
                        }
                    }
                    this.f22021k = i12;
                    return j6;
                }
            }
            return Q();
        }

        long Q() throws androidx.datastore.preferences.protobuf.C2065z {
            long j6 = 0;
            for (int i6 = 0; i6 < 64; i6 += 7) {
                byte bI = I();
                j6 |= ((long) (bI & 127)) << i6;
                if ((bI & 128) == 0) {
                    return j6;
                }
            }
            throw androidx.datastore.preferences.protobuf.C2065z.f();
        }

        public void U() throws androidx.datastore.preferences.protobuf.C2065z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void V(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            int i10 = this.f22019i;
            int i11 = this.f22021k;
            if (i6 > i10 - i11 || i6 < 0) {
                W(i6);
            } else {
                this.f22021k = i11 + i6;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public void a(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (this.f22022l != i6) {
                throw androidx.datastore.preferences.protobuf.C2065z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int d() {
            return this.f22023m + this.f22021k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean e() {
            return this.f22021k == this.f22019i && !a0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public void k(int i6) {
            this.f22024n = i6;
            R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int l(int i6) throws androidx.datastore.preferences.protobuf.C2065z {
            if (i6 < 0) {
                throw androidx.datastore.preferences.protobuf.C2065z.g();
            }
            int i10 = i6 + this.f22023m + this.f22021k;
            int i11 = this.f22024n;
            if (i10 > i11) {
                throw androidx.datastore.preferences.protobuf.C2065z.m();
            }
            this.f22024n = i10;
            R();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public boolean m() {
            return P() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public androidx.datastore.preferences.protobuf.AbstractC2047g n() {
            int iO = O();
            int i6 = this.f22019i;
            int i10 = this.f22021k;
            if (iO > i6 - i10 || iO <= 0) {
                return iO == 0 ? androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D : H(iO);
            }
            androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047gO = androidx.datastore.preferences.protobuf.AbstractC2047g.o(this.f22018h, i10, iO);
            this.f22021k += iO;
            return abstractC2047gO;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public double o() {
            return java.lang.Double.longBitsToDouble(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int p() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int q() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long r() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public float s() {
            return java.lang.Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int t() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long u() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long w() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public int x() {
            return androidx.datastore.preferences.protobuf.AbstractC2048h.b(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public long y() {
            return androidx.datastore.preferences.protobuf.AbstractC2048h.c(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2048h
        public java.lang.String z() throws androidx.datastore.preferences.protobuf.C2065z {
            int iO = O();
            if (iO > 0) {
                int i6 = this.f22019i;
                int i10 = this.f22021k;
                if (iO <= i6 - i10) {
                    java.lang.String str = new java.lang.String(this.f22018h, i10, iO, androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
                    this.f22021k += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO > this.f22019i) {
                return new java.lang.String(J(iO, false), androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
            }
            S(iO);
            java.lang.String str2 = new java.lang.String(this.f22018h, this.f22021k, iO, androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
            this.f22021k += iO;
            return str2;
        }
    }

    private AbstractC2048h() {
        this.f22004b = f22002f;
        this.f22005c = Integer.MAX_VALUE;
        this.f22007e = false;
    }

    public static int b(int i6) {
        return (-(i6 & 1)) ^ (i6 >>> 1);
    }

    public static long c(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2048h f(java.io.InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2048h g(java.io.InputStream inputStream, int i6) {
        if (i6 > 0) {
            return inputStream == null ? h(androidx.datastore.preferences.protobuf.AbstractC2064y.f22237d) : new androidx.datastore.preferences.protobuf.AbstractC2048h.c(inputStream, i6);
        }
        throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2048h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2048h i(byte[] bArr, int i6, int i10) {
        return j(bArr, i6, i10, false);
    }

    static androidx.datastore.preferences.protobuf.AbstractC2048h j(byte[] bArr, int i6, int i10, boolean z6) {
        androidx.datastore.preferences.protobuf.AbstractC2048h.b bVar = new androidx.datastore.preferences.protobuf.AbstractC2048h.b(bArr, i6, i10, z6);
        try {
            bVar.l(i10);
            return bVar;
        } catch (androidx.datastore.preferences.protobuf.C2065z e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public abstract java.lang.String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i6);

    public abstract void a(int i6);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i6);

    public abstract int l(int i6);

    public abstract boolean m();

    public abstract androidx.datastore.preferences.protobuf.AbstractC2047g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract java.lang.String z();
}
