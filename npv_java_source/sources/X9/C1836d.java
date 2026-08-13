package X9;

/* JADX INFO: renamed from: X9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1836d implements X9.InterfaceC1838f, X9.InterfaceC1837e, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public X9.U f16138C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f16139D;

    /* JADX INFO: renamed from: X9.d$a */
    public static final class a implements java.io.Closeable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public X9.C1836d f16140C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f16141D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private X9.U f16142E;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public byte[] f16144G;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public long f16143F = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f16145H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f16146I = -1;

        public final X9.U a() {
            return this.f16142E;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16140C == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            this.f16140C = null;
            o(null);
            this.f16143F = -1L;
            this.f16144G = null;
            this.f16145H = -1;
            this.f16146I = -1;
        }

        public final int f() {
            long j6 = this.f16143F;
            X9.C1836d c1836d = this.f16140C;
            p247y7.AbstractC7350t.c(c1836d);
            if (j6 == c1836d.d1()) {
                throw new java.lang.IllegalStateException("no more bytes".toString());
            }
            long j10 = this.f16143F;
            return i(j10 == -1 ? 0L : j10 + ((long) (this.f16146I - this.f16145H)));
        }

        public final long g(long j6) {
            X9.C1836d c1836d = this.f16140C;
            if (c1836d == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f16141D) {
                throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long jD1 = c1836d.d1();
            if (j6 <= jD1) {
                if (j6 < 0) {
                    throw new java.lang.IllegalArgumentException(("newSize < 0: " + j6).toString());
                }
                long j10 = jD1 - j6;
                while (j10 > 0) {
                    X9.U u6 = c1836d.f16138C;
                    p247y7.AbstractC7350t.c(u6);
                    X9.U u10 = u6.f16101g;
                    p247y7.AbstractC7350t.c(u10);
                    int i6 = u10.f16097c;
                    long j11 = i6 - u10.f16096b;
                    if (j11 > j10) {
                        u10.f16097c = i6 - ((int) j10);
                        break;
                    }
                    c1836d.f16138C = u10.b();
                    X9.V.b(u10);
                    j10 -= j11;
                }
                o(null);
                this.f16143F = j6;
                this.f16144G = null;
                this.f16145H = -1;
                this.f16146I = -1;
            } else if (j6 > jD1) {
                long j12 = j6 - jD1;
                boolean z6 = true;
                while (j12 > 0) {
                    X9.U uL1 = c1836d.l1(1);
                    int iMin = (int) java.lang.Math.min(j12, 8192 - uL1.f16097c);
                    uL1.f16097c += iMin;
                    j12 -= (long) iMin;
                    if (z6) {
                        o(uL1);
                        this.f16143F = jD1;
                        this.f16144G = uL1.f16095a;
                        int i10 = uL1.f16097c;
                        this.f16145H = i10 - iMin;
                        this.f16146I = i10;
                        z6 = false;
                    }
                }
            }
            c1836d.c1(j6);
            return jD1;
        }

        public final int i(long j6) {
            X9.U uC;
            X9.C1836d c1836d = this.f16140C;
            if (c1836d == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (j6 < -1 || j6 > c1836d.d1()) {
                throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + j6 + " > size=" + c1836d.d1());
            }
            if (j6 == -1 || j6 == c1836d.d1()) {
                o(null);
                this.f16143F = j6;
                this.f16144G = null;
                this.f16145H = -1;
                this.f16146I = -1;
                return -1;
            }
            long jD1 = c1836d.d1();
            X9.U uA = c1836d.f16138C;
            long j10 = 0;
            if (a() != null) {
                long j11 = this.f16143F;
                int i6 = this.f16145H;
                X9.U uA2 = a();
                p247y7.AbstractC7350t.c(uA2);
                long j12 = j11 - ((long) (i6 - uA2.f16096b));
                if (j12 > j6) {
                    uC = uA;
                    uA = a();
                    jD1 = j12;
                } else {
                    uC = a();
                    j10 = j12;
                }
            } else {
                uC = uA;
            }
            if (jD1 - j6 > j6 - j10) {
                while (true) {
                    p247y7.AbstractC7350t.c(uC);
                    int i10 = uC.f16097c;
                    int i11 = uC.f16096b;
                    if (j6 < ((long) (i10 - i11)) + j10) {
                        break;
                    }
                    j10 += (long) (i10 - i11);
                    uC = uC.f16100f;
                }
            } else {
                while (jD1 > j6) {
                    p247y7.AbstractC7350t.c(uA);
                    uA = uA.f16101g;
                    p247y7.AbstractC7350t.c(uA);
                    jD1 -= (long) (uA.f16097c - uA.f16096b);
                }
                j10 = jD1;
                uC = uA;
            }
            if (this.f16141D) {
                p247y7.AbstractC7350t.c(uC);
                if (uC.f16098d) {
                    X9.U uF = uC.f();
                    if (c1836d.f16138C == uC) {
                        c1836d.f16138C = uF;
                    }
                    uC = uC.c(uF);
                    X9.U u6 = uC.f16101g;
                    p247y7.AbstractC7350t.c(u6);
                    u6.b();
                }
            }
            o(uC);
            this.f16143F = j6;
            p247y7.AbstractC7350t.c(uC);
            this.f16144G = uC.f16095a;
            int i12 = uC.f16096b + ((int) (j6 - j10));
            this.f16145H = i12;
            int i13 = uC.f16097c;
            this.f16146I = i13;
            return i13 - i12;
        }

        public final void o(X9.U u6) {
            this.f16142E = u6;
        }
    }

    /* JADX INFO: renamed from: X9.d$b */
    public static final class b extends java.io.InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) java.lang.Math.min(X9.C1836d.this.d1(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (X9.C1836d.this.d1() > 0) {
                return X9.C1836d.this.m() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) {
            p247y7.AbstractC7350t.f(bArr, "sink");
            return X9.C1836d.this.z0(bArr, i6, i10);
        }

        public java.lang.String toString() {
            return X9.C1836d.this + ".inputStream()";
        }
    }

    /* JADX INFO: renamed from: X9.d$c */
    public static final class c extends java.io.OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public java.lang.String toString() {
            return X9.C1836d.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i6) {
            X9.C1836d.this.U(i6);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i6, int i10) {
            p247y7.AbstractC7350t.f(bArr, "data");
            X9.C1836d.this.write(bArr, i6, i10);
        }
    }

    public static /* synthetic */ X9.C1836d.a H0(X9.C1836d c1836d, X9.C1836d.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            aVar = X9.AbstractC1834b.d();
        }
        return c1836d.E0(aVar);
    }

    @Override // X9.InterfaceC1838f
    public X9.C1839g A(long j6) throws java.io.EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (d1() < j6) {
            throw new java.io.EOFException();
        }
        if (j6 < 4096) {
            return new X9.C1839g(T0(j6));
        }
        X9.C1839g c1839gF1 = f1((int) j6);
        skip(j6);
        return c1839gF1;
    }

    public X9.C1836d A1(java.lang.String str, int i6, int i10, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(str, "string");
        p247y7.AbstractC7350t.f(charset, "charset");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i6).toString());
        }
        if (i10 < i6) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i6).toString());
        }
        if (i10 > str.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + str.length()).toString());
        }
        if (p247y7.AbstractC7350t.b(charset, S8.C1631d.f12624b)) {
            return C1(str, i6, i10);
        }
        java.lang.String strSubstring = str.substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d t0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "string");
        return C1(str, 0, str.length());
    }

    @Override // X9.InterfaceC1838f
    public void C0(byte[] bArr) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(bArr, "sink");
        int i6 = 0;
        while (i6 < bArr.length) {
            int iZ0 = z0(bArr, i6, bArr.length - i6);
            if (iZ0 == -1) {
                throw new java.io.EOFException();
            }
            i6 += iZ0;
        }
    }

    public X9.C1836d C1(java.lang.String str, int i6, int i10) {
        char cCharAt;
        long jD1;
        long j6;
        p247y7.AbstractC7350t.f(str, "string");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i6).toString());
        }
        if (i10 < i6) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + i10 + " < " + i6).toString());
        }
        if (i10 > str.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + i10 + " > " + str.length()).toString());
        }
        while (i6 < i10) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128) {
                X9.U uL1 = l1(1);
                byte[] bArr = uL1.f16095a;
                int i11 = uL1.f16097c - i6;
                int iMin = java.lang.Math.min(i10, 8192 - i11);
                int i12 = i6 + 1;
                bArr[i6 + i11] = (byte) cCharAt2;
                while (true) {
                    i6 = i12;
                    if (i6 >= iMin || (cCharAt = str.charAt(i6)) >= 128) {
                        break;
                    }
                    i12 = i6 + 1;
                    bArr[i6 + i11] = (byte) cCharAt;
                }
                int i13 = uL1.f16097c;
                int i14 = (i11 + i6) - i13;
                uL1.f16097c = i13 + i14;
                c1(d1() + ((long) i14));
            } else {
                if (cCharAt2 < 2048) {
                    X9.U uL2 = l1(2);
                    byte[] bArr2 = uL2.f16095a;
                    int i15 = uL2.f16097c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    uL2.f16097c = i15 + 2;
                    jD1 = d1();
                    j6 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    X9.U uL3 = l1(3);
                    byte[] bArr3 = uL3.f16095a;
                    int i16 = uL3.f16097c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    uL3.f16097c = i16 + 3;
                    jD1 = d1();
                    j6 = 3;
                } else {
                    int i17 = i6 + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        U(63);
                        i6 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        X9.U uL4 = l1(4);
                        byte[] bArr4 = uL4.f16095a;
                        int i19 = uL4.f16097c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        uL4.f16097c = i19 + 4;
                        c1(d1() + 4);
                        i6 += 2;
                    }
                }
                c1(jD1 + j6);
                i6++;
            }
        }
        return this;
    }

    public X9.C1836d D1(int i6) {
        long jD1;
        long j6;
        if (i6 < 128) {
            U(i6);
        } else {
            if (i6 < 2048) {
                X9.U uL1 = l1(2);
                byte[] bArr = uL1.f16095a;
                int i10 = uL1.f16097c;
                bArr[i10] = (byte) ((i6 >> 6) | 192);
                bArr[i10 + 1] = (byte) ((i6 & 63) | 128);
                uL1.f16097c = i10 + 2;
                jD1 = d1();
                j6 = 2;
            } else if (55296 <= i6 && i6 < 57344) {
                U(63);
            } else if (i6 < 65536) {
                X9.U uL2 = l1(3);
                byte[] bArr2 = uL2.f16095a;
                int i11 = uL2.f16097c;
                bArr2[i11] = (byte) ((i6 >> 12) | 224);
                bArr2[i11 + 1] = (byte) (((i6 >> 6) & 63) | 128);
                bArr2[i11 + 2] = (byte) ((i6 & 63) | 128);
                uL2.f16097c = i11 + 3;
                jD1 = d1();
                j6 = 3;
            } else {
                if (i6 > 1114111) {
                    throw new java.lang.IllegalArgumentException("Unexpected code point: 0x" + X9.AbstractC1834b.l(i6));
                }
                X9.U uL3 = l1(4);
                byte[] bArr3 = uL3.f16095a;
                int i12 = uL3.f16097c;
                bArr3[i12] = (byte) ((i6 >> 18) | 240);
                bArr3[i12 + 1] = (byte) (((i6 >> 12) & 63) | 128);
                bArr3[i12 + 2] = (byte) (((i6 >> 6) & 63) | 128);
                bArr3[i12 + 3] = (byte) ((i6 & 63) | 128);
                uL3.f16097c = i12 + 4;
                jD1 = d1();
                j6 = 4;
            }
            c1(jD1 + j6);
        }
        return this;
    }

    public final X9.C1836d.a E0(X9.C1836d.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "unsafeCursor");
        return Y9.a.a(this, aVar);
    }

    @Override // X9.X
    public void F0(X9.C1836d c1836d, long j6) {
        X9.U u6;
        p247y7.AbstractC7350t.f(c1836d, "source");
        if (c1836d == this) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        X9.AbstractC1834b.b(c1836d.d1(), 0L, j6);
        while (j6 > 0) {
            X9.U u10 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u10);
            int i6 = u10.f16097c;
            X9.U u11 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u11);
            if (j6 < i6 - u11.f16096b) {
                X9.U u12 = this.f16138C;
                if (u12 != null) {
                    p247y7.AbstractC7350t.c(u12);
                    u6 = u12.f16101g;
                } else {
                    u6 = null;
                }
                if (u6 != null && u6.f16099e) {
                    if ((((long) u6.f16097c) + j6) - ((long) (u6.f16098d ? 0 : u6.f16096b)) <= 8192) {
                        X9.U u13 = c1836d.f16138C;
                        p247y7.AbstractC7350t.c(u13);
                        u13.g(u6, (int) j6);
                        c1836d.c1(c1836d.d1() - j6);
                        c1(d1() + j6);
                        return;
                    }
                }
                X9.U u14 = c1836d.f16138C;
                p247y7.AbstractC7350t.c(u14);
                c1836d.f16138C = u14.e((int) j6);
            }
            X9.U u15 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u15);
            long j10 = u15.f16097c - u15.f16096b;
            c1836d.f16138C = u15.b();
            X9.U u16 = this.f16138C;
            if (u16 == null) {
                this.f16138C = u15;
                u15.f16101g = u15;
                u15.f16100f = u15;
            } else {
                p247y7.AbstractC7350t.c(u16);
                X9.U u17 = u16.f16101g;
                p247y7.AbstractC7350t.c(u17);
                u17.c(u15).a();
            }
            c1836d.c1(c1836d.d1() - j10);
            c1(d1() + j10);
            j6 -= j10;
        }
    }

    public final X9.C1836d H() {
        X9.C1836d c1836d = new X9.C1836d();
        if (d1() != 0) {
            X9.U u6 = this.f16138C;
            p247y7.AbstractC7350t.c(u6);
            X9.U uD = u6.d();
            c1836d.f16138C = uD;
            uD.f16101g = uD;
            uD.f16100f = uD;
            for (X9.U u10 = u6.f16100f; u10 != u6; u10 = u10.f16100f) {
                X9.U u11 = uD.f16101g;
                p247y7.AbstractC7350t.c(u11);
                p247y7.AbstractC7350t.c(u10);
                u11.c(u10.d());
            }
            c1836d.c1(d1());
        }
        return c1836d;
    }

    @Override // X9.InterfaceC1838f
    public int K() throws java.io.EOFException {
        if (d1() < 4) {
            throw new java.io.EOFException();
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16096b;
        int i10 = u6.f16097c;
        if (i10 - i6 < 4) {
            return ((m() & 255) << 24) | ((m() & 255) << 16) | ((m() & 255) << 8) | (m() & 255);
        }
        byte[] bArr = u6.f16095a;
        int i11 = i6 + 3;
        int i12 = ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 2] & 255) << 8);
        int i13 = i6 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        c1(d1() - 4);
        if (i13 == i10) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        } else {
            u6.f16096b = i13;
        }
        return i14;
    }

    public byte[] K0() {
        return T0(d1());
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String N0() {
        return f0(Long.MAX_VALUE);
    }

    @Override // X9.InterfaceC1838f
    public long O() throws java.io.EOFException {
        if (d1() < 8) {
            throw new java.io.EOFException();
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16096b;
        int i10 = u6.f16097c;
        if (i10 - i6 < 8) {
            return ((((long) K()) & 4294967295L) << 32) | (4294967295L & ((long) K()));
        }
        byte[] bArr = u6.f16095a;
        int i11 = i6 + 7;
        long j6 = ((((long) bArr[i6]) & 255) << 56) | ((((long) bArr[i6 + 1]) & 255) << 48) | ((((long) bArr[i6 + 2]) & 255) << 40) | ((((long) bArr[i6 + 3]) & 255) << 32) | ((((long) bArr[i6 + 4]) & 255) << 24) | ((((long) bArr[i6 + 5]) & 255) << 16) | ((((long) bArr[i6 + 6]) & 255) << 8);
        int i12 = i6 + 8;
        long j10 = j6 | (((long) bArr[i11]) & 255);
        c1(d1() - 8);
        if (i12 == i10) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        } else {
            u6.f16096b = i12;
        }
        return j10;
    }

    @Override // X9.InterfaceC1838f
    public int O0() {
        return X9.AbstractC1834b.h(K());
    }

    public X9.C1839g P0() {
        return A(d1());
    }

    @Override // X9.InterfaceC1838f
    public void Q0(X9.C1836d c1836d, long j6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (d1() >= j6) {
            c1836d.F0(this, j6);
        } else {
            c1836d.F0(this, d1());
            throw new java.io.EOFException();
        }
    }

    public java.lang.String R0(long j6, java.nio.charset.Charset charset) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(charset, "charset");
        if (j6 < 0 || j6 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (this.f16139D < j6) {
            throw new java.io.EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16096b;
        if (((long) i6) + j6 > u6.f16097c) {
            return new java.lang.String(T0(j6), charset);
        }
        int i10 = (int) j6;
        java.lang.String str = new java.lang.String(u6.f16095a, i6, i10, charset);
        int i11 = u6.f16096b + i10;
        u6.f16096b = i11;
        this.f16139D -= j6;
        if (i11 == u6.f16097c) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        }
        return str;
    }

    @Override // X9.InterfaceC1838f
    public byte[] T0(long j6) throws java.io.EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (d1() < j6) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) j6];
        C0(bArr);
        return bArr;
    }

    public java.lang.String Y0() {
        return R0(this.f16139D, S8.C1631d.f12624b);
    }

    @Override // X9.InterfaceC1838f
    public short Z0() {
        return X9.AbstractC1834b.j(p());
    }

    public final void a() throws java.io.EOFException {
        skip(d1());
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (d1() == 0) {
            return -1L;
        }
        if (j6 > d1()) {
            j6 = d1();
        }
        c1836d.F0(this, j6);
        return j6;
    }

    @Override // X9.InterfaceC1838f
    public long b1() {
        return X9.AbstractC1834b.i(O());
    }

    @Override // X9.InterfaceC1837e
    public long c0(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "source");
        long j6 = 0;
        while (true) {
            long jB0 = z6.b0(this, 8192L);
            if (jB0 == -1) {
                return j6;
            }
            j6 += jB0;
        }
    }

    public final void c1(long j6) {
        this.f16139D = j6;
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // X9.InterfaceC1838f
    public X9.C1836d d() {
        return this;
    }

    public final long d1() {
        return this.f16139D;
    }

    public final X9.C1839g e1() {
        if (d1() <= 2147483647L) {
            return f1((int) d1());
        }
        throw new java.lang.IllegalStateException(("size > Int.MAX_VALUE: " + d1()).toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X9.C1836d) {
            X9.C1836d c1836d = (X9.C1836d) obj;
            if (d1() == c1836d.d1()) {
                if (d1() == 0) {
                    return true;
                }
                X9.U u6 = this.f16138C;
                p247y7.AbstractC7350t.c(u6);
                X9.U u10 = c1836d.f16138C;
                p247y7.AbstractC7350t.c(u10);
                int i6 = u6.f16096b;
                int i10 = u10.f16096b;
                long j6 = 0;
                while (j6 < d1()) {
                    long jMin = java.lang.Math.min(u6.f16097c - i6, u10.f16097c - i10);
                    long j10 = 0;
                    while (j10 < jMin) {
                        int i11 = i6 + 1;
                        int i12 = i10 + 1;
                        if (u6.f16095a[i6] == u10.f16095a[i10]) {
                            j10++;
                            i6 = i11;
                            i10 = i12;
                        }
                    }
                    if (i6 == u6.f16097c) {
                        u6 = u6.f16100f;
                        p247y7.AbstractC7350t.c(u6);
                        i6 = u6.f16096b;
                    }
                    if (i10 == u10.f16097c) {
                        u10 = u10.f16100f;
                        p247y7.AbstractC7350t.c(u10);
                        i10 = u10.f16096b;
                    }
                    j6 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String f0(long j6) throws java.io.EOFException {
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("limit < 0: " + j6).toString());
        }
        long j10 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long jS0 = s0((byte) 10, 0L, j10);
        if (jS0 != -1) {
            return Y9.a.c(this, jS0);
        }
        if (j10 < d1() && r0(j10 - 1) == 13 && r0(j10) == 10) {
            return Y9.a.c(this, j10);
        }
        X9.C1836d c1836d = new X9.C1836d();
        n0(c1836d, 0L, java.lang.Math.min(32, d1()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(d1(), j6) + " content=" + c1836d.P0().t() + (char) 8230);
    }

    public final X9.C1839g f1(int i6) {
        if (i6 == 0) {
            return X9.C1839g.f16150G;
        }
        X9.AbstractC1834b.b(d1(), 0L, i6);
        X9.U u6 = this.f16138C;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i6) {
            p247y7.AbstractC7350t.c(u6);
            int i13 = u6.f16097c;
            int i14 = u6.f16096b;
            if (i13 == i14) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            u6 = u6.f16100f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        X9.U u10 = this.f16138C;
        int i15 = 0;
        while (i10 < i6) {
            p247y7.AbstractC7350t.c(u10);
            bArr[i15] = u10.f16095a;
            i10 += u10.f16097c - u10.f16096b;
            iArr[i15] = java.lang.Math.min(i10, i6);
            iArr[i15 + i12] = u10.f16096b;
            u10.f16098d = true;
            i15++;
            u10 = u10.f16100f;
        }
        return new X9.W(bArr, iArr);
    }

    @Override // X9.InterfaceC1837e, X9.X, java.io.Flushable
    public void flush() {
    }

    @Override // X9.InterfaceC1838f
    public long h0(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "targetBytes");
        return u0(c1839g, 0L);
    }

    public int hashCode() {
        X9.U u6 = this.f16138C;
        if (u6 == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i10 = u6.f16097c;
            for (int i11 = u6.f16096b; i11 < i10; i11++) {
                i6 = (i6 * 31) + u6.f16095a[i11];
            }
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
        } while (u6 != this.f16138C);
        return i6;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // X9.InterfaceC1838f
    public boolean j() {
        return this.f16139D == 0;
    }

    @Override // X9.Z
    public X9.a0 k() {
        return X9.a0.f16113e;
    }

    @Override // X9.InterfaceC1838f
    public int k0(X9.N n6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(n6, "options");
        int iE = Y9.a.e(this, n6, false, 2, null);
        if (iE == -1) {
            return -1;
        }
        skip(n6.s()[iE].I());
        return iE;
    }

    public final X9.U l1(int i6) {
        if (i6 < 1 || i6 > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        X9.U u6 = this.f16138C;
        if (u6 != null) {
            p247y7.AbstractC7350t.c(u6);
            X9.U u10 = u6.f16101g;
            p247y7.AbstractC7350t.c(u10);
            return (u10.f16097c + i6 > 8192 || !u10.f16099e) ? u10.c(X9.V.c()) : u10;
        }
        X9.U uC = X9.V.c();
        this.f16138C = uC;
        uC.f16101g = uC;
        uC.f16100f = uC;
        return uC;
    }

    @Override // X9.InterfaceC1838f
    public byte m() throws java.io.EOFException {
        if (d1() == 0) {
            throw new java.io.EOFException();
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16096b;
        int i10 = u6.f16097c;
        int i11 = i6 + 1;
        byte b6 = u6.f16095a[i6];
        c1(d1() - 1);
        if (i11 == i10) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        } else {
            u6.f16096b = i11;
        }
        return b6;
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d h1(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "byteString");
        c1839g.P(this, 0, c1839g.I());
        return this;
    }

    public final X9.C1836d n0(X9.C1836d c1836d, long j6, long j10) {
        p247y7.AbstractC7350t.f(c1836d, "out");
        X9.AbstractC1834b.b(d1(), j6, j10);
        if (j10 != 0) {
            c1836d.c1(c1836d.d1() + j10);
            X9.U u6 = this.f16138C;
            while (true) {
                p247y7.AbstractC7350t.c(u6);
                int i6 = u6.f16097c;
                int i10 = u6.f16096b;
                if (j6 < i6 - i10) {
                    break;
                }
                j6 -= (long) (i6 - i10);
                u6 = u6.f16100f;
            }
            while (j10 > 0) {
                p247y7.AbstractC7350t.c(u6);
                X9.U uD = u6.d();
                int i11 = uD.f16096b + ((int) j6);
                uD.f16096b = i11;
                uD.f16097c = java.lang.Math.min(i11 + ((int) j10), uD.f16097c);
                X9.U u10 = c1836d.f16138C;
                if (u10 == null) {
                    uD.f16101g = uD;
                    uD.f16100f = uD;
                    c1836d.f16138C = uD;
                } else {
                    p247y7.AbstractC7350t.c(u10);
                    X9.U u11 = u10.f16101g;
                    p247y7.AbstractC7350t.c(u11);
                    u11.c(uD);
                }
                j10 -= (long) (uD.f16097c - uD.f16096b);
                u6 = u6.f16100f;
                j6 = 0;
            }
        }
        return this;
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public X9.C1836d E() {
        return this;
    }

    @Override // X9.InterfaceC1838f
    public short p() throws java.io.EOFException {
        if (d1() < 2) {
            throw new java.io.EOFException();
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16096b;
        int i10 = u6.f16097c;
        if (i10 - i6 < 2) {
            return (short) (((m() & 255) << 8) | (m() & 255));
        }
        byte[] bArr = u6.f16095a;
        int i11 = i6 + 1;
        int i12 = (bArr[i6] & 255) << 8;
        int i13 = i6 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        c1(d1() - 2);
        if (i13 == i10) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        } else {
            u6.f16096b = i13;
        }
        return (short) i14;
    }

    @Override // X9.InterfaceC1837e
    public java.io.OutputStream p1() {
        return new X9.C1836d.c();
    }

    @Override // X9.InterfaceC1838f
    public void q(long j6) throws java.io.EOFException {
        if (this.f16139D < j6) {
            throw new java.io.EOFException();
        }
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public X9.C1836d d0() {
        return this;
    }

    @Override // X9.InterfaceC1838f
    public long q1() throws java.io.EOFException {
        int i6;
        if (d1() == 0) {
            throw new java.io.EOFException();
        }
        int i10 = 0;
        boolean z6 = false;
        long j6 = 0;
        do {
            X9.U u6 = this.f16138C;
            p247y7.AbstractC7350t.c(u6);
            byte[] bArr = u6.f16095a;
            int i11 = u6.f16096b;
            int i12 = u6.f16097c;
            while (i11 < i12) {
                byte b6 = bArr[i11];
                if (b6 >= 48 && b6 <= 57) {
                    i6 = b6 - 48;
                } else if (b6 >= 97 && b6 <= 102) {
                    i6 = b6 - 87;
                } else {
                    if (b6 < 65 || b6 > 70) {
                        if (i10 != 0) {
                            z6 = true;
                            break;
                        }
                        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + X9.AbstractC1834b.k(b6));
                    }
                    i6 = b6 - 55;
                }
                if (((-1152921504606846976L) & j6) != 0) {
                    throw new java.lang.NumberFormatException("Number too large: " + new X9.C1836d().D0(j6).U(b6).Y0());
                }
                j6 = (j6 << 4) | ((long) i6);
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f16138C = u6.b();
                X9.V.b(u6);
            } else {
                u6.f16096b = i11;
            }
            if (z6) {
                break;
            }
        } while (this.f16138C != null);
        c1(d1() - ((long) i10));
        return j6;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public X9.C1836d clone() {
        return H();
    }

    public final byte r0(long j6) {
        X9.AbstractC1834b.b(d1(), j6, 1L);
        X9.U u6 = this.f16138C;
        if (u6 == null) {
            p247y7.AbstractC7350t.c(null);
            throw null;
        }
        if (d1() - j6 < j6) {
            long jD1 = d1();
            while (jD1 > j6) {
                u6 = u6.f16101g;
                p247y7.AbstractC7350t.c(u6);
                jD1 -= (long) (u6.f16097c - u6.f16096b);
            }
            p247y7.AbstractC7350t.c(u6);
            return u6.f16095a[(int) ((((long) u6.f16096b) + j6) - jD1)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (u6.f16097c - u6.f16096b)) + j10;
            if (j11 > j6) {
                p247y7.AbstractC7350t.c(u6);
                return u6.f16095a[(int) ((((long) u6.f16096b) + j6) - j10)];
            }
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            j10 = j11;
        }
    }

    @Override // X9.InterfaceC1838f
    public java.io.InputStream r1() {
        return new X9.C1836d.b();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) {
        p247y7.AbstractC7350t.f(byteBuffer, "sink");
        X9.U u6 = this.f16138C;
        if (u6 == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), u6.f16097c - u6.f16096b);
        byteBuffer.put(u6.f16095a, u6.f16096b, iMin);
        int i6 = u6.f16096b + iMin;
        u6.f16096b = i6;
        this.f16139D -= (long) iMin;
        if (i6 == u6.f16097c) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        }
        return iMin;
    }

    public long s0(byte b6, long j6, long j10) {
        X9.U u6;
        int i6;
        long jD1 = 0;
        if (0 > j6 || j6 > j10) {
            throw new java.lang.IllegalArgumentException(("size=" + d1() + " fromIndex=" + j6 + " toIndex=" + j10).toString());
        }
        if (j10 > d1()) {
            j10 = d1();
        }
        if (j6 == j10 || (u6 = this.f16138C) == null) {
            return -1L;
        }
        if (d1() - j6 < j6) {
            jD1 = d1();
            while (jD1 > j6) {
                u6 = u6.f16101g;
                p247y7.AbstractC7350t.c(u6);
                jD1 -= (long) (u6.f16097c - u6.f16096b);
            }
            while (jD1 < j10) {
                byte[] bArr = u6.f16095a;
                int iMin = (int) java.lang.Math.min(u6.f16097c, (((long) u6.f16096b) + j10) - jD1);
                i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
                while (i6 < iMin) {
                    if (bArr[i6] != b6) {
                        i6++;
                    }
                }
                jD1 += (long) (u6.f16097c - u6.f16096b);
                u6 = u6.f16100f;
                p247y7.AbstractC7350t.c(u6);
                j6 = jD1;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (u6.f16097c - u6.f16096b)) + jD1;
            if (j11 > j6) {
                break;
            }
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            jD1 = j11;
        }
        while (jD1 < j10) {
            byte[] bArr2 = u6.f16095a;
            int iMin2 = (int) java.lang.Math.min(u6.f16097c, (((long) u6.f16096b) + j10) - jD1);
            i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
            while (i6 < iMin2) {
                if (bArr2[i6] != b6) {
                    i6++;
                }
            }
            jD1 += (long) (u6.f16097c - u6.f16096b);
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            j6 = jD1;
        }
        return -1L;
        return ((long) (i6 - u6.f16096b)) + jD1;
    }

    @Override // X9.InterfaceC1838f
    public void skip(long j6) throws java.io.EOFException {
        while (j6 > 0) {
            X9.U u6 = this.f16138C;
            if (u6 == null) {
                throw new java.io.EOFException();
            }
            int iMin = (int) java.lang.Math.min(j6, u6.f16097c - u6.f16096b);
            long j10 = iMin;
            c1(d1() - j10);
            j6 -= j10;
            int i6 = u6.f16096b + iMin;
            u6.f16096b = i6;
            if (i6 == u6.f16097c) {
                this.f16138C = u6.b();
                X9.V.b(u6);
            }
        }
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d X0(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public java.lang.String toString() {
        return e1().toString();
    }

    public long u0(X9.C1839g c1839g, long j6) {
        int i6;
        p247y7.AbstractC7350t.f(c1839g, "targetBytes");
        long jD1 = 0;
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("fromIndex < 0: " + j6).toString());
        }
        X9.U u6 = this.f16138C;
        if (u6 == null) {
            return -1L;
        }
        if (d1() - j6 < j6) {
            jD1 = d1();
            while (jD1 > j6) {
                u6 = u6.f16101g;
                p247y7.AbstractC7350t.c(u6);
                jD1 -= (long) (u6.f16097c - u6.f16096b);
            }
            if (c1839g.I() == 2) {
                byte bN = c1839g.n(0);
                byte bN2 = c1839g.n(1);
                while (jD1 < d1()) {
                    byte[] bArr = u6.f16095a;
                    i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
                    int i10 = u6.f16097c;
                    while (i6 < i10) {
                        byte b6 = bArr[i6];
                        if (b6 != bN && b6 != bN2) {
                            i6++;
                        }
                    }
                    jD1 += (long) (u6.f16097c - u6.f16096b);
                    u6 = u6.f16100f;
                    p247y7.AbstractC7350t.c(u6);
                    j6 = jD1;
                }
                return -1L;
            }
            byte[] bArrX = c1839g.x();
            while (jD1 < d1()) {
                byte[] bArr2 = u6.f16095a;
                i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
                int i11 = u6.f16097c;
                while (i6 < i11) {
                    byte b10 = bArr2[i6];
                    for (byte b11 : bArrX) {
                        if (b10 != b11) {
                        }
                    }
                    i6++;
                }
                jD1 += (long) (u6.f16097c - u6.f16096b);
                u6 = u6.f16100f;
                p247y7.AbstractC7350t.c(u6);
                j6 = jD1;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (u6.f16097c - u6.f16096b)) + jD1;
            if (j10 > j6) {
                break;
            }
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            jD1 = j10;
        }
        if (c1839g.I() == 2) {
            byte bN3 = c1839g.n(0);
            byte bN4 = c1839g.n(1);
            while (jD1 < d1()) {
                byte[] bArr3 = u6.f16095a;
                i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
                int i12 = u6.f16097c;
                while (i6 < i12) {
                    byte b12 = bArr3[i6];
                    if (b12 != bN3 && b12 != bN4) {
                        i6++;
                    }
                }
                jD1 += (long) (u6.f16097c - u6.f16096b);
                u6 = u6.f16100f;
                p247y7.AbstractC7350t.c(u6);
                j6 = jD1;
            }
            return -1L;
        }
        byte[] bArrX2 = c1839g.x();
        while (jD1 < d1()) {
            byte[] bArr4 = u6.f16095a;
            i6 = (int) ((((long) u6.f16096b) + j6) - jD1);
            int i13 = u6.f16097c;
            while (i6 < i13) {
                byte b13 = bArr4[i6];
                for (byte b14 : bArrX2) {
                    if (b13 != b14) {
                    }
                }
                i6++;
            }
            jD1 += (long) (u6.f16097c - u6.f16096b);
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            j6 = jD1;
        }
        return -1L;
        return ((long) (i6 - u6.f16096b)) + jD1;
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d write(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "source");
        long j6 = i10;
        X9.AbstractC1834b.b(bArr.length, i6, j6);
        int i11 = i10 + i6;
        while (i6 < i11) {
            X9.U uL1 = l1(1);
            int iMin = java.lang.Math.min(i11 - i6, 8192 - uL1.f16097c);
            int i12 = i6 + iMin;
            p097j7.AbstractC6872n.g(bArr, uL1.f16095a, uL1.f16097c, i6, i12);
            uL1.f16097c += iMin;
            i6 = i12;
        }
        c1(d1() + j6);
        return this;
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d U(int i6) {
        X9.U uL1 = l1(1);
        byte[] bArr = uL1.f16095a;
        int i10 = uL1.f16097c;
        uL1.f16097c = i10 + 1;
        bArr[i10] = (byte) i6;
        c1(d1() + 1);
        return this;
    }

    @Override // X9.InterfaceC1838f
    public java.lang.String w(long j6) throws java.io.EOFException {
        return R0(j6, S8.C1631d.f12624b);
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d D0(long j6) {
        if (j6 == 0) {
            return U(48);
        }
        long j10 = (j6 >>> 1) | j6;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i6 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        X9.U uL1 = l1(i6);
        byte[] bArr = uL1.f16095a;
        int i10 = uL1.f16097c;
        for (int i11 = (i10 + i6) - 1; i11 >= i10; i11--) {
            bArr[i11] = Y9.a.b()[(int) (15 & j6)];
            j6 >>>= 4;
        }
        uL1.f16097c += i6;
        c1(d1() + ((long) i6));
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) {
        p247y7.AbstractC7350t.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i6 = iRemaining;
        while (i6 > 0) {
            X9.U uL1 = l1(1);
            int iMin = java.lang.Math.min(i6, 8192 - uL1.f16097c);
            byteBuffer.get(uL1.f16095a, uL1.f16097c, iMin);
            i6 -= iMin;
            uL1.f16097c += iMin;
        }
        this.f16139D += (long) iRemaining;
        return iRemaining;
    }

    public boolean x0(long j6, X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        return y0(j6, c1839g, 0, c1839g.I());
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d L(int i6) {
        X9.U uL1 = l1(4);
        byte[] bArr = uL1.f16095a;
        int i10 = uL1.f16097c;
        bArr[i10] = (byte) ((i6 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i6 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i6 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i6 & 255);
        uL1.f16097c = i10 + 4;
        c1(d1() + 4);
        return this;
    }

    public final long y() {
        long jD1 = d1();
        if (jD1 == 0) {
            return 0L;
        }
        X9.U u6 = this.f16138C;
        p247y7.AbstractC7350t.c(u6);
        X9.U u10 = u6.f16101g;
        p247y7.AbstractC7350t.c(u10);
        int i6 = u10.f16097c;
        if (i6 < 8192 && u10.f16099e) {
            jD1 -= (long) (i6 - u10.f16096b);
        }
        return jD1;
    }

    public boolean y0(long j6, X9.C1839g c1839g, int i6, int i10) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        if (j6 < 0 || i6 < 0 || i10 < 0 || d1() - j6 < i10 || c1839g.I() - i6 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (r0(((long) i11) + j6) != c1839g.n(i6 + i11)) {
                return false;
            }
        }
        return true;
    }

    public X9.C1836d y1(long j6) {
        X9.U uL1 = l1(8);
        byte[] bArr = uL1.f16095a;
        int i6 = uL1.f16097c;
        bArr[i6] = (byte) ((j6 >>> 56) & 255);
        bArr[i6 + 1] = (byte) ((j6 >>> 48) & 255);
        bArr[i6 + 2] = (byte) ((j6 >>> 40) & 255);
        bArr[i6 + 3] = (byte) ((j6 >>> 32) & 255);
        bArr[i6 + 4] = (byte) ((j6 >>> 24) & 255);
        bArr[i6 + 5] = (byte) ((j6 >>> 16) & 255);
        bArr[i6 + 6] = (byte) ((j6 >>> 8) & 255);
        bArr[i6 + 7] = (byte) (j6 & 255);
        uL1.f16097c = i6 + 8;
        c1(d1() + 8);
        return this;
    }

    public int z0(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "sink");
        X9.AbstractC1834b.b(bArr.length, i6, i10);
        X9.U u6 = this.f16138C;
        if (u6 == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i10, u6.f16097c - u6.f16096b);
        byte[] bArr2 = u6.f16095a;
        int i11 = u6.f16096b;
        p097j7.AbstractC6872n.g(bArr2, bArr, i6, i11, i11 + iMin);
        u6.f16096b += iMin;
        c1(d1() - ((long) iMin));
        if (u6.f16096b == u6.f16097c) {
            this.f16138C = u6.b();
            X9.V.b(u6);
        }
        return iMin;
    }

    @Override // X9.InterfaceC1837e
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public X9.C1836d G(int i6) {
        X9.U uL1 = l1(2);
        byte[] bArr = uL1.f16095a;
        int i10 = uL1.f16097c;
        bArr[i10] = (byte) ((i6 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i6 & 255);
        uL1.f16097c = i10 + 2;
        c1(d1() + 2);
        return this;
    }
}
