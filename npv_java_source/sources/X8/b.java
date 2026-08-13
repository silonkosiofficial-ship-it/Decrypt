package X8;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p127m7.a implements W8.K {
    private volatile java.lang.Object _preHandler;

    public b() {
        super(W8.K.f15455g);
        this._preHandler = this;
    }

    private final java.lang.reflect.Method t1() {
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            return (java.lang.reflect.Method) obj;
        }
        java.lang.reflect.Method method = null;
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (java.lang.reflect.Modifier.isPublic(declaredMethod.getModifiers()) && java.lang.reflect.Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (java.lang.Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // W8.K
    public void z0(p127m7.i iVar, java.lang.Throwable th) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (26 > i6 || i6 >= 28) {
            return;
        }
        java.lang.reflect.Method methodT1 = t1();
        java.lang.Object objInvoke = methodT1 != null ? methodT1.invoke(null, null) : null;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
    }
}
