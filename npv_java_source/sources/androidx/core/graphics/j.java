package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class j extends androidx.core.graphics.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.Class f21562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Constructor f21563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.reflect.Method f21564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.lang.reflect.Method f21565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f21566f;

    j() {
    }

    private static boolean h(java.lang.Object obj, java.lang.String str, int i6, boolean z6) throws java.lang.NoSuchMethodException {
        k();
        try {
            return ((java.lang.Boolean) f21564d.invoke(obj, str, java.lang.Integer.valueOf(i6), java.lang.Boolean.valueOf(z6))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    private static android.graphics.Typeface i(java.lang.Object obj) throws java.lang.NoSuchMethodException {
        k();
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f21562b, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) f21565e.invoke(null, objNewInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    private java.io.File j(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            java.lang.String str = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (android.system.OsConstants.S_ISREG(android.system.Os.stat(str).st_mode)) {
                return new java.io.File(str);
            }
        } catch (android.system.ErrnoException unused) {
        }
        return null;
    }

    private static void k() throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method2;
        if (f21566f) {
            return;
        }
        f21566f = true;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            java.lang.reflect.Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e6) {
            e6.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f21563c = constructor;
        f21562b = cls;
        f21564d = method2;
        f21565e = method;
    }

    private static java.lang.Object l() throws java.lang.NoSuchMethodException {
        k();
        try {
            return f21563c.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface a(android.content.Context context, androidx.core.content.res.e.c cVar, android.content.res.Resources resources, int i6) throws java.lang.NoSuchMethodException {
        java.lang.Object objL = l();
        for (androidx.core.content.res.e.d dVar : cVar.a()) {
            java.io.File fileE = androidx.core.graphics.p.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!androidx.core.graphics.p.c(fileE, resources, dVar.b())) {
                    fileE.delete();
                    return null;
                }
                boolean zH = h(objL, fileE.getPath(), dVar.e(), dVar.f());
                fileE.delete();
                if (!zH) {
                    return null;
                }
            } catch (java.lang.RuntimeException unused) {
                fileE.delete();
                return null;
            } catch (java.lang.Throwable th) {
                fileE.delete();
                throw th;
            }
        }
        return i(objL);
    }

    @Override // androidx.core.graphics.o
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                java.io.File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ != null && fileJ.canRead()) {
                    android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(fileJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    android.graphics.Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
