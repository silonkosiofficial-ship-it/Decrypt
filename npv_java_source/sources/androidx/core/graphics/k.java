package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class k extends androidx.core.graphics.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class f21567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.reflect.Constructor f21568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.reflect.Method f21569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.reflect.Method f21570e;

    static {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method2;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", java.nio.ByteBuffer.class, cls2, java.util.List.class, cls2, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e6) {
            e6.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f21568c = constructor;
        f21567b = cls;
        f21569d = method2;
        f21570e = method;
    }

    k() {
    }

    private static boolean h(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i6, int i10, boolean z6) {
        try {
            return ((java.lang.Boolean) f21569d.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i6), null, java.lang.Integer.valueOf(i10), java.lang.Boolean.valueOf(z6))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private static android.graphics.Typeface i(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f21567b, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) f21570e.invoke(null, objNewInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        java.lang.reflect.Method method = f21569d;
        if (method == null) {
        }
        return method != null;
    }

    private static java.lang.Object k() {
        try {
            return f21568c.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface a(android.content.Context context, androidx.core.content.res.e.c cVar, android.content.res.Resources resources, int i6) {
        java.lang.Object objK = k();
        if (objK == null) {
            return null;
        }
        for (androidx.core.content.res.e.d dVar : cVar.a()) {
            java.nio.ByteBuffer byteBufferB = androidx.core.graphics.p.b(context, resources, dVar.b());
            if (byteBufferB == null || !h(objK, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(objK);
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6) {
        java.lang.Object objK = k();
        if (objK == null) {
            return null;
        }
        p170r.Y y6 = new p170r.Y();
        for (y1.h.b bVar : bVarArr) {
            android.net.Uri uriD = bVar.d();
            java.nio.ByteBuffer byteBufferF = (java.nio.ByteBuffer) y6.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = androidx.core.graphics.p.f(context, cancellationSignal, uriD);
                y6.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !h(objK, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        android.graphics.Typeface typefaceI = i(objK);
        if (typefaceI == null) {
            return null;
        }
        return android.graphics.Typeface.create(typefaceI, i6);
    }
}
