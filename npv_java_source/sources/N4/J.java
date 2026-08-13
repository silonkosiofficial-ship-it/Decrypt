package N4;

/* JADX INFO: loaded from: classes3.dex */
final class J extends N4.AbstractC1416p {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final N4.AbstractC1416p f7689J = new N4.J(null, new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient java.lang.Object f7690G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final transient java.lang.Object[] f7691H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int f7692I;

    static class a extends N4.r {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final transient N4.AbstractC1416p f7693E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final transient java.lang.Object[] f7694F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final transient int f7695G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final transient int f7696H;

        /* JADX INFO: renamed from: N4.J$a$a, reason: collision with other inner class name */
        class C0184a extends N4.AbstractC1415o {
            C0184a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public java.util.Map.Entry get(int i6) {
                M4.h.g(i6, N4.J.a.this.f7696H);
                int i10 = i6 * 2;
                java.lang.Object obj = N4.J.a.this.f7694F[N4.J.a.this.f7695G + i10];
                j$.util.Objects.requireNonNull(obj);
                java.lang.Object obj2 = N4.J.a.this.f7694F[i10 + (N4.J.a.this.f7695G ^ 1)];
                j$.util.Objects.requireNonNull(obj2);
                return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // N4.AbstractC1414n
            public boolean n() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return N4.J.a.this.f7696H;
            }
        }

        a(N4.AbstractC1416p abstractC1416p, java.lang.Object[] objArr, int i6, int i10) {
            this.f7693E = abstractC1416p;
            this.f7694F = objArr;
            this.f7695G = i6;
            this.f7696H = i10;
        }

        @Override // N4.r
        N4.AbstractC1415o D() {
            return new N4.J.a.C0184a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public N4.S iterator() {
            return o().iterator();
        }

        @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            return value != null && value.equals(this.f7693E.get(key));
        }

        @Override // N4.AbstractC1414n
        int d(java.lang.Object[] objArr, int i6) {
            return o().d(objArr, i6);
        }

        @Override // N4.AbstractC1414n
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7696H;
        }
    }

    static final class b extends N4.r {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final transient N4.AbstractC1416p f7698E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final transient N4.AbstractC1415o f7699F;

        b(N4.AbstractC1416p abstractC1416p, N4.AbstractC1415o abstractC1415o) {
            this.f7698E = abstractC1416p;
            this.f7699F = abstractC1415o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public N4.S iterator() {
            return o().iterator();
        }

        @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f7698E.get(obj) != null;
        }

        @Override // N4.AbstractC1414n
        int d(java.lang.Object[] objArr, int i6) {
            return o().d(objArr, i6);
        }

        @Override // N4.AbstractC1414n
        boolean n() {
            return true;
        }

        @Override // N4.r
        public N4.AbstractC1415o o() {
            return this.f7699F;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7698E.size();
        }
    }

    static final class c extends N4.AbstractC1415o {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final transient java.lang.Object[] f7700E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final transient int f7701F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final transient int f7702G;

        c(java.lang.Object[] objArr, int i6, int i10) {
            this.f7700E = objArr;
            this.f7701F = i6;
            this.f7702G = i10;
        }

        @Override // java.util.List
        public java.lang.Object get(int i6) {
            M4.h.g(i6, this.f7702G);
            java.lang.Object obj = this.f7700E[(i6 * 2) + this.f7701F];
            j$.util.Objects.requireNonNull(obj);
            return obj;
        }

