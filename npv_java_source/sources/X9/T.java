package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements X9.InterfaceC1838f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final X9.Z f16090C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X9.C1836d f16091D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16092E;

    public static final class a extends java.io.InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            X9.T t6 = X9.T.this;
            if (t6.f16092E) {
                throw new java.io.IOException("closed");
            }
            return (int) java.lang.Math.min(t6.f16091D.d1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.EOFException {
            X9.T.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            X9.T t6 = X9.T.this;
            if (t6.f16092E) {
                throw new java.io.IOException("closed");
            }
            if (t6.f16091D.d1() == 0) {
                X9.T t10 = X9.T.this;
                if (t10.f16090C.b0(t10.f16091D, 8192L) == -1) {
                    return -1;
                }
            }
            return X9.T.this.f16091D.m() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) throws java.io.IOException {
            p247y7.AbstractC7350t.f(bArr, "data");
            if (X9.T.this.f16092E) {
                throw new java.io.IOException("closed");
            }
            X9.AbstractC1834b.b(bArr.length, i6, i10);
            if (X9.T.this.f16091D.d1() == 0) {
                X9.T t6 = X9.T.this;
                if (t6.f16090C.b0(t6.f16091D, 8192L) == -1) {
                    return -1;
                }
            }
            return X9.T.this.f16091D.z0(bArr, i6, i10);
        }

        public java.lang.String toString() {
            return X9.T.this + ".inputStream()";
        }
    }

    public T(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "source");
        this.f16090C = z6;
        this.f16091D = new X9.C1836d();
    }

    @Override // X9.InterfaceC1838f
    public X9.C1839g A(long j6) throws java.io.EOFException {
        q(j6);
        return this.f16091D.A(j6);
    }

    @Override // X9.InterfaceC1838f
    public void C0(byte[] bArr) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(bArr, "sink");
        try {
            q(bArr.length);
            this.f16091D.C0(bArr);
        } catch (java.io.EOFException e6) {
            int i6 = 0;
            while (this.f16091D.d1() > 0) {
                X9.C1836d c1836d = this.f16091D;
                int iZ0 = c1836d.z0(bArr, i6, (int) c1836d.d1());
                if (iZ0 == -1) {
                    throw new java.lang.AssertionError();
                }
                i6 += iZ0;
            }
            throw e6;
        }
    }

    public boolean G0(long j6) {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (this.f16091D.d1() < j6) {
            if (this.f16090C.b0(this.f16091D, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // X9.InterfaceC1838f
    public int K() throws java.io.EOFException {
        q(4L);
        return this.f16091D.K();
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String N0() {
        return f0(Long.MAX_VALUE);
    }

    @Override // X9.InterfaceC1838f
    public long O() throws java.io.EOFException {
        q(8L);
        return this.f16091D.O();
    }

    @Override // X9.InterfaceC1838f
    public int O0() throws java.io.EOFException {
        q(4L);
        return this.f16091D.O0();
    }

    @Override // X9.InterfaceC1838f
    public void Q0(X9.C1836d c1836d, long j6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        try {
            q(j6);
            this.f16091D.Q0(c1836d, j6);
        } catch (java.io.EOFException e6) {
            c1836d.c0(this.f16091D);
            throw e6;
        }
    }

    @Override // X9.InterfaceC1838f
    public byte[] T0(long j6) throws java.io.EOFException {
        q(j6);
        return this.f16091D.T0(j6);
    }

    @Override // X9.InterfaceC1838f
    public short Z0() throws java.io.EOFException {
        q(2L);
        return this.f16091D.Z0();
    }

    public long a(byte b6) {
        return f(b6, 0L, Long.MAX_VALUE);
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (this.f16091D.d1() == 0) {
            if (j6 == 0) {
                return 0L;
            }
            if (this.f16090C.b0(this.f16091D, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f16091D.b0(c1836d, java.lang.Math.min(j6, this.f16091D.d1()));
    }

    @Override // X9.InterfaceC1838f
    public long b1() throws java.io.EOFException {
        q(8L);
        return this.f16091D.b1();
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.EOFException {
        if (this.f16092E) {
            return;
        }
        this.f16092E = true;
        this.f16090C.close();
        this.f16091D.a();
    }

    @Override // X9.InterfaceC1838f
    public X9.C1836d d() {
        return this.f16091D;
    }

    public long f(byte b6, long j6, long j10) {
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (0 > j6 || j6 > j10) {
            throw new java.lang.IllegalArgumentException(("fromIndex=" + j6 + " toIndex=" + j10).toString());
        }
        while (j6 < j10) {
            long jS0 = this.f16091D.s0(b6, j6, j10);
            if (jS0 != -1) {
                return jS0;
            }
            long jD1 = this.f16091D.d1();
            if (jD1 >= j10 || this.f16090C.b0(this.f16091D, 8192L) == -1) {
                return -1L;
            }
            j6 = java.lang.Math.max(j6, jD1);
        }
        return -1L;
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String f0(long j6) throws java.io.EOFException {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j6).toString());
        }
        long j10 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long jF = f((byte) 10, 0L, j10);
        if (jF != -1) {
            return Y9.a.c(this.f16091D, jF);
        }
        if (j10 < Long.MAX_VALUE && G0(j10) && this.f16091D.r0(j10 - 1) == 13 && G0(1 + j10) && this.f16091D.r0(j10) == 10) {
            return Y9.a.c(this.f16091D, j10);
        }
        X9.C1836d c1836d = new X9.C1836d();
        X9.C1836d c1836d2 = this.f16091D;
        c1836d2.n0(c1836d, 0L, java.lang.Math.min(32, c1836d2.d1()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(this.f16091D.d1(), j6) + " content=" + c1836d.P0().t() + (char) 8230);
    }

    public long g(X9.C1839g c1839g, long j6) {
        p247y7.AbstractC7350t.f(c1839g, "targetBytes");
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (true) {
            long jU0 = this.f16091D.u0(c1839g, j6);
            if (jU0 != -1) {
                return jU0;
            }
            long jD1 = this.f16091D.d1();
            if (this.f16090C.b0(this.f16091D, 8192L) == -1) {
                return -1L;
            }
            j6 = java.lang.Math.max(j6, jD1);
        }
    }

    @Override // X9.InterfaceC1838f
    public long h0(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "targetBytes");
        return g(c1839g, 0L);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16092E;
    }

    @Override // X9.InterfaceC1838f
    public boolean j() {
        if (!this.f16092E) {
            return this.f16091D.j() && this.f16090C.b0(this.f16091D, 8192L) == -1;
        }
        throw new java.lang.IllegalStateException("closed".toString());
    }

    @Override // X9.Z
    public X9.a0 k() {
        return this.f16090C.k();
    }

    @Override // X9.InterfaceC1838f
    public int k0(X9.N n6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(n6, "options");
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        do {
            int iD = Y9.a.d(this.f16091D, n6, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                this.f16091D.skip(n6.s()[iD].I());
                return iD;
            }
        } while (this.f16090C.b0(this.f16091D, 8192L) != -1);
        return -1;
    }

    @Override // X9.InterfaceC1838f
    public byte m() throws java.io.EOFException {
        q(1L);
        return this.f16091D.m();
    }

    @Override // X9.InterfaceC1838f
    public short p() throws java.io.EOFException {
        q(2L);
        return this.f16091D.p();
    }

    @Override // X9.InterfaceC1838f
    public void q(long j6) throws java.io.EOFException {
        if (!G0(j6)) {
            throw new java.io.EOFException();
        }
    }

    @Override // X9.InterfaceC1838f
    public long q1() throws java.io.EOFException {
        q(1L);
        int i6 = 0;
        while (true) {
            int i10 = i6 + 1;
            if (!G0(i10)) {
                break;
            }
            byte bR0 = this.f16091D.r0(i6);
            if ((bR0 < 48 || bR0 > 57) && ((bR0 < 97 || bR0 > 102) && (bR0 < 65 || bR0 > 70))) {
                if (i6 != 0) {
                    break;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                java.lang.String string = java.lang.Integer.toString(bR0, S8.AbstractC1628a.a(16));
                p247y7.AbstractC7350t.e(string, "toString(...)");
                sb.append(string);
                throw new java.lang.NumberFormatException(sb.toString());
            }
            i6 = i10;
        }
        return this.f16091D.q1();
    }

    @Override // X9.InterfaceC1838f
    public java.io.InputStream r1() {
        return new X9.T.a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        p247y7.AbstractC7350t.f(byteBuffer, "sink");
        if (this.f16091D.d1() == 0 && this.f16090C.b0(this.f16091D, 8192L) == -1) {
            return -1;
        }
        return this.f16091D.read(byteBuffer);
    }

    @Override // X9.InterfaceC1838f
    public void skip(long j6) throws java.io.EOFException {
        if (!(!this.f16092E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        while (j6 > 0) {
            if (this.f16091D.d1() == 0 && this.f16090C.b0(this.f16091D, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long jMin = java.lang.Math.min(j6, this.f16091D.d1());
            this.f16091D.skip(jMin);
            j6 -= jMin;
        }
    }

    public java.lang.String toString() {
        return "buffer(" + this.f16090C + ')';
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String w(long j6) throws java.io.EOFException {
        q(j6);
        return this.f16091D.w(j6);
    }
}
