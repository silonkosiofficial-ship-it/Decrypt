package p042e1;

/* JADX INFO: loaded from: classes.dex */
public final class i implements java.lang.Comparable {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final e1.i.a f44589T = new e1.i.a(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f44590U = 8;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static int f44591V = 1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static int f44592W = 1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static int f44593X = 1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static int f44594Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static int f44595Z = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f44596C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.String f44597D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f44598E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f44599F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f44600G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f44601H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f44602I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float[] f44603J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float[] f44604K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private e1.i.b f44605L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p042e1.b[] f44606M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f44607N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f44608O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f44609P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f44610Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f44611R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private java.util.HashSet f44612S;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a() {
            p042e1.i.f44592W++;
        }
    }

    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;


        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f44619I = p157p7.b.a(e());
    }

    public i(e1.i.b bVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(bVar, "type");
        this.f44598E = -1;
        this.f44599F = -1;
        this.f44603J = new float[9];
        this.f44604K = new float[9];
        this.f44606M = new p042e1.b[16];
        this.f44610Q = -1;
        this.f44612S = null;
        this.f44605L = bVar;
    }

    public final boolean A() {
        return this.f44602I;
    }

    public final void B(p042e1.b bVar) {
        int i6 = this.f44607N;
        int i10 = 0;
        while (i10 < i6) {
            if (p247y7.AbstractC7350t.b(this.f44606M[i10], bVar)) {
                int i11 = i6 - 1;
                while (i10 < i11) {
                    p042e1.b[] bVarArr = this.f44606M;
                    int i12 = i10 + 1;
                    bVarArr[i10] = bVarArr[i12];
                    i10 = i12;
                }
                this.f44607N--;
                return;
            }
            i10++;
        }
    }

    public final void C() {
        this.f44597D = null;
        this.f44605L = e1.i.b.UNKNOWN;
        this.f44600G = 0;
        this.f44598E = -1;
        this.f44599F = -1;
        this.f44601H = 0.0f;
        this.f44602I = false;
        this.f44609P = false;
        this.f44610Q = -1;
        this.f44611R = 0.0f;
        int i6 = this.f44607N;
        for (int i10 = 0; i10 < i6; i10++) {
            this.f44606M[i10] = null;
        }
        this.f44607N = 0;
        this.f44608O = 0;
        this.f44596C = false;
        p097j7.AbstractC6872n.y(this.f44604K, 0.0f, 0, 0, 6, null);
    }

    public final void D(float f6) {
        this.f44601H = f6;
    }

    public final void E(p042e1.d dVar, float f6) {
        this.f44601H = f6;
        this.f44602I = true;
        this.f44609P = false;
        this.f44610Q = -1;
        this.f44611R = 0.0f;
        int i6 = this.f44607N;
        this.f44599F = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.b bVar = this.f44606M[i10];
            p247y7.AbstractC7350t.c(bVar);
            bVar.J(dVar, this, false);
        }
        this.f44607N = 0;
    }

    public final void F(int i6) {
        this.f44598E = i6;
    }

    public final void G(boolean z6) {
        this.f44596C = z6;
    }

    public final void H(int i6) {
        this.f44599F = i6;
    }

    public final void I(e1.i.b bVar) {
        this.f44605L = bVar;
    }

    public final void J(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f44597D = str;
    }

    public final void K(int i6) {
        this.f44600G = i6;
    }

    public final void L(e1.i.b bVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(bVar, "type");
        this.f44605L = bVar;
    }

    public final void M(int i6) {
        this.f44608O = i6;
    }

    public final void N(p042e1.d dVar, p042e1.b bVar) {
        int i6 = this.f44607N;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.b bVar2 = this.f44606M[i10];
            p247y7.AbstractC7350t.c(bVar2);
            bVar2.K(dVar, bVar, false);
        }
        this.f44607N = 0;
    }

    public final void i(p042e1.b bVar) {
        int i6 = this.f44607N;
        for (int i10 = 0; i10 < i6; i10++) {
            if (p247y7.AbstractC7350t.b(this.f44606M[i10], bVar)) {
                return;
            }
        }
        int i11 = this.f44607N;
        p042e1.b[] bVarArr = this.f44606M;
        if (i11 >= bVarArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(bVarArr, bVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f44606M = (p042e1.b[]) objArrCopyOf;
        }
        p042e1.b[] bVarArr2 = this.f44606M;
        int i12 = this.f44607N;
        bVarArr2[i12] = bVar;
        this.f44607N = i12 + 1;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(p042e1.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "other");
        return this.f44598E - iVar.f44598E;
    }

    public final float n() {
        return this.f44601H;
    }

    public final int o() {
        return this.f44598E;
    }

    public final boolean q() {
        return this.f44596C;
    }

    public final int r() {
        return this.f44599F;
    }

    public final float[] s() {
        return this.f44604K;
    }

    public final boolean t() {
        return this.f44609P;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str = this.f44597D;
        if (str != null) {
            sb = new java.lang.StringBuilder();
            sb.append("");
            sb.append(str);
        } else {
            int i6 = this.f44598E;
            sb = new java.lang.StringBuilder();
            sb.append("");
            sb.append(i6);
        }
        return sb.toString();
    }

    public final float[] u() {
        return this.f44603J;
    }

    public final int v() {
        return this.f44610Q;
    }

    public final float w() {
        return this.f44611R;
    }

    public final e1.i.b x() {
        return this.f44605L;
    }

    public final int y() {
        return this.f44600G;
    }

    public final int z() {
        return this.f44608O;
    }
}
