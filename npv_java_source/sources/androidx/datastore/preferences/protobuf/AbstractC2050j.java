package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2050j extends androidx.datastore.preferences.protobuf.AbstractC2046f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.logging.Logger f22051c = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.AbstractC2050j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f22052d = androidx.datastore.preferences.protobuf.p0.E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.datastore.preferences.protobuf.C2051k f22053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22054b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static abstract class b extends androidx.datastore.preferences.protobuf.AbstractC2050j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f22055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f22056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22057g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22058h;

        b(int i6) {
            super();
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[java.lang.Math.max(i6, 20)];
            this.f22055e = bArr;
            this.f22056f = bArr.length;
        }

        final void R0(byte b6) {
            byte[] bArr = this.f22055e;
            int i6 = this.f22057g;
            this.f22057g = i6 + 1;
            bArr[i6] = b6;
            this.f22058h++;
        }

        final void S0(int i6) {
            byte[] bArr = this.f22055e;
            int i10 = this.f22057g;
            int i11 = i10 + 1;
            this.f22057g = i11;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i10 + 2;
            this.f22057g = i12;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i10 + 3;
            this.f22057g = i13;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.f22057g = i10 + 4;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
            this.f22058h += 4;
        }

        final void T0(long j6) {
            byte[] bArr = this.f22055e;
            int i6 = this.f22057g;
            int i10 = i6 + 1;
            this.f22057g = i10;
            bArr[i6] = (byte) (j6 & 255);
            int i11 = i6 + 2;
            this.f22057g = i11;
            bArr[i10] = (byte) ((j6 >> 8) & 255);
            int i12 = i6 + 3;
            this.f22057g = i12;
            bArr[i11] = (byte) ((j6 >> 16) & 255);
            int i13 = i6 + 4;
            this.f22057g = i13;
            bArr[i12] = (byte) (255 & (j6 >> 24));
            int i14 = i6 + 5;
            this.f22057g = i14;
            bArr[i13] = (byte) (((int) (j6 >> 32)) & 255);
            int i15 = i6 + 6;
            this.f22057g = i15;
            bArr[i14] = (byte) (((int) (j6 >> 40)) & 255);
            int i16 = i6 + 7;
            this.f22057g = i16;
            bArr[i15] = (byte) (((int) (j6 >> 48)) & 255);
            this.f22057g = i6 + 8;
            bArr[i16] = (byte) (((int) (j6 >> 56)) & 255);
            this.f22058h += 8;
        }

        final void U0(int i6) {
            if (i6 >= 0) {
                W0(i6);
            } else {
                X0(i6);
            }
        }

        final void V0(int i6, int i10) {
            W0(androidx.datastore.preferences.protobuf.r0.c(i6, i10));
        }

        final void W0(int i6) {
            if (!androidx.datastore.preferences.protobuf.AbstractC2050j.f22052d) {
                while ((i6 & (-128)) != 0) {
                    byte[] bArr = this.f22055e;
                    int i10 = this.f22057g;
                    this.f22057g = i10 + 1;
                    bArr[i10] = (byte) ((i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f22058h++;
                    i6 >>>= 7;
                }
                byte[] bArr2 = this.f22055e;
                int i11 = this.f22057g;
                this.f22057g = i11 + 1;
                bArr2[i11] = (byte) i6;
                this.f22058h++;
                return;
            }
            long j6 = this.f22057g;
            while ((i6 & (-128)) != 0) {
                byte[] bArr3 = this.f22055e;
                int i12 = this.f22057g;
                this.f22057g = i12 + 1;
                androidx.datastore.preferences.protobuf.p0.K(bArr3, i12, (byte) ((i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128));
                i6 >>>= 7;
            }
            byte[] bArr4 = this.f22055e;
            int i13 = this.f22057g;
            this.f22057g = i13 + 1;
            androidx.datastore.preferences.protobuf.p0.K(bArr4, i13, (byte) i6);
            this.f22058h += (int) (((long) this.f22057g) - j6);
        }

        final void X0(long j6) {
            if (!androidx.datastore.preferences.protobuf.AbstractC2050j.f22052d) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.f22055e;
                    int i6 = this.f22057g;
                    this.f22057g = i6 + 1;
                    bArr[i6] = (byte) ((((int) j6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f22058h++;
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.f22055e;
                int i10 = this.f22057g;
                this.f22057g = i10 + 1;
                bArr2[i10] = (byte) j6;
                this.f22058h++;
                return;
            }
            long j10 = this.f22057g;
            while ((j6 & (-128)) != 0) {
                byte[] bArr3 = this.f22055e;
                int i11 = this.f22057g;
                this.f22057g = i11 + 1;
                androidx.datastore.preferences.protobuf.p0.K(bArr3, i11, (byte) ((((int) j6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128));
                j6 >>>= 7;
            }
            byte[] bArr4 = this.f22055e;
            int i12 = this.f22057g;
            this.f22057g = i12 + 1;
            androidx.datastore.preferences.protobuf.p0.K(bArr4, i12, (byte) j6);
            this.f22058h += (int) (((long) this.f22057g) - j10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends java.io.IOException {
        c(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$d */
    private static final class d extends androidx.datastore.preferences.protobuf.AbstractC2050j.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final java.io.OutputStream f22059i;

        d(java.io.OutputStream outputStream, int i6) {
            super(i6);
            if (outputStream == null) {
                throw new java.lang.NullPointerException("out");
            }
            this.f22059i = outputStream;
        }

        private void Y0() throws java.io.IOException {
            this.f22059i.write(this.f22055e, 0, this.f22057g);
            this.f22057g = 0;
        }

        private void Z0(int i6) throws java.io.IOException {
            if (this.f22056f - this.f22057g < i6) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void A0(int i6, androidx.datastore.preferences.protobuf.O o6) throws java.io.IOException {
            M0(1, 3);
            N0(2, i6);
            b1(3, o6);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void B0(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) throws java.io.IOException {
            M0(1, 3);
            N0(2, i6);
            e0(3, abstractC2047g);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void K0(int i6, java.lang.String str) throws java.io.IOException {
            M0(i6, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void L0(java.lang.String str) throws java.io.IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iQ = androidx.datastore.preferences.protobuf.AbstractC2050j.Q(length);
                int i6 = iQ + length;
                int i10 = this.f22056f;
                if (i6 > i10) {
                    byte[] bArr = new byte[length];
                    int iF = androidx.datastore.preferences.protobuf.q0.f(str, bArr, 0, length);
                    O0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i6 > i10 - this.f22057g) {
                    Y0();
                }
                int iQ2 = androidx.datastore.preferences.protobuf.AbstractC2050j.Q(str.length());
                int i11 = this.f22057g;
                try {
                    if (iQ2 == iQ) {
                        int i12 = i11 + iQ2;
                        this.f22057g = i12;
                        int iF2 = androidx.datastore.preferences.protobuf.q0.f(str, this.f22055e, i12, this.f22056f - i12);
                        this.f22057g = i11;
                        iG = (iF2 - i11) - iQ2;
                        W0(iG);
                        this.f22057g = iF2;
                    } else {
                        iG = androidx.datastore.preferences.protobuf.q0.g(str);
                        W0(iG);
                        this.f22057g = androidx.datastore.preferences.protobuf.q0.f(str, this.f22055e, this.f22057g, iG);
                    }
                    this.f22058h += iG;
                } catch (androidx.datastore.preferences.protobuf.q0.d e6) {
                    this.f22058h -= this.f22057g - i11;
                    this.f22057g = i11;
                    throw e6;
                } catch (java.lang.ArrayIndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.AbstractC2050j.c(e10);
                }
            } catch (androidx.datastore.preferences.protobuf.q0.d e11) {
                W(str, e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void M0(int i6, int i10) throws java.io.IOException {
            O0(androidx.datastore.preferences.protobuf.r0.c(i6, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void N0(int i6, int i10) throws java.io.IOException {
            Z0(20);
            V0(i6, 0);
            W0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void O0(int i6) throws java.io.IOException {
            Z0(5);
            W0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void P0(int i6, long j6) throws java.io.IOException {
            Z0(20);
            V0(i6, 0);
            X0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void Q0(long j6) throws java.io.IOException {
            Z0(10);
            X0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void V() throws java.io.IOException {
            if (this.f22057g > 0) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void Z(byte b6) throws java.io.IOException {
            if (this.f22057g == this.f22056f) {
                Y0();
            }
            R0(b6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j, androidx.datastore.preferences.protobuf.AbstractC2046f
        public void a(byte[] bArr, int i6, int i10) throws java.io.IOException {
            a1(bArr, i6, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void a0(int i6, boolean z6) throws java.io.IOException {
            Z0(11);
            V0(i6, 0);
            R0(z6 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i6, int i10) throws java.io.IOException {
            int i11 = this.f22056f;
            int i12 = this.f22057g;
            if (i11 - i12 >= i10) {
                java.lang.System.arraycopy(bArr, i6, this.f22055e, i12, i10);
                this.f22057g += i10;
            } else {
                int i13 = i11 - i12;
                java.lang.System.arraycopy(bArr, i6, this.f22055e, i12, i13);
                int i14 = i6 + i13;
                i10 -= i13;
                this.f22057g = this.f22056f;
                this.f22058h += i13;
                Y0();
                if (i10 <= this.f22056f) {
                    java.lang.System.arraycopy(bArr, i14, this.f22055e, 0, i10);
                    this.f22057g = i10;
                } else {
                    this.f22059i.write(bArr, i14, i10);
                }
            }
            this.f22058h += i10;
        }

        public void b1(int i6, androidx.datastore.preferences.protobuf.O o6) throws java.io.IOException {
            M0(i6, 2);
            z0(o6);
        }

        void c1(androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) throws java.io.IOException {
            O0(((androidx.datastore.preferences.protobuf.AbstractC2041a) o6).f(e0Var));
            e0Var.e(o6, this.f22053a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void d0(byte[] bArr, int i6, int i10) throws java.io.IOException {
            O0(i10);
            a1(bArr, i6, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void e0(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) throws java.io.IOException {
            M0(i6, 2);
            f0(abstractC2047g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void f0(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) throws java.io.IOException {
            O0(abstractC2047g.size());
            abstractC2047g.X(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void k0(int i6, int i10) throws java.io.IOException {
            Z0(14);
            V0(i6, 5);
            S0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void l0(int i6) throws java.io.IOException {
            Z0(4);
            S0(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void m0(int i6, long j6) throws java.io.IOException {
            Z0(18);
            V0(i6, 1);
            T0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void n0(long j6) throws java.io.IOException {
            Z0(8);
            T0(j6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void u0(int i6, int i10) throws java.io.IOException {
            Z0(20);
            V0(i6, 0);
            U0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void v0(int i6) throws java.io.IOException {
            if (i6 >= 0) {
                O0(i6);
            } else {
                Q0(i6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        void y0(int i6, androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) throws java.io.IOException {
            M0(i6, 2);
            c1(o6, e0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2050j
        public void z0(androidx.datastore.preferences.protobuf.O o6) throws java.io.IOException {
            O0(o6.b());
            o6.d(this);
        }
    }

    private AbstractC2050j() {
    }

    public static int A(androidx.datastore.preferences.protobuf.O o6) {
        return y(o6.b());
    }

    static int B(androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return y(((androidx.datastore.preferences.protobuf.AbstractC2041a) o6).f(e0Var));
    }

    static int C(int i6) {
        if (i6 > 4096) {
            return 4096;
        }
        return i6;
    }

    public static int D(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        return (O(1) * 2) + P(2, i6) + f(3, abstractC2047g);
    }

    public static int E(int i6, int i10) {
        return O(i6) + F(i10);
    }

    public static int F(int i6) {
        return 4;
    }

    public static int G(int i6, long j6) {
        return O(i6) + H(j6);
    }

    public static int H(long j6) {
        return 8;
    }

    public static int I(int i6, int i10) {
        return O(i6) + J(i10);
    }

    public static int J(int i6) {
        return Q(T(i6));
    }

    public static int K(int i6, long j6) {
        return O(i6) + L(j6);
    }

    public static int L(long j6) {
        return S(U(j6));
    }

    public static int M(int i6, java.lang.String str) {
        return O(i6) + N(str);
    }

    public static int N(java.lang.String str) {
        int length;
        try {
            length = androidx.datastore.preferences.protobuf.q0.g(str);
        } catch (androidx.datastore.preferences.protobuf.q0.d unused) {
            length = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b).length;
        }
        return y(length);
    }

    public static int O(int i6) {
        return Q(androidx.datastore.preferences.protobuf.r0.c(i6, 0));
    }

    public static int P(int i6, int i10) {
        return O(i6) + Q(i10);
    }

    public static int Q(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        return (i6 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int R(int i6, long j6) {
        return O(i6) + S(j6);
    }

    public static int S(long j6) {
        int i6;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i6 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i6 + 1 : i6;
    }

    public static int T(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long U(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2050j Y(java.io.OutputStream outputStream, int i6) {
        return new androidx.datastore.preferences.protobuf.AbstractC2050j.d(outputStream, i6);
    }

    public static int c(int i6, boolean z6) {
        return O(i6) + d(z6);
    }

    public static int d(boolean z6) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        return O(i6) + g(abstractC2047g);
    }

    public static int g(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        return y(abstractC2047g.size());
    }

    public static int h(int i6, double d6) {
        return O(i6) + i(d6);
    }

    public static int i(double d6) {
        return 8;
    }

    public static int j(int i6, int i10) {
        return O(i6) + k(i10);
    }

    public static int k(int i6) {
        return v(i6);
    }

    public static int l(int i6, int i10) {
        return O(i6) + m(i10);
    }

    public static int m(int i6) {
        return 4;
    }

    public static int n(int i6, long j6) {
        return O(i6) + o(j6);
    }

    public static int o(long j6) {
        return 8;
    }

    public static int p(int i6, float f6) {
        return O(i6) + q(f6);
    }

    public static int q(float f6) {
        return 4;
    }

    static int r(int i6, androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return (O(i6) * 2) + t(o6, e0Var);
    }

    public static int s(androidx.datastore.preferences.protobuf.O o6) {
        return o6.b();
    }

    static int t(androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return ((androidx.datastore.preferences.protobuf.AbstractC2041a) o6).f(e0Var);
    }

    public static int u(int i6, int i10) {
        return O(i6) + v(i10);
    }

    public static int v(int i6) {
        if (i6 >= 0) {
            return Q(i6);
        }
        return 10;
    }

    public static int w(int i6, long j6) {
        return O(i6) + x(j6);
    }

    public static int x(long j6) {
        return S(j6);
    }

    static int y(int i6) {
        return Q(i6) + i6;
    }

    static int z(int i6, androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return O(i6) + B(o6, e0Var);
    }

    public abstract void A0(int i6, androidx.datastore.preferences.protobuf.O o6);

    public abstract void B0(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g);

    public final void C0(int i6, int i10) {
        k0(i6, i10);
    }

    public final void D0(int i6) {
        l0(i6);
    }

    public final void E0(int i6, long j6) {
        m0(i6, j6);
    }

    public final void F0(long j6) {
        n0(j6);
    }

    public final void G0(int i6, int i10) {
        N0(i6, T(i10));
    }

    public final void H0(int i6) {
        O0(T(i6));
    }

    public final void I0(int i6, long j6) {
        P0(i6, U(j6));
    }

    public final void J0(long j6) {
        Q0(U(j6));
    }

    public abstract void K0(int i6, java.lang.String str);

    public abstract void L0(java.lang.String str);

    public abstract void M0(int i6, int i10);

    public abstract void N0(int i6, int i10);

    public abstract void O0(int i6);

    public abstract void P0(int i6, long j6);

    public abstract void Q0(long j6);

    public abstract void V();

    final void W(java.lang.String str, androidx.datastore.preferences.protobuf.q0.d dVar) throws androidx.datastore.preferences.protobuf.AbstractC2050j.c {
        f22051c.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) dVar);
        byte[] bytes = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new androidx.datastore.preferences.protobuf.AbstractC2050j.c(e6);
        }
    }

    boolean X() {
        return this.f22054b;
    }

    public abstract void Z(byte b6);

    @Override // androidx.datastore.preferences.protobuf.AbstractC2046f
    public abstract void a(byte[] bArr, int i6, int i10);

    public abstract void a0(int i6, boolean z6);

    public final void b0(boolean z6) {
        Z(z6 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    abstract void d0(byte[] bArr, int i6, int i10);

    public abstract void e0(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g);

    public abstract void f0(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g);

    public final void g0(int i6, double d6) {
        m0(i6, java.lang.Double.doubleToRawLongBits(d6));
    }

    public final void h0(double d6) {
        n0(java.lang.Double.doubleToRawLongBits(d6));
    }

    public final void i0(int i6, int i10) {
        u0(i6, i10);
    }

    public final void j0(int i6) {
        v0(i6);
    }

    public abstract void k0(int i6, int i10);

    public abstract void l0(int i6);

    public abstract void m0(int i6, long j6);

    public abstract void n0(long j6);

    public final void o0(int i6, float f6) {
        k0(i6, java.lang.Float.floatToRawIntBits(f6));
    }

    public final void p0(float f6) {
        l0(java.lang.Float.floatToRawIntBits(f6));
    }

    public final void q0(int i6, androidx.datastore.preferences.protobuf.O o6) {
        M0(i6, 3);
        s0(o6);
        M0(i6, 4);
    }

    final void r0(int i6, androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        M0(i6, 3);
        t0(o6, e0Var);
        M0(i6, 4);
    }

    public final void s0(androidx.datastore.preferences.protobuf.O o6) {
        o6.d(this);
    }

    final void t0(androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var) {
        e0Var.e(o6, this.f22053a);
    }

    public abstract void u0(int i6, int i10);

    public abstract void v0(int i6);

    public final void w0(int i6, long j6) {
        P0(i6, j6);
    }

    public final void x0(long j6) {
        Q0(j6);
    }

    abstract void y0(int i6, androidx.datastore.preferences.protobuf.O o6, androidx.datastore.preferences.protobuf.e0 e0Var);

    public abstract void z0(androidx.datastore.preferences.protobuf.O o6);
}
