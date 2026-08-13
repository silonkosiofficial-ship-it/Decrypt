package Y;

/* JADX INFO: loaded from: classes.dex */
public interface f extends Y.d, Y.b {

    public interface a extends java.util.List, java.util.Collection, p256z7.b, p256z7.d {
        Y.f i();
    }

    @Override // java.util.List
    Y.f add(int i6, java.lang.Object obj);

    @Override // java.util.List, java.util.Collection
    Y.f add(java.lang.Object obj);

    @Override // java.util.List, java.util.Collection
    Y.f addAll(java.util.Collection collection);

    Y.f.a builder();

    @Override // java.util.List, java.util.Collection
    Y.f remove(java.lang.Object obj);

    @Override // java.util.List, java.util.Collection
    Y.f removeAll(java.util.Collection collection);

    @Override // java.util.List
    Y.f set(int i6, java.lang.Object obj);

    Y.f v(p237x7.l lVar);

    Y.f y(int i6);
}
