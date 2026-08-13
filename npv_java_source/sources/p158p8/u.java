package p158p8;

/* JADX INFO: loaded from: classes2.dex */
abstract class u extends java.util.AbstractMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f52846C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.List f52847D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.Map f52848E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f52849F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile p8.u.e f52850G;

    static class a extends p158p8.u {
        a(int i6) {
            super(i6, null);
        }

        @Override // p158p8.u
        public void o() {
            if (!m()) {
                for (int i6 = 0; i6 < j(); i6++) {
                    java.util.Map.Entry entryH = h(i6);
                    if (((p8.h.b) entryH.getKey()).h()) {
                        entryH.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) entryH.getValue()));
                    }
                }
                for (java.util.Map.Entry entry : k()) {
                    if (((p8.h.b) entry.getKey()).h()) {
                        entry.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) entry.getValue()));
                    }
                }
            }
            super.o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
            return super.q((p8.h.b) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.util.Iterator f52851a = new p8.u.b.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final java.lang.Iterable f52852b = new p8.u.b.C0682b();

        static class a implements java.util.Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: p8.u$b$b, reason: collision with other inner class name */
        static class C0682b implements java.lang.Iterable {
            C0682b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator iterator() {
                return p8.u.b.f52851a;
            }
        }

        static java.lang.Iterable b() {
            return f52852b;
        }
    }

    private class c implements java.lang.Comparable, java.util.Map.Entry {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Comparable f52853C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.Object f52854D;

        c(java.lang.Comparable comparable, java.lang.Object obj) {
            this.f52853C = comparable;
            this.f52854D = obj;
        }

        c(p158p8.u uVar, java.util.Map.Entry entry) {
            this((java.lang.Comparable) entry.getKey(), entry.getValue());
        }

        private boolean g(java.lang.Object obj, java.lang.Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(p8.u.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return g(this.f52853C, entry.getKey()) && g(this.f52854D, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            return this.f52854D;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            java.lang.Comparable comparable = this.f52853C;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            java.lang.Object obj = this.f52854D;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public java.lang.Comparable getKey() {
            return this.f52853C;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            p158p8.u.this.f();
            java.lang.Object obj2 = this.f52854D;
            this.f52854D = obj;
            return obj2;
        }

        public java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(this.f52853C);
            java.lang.String strValueOf2 = java.lang.String.valueOf(this.f52854D);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }
    }

    private class d implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f52856C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f52857D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.Iterator f52858E;

        private d() {
            this.f52856C = -1;
        }

        /* synthetic */ d(p158p8.u uVar, p8.u.a aVar) {
            this();
        }

        private java.util.Iterator b() {
            if (this.f52858E == null) {
                this.f52858E = p158p8.u.this.f52848E.entrySet().iterator();
            }
            return this.f52858E;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            this.f52857D = true;
            int i6 = this.f52856C + 1;
            this.f52856C = i6;
            return (java.util.Map.Entry) (i6 < p158p8.u.this.f52847D.size() ? p158p8.u.this.f52847D.get(this.f52856C) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52856C + 1 < p158p8.u.this.f52847D.size() || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f52857D) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.f52857D = false;
            p158p8.u.this.f();
            if (this.f52856C >= p158p8.u.this.f52847D.size()) {
                b().remove();
                return;
            }
            p158p8.u uVar = p158p8.u.this;
            int i6 = this.f52856C;
            this.f52856C = i6 - 1;
            uVar.r(i6);
        }
    }

    private class e extends java.util.AbstractSet {
        private e() {
        }

        /* synthetic */ e(p158p8.u uVar, p8.u.a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p158p8.u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object obj2 = p158p8.u.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(java.util.Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            p158p8.u.this.q((java.lang.Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return new p8.u.d(p158p8.u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            p158p8.u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p158p8.u.this.size();
        }
    }

    private u(int i6) {
        this.f52846C = i6;
        this.f52847D = java.util.Collections.emptyList();
        this.f52848E = java.util.Collections.emptyMap();
    }

    /* synthetic */ u(int i6, p8.u.a aVar) {
        this(i6);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int e(java.lang.Comparable comparable) {
        int i6;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f52847D.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i6 = 0;
            while (i6 <= i12) {
                i11 = (i6 + i12) / 2;
                iCompareTo = comparable.compareTo(((p8.u.c) this.f52847D.get(i11)).getKey());
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i6 = i11 + 1;
                }
            }
            i10 = i6 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((p8.u.c) this.f52847D.get(i12)).getKey());
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i6 = 0;
                while (i6 <= i12) {
                    i11 = (i6 + i12) / 2;
                    iCompareTo = comparable.compareTo(((p8.u.c) this.f52847D.get(i11)).getKey());
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i6 = i11 + 1;
                    }
                }
                i10 = i6 + 1;
            }
        }
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f52849F) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f52847D.isEmpty() || (this.f52847D instanceof java.util.ArrayList)) {
            return;
        }
        this.f52847D = new java.util.ArrayList(this.f52846C);
    }

    private java.util.SortedMap l() {
        f();
        if (this.f52848E.isEmpty() && !(this.f52848E instanceof java.util.TreeMap)) {
            this.f52848E = new java.util.TreeMap();
        }
        return (java.util.SortedMap) this.f52848E;
    }

    static p158p8.u p(int i6) {
        return new p8.u.a(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object r(int i6) {
        f();
        java.lang.Object value = ((p8.u.c) this.f52847D.remove(i6)).getValue();
        if (!this.f52848E.isEmpty()) {
            java.util.Iterator it = l().entrySet().iterator();
            this.f52847D.add(new p8.u.c(this, (java.util.Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f52847D.isEmpty()) {
            this.f52847D.clear();
        }
        if (this.f52848E.isEmpty()) {
            return;
        }
        this.f52848E.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return e(comparable) >= 0 || this.f52848E.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f52850G == null) {
            this.f52850G = new p8.u.e(this, null);
        }
        return this.f52850G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((p8.u.c) this.f52847D.get(iE)).getValue() : this.f52848E.get(comparable);
    }

    public java.util.Map.Entry h(int i6) {
        return (java.util.Map.Entry) this.f52847D.get(i6);
    }

    public int j() {
        return this.f52847D.size();
    }

    public java.lang.Iterable k() {
        return this.f52848E.isEmpty() ? p8.u.b.b() : this.f52848E.entrySet();
    }

    public boolean m() {
        return this.f52849F;
    }

    public void o() {
        if (this.f52849F) {
            return;
        }
        this.f52848E = this.f52848E.isEmpty() ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(this.f52848E);
        this.f52849F = true;
    }

    public java.lang.Object q(java.lang.Comparable comparable, java.lang.Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((p8.u.c) this.f52847D.get(iE)).setValue(obj);
        }
        g();
        int i6 = -(iE + 1);
        if (i6 >= this.f52846C) {
            return l().put(comparable, obj);
        }
        int size = this.f52847D.size();
        int i10 = this.f52846C;
        if (size == i10) {
            p8.u.c cVar = (p8.u.c) this.f52847D.remove(i10 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.f52847D.add(i6, new p8.u.c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        f();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return r(iE);
        }
        if (this.f52848E.isEmpty()) {
            return null;
        }
        return this.f52848E.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f52847D.size() + this.f52848E.size();
    }
}
