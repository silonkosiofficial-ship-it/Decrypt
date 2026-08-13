package p140o;

/* JADX INFO: loaded from: classes.dex */
public class b implements java.lang.Iterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    o.b.c f52089C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private o.b.c f52090D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.WeakHashMap f52091E = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f52092F = 0;

    static class a extends o.b.e {
        a(o.b.c cVar, o.b.c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        o.b.c c(o.b.c cVar) {
            return cVar.f52096F;
        }

        @Override // o.b.e
        o.b.c d(o.b.c cVar) {
            return cVar.f52095E;
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    private static class C0672b extends o.b.e {
        C0672b(o.b.c cVar, o.b.c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        o.b.c c(o.b.c cVar) {
            return cVar.f52095E;
        }

        @Override // o.b.e
        o.b.c d(o.b.c cVar) {
            return cVar.f52096F;
        }
    }

    static class c implements java.util.Map.Entry {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final java.lang.Object f52093C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final java.lang.Object f52094D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        o.b.c f52095E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        o.b.c f52096F;

        c(java.lang.Object obj, java.lang.Object obj2) {
            this.f52093C = obj;
            this.f52094D = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o.b.c)) {
                return false;
            }
            o.b.c cVar = (o.b.c) obj;
            return this.f52093C.equals(cVar.f52093C) && this.f52094D.equals(cVar.f52094D);
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getKey() {
            return this.f52093C;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            return this.f52094D;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f52093C.hashCode() ^ this.f52094D.hashCode();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
        }

        public java.lang.String toString() {
            return this.f52093C + "=" + this.f52094D;
        }
    }

    public class d extends o.b.f implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private o.b.c f52097C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f52098D = true;

        d() {
        }

        @Override // o.b.f
        void b(o.b.c cVar) {
            o.b.c cVar2 = this.f52097C;
            if (cVar == cVar2) {
                o.b.c cVar3 = cVar2.f52096F;
                this.f52097C = cVar3;
                this.f52098D = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            o.b.c cVar;
            if (this.f52098D) {
                this.f52098D = false;
                cVar = p140o.b.this.f52089C;
            } else {
                o.b.c cVar2 = this.f52097C;
                cVar = cVar2 != null ? cVar2.f52095E : null;
            }
            this.f52097C = cVar;
            return this.f52097C;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52098D) {
                return p140o.b.this.f52089C != null;
            }
            o.b.c cVar = this.f52097C;
            return (cVar == null || cVar.f52095E == null) ? false : true;
        }
    }

    private static abstract class e extends o.b.f implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        o.b.c f52100C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        o.b.c f52101D;

        e(o.b.c cVar, o.b.c cVar2) {
            this.f52100C = cVar2;
            this.f52101D = cVar;
        }

        private o.b.c f() {
            o.b.c cVar = this.f52101D;
            o.b.c cVar2 = this.f52100C;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // o.b.f
        public void b(o.b.c cVar) {
            if (this.f52100C == cVar && cVar == this.f52101D) {
                this.f52101D = null;
                this.f52100C = null;
            }
            o.b.c cVar2 = this.f52100C;
            if (cVar2 == cVar) {
                this.f52100C = c(cVar2);
            }
            if (this.f52101D == cVar) {
                this.f52101D = f();
            }
        }

        abstract o.b.c c(o.b.c cVar);

        abstract o.b.c d(o.b.c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry next() {
            o.b.c cVar = this.f52101D;
            this.f52101D = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52101D != null;
        }
    }

    public static abstract class f {
        abstract void b(o.b.c cVar);
    }

    public java.util.Map.Entry d() {
        return this.f52089C;
    }

    public java.util.Iterator descendingIterator() {
        p140o.b.C0672b c0672b = new p140o.b.C0672b(this.f52090D, this.f52089C);
        this.f52091E.put(c0672b, java.lang.Boolean.FALSE);
        return c0672b;
    }

    protected o.b.c e(java.lang.Object obj) {
        o.b.c cVar = this.f52089C;
        while (cVar != null && !cVar.f52093C.equals(obj)) {
            cVar = cVar.f52095E;
        }
        return cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p140o.b)) {
            return false;
        }
        p140o.b bVar = (p140o.b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public o.b.d f() {
        o.b.d dVar = new o.b.d();
        this.f52091E.put(dVar, java.lang.Boolean.FALSE);
        return dVar;
    }

    public java.util.Map.Entry g() {
        return this.f52090D;
    }

    public int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((java.util.Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        o.b.a aVar = new o.b.a(this.f52089C, this.f52090D);
        this.f52091E.put(aVar, java.lang.Boolean.FALSE);
        return aVar;
    }

    o.b.c n(java.lang.Object obj, java.lang.Object obj2) {
        o.b.c cVar = new o.b.c(obj, obj2);
        this.f52092F++;
        o.b.c cVar2 = this.f52090D;
        if (cVar2 == null) {
            this.f52089C = cVar;
        } else {
            cVar2.f52095E = cVar;
            cVar.f52096F = cVar2;
        }
        this.f52090D = cVar;
        return cVar;
    }

    public java.lang.Object o(java.lang.Object obj, java.lang.Object obj2) {
        o.b.c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f52094D;
        }
        n(obj, obj2);
        return null;
    }

    public java.lang.Object s(java.lang.Object obj) {
        o.b.c cVarE = e(obj);
        if (cVarE == null) {
            return null;
        }
        this.f52092F--;
        if (!this.f52091E.isEmpty()) {
            java.util.Iterator it = this.f52091E.keySet().iterator();
            while (it.hasNext()) {
                ((o.b.f) it.next()).b(cVarE);
            }
        }
        o.b.c cVar = cVarE.f52096F;
        o.b.c cVar2 = cVarE.f52095E;
        if (cVar != null) {
            cVar.f52095E = cVar2;
        } else {
            this.f52089C = cVar2;
        }
        o.b.c cVar3 = cVarE.f52095E;
        if (cVar3 != null) {
            cVar3.f52096F = cVar;
        } else {
            this.f52090D = cVar;
        }
        cVarE.f52095E = null;
        cVarE.f52096F = null;
        return cVarE.f52094D;
    }

    public int size() {
        return this.f52092F;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((java.util.Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
