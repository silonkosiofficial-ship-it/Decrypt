package T4;

/* JADX INFO: loaded from: classes3.dex */
public class b implements T4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile T4.a f12952c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p075h4.a f12953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.Map f12954b;

    class a implements T4.a.InterfaceC0276a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ java.lang.String f12955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ T4.b f12956b;

        a(T4.b bVar, java.lang.String str) {
            this.f12955a = str;
            this.f12956b = bVar;
        }
    }

    private b(p075h4.a aVar) {
        Q3.AbstractC1477p.l(aVar);
        this.f12953a = aVar;
        this.f12954b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public static T4.a g(Q4.f fVar, android.content.Context context, D5.d dVar) {
        Q3.AbstractC1477p.l(fVar);
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.l(dVar);
        Q3.AbstractC1477p.l(context.getApplicationContext());
        if (f12952c == null) {
            synchronized (T4.b.class) {
                try {
                    if (f12952c == null) {
                        android.os.Bundle bundle = new android.os.Bundle(1);
                        if (fVar.u()) {
                            dVar.a(Q4.b.class, new java.util.concurrent.Executor() { // from class: T4.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(java.lang.Runnable runnable) {
                                    runnable.run();
                                }
                            }, new D5.b() { // from class: T4.d
                                @Override // D5.b
                                public final void a(D5.a aVar) {
                                    T4.b.h(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f12952c = new T4.b(com.google.android.gms.internal.measurement.C5997e1.g(context, null, null, null, bundle).w());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f12952c;
    }

    static /* synthetic */ void h(D5.a aVar) {
        throw null;
    }

    private final boolean i(java.lang.String str) {
        return (str.isEmpty() || !this.f12954b.containsKey(str) || this.f12954b.get(str) == null) ? false : true;
    }

    @Override // T4.a
    public T4.a.InterfaceC0276a a(java.lang.String str, T4.a.b bVar) {
        java.lang.Object fVar;
        Q3.AbstractC1477p.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.j(str) || i(str)) {
            return null;
        }
        p075h4.a aVar = this.f12953a;
        if ("fiam".equals(str)) {
            fVar = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
        } else {
            fVar = "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(aVar, bVar) : null;
        }
        if (fVar == null) {
            return null;
        }
        this.f12954b.put(str, fVar);
        return new T4.b.a(this, str);
    }

    @Override // T4.a
    public java.util.Map b(boolean z6) {
        return this.f12953a.m(null, null, z6);
    }

    @Override // T4.a
    public void c(T4.a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.a.g(cVar)) {
            this.f12953a.r(com.google.firebase.analytics.connector.internal.a.b(cVar));
        }
    }

    @Override // T4.a
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.a.e(str2, bundle)) {
            this.f12953a.b(str, str2, bundle);
        }
    }

    @Override // T4.a
    public void d(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.j(str) && com.google.firebase.analytics.connector.internal.a.e(str2, bundle) && com.google.firebase.analytics.connector.internal.a.h(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.d(str, str2, bundle);
            this.f12953a.n(str, str2, bundle);
        }
    }

    @Override // T4.a
    public int e(java.lang.String str) {
        return this.f12953a.l(str);
    }

    @Override // T4.a
    public java.util.List f(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f12953a.g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.a.a((android.os.Bundle) it.next()));
        }
        return arrayList;
    }
}
