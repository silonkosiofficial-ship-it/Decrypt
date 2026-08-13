package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f21514a = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.WeakHashMap f21515b = new java.util.WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f21516c = new java.lang.Object();

    static class a {
        static android.graphics.drawable.Drawable a(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
            return resources.getDrawable(i6, theme);
        }

        static android.graphics.drawable.Drawable b(android.content.res.Resources resources, int i6, int i10, android.content.res.Resources.Theme theme) {
            return resources.getDrawableForDensity(i6, i10, theme);
        }
    }

    static class b {
        static int a(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
            return resources.getColor(i6, theme);
        }

        static android.content.res.ColorStateList b(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
            return resources.getColorStateList(i6, theme);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.res.ColorStateList f21517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.res.Configuration f21518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f21519c;

        c(android.content.res.ColorStateList colorStateList, android.content.res.Configuration configuration, android.content.res.Resources.Theme theme) {
            this.f21517a = colorStateList;
            this.f21518b = configuration;
            this.f21519c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.res.Resources f21520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.res.Resources.Theme f21521b;

        d(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            this.f21520a = resources;
            this.f21521b = theme;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || androidx.core.content.res.h.d.class != obj.getClass()) {
                return false;
            }
            androidx.core.content.res.h.d dVar = (androidx.core.content.res.h.d) obj;
            return this.f21520a.equals(dVar.f21520a) && B1.c.a(this.f21521b, dVar.f21521b);
        }

        public int hashCode() {
            return B1.c.b(this.f21520a, this.f21521b);
        }
    }

    public static abstract class e {
        public static android.os.Handler e(android.os.Handler handler) {
            return handler == null ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler;
        }

        public final void c(final int i6, android.os.Handler handler) {
            e(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21524C.f(i6);
                }
            });
        }

        public final void d(final android.graphics.Typeface typeface, android.os.Handler handler) {
            e(handler).post(new java.lang.Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21522C.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i6);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(android.graphics.Typeface typeface);
    }

    private static void a(androidx.core.content.res.h.d dVar, int i6, android.content.res.ColorStateList colorStateList, android.content.res.Resources.Theme theme) {
        synchronized (f21516c) {
            try {
                java.util.WeakHashMap weakHashMap = f21515b;
                android.util.SparseArray sparseArray = (android.util.SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i6, new androidx.core.content.res.h.c(colorStateList, dVar.f21520a.getConfiguration(), theme));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f21519c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.d r5, int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.h.f21516c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = androidx.core.content.res.h.f21515b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f21518b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f21520a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f21521b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f21519c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f21519c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f21517a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    public static android.graphics.Typeface c(android.content.Context context, int i6) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, new android.util.TypedValue(), 0, null, null, false, true);
    }

    public static android.content.res.ColorStateList d(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        androidx.core.content.res.h.d dVar = new androidx.core.content.res.h.d(resources, theme);
        android.content.res.ColorStateList colorStateListB = b(dVar, i6);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        android.content.res.ColorStateList colorStateListK = k(resources, i6, theme);
        if (colorStateListK == null) {
            return androidx.core.content.res.h.b.b(resources, i6, theme);
        }
        a(dVar, i6, colorStateListK, theme);
        return colorStateListK;
    }

    public static android.graphics.drawable.Drawable e(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.h.a.a(resources, i6, theme);
    }

    public static android.graphics.drawable.Drawable f(android.content.res.Resources resources, int i6, int i10, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.h.a.b(resources, i6, i10, theme);
    }

    public static android.graphics.Typeface g(android.content.Context context, int i6) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, new android.util.TypedValue(), 0, null, null, false, false);
    }

    public static android.graphics.Typeface h(android.content.Context context, int i6, android.util.TypedValue typedValue, int i10, androidx.core.content.res.h.e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i6, typedValue, i10, eVar, null, true, false);
    }

    public static void i(android.content.Context context, int i6, androidx.core.content.res.h.e eVar, android.os.Handler handler) {
        B1.i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i6, new android.util.TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static android.util.TypedValue j() {
        java.lang.ThreadLocal threadLocal = f21514a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static android.content.res.ColorStateList k(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        if (l(resources, i6)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i6), theme);
        } catch (java.lang.Exception e6) {
            return null;
        }
    }

    private static boolean l(android.content.res.Resources resources, int i6) {
        android.util.TypedValue typedValueJ = j();
        resources.getValue(i6, typedValueJ, true);
        int i10 = typedValueJ.type;
        return i10 >= 28 && i10 <= 31;
    }

    private static android.graphics.Typeface m(android.content.Context context, int i6, android.util.TypedValue typedValue, int i10, androidx.core.content.res.h.e eVar, android.os.Handler handler, boolean z6, boolean z10) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        android.graphics.Typeface typefaceN = n(context, resources, typedValue, i6, i10, eVar, handler, z6, z10);
        if (typefaceN != null || eVar != null || z10) {
            return typefaceN;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i6) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    private static android.graphics.Typeface n(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i6, int i10, androidx.core.content.res.h.e eVar, android.os.Handler handler, boolean z6, boolean z10) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i6) + "\" (" + java.lang.Integer.toHexString(i6) + ") is not a Font: " + typedValue);
        }
        java.lang.String string = charSequence.toString();
        int i11 = 0;
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        android.graphics.Typeface typefaceF = androidx.core.graphics.i.f(resources, i6, string, typedValue.assetCookie, i10);
        if (typefaceF != null) {
            if (eVar != null) {
                eVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z10) {
            return null;
        }
        try {
            try {
                if (string.toLowerCase().endsWith(".xml")) {
                    androidx.core.content.res.e.b bVarB = androidx.core.content.res.e.b(resources.getXml(i6), resources);
                    if (bVarB != null) {
                        return androidx.core.graphics.i.c(context, bVarB, resources, i6, string, typedValue.assetCookie, i10, eVar, handler, z6);
                    }
                    if (eVar != null) {
                        eVar.c(-3, handler);
                    }
                    return null;
                }
                android.graphics.Typeface typefaceD = androidx.core.graphics.i.d(context, resources, i6, string, typedValue.assetCookie, i10);
                if (eVar != null) {
                    if (typefaceD != null) {
                        eVar.d(typefaceD, handler);
                    } else {
                        eVar.c(-3, handler);
                    }
                }
                return typefaceD;
            } catch (java.io.IOException e6) {
                sb = new java.lang.StringBuilder();
                str = "Failed to read xml resource ";
                sb.append(str);
                sb.append(string);
                sb.toString();
                if (eVar != null) {
                    return null;
                }
                eVar.c(i11, handler);
                return null;
            } catch (org.xmlpull.v1.XmlPullParserException e10) {
                sb = new java.lang.StringBuilder();
                str = "Failed to parse xml resource ";
                sb.append(str);
                sb.append(string);
                sb.toString();
                if (eVar != null) {
                    return null;
                }
                eVar.c(i11, handler);
                return null;
            }
        } catch (java.io.IOException e11) {
            i11 = -3;
        } catch (org.xmlpull.v1.XmlPullParserException e12) {
            i11 = -3;
        }
    }
}
