package p097j7;

/* JADX INFO: renamed from: j7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6866h extends java.util.AbstractList implements java.util.List, p256z7.d {
    protected AbstractC6866h() {
    }

    public abstract int d();

    public abstract java.lang.Object e(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i6) {
        return e(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
