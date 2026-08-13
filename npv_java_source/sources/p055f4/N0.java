package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class N0 extends p055f4.J0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object f45067E;

    N0(java.lang.Object obj) {
        obj.getClass();
        this.f45067E = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f45067E.equals(obj);
    }

    @Override // p055f4.F0
    final int d(java.lang.Object[] objArr, int i6) {
        objArr[0] = this.f45067E;
        return 1;
    }

    @Override // p055f4.J0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45067E.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return new p055f4.K0(this.f45067E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.f45067E.toString() + "]";
    }
}
