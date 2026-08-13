package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6875q extends p097j7.AbstractC6874p {

    /* JADX INFO: renamed from: j7.q$a */
    public static final class a extends p097j7.AbstractC6862d implements java.util.RandomAccess {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int[] f49315D;

        a(int[] iArr) {
            this.f49315D = iArr;
        }

        public int C(int i6) {
            return p097j7.AbstractC6876s.y0(this.f49315D, i6);
        }

        @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return g(((java.lang.Number) obj).intValue());
            }
            return false;
        }

        @Override // p097j7.AbstractC6860b
        public int e() {
            return this.f49315D.length;
        }

        public boolean g(int i6) {
            return p097j7.AbstractC6872n.R(this.f49315D, i6);
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return s(((java.lang.Number) obj).intValue());
            }
            return -1;
        }

        @Override // p097j7.AbstractC6860b, java.util.Collection
        public boolean isEmpty() {
            return this.f49315D.length == 0;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return C(((java.lang.Number) obj).intValue());
            }
            return -1;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public java.lang.Integer get(int i6) {
            return java.lang.Integer.valueOf(this.f49315D[i6]);
        }

        public int s(int i6) {
            return p097j7.AbstractC6876s.j0(this.f49315D, i6);
        }
    }

    public static /* synthetic */ void A(long[] jArr, long j6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = jArr.length;
        }
        v(jArr, j6, i6, i10);
    }

    public static /* synthetic */ void B(java.lang.Object[] objArr, java.lang.Object obj, int i6, int i10, int i11, java.lang.Object obj2) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = objArr.length;
        }
        p097j7.AbstractC6872n.w(objArr, obj, i6, i10);
    }

    public static /* synthetic */ void C(boolean[] zArr, boolean z6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = zArr.length;
        }
        x(zArr, z6, i6, i10);
    }

    public static byte[] D(byte[] bArr, byte[] bArr2) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p247y7.AbstractC7350t.f(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, length + length2);
        java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        p247y7.AbstractC7350t.c(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] E(int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i6;
        p247y7.AbstractC7350t.c(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] F(int[] iArr, int[] iArr2) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        p247y7.AbstractC7350t.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + length2);
        java.lang.System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        p247y7.AbstractC7350t.c(iArrCopyOf);
        return iArrCopyOf;
    }

    public static java.lang.Object[] G(java.lang.Object[] objArr, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        int length = objArr.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        p247y7.AbstractC7350t.c(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void H(int[] iArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        java.util.Arrays.sort(iArr, i6, i10);
    }

    public static void I(java.lang.Comparable[] comparableArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(comparableArr, "<this>");
        java.util.Arrays.sort(comparableArr, i6, i10);
    }

    public static void J(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr);
        }
    }

    public static void K(java.lang.Object[] objArr, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static void L(java.lang.Object[] objArr, java.util.Comparator comparator, int i6, int i10) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        java.util.Arrays.sort(objArr, i6, i10, comparator);
    }

    public static java.util.List c(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return new p097j7.AbstractC6875q.a(iArr);
    }

    public static java.util.List d(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        java.util.List listA = p097j7.AbstractC6877t.a(objArr);
        p247y7.AbstractC7350t.e(listA, "asList(...)");
        return listA;
    }

    public static final int e(float[] fArr, float f6, int i6, int i10) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        return java.util.Arrays.binarySearch(fArr, i6, i10, f6);
    }

    public static /* synthetic */ int f(float[] fArr, float f6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = fArr.length;
        }
        return e(fArr, f6, i6, i10);
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p247y7.AbstractC7350t.f(bArr2, "destination");
        java.lang.System.arraycopy(bArr, i10, bArr2, i6, i11 - i10);
        return bArr2;
    }

    public static char[] h(char[] cArr, char[] cArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        p247y7.AbstractC7350t.f(cArr2, "destination");
        java.lang.System.arraycopy(cArr, i10, cArr2, i6, i11 - i10);
        return cArr2;
    }

    public static float[] i(float[] fArr, float[] fArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        p247y7.AbstractC7350t.f(fArr2, "destination");
        java.lang.System.arraycopy(fArr, i10, fArr2, i6, i11 - i10);
        return fArr2;
    }

    public static int[] j(int[] iArr, int[] iArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        p247y7.AbstractC7350t.f(iArr2, "destination");
        java.lang.System.arraycopy(iArr, i10, iArr2, i6, i11 - i10);
        return iArr2;
    }

    public static long[] k(long[] jArr, long[] jArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        p247y7.AbstractC7350t.f(jArr2, "destination");
        java.lang.System.arraycopy(jArr, i10, jArr2, i6, i11 - i10);
        return jArr2;
    }

    public static java.lang.Object[] l(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(objArr2, "destination");
        java.lang.System.arraycopy(objArr, i10, objArr2, i6, i11 - i10);
        return objArr2;
    }

    public static /* synthetic */ byte[] m(byte[] bArr, byte[] bArr2, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i6 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return p097j7.AbstractC6872n.g(bArr, bArr2, i6, i10, i11);
    }

    public static /* synthetic */ float[] n(float[] fArr, float[] fArr2, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i6 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = fArr.length;
        }
        return p097j7.AbstractC6872n.i(fArr, fArr2, i6, i10, i11);
    }

    public static /* synthetic */ int[] o(int[] iArr, int[] iArr2, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i6 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        return p097j7.AbstractC6872n.j(iArr, iArr2, i6, i10, i11);
    }

    public static /* synthetic */ java.lang.Object[] p(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i6 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return p097j7.AbstractC6872n.l(objArr, objArr2, i6, i10, i11);
    }

    public static byte[] q(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p097j7.AbstractC6873o.b(i10, bArr.length);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i6, i10);
        p247y7.AbstractC7350t.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static java.lang.Object[] r(java.lang.Object[] objArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p097j7.AbstractC6873o.b(i10, objArr.length);
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, i6, i10);
        p247y7.AbstractC7350t.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void s(char[] cArr, char c6, int i6, int i10) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        java.util.Arrays.fill(cArr, i6, i10, c6);
    }

    public static final void t(float[] fArr, float f6, int i6, int i10) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        java.util.Arrays.fill(fArr, i6, i10, f6);
    }

    public static final void u(int[] iArr, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        java.util.Arrays.fill(iArr, i10, i11, i6);
    }

    public static final void v(long[] jArr, long j6, int i6, int i10) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        java.util.Arrays.fill(jArr, i6, i10, j6);
    }

    public static void w(java.lang.Object[] objArr, java.lang.Object obj, int i6, int i10) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        java.util.Arrays.fill(objArr, i6, i10, obj);
    }

    public static final void x(boolean[] zArr, boolean z6, int i6, int i10) {
        p247y7.AbstractC7350t.f(zArr, "<this>");
        java.util.Arrays.fill(zArr, i6, i10, z6);
    }

    public static /* synthetic */ void y(float[] fArr, float f6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = fArr.length;
        }
        t(fArr, f6, i6, i10);
    }

    public static /* synthetic */ void z(int[] iArr, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length;
        }
        u(iArr, i6, i10, i11);
    }
}
