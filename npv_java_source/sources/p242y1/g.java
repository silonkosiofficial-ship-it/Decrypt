package p242y1;

/* JADX INFO: loaded from: classes.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p170r.C7048x f57174a = new p170r.C7048x(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.ExecutorService f57175b = p242y1.i.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.Object f57176c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p170r.Y f57177d = new p170r.Y();

    class a implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f57178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Context f57179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p242y1.f f57180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f57181d;

        a(java.lang.String str, android.content.Context context, p242y1.f fVar, int i6) {
            this.f57178a = str;
            this.f57179b = context;
            this.f57180c = fVar;
            this.f57181d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y1.g.e call() {
            return p242y1.g.c(this.f57178a, this.f57179b, this.f57180c, this.f57181d);
        }
    }

    class b implements B1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p242y1.a f57182a;

        b(p242y1.a aVar) {
            this.f57182a = aVar;
        }

        @Override // B1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(y1.g.e eVar) {
            if (eVar == null) {
                eVar = new y1.g.e(-3);
            }
            this.f57182a.b(eVar);
        }
    }

    class c implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f57183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Context f57184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p242y1.f f57185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f57186d;

        c(java.lang.String str, android.content.Context context, p242y1.f fVar, int i6) {
            this.f57183a = str;
            this.f57184b = context;
            this.f57185c = fVar;
            this.f57186d = i6;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y1.g.e call() {
            try {
                return p242y1.g.c(this.f57183a, this.f57184b, this.f57185c, this.f57186d);
            } catch (java.lang.Throwable unused) {
                return new y1.g.e(-3);
            }
        }
    }

    class d implements B1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f57187a;

        d(java.lang.String str) {
            this.f57187a = str;
        }

        @Override // B1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(y1.g.e eVar) {
            synchronized (p242y1.g.f57176c) {
                try {
                    p170r.Y y6 = p242y1.g.f57177d;
                    java.util.ArrayList arrayList = (java.util.ArrayList) y6.get(this.f57187a);
                    if (arrayList == null) {
                        return;
                    }
                    y6.remove(this.f57187a);
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        ((B1.a) arrayList.get(i6)).accept(eVar);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.graphics.Typeface f57188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f57189b;

        e(int i6) {
            this.f57188a = null;
            this.f57189b = i6;
        }

        e(android.graphics.Typeface typeface) {
            this.f57188a = typeface;
            this.f57189b = 0;
        }

        boolean a() {
            return this.f57189b == 0;
        }
    }

    private static java.lang.String a(p242y1.f fVar, int i6) {
        return fVar.d() + "-" + i6;
    }

    private static int b(y1.h.a aVar) {
        int i6 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        y1.h.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i6 = 0;
            for (y1.h.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i6;
    }

    static y1.g.e c(java.lang.String str, android.content.Context context, p242y1.f fVar, int i6) {
        p170r.C7048x c7048x = f57174a;
        android.graphics.Typeface typeface = (android.graphics.Typeface) c7048x.c(str);
        if (typeface != null) {
            return new y1.g.e(typeface);
        }
        try {
            y1.h.a aVarE = p242y1.e.e(context, fVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new y1.g.e(iB);
            }
            android.graphics.Typeface typefaceB = androidx.core.graphics.i.b(context, null, aVarE.b(), i6);
            if (typefaceB == null) {
                return new y1.g.e(-3);
            }
            c7048x.d(str, typefaceB);
            return new y1.g.e(typefaceB);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new y1.g.e(-1);
        }
    }

    static android.graphics.Typeface d(android.content.Context context, p242y1.f fVar, int i6, java.util.concurrent.Executor executor, p242y1.a aVar) {
        java.lang.String strA = a(fVar, i6);
        android.graphics.Typeface typeface = (android.graphics.Typeface) f57174a.c(strA);
        if (typeface != null) {
            aVar.b(new y1.g.e(typeface));
            return typeface;
        }
        y1.g.b bVar = new y1.g.b(aVar);
        synchronized (f57176c) {
            try {
                p170r.Y y6 = f57177d;
                java.util.ArrayList arrayList = (java.util.ArrayList) y6.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(bVar);
                y6.put(strA, arrayList2);
                y1.g.c cVar = new y1.g.c(strA, context, fVar, i6);
                if (executor == null) {
                    executor = f57175b;
                }
                p242y1.i.b(executor, cVar, new y1.g.d(strA));
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static android.graphics.Typeface e(android.content.Context context, p242y1.f fVar, p242y1.a aVar, int i6, int i10) {
        java.lang.String strA = a(fVar, i6);
        android.graphics.Typeface typeface = (android.graphics.Typeface) f57174a.c(strA);
        if (typeface != null) {
            aVar.b(new y1.g.e(typeface));
            return typeface;
        }
        if (i10 == -1) {
            y1.g.e eVarC = c(strA, context, fVar, i6);
            aVar.b(eVarC);
            return eVarC.f57188a;
        }
        try {
            y1.g.e eVar = (y1.g.e) p242y1.i.c(f57175b, new y1.g.a(strA, context, fVar, i6), i10);
            aVar.b(eVar);
            return eVar.f57188a;
        } catch (java.lang.InterruptedException unused) {
            aVar.b(new y1.g.e(-3));
            return null;
        }
    }
}
