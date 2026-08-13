package j$.util;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6717i extends j$.util.C6715g implements java.util.RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private java.lang.Object writeReplace() {
        return new j$.util.C6715g(this.f48144c);
    }

    @Override // j$.util.C6715g, java.util.List
    public final java.util.List subList(int i6, int i10) {
        j$.util.C6717i c6717i;
        synchronized (this.f48123b) {
            c6717i = new j$.util.C6717i(this.f48144c.subList(i6, i10), this.f48123b);
        }
        return c6717i;
    }
}
