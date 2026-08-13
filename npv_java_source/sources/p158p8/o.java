package p158p8;

/* JADX INFO: loaded from: classes2.dex */
class o extends p158p8.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final byte[] f52827D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f52828E = 0;

    private class b implements p8.d.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f52829C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f52830D;

        private b() {
            this.f52829C = 0;
            this.f52830D = p158p8.o.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(g());
        }

        @Override // p8.d.a
        public byte g() {
            try {
                byte[] bArr = p158p8.o.this.f52827D;
                int i6 = this.f52829C;
                this.f52829C = i6 + 1;
                return bArr[i6];
            } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
                throw new java.util.NoSuchElementException(e6.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52829C < this.f52830D;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    o(byte[] bArr) {
        this.f52827D = bArr;
    }

    static int X(int i6, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }

    @Override // p158p8.d
    protected int C() {
        return 0;
    }

    @Override // p158p8.d
    protected boolean D() {
        return true;
    }

    @Override // p158p8.d
    public boolean E() {
        int iW = W();
        return p158p8.x.f(this.f52827D, iW, size() + iW);
    }

    @Override // p158p8.d
    protected int N(int i6, int i10, int i11) {
        return X(i6, this.f52827D, W() + i10, i11);
    }

    @Override // p158p8.d
    protected int O(int i6, int i10, int i11) {
        int iW = W() + i10;
        return p158p8.x.g(i6, this.f52827D, iW, i11 + iW);
    }

    @Override // p158p8.d
    protected int P() {
        return this.f52828E;
    }

    @Override // p158p8.d
    public java.lang.String R(java.lang.String str) {
        return new java.lang.String(this.f52827D, W(), size(), str);
    }

    @Override // p158p8.d
    void U(java.io.OutputStream outputStream, int i6, int i10) throws java.io.IOException {
        outputStream.write(this.f52827D, W() + i6, i10);
    }

    boolean V(p158p8.o oVar, int i6, int i10) {
        if (i10 > oVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i10);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i6 + i10 > oVar.size()) {
            int size2 = oVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i6);
            sb2.append(", ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f52827D;
        byte[] bArr2 = oVar.f52827D;
        int iW = W() + i10;
        int iW2 = W();
        int iW3 = oVar.W() + i6;
        while (iW2 < iW) {
            if (bArr[iW2] != bArr2[iW3]) {
                return false;
            }
            iW2++;
            iW3++;
        }
        return true;
    }

    protected int W() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public p8.d.a iterator() {
        return new p8.o.b();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p158p8.d) || size() != ((p158p8.d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p158p8.o) {
            return V((p158p8.o) obj, 0, size());
        }
        if (obj instanceof p158p8.t) {
            return obj.equals(this);
        }
        java.lang.String strValueOf = java.lang.String.valueOf(obj.getClass());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int iN = this.f52828E;
        if (iN == 0) {
            int size = size();
            iN = N(size, 0, size);
            if (iN == 0) {
                iN = 1;
            }
            this.f52828E = iN;
        }
        return iN;
    }

    @Override // p158p8.d
    public int size() {
        return this.f52827D.length;
    }

    @Override // p158p8.d
    protected void w(byte[] bArr, int i6, int i10, int i11) {
        java.lang.System.arraycopy(this.f52827D, i6, bArr, i10, i11);
    }
}
