package N4;

/* JADX INFO: renamed from: N4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1416p implements java.util.Map, java.io.Serializable, j$.util.Map {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final java.util.Map.Entry[] f7765F = new java.util.Map.Entry[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient N4.r f7766C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient N4.r f7767D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient N4.AbstractC1414n f7768E;

    /* JADX INFO: renamed from: N4.p$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.util.Comparator f7769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.Object[] f7770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7771c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7772d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        N4.AbstractC1416p.a.C0187a f7773e;

        /* JADX INFO: renamed from: N4.p$a$a, reason: collision with other inner class name */
        static final class C0187a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.Object f7774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.lang.Object f7775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final java.lang.Object f7776c;

            C0187a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                this.f7774a = obj;
                this.f7775b = obj2;
                this.f7776c = obj3;
            }

            java.lang.IllegalArgumentException a() {
                java.lang.String strValueOf = java.lang.String.valueOf(this.f7774a);
                java.lang.String strValueOf2 = java.lang.String.valueOf(this.f7775b);
                java.lang.String strValueOf3 = java.lang.String.valueOf(this.f7774a);
                java.lang.String strValueOf4 = java.lang.String.valueOf(this.f7776c);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        a(int i6) {
            this.f7770b = new java.lang.Object[i6 * 2];
        }

        private N4.AbstractC1416p a(boolean z6) {
            java.lang.Object[] objArrD;
            N4.AbstractC1416p.a.C0187a c0187a;
            N4.AbstractC1416p.a.C0187a c0187a2;
            if (z6 && (c0187a2 = this.f7773e) != null) {
                throw c0187a2.a();
            }
            int length = this.f7771c;
            if (this.f7769a == null) {
                objArrD = this.f7770b;
            } else {
                if (this.f7772d) {
                    this.f7770b = java.util.Arrays.copyOf(this.f7770b, length * 2);
                }
                objArrD = this.f7770b;
                if (!z6) {
                    objArrD = d(objArrD, this.f7771c);
                    if (objArrD.length < this.f7770b.length) {
                        length = objArrD.length >>> 1;
                    }
                }
                f(objArrD, length, this.f7769a);
            }
            this.f7772d = true;
            N4.J jH = N4.J.h(length, objArrD, this);
            if (!z6 || (c0187a = this.f7773e) == null) {
                return jH;
            }
            throw c0187a.a();
        }

        private void c(int i6) {
            int i10 = i6 * 2;
            java.lang.Object[] objArr = this.f7770b;
            if (i10 > objArr.length) {
                this.f7770b = java.util.Arrays.copyOf(objArr, N4.AbstractC1414n.b.a(objArr.length, i10));
                this.f7772d = false;
            }
        }

        private java.lang.Object[] d(java.lang.Object[] objArr, int i6) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.BitSet bitSet = new java.util.BitSet();
            for (int i10 = i6 - 1; i10 >= 0; i10--) {
                java.lang.Object obj = objArr[i10 * 2];
                j$.util.Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i10);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[(i6 - bitSet.cardinality()) * 2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i6 * 2) {
                if (bitSet.get(i11 >>> 1)) {
                    i11 += 2;
                } else {
                    int i13 = i12 + 1;
                    int i14 = i11 + 1;
                    java.lang.Object obj2 = objArr[i11];
                    j$.util.Objects.requireNonNull(obj2);
                    objArr2[i12] = obj2;
                    i12 += 2;
                    i11 += 2;
                    java.lang.Object obj3 = objArr[i14];
                    j$.util.Objects.requireNonNull(obj3);
                    objArr2[i13] = obj3;
                }
            }
            return objArr2;
        }

        static void f(java.lang.Object[] objArr, int i6, java.util.Comparator comparator) {
            java.util.Map.Entry[] entryArr = new java.util.Map.Entry[i6];
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = i10 * 2;
                java.lang.Object obj = objArr[i11];
                j$.util.Objects.requireNonNull(obj);
                java.lang.Object obj2 = objArr[i11 + 1];
                j$.util.Objects.requireNonNull(obj2);
                entryArr[i10] = new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            java.util.Arrays.sort(entryArr, 0, i6, N4.G.a(comparator).e(N4.z.d()));
            for (int i12 = 0; i12 < i6; i12++) {
                int i13 = i12 * 2;
                objArr[i13] = entryArr[i12].getKey();
                objArr[i13 + 1] = entryArr[i12].getValue();
            }
        }

        public N4.AbstractC1416p b() {
            return a(true);
        }

        public N4.AbstractC1416p.a e(java.lang.Object obj, java.lang.Object obj2) {
            c(this.f7771c + 1);
            N4.AbstractC1407g.a(obj, obj2);
            java.lang.Object[] objArr = this.f7770b;
            int i6 = this.f7771c;
            objArr[i6 * 2] = obj;
            objArr[(i6 * 2) + 1] = obj2;
            this.f7771c = i6 + 1;
            return this;
        }
    }

    AbstractC1416p() {
    }

    public static N4.AbstractC1416p f() {
        return N4.J.f7689J;
    }

    abstract N4.r a();

    abstract N4.r b();

    abstract N4.AbstractC1414n c();

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public N4.r entrySet() {
        N4.r rVar = this.f7766C;
        if (rVar != null) {
            return rVar;
        }
        N4.r rVarA = a();
        this.f7766C = rVarA;
        return rVarA;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public N4.r keySet() {
        N4.r rVar = this.f7767D;
        if (rVar != null) {
            return rVar;
        }
        N4.r rVarB = b();
        this.f7767D = rVarB;
        return rVarB;
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return N4.z.a(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1414n values() {
        N4.AbstractC1414n abstractC1414n = this.f7768E;
        if (abstractC1414n != null) {
            return abstractC1414n;
        }
        N4.AbstractC1414n abstractC1414nC = c();
        this.f7768E = abstractC1414nC;
        return abstractC1414nC;
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return N4.M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public java.lang.String toString() {
        return N4.z.c(this);
    }
}
