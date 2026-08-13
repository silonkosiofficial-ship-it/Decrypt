package p126m5;

/* JADX INFO: loaded from: classes3.dex */
class g implements java.io.Closeable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.util.logging.Logger f51145I = java.util.logging.Logger.getLogger(p126m5.g.class.getName());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.io.RandomAccessFile f51146C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f51147D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f51148E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private m5.g.b f51149F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private m5.g.b f51150G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final byte[] f51151H = new byte[16];

    class a implements m5.g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f51152a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.StringBuilder f51153b;

        a(java.lang.StringBuilder sb) {
            this.f51153b = sb;
        }

        @Override // m5.g.d
        public void a(java.io.InputStream inputStream, int i6) {
            if (this.f51152a) {
                this.f51152a = false;
            } else {
                this.f51153b.append(", ");
            }
            this.f51153b.append(i6);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final m5.g.b f51155c = new m5.g.b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f51156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51157b;

        b(int i6, int i10) {
            this.f51156a = i6;
            this.f51157b = i10;
        }

        public java.lang.String toString() {
            return getClass().getSimpleName() + "[position = " + this.f51156a + ", length = " + this.f51157b + "]";
        }
    }

    private final class c extends java.io.InputStream {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f51158C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f51159D;

        private c(m5.g.b bVar) {
            this.f51158C = p126m5.g.this.z0(bVar.f51156a + 4);
            this.f51159D = bVar.f51157b;
        }

        /* synthetic */ c(p126m5.g gVar, m5.g.b bVar, m5.g.a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.f51159D == 0) {
                return -1;
            }
            p126m5.g.this.f51146C.seek(this.f51158C);
            int i6 = p126m5.g.this.f51146C.read();
            this.f51158C = p126m5.g.this.z0(this.f51158C + 1);
            this.f51159D--;
            return i6;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) throws java.io.IOException {
            p126m5.g.R(bArr, "buffer");
            if ((i6 | i10) < 0 || i10 > bArr.length - i6) {
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }
            int i11 = this.f51159D;
            if (i11 <= 0) {
                return -1;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            p126m5.g.this.s0(this.f51158C, bArr, i6, i10);
            this.f51158C = p126m5.g.this.z0(this.f51158C + i10);
            this.f51159D -= i10;
            return i10;
        }
    }

    public interface d {
        void a(java.io.InputStream inputStream, int i6);
    }

    public g(java.io.File file) throws java.io.IOException {
        if (!file.exists()) {
            H(file);
        }
        this.f51146C = e0(file);
        n0();
    }

    private void E0(int i6, int i10, int i11, int i12) throws java.io.IOException {
        K0(this.f51151H, i6, i10, i11, i12);
        this.f51146C.seek(0L);
        this.f51146C.write(this.f51151H);
    }

    private static void H(java.io.File file) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file.getPath() + ".tmp");
        java.io.RandomAccessFile randomAccessFileE0 = e0(file2);
        try {
            randomAccessFileE0.setLength(4096L);
            randomAccessFileE0.seek(0L);
            byte[] bArr = new byte[16];
            K0(bArr, 4096, 0, 0, 0);
            randomAccessFileE0.write(bArr);
            randomAccessFileE0.close();
            if (!file2.renameTo(file)) {
                throw new java.io.IOException("Rename failed!");
            }
        } catch (java.lang.Throwable th) {
            randomAccessFileE0.close();
            throw th;
        }
    }

    private static void H0(byte[] bArr, int i6, int i10) {
        bArr[i6] = (byte) (i10 >> 24);
        bArr[i6 + 1] = (byte) (i10 >> 16);
        bArr[i6 + 2] = (byte) (i10 >> 8);
        bArr[i6 + 3] = (byte) i10;
    }

    private static void K0(byte[] bArr, int... iArr) {
        int i6 = 0;
        for (int i10 : iArr) {
            H0(bArr, i6, i10);
            i6 += 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object R(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    private static java.io.RandomAccessFile e0(java.io.File file) {
        return new java.io.RandomAccessFile(file, "rwd");
    }

    private m5.g.b g0(int i6) throws java.io.IOException {
        if (i6 == 0) {
            return m5.g.b.f51155c;
        }
        this.f51146C.seek(i6);
        return new m5.g.b(i6, this.f51146C.readInt());
    }

    private void n0() throws java.io.IOException {
        this.f51146C.seek(0L);
        this.f51146C.readFully(this.f51151H);
        int iO0 = o0(this.f51151H, 0);
        this.f51147D = iO0;
        if (iO0 <= this.f51146C.length()) {
            this.f51148E = o0(this.f51151H, 4);
            int iO1 = o0(this.f51151H, 8);
            int iO2 = o0(this.f51151H, 12);
            this.f51149F = g0(iO1);
            this.f51150G = g0(iO2);
            return;
        }
        throw new java.io.IOException("File is truncated. Expected length: " + this.f51147D + ", Actual length: " + this.f51146C.length());
    }

    private static int o0(byte[] bArr, int i6) {
        return ((bArr[i6] & 255) << 24) + ((bArr[i6 + 1] & 255) << 16) + ((bArr[i6 + 2] & 255) << 8) + (bArr[i6 + 3] & 255);
    }

    private int q0() {
        return this.f51147D - y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i6, byte[] bArr, int i10, int i11) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile;
        int iZ0 = z0(i6);
        int i12 = iZ0 + i11;
        int i13 = this.f51147D;
        if (i12 <= i13) {
            this.f51146C.seek(iZ0);
            randomAccessFile = this.f51146C;
        } else {
            int i14 = i13 - iZ0;
            this.f51146C.seek(iZ0);
            this.f51146C.readFully(bArr, i10, i14);
            this.f51146C.seek(16L);
            randomAccessFile = this.f51146C;
            i10 += i14;
            i11 -= i14;
        }
        randomAccessFile.readFully(bArr, i10, i11);
    }

    private void u0(int i6, byte[] bArr, int i10, int i11) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile;
        int iZ0 = z0(i6);
        int i12 = iZ0 + i11;
        int i13 = this.f51147D;
        if (i12 <= i13) {
            this.f51146C.seek(iZ0);
            randomAccessFile = this.f51146C;
        } else {
            int i14 = i13 - iZ0;
            this.f51146C.seek(iZ0);
            this.f51146C.write(bArr, i10, i14);
            this.f51146C.seek(16L);
            randomAccessFile = this.f51146C;
            i10 += i14;
            i11 -= i14;
        }
        randomAccessFile.write(bArr, i10, i11);
    }

    private void x0(int i6) throws java.io.IOException {
        this.f51146C.setLength(i6);
        this.f51146C.getChannel().force(true);
    }

    private void y(int i6) throws java.io.IOException {
        int i10 = i6 + 4;
        int iQ0 = q0();
        if (iQ0 >= i10) {
            return;
        }
        int i11 = this.f51147D;
        do {
            iQ0 += i11;
            i11 <<= 1;
        } while (iQ0 < i10);
        x0(i11);
        m5.g.b bVar = this.f51150G;
        int iZ0 = z0(bVar.f51156a + 4 + bVar.f51157b);
        if (iZ0 < this.f51149F.f51156a) {
            java.nio.channels.FileChannel channel = this.f51146C.getChannel();
            channel.position(this.f51147D);
            long j6 = iZ0 - 4;
            if (channel.transferTo(16L, j6, channel) != j6) {
                throw new java.lang.AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f51150G.f51156a;
        int i13 = this.f51149F.f51156a;
        if (i12 < i13) {
            int i14 = (this.f51147D + i12) - 16;
            E0(i11, this.f51148E, i13, i14);
            this.f51150G = new m5.g.b(i14, this.f51150G.f51157b);
        } else {
            E0(i11, this.f51148E, i13, i12);
        }
        this.f51147D = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z0(int i6) {
        int i10 = this.f51147D;
        return i6 < i10 ? i6 : (i6 + 16) - i10;
    }

    public synchronized void D(m5.g.d dVar) {
        int iZ0 = this.f51149F.f51156a;
        for (int i6 = 0; i6 < this.f51148E; i6++) {
            m5.g.b bVarG0 = g0(iZ0);
            dVar.a(new m5.g.c(this, bVarG0, null), bVarG0.f51157b);
            iZ0 = z0(bVarG0.f51156a + 4 + bVarG0.f51157b);
        }
    }

    public synchronized boolean N() {
        return this.f51148E == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f51146C.close();
    }

    public void o(byte[] bArr) {
        r(bArr, 0, bArr.length);
    }

    public synchronized void r(byte[] bArr, int i6, int i10) {
        int iZ0;
        try {
            R(bArr, "buffer");
            if ((i6 | i10) < 0 || i10 > bArr.length - i6) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            y(i10);
            boolean zN = N();
            if (zN) {
                iZ0 = 16;
            } else {
                m5.g.b bVar = this.f51150G;
                iZ0 = z0(bVar.f51156a + 4 + bVar.f51157b);
            }
            m5.g.b bVar2 = new m5.g.b(iZ0, i10);
            H0(this.f51151H, 0, i10);
            u0(bVar2.f51156a, this.f51151H, 0, 4);
            u0(bVar2.f51156a + 4, bArr, i6, i10);
            E0(this.f51147D, this.f51148E + 1, zN ? bVar2.f51156a : this.f51149F.f51156a, bVar2.f51156a);
            this.f51150G = bVar2;
            this.f51148E++;
            if (zN) {
                this.f51149F = bVar2;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized void r0() {
        try {
            if (N()) {
                throw new java.util.NoSuchElementException();
            }
            if (this.f51148E == 1) {
                s();
            } else {
                m5.g.b bVar = this.f51149F;
                int iZ0 = z0(bVar.f51156a + 4 + bVar.f51157b);
                s0(iZ0, this.f51151H, 0, 4);
                int iO0 = o0(this.f51151H, 0);
                E0(this.f51147D, this.f51148E - 1, iZ0, this.f51150G.f51156a);
                this.f51148E--;
                this.f51149F = new m5.g.b(iZ0, iO0);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized void s() {
        try {
            E0(4096, 0, 0, 0);
            this.f51148E = 0;
            m5.g.b bVar = m5.g.b.f51155c;
            this.f51149F = bVar;
            this.f51150G = bVar;
            if (this.f51147D > 4096) {
                x0(4096);
            }
            this.f51147D = 4096;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f51147D);
        sb.append(", size=");
        sb.append(this.f51148E);
        sb.append(", first=");
        sb.append(this.f51149F);
        sb.append(", last=");
        sb.append(this.f51150G);
        sb.append(", element lengths=[");
        try {
            D(new m5.g.a(sb));
        } catch (java.io.IOException e6) {
            f51145I.log(java.util.logging.Level.WARNING, "read error", (java.lang.Throwable) e6);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int y0() {
        if (this.f51148E == 0) {
            return 16;
        }
        m5.g.b bVar = this.f51150G;
        int i6 = bVar.f51156a;
        int i10 = this.f51149F.f51156a;
        return i6 >= i10 ? (i6 - i10) + 4 + bVar.f51157b + 16 : (((i6 + 4) + bVar.f51157b) + this.f51147D) - i10;
    }
}
