package p123m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2.n.b f50472a = new m2.n.b(null);

    private static final class a extends p123m2.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.adservices.measurement.MeasurementManager f50473b;

        public a(android.adservices.measurement.MeasurementManager measurementManager) {
            p247y7.AbstractC7350t.f(measurementManager, "mMeasurementManager");
            this.f50473b = measurementManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) p123m2.f.a());
            p247y7.AbstractC7350t.e(systemService, "context.getSystemService…:class.java\n            )");
            this(p123m2.g.a(systemService));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.DeletionRequest k(p123m2.a aVar) {
            p123m2.k.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebSourceRegistrationRequest l(p123m2.o oVar) {
            p123m2.l.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebTriggerRegistrationRequest m(p123m2.p pVar) {
            p123m2.c.a();
            throw null;
        }

        @Override // p123m2.n
        public java.lang.Object a(p123m2.a aVar, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.deleteRegistrations(k(aVar), new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        }

        @Override // p123m2.n
        public java.lang.Object b(p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.getMeasurementApiStatus(new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX;
        }

        @Override // p123m2.n
        public java.lang.Object c(android.net.Uri uri, android.view.InputEvent inputEvent, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.registerSource(uri, inputEvent, new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        }

        @Override // p123m2.n
        public java.lang.Object d(android.net.Uri uri, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.registerTrigger(uri, new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        }

        @Override // p123m2.n
        public java.lang.Object e(p123m2.o oVar, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.registerWebSource(l(oVar), new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        }

        @Override // p123m2.n
        public java.lang.Object f(p123m2.p pVar, p127m7.e eVar) {
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
            c1798n.E();
            this.f50473b.registerWebTrigger(m(pVar), new p123m2.m(), androidx.core.os.r.a(c1798n));
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p123m2.n a(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("AdServicesInfo.version=");
            p083i2.b bVar = p083i2.b.f46656a;
            sb.append(bVar.a());
            sb.toString();
            if (bVar.a() >= 5) {
                return new m2.n.a(context);
            }
            return null;
        }
    }

    public abstract java.lang.Object a(p123m2.a aVar, p127m7.e eVar);

    public abstract java.lang.Object b(p127m7.e eVar);

    public abstract java.lang.Object c(android.net.Uri uri, android.view.InputEvent inputEvent, p127m7.e eVar);

    public abstract java.lang.Object d(android.net.Uri uri, p127m7.e eVar);

    public abstract java.lang.Object e(p123m2.o oVar, p127m7.e eVar);

    public abstract java.lang.Object f(p123m2.p pVar, p127m7.e eVar);
}
