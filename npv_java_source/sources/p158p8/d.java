package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p158p8.d f52766C = new p158p8.o(new byte[0]);

    public interface a extends java.util.Iterator {
        byte g();
    }

    public static final class b extends java.io.OutputStream {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private static final byte[] f52767H = new byte[0];

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f52768C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.util.ArrayList f52769D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f52770E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private byte[] f52771F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f52772G;

        b(int i6) {
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.f52768C = i6;
            this.f52769D = new java.util.ArrayList();
            this.f52771F = new byte[i6];
        }

        private byte[] a(byte[] bArr, int i6) {
            byte[] bArr2 = new byte[i6];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i6));
            return bArr2;
        }

        private void f(int i6) {
            this.f52769D.add(new p158p8.o(this.f52771F));
            int length = this.f52770E + this.f52771F.length;
            this.f52770E = length;
            this.f52771F = new byte[java.lang.Math.max(this.f52768C, java.lang.Math.max(i6, length >>> 1))];
            this.f52772G = 0;
        }

        private void g() {
            int i6 = this.f52772G;
            byte[] bArr = this.f52771F;
            if (i6 >= bArr.length) {
                this.f52769D.add(new p158p8.o(this.f52771F));
                this.f52771F = f52767H;
            } else if (i6 > 0) {
                this.f52769D.add(new p158p8.o(a(bArr, i6)));
            }
            this.f52770E += this.f52772G;
            this.f52772G = 0;
        }

        public synchronized int i() {
            return this.f52770E + this.f52772G;
        }

        public synchronized p158p8.d o() {
            g();
            return p158p8.d.f(this.f52769D);
        }

        public java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(i()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i6) {
            try {
                if (this.f52772G == this.f52771F.length) {
                    f(1);
                }
                byte[] bArr = this.f52771F;
                int i10 = this.f52772G;
                this.f52772G = i10 + 1;
                bArr[i10] = (byte) i6;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i6, int i10) {
            try {
                byte[] bArr2 = this.f52771F;
                int length = bArr2.length;
                int i11 = this.f52772G;
                if (i10 <= length - i11) {
                    java.lang.System.arraycopy(bArr, i6, bArr2, i11, i10);
                    this.f52772G += i10;
                } else {
                    int length2 = bArr2.length - i11;
                    java.lang.System.arraycopy(bArr, i6, bArr2, i11, length2);
                    int i12 = i10 - length2;
                    f(i12);
                    java.lang.System.arraycopy(bArr, i6 + length2, this.f52771F, 0, i12);
                    this.f52772G = i12;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    d() {
    }

    public static p8.d.b M() {
        return new p8.d.b(128);
    }

    private static p158p8.d d(java.util.Iterator it, int i6) {
        if (i6 == 1) {
            return (p158p8.d) it.next();
        }
        int i10 = i6 >>> 1;
        return d(it, i10).e(d(it, i6 - i10));
    }

    public static p158p8.d f(java.lang.Iterable iterable) {
        java.util.Collection arrayList;
        if (iterable instanceof java.util.Collection) {
            arrayList = (java.util.Collection) iterable;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((p158p8.d) it.next());
            }
        }
        return arrayList.isEmpty() ? f52766C : d(arrayList.iterator(), arrayList.size());
    }

    public static p158p8.d g(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static p158p8.d n(byte[] bArr, int i6, int i10) {
        byte[] bArr2 = new byte[i10];
        java.lang.System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new p158p8.o(bArr2);
    }

    public static p158p8.d o(java.lang.String str) {
        try {
            return new p158p8.o(str.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    protected abstract int C();

    protected abstract boolean D();

    public abstract boolean E();

    protected abstract int N(int i6, int i10, int i11);

    protected abstract int O(int i6, int i10, int i11);

    protected abstract int P();

    public byte[] Q() {
        int size = size();
        if (size == 0) {
            return p158p8.j.f52821a;
        }
        byte[] bArr = new byte[size];
        w(bArr, 0, 0, size);
        return bArr;
    }

    public abstract java.lang.String R(java.lang.String str);

    public java.lang.String S() {
        try {
            return R("UTF-8");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    void T(java.io.OutputStream outputStream, int i6, int i10) {
        if (i6 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i6);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i10 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i10);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        int i11 = i6 + i10;
        if (i11 <= size()) {
            if (i10 > 0) {
                U(outputStream, i6, i10);
            }
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i11);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
    }

    abstract void U(java.io.OutputStream outputStream, int i6, int i10);

    public p158p8.d e(p158p8.d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return p158p8.t.Y(this, dVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void s(byte[] bArr, int i6, int i10, int i11) {
        if (i6 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i6);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i10 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i10);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i6 + i11;
        if (i12 > size()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i12);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= bArr.length) {
            if (i11 > 0) {
                w(bArr, i6, i10, i11);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i13);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract int size();

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    protected abstract void w(byte[] bArr, int i6, int i10, int i11);
}
