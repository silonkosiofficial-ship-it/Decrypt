package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends java.util.AbstractList implements androidx.datastore.preferences.protobuf.D, java.util.RandomAccess {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.D f22077C;

    class a implements java.util.ListIterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.util.ListIterator f22078C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f22079D;

        a(int i6) {
            this.f22079D = i6;
            this.f22078C = androidx.datastore.preferences.protobuf.o0.this.f22077C.listIterator(i6);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            return (java.lang.String) this.f22078C.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String previous() {
            return (java.lang.String) this.f22078C.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f22078C.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f22078C.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f22078C.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f22078C.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    class b implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.util.Iterator f22081C;

        b() {
            this.f22081C = androidx.datastore.preferences.protobuf.o0.this.f22077C.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            return (java.lang.String) this.f22081C.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22081C.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public o0(androidx.datastore.preferences.protobuf.D d6) {
        this.f22077C = d6;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public java.lang.Object A(int i6) {
        return this.f22077C.A(i6);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i6) {
        return (java.lang.String) this.f22077C.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public java.util.List h() {
        return this.f22077C.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.o0.b();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public androidx.datastore.preferences.protobuf.D l() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        return new androidx.datastore.preferences.protobuf.o0.a(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22077C.size();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void x(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        throw new java.lang.UnsupportedOperationException();
    }
}
