package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements X9.InterfaceC1837e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final X9.X f16086C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X9.C1836d f16087D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16088E;

    public static final class a extends java.io.OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.lang.Throwable {
            X9.S.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            X9.S s6 = X9.S.this;
            if (s6.f16088E) {
                return;
            }
            s6.flush();
        }

        public java.lang.String toString() {
            return X9.S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i6) throws java.io.IOException {
            X9.S s6 = X9.S.this;
            if (s6.f16088E) {
                throw new java.io.IOException("closed");
            }
            s6.f16087D.U((byte) i6);
            X9.S.this.d0();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i6, int i10) throws java.io.IOException {
            p247y7.AbstractC7350t.f(bArr, "data");
            X9.S s6 = X9.S.this;
            if (s6.f16088E) {
                throw new java.io.IOException("closed");
            }
            s6.f16087D.write(bArr, i6, i10);
            X9.S.this.d0();
        }
    }

    public S(X9.X x6) {
        p247y7.AbstractC7350t.f(x6, "sink");
        this.f16086C = x6;
        this.f16087D = new X9.C1836d();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e D0(long j6) {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.D0(j6);
        return d0();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e E() {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long jD1 = this.f16087D.d1();
        if (jD1 > 0) {
            this.f16086C.F0(this.f16087D, jD1);
        }
        return this;
    }

    @Override // X9.X
    public void F0(X9.C1836d c1836d, long j6) {
        p247y7.AbstractC7350t.f(c1836d, "source");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.F0(c1836d, j6);
        d0();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e G(int i6) {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.G(i6);
        return d0();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e L(int i6) {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.L(i6);
        return d0();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e U(int i6) {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.U(i6);
        return d0();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e X0(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "source");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.X0(bArr);
        return d0();
    }

    @Override // X9.InterfaceC1837e
    public long c0(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "source");
        long j6 = 0;
        while (true) {
            long jB0 = z6.b0(this.f16087D, 8192L);
            if (jB0 == -1) {
                return j6;
            }
            j6 += jB0;
            d0();
        }
    }

    @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        if (this.f16088E) {
            return;
        }
        if (this.f16087D.d1() > 0) {
            X9.X x6 = this.f16086C;
            X9.C1836d c1836d = this.f16087D;
            x6.F0(c1836d, c1836d.d1());
        }
        th = null;
        try {
            this.f16086C.close();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f16088E = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // X9.InterfaceC1837e
    public X9.C1836d d() {
        return this.f16087D;
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e d0() {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        long jY = this.f16087D.y();
        if (jY > 0) {
            this.f16086C.F0(this.f16087D, jY);
        }
        return this;
    }

    @Override // X9.InterfaceC1837e, X9.X, java.io.Flushable
    public void flush() {
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (this.f16087D.d1() > 0) {
            X9.X x6 = this.f16086C;
            X9.C1836d c1836d = this.f16087D;
            x6.F0(c1836d, c1836d.d1());
        }
        this.f16086C.flush();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e h1(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "byteString");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.h1(c1839g);
        return d0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16088E;
    }

    @Override // X9.X
    public X9.a0 k() {
        return this.f16086C.k();
    }

    @Override // X9.InterfaceC1837e
    public java.io.OutputStream p1() {
        return new X9.S.a();
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e t0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.t0(str);
        return d0();
    }

    public java.lang.String toString() {
        return "buffer(" + this.f16086C + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        p247y7.AbstractC7350t.f(byteBuffer, "source");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        int iWrite = this.f16087D.write(byteBuffer);
        d0();
        return iWrite;
    }

    @Override // X9.InterfaceC1837e
    public X9.InterfaceC1837e write(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        if (!(!this.f16088E)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        this.f16087D.write(bArr, i6, i10);
        return d0();
    }
}
