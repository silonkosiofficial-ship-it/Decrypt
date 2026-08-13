package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends p143o2.n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f23849p = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    class a implements z2.e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f23850a;

        a(android.content.Context context) {
            this.f23850a = context;
        }

        @Override // z2.e.c
        public p253z2.e a(z2.e.b bVar) {
            z2.e.b.a aVarA = z2.e.b.a(this.f23850a);
            aVarA.c(bVar.f57643b).b(bVar.f57644c).d(true);
            return new A2.f().a(aVarA.a());
        }
    }

    class b extends o2.n.b {
        b() {
        }

        @Override // o2.n.b
        public void f(p253z2.d dVar) {
            super.f(dVar);
            dVar.u();
            try {
                dVar.B(androidx.work.impl.WorkDatabase.T());
                dVar.i0();
            } finally {
                dVar.B0();
            }
        }
    }

    public static androidx.work.impl.WorkDatabase P(android.content.Context context, java.util.concurrent.Executor executor, boolean z6) {
        o2.n.a aVarA;
        if (z6) {
            aVarA = p143o2.l.b(context, androidx.work.impl.WorkDatabase.class).d();
        } else {
            aVarA = p143o2.l.a(context, androidx.work.impl.WorkDatabase.class, J2.h.d());
            aVarA.h(new androidx.work.impl.WorkDatabase.a(context));
        }
        return (androidx.work.impl.WorkDatabase) aVarA.k(executor).a(R()).b(androidx.work.impl.a.f23859a).b(new androidx.work.impl.a.h(context, 2, 3)).b(androidx.work.impl.a.f23860b).b(androidx.work.impl.a.f23861c).b(new androidx.work.impl.a.h(context, 5, 6)).b(androidx.work.impl.a.f23862d).b(androidx.work.impl.a.f23863e).b(androidx.work.impl.a.f23864f).b(new androidx.work.impl.a.i(context)).b(new androidx.work.impl.a.h(context, 10, 11)).b(androidx.work.impl.a.f23865g).f().e();
    }

    static o2.n.b R() {
        return new androidx.work.impl.WorkDatabase.b();
    }

    static long S() {
        return java.lang.System.currentTimeMillis() - f23849p;
    }

    static java.lang.String T() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + S() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract Q2.b Q();

    public abstract Q2.e U();

    public abstract Q2.h V();

    public abstract Q2.k W();

    public abstract Q2.n X();

    public abstract Q2.q Y();

    public abstract Q2.t Z();
}
