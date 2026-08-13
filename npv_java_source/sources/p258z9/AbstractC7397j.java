package p258z9;

/* JADX INFO: renamed from: z9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7397j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f57768a;

    static {
        java.lang.Object objB;
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            java.lang.String property = java.lang.System.getProperty("kotlinx.serialization.json.pool.size");
            objB = p087i7.w.b(property != null ? S8.r.v(property) : null);
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        java.lang.Integer num = (java.lang.Integer) (p087i7.w.g(objB) ? null : objB);
        f57768a = num != null ? num.intValue() : 2097152;
    }
}
