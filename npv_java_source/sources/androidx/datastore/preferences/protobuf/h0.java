package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class h0 extends java.util.AbstractMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f22025C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.List f22026D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.Map f22027E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f22028F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile androidx.datastore.preferences.protobuf.h0.g f22029G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.Map f22030H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private volatile androidx.datastore.preferences.protobuf.h0.c f22031I;

    class a extends androidx.datastore.preferences.protobuf.h0 {
        a(int i6) {
            super(i6, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public void r() {
            if (!q()) {
                if (l() > 0) {
                    androidx.appcompat.app.D.a(k(0).getKey());
                    throw null;
                }
                java.util.Iterator it = o().iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.D.a(((java.util.Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.r();
        }
    }

    private class b implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f22032C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.util.Iterator f22033D;

        private b() {
            this.f22032C = androidx.datastore.preferences.protobuf.h0.this.f22026D.size();
        }

        /* synthetic */ b(androidx.datastore.preferences.protobuf.h0 h0Var, androidx.datastore.preferences.protobuf.h0.a aVar) {
            this();
        }

        private java.util.Iterator b() {
            if (this.f22033D == null) {
                this.f22033D = androidx.datastore.preferences.protobuf.h0.this.f22030H.entrySet().iterator();
            }
            return this.f22033D;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            java.lang.Object next;
            if (b().hasNext()) {
                next = b().next();
            } else {
                java.util.List list = androidx.datastore.preferences.protobuf.h0.this.f22026D;
                int i6 = this.f22032C - 1;
                this.f22032C = i6;
                next = list.get(i6);
            }
            return (java.util.Map.Entry) next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i6 = this.f22032C;
            return (i6 > 0 && i6 <= androidx.datastore.preferences.protobuf.h0.this.f22026D.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private class c extends androidx.datastore.preferences.protobuf.h0.g {
        private c() {
            super(androidx.datastore.preferences.protobuf.h0.this, null);
        }

        /* synthetic */ c(androidx.datastore.preferences.protobuf.h0 h0Var, androidx.datastore.preferences.protobuf.h0.a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return new androidx.datastore.preferences.protobuf.h0.b(androidx.datastore.preferences.protobuf.h0.this, null);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.util.Iterator f22036a = new androidx.datastore.preferences.protobuf.h0.d.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final java.lang.Iterable f22037b = new androidx.datastore.preferences.protobuf.h0.d.b();

        class a implements java.util.Iterator {
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

        class b implements java.lang.Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator iterator() {
                return androidx.datastore.preferences.protobuf.h0.d.f22036a;
            }
        }

        static java.lang.Iterable b() {
            return f22037b;
        }
    }

    private class e implements java.util.Map.Entry, java.lang.Comparable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Comparable f22038C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.Object f22039D;

        e(java.lang.Comparable comparable, java.lang.Object obj) {
            this.f22038C = comparable;
            this.f22039D = obj;
        }

        e(androidx.datastore.preferences.protobuf.h0 h0Var, java.util.Map.Entry entry) {
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
        public int compareTo(androidx.datastore.preferences.protobuf.h0.e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return g(this.f22038C, entry.getKey()) && g(this.f22039D, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            return this.f22039D;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            java.lang.Comparable comparable = this.f22038C;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            java.lang.Object obj = this.f22039D;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public java.lang.Comparable getKey() {
            return this.f22038C;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            androidx.datastore.preferences.protobuf.h0.this.g();
            java.lang.Object obj2 = this.f22039D;
            this.f22039D = obj;
            return obj2;
        }

        public java.lang.String toString() {
            return this.f22038C + "=" + this.f22039D;
        }
    }

    private class f implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f22041C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f22042D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.Iterator f22043E;

        private f() {
            this.f22041C = -1;
        }

        /* synthetic */ f(androidx.datastore.preferences.protobuf.h0 h0Var, androidx.datastore.preferences.protobuf.h0.a aVar) {
            this();
        }

        private java.util.Iterator b() {
            if (this.f22043E == null) {
                this.f22043E = androidx.datastore.preferences.protobuf.h0.this.f22027E.entrySet().iterator();
            }
            return this.f22043E;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            this.f22042D = true;
            int i6 = this.f22041C + 1;
            this.f22041C = i6;
            return (java.util.Map.Entry) (i6 < androidx.datastore.preferences.protobuf.h0.this.f22026D.size() ? androidx.datastore.preferences.protobuf.h0.this.f22026D.get(this.f22041C) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22041C + 1 >= androidx.datastore.preferences.protobuf.h0.this.f22026D.size()) {
                return !androidx.datastore.preferences.protobuf.h0.this.f22027E.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f22042D) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.f22042D = false;
            androidx.datastore.preferences.protobuf.h0.this.g();
            if (this.f22041C >= androidx.datastore.preferences.protobuf.h0.this.f22026D.size()) {
                b().remove();
                return;
            }
            androidx.datastore.preferences.protobuf.h0 h0Var = androidx.datastore.preferences.protobuf.h0.this;
            int i6 = this.f22041C;
            this.f22041C = i6 - 1;
            h0Var.u(i6);
        }
    }

    private class g extends java.util.AbstractSet {
        private g() {
        }

        /* synthetic */ g(androidx.datastore.preferences.protobuf.h0 h0Var, androidx.datastore.preferences.protobuf.h0.a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            androidx.datastore.preferences.protobuf.h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object obj2 = androidx.datastore.preferences.protobuf.h0.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(java.util.Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.h0.this.put((java.lang.Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return new androidx.datastore.preferences.protobuf.h0.f(androidx.datastore.preferences.protobuf.h0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.h0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return androidx.datastore.preferences.protobuf.h0.this.size();
        }
    }

    private h0(int i6) {
        this.f22025C = i6;
        this.f22026D = java.util.Collections.emptyList();
        this.f22027E = java.util.Collections.emptyMap();
        this.f22030H = java.util.Collections.emptyMap();
    }

    /* synthetic */ h0(int i6, androidx.datastore.preferences.protobuf.h0.a aVar) {
        this(i6);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int f(java.lang.Comparable comparable) {
        int i6;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f22026D.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i6 = 0;
            while (i6 <= i12) {
                i11 = (i6 + i12) / 2;
                iCompareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(i11)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(i12)).getKey());
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i6 = 0;
                while (i6 <= i12) {
                    i11 = (i6 + i12) / 2;
                    iCompareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(i11)).getKey());
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
    public void g() {
        if (this.f22028F) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f22026D.isEmpty() || (this.f22026D instanceof java.util.ArrayList)) {
            return;
        }
        this.f22026D = new java.util.ArrayList(this.f22025C);
    }

    private java.util.SortedMap p() {
        g();
        if (this.f22027E.isEmpty() && !(this.f22027E instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f22027E = treeMap;
            this.f22030H = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f22027E;
    }

    static androidx.datastore.preferences.protobuf.h0 s(int i6) {
        return new androidx.datastore.preferences.protobuf.h0.a(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object u(int i6) {
        g();
        java.lang.Object value = ((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.remove(i6)).getValue();
        if (!this.f22027E.isEmpty()) {
            java.util.Iterator it = p().entrySet().iterator();
            this.f22026D.add(new androidx.datastore.preferences.protobuf.h0.e(this, (java.util.Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f22026D.isEmpty()) {
            this.f22026D.clear();
        }
        if (this.f22027E.isEmpty()) {
            return;
        }
        this.f22027E.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return f(comparable) >= 0 || this.f22027E.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f22029G == null) {
            this.f22029G = new androidx.datastore.preferences.protobuf.h0.g(this, null);
        }
        return this.f22029G;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.h0)) {
            return super.equals(obj);
        }
        androidx.datastore.preferences.protobuf.h0 h0Var = (androidx.datastore.preferences.protobuf.h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != h0Var.l()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i6 = 0; i6 < iL; i6++) {
            if (!k(i6).equals(h0Var.k(i6))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f22027E.equals(h0Var.f22027E);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(iF)).getValue() : this.f22027E.get(comparable);
    }

    java.util.Set h() {
        if (this.f22031I == null) {
            this.f22031I = new androidx.datastore.preferences.protobuf.h0.c(this, null);
        }
        return this.f22031I;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i6 = 0; i6 < iL; i6++) {
            iHashCode += ((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(i6)).hashCode();
        }
        return m() > 0 ? iHashCode + this.f22027E.hashCode() : iHashCode;
    }

    public java.util.Map.Entry k(int i6) {
        return (java.util.Map.Entry) this.f22026D.get(i6);
    }

    public int l() {
        return this.f22026D.size();
    }

    public int m() {
        return this.f22027E.size();
    }

    public java.lang.Iterable o() {
        return this.f22027E.isEmpty() ? androidx.datastore.preferences.protobuf.h0.d.b() : this.f22027E.entrySet();
    }

    public boolean q() {
        return this.f22028F;
    }

    public void r() {
        if (this.f22028F) {
            return;
        }
        this.f22027E = this.f22027E.isEmpty() ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(this.f22027E);
        this.f22030H = this.f22030H.isEmpty() ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(this.f22030H);
        this.f22028F = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        g();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return u(iF);
        }
        if (this.f22027E.isEmpty()) {
            return null;
        }
        return this.f22027E.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22026D.size() + this.f22027E.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((androidx.datastore.preferences.protobuf.h0.e) this.f22026D.get(iF)).setValue(obj);
        }
        j();
        int i6 = -(iF + 1);
        if (i6 >= this.f22025C) {
            return p().put(comparable, obj);
        }
        int size = this.f22026D.size();
        int i10 = this.f22025C;
        if (size == i10) {
            androidx.datastore.preferences.protobuf.h0.e eVar = (androidx.datastore.preferences.protobuf.h0.e) this.f22026D.remove(i10 - 1);
            p().put(eVar.getKey(), eVar.getValue());
        }
        this.f22026D.add(i6, new androidx.datastore.preferences.protobuf.h0.e(comparable, obj));
        return null;
    }
}
