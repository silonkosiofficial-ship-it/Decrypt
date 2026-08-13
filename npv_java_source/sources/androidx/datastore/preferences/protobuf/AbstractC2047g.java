package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2047g implements java.lang.Iterable, java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.AbstractC2047g f21988D = new androidx.datastore.preferences.protobuf.AbstractC2047g.i(androidx.datastore.preferences.protobuf.AbstractC2064y.f22237d);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.AbstractC2047g.f f21989E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.util.Comparator f21990F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f21991C = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends androidx.datastore.preferences.protobuf.AbstractC2047g.c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f21992C = 0;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f21993D;

        a() {
            this.f21993D = androidx.datastore.preferences.protobuf.AbstractC2047g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.InterfaceC0419g
        public byte g() {
            int i6 = this.f21992C;
            if (i6 >= this.f21993D) {
                throw new java.util.NoSuchElementException();
            }
            this.f21992C = i6 + 1;
            return androidx.datastore.preferences.protobuf.AbstractC2047g.this.C(i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21992C < this.f21993D;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    class b implements java.util.Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g2) {
            androidx.datastore.preferences.protobuf.AbstractC2047g.InterfaceC0419g it = abstractC2047g.iterator();
            androidx.datastore.preferences.protobuf.AbstractC2047g.InterfaceC0419g it2 = abstractC2047g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.AbstractC2047g.Q(it.g())).compareTo(java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.AbstractC2047g.Q(it2.g())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return java.lang.Integer.valueOf(abstractC2047g.size()).compareTo(java.lang.Integer.valueOf(abstractC2047g2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements androidx.datastore.preferences.protobuf.AbstractC2047g.InterfaceC0419g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final java.lang.Byte next() {
            return java.lang.Byte.valueOf(g());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements androidx.datastore.preferences.protobuf.AbstractC2047g.f {
        private d() {
        }

        /* synthetic */ d(androidx.datastore.preferences.protobuf.AbstractC2047g.a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.f
        public byte[] a(byte[] bArr, int i6, int i10) {
            return java.util.Arrays.copyOfRange(bArr, i6, i10 + i6);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends androidx.datastore.preferences.protobuf.AbstractC2047g.i {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final int f21995H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final int f21996I;

        e(byte[] bArr, int i6, int i10) {
            super(bArr);
            androidx.datastore.preferences.protobuf.AbstractC2047g.g(i6, i6 + i10, bArr.length);
            this.f21995H = i6;
            this.f21996I = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.i, androidx.datastore.preferences.protobuf.AbstractC2047g
        byte C(int i6) {
            return this.f21997G[this.f21995H + i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.i
        protected int Z() {
            return this.f21995H;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.i, androidx.datastore.preferences.protobuf.AbstractC2047g
        public byte e(int i6) {
            androidx.datastore.preferences.protobuf.AbstractC2047g.f(i6, size());
            return this.f21997G[this.f21995H + i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.i, androidx.datastore.preferences.protobuf.AbstractC2047g
        public int size() {
            return this.f21996I;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.i, androidx.datastore.preferences.protobuf.AbstractC2047g
        protected void w(byte[] bArr, int i6, int i10, int i11) {
            java.lang.System.arraycopy(this.f21997G, Z() + i6, bArr, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i6, int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0419g extends java.util.Iterator {
        byte g();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends androidx.datastore.preferences.protobuf.AbstractC2047g {
        h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends androidx.datastore.preferences.protobuf.AbstractC2047g.h {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        protected final byte[] f21997G;

        i(byte[] bArr) {
            bArr.getClass();
            this.f21997G = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        byte C(int i6) {
            return this.f21997G[i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        public final boolean D() {
            int iZ = Z();
            return androidx.datastore.preferences.protobuf.q0.n(this.f21997G, iZ, size() + iZ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        protected final int M(int i6, int i10, int i11) {
            return androidx.datastore.preferences.protobuf.AbstractC2064y.h(i6, this.f21997G, Z() + i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        public final androidx.datastore.preferences.protobuf.AbstractC2047g O(int i6, int i10) {
            int iG = androidx.datastore.preferences.protobuf.AbstractC2047g.g(i6, i10, size());
            return iG == 0 ? androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D : new androidx.datastore.preferences.protobuf.AbstractC2047g.e(this.f21997G, Z() + i6, iG);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        protected final java.lang.String S(java.nio.charset.Charset charset) {
            return new java.lang.String(this.f21997G, Z(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        final void X(androidx.datastore.preferences.protobuf.AbstractC2046f abstractC2046f) {
            abstractC2046f.a(this.f21997G, Z(), size());
        }

        final boolean Y(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g, int i6, int i10) {
            if (i10 > abstractC2047g.size()) {
                throw new java.lang.IllegalArgumentException("Length too large: " + i10 + size());
            }
            int i11 = i6 + i10;
            if (i11 > abstractC2047g.size()) {
                throw new java.lang.IllegalArgumentException("Ran off end of other: " + i6 + ", " + i10 + ", " + abstractC2047g.size());
            }
            if (!(abstractC2047g instanceof androidx.datastore.preferences.protobuf.AbstractC2047g.i)) {
                return abstractC2047g.O(i6, i11).equals(O(0, i10));
            }
            androidx.datastore.preferences.protobuf.AbstractC2047g.i iVar = (androidx.datastore.preferences.protobuf.AbstractC2047g.i) abstractC2047g;
            byte[] bArr = this.f21997G;
            byte[] bArr2 = iVar.f21997G;
            int iZ = Z() + i10;
            int iZ2 = Z();
            int iZ3 = iVar.Z() + i6;
            while (iZ2 < iZ) {
                if (bArr[iZ2] != bArr2[iZ3]) {
                    return false;
                }
                iZ2++;
                iZ3++;
            }
            return true;
        }

        protected int Z() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        public byte e(int i6) {
            return this.f21997G[i6];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) || size() != ((androidx.datastore.preferences.protobuf.AbstractC2047g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g.i)) {
                return obj.equals(this);
            }
            androidx.datastore.preferences.protobuf.AbstractC2047g.i iVar = (androidx.datastore.preferences.protobuf.AbstractC2047g.i) obj;
            int iN = N();
            int iN2 = iVar.N();
            if (iN == 0 || iN2 == 0 || iN == iN2) {
                return Y(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        public int size() {
            return this.f21997G.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g
        protected void w(byte[] bArr, int i6, int i10, int i11) {
            java.lang.System.arraycopy(this.f21997G, i6, bArr, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements androidx.datastore.preferences.protobuf.AbstractC2047g.f {
        private j() {
        }

        /* synthetic */ j(androidx.datastore.preferences.protobuf.AbstractC2047g.a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2047g.f
        public byte[] a(byte[] bArr, int i6, int i10) {
            byte[] bArr2 = new byte[i10];
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i10);
            return bArr2;
        }
    }

    static {
        androidx.datastore.preferences.protobuf.AbstractC2047g.a aVar = null;
        f21989E = androidx.datastore.preferences.protobuf.AbstractC2044d.c() ? new androidx.datastore.preferences.protobuf.AbstractC2047g.j(aVar) : new androidx.datastore.preferences.protobuf.AbstractC2047g.d(aVar);
        f21990F = new androidx.datastore.preferences.protobuf.AbstractC2047g.b();
    }

    AbstractC2047g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Q(byte b6) {
        return b6 & 255;
    }

    private java.lang.String U() {
        if (size() <= 50) {
            return androidx.datastore.preferences.protobuf.j0.a(this);
        }
        return androidx.datastore.preferences.protobuf.j0.a(O(0, 47)) + "...";
    }

    static androidx.datastore.preferences.protobuf.AbstractC2047g V(byte[] bArr) {
        return new androidx.datastore.preferences.protobuf.AbstractC2047g.i(bArr);
    }

    static androidx.datastore.preferences.protobuf.AbstractC2047g W(byte[] bArr, int i6, int i10) {
        return new androidx.datastore.preferences.protobuf.AbstractC2047g.e(bArr, i6, i10);
    }

    static void f(int i6, int i10) {
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i6);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + i10);
        }
    }

    static int g(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i6 < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i6 + " < 0");
        }
        if (i10 < i6) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i6 + ", " + i10);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + i10 + " >= " + i11);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2047g n(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2047g o(byte[] bArr, int i6, int i10) {
        g(i6, i6 + i10, bArr.length);
        return new androidx.datastore.preferences.protobuf.AbstractC2047g.i(f21989E.a(bArr, i6, i10));
    }

    public static androidx.datastore.preferences.protobuf.AbstractC2047g s(java.lang.String str) {
        return new androidx.datastore.preferences.protobuf.AbstractC2047g.i(str.getBytes(androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b));
    }

    abstract byte C(int i6);

    public abstract boolean D();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.preferences.protobuf.AbstractC2047g.InterfaceC0419g iterator() {
        return new androidx.datastore.preferences.protobuf.AbstractC2047g.a();
    }

    protected abstract int M(int i6, int i10, int i11);

    protected final int N() {
        return this.f21991C;
    }

    public abstract androidx.datastore.preferences.protobuf.AbstractC2047g O(int i6, int i10);

    public final byte[] P() {
        int size = size();
        if (size == 0) {
            return androidx.datastore.preferences.protobuf.AbstractC2064y.f22237d;
        }
        byte[] bArr = new byte[size];
        w(bArr, 0, 0, size);
        return bArr;
    }

    public final java.lang.String R(java.nio.charset.Charset charset) {
        return size() == 0 ? "" : S(charset);
    }

    protected abstract java.lang.String S(java.nio.charset.Charset charset);

    public final java.lang.String T() {
        return R(androidx.datastore.preferences.protobuf.AbstractC2064y.f22235b);
    }

    abstract void X(androidx.datastore.preferences.protobuf.AbstractC2046f abstractC2046f);

    public abstract byte e(int i6);

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int iM = this.f21991C;
        if (iM == 0) {
            int size = size();
            iM = M(size, 0, size);
            if (iM == 0) {
                iM = 1;
            }
            this.f21991C = iM;
        }
        return iM;
    }

    public abstract int size();

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()), U());
    }

    protected abstract void w(byte[] bArr, int i6, int i10, int i11);
}
