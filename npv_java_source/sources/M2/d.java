package M2;

/* JADX INFO: loaded from: classes.dex */
public class d implements N2.c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f6990d = I2.j.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M2.c f6991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N2.c[] f6992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f6993c;

    public d(android.content.Context context, S2.a aVar, M2.c cVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f6991a = cVar;
        this.f6992b = new N2.c[]{new N2.a(applicationContext, aVar), new N2.b(applicationContext, aVar), new N2.h(applicationContext, aVar), new N2.d(applicationContext, aVar), new N2.g(applicationContext, aVar), new N2.f(applicationContext, aVar), new N2.e(applicationContext, aVar)};
        this.f6993c = new java.lang.Object();
    }

    @Override // N2.c.a
    public void a(java.util.List list) {
        synchronized (this.f6993c) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (c(str)) {
                        I2.j.c().a(f6990d, java.lang.String.format("Constraints met for %s", str), new java.lang.Throwable[0]);
                        arrayList.add(str);
                    }
                }
                M2.c cVar = this.f6991a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // N2.c.a
    public void b(java.util.List list) {
        synchronized (this.f6993c) {
            try {
                M2.c cVar = this.f6991a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(java.lang.String str) {
        synchronized (this.f6993c) {
            try {
                for (N2.c cVar : this.f6992b) {
                    if (cVar.d(str)) {
                        I2.j.c().a(f6990d, java.lang.String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new java.lang.Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void d(java.lang.Iterable iterable) {
        synchronized (this.f6993c) {
            try {
                for (N2.c cVar : this.f6992b) {
                    cVar.g(null);
                }
                for (N2.c cVar2 : this.f6992b) {
                    cVar2.e(iterable);
                }
                for (N2.c cVar3 : this.f6992b) {
                    cVar3.g(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f6993c) {
            try {
                for (N2.c cVar : this.f6992b) {
                    cVar.f();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
