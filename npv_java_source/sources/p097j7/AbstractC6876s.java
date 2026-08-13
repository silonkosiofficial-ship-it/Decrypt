package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6876s extends p097j7.AbstractC6875q {

    /* JADX INFO: renamed from: j7.s$a */
    public static final class a implements java.lang.Iterable, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f49317C;

        public a(java.lang.Object[] objArr) {
            this.f49317C = objArr;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return p247y7.AbstractC7334c.a(this.f49317C);
        }
    }

    /* JADX INFO: renamed from: j7.s$b */
    public static final class b implements R8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f49318a;

        public b(java.lang.Object[] objArr) {
            this.f49318a = objArr;
        }

        @Override // R8.h
        public java.util.Iterator iterator() {
            return p247y7.AbstractC7334c.a(this.f49318a);
        }
    }

    public static java.lang.Object A0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static java.util.List B0(java.lang.Object[] objArr, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(lVar, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(lVar.l(obj));
        }
        return arrayList;
    }

    public static java.lang.Integer C0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i6 = iArr[0];
        int iC0 = p097j7.AbstractC6872n.c0(iArr);
        int i10 = 1;
        if (1 <= iC0) {
            while (true) {
                int i11 = iArr[i10];
                if (i6 < i11) {
                    i6 = i11;
                }
                if (i10 == iC0) {
                    break;
                }
                i10++;
            }
        }
        return java.lang.Integer.valueOf(i6);
    }

    public static java.lang.Integer D0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i6 = iArr[0];
        int iC0 = p097j7.AbstractC6872n.c0(iArr);
        int i10 = 1;
        if (1 <= iC0) {
            while (true) {
                int i11 = iArr[i10];
                if (i6 > i11) {
                    i6 = i11;
                }
                if (i10 == iC0) {
                    break;
                }
                i10++;
            }
        }
        return java.lang.Integer.valueOf(i6);
    }

    public static char E0(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static java.lang.Object F0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static java.lang.Object G0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final java.lang.Object[] H0(java.lang.Object[] objArr, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        p097j7.AbstractC6872n.K(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static java.util.List I0(java.lang.Object[] objArr, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        return p097j7.AbstractC6872n.d(H0(objArr, comparator));
    }

    public static final java.util.List J0(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
        }
        if (i6 == 0) {
            return p097j7.AbstractC6879v.m();
        }
        int length = objArr.length;
        if (i6 >= length) {
            return p097j7.AbstractC6872n.R0(objArr);
        }
        if (i6 == 1) {
            return p097j7.AbstractC6879v.e(objArr[length - 1]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6);
        for (int i10 = length - i6; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
        }
        return arrayList;
    }

    public static final java.util.Collection K0(java.lang.Object[] objArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(collection, "destination");
        for (java.lang.Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static java.util.List L0(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? U0(bArr) : p097j7.AbstractC6879v.e(java.lang.Byte.valueOf(bArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static java.util.List M0(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? V0(cArr) : p097j7.AbstractC6879v.e(java.lang.Character.valueOf(cArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static java.lang.Iterable N(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return objArr.length == 0 ? p097j7.AbstractC6879v.m() : new p097j7.AbstractC6876s.a(objArr);
    }

    public static java.util.List N0(double[] dArr) {
        p247y7.AbstractC7350t.f(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? W0(dArr) : p097j7.AbstractC6879v.e(java.lang.Double.valueOf(dArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static R8.h O(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return objArr.length == 0 ? R8.k.i() : new p097j7.AbstractC6876s.b(objArr);
    }

    public static java.util.List O0(float[] fArr) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? X0(fArr) : p097j7.AbstractC6879v.e(java.lang.Float.valueOf(fArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean P(byte[] bArr, byte b6) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return h0(bArr, b6) >= 0;
    }

    public static java.util.List P0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? Y0(iArr) : p097j7.AbstractC6879v.e(java.lang.Integer.valueOf(iArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean Q(char[] cArr, char c6) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        return i0(cArr, c6) >= 0;
    }

    public static java.util.List Q0(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? Z0(jArr) : p097j7.AbstractC6879v.e(java.lang.Long.valueOf(jArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean R(int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return j0(iArr, i6) >= 0;
    }

    public static java.util.List R0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? p097j7.AbstractC6872n.a1(objArr) : p097j7.AbstractC6879v.e(objArr[0]);
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean S(long[] jArr, long j6) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        return k0(jArr, j6) >= 0;
    }

    public static java.util.List S0(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? b1(sArr) : p097j7.AbstractC6879v.e(java.lang.Short.valueOf(sArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean T(java.lang.Object[] objArr, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return p097j7.AbstractC6872n.l0(objArr, obj) >= 0;
    }

    public static java.util.List T0(boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? c1(zArr) : p097j7.AbstractC6879v.e(java.lang.Boolean.valueOf(zArr[0]));
        }
        return p097j7.AbstractC6879v.m();
    }

    public static boolean U(short[] sArr, short s6) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        return m0(sArr, s6) >= 0;
    }

    public static final java.util.List U0(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte b6 : bArr) {
            arrayList.add(java.lang.Byte.valueOf(b6));
        }
        return arrayList;
    }

    public static java.util.List V(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (i6 >= 0) {
            return J0(objArr, E7.j.d(objArr.length - i6, 0));
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i6 + " is less than zero.").toString());
    }

    public static final java.util.List V0(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(cArr.length);
        for (char c6 : cArr) {
            arrayList.add(java.lang.Character.valueOf(c6));
        }
        return arrayList;
    }

    public static java.util.List W(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return (java.util.List) X(objArr, new java.util.ArrayList());
    }

    public static final java.util.List W0(double[] dArr) {
        p247y7.AbstractC7350t.f(dArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(dArr.length);
        for (double d6 : dArr) {
            arrayList.add(java.lang.Double.valueOf(d6));
        }
        return arrayList;
    }

    public static final java.util.Collection X(java.lang.Object[] objArr, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(collection, "destination");
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final java.util.List X0(float[] fArr) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(java.lang.Float.valueOf(f6));
        }
        return arrayList;
    }

    public static java.lang.Object Y(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static final java.util.List Y0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i6 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i6));
        }
        return arrayList;
    }

    public static java.lang.Object Z(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final java.util.List Z0(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        for (long j6 : jArr) {
            arrayList.add(java.lang.Long.valueOf(j6));
        }
        return arrayList;
    }

    public static E7.i a0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return new E7.i(0, p097j7.AbstractC6872n.c0(iArr));
    }

    public static java.util.List a1(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return new java.util.ArrayList(p097j7.AbstractC6881x.h(objArr));
    }

    public static E7.i b0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return new E7.i(0, p097j7.AbstractC6872n.e0(objArr));
    }

    public static final java.util.List b1(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(sArr.length);
        for (short s6 : sArr) {
            arrayList.add(java.lang.Short.valueOf(s6));
        }
        return arrayList;
    }

    public static int c0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final java.util.List c1(boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(zArr.length);
        for (boolean z6 : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z6));
        }
        return arrayList;
    }

    public static int d0(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static java.util.Set d1(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (java.util.Set) K0(objArr, new java.util.LinkedHashSet(p097j7.S.d(objArr.length))) : p097j7.Z.c(objArr[0]);
        }
        return p097j7.Z.d();
    }

    public static int e0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static java.lang.Iterable e1(final java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        return new p097j7.M(new p237x7.a() { // from class: j7.r
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p097j7.AbstractC6876s.f1(objArr);
            }
        });
    }

    public static java.lang.Integer f0(int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        if (i6 < 0 || i6 >= iArr.length) {
            return null;
        }
        return java.lang.Integer.valueOf(iArr[i6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Iterator f1(java.lang.Object[] objArr) {
        return p247y7.AbstractC7334c.a(objArr);
    }

    public static java.lang.Object g0(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (i6 < 0 || i6 >= objArr.length) {
            return null;
        }
        return objArr[i6];
    }

    public static java.util.List g1(java.lang.Object[] objArr, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(iterable, "other");
        int length = objArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(p097j7.AbstractC6879v.x(iterable, 10), length));
        int i6 = 0;
        for (java.lang.Object obj : iterable) {
            if (i6 >= length) {
                break;
            }
            arrayList.add(p087i7.B.a(objArr[i6], obj));
            i6++;
        }
        return arrayList;
    }

    public static final int h0(byte[] bArr, byte b6) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (b6 == bArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    public static java.util.List h1(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(objArr2, "other");
        int iMin = java.lang.Math.min(objArr.length, objArr2.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(iMin);
        for (int i6 = 0; i6 < iMin; i6++) {
            arrayList.add(p087i7.B.a(objArr[i6], objArr2[i6]));
        }
        return arrayList;
    }

    public static final int i0(char[] cArr, char c6) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        int length = cArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (c6 == cArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    public static final int j0(int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i6 == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int k0(long[] jArr, long j6) {
        p247y7.AbstractC7350t.f(jArr, "<this>");
        int length = jArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (j6 == jArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    public static int l0(java.lang.Object[] objArr, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        int i6 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i6 < length) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i6 < length2) {
            if (p247y7.AbstractC7350t.b(obj, objArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final int m0(short[] sArr, short s6) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        int length = sArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (s6 == sArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    public static final java.lang.Appendable n0(byte[] bArr, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p247y7.AbstractC7350t.f(appendable, "buffer");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i10 = 0;
        for (byte b6 : bArr) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            appendable.append(lVar != null ? (java.lang.CharSequence) lVar.l(java.lang.Byte.valueOf(b6)) : java.lang.String.valueOf((int) b6));
        }
        if (i6 >= 0 && i10 > i6) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final java.lang.Appendable o0(char[] cArr, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        p247y7.AbstractC7350t.f(appendable, "buffer");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i10 = 0;
        for (char c6 : cArr) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            if (lVar != null) {
                appendable.append((java.lang.CharSequence) lVar.l(java.lang.Character.valueOf(c6)));
            } else {
                appendable.append(c6);
            }
        }
        if (i6 >= 0 && i10 > i6) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final java.lang.Appendable p0(java.lang.Object[] objArr, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(appendable, "buffer");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i10 = 0;
        for (java.lang.Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            S8.r.b(appendable, obj, lVar);
        }
        if (i6 >= 0 && i10 > i6) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final java.lang.String r0(byte[] bArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        return ((java.lang.StringBuilder) n0(bArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static final java.lang.String s0(char[] cArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        return ((java.lang.StringBuilder) o0(cArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static final java.lang.String t0(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        return ((java.lang.StringBuilder) p0(objArr, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i6, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ java.lang.String u0(byte[] bArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return r0(bArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ java.lang.String v0(char[] cArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return s0(cArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ java.lang.String w0(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return t0(objArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static java.lang.Object x0(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[p097j7.AbstractC6872n.e0(objArr)];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static final int y0(int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (i6 == iArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    public static int z0(java.lang.Object[] objArr, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i6 >= 0) {
                        length = i6;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (p247y7.AbstractC7350t.b(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }
}
