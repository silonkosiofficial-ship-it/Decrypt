package N3;

/* JADX INFO: loaded from: classes.dex */
final class J extends N3.L {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.Callable f7637f;

    /* synthetic */ J(java.util.concurrent.Callable callable, N3.I i6) {
        super();
        this.f7637f = callable;
    }

    @Override // N3.L
    final java.lang.String a() {
        try {
            return (java.lang.String) this.f7637f.call();
        } catch (java.lang.Exception e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }
}
