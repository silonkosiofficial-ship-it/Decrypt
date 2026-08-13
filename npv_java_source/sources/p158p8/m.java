package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public class m extends java.util.AbstractList implements java.util.RandomAccess, p158p8.n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p158p8.n f52825D = new p158p8.m().l();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f52826C;

    public m() {
        this.f52826C = new java.util.ArrayList();
    }

    public m(p158p8.n nVar) {
        this.f52826C = new java.util.ArrayList(nVar.size());
        addAll(nVar);
    }

    private static p158p8.d e(java.lang.Object obj) {
        if (obj instanceof p158p8.d) {
            return (p158p8.d) obj;
        }
        return obj instanceof java.lang.String ? p158p8.d.o((java.lang.String) obj) : p158p8.d.g((byte[]) obj);
    }

    private static java.lang.String f(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return obj instanceof p158p8.d ? ((p158p8.d) obj).S() : p158p8.j.b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        if (collection instanceof p158p8.n) {
            collection = ((p158p8.n) collection).h();
        }
        boolean zAddAll = this.f52826C.addAll(i6, collection);
        ((java.util.AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f52826C.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i6, java.lang.String str) {
        this.f52826C.add(i6, str);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i6) {
        java.lang.Object obj = this.f52826C.get(i6);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof p158p8.d) {
            p158p8.d dVar = (p158p8.d) obj;
            java.lang.String strS = dVar.S();
            if (dVar.E()) {
                this.f52826C.set(i6, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strB = p158p8.j.b(bArr);
        if (p158p8.j.a(bArr)) {
            this.f52826C.set(i6, strB);
        }
        return strB;
    }

    @Override // p158p8.n
    public java.util.List h() {
        return j$.util.DesugarCollections.unmodifiableList(this.f52826C);
    }

    @Override // p158p8.n
    public p158p8.n l() {
        return new p158p8.w(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public java.lang.String remove(int i6) {
        java.lang.Object objRemove = this.f52826C.remove(i6);
        ((java.util.AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.String set(int i6, java.lang.String str) {
        return f(this.f52826C.set(i6, str));
    }

    @Override // p158p8.n
    public void p(p158p8.d dVar) {
        this.f52826C.add(dVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52826C.size();
    }

    @Override // p158p8.n
    public p158p8.d z(int i6) {
        java.lang.Object obj = this.f52826C.get(i6);
        p158p8.d dVarE = e(obj);
        if (dVarE != obj) {
            this.f52826C.set(i6, dVarE);
        }
        return dVarE;
    }
}
