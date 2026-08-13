package p200u;

/* JADX INFO: renamed from: u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7159b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.C7183n f54811a = p200u.AbstractC7191s.a(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.C7185o f54812b = p200u.AbstractC7191s.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p200u.C7187p f54813c = p200u.AbstractC7191s.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.C7189q f54814d = p200u.AbstractC7191s.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p200u.C7183n f54815e = p200u.AbstractC7191s.a(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p200u.C7185o f54816f = p200u.AbstractC7191s.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p200u.C7187p f54817g = p200u.AbstractC7191s.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p200u.C7189q f54818h = p200u.AbstractC7191s.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final p200u.C7157a a(float f6, float f10) {
        return new p200u.C7157a(java.lang.Float.valueOf(f6), p200u.z0.i(p247y7.C7344m.f57303a), java.lang.Float.valueOf(f10), null, 8, null);
    }

    public static /* synthetic */ p200u.C7157a b(float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            f10 = 0.01f;
        }
        return a(f6, f10);
    }
}
