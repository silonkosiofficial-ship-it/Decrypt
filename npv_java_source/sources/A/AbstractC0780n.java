package A;

/* JADX INFO: renamed from: A.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0780n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A.AbstractC0780n.b f130a = new A.AbstractC0780n.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final A.AbstractC0780n f131b = A.AbstractC0780n.a.f134e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final A.AbstractC0780n f132c = A.AbstractC0780n.e.f137e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final A.AbstractC0780n f133d = A.AbstractC0780n.c.f135e;

    /* JADX INFO: renamed from: A.n$a */
    private static final class a extends A.AbstractC0780n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final A.AbstractC0780n.a f134e = new A.AbstractC0780n.a();

        private a() {
            super(null);
        }

        @Override // A.AbstractC0780n
        public int a(int i6, Y0.v vVar, D0.X x6, int i10) {
            return i6 / 2;
        }
    }

    /* JADX INFO: renamed from: A.n$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final A.AbstractC0780n a(h0.c.b bVar) {
            return new A.AbstractC0780n.d(bVar);
        }
    }

    /* JADX INFO: renamed from: A.n$c */
    private static final class c extends A.AbstractC0780n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final A.AbstractC0780n.c f135e = new A.AbstractC0780n.c();

        private c() {
            super(null);
        }

        @Override // A.AbstractC0780n
        public int a(int i6, Y0.v vVar, D0.X x6, int i10) {
            if (vVar == Y0.v.Ltr) {
                return i6;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: A.n$d */
    private static final class d extends A.AbstractC0780n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h0.c.b f136e;

        public d(h0.c.b bVar) {
            super(null);
            this.f136e = bVar;
        }

        @Override // A.AbstractC0780n
        public int a(int i6, Y0.v vVar, D0.X x6, int i10) {
            return this.f136e.a(0, i6, vVar);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A.AbstractC0780n.d) && p247y7.AbstractC7350t.b(this.f136e, ((A.AbstractC0780n.d) obj).f136e);
        }

        public int hashCode() {
            return this.f136e.hashCode();
        }

        public java.lang.String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f136e + ')';
        }
    }

    /* JADX INFO: renamed from: A.n$e */
    private static final class e extends A.AbstractC0780n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final A.AbstractC0780n.e f137e = new A.AbstractC0780n.e();

        private e() {
            super(null);
        }

        @Override // A.AbstractC0780n
        public int a(int i6, Y0.v vVar, D0.X x6, int i10) {
            if (vVar == Y0.v.Ltr) {
                return 0;
            }
            return i6;
        }
    }

    private AbstractC0780n() {
    }

    public /* synthetic */ AbstractC0780n(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract int a(int i6, Y0.v vVar, D0.X x6, int i10);

    public java.lang.Integer b(D0.X x6) {
        return null;
    }

    public boolean c() {
        return false;
    }
}
