package J8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends java.util.ArrayList implements J8.k {
    public a(int i6) {
        super(i6);
    }

    public /* bridge */ boolean C(J8.l lVar) {
        return super.remove(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof J8.l) {
            return d((J8.l) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(J8.l lVar) {
        return super.contains(lVar);
    }

    public /* bridge */ int e() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof J8.l) {
            return n((J8.l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof J8.l) {
            return w((J8.l) obj);
        }
        return -1;
    }

    public /* bridge */ int n(J8.l lVar) {
        return super.indexOf(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof J8.l) {
            return C((J8.l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }

    public /* bridge */ int w(J8.l lVar) {
        return super.lastIndexOf(lVar);
    }
}
