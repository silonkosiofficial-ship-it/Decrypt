package p158p8;

/* JADX INFO: loaded from: classes2.dex */
class c extends p158p8.o {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f52761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f52762G;

    private class b implements p8.d.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f52763C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f52764D;

        private b() {
            int iW = p158p8.c.this.W();
            this.f52763C = iW;
            this.f52764D = iW + p158p8.c.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(g());
        }

        @Override // p8.d.a
        public byte g() {
            int i6 = this.f52763C;
            if (i6 >= this.f52764D) {
                throw new java.util.NoSuchElementException();
            }
            byte[] bArr = p158p8.c.this.f52827D;
            this.f52763C = i6 + 1;
            return bArr[i6];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52763C < this.f52764D;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    c(byte[] bArr, int i6, int i10) {
        super(bArr);
        if (i6 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i6);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i10 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i6);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (((long) i6) + ((long) i10) <= bArr.length) {
            this.f52761F = i6;
            this.f52762G = i10;
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i6);
        sb3.append("+");
        sb3.append(i10);
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    @Override // p158p8.o
    protected int W() {
        return this.f52761F;
    }

    @Override // p158p8.o, java.lang.Iterable
    /* JADX INFO: renamed from: Y */
    public p8.d.a iterator() {
        return new p8.c.b();
    }

    @Override // p158p8.o, p158p8.d
    public int size() {
        return this.f52762G;
    }

    @Override // p158p8.o, p158p8.d
    protected void w(byte[] bArr, int i6, int i10, int i11) {
        java.lang.System.arraycopy(this.f52827D, W() + i6, bArr, i10, i11);
    }
}
