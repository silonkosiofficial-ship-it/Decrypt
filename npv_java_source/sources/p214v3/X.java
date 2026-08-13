package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Map f55866a = new j$.util.concurrent.ConcurrentHashMap();

    public X() {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final android.graphics.Bitmap a(java.lang.Integer num) {
        return (android.graphics.Bitmap) this.f55866a.get(num);
    }
}
