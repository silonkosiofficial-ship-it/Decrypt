package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class m extends androidx.core.graphics.l {
    @Override // androidx.core.graphics.l
    protected android.graphics.Typeface i(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f21571g, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.f21577m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    @Override // androidx.core.graphics.l
    protected java.lang.reflect.Method u(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), java.lang.String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
