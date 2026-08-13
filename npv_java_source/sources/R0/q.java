package R0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final R0.q.a f9331D = new R0.q.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final R0.q f9332E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final R0.q f9333F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final R0.q f9334G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final R0.q f9335H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final R0.q f9336I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final R0.q f9337J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final R0.q f9338K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final R0.q f9339L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final R0.q f9340M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final R0.q f9341N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final R0.q f9342O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final R0.q f9343P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final R0.q f9344Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final R0.q f9345R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final R0.q f9346S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final R0.q f9347T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final R0.q f9348U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final R0.q f9349V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final java.util.List f9350W;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f9351C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R0.q a() {
            return R0.q.f9347T;
        }

        public final R0.q b() {
            return R0.q.f9348U;
        }

        public final R0.q c() {
            return R0.q.f9345R;
        }

        public final R0.q d() {
            return R0.q.f9344Q;
        }

        public final R0.q e() {
            return R0.q.f9337J;
        }
    }

    static {
        R0.q qVar = new R0.q(100);
        f9332E = qVar;
        R0.q qVar2 = new R0.q(200);
        f9333F = qVar2;
        R0.q qVar3 = new R0.q(300);
        f9334G = qVar3;
        R0.q qVar4 = new R0.q(400);
        f9335H = qVar4;
        R0.q qVar5 = new R0.q(500);
        f9336I = qVar5;
        R0.q qVar6 = new R0.q(600);
        f9337J = qVar6;
        R0.q qVar7 = new R0.q(700);
        f9338K = qVar7;
        R0.q qVar8 = new R0.q(800);
        f9339L = qVar8;
        R0.q qVar9 = new R0.q(900);
        f9340M = qVar9;
        f9341N = qVar;
        f9342O = qVar2;
        f9343P = qVar3;
        f9344Q = qVar4;
        f9345R = qVar5;
        f9346S = qVar6;
        f9347T = qVar7;
        f9348U = qVar8;
        f9349V = qVar9;
        f9350W = p097j7.AbstractC6879v.p(qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9);
    }

    public q(int i6) {
        this.f9351C = i6;
        if (1 > i6 || i6 >= 1001) {
            throw new java.lang.IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i6).toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R0.q) && this.f9351C == ((R0.q) obj).f9351C;
    }

    public int hashCode() {
        return this.f9351C;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(R0.q qVar) {
        return p247y7.AbstractC7350t.g(this.f9351C, qVar.f9351C);
    }

    public final int q() {
        return this.f9351C;
    }

    public java.lang.String toString() {
        return "FontWeight(weight=" + this.f9351C + ')';
    }
}
