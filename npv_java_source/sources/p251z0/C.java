package p251z0;

/* JADX INFO: loaded from: classes.dex */
final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.C7046v f57472a = new p170r.C7046v(0, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f57473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f57474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f57475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f57476d;

        private a(long j6, long j10, boolean z6, int i6) {
            this.f57473a = j6;
            this.f57474b = j10;
            this.f57475c = z6;
            this.f57476d = i6;
        }

        public /* synthetic */ a(long j6, long j10, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(j6, j10, z6, i6);
        }

        public final boolean a() {
            return this.f57475c;
        }

        public final long b() {
            return this.f57474b;
        }

        public final long c() {
            return this.f57473a;
        }
    }

    public final void a() {
        this.f57472a.b();
    }

    public final p251z0.C7372h b(p251z0.D d6, p251z0.Q q6) {
        long jK;
        boolean zA;
        long jS;
        p170r.C7046v c7046v = new p170r.C7046v(d6.b().size());
        java.util.List listB = d6.b();
        int size = listB.size();
        for (int i6 = 0; i6 < size; i6++) {
            p251z0.E e6 = (p251z0.E) listB.get(i6);
            z0.C.a aVar = (z0.C.a) this.f57472a.e(e6.d());
            if (aVar == null) {
                jK = e6.k();
                jS = e6.f();
                zA = false;
            } else {
                long jC = aVar.c();
                jK = jC;
                zA = aVar.a();
                jS = q6.s(aVar.b());
            }
            c7046v.m(e6.d(), new p251z0.B(e6.d(), e6.k(), e6.f(), e6.b(), e6.h(), jK, jS, zA, false, e6.j(), e6.c(), e6.i(), e6.e(), null));
            if (e6.b()) {
                this.f57472a.m(e6.d(), new z0.C.a(e6.k(), e6.g(), e6.b(), e6.j(), null));
            } else {
                this.f57472a.n(e6.d());
            }
        }
        return new p251z0.C7372h(c7046v, d6);
    }
}
