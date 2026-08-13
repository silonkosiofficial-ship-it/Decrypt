package X9;

/* JADX INFO: renamed from: X9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1839g implements java.io.Serializable, java.lang.Comparable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final X9.C1839g.a f16149F = new X9.C1839g.a(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final X9.C1839g f16150G = new X9.C1839g(new byte[0]);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final byte[] f16151C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient int f16152D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient java.lang.String f16153E;

    /* JADX INFO: renamed from: X9.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ X9.C1839g e(X9.C1839g.a aVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = X9.AbstractC1834b.c();
            }
            return aVar.d(bArr, i6, i10);
        }

        public final X9.C1839g a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new java.lang.IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i10 = i6 * 2;
                bArr[i6] = (byte) ((Y9.b.e(str.charAt(i10)) << 4) + Y9.b.e(str.charAt(i10 + 1)));
            }
            return new X9.C1839g(bArr);
        }

        public final X9.C1839g b(java.lang.String str, java.nio.charset.Charset charset) {
            p247y7.AbstractC7350t.f(str, "<this>");
            p247y7.AbstractC7350t.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
            return new X9.C1839g(bytes);
        }

        public final X9.C1839g c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<this>");
            X9.C1839g c1839g = new X9.C1839g(X9.d0.a(str));
            c1839g.F(str);
            return c1839g;
        }

        public final X9.C1839g d(byte[] bArr, int i6, int i10) {
            p247y7.AbstractC7350t.f(bArr, "<this>");
            int iF = X9.AbstractC1834b.f(bArr, i10);
            X9.AbstractC1834b.b(bArr.length, i6, iF);
            return new X9.C1839g(p097j7.AbstractC6872n.q(bArr, i6, iF + i6));
        }
    }

    public C1839g(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "data");
        this.f16151C = bArr;
    }

    public static /* synthetic */ int B(X9.C1839g c1839g, X9.C1839g c1839g2, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i10 & 2) != 0) {
            i6 = X9.AbstractC1834b.c();
        }
        return c1839g.z(c1839g2, i6);
    }

    public static /* synthetic */ X9.C1839g L(X9.C1839g c1839g, int i6, int i10, int i11, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = X9.AbstractC1834b.c();
        }
        return c1839g.K(i6, i10);
    }

    public static /* synthetic */ int w(X9.C1839g c1839g, X9.C1839g c1839g2, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        return c1839g.u(c1839g2, i6);
    }

    public int A(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "other");
        for (int iMin = java.lang.Math.min(X9.AbstractC1834b.e(this, i6), o().length - bArr.length); -1 < iMin; iMin--) {
            if (X9.AbstractC1834b.a(o(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean C(int i6, X9.C1839g c1839g, int i10, int i11) {
        p247y7.AbstractC7350t.f(c1839g, "other");
        return c1839g.D(i10, o(), i6, i11);
    }

    public boolean D(int i6, byte[] bArr, int i10, int i11) {
        p247y7.AbstractC7350t.f(bArr, "other");
        return i6 >= 0 && i6 <= o().length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && X9.AbstractC1834b.a(o(), i6, bArr, i10, i11);
    }

    public final void E(int i6) {
        this.f16152D = i6;
    }

    public final void F(java.lang.String str) {
        this.f16153E = str;
    }

    public final X9.C1839g G() {
        return i("SHA-1");
    }

    public final X9.C1839g H() {
        return i("SHA-256");
    }

    public final int I() {
        return r();
    }

    public final boolean J(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "prefix");
        return C(0, c1839g, 0, c1839g.I());
    }

    public X9.C1839g K(int i6, int i10) {
        int iE = X9.AbstractC1834b.e(this, i10);
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iE <= o().length) {
            if (iE - i6 >= 0) {
                return (i6 == 0 && iE == o().length) ? this : new X9.C1839g(p097j7.AbstractC6872n.q(o(), i6, iE));
            }
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new java.lang.IllegalArgumentException(("endIndex > length(" + o().length + ')').toString());
    }

    public X9.C1839g M() {
        for (int i6 = 0; i6 < o().length; i6++) {
            byte b6 = o()[i6];
            if (b6 >= 65 && b6 <= 90) {
                byte[] bArrO = o();
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrO, bArrO.length);
                p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i6] = (byte) (b6 + 32);
                for (int i10 = i6 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new X9.C1839g(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] N() {
        byte[] bArrO = o();
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArrO, bArrO.length);
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public java.lang.String O() {
        java.lang.String strS = s();
        if (strS != null) {
            return strS;
        }
        java.lang.String strC = X9.d0.c(x());
        F(strC);
        return strC;
    }

    public void P(X9.C1836d c1836d, int i6, int i10) {
        p247y7.AbstractC7350t.f(c1836d, "buffer");
        Y9.b.d(this, c1836d, i6, i10);
    }

    public java.lang.String e() {
        return X9.AbstractC1833a.b(o(), null, 1, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X9.C1839g) {
            X9.C1839g c1839g = (X9.C1839g) obj;
            if (c1839g.I() == o().length && c1839g.D(0, o(), 0, o().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(X9.C1839g r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p247y7.AbstractC7350t.f(r10, r0)
            int r0 = r9.I()
            int r1 = r10.I()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.n(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.n(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X9.C1839g.compareTo(X9.g):int");
    }

    public int hashCode() {
        int iQ = q();
        if (iQ != 0) {
            return iQ;
        }
        int iHashCode = java.util.Arrays.hashCode(o());
        E(iHashCode);
        return iHashCode;
    }

    public X9.C1839g i(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        p247y7.AbstractC7350t.f(str, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        messageDigest.update(this.f16151C, 0, I());
        byte[] bArrDigest = messageDigest.digest();
        p247y7.AbstractC7350t.c(bArrDigest);
        return new X9.C1839g(bArrDigest);
    }

    public final boolean m(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "suffix");
        return C(I() - c1839g.I(), c1839g, 0, c1839g.I());
    }

    public final byte n(int i6) {
        return y(i6);
    }

    public final byte[] o() {
        return this.f16151C;
    }

    public final int q() {
        return this.f16152D;
    }

    public int r() {
        return o().length;
    }

    public final java.lang.String s() {
        return this.f16153E;
    }

    public java.lang.String t() {
        char[] cArr = new char[o().length * 2];
        int i6 = 0;
        for (byte b6 : o()) {
            int i10 = i6 + 1;
            cArr[i6] = Y9.b.f()[(b6 >> 4) & 15];
            i6 += 2;
            cArr[i10] = Y9.b.f()[b6 & 15];
        }
        return S8.r.z(cArr);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (o().length != 0) {
            int iC = Y9.b.c(o(), 64);
            if (iC != -1) {
                java.lang.String strO = O();
                java.lang.String strSubstring = strO.substring(0, iC);
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                java.lang.String strR = S8.r.R(S8.r.R(S8.r.R(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC < strO.length()) {
                    sb = new java.lang.StringBuilder();
                    sb.append("[size=");
                    sb.append(o().length);
                    sb.append(" text=");
                    sb.append(strR);
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append("[text=");
                    sb.append(strR);
                    sb.append(']');
                }
                return sb.toString();
            }
            if (o().length <= 64) {
                str = "[hex=" + t() + ']';
            } else {
                sb = new java.lang.StringBuilder();
                sb.append("[size=");
                sb.append(o().length);
                sb.append(" hex=");
                int iE = X9.AbstractC1834b.e(this, 64);
                if (iE > o().length) {
                    throw new java.lang.IllegalArgumentException(("endIndex > length(" + o().length + ')').toString());
                }
                if (iE < 0) {
                    throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
                }
                sb.append((iE == o().length ? this : new X9.C1839g(p097j7.AbstractC6872n.q(o(), 0, iE))).t());
            }
            sb.append("…]");
            return sb.toString();
        }
        str = "[size=0]";
        return str;
    }

    public final int u(X9.C1839g c1839g, int i6) {
        p247y7.AbstractC7350t.f(c1839g, "other");
        return v(c1839g.x(), i6);
    }

    public int v(byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(bArr, "other");
        int length = o().length - bArr.length;
        int iMax = java.lang.Math.max(i6, 0);
        if (iMax <= length) {
            while (!X9.AbstractC1834b.a(o(), iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte[] x() {
        return o();
    }

    public byte y(int i6) {
        return o()[i6];
    }

    public final int z(X9.C1839g c1839g, int i6) {
        p247y7.AbstractC7350t.f(c1839g, "other");
        return A(c1839g.x(), i6);
    }
}
