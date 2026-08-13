package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.util.concurrent.ConcurrentHashMap f21578a = new j$.util.concurrent.ConcurrentHashMap();

    class a implements androidx.core.graphics.o.b {
        a() {
        }

        @Override // androidx.core.graphics.o.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(y1.h.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.o.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(y1.h.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(java.lang.Object obj);

        boolean b(java.lang.Object obj);
    }

    o() {
    }

    private static java.lang.Object e(java.lang.Object[] objArr, int i6, androidx.core.graphics.o.b bVar) {
        return f(objArr, (i6 & 1) == 0 ? 400 : 700, (i6 & 2) != 0, bVar);
    }

    private static java.lang.Object f(java.lang.Object[] objArr, int i6, boolean z6, androidx.core.graphics.o.b bVar) {
        java.lang.Object obj = null;
        int i10 = Integer.MAX_VALUE;
        for (java.lang.Object obj2 : objArr) {
            int iAbs = (java.lang.Math.abs(bVar.a(obj2) - i6) * 2) + (bVar.b(obj2) == z6 ? 0 : 1);
            if (obj == null || i10 > iAbs) {
                obj = obj2;
                i10 = iAbs;
            }
        }
        return obj;
    }

    public abstract android.graphics.Typeface a(android.content.Context context, androidx.core.content.res.e.c cVar, android.content.res.Resources resources, int i6);

    public abstract android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, y1.h.b[] bVarArr, int i6);

    protected android.graphics.Typeface c(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File fileE = androidx.core.graphics.p.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.p.d(fileE, inputStream)) {
                return android.graphics.Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i6, java.lang.String str, int i10) {
        java.io.File fileE = androidx.core.graphics.p.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (androidx.core.graphics.p.c(fileE, resources, i6)) {
                return android.graphics.Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected y1.h.b g(y1.h.b[] bVarArr, int i6) {
        return (y1.h.b) e(bVarArr, i6, new androidx.core.graphics.o.a());
    }
}
