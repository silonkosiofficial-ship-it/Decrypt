package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class L1 {

    public static final class a extends p141o0.L1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p141o0.Q1 f52143a;

        public a(p141o0.Q1 q6) {
            super(null);
            this.f52143a = q6;
        }

        @Override // p141o0.L1
        public p131n0.i a() {
            return this.f52143a.getBounds();
        }

        public final p141o0.Q1 b() {
            return this.f52143a;
        }
    }

    public static final class b extends p141o0.L1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p131n0.i f52144a;

        public b(p131n0.i iVar) {
            super(null);
            this.f52144a = iVar;
        }

        @Override // p141o0.L1
        public p131n0.i a() {
            return this.f52144a;
        }

        public final p131n0.i b() {
            return this.f52144a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0.L1.b) && p247y7.AbstractC7350t.b(this.f52144a, ((o0.L1.b) obj).f52144a);
        }

        public int hashCode() {
            return this.f52144a.hashCode();
        }
    }

    public static final class c extends p141o0.L1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p131n0.k f52145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p141o0.Q1 f52146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p131n0.k kVar) {
            super(0 == true ? 1 : 0);
            p141o0.Q1 q6 = null;
            this.f52145a = kVar;
            if (!p131n0.l.e(kVar)) {
                p141o0.Q1 q1A = p141o0.Y.a();
                p141o0.P1.c(q1A, kVar, null, 2, null);
                q6 = q1A;
            }
            this.f52146b = q6;
        }

        @Override // p141o0.L1
        public p131n0.i a() {
            return p131n0.l.d(this.f52145a);
        }

        public final p131n0.k b() {
            return this.f52145a;
        }

        public final p141o0.Q1 c() {
            return this.f52146b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0.L1.c) && p247y7.AbstractC7350t.b(this.f52145a, ((o0.L1.c) obj).f52145a);
        }

        public int hashCode() {
            return this.f52145a.hashCode();
        }
    }

    private L1() {
    }

    public /* synthetic */ L1(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract p131n0.i a();
}
