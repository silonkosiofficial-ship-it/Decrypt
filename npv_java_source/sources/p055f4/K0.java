package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class K0 extends p055f4.O0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f45051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f45052D;

    K0(java.lang.Object obj) {
        this.f45051C = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f45052D;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f45052D) {
            throw new java.util.NoSuchElementException();
        }
        this.f45052D = true;
        return this.f45051C;
    }
}
