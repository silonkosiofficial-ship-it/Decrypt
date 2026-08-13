package j$.util;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6852t extends j$.util.C6722n implements java.util.RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private java.lang.Object writeReplace() {
        return new j$.util.C6722n(this.f48171b);
    }

    @Override // j$.util.C6722n, java.util.List
    public final java.util.List subList(int i6, int i10) {
        return new j$.util.C6852t(this.f48171b.subList(i6, i10));
    }
}
