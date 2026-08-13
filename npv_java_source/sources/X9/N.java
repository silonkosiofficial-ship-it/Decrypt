package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends p097j7.AbstractC6862d implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final X9.N.a f16078F = new X9.N.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.C1839g[] f16079D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int[] f16080E;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final void a(long j6, X9.C1836d c1836d, int i6, java.util.List list, int i10, int i11, java.util.List list2) {
            int i12;
            int i13;
            int i14;
            int i15 = i6;
            if (i10 >= i11) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i16 = i10; i16 < i11; i16++) {
                if (((X9.C1839g) list.get(i16)).I() < i15) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
            }
            X9.C1839g c1839g = (X9.C1839g) list.get(i10);
            X9.C1839g c1839g2 = (X9.C1839g) list.get(i11 - 1);
            int i17 = -1;
            if (i15 == c1839g.I()) {
                int iIntValue = ((java.lang.Number) list2.get(i10)).intValue();
                int i18 = i10 + 1;
                X9.C1839g c1839g3 = (X9.C1839g) list.get(i18);
                i12 = i18;
                i13 = iIntValue;
                c1839g = c1839g3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (c1839g.n(i15) == c1839g2.n(i15)) {
                int iMin = java.lang.Math.min(c1839g.I(), c1839g2.I());
                int i19 = 0;
                for (int i20 = i15; i20 < iMin && c1839g.n(i20) == c1839g2.n(i20); i20++) {
                    i19++;
                }
                long jC = j6 + c(c1836d) + ((long) 2) + ((long) i19) + 1;
                c1836d.L(-i19);
                c1836d.L(i13);
                int i21 = i19 + i15;
                while (i15 < i21) {
                    c1836d.L(c1839g.n(i15) & 255);
                    i15++;
                }
                if (i12 + 1 == i11) {
                    if (i21 != ((X9.C1839g) list.get(i12)).I()) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    c1836d.L(((java.lang.Number) list2.get(i12)).intValue());
                    return;
                } else {
                    X9.C1836d c1836d2 = new X9.C1836d();
                    c1836d.L(((int) (c(c1836d2) + jC)) * (-1));
                    a(jC, c1836d2, i21, list, i12, i11, list2);
                    c1836d.c0(c1836d2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i12 + 1; i23 < i11; i23++) {
                if (((X9.C1839g) list.get(i23 - 1)).n(i15) != ((X9.C1839g) list.get(i23)).n(i15)) {
                    i22++;
                }
            }
            long jC2 = j6 + c(c1836d) + ((long) 2) + ((long) (i22 * 2));
            c1836d.L(i22);
            c1836d.L(i13);
            for (int i24 = i12; i24 < i11; i24++) {
                byte bN = ((X9.C1839g) list.get(i24)).n(i15);
                if (i24 == i12 || bN != ((X9.C1839g) list.get(i24 - 1)).n(i15)) {
                    c1836d.L(bN & 255);
                }
            }
            X9.C1836d c1836d3 = new X9.C1836d();
            while (i12 < i11) {
                byte bN2 = ((X9.C1839g) list.get(i12)).n(i15);
                int i25 = i12 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i11) {
                        i14 = i11;
                        break;
                    } else {
                        if (bN2 != ((X9.C1839g) list.get(i26)).n(i15)) {
                            i14 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i14 && i15 + 1 == ((X9.C1839g) list.get(i12)).I()) {
                    c1836d.L(((java.lang.Number) list2.get(i12)).intValue());
                } else {
                    c1836d.L(((int) (jC2 + c(c1836d3))) * i17);
                    a(jC2, c1836d3, i15 + 1, list, i12, i14, list2);
                }
                c1836d3 = c1836d3;
                i12 = i14;
                i17 = -1;
            }
            c1836d.c0(c1836d3);
        }

        static /* synthetic */ void b(X9.N.a aVar, long j6, X9.C1836d c1836d, int i6, java.util.List list, int i10, int i11, java.util.List list2, int i12, java.lang.Object obj) {
            aVar.a((i12 & 1) != 0 ? 0L : j6, c1836d, (i12 & 4) != 0 ? 0 : i6, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        private final long c(X9.C1836d c1836d) {
            return c1836d.d1() / ((long) 4);
        }

        public final X9.N d(X9.C1839g... c1839gArr) {
            p247y7.AbstractC7350t.f(c1839gArr, "byteStrings");
            p247y7.AbstractC7342k abstractC7342k = null;
            if (c1839gArr.length == 0) {
                return new X9.N(new X9.C1839g[0], new int[]{0, -1}, abstractC7342k);
            }
            java.util.List listA1 = p097j7.AbstractC6872n.a1(c1839gArr);
            p097j7.AbstractC6879v.A(listA1);
            int size = listA1.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(-1);
            }
            int length = c1839gArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                arrayList.set(p097j7.AbstractC6879v.l(listA1, c1839gArr[i10], 0, 0, 6, null), java.lang.Integer.valueOf(i11));
                i10++;
                i11++;
            }
            if (((X9.C1839g) listA1.get(0)).I() <= 0) {
                throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i12 = 0;
            while (i12 < listA1.size()) {
                X9.C1839g c1839g = (X9.C1839g) listA1.get(i12);
                int i13 = i12 + 1;
                int i14 = i13;
                while (i14 < listA1.size()) {
                    X9.C1839g c1839g2 = (X9.C1839g) listA1.get(i14);
                    if (!c1839g2.J(c1839g)) {
                        break;
                    }
                    if (c1839g2.I() == c1839g.I()) {
                        throw new java.lang.IllegalArgumentException(("duplicate option: " + c1839g2).toString());
                    }
                    if (((java.lang.Number) arrayList.get(i14)).intValue() > ((java.lang.Number) arrayList.get(i12)).intValue()) {
                        listA1.remove(i14);
                        arrayList.remove(i14);
                    } else {
                        i14++;
                    }
                }
                i12 = i13;
            }
            X9.C1836d c1836d = new X9.C1836d();
            b(this, 0L, c1836d, 0, listA1, 0, 0, arrayList, 53, null);
            int iC = (int) c(c1836d);
            int[] iArr = new int[iC];
            for (int i15 = 0; i15 < iC; i15++) {
                iArr[i15] = c1836d.K();
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(c1839gArr, c1839gArr.length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            return new X9.N((X9.C1839g[]) objArrCopyOf, iArr, abstractC7342k);
        }
    }

    private N(X9.C1839g[] c1839gArr, int[] iArr) {
        this.f16079D = c1839gArr;
        this.f16080E = iArr;
    }

    public /* synthetic */ N(X9.C1839g[] c1839gArr, int[] iArr, p247y7.AbstractC7342k abstractC7342k) {
        this(c1839gArr, iArr);
    }

    public final int[] C() {
        return this.f16080E;
    }

    public /* bridge */ int D(X9.C1839g c1839g) {
        return super.indexOf(c1839g);
    }

    public /* bridge */ int E(X9.C1839g c1839g) {
        return super.lastIndexOf(c1839g);
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof X9.C1839g) {
            return g((X9.C1839g) obj);
        }
        return false;
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f16079D.length;
    }

    public /* bridge */ boolean g(X9.C1839g c1839g) {
        return super.contains(c1839g);
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof X9.C1839g) {
            return D((X9.C1839g) obj);
        }
        return -1;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof X9.C1839g) {
            return E((X9.C1839g) obj);
        }
        return -1;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public X9.C1839g get(int i6) {
        return this.f16079D[i6];
    }

    public final X9.C1839g[] s() {
        return this.f16079D;
    }
}
