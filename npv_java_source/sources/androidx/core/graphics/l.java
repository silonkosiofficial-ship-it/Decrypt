package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class l extends androidx.core.graphics.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final java.lang.Class f21571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final java.lang.reflect.Constructor f21572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final java.lang.reflect.Method f21573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final java.lang.reflect.Method f21574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final java.lang.reflect.Method f21575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final java.lang.reflect.Method f21576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final java.lang.reflect.Method f21577m;

    public l() {
        java.lang.Class clsV;
        java.lang.reflect.Constructor constructorW;
        java.lang.reflect.Method methodS;
        java.lang.reflect.Method methodT;
        java.lang.reflect.Method methodX;
        java.lang.reflect.Method methodR;
        java.lang.reflect.Method methodU;
        try {
            clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e6) {
            java.lang.String str = "Unable to collect necessary methods for class " + e6.getClass().getName();
            clsV = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
            methodU = null;
        }
        this.f21571g = clsV;
        this.f21572h = constructorW;
        this.f21573i = methodS;
        this.f21574j = methodT;
        this.f21575k = methodX;
        this.f21576l = methodR;
        this.f21577m = methodU;
    }

    private java.lang.Object l() {
        try {
            return this.f21572h.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private void m(java.lang.Object obj) {
        try {
            this.f21576l.invoke(obj, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    private boolean n(android.content.Context context, java.lang.Object obj, java.lang.String str, int i6, int i10, int i11, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.f21573i.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i6, int i10, int i11) {
        try {
            return ((java.lang.Boolean) this.f21574j.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i6), null, java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f21575k.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f21573i == null) {
        }
        return this.f21573i != null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.o
    public android.graphics.Typeface a(android.content.Context context, androidx.core.content.res.e.c cVar, android.content.res.Resources resources, int i6) {
        if (!q()) {
            return super.a(context, cVar, resources, i6);
        }
        java.lang.Object objL = l();
        if (objL == null) {
            return null;
        }
        for (androidx.core.content.res.e.d dVar : cVar.a()) {
            if (!n(context, objL, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.o
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6) {
        android.graphics.Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            y1.h.b bVarG = g(bVarArr, i6);
            try {
                android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface typefaceBuild = new android.graphics.Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (java.lang.Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.Map mapH = androidx.core.graphics.p.h(context, bVarArr, cancellationSignal);
        java.lang.Object objL = l();
        if (objL == null) {
            return null;
        }
        boolean z6 = false;
        for (y1.h.b bVar : bVarArr) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(objL);
                    return null;
                }
                z6 = true;
            }
        }
        if (!z6) {
            m(objL);
            return null;
        }
        if (p(objL) && (typefaceI = i(objL)) != null) {
            return android.graphics.Typeface.create(typefaceI, i6);
        }
        return null;
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i6, java.lang.String str, int i10) {
        if (!q()) {
            return super.d(context, resources, i6, str, i10);
        }
        java.lang.Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected android.graphics.Typeface i(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f21571g, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.f21577m.invoke(null, objNewInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    protected java.lang.reflect.Method r(java.lang.Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected java.lang.reflect.Method s(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    protected java.lang.reflect.Method t(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls2, android.graphics.fonts.FontVariationAxis[].class, cls2, cls2);
    }

    protected java.lang.reflect.Method u(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected java.lang.Class v() {
        return java.lang.Class.forName("android.graphics.FontFamily");
    }

    protected java.lang.reflect.Constructor w(java.lang.Class cls) {
        return cls.getConstructor(null);
    }

    protected java.lang.reflect.Method x(java.lang.Class cls) {
        return cls.getMethod("freeze", null);
    }
}
