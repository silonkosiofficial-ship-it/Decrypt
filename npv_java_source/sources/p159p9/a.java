package p159p9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final p159p9.a.C0684a f52904E = new p159p9.a.C0684a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final p159p9.a f52905F = new p159p9.a(new byte[0], null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final char[] f52906G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final byte[] f52907C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f52908D;

    /* JADX INFO: renamed from: p9.a$a, reason: collision with other inner class name */
    public static final class C0684a {
        private C0684a() {
        }

        public /* synthetic */ C0684a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p159p9.a a(byte[] bArr) {
            p247y7.AbstractC7350t.f(bArr, "byteArray");
            p247y7.AbstractC7342k abstractC7342k = null;
            return new p159p9.a(bArr, abstractC7342k, abstractC7342k);
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        p247y7.AbstractC7350t.e(charArray, "toCharArray(...)");
        f52906G = charArray;
    }

    private a(byte[] bArr, java.lang.Object obj) {
        this.f52907C = bArr;
    }

    public /* synthetic */ a(byte[] bArr, java.lang.Object obj, p247y7.AbstractC7342k abstractC7342k) {
        this(bArr, obj);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p159p9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "other");
        if (aVar == this) {
            return 0;
        }
        byte[] bArr = this.f52907C;
        byte[] bArr2 = aVar.f52907C;
        int iMin = java.lang.Math.min(i(), aVar.i());
        for (int i6 = 0; i6 < iMin; i6++) {
            int iG = p247y7.AbstractC7350t.g(p087i7.C.g(bArr[i6]) & 255, p087i7.C.g(bArr2[i6]) & 255);
            if (iG != 0) {
                return iG;
            }
        }
        return p247y7.AbstractC7350t.g(i(), aVar.i());
    }

    public boolean equals(java.lang.Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj == null || p159p9.a.class != obj.getClass()) {
            return false;
        }
        p159p9.a aVar = (p159p9.a) obj;
        byte[] bArr = aVar.f52907C;
        int length = bArr.length;
        byte[] bArr2 = this.f52907C;
        if (length != bArr2.length) {
            return false;
        }
        int i10 = aVar.f52908D;
        if (i10 == 0 || (i6 = this.f52908D) == 0 || i10 == i6) {
            return java.util.Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final byte[] g() {
        return this.f52907C;
    }

    public int hashCode() {
        int i6 = this.f52908D;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = java.util.Arrays.hashCode(this.f52907C);
        this.f52908D = iHashCode;
        return iHashCode;
    }

    public final int i() {
        return this.f52907C.length;
    }

    public java.lang.String toString() {
        if (p159p9.c.a(this)) {
            return "ByteString(size=0)";
        }
        java.lang.String strValueOf = java.lang.String.valueOf(i());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 22 + (i() * 2));
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        byte[] bArr = this.f52907C;
        int i6 = i();
        for (int i10 = 0; i10 < i6; i10++) {
            byte b6 = bArr[i10];
            char[] cArr = f52906G;
            sb.append(cArr[(b6 >>> 4) & 15]);
            sb.append(cArr[b6 & 15]);
        }
        sb.append(')');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