        @Override // N4.AbstractC1414n
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7702G;
        }
    }

    private J(java.lang.Object obj, java.lang.Object[] objArr, int i6) {
        this.f7690G = obj;
        this.f7691H = objArr;
        this.f7692I = i6;
    }

    static N4.J h(int i6, java.lang.Object[] objArr, N4.AbstractC1416p.a aVar) {
        if (i6 == 0) {
            return (N4.J) f7689J;
        }
        if (i6 == 1) {
            java.lang.Object obj = objArr[0];
            j$.util.Objects.requireNonNull(obj);
            java.lang.Object obj2 = objArr[1];
            j$.util.Objects.requireNonNull(obj2);
            N4.AbstractC1407g.a(obj, obj2);
            return new N4.J(null, objArr, 1);
        }
        M4.h.k(i6, objArr.length >> 1);
        java.lang.Object objJ = j(objArr, i6, N4.r.s(i6), 0);
        if (objJ instanceof java.lang.Object[]) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objJ;
            N4.AbstractC1416p.a.C0187a c0187a = (N4.AbstractC1416p.a.C0187a) objArr2[2];
            if (aVar == null) {
                throw c0187a.a();
            }
            aVar.f7773e = c0187a;
            java.lang.Object obj3 = objArr2[0];
            int iIntValue = ((java.lang.Integer) objArr2[1]).intValue();
            objArr = java.util.Arrays.copyOf(objArr, iIntValue * 2);
            objJ = obj3;
            i6 = iIntValue;
        }
        return new N4.J(objJ, objArr, i6);
    }

    private static java.lang.Object j(java.lang.Object[] objArr, int i6, int i10, int i11) {
        N4.AbstractC1416p.a.C0187a c0187a = null;
        if (i6 == 1) {
            java.lang.Object obj = objArr[i11];
            j$.util.Objects.requireNonNull(obj);
            java.lang.Object obj2 = objArr[i11 ^ 1];
            j$.util.Objects.requireNonNull(obj2);
            N4.AbstractC1407g.a(obj, obj2);
            return null;
        }
        int i12 = i10 - 1;
        int i13 = -1;
        if (i10 <= 128) {
            byte[] bArr = new byte[i10];
            java.util.Arrays.fill(bArr, (byte) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i6; i15++) {
                int i16 = (i15 * 2) + i11;
                int i17 = (i14 * 2) + i11;
                java.lang.Object obj3 = objArr[i16];
                j$.util.Objects.requireNonNull(obj3);
                java.lang.Object obj4 = objArr[i16 ^ 1];
                j$.util.Objects.requireNonNull(obj4);
                N4.AbstractC1407g.a(obj3, obj4);
                int iB = N4.AbstractC1413m.b(obj3.hashCode());
                while (true) {
                    int i18 = iB & i12;
                    int i19 = bArr[i18] & 255;
                    if (i19 == 255) {
                        bArr[i18] = (byte) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj3;
                            objArr[i17 ^ 1] = obj4;
                        }
                        i14++;
                        break;
                    }
                    if (obj3.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        java.lang.Object obj5 = objArr[i20];
                        j$.util.Objects.requireNonNull(obj5);
                        c0187a = new N4.AbstractC1416p.a.C0187a(obj3, obj4, obj5);
                        objArr[i20] = obj4;
                        break;
                    }
                    iB = i18 + 1;
                }
            }
            return i14 == i6 ? bArr : new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i14), c0187a};
        }
        if (i10 <= 32768) {
            short[] sArr = new short[i10];
            java.util.Arrays.fill(sArr, (short) -1);
            int i21 = 0;
            for (int i22 = 0; i22 < i6; i22++) {
                int i23 = (i22 * 2) + i11;
                int i24 = (i21 * 2) + i11;
                java.lang.Object obj6 = objArr[i23];
                j$.util.Objects.requireNonNull(obj6);
                java.lang.Object obj7 = objArr[i23 ^ 1];
                j$.util.Objects.requireNonNull(obj7);
                N4.AbstractC1407g.a(obj6, obj7);
                int iB2 = N4.AbstractC1413m.b(obj6.hashCode());
                while (true) {
                    int i25 = iB2 & i12;
                    int i26 = sArr[i25] & 65535;
                    if (i26 == 65535) {
                        sArr[i25] = (short) i24;
                        if (i21 < i22) {
                            objArr[i24] = obj6;
                            objArr[i24 ^ 1] = obj7;
                        }
                        i21++;
                        break;
                    }
                    if (obj6.equals(objArr[i26])) {
                        int i27 = i26 ^ 1;
                        java.lang.Object obj8 = objArr[i27];
                        j$.util.Objects.requireNonNull(obj8);
                        c0187a = new N4.AbstractC1416p.a.C0187a(obj6, obj7, obj8);
                        objArr[i27] = obj7;
                        break;
                    }
                    iB2 = i25 + 1;
                }
            }
            return i21 == i6 ? sArr : new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i21), c0187a};
        }
        int[] iArr = new int[i10];
        java.util.Arrays.fill(iArr, -1);
        int i28 = 0;
        int i29 = 0;
        while (i28 < i6) {
            int i30 = (i28 * 2) + i11;
            int i31 = (i29 * 2) + i11;
            java.lang.Object obj9 = objArr[i30];
            j$.util.Objects.requireNonNull(obj9);
            java.lang.Object obj10 = objArr[i30 ^ 1];
            j$.util.Objects.requireNonNull(obj10);
            N4.AbstractC1407g.a(obj9, obj10);
            int iB3 = N4.AbstractC1413m.b(obj9.hashCode());
            while (true) {
                int i32 = iB3 & i12;
                int i33 = iArr[i32];
                if (i33 == i13) {
                    iArr[i32] = i31;
                    if (i29 < i28) {
                        objArr[i31] = obj9;
                        objArr[i31 ^ 1] = obj10;
                    }
                    i29++;
                    break;
                }
                if (obj9.equals(objArr[i33])) {
                    int i34 = i33 ^ 1;
                    java.lang.Object obj11 = objArr[i34];
                    j$.util.Objects.requireNonNull(obj11);
                    c0187a = new N4.AbstractC1416p.a.C0187a(obj9, obj10, obj11);
                    objArr[i34] = obj10;
                    break;
                }
                iB3 = i32 + 1;
                i13 = -1;
            }
            i28++;
            i13 = -1;
        }
        return i29 == i6 ? iArr : new java.lang.Object[]{iArr, java.lang.Integer.valueOf(i29), c0187a};
    }

    static java.lang.Object k(java.lang.Object obj, java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i6 == 1) {
            java.lang.Object obj3 = objArr[i10];
            j$.util.Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            java.lang.Object obj4 = objArr[i10 ^ 1];
            j$.util.Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = N4.AbstractC1413m.b(obj2.hashCode());
            while (true) {
                int i11 = iB & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iB = i11 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = N4.AbstractC1413m.b(obj2.hashCode());
            while (true) {
                int i13 = iB2 & length2;
                int i14 = sArr[i13] & 65535;
                if (i14 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iB2 = i13 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = N4.AbstractC1413m.b(obj2.hashCode());
            while (true) {
                int i15 = iB3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iB3 = i15 + 1;
            }
        }
    }

    @Override // N4.AbstractC1416p
    N4.r a() {
        return new N4.J.a(this, this.f7691H, 0, this.f7692I);
    }

    @Override // N4.AbstractC1416p
    N4.r b() {
        return new N4.J.b(this, new N4.J.c(this.f7691H, 0, this.f7692I));
    }

    @Override // N4.AbstractC1416p
    N4.AbstractC1414n c() {
        return new N4.J.c(this.f7691H, 1, this.f7692I);
    }

    @Override // N4.AbstractC1416p, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Object objK = k(this.f7690G, this.f7691H, this.f7692I, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public int size() {
        return this.f7692I;
    }
}
