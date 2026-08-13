package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    private static class a {
        public static android.os.Handler a(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }

    public static android.os.Handler a(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.os.h.a.a(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException e6) {
            return new android.os.Handler(looper);
        } catch (java.lang.InstantiationException e10) {
            return new android.os.Handler(looper);
        } catch (java.lang.NoSuchMethodException e11) {
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException e12) {
            java.lang.Throwable cause = e12.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }
}
