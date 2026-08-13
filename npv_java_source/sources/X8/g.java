package X8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X8.f f16076a;
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object objB;
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            objB = p087i7.w.b(new X8.e(a(android.os.Looper.getMainLooper(), true), null, 2, null));
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        f16076a = (X8.f) (p087i7.w.g(objB) ? null : objB);
    }

    public static final android.os.Handler a(android.os.Looper looper, boolean z6) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        java.lang.Object objNewInstance;
        if (!z6) {
            return new android.os.Handler(looper);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            objNewInstance = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
            p247y7.AbstractC7350t.d(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
            } catch (java.lang.NoSuchMethodException unused) {
                return new android.os.Handler(looper);
            }
        }
        return (android.os.Handler) objNewInstance;
    }

    public static final X8.f b(android.os.Handler handler, java.lang.String str) {
        return new X8.e(handler, str);
    }
}
