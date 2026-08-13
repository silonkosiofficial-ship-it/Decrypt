package K4;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements K4.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K4.k f6125b = new K4.k(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f6126a;

    private k(java.lang.Object obj) {
        this.f6126a = obj;
    }

    public static K4.j b(java.lang.Object obj) {
        if (obj != null) {
            return new K4.k(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // K4.m
    public final java.lang.Object a() {
        return this.f6126a;
    }
}
