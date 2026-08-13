package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.core.graphics.o f21559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p170r.C7048x f21560b;

    public static class a extends y1.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.core.content.res.h.e f21561a;

        public a(androidx.core.content.res.h.e eVar) {
            this.f21561a = eVar;
        }

        @Override // y1.h.c
        public void a(int i6) {
            androidx.core.content.res.h.e eVar = this.f21561a;
            if (eVar != null) {
                eVar.f(i6);
            }
        }

        @Override // y1.h.c
        public void b(android.graphics.Typeface typeface) {
            androidx.core.content.res.h.e eVar = this.f21561a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        androidx.core.graphics.o jVar;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            jVar = new androidx.core.graphics.n();
        } else if (i6 >= 28) {
            jVar = new androidx.core.graphics.m();
        } else if (i6 >= 26) {
            jVar = new androidx.core.graphics.l();
        } else {
            jVar = (i6 < 24 || !androidx.core.graphics.k.j()) ? new androidx.core.graphics.j() : new androidx.core.graphics.k();
        }
        f21559a = jVar;
        f21560b = new p170r.C7048x(16);
    }

    public static android.graphics.Typeface a(android.content.Context context, android.graphics.Typeface typeface, int i6) {
        if (context != null) {
            return android.graphics.Typeface.create(typeface, i6);
        }
        throw new java.lang.IllegalArgumentException("Context cannot be null");
    }

    public static android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6) {
        return f21559a.b(context, cancellationSignal, bVarArr, i6);
    }

    public static android.graphics.Typeface c(android.content.Context context, androidx.core.content.res.e.b bVar, android.content.res.Resources resources, int i6, java.lang.String str, int i10, int i11, androidx.core.content.res.h.e eVar, android.os.Handler handler, boolean z6) {
        android.graphics.Typeface typefaceA;
        if (bVar instanceof androidx.core.content.res.e.C0405e) {
            androidx.core.content.res.e.C0405e c0405e = (androidx.core.content.res.e.C0405e) bVar;
            android.graphics.Typeface typefaceG = g(c0405e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = p242y1.h.c(context, c0405e.b(), i11, !z6 ? eVar != null : c0405e.a() != 0, z6 ? c0405e.d() : -1, androidx.core.content.res.h.e.e(handler), new androidx.core.graphics.i.a(eVar));
        } else {
            typefaceA = f21559a.a(context, (androidx.core.content.res.e.c) bVar, resources, i11);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f21560b.d(e(resources, i6, str, i10, i11), typefaceA);
        }
        return typefaceA;
    }

    public static android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i6, java.lang.String str, int i10, int i11) {
        android.graphics.Typeface typefaceD = f21559a.d(context, resources, i6, str, i11);
        if (typefaceD != null) {
            f21560b.d(e(resources, i6, str, i10, i11), typefaceD);
        }
        return typefaceD;
    }

    private static java.lang.String e(android.content.res.Resources resources, int i6, java.lang.String str, int i10, int i11) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i10 + '-' + i6 + '-' + i11;
    }

    public static android.graphics.Typeface f(android.content.res.Resources resources, int i6, java.lang.String str, int i10, int i11) {
        return (android.graphics.Typeface) f21560b.c(e(resources, i6, str, i10, i11));
    }

    private static android.graphics.Typeface g(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, 0);
        android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
