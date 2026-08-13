package p073h2;

/* JADX INFO: renamed from: h2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6640q extends p097j7.AbstractC6862d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f46229D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f46230E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.List f46231F;

    public C6640q(int i6, int i10, java.util.List list) {
        p247y7.AbstractC7350t.f(list, "items");
        this.f46229D = i6;
        this.f46230E = i10;
        this.f46231F = list;
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f46229D + this.f46231F.size() + this.f46230E;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.lang.Object get(int i6) {
        if (i6 >= 0 && i6 < this.f46229D) {
            return null;
        }
        int i10 = this.f46229D;
        if (i6 < this.f46231F.size() + i10 && i10 <= i6) {
            return this.f46231F.get(i6 - this.f46229D);
        }
        int size = this.f46229D + this.f46231F.size();
        if (i6 < size() && size <= i6) {
            return null;
        }
        throw new java.lang.IndexOutOfBoundsException("Illegal attempt to access index " + i6 + " in ItemSnapshotList of size " + size());
    }
}
