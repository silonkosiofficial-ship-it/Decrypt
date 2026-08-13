package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5982c4 extends com.google.android.gms.internal.measurement.M3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.logging.Logger f40814b = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.AbstractC5982c4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f40815c = com.google.android.gms.internal.measurement.G5.w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.measurement.C6009f4 f40816a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4$a */
    private static class a extends com.google.android.gms.internal.measurement.AbstractC5982c4 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f40817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f40818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f40819f;

        a(byte[] bArr, int i6, int i10) {
            super();
            if (bArr == null) {
                throw new java.lang.NullPointerException("buffer");
            }
            if (((bArr.length - i10) | i10) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(i10)));
            }
            this.f40817d = bArr;
            this.f40819f = 0;
            this.f40818e = i10;
        }

        private final void A0(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            try {
                java.lang.System.arraycopy(bArr, i6, this.f40817d, this.f40819f, i10);
                this.f40819f += i10;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f40819f), java.lang.Integer.valueOf(this.f40818e), java.lang.Integer.valueOf(i10)), e6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void H(int i6) {
            if (i6 >= 0) {
                U(i6);
            } else {
                N(i6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void K(int i6, int i10) {
            V(i6, 0);
            H(i10);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void L(int i6, long j6) {
            V(i6, 0);
            N(j6);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void M(int i6, com.google.android.gms.internal.measurement.L3 l6) {
            V(1, 3);
            b0(2, i6);
            n(3, l6);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void N(long j6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            if (com.google.android.gms.internal.measurement.AbstractC5982c4.f40815c && b() >= 10) {
                while ((j6 & (-128)) != 0) {
                    byte[] bArr = this.f40817d;
                    int i6 = this.f40819f;
                    this.f40819f = i6 + 1;
                    com.google.android.gms.internal.measurement.G5.m(bArr, i6, (byte) (((int) j6) | 128));
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.f40817d;
                int i10 = this.f40819f;
                this.f40819f = 1 + i10;
                com.google.android.gms.internal.measurement.G5.m(bArr2, i10, (byte) j6);
                return;
            }
            while ((j6 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f40817d;
                    int i11 = this.f40819f;
                    this.f40819f = i11 + 1;
                    bArr3[i11] = (byte) (((int) j6) | 128);
                    j6 >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f40819f), java.lang.Integer.valueOf(this.f40818e), 1), e6);
                }
            }
            byte[] bArr4 = this.f40817d;
            int i12 = this.f40819f;
            this.f40819f = i12 + 1;
            bArr4[i12] = (byte) j6;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void U(int i6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            while ((i6 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f40817d;
                    int i10 = this.f40819f;
                    this.f40819f = i10 + 1;
                    bArr[i10] = (byte) (i6 | 128);
                    i6 >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f40819f), java.lang.Integer.valueOf(this.f40818e), 1), e6);
                }
            }
            byte[] bArr2 = this.f40817d;
            int i11 = this.f40819f;
            this.f40819f = i11 + 1;
            bArr2[i11] = (byte) i6;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void V(int i6, int i10) {
            U((i6 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.measurement.M3
        public final void a(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            A0(bArr, i6, i10);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final int b() {
            return this.f40818e - this.f40819f;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void b0(int i6, int i10) {
            V(i6, 0);
            U(i10);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void j(byte b6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            int i6 = this.f40819f;
            try {
                int i10 = i6 + 1;
                try {
                    this.f40817d[i6] = b6;
                    this.f40819f = i10;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    e = e6;
                    i6 = i10;
                    throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(this.f40818e), 1), e);
                }
            } catch (java.lang.IndexOutOfBoundsException e10) {
                e = e10;
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void k(int i6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            try {
                byte[] bArr = this.f40817d;
                int i10 = this.f40819f;
                int i11 = i10 + 1;
                this.f40819f = i11;
                bArr[i10] = (byte) i6;
                int i12 = i10 + 2;
                this.f40819f = i12;
                bArr[i11] = (byte) (i6 >> 8);
                int i13 = i10 + 3;
                this.f40819f = i13;
                bArr[i12] = (byte) (i6 >> 16);
                this.f40819f = i10 + 4;
                bArr[i13] = (byte) (i6 >>> 24);
            } catch (java.lang.IndexOutOfBoundsException e6) {
                throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f40819f), java.lang.Integer.valueOf(this.f40818e), 1), e6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void l(int i6, int i10) {
            V(i6, 5);
            k(i10);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void m(int i6, long j6) {
            V(i6, 1);
            s(j6);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void n(int i6, com.google.android.gms.internal.measurement.L3 l6) {
            V(i6, 2);
            t(l6);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void o(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
            V(1, 3);
            b0(2, i6);
            V(3, 2);
            u(interfaceC5965a5);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        final void p(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
            V(i6, 2);
            U(((com.google.android.gms.internal.measurement.D3) interfaceC5965a5).e(interfaceC6100p5));
            interfaceC6100p5.g(interfaceC5965a5, this.f40816a);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void q(int i6, java.lang.String str) {
            V(i6, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void r(int i6, boolean z6) {
            V(i6, 0);
            j(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void s(long j6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            try {
                byte[] bArr = this.f40817d;
                int i6 = this.f40819f;
                int i10 = i6 + 1;
                this.f40819f = i10;
                bArr[i6] = (byte) j6;
                int i11 = i6 + 2;
                this.f40819f = i11;
                bArr[i10] = (byte) (j6 >> 8);
                int i12 = i6 + 3;
                this.f40819f = i12;
                bArr[i11] = (byte) (j6 >> 16);
                int i13 = i6 + 4;
                this.f40819f = i13;
                bArr[i12] = (byte) (j6 >> 24);
                int i14 = i6 + 5;
                this.f40819f = i14;
                bArr[i13] = (byte) (j6 >> 32);
                int i15 = i6 + 6;
                this.f40819f = i15;
                bArr[i14] = (byte) (j6 >> 40);
                int i16 = i6 + 7;
                this.f40819f = i16;
                bArr[i15] = (byte) (j6 >> 48);
                this.f40819f = i6 + 8;
                bArr[i16] = (byte) (j6 >> 56);
            } catch (java.lang.IndexOutOfBoundsException e6) {
                throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.f40819f), java.lang.Integer.valueOf(this.f40818e), 1), e6);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void t(com.google.android.gms.internal.measurement.L3 l6) {
            U(l6.E());
            l6.C(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void u(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
            U(interfaceC5965a5.d());
            interfaceC5965a5.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC5982c4
        public final void v(java.lang.String str) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
            int i6 = this.f40819f;
            try {
                int iV0 = com.google.android.gms.internal.measurement.AbstractC5982c4.v0(str.length() * 3);
                int iV1 = com.google.android.gms.internal.measurement.AbstractC5982c4.v0(str.length());
                if (iV1 != iV0) {
                    U(com.google.android.gms.internal.measurement.K5.a(str));
                    this.f40819f = com.google.android.gms.internal.measurement.K5.b(str, this.f40817d, this.f40819f, b());
                    return;
                }
                int i10 = i6 + iV1;
                this.f40819f = i10;
                int iB = com.google.android.gms.internal.measurement.K5.b(str, this.f40817d, i10, b());
                this.f40819f = i6;
                U((iB - i6) - iV1);
                this.f40819f = iB;
            } catch (com.google.android.gms.internal.measurement.O5 e6) {
                this.f40819f = i6;
                w(str, e6);
            } catch (java.lang.IndexOutOfBoundsException e10) {
                throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(e10);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4$b */
    public static class b extends java.io.IOException {
        b(java.lang.String str, java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        b(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private AbstractC5982c4() {
    }

    public static int A(com.google.android.gms.internal.measurement.L3 l6) {
        int iE = l6.E();
        return v0(iE) + iE;
    }

    public static int B(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
        return interfaceC5965a5.d();
    }

    public static int C(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.measurement.K5.a(str);
        } catch (com.google.android.gms.internal.measurement.O5 unused) {
            length = str.getBytes(com.google.android.gms.internal.measurement.AbstractC6146v4.f41255a).length;
        }
        return v0(length) + length;
    }

    public static com.google.android.gms.internal.measurement.AbstractC5982c4 D(byte[] bArr) {
        return new com.google.android.gms.internal.measurement.AbstractC5982c4.a(bArr, 0, bArr.length);
    }

    public static int P(int i6, long j6) {
        return v0(i6 << 3) + 8;
    }

    public static int Q(int i6, com.google.android.gms.internal.measurement.L3 l6) {
        int iV0 = v0(i6 << 3);
        int iE = l6.E();
        return iV0 + v0(iE) + iE;
    }

    static int R(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        return v0(i6 << 3) + g(interfaceC5965a5, interfaceC6100p5);
    }

    public static int S(long j6) {
        return 8;
    }

    public static int T(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
        int iD = interfaceC5965a5.d();
        return v0(iD) + iD;
    }

    public static int X(int i6) {
        return n0(i6);
    }

    public static int Y(int i6, long j6) {
        return v0(i6 << 3) + n0(j6);
    }

    public static int Z(int i6, com.google.android.gms.internal.measurement.L3 l6) {
        return (v0(8) << 1) + w0(2, i6) + Q(3, l6);
    }

    public static int a0(long j6) {
        return n0(j6);
    }

    public static int c(double d6) {
        return 8;
    }

    public static int c0(int i6) {
        return 4;
    }

    public static int d(float f6) {
        return 4;
    }

    public static int d0(int i6, int i10) {
        return v0(i6 << 3) + n0(i10);
    }

    public static int e(int i6, double d6) {
        return v0(i6 << 3) + 8;
    }

    public static int e0(int i6, long j6) {
        return v0(i6 << 3) + 8;
    }

    public static int f(int i6, float f6) {
        return v0(i6 << 3) + 4;
    }

    public static int f0(long j6) {
        return 8;
    }

    static int g(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        int iE = ((com.google.android.gms.internal.measurement.D3) interfaceC5965a5).e(interfaceC6100p5);
        return v0(iE) + iE;
    }

    public static int g0(int i6) {
        return n0(i6);
    }

    public static int h(boolean z6) {
        return 1;
    }

    public static int h0(int i6, int i10) {
        return v0(i6 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i6, long j6) {
        return v0(i6 << 3) + n0(u0(j6));
    }

    public static int j0(long j6) {
        return n0(u0(j6));
    }

    public static int k0(int i6) {
        return 4;
    }

    public static int l0(int i6, int i10) {
        return v0(i6 << 3) + n0(i10);
    }

    public static int m0(int i6, long j6) {
        return v0(i6 << 3) + n0(j6);
    }

    public static int n0(long j6) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public static int o0(int i6) {
        return v0(z0(i6));
    }

    public static int p0(int i6, int i10) {
        return v0(i6 << 3) + 4;
    }

    public static int s0(int i6) {
        return v0(i6 << 3);
    }

    public static int t0(int i6, int i10) {
        return v0(i6 << 3) + v0(z0(i10));
    }

    private static long u0(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static int v0(int i6) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int w0(int i6, int i10) {
        return v0(i6 << 3) + v0(i10);
    }

    static int x(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        return (v0(i6 << 3) << 1) + ((com.google.android.gms.internal.measurement.D3) interfaceC5965a5).e(interfaceC6100p5);
    }

    public static int y(int i6, java.lang.String str) {
        return v0(i6 << 3) + C(str);
    }

    public static int z(int i6, boolean z6) {
        return v0(i6 << 3) + 1;
    }

    private static int z0(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d6) {
        s(java.lang.Double.doubleToRawLongBits(d6));
    }

    public final void G(float f6) {
        k(java.lang.Float.floatToRawIntBits(f6));
    }

    public abstract void H(int i6);

    public final void I(int i6, double d6) {
        m(i6, java.lang.Double.doubleToRawLongBits(d6));
    }

    public final void J(int i6, float f6) {
        l(i6, java.lang.Float.floatToRawIntBits(f6));
    }

    public abstract void K(int i6, int i10);

    public abstract void L(int i6, long j6);

    public abstract void M(int i6, com.google.android.gms.internal.measurement.L3 l6);

    public abstract void N(long j6);

    public final void O(boolean z6) {
        j(z6 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i6);

    public abstract void V(int i6, int i10);

    public abstract int b();

    public abstract void b0(int i6, int i10);

    public abstract void j(byte b6);

    public abstract void k(int i6);

    public abstract void l(int i6, int i10);

    public abstract void m(int i6, long j6);

    public abstract void n(int i6, com.google.android.gms.internal.measurement.L3 l6);

    public abstract void o(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5);

    abstract void p(int i6, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5);

    public abstract void q(int i6, java.lang.String str);

    public final void q0(int i6, long j6) {
        L(i6, u0(j6));
    }

    public abstract void r(int i6, boolean z6);

    public final void r0(long j6) {
        N(u0(j6));
    }

    public abstract void s(long j6);

    public abstract void t(com.google.android.gms.internal.measurement.L3 l6);

    public abstract void u(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5);

    public abstract void v(java.lang.String str);

    final void w(java.lang.String str, com.google.android.gms.internal.measurement.O5 o6) throws com.google.android.gms.internal.measurement.AbstractC5982c4.b {
        f40814b.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) o6);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.measurement.AbstractC6146v4.f41255a);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.measurement.AbstractC5982c4.b(e6);
        }
    }

    public final void x0(int i6) {
        U(z0(i6));
    }

    public final void y0(int i6, int i10) {
        b0(i6, z0(i10));
    }
}
