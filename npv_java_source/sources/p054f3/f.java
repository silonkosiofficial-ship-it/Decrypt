package p054f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p084i3.a f44953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Map f44954b = new java.util.HashMap();

        public f3.f.a a(W2.e eVar, f3.f.b bVar) {
            this.f44954b.put(eVar, bVar);
            return this;
        }

        public p054f3.f b() {
            if (this.f44953a == null) {
                throw new java.lang.NullPointerException("missing required property: clock");
            }
            if (this.f44954b.keySet().size() < W2.e.values().length) {
                throw new java.lang.IllegalStateException("Not all priorities have been configured");
            }
            java.util.Map map = this.f44954b;
            this.f44954b = new java.util.HashMap();
            return p054f3.f.d(this.f44953a, map);
        }

        public f3.f.a c(p084i3.a aVar) {
            this.f44953a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract f3.f.b a();

            public abstract f3.f.b.a b(long j6);

            public abstract f3.f.b.a c(java.util.Set set);

            public abstract f3.f.b.a d(long j6);
        }

        public static f3.f.b.a a() {
            return new f3.c.b().c(java.util.Collections.emptySet());
        }

        abstract long b();

        abstract java.util.Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i6, long j6) {
        int i10 = i6 - 1;
        return (long) (java.lang.Math.pow(3.0d, i10) * j6 * java.lang.Math.max(1.0d, java.lang.Math.log(10000.0d) / java.lang.Math.log((j6 > 1 ? j6 : 2L) * ((long) i10))));
    }

    public static f3.f.a b() {
        return new f3.f.a();
    }

    static p054f3.f d(p084i3.a aVar, java.util.Map map) {
        return new p054f3.b(aVar, map);
    }

    public static p054f3.f f(p084i3.a aVar) {
        return b().a(W2.e.DEFAULT, f3.f.b.a().b(30000L).d(86400000L).a()).a(W2.e.HIGHEST, f3.f.b.a().b(1000L).d(86400000L).a()).a(W2.e.VERY_LOW, f3.f.b.a().b(86400000L).d(86400000L).c(i(f3.f.c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static java.util.Set i(java.lang.Object... objArr) {
        return j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(objArr)));
    }

    private void j(android.app.job.JobInfo.Builder builder, java.util.Set set) {
        if (set.contains(f3.f.c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(f3.f.c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(f3.f.c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public android.app.job.JobInfo.Builder c(android.app.job.JobInfo.Builder builder, W2.e eVar, long j6, int i6) {
        builder.setMinimumLatency(g(eVar, j6, i6));
        j(builder, ((f3.f.b) h().get(eVar)).c());
        return builder;
    }

    abstract p084i3.a e();

    public long g(W2.e eVar, long j6, int i6) {
        long jA = j6 - e().a();
        f3.f.b bVar = (f3.f.b) h().get(eVar);
        return java.lang.Math.min(java.lang.Math.max(a(i6, bVar.b()), jA), bVar.d());
    }

    abstract java.util.Map h();
}
