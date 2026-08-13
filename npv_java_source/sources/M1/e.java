package M1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends M1.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f6777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6778c;

    public e(java.lang.Object obj, int i6, int i10) {
        super(i10, null);
        this.f6777b = obj;
        this.f6778c = i6;
    }

    public final void b() {
        java.lang.Object obj = this.f6777b;
        if ((obj != null ? obj.hashCode() : 0) != this.f6778c) {
            throw new java.lang.IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final java.lang.Object c() {
        return this.f6777b;
    }
}
