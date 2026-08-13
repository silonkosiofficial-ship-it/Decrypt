package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class C extends androidx.datastore.preferences.protobuf.AbstractC2043c implements androidx.datastore.preferences.protobuf.D, java.util.RandomAccess {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.C f21924E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.D f21925F;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f21926D;

    static {
        androidx.datastore.preferences.protobuf.C c6 = new androidx.datastore.preferences.protobuf.C();
        f21924E = c6;
        c6.q();
        f21925F = c6;
    }

    public C() {
        this(10);
    }

    public C(int i6) {
        this(new java.util.ArrayList(i6));
    }

    private C(java.util.ArrayList arrayList) {
        this.f21926D = arrayList;
    }

    private static java.lang.String f(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g ? ((androidx.datastore.preferences.protobuf.AbstractC2047g) obj).T() : androidx.datastore.preferences.protobuf.AbstractC2064y.i((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public java.lang.Object A(int i6) {
        return this.f21926D.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, androidx.datastore.preferences.protobuf.AbstractC2064y.b
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return super.add(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        d();
        if (collection instanceof androidx.datastore.preferences.protobuf.D) {
            collection = ((androidx.datastore.preferences.protobuf.D) collection).h();
        }
        boolean zAddAll = this.f21926D.addAll(i6, collection);
        ((java.util.AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f21926D.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i6, java.lang.String str) {
        d();
        this.f21926D.add(i6, str);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i6) {
        java.lang.Object obj = this.f21926D.get(i6);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
            androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g = (androidx.datastore.preferences.protobuf.AbstractC2047g) obj;
            java.lang.String strT = abstractC2047g.T();
            if (abstractC2047g.D()) {
                this.f21926D.set(i6, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strI = androidx.datastore.preferences.protobuf.AbstractC2064y.i(bArr);
        if (androidx.datastore.preferences.protobuf.AbstractC2064y.g(bArr)) {
            this.f21926D.set(i6, strI);
        }
        return strI;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public java.util.List h() {
        return j$.util.DesugarCollections.unmodifiableList(this.f21926D);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public androidx.datastore.preferences.protobuf.D l() {
        return I() ? new androidx.datastore.preferences.protobuf.o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2064y.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.preferences.protobuf.C u(int i6) {
        if (i6 < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6);
        arrayList.addAll(this.f21926D);
        return new androidx.datastore.preferences.protobuf.C(arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.String remove(int i6) {
        d();
        java.lang.Object objRemove = this.f21926D.remove(i6);
        ((java.util.AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public java.lang.String set(int i6, java.lang.String str) {
        d();
        return f(this.f21926D.set(i6, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21926D.size();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void x(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        d();
        this.f21926D.add(abstractC2047g);
        ((java.util.AbstractList) this).modCount++;
    }
}
