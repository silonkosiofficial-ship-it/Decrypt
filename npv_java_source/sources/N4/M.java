package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M {

    class a extends N4.M.b {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.Set f7712C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Set f7713D;

        /* JADX INFO: renamed from: N4.M$a$a, reason: collision with other inner class name */
        class C0185a extends N4.AbstractC1402b {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final java.util.Iterator f7714E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final java.util.Iterator f7715F;

            C0185a() {
                this.f7714E = N4.M.a.this.f7712C.iterator();
                this.f7715F = N4.M.a.this.f7713D.iterator();
            }

            @Override // N4.AbstractC1402b
            protected java.lang.Object b() {
                if (this.f7714E.hasNext()) {
                    return this.f7714E.next();
                }
                while (this.f7715F.hasNext()) {
                    java.lang.Object next = this.f7715F.next();
                    if (!N4.M.a.this.f7712C.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.Set set, java.util.Set set2) {
            super(null);
            this.f7712C = set;
            this.f7713D = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return this.f7712C.contains(obj) || this.f7713D.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public N4.S iterator() {
            return new N4.M.a.C0185a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f7712C.isEmpty() && this.f7713D.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f7712C.size();
            java.util.Iterator it = this.f7713D.iterator();
            while (it.hasNext()) {
                if (!this.f7712C.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends java.util.AbstractSet {
        private b() {
        }

        /* synthetic */ b(N4.M.a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: d */
        public abstract N4.S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(java.util.Collection collection) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static boolean a(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i6 = ~(~(i6 + (next != null ? next.hashCode() : 0)));
        }
        return i6;
    }

    public static N4.M.b c(java.util.Set set, java.util.Set set2) {
        M4.h.j(set, "set1");
        M4.h.j(set2, "set2");
        return new N4.M.a(set, set2);
    }
}
