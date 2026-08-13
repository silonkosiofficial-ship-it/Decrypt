package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.util.SparseArray f20734C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.ArrayList f20735D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected p172r1.f f20736E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f20737F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f20738G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f20739H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f20740I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected boolean f20741J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f20742K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.constraintlayout.widget.e f20743L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected androidx.constraintlayout.widget.d f20744M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f20745N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.HashMap f20746O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f20747P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f20748Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    int f20749R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f20750S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f20751T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f20752U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private android.util.SparseArray f20753V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    androidx.constraintlayout.widget.ConstraintLayout.c f20754W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f20755a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f20756b0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20757a;

        static {
            int[] iArr = new int[r1.e.b.values().length];
            f20757a = iArr;
            try {
                iArr[r1.e.b.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f20757a[r1.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f20757a[r1.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f20757a[r1.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f20758A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public java.lang.String f20759B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        float f20760C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f20761D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f20762E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f20763F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f20764G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f20765H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f20766I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f20767J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f20768K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f20769L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f20770M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f20771N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f20772O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f20773P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f20774Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f20775R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f20776S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f20777T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f20778U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public java.lang.String f20779V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        boolean f20780W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        boolean f20781X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        boolean f20782Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f20783Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20784a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        boolean f20785a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20786b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        boolean f20787b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20788c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        boolean f20789c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20790d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        int f20791d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20792e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        int f20793e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20794f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        int f20795f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20796g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f20797g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20798h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        int f20799h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20800i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        int f20801i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20802j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        float f20803j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20804k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f20805k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20806l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f20807l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f20808m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        float f20809m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20810n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        p172r1.e f20811n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f20812o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f20813o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f20814p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f20815q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f20816r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f20817s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f20818t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f20819u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f20820v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f20821w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f20822x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f20823y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f20824z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final android.util.SparseIntArray f20825a;

            static {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                f20825a = sparseIntArray;
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21213l2, 8);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21220m2, 9);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21234o2, 10);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21241p2, 11);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21283v2, 12);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21276u2, 13);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21093T1, 14);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21087S1, 15);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21075Q1, 16);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21099U1, 2);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21111W1, 3);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21105V1, 4);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f20998D2, 49);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21004E2, 50);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21136a2, 5);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21143b2, 6);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21150c2, 7);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21142b1, 1);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21248q2, 17);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21255r2, 18);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21129Z1, 19);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21123Y1, 20);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21022H2, 21);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21040K2, 22);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21028I2, 23);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21010F2, 24);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21034J2, 25);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21016G2, 26);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21185h2, 29);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21290w2, 30);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21117X1, 44);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21199j2, 45);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21302y2, 46);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21192i2, 47);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21296x2, 48);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21063O1, 27);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21057N1, 28);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21308z2, 31);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21157d2, 32);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f20986B2, 33);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f20980A2, 34);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f20992C2, 35);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21171f2, 36);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21164e2, 37);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21178g2, 38);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21206k2, 39);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21269t2, 40);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21227n2, 41);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21081R1, 42);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21069P1, 43);
                sparseIntArray.append(androidx.constraintlayout.widget.i.f21262s2, 51);
            }
        }

        public b(int i6, int i10) {
            super(i6, i10);
            this.f20784a = -1;
            this.f20786b = -1;
            this.f20788c = -1.0f;
            this.f20790d = -1;
            this.f20792e = -1;
            this.f20794f = -1;
            this.f20796g = -1;
            this.f20798h = -1;
            this.f20800i = -1;
            this.f20802j = -1;
            this.f20804k = -1;
            this.f20806l = -1;
            this.f20808m = -1;
            this.f20810n = 0;
            this.f20812o = 0.0f;
            this.f20814p = -1;
            this.f20815q = -1;
            this.f20816r = -1;
            this.f20817s = -1;
            this.f20818t = -1;
            this.f20819u = -1;
            this.f20820v = -1;
            this.f20821w = -1;
            this.f20822x = -1;
            this.f20823y = -1;
            this.f20824z = 0.5f;
            this.f20758A = 0.5f;
            this.f20759B = null;
            this.f20760C = 0.0f;
            this.f20761D = 1;
            this.f20762E = -1.0f;
            this.f20763F = -1.0f;
            this.f20764G = 0;
            this.f20765H = 0;
            this.f20766I = 0;
            this.f20767J = 0;
            this.f20768K = 0;
            this.f20769L = 0;
            this.f20770M = 0;
            this.f20771N = 0;
            this.f20772O = 1.0f;
            this.f20773P = 1.0f;
            this.f20774Q = -1;
            this.f20775R = -1;
            this.f20776S = -1;
            this.f20777T = false;
            this.f20778U = false;
            this.f20779V = null;
            this.f20780W = true;
            this.f20781X = true;
            this.f20782Y = false;
            this.f20783Z = false;
            this.f20785a0 = false;
            this.f20787b0 = false;
            this.f20789c0 = false;
            this.f20791d0 = -1;
            this.f20793e0 = -1;
            this.f20795f0 = -1;
            this.f20797g0 = -1;
            this.f20799h0 = -1;
            this.f20801i0 = -1;
            this.f20803j0 = 0.5f;
            this.f20811n0 = new p172r1.e();
            this.f20813o0 = false;
        }

        public b(android.content.Context context, android.util.AttributeSet attributeSet) {
            int i6;
            float fAbs;
            super(context, attributeSet);
            this.f20784a = -1;
            this.f20786b = -1;
            this.f20788c = -1.0f;
            this.f20790d = -1;
            this.f20792e = -1;
            this.f20794f = -1;
            this.f20796g = -1;
            this.f20798h = -1;
            this.f20800i = -1;
            this.f20802j = -1;
            this.f20804k = -1;
            this.f20806l = -1;
            this.f20808m = -1;
            this.f20810n = 0;
            this.f20812o = 0.0f;
            this.f20814p = -1;
            this.f20815q = -1;
            this.f20816r = -1;
            this.f20817s = -1;
            this.f20818t = -1;
            this.f20819u = -1;
            this.f20820v = -1;
            this.f20821w = -1;
            this.f20822x = -1;
            this.f20823y = -1;
            this.f20824z = 0.5f;
            this.f20758A = 0.5f;
            this.f20759B = null;
            this.f20760C = 0.0f;
            this.f20761D = 1;
            this.f20762E = -1.0f;
            this.f20763F = -1.0f;
            this.f20764G = 0;
            this.f20765H = 0;
            this.f20766I = 0;
            this.f20767J = 0;
            this.f20768K = 0;
            this.f20769L = 0;
            this.f20770M = 0;
            this.f20771N = 0;
            this.f20772O = 1.0f;
            this.f20773P = 1.0f;
            this.f20774Q = -1;
            this.f20775R = -1;
            this.f20776S = -1;
            this.f20777T = false;
            this.f20778U = false;
            this.f20779V = null;
            this.f20780W = true;
            this.f20781X = true;
            this.f20782Y = false;
            this.f20783Z = false;
            this.f20785a0 = false;
            this.f20787b0 = false;
            this.f20789c0 = false;
            this.f20791d0 = -1;
            this.f20793e0 = -1;
            this.f20795f0 = -1;
            this.f20797g0 = -1;
            this.f20799h0 = -1;
            this.f20801i0 = -1;
            this.f20803j0 = 0.5f;
            this.f20811n0 = new p172r1.e();
            this.f20813o0 = false;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = androidx.constraintlayout.widget.ConstraintLayout.b.a.f20825a.get(index);
                switch (i11) {
                    case 1:
                        this.f20776S = typedArrayObtainStyledAttributes.getInt(index, this.f20776S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f20808m);
                        this.f20808m = resourceId;
                        if (resourceId == -1) {
                            this.f20808m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f20810n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20810n);
                        break;
                    case 4:
                        float f6 = typedArrayObtainStyledAttributes.getFloat(index, this.f20812o) % 360.0f;
                        this.f20812o = f6;
                        if (f6 < 0.0f) {
                            this.f20812o = (360.0f - f6) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f20784a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20784a);
                        break;
                    case 6:
                        this.f20786b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20786b);
                        break;
                    case 7:
                        this.f20788c = typedArrayObtainStyledAttributes.getFloat(index, this.f20788c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20790d);
                        this.f20790d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f20790d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20792e);
                        this.f20792e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f20792e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20794f);
                        this.f20794f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f20794f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20796g);
                        this.f20796g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f20796g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20798h);
                        this.f20798h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f20798h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20800i);
                        this.f20800i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f20800i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20802j);
                        this.f20802j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f20802j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20804k);
                        this.f20804k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f20804k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20806l);
                        this.f20806l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f20806l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20814p);
                        this.f20814p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f20814p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20815q);
                        this.f20815q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f20815q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20816r);
                        this.f20816r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f20816r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f20817s);
                        this.f20817s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f20817s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        this.f20818t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20818t);
                        break;
                    case 22:
                        this.f20819u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20819u);
                        break;
                    case 23:
                        this.f20820v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20820v);
                        break;
                    case 24:
                        this.f20821w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20821w);
                        break;
                    case 25:
                        this.f20822x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20822x);
                        break;
                    case 26:
                        this.f20823y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20823y);
                        break;
                    case 27:
                        this.f20777T = typedArrayObtainStyledAttributes.getBoolean(index, this.f20777T);
                        break;
                    case 28:
                        this.f20778U = typedArrayObtainStyledAttributes.getBoolean(index, this.f20778U);
                        break;
                    case 29:
                        this.f20824z = typedArrayObtainStyledAttributes.getFloat(index, this.f20824z);
                        break;
                    case 30:
                        this.f20758A = typedArrayObtainStyledAttributes.getFloat(index, this.f20758A);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f20766I = i12;
                        if (i12 == 1) {
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f20767J = i13;
                        if (i13 == 1) {
                        }
                        break;
                    case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        try {
                            this.f20768K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20768K);
                        } catch (java.lang.Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f20768K) == -2) {
                                this.f20768K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f20770M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20770M);
                        } catch (java.lang.Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f20770M) == -2) {
                                this.f20770M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f20772O = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f20772O));
                        this.f20766I = 2;
                        break;
                    case 36:
                        try {
                            this.f20769L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20769L);
                        } catch (java.lang.Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f20769L) == -2) {
                                this.f20769L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f20771N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20771N);
                        } catch (java.lang.Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f20771N) == -2) {
                                this.f20771N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f20773P = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f20773P));
                        this.f20767J = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f20759B = string;
                                this.f20760C = Float.NaN;
                                this.f20761D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f20759B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i6 = 0;
                                    } else {
                                        java.lang.String strSubstring = this.f20759B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f20761D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f20761D = 1;
                                        }
                                        i6 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f20759B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        java.lang.String strSubstring2 = this.f20759B.substring(i6);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = java.lang.Float.parseFloat(strSubstring2);
                                            this.f20760C = fAbs;
                                        }
                                    } else {
                                        java.lang.String strSubstring3 = this.f20759B.substring(i6, iIndexOf2);
                                        java.lang.String strSubstring4 = this.f20759B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f10 = java.lang.Float.parseFloat(strSubstring3);
                                                float f11 = java.lang.Float.parseFloat(strSubstring4);
                                                if (f10 > 0.0f && f11 > 0.0f) {
                                                    fAbs = this.f20761D == 1 ? java.lang.Math.abs(f11 / f10) : java.lang.Math.abs(f10 / f11);
                                                    this.f20760C = fAbs;
                                                }
                                            } catch (java.lang.NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f20762E = typedArrayObtainStyledAttributes.getFloat(index, this.f20762E);
                                break;
                            case 46:
                                this.f20763F = typedArrayObtainStyledAttributes.getFloat(index, this.f20763F);
                                break;
                            case 47:
                                this.f20764G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f20765H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f20774Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20774Q);
                                break;
                            case 50:
                                this.f20775R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20775R);
                                break;
                            case 51:
                                this.f20779V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20784a = -1;
            this.f20786b = -1;
            this.f20788c = -1.0f;
            this.f20790d = -1;
            this.f20792e = -1;
            this.f20794f = -1;
            this.f20796g = -1;
            this.f20798h = -1;
            this.f20800i = -1;
            this.f20802j = -1;
            this.f20804k = -1;
            this.f20806l = -1;
            this.f20808m = -1;
            this.f20810n = 0;
            this.f20812o = 0.0f;
            this.f20814p = -1;
            this.f20815q = -1;
            this.f20816r = -1;
            this.f20817s = -1;
            this.f20818t = -1;
            this.f20819u = -1;
            this.f20820v = -1;
            this.f20821w = -1;
            this.f20822x = -1;
            this.f20823y = -1;
            this.f20824z = 0.5f;
            this.f20758A = 0.5f;
            this.f20759B = null;
            this.f20760C = 0.0f;
            this.f20761D = 1;
            this.f20762E = -1.0f;
            this.f20763F = -1.0f;
            this.f20764G = 0;
            this.f20765H = 0;
            this.f20766I = 0;
            this.f20767J = 0;
            this.f20768K = 0;
            this.f20769L = 0;
            this.f20770M = 0;
            this.f20771N = 0;
            this.f20772O = 1.0f;
            this.f20773P = 1.0f;
            this.f20774Q = -1;
            this.f20775R = -1;
            this.f20776S = -1;
            this.f20777T = false;
            this.f20778U = false;
            this.f20779V = null;
            this.f20780W = true;
            this.f20781X = true;
            this.f20782Y = false;
            this.f20783Z = false;
            this.f20785a0 = false;
            this.f20787b0 = false;
            this.f20789c0 = false;
            this.f20791d0 = -1;
            this.f20793e0 = -1;
            this.f20795f0 = -1;
            this.f20797g0 = -1;
            this.f20799h0 = -1;
            this.f20801i0 = -1;
            this.f20803j0 = 0.5f;
            this.f20811n0 = new p172r1.e();
            this.f20813o0 = false;
        }

        public void a() {
            this.f20783Z = false;
            this.f20780W = true;
            this.f20781X = true;
            int i6 = ((android.view.ViewGroup.MarginLayoutParams) this).width;
            if (i6 == -2 && this.f20777T) {
                this.f20780W = false;
                if (this.f20766I == 0) {
                    this.f20766I = 1;
                }
            }
            int i10 = ((android.view.ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.f20778U) {
                this.f20781X = false;
                if (this.f20767J == 0) {
                    this.f20767J = 1;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.f20780W = false;
                if (i6 == 0 && this.f20766I == 1) {
                    ((android.view.ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f20777T = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f20781X = false;
                if (i10 == 0 && this.f20767J == 1) {
                    ((android.view.ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f20778U = true;
                }
            }
            if (this.f20788c == -1.0f && this.f20784a == -1 && this.f20786b == -1) {
                return;
            }
            this.f20783Z = true;
            this.f20780W = true;
            this.f20781X = true;
            if (!(this.f20811n0 instanceof p172r1.h)) {
                this.f20811n0 = new p172r1.h();
            }
            ((p172r1.h) this.f20811n0).R0(this.f20776S);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:40:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x0087  */
        /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i6) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
            int i15 = ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i6);
            boolean z6 = false;
            boolean z10 = 1 == getLayoutDirection();
            this.f20795f0 = -1;
            this.f20797g0 = -1;
            this.f20791d0 = -1;
            this.f20793e0 = -1;
            this.f20799h0 = this.f20818t;
            this.f20801i0 = this.f20820v;
            float f6 = this.f20824z;
            this.f20803j0 = f6;
            int i16 = this.f20784a;
            this.f20805k0 = i16;
            int i17 = this.f20786b;
            this.f20807l0 = i17;
            float f10 = this.f20788c;
            this.f20809m0 = f10;
            if (z10) {
                int i18 = this.f20814p;
                if (i18 != -1) {
                    this.f20795f0 = i18;
                } else {
                    int i19 = this.f20815q;
                    if (i19 != -1) {
                        this.f20797g0 = i19;
                    } else {
                        i10 = this.f20816r;
                        if (i10 != -1) {
                            this.f20793e0 = i10;
                            z6 = true;
                        }
                        i11 = this.f20817s;
                        if (i11 != -1) {
                            this.f20791d0 = i11;
                            z6 = true;
                        }
                        i12 = this.f20822x;
                        if (i12 != -1) {
                            this.f20801i0 = i12;
                        }
                        i13 = this.f20823y;
                        if (i13 != -1) {
                            this.f20799h0 = i13;
                        }
                        if (z6) {
                            this.f20803j0 = 1.0f - f6;
                        }
                        if (this.f20783Z && this.f20776S == 1) {
                            if (f10 != -1.0f) {
                                this.f20809m0 = 1.0f - f10;
                                this.f20805k0 = -1;
                                this.f20807l0 = -1;
                            } else {
                                if (i16 != -1) {
                                    this.f20807l0 = i16;
                                    this.f20805k0 = -1;
                                } else if (i17 != -1) {
                                    this.f20805k0 = i17;
                                    this.f20807l0 = -1;
                                }
                                this.f20809m0 = -1.0f;
                            }
                        }
                    }
                }
                z6 = true;
                i10 = this.f20816r;
                if (i10 != -1) {
                    this.f20793e0 = i10;
                    z6 = true;
                }
                i11 = this.f20817s;
                if (i11 != -1) {
                    this.f20791d0 = i11;
                    z6 = true;
                }
                i12 = this.f20822x;
                if (i12 != -1) {
                    this.f20801i0 = i12;
                }
                i13 = this.f20823y;
                if (i13 != -1) {
                    this.f20799h0 = i13;
                }
                if (z6) {
                    this.f20803j0 = 1.0f - f6;
                }
                if (this.f20783Z) {
                    if (f10 != -1.0f) {
                        this.f20809m0 = 1.0f - f10;
                        this.f20805k0 = -1;
                        this.f20807l0 = -1;
                    } else {
                        if (i16 != -1) {
                            this.f20807l0 = i16;
                            this.f20805k0 = -1;
                        } else if (i17 != -1) {
                            this.f20805k0 = i17;
                            this.f20807l0 = -1;
                        }
                        this.f20809m0 = -1.0f;
                    }
                }
            } else {
                int i20 = this.f20814p;
                if (i20 != -1) {
                    this.f20793e0 = i20;
                }
                int i21 = this.f20815q;
                if (i21 != -1) {
                    this.f20791d0 = i21;
                }
                int i22 = this.f20816r;
                if (i22 != -1) {
                    this.f20795f0 = i22;
                }
                int i23 = this.f20817s;
                if (i23 != -1) {
                    this.f20797g0 = i23;
                }
                int i24 = this.f20822x;
                if (i24 != -1) {
                    this.f20799h0 = i24;
                }
                int i25 = this.f20823y;
                if (i25 != -1) {
                    this.f20801i0 = i25;
                }
            }
            if (this.f20816r == -1 && this.f20817s == -1 && this.f20815q == -1 && this.f20814p == -1) {
                int i26 = this.f20794f;
                if (i26 != -1) {
                    this.f20795f0 = i26;
                    if (((android.view.ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                } else {
                    int i27 = this.f20796g;
                    if (i27 != -1) {
                        this.f20797g0 = i27;
                        if (((android.view.ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                        }
                    }
                }
                int i28 = this.f20790d;
                if (i28 != -1) {
                    this.f20791d0 = i28;
                    if (((android.view.ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                } else {
                    int i29 = this.f20792e;
                    if (i29 == -1) {
                        return;
                    }
                    this.f20793e0 = i29;
                    if (((android.view.ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                }
                ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = i14;
            }
        }
    }

    class c implements p182s1.b.InterfaceC0704b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.constraintlayout.widget.ConstraintLayout f20826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f20829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f20831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f20832g;

        public c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
            this.f20826a = constraintLayout;
        }

        @Override // p182s1.b.InterfaceC0704b
        public final void a() {
            int childCount = this.f20826a.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                this.f20826a.getChildAt(i6);
            }
            int size = this.f20826a.f20735D.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.constraintlayout.widget.c) this.f20826a.f20735D.get(i10)).j(this.f20826a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:110:0x0180  */
        /* JADX WARN: Code duplicated, block: B:112:0x0184  */
        /* JADX WARN: Code duplicated, block: B:115:0x0192  */
        /* JADX WARN: Code duplicated, block: B:118:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:119:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:122:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:125:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:126:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:129:0x01db  */
        /* JADX WARN: Code duplicated, block: B:132:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:136:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:139:0x01f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:141:0x01ff A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:142:0x0201 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:145:0x020c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:149:0x0214  */
        /* JADX WARN: Code duplicated, block: B:151:0x0218  */
        /* JADX WARN: Code duplicated, block: B:153:0x021e  */
        /* JADX WARN: Code duplicated, block: B:156:0x0234  */
        /* JADX WARN: Code duplicated, block: B:157:0x0236  */
        /* JADX WARN: Code duplicated, block: B:160:0x023c  */
        /* JADX WARN: Code duplicated, block: B:164:0x0244  */
        /* JADX WARN: Code duplicated, block: B:167:0x024b  */
        /* JADX WARN: Code duplicated, block: B:168:0x024d  */
        /* JADX WARN: Code duplicated, block: B:170:0x0250  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00ba A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:52:0x00da  */
        /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ee A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:66:0x0100  */
        /* JADX WARN: Code duplicated, block: B:67:0x0111  */
        /* JADX WARN: Code duplicated, block: B:68:0x011d  */
        /* JADX WARN: Code duplicated, block: B:71:0x012c  */
        /* JADX WARN: Code duplicated, block: B:72:0x012e  */
        /* JADX WARN: Code duplicated, block: B:74:0x0131  */
        /* JADX WARN: Code duplicated, block: B:75:0x0133  */
        /* JADX WARN: Code duplicated, block: B:78:0x0138  */
        /* JADX WARN: Code duplicated, block: B:82:0x013f  */
        /* JADX WARN: Code duplicated, block: B:84:0x0142  */
        /* JADX WARN: Code duplicated, block: B:88:0x0149  */
        /* JADX WARN: Code duplicated, block: B:91:0x014d  */
        /* JADX WARN: Code duplicated, block: B:94:0x0155  */
        /* JADX WARN: Code duplicated, block: B:96:0x0158  */
        /* JADX WARN: Code duplicated, block: B:99:0x0160  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p182s1.b.InterfaceC0704b
        public final void b(p172r1.e eVar, s1.b.a aVar) {
            int iMakeMeasureSpec;
            boolean z6;
            int i6;
            int iMakeMeasureSpec2;
            boolean z10;
            r1.e.b bVar;
            boolean z11;
            boolean z12;
            r1.e.b bVar2;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            androidx.constraintlayout.widget.ConstraintLayout.b bVar3;
            int measuredWidth;
            int measuredHeight;
            int i10;
            int i11;
            int iMin;
            int i12;
            int i13;
            int iMin2;
            int i14;
            int measuredWidth2;
            int measuredHeight2;
            int baseline;
            int i15;
            int i16;
            boolean z17;
            boolean z18;
            int childMeasureSpec;
            int childMeasureSpec2;
            boolean z19;
            boolean z20;
            if (eVar == null) {
                return;
            }
            if (eVar.O() == 8 && !eVar.W()) {
                aVar.f54048e = 0;
                aVar.f54049f = 0;
                aVar.f54050g = 0;
                return;
            }
            r1.e.b bVar4 = aVar.f54044a;
            r1.e.b bVar5 = aVar.f54045b;
            int i17 = aVar.f54046c;
            int i18 = aVar.f54047d;
            int i19 = this.f20827b + this.f20828c;
            int i20 = this.f20829d;
            android.view.View view = (android.view.View) eVar.q();
            int[] iArr = androidx.constraintlayout.widget.ConstraintLayout.a.f20757a;
            int i21 = iArr[bVar4.ordinal()];
            if (i21 != 1) {
                if (i21 == 2) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20831f, i20, -2);
                    eVar.f53679h[2] = -2;
                } else if (i21 == 3) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20831f, i20 + eVar.z(), -1);
                    eVar.f53679h[2] = -1;
                } else if (i21 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20831f, i20, -2);
                    boolean z21 = eVar.f53687l == 1;
                    int[] iArr2 = eVar.f53679h;
                    iArr2[2] = 0;
                    if (aVar.f54053j) {
                        boolean z22 = (!z21 || iArr2[3] == 0 || iArr2[0] == eVar.P()) ? false : true;
                        if (!z21 || z22) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(eVar.P(), 1073741824);
                        }
                        i6 = iArr[bVar5.ordinal()];
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        z10 = false;
                                        iMakeMeasureSpec2 = 0;
                                    } else {
                                        childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                                        if (eVar.f53689m == 1) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        int[] iArr3 = eVar.f53679h;
                                        iArr3[3] = 0;
                                        if (aVar.f54053j) {
                                            if (z19 || iArr3[2] == 0 || iArr3[1] == eVar.v()) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            if (z19 || z20) {
                                                childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                            }
                                        }
                                    }
                                    bVar = r1.e.b.MATCH_CONSTRAINT;
                                    if (bVar4 == bVar) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (bVar5 == bVar) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bVar2 = r1.e.b.MATCH_PARENT;
                                    if (bVar5 != bVar2 || bVar5 == r1.e.b.FIXED) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (bVar4 != bVar2 || bVar4 == r1.e.b.FIXED) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z11 || eVar.f53655Q <= 0.0f) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z12 || eVar.f53655Q <= 0.0f) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                                    if (aVar.f54053j && z11 && eVar.f53687l == 0 && z12 && eVar.f53689m == 0) {
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                        i15 = -1;
                                        i10 = 0;
                                    } else {
                                        if ((view instanceof androidx.constraintlayout.widget.j) || !(eVar instanceof p172r1.l)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((androidx.constraintlayout.widget.j) view).n((p172r1.l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        int baseline2 = view.getBaseline();
                                        if (z6) {
                                            int[] iArr4 = eVar.f53679h;
                                            i10 = 0;
                                            iArr4[0] = measuredWidth;
                                            iArr4[2] = measuredHeight;
                                        } else {
                                            i10 = 0;
                                            int[] iArr5 = eVar.f53679h;
                                            iArr5[0] = 0;
                                            iArr5[2] = 0;
                                        }
                                        if (z10) {
                                            int[] iArr6 = eVar.f53679h;
                                            iArr6[1] = measuredHeight;
                                            iArr6[3] = measuredWidth;
                                        } else {
                                            int[] iArr7 = eVar.f53679h;
                                            iArr7[1] = i10;
                                            iArr7[3] = i10;
                                        }
                                        i11 = eVar.f53693o;
                                        if (i11 > 0) {
                                            iMin = java.lang.Math.max(i11, measuredWidth);
                                        } else {
                                            iMin = measuredWidth;
                                        }
                                        i12 = eVar.f53695p;
                                        if (i12 > 0) {
                                            iMin = java.lang.Math.min(i12, iMin);
                                        }
                                        i13 = eVar.f53699r;
                                        if (i13 > 0) {
                                            iMin2 = java.lang.Math.max(i13, measuredHeight);
                                        } else {
                                            iMin2 = measuredHeight;
                                        }
                                        i14 = eVar.f53701s;
                                        if (i14 > 0) {
                                            iMin2 = java.lang.Math.min(i14, iMin2);
                                        }
                                        if (!z15 && z13) {
                                            iMin = (int) ((iMin2 * eVar.f53655Q) + 0.5f);
                                        } else if (z16 && z14) {
                                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                        }
                                        if (measuredWidth == iMin || measuredHeight != iMin2) {
                                            if (measuredWidth != iMin) {
                                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                            }
                                            if (measuredHeight != iMin2) {
                                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        } else {
                                            measuredWidth2 = iMin;
                                            measuredHeight2 = iMin2;
                                            baseline = baseline2;
                                        }
                                        i15 = -1;
                                    }
                                    if (baseline != i15) {
                                        i16 = 1;
                                    } else {
                                        i16 = i10;
                                    }
                                    if (measuredWidth2 == aVar.f54046c || measuredHeight2 != aVar.f54047d) {
                                        z17 = 1;
                                    } else {
                                        z17 = i10;
                                    }
                                    aVar.f54052i = z17;
                                    if (bVar3.f20782Y) {
                                        z18 = 1;
                                    } else {
                                        z18 = i16;
                                    }
                                    if (z18 != 0 && baseline != -1 && eVar.n() != baseline) {
                                        aVar.f54052i = true;
                                    }
                                    aVar.f54048e = measuredWidth2;
                                    aVar.f54049f = measuredHeight2;
                                    aVar.f54051h = z18;
                                    aVar.f54050g = baseline;
                                }
                                childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19 + eVar.N(), -1);
                                eVar.f53679h[3] = -1;
                                iMakeMeasureSpec2 = childMeasureSpec2;
                            } else {
                                childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                                eVar.f53679h[3] = -2;
                            }
                            iMakeMeasureSpec2 = childMeasureSpec;
                            z10 = true;
                            bVar = r1.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (bVar5 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar2 = r1.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (bVar4 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                            if (aVar.f54053j) {
                                if (view instanceof androidx.constraintlayout.widget.j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline3 = view.getBaseline();
                                if (z6) {
                                    int[] iArr8 = eVar.f53679h;
                                    i10 = 0;
                                    iArr8[0] = measuredWidth;
                                    iArr8[2] = measuredHeight;
                                } else {
                                    i10 = 0;
                                    int[] iArr9 = eVar.f53679h;
                                    iArr9[0] = 0;
                                    iArr9[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr10 = eVar.f53679h;
                                    iArr10[1] = measuredHeight;
                                    iArr10[3] = measuredWidth;
                                } else {
                                    int[] iArr11 = eVar.f53679h;
                                    iArr11[1] = i10;
                                    iArr11[3] = i10;
                                }
                                i11 = eVar.f53693o;
                                if (i11 > 0) {
                                    iMin = java.lang.Math.max(i11, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i12 = eVar.f53695p;
                                if (i12 > 0) {
                                    iMin = java.lang.Math.min(i12, iMin);
                                }
                                i13 = eVar.f53699r;
                                if (i13 > 0) {
                                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i14 = eVar.f53701s;
                                if (i14 > 0) {
                                    iMin2 = java.lang.Math.min(i14, iMin2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i15 = -1;
                            } else {
                                if (view instanceof androidx.constraintlayout.widget.j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline4 = view.getBaseline();
                                if (z6) {
                                    int[] iArr12 = eVar.f53679h;
                                    i10 = 0;
                                    iArr12[0] = measuredWidth;
                                    iArr12[2] = measuredHeight;
                                } else {
                                    i10 = 0;
                                    int[] iArr13 = eVar.f53679h;
                                    iArr13[0] = 0;
                                    iArr13[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr14 = eVar.f53679h;
                                    iArr14[1] = measuredHeight;
                                    iArr14[3] = measuredWidth;
                                } else {
                                    int[] iArr15 = eVar.f53679h;
                                    iArr15[1] = i10;
                                    iArr15[3] = i10;
                                }
                                i11 = eVar.f53693o;
                                if (i11 > 0) {
                                    iMin = java.lang.Math.max(i11, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i12 = eVar.f53695p;
                                if (i12 > 0) {
                                    iMin = java.lang.Math.min(i12, iMin);
                                }
                                i13 = eVar.f53699r;
                                if (i13 > 0) {
                                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i14 = eVar.f53701s;
                                if (i14 > 0) {
                                    iMin2 = java.lang.Math.min(i14, iMin2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i15 = -1;
                            }
                            if (baseline != i15) {
                                i16 = 1;
                            } else {
                                i16 = i10;
                            }
                            if (measuredWidth2 == aVar.f54046c) {
                                z17 = 1;
                            } else {
                                z17 = 1;
                            }
                            aVar.f54052i = z17;
                            if (bVar3.f20782Y) {
                                z18 = 1;
                            } else {
                                z18 = i16;
                            }
                            if (z18 != 0) {
                                aVar.f54052i = true;
                            }
                            aVar.f54048e = measuredWidth2;
                            aVar.f54049f = measuredHeight2;
                            aVar.f54051h = z18;
                            aVar.f54050g = baseline;
                        }
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                        eVar.f53679h[3] = i18;
                        z10 = false;
                        bVar = r1.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bVar5 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar2 = r1.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (bVar4 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                        if (aVar.f54053j) {
                            if (view instanceof androidx.constraintlayout.widget.j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline5 = view.getBaseline();
                            if (z6) {
                                int[] iArr16 = eVar.f53679h;
                                i10 = 0;
                                iArr16[0] = measuredWidth;
                                iArr16[2] = measuredHeight;
                            } else {
                                i10 = 0;
                                int[] iArr17 = eVar.f53679h;
                                iArr17[0] = 0;
                                iArr17[2] = 0;
                            }
                            if (z10) {
                                int[] iArr18 = eVar.f53679h;
                                iArr18[1] = measuredHeight;
                                iArr18[3] = measuredWidth;
                            } else {
                                int[] iArr19 = eVar.f53679h;
                                iArr19[1] = i10;
                                iArr19[3] = i10;
                            }
                            i11 = eVar.f53693o;
                            if (i11 > 0) {
                                iMin = java.lang.Math.max(i11, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i12 = eVar.f53695p;
                            if (i12 > 0) {
                                iMin = java.lang.Math.min(i12, iMin);
                            }
                            i13 = eVar.f53699r;
                            if (i13 > 0) {
                                iMin2 = java.lang.Math.max(i13, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i14 = eVar.f53701s;
                            if (i14 > 0) {
                                iMin2 = java.lang.Math.min(i14, iMin2);
                            }
                            if (!z15) {
                                if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                            } else if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i15 = -1;
                        } else {
                            if (view instanceof androidx.constraintlayout.widget.j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline6 = view.getBaseline();
                            if (z6) {
                                int[] iArr110 = eVar.f53679h;
                                i10 = 0;
                                iArr110[0] = measuredWidth;
                                iArr110[2] = measuredHeight;
                            } else {
                                i10 = 0;
                                int[] iArr111 = eVar.f53679h;
                                iArr111[0] = 0;
                                iArr111[2] = 0;
                            }
                            if (z10) {
                                int[] iArr112 = eVar.f53679h;
                                iArr112[1] = measuredHeight;
                                iArr112[3] = measuredWidth;
                            } else {
                                int[] iArr113 = eVar.f53679h;
                                iArr113[1] = i10;
                                iArr113[3] = i10;
                            }
                            i11 = eVar.f53693o;
                            if (i11 > 0) {
                                iMin = java.lang.Math.max(i11, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i12 = eVar.f53695p;
                            if (i12 > 0) {
                                iMin = java.lang.Math.min(i12, iMin);
                            }
                            i13 = eVar.f53699r;
                            if (i13 > 0) {
                                iMin2 = java.lang.Math.max(i13, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i14 = eVar.f53701s;
                            if (i14 > 0) {
                                iMin2 = java.lang.Math.min(i14, iMin2);
                            }
                            if (!z15) {
                                if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                            } else if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i15 = -1;
                        }
                        if (baseline != i15) {
                            i16 = 1;
                        } else {
                            i16 = i10;
                        }
                        if (measuredWidth2 == aVar.f54046c) {
                            z17 = 1;
                        } else {
                            z17 = 1;
                        }
                        aVar.f54052i = z17;
                        if (bVar3.f20782Y) {
                            z18 = 1;
                        } else {
                            z18 = i16;
                        }
                        if (z18 != 0) {
                            aVar.f54052i = true;
                        }
                        aVar.f54048e = measuredWidth2;
                        aVar.f54049f = measuredHeight2;
                        aVar.f54051h = z18;
                        aVar.f54050g = baseline;
                    }
                }
                z6 = true;
                i6 = iArr[bVar5.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                z10 = false;
                                iMakeMeasureSpec2 = 0;
                            } else {
                                childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                                if (eVar.f53689m == 1) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                int[] iArr20 = eVar.f53679h;
                                iArr20[3] = 0;
                                if (aVar.f54053j) {
                                    if (z19) {
                                        z20 = false;
                                    } else {
                                        z20 = false;
                                    }
                                    if (z19) {
                                    }
                                    childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                }
                            }
                            bVar = r1.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (bVar5 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar2 = r1.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (bVar4 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                            if (aVar.f54053j) {
                                if (view instanceof androidx.constraintlayout.widget.j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline7 = view.getBaseline();
                                if (z6) {
                                    int[] iArr114 = eVar.f53679h;
                                    i10 = 0;
                                    iArr114[0] = measuredWidth;
                                    iArr114[2] = measuredHeight;
                                } else {
                                    i10 = 0;
                                    int[] iArr115 = eVar.f53679h;
                                    iArr115[0] = 0;
                                    iArr115[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr116 = eVar.f53679h;
                                    iArr116[1] = measuredHeight;
                                    iArr116[3] = measuredWidth;
                                } else {
                                    int[] iArr117 = eVar.f53679h;
                                    iArr117[1] = i10;
                                    iArr117[3] = i10;
                                }
                                i11 = eVar.f53693o;
                                if (i11 > 0) {
                                    iMin = java.lang.Math.max(i11, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i12 = eVar.f53695p;
                                if (i12 > 0) {
                                    iMin = java.lang.Math.min(i12, iMin);
                                }
                                i13 = eVar.f53699r;
                                if (i13 > 0) {
                                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i14 = eVar.f53701s;
                                if (i14 > 0) {
                                    iMin2 = java.lang.Math.min(i14, iMin2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i15 = -1;
                            } else {
                                if (view instanceof androidx.constraintlayout.widget.j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline8 = view.getBaseline();
                                if (z6) {
                                    int[] iArr118 = eVar.f53679h;
                                    i10 = 0;
                                    iArr118[0] = measuredWidth;
                                    iArr118[2] = measuredHeight;
                                } else {
                                    i10 = 0;
                                    int[] iArr119 = eVar.f53679h;
                                    iArr119[0] = 0;
                                    iArr119[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr1110 = eVar.f53679h;
                                    iArr1110[1] = measuredHeight;
                                    iArr1110[3] = measuredWidth;
                                } else {
                                    int[] iArr1111 = eVar.f53679h;
                                    iArr1111[1] = i10;
                                    iArr1111[3] = i10;
                                }
                                i11 = eVar.f53693o;
                                if (i11 > 0) {
                                    iMin = java.lang.Math.max(i11, measuredWidth);
                                } else {
                                    iMin = measuredWidth;
                                }
                                i12 = eVar.f53695p;
                                if (i12 > 0) {
                                    iMin = java.lang.Math.min(i12, iMin);
                                }
                                i13 = eVar.f53699r;
                                if (i13 > 0) {
                                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                                } else {
                                    iMin2 = measuredHeight;
                                }
                                i14 = eVar.f53701s;
                                if (i14 > 0) {
                                    iMin2 = java.lang.Math.min(i14, iMin2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                                if (measuredWidth == iMin) {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != iMin) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                    }
                                    if (measuredHeight != iMin2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i15 = -1;
                            }
                            if (baseline != i15) {
                                i16 = 1;
                            } else {
                                i16 = i10;
                            }
                            if (measuredWidth2 == aVar.f54046c) {
                                z17 = 1;
                            } else {
                                z17 = 1;
                            }
                            aVar.f54052i = z17;
                            if (bVar3.f20782Y) {
                                z18 = 1;
                            } else {
                                z18 = i16;
                            }
                            if (z18 != 0) {
                                aVar.f54052i = true;
                            }
                            aVar.f54048e = measuredWidth2;
                            aVar.f54049f = measuredHeight2;
                            aVar.f54051h = z18;
                            aVar.f54050g = baseline;
                        }
                        childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19 + eVar.N(), -1);
                        eVar.f53679h[3] = -1;
                        iMakeMeasureSpec2 = childMeasureSpec2;
                    } else {
                        childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                        eVar.f53679h[3] = -2;
                    }
                    iMakeMeasureSpec2 = childMeasureSpec;
                    z10 = true;
                    bVar = r1.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (bVar5 == bVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar2 = r1.e.b.MATCH_PARENT;
                    if (bVar5 != bVar2) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (bVar4 != bVar2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z12) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                    if (aVar.f54053j) {
                        if (view instanceof androidx.constraintlayout.widget.j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline9 = view.getBaseline();
                        if (z6) {
                            int[] iArr1112 = eVar.f53679h;
                            i10 = 0;
                            iArr1112[0] = measuredWidth;
                            iArr1112[2] = measuredHeight;
                        } else {
                            i10 = 0;
                            int[] iArr1113 = eVar.f53679h;
                            iArr1113[0] = 0;
                            iArr1113[2] = 0;
                        }
                        if (z10) {
                            int[] iArr1114 = eVar.f53679h;
                            iArr1114[1] = measuredHeight;
                            iArr1114[3] = measuredWidth;
                        } else {
                            int[] iArr1115 = eVar.f53679h;
                            iArr1115[1] = i10;
                            iArr1115[3] = i10;
                        }
                        i11 = eVar.f53693o;
                        if (i11 > 0) {
                            iMin = java.lang.Math.max(i11, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i12 = eVar.f53695p;
                        if (i12 > 0) {
                            iMin = java.lang.Math.min(i12, iMin);
                        }
                        i13 = eVar.f53699r;
                        if (i13 > 0) {
                            iMin2 = java.lang.Math.max(i13, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i14 = eVar.f53701s;
                        if (i14 > 0) {
                            iMin2 = java.lang.Math.min(i14, iMin2);
                        }
                        if (!z15) {
                            if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                        } else if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                        if (measuredWidth == iMin) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i15 = -1;
                    } else {
                        if (view instanceof androidx.constraintlayout.widget.j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline10 = view.getBaseline();
                        if (z6) {
                            int[] iArr1116 = eVar.f53679h;
                            i10 = 0;
                            iArr1116[0] = measuredWidth;
                            iArr1116[2] = measuredHeight;
                        } else {
                            i10 = 0;
                            int[] iArr1117 = eVar.f53679h;
                            iArr1117[0] = 0;
                            iArr1117[2] = 0;
                        }
                        if (z10) {
                            int[] iArr1118 = eVar.f53679h;
                            iArr1118[1] = measuredHeight;
                            iArr1118[3] = measuredWidth;
                        } else {
                            int[] iArr1119 = eVar.f53679h;
                            iArr1119[1] = i10;
                            iArr1119[3] = i10;
                        }
                        i11 = eVar.f53693o;
                        if (i11 > 0) {
                            iMin = java.lang.Math.max(i11, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i12 = eVar.f53695p;
                        if (i12 > 0) {
                            iMin = java.lang.Math.min(i12, iMin);
                        }
                        i13 = eVar.f53699r;
                        if (i13 > 0) {
                            iMin2 = java.lang.Math.max(i13, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i14 = eVar.f53701s;
                        if (i14 > 0) {
                            iMin2 = java.lang.Math.min(i14, iMin2);
                        }
                        if (!z15) {
                            if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                        } else if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                        if (measuredWidth == iMin) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i15 = -1;
                    }
                    if (baseline != i15) {
                        i16 = 1;
                    } else {
                        i16 = i10;
                    }
                    if (measuredWidth2 == aVar.f54046c) {
                        z17 = 1;
                    } else {
                        z17 = 1;
                    }
                    aVar.f54052i = z17;
                    if (bVar3.f20782Y) {
                        z18 = 1;
                    } else {
                        z18 = i16;
                    }
                    if (z18 != 0) {
                        aVar.f54052i = true;
                    }
                    aVar.f54048e = measuredWidth2;
                    aVar.f54049f = measuredHeight2;
                    aVar.f54051h = z18;
                    aVar.f54050g = baseline;
                }
                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                eVar.f53679h[3] = i18;
                z10 = false;
                bVar = r1.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bVar5 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2 = r1.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (bVar4 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                if (aVar.f54053j) {
                    if (view instanceof androidx.constraintlayout.widget.j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline11 = view.getBaseline();
                    if (z6) {
                        int[] iArr11110 = eVar.f53679h;
                        i10 = 0;
                        iArr11110[0] = measuredWidth;
                        iArr11110[2] = measuredHeight;
                    } else {
                        i10 = 0;
                        int[] iArr11111 = eVar.f53679h;
                        iArr11111[0] = 0;
                        iArr11111[2] = 0;
                    }
                    if (z10) {
                        int[] iArr11112 = eVar.f53679h;
                        iArr11112[1] = measuredHeight;
                        iArr11112[3] = measuredWidth;
                    } else {
                        int[] iArr11113 = eVar.f53679h;
                        iArr11113[1] = i10;
                        iArr11113[3] = i10;
                    }
                    i11 = eVar.f53693o;
                    if (i11 > 0) {
                        iMin = java.lang.Math.max(i11, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i12 = eVar.f53695p;
                    if (i12 > 0) {
                        iMin = java.lang.Math.min(i12, iMin);
                    }
                    i13 = eVar.f53699r;
                    if (i13 > 0) {
                        iMin2 = java.lang.Math.max(i13, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i14 = eVar.f53701s;
                    if (i14 > 0) {
                        iMin2 = java.lang.Math.min(i14, iMin2);
                    }
                    if (!z15) {
                        if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                    } else if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i15 = -1;
                } else {
                    if (view instanceof androidx.constraintlayout.widget.j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline12 = view.getBaseline();
                    if (z6) {
                        int[] iArr11114 = eVar.f53679h;
                        i10 = 0;
                        iArr11114[0] = measuredWidth;
                        iArr11114[2] = measuredHeight;
                    } else {
                        i10 = 0;
                        int[] iArr11115 = eVar.f53679h;
                        iArr11115[0] = 0;
                        iArr11115[2] = 0;
                    }
                    if (z10) {
                        int[] iArr11116 = eVar.f53679h;
                        iArr11116[1] = measuredHeight;
                        iArr11116[3] = measuredWidth;
                    } else {
                        int[] iArr11117 = eVar.f53679h;
                        iArr11117[1] = i10;
                        iArr11117[3] = i10;
                    }
                    i11 = eVar.f53693o;
                    if (i11 > 0) {
                        iMin = java.lang.Math.max(i11, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i12 = eVar.f53695p;
                    if (i12 > 0) {
                        iMin = java.lang.Math.min(i12, iMin);
                    }
                    i13 = eVar.f53699r;
                    if (i13 > 0) {
                        iMin2 = java.lang.Math.max(i13, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i14 = eVar.f53701s;
                    if (i14 > 0) {
                        iMin2 = java.lang.Math.min(i14, iMin2);
                    }
                    if (!z15) {
                        if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                    } else if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i15 = -1;
                }
                if (baseline != i15) {
                    i16 = 1;
                } else {
                    i16 = i10;
                }
                if (measuredWidth2 == aVar.f54046c) {
                    z17 = 1;
                } else {
                    z17 = 1;
                }
                aVar.f54052i = z17;
                if (bVar3.f20782Y) {
                    z18 = 1;
                } else {
                    z18 = i16;
                }
                if (z18 != 0) {
                    aVar.f54052i = true;
                }
                aVar.f54048e = measuredWidth2;
                aVar.f54049f = measuredHeight2;
                aVar.f54051h = z18;
                aVar.f54050g = baseline;
            }
            int iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
            eVar.f53679h[2] = i17;
            iMakeMeasureSpec = iMakeMeasureSpec3;
            z6 = false;
            i6 = iArr[bVar5.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            z10 = false;
                            iMakeMeasureSpec2 = 0;
                        } else {
                            childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                            if (eVar.f53689m == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            int[] iArr21 = eVar.f53679h;
                            iArr21[3] = 0;
                            if (aVar.f54053j) {
                                if (z19) {
                                    z20 = false;
                                } else {
                                    z20 = false;
                                }
                                if (z19) {
                                }
                                childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                            }
                        }
                        bVar = r1.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bVar5 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar2 = r1.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (bVar4 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                        if (aVar.f54053j) {
                            if (view instanceof androidx.constraintlayout.widget.j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline13 = view.getBaseline();
                            if (z6) {
                                int[] iArr11118 = eVar.f53679h;
                                i10 = 0;
                                iArr11118[0] = measuredWidth;
                                iArr11118[2] = measuredHeight;
                            } else {
                                i10 = 0;
                                int[] iArr11119 = eVar.f53679h;
                                iArr11119[0] = 0;
                                iArr11119[2] = 0;
                            }
                            if (z10) {
                                int[] iArr111110 = eVar.f53679h;
                                iArr111110[1] = measuredHeight;
                                iArr111110[3] = measuredWidth;
                            } else {
                                int[] iArr111111 = eVar.f53679h;
                                iArr111111[1] = i10;
                                iArr111111[3] = i10;
                            }
                            i11 = eVar.f53693o;
                            if (i11 > 0) {
                                iMin = java.lang.Math.max(i11, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i12 = eVar.f53695p;
                            if (i12 > 0) {
                                iMin = java.lang.Math.min(i12, iMin);
                            }
                            i13 = eVar.f53699r;
                            if (i13 > 0) {
                                iMin2 = java.lang.Math.max(i13, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i14 = eVar.f53701s;
                            if (i14 > 0) {
                                iMin2 = java.lang.Math.min(i14, iMin2);
                            }
                            if (!z15) {
                                if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                            } else if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i15 = -1;
                        } else {
                            if (view instanceof androidx.constraintlayout.widget.j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            int baseline14 = view.getBaseline();
                            if (z6) {
                                int[] iArr111112 = eVar.f53679h;
                                i10 = 0;
                                iArr111112[0] = measuredWidth;
                                iArr111112[2] = measuredHeight;
                            } else {
                                i10 = 0;
                                int[] iArr111113 = eVar.f53679h;
                                iArr111113[0] = 0;
                                iArr111113[2] = 0;
                            }
                            if (z10) {
                                int[] iArr111114 = eVar.f53679h;
                                iArr111114[1] = measuredHeight;
                                iArr111114[3] = measuredWidth;
                            } else {
                                int[] iArr111115 = eVar.f53679h;
                                iArr111115[1] = i10;
                                iArr111115[3] = i10;
                            }
                            i11 = eVar.f53693o;
                            if (i11 > 0) {
                                iMin = java.lang.Math.max(i11, measuredWidth);
                            } else {
                                iMin = measuredWidth;
                            }
                            i12 = eVar.f53695p;
                            if (i12 > 0) {
                                iMin = java.lang.Math.min(i12, iMin);
                            }
                            i13 = eVar.f53699r;
                            if (i13 > 0) {
                                iMin2 = java.lang.Math.max(i13, measuredHeight);
                            } else {
                                iMin2 = measuredHeight;
                            }
                            i14 = eVar.f53701s;
                            if (i14 > 0) {
                                iMin2 = java.lang.Math.min(i14, iMin2);
                            }
                            if (!z15) {
                                if (z16) {
                                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                                }
                            } else if (z16) {
                                iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                            }
                            if (measuredWidth == iMin) {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != iMin) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                                }
                                if (measuredHeight != iMin2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i15 = -1;
                        }
                        if (baseline != i15) {
                            i16 = 1;
                        } else {
                            i16 = i10;
                        }
                        if (measuredWidth2 == aVar.f54046c) {
                            z17 = 1;
                        } else {
                            z17 = 1;
                        }
                        aVar.f54052i = z17;
                        if (bVar3.f20782Y) {
                            z18 = 1;
                        } else {
                            z18 = i16;
                        }
                        if (z18 != 0) {
                            aVar.f54052i = true;
                        }
                        aVar.f54048e = measuredWidth2;
                        aVar.f54049f = measuredHeight2;
                        aVar.f54051h = z18;
                        aVar.f54050g = baseline;
                    }
                    childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19 + eVar.N(), -1);
                    eVar.f53679h[3] = -1;
                    iMakeMeasureSpec2 = childMeasureSpec2;
                } else {
                    childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.f20832g, i19, -2);
                    eVar.f53679h[3] = -2;
                }
                iMakeMeasureSpec2 = childMeasureSpec;
                z10 = true;
                bVar = r1.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bVar5 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2 = r1.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (bVar4 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
                if (aVar.f54053j) {
                    if (view instanceof androidx.constraintlayout.widget.j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline15 = view.getBaseline();
                    if (z6) {
                        int[] iArr111116 = eVar.f53679h;
                        i10 = 0;
                        iArr111116[0] = measuredWidth;
                        iArr111116[2] = measuredHeight;
                    } else {
                        i10 = 0;
                        int[] iArr111117 = eVar.f53679h;
                        iArr111117[0] = 0;
                        iArr111117[2] = 0;
                    }
                    if (z10) {
                        int[] iArr111118 = eVar.f53679h;
                        iArr111118[1] = measuredHeight;
                        iArr111118[3] = measuredWidth;
                    } else {
                        int[] iArr111119 = eVar.f53679h;
                        iArr111119[1] = i10;
                        iArr111119[3] = i10;
                    }
                    i11 = eVar.f53693o;
                    if (i11 > 0) {
                        iMin = java.lang.Math.max(i11, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i12 = eVar.f53695p;
                    if (i12 > 0) {
                        iMin = java.lang.Math.min(i12, iMin);
                    }
                    i13 = eVar.f53699r;
                    if (i13 > 0) {
                        iMin2 = java.lang.Math.max(i13, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i14 = eVar.f53701s;
                    if (i14 > 0) {
                        iMin2 = java.lang.Math.min(i14, iMin2);
                    }
                    if (!z15) {
                        if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                    } else if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i15 = -1;
                } else {
                    if (view instanceof androidx.constraintlayout.widget.j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline16 = view.getBaseline();
                    if (z6) {
                        int[] iArr1111110 = eVar.f53679h;
                        i10 = 0;
                        iArr1111110[0] = measuredWidth;
                        iArr1111110[2] = measuredHeight;
                    } else {
                        i10 = 0;
                        int[] iArr1111111 = eVar.f53679h;
                        iArr1111111[0] = 0;
                        iArr1111111[2] = 0;
                    }
                    if (z10) {
                        int[] iArr1111112 = eVar.f53679h;
                        iArr1111112[1] = measuredHeight;
                        iArr1111112[3] = measuredWidth;
                    } else {
                        int[] iArr1111113 = eVar.f53679h;
                        iArr1111113[1] = i10;
                        iArr1111113[3] = i10;
                    }
                    i11 = eVar.f53693o;
                    if (i11 > 0) {
                        iMin = java.lang.Math.max(i11, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i12 = eVar.f53695p;
                    if (i12 > 0) {
                        iMin = java.lang.Math.min(i12, iMin);
                    }
                    i13 = eVar.f53699r;
                    if (i13 > 0) {
                        iMin2 = java.lang.Math.max(i13, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i14 = eVar.f53701s;
                    if (i14 > 0) {
                        iMin2 = java.lang.Math.min(i14, iMin2);
                    }
                    if (!z15) {
                        if (z16) {
                            iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                        }
                    } else if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                    if (measuredWidth == iMin) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i15 = -1;
                }
                if (baseline != i15) {
                    i16 = 1;
                } else {
                    i16 = i10;
                }
                if (measuredWidth2 == aVar.f54046c) {
                    z17 = 1;
                } else {
                    z17 = 1;
                }
                aVar.f54052i = z17;
                if (bVar3.f20782Y) {
                    z18 = 1;
                } else {
                    z18 = i16;
                }
                if (z18 != 0) {
                    aVar.f54052i = true;
                }
                aVar.f54048e = measuredWidth2;
                aVar.f54049f = measuredHeight2;
                aVar.f54051h = z18;
                aVar.f54050g = baseline;
            }
            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
            eVar.f53679h[3] = i18;
            z10 = false;
            bVar = r1.e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (bVar5 == bVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            bVar2 = r1.e.b.MATCH_PARENT;
            if (bVar5 != bVar2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (bVar4 != bVar2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar3 = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
            if (aVar.f54053j) {
                if (view instanceof androidx.constraintlayout.widget.j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline17 = view.getBaseline();
                if (z6) {
                    int[] iArr1111114 = eVar.f53679h;
                    i10 = 0;
                    iArr1111114[0] = measuredWidth;
                    iArr1111114[2] = measuredHeight;
                } else {
                    i10 = 0;
                    int[] iArr1111115 = eVar.f53679h;
                    iArr1111115[0] = 0;
                    iArr1111115[2] = 0;
                }
                if (z10) {
                    int[] iArr1111116 = eVar.f53679h;
                    iArr1111116[1] = measuredHeight;
                    iArr1111116[3] = measuredWidth;
                } else {
                    int[] iArr1111117 = eVar.f53679h;
                    iArr1111117[1] = i10;
                    iArr1111117[3] = i10;
                }
                i11 = eVar.f53693o;
                if (i11 > 0) {
                    iMin = java.lang.Math.max(i11, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i12 = eVar.f53695p;
                if (i12 > 0) {
                    iMin = java.lang.Math.min(i12, iMin);
                }
                i13 = eVar.f53699r;
                if (i13 > 0) {
                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i14 = eVar.f53701s;
                if (i14 > 0) {
                    iMin2 = java.lang.Math.min(i14, iMin2);
                }
                if (!z15) {
                    if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                } else if (z16) {
                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i15 = -1;
            } else {
                if (view instanceof androidx.constraintlayout.widget.j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline18 = view.getBaseline();
                if (z6) {
                    int[] iArr1111118 = eVar.f53679h;
                    i10 = 0;
                    iArr1111118[0] = measuredWidth;
                    iArr1111118[2] = measuredHeight;
                } else {
                    i10 = 0;
                    int[] iArr1111119 = eVar.f53679h;
                    iArr1111119[0] = 0;
                    iArr1111119[2] = 0;
                }
                if (z10) {
                    int[] iArr11111110 = eVar.f53679h;
                    iArr11111110[1] = measuredHeight;
                    iArr11111110[3] = measuredWidth;
                } else {
                    int[] iArr11111111 = eVar.f53679h;
                    iArr11111111[1] = i10;
                    iArr11111111[3] = i10;
                }
                i11 = eVar.f53693o;
                if (i11 > 0) {
                    iMin = java.lang.Math.max(i11, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i12 = eVar.f53695p;
                if (i12 > 0) {
                    iMin = java.lang.Math.min(i12, iMin);
                }
                i13 = eVar.f53699r;
                if (i13 > 0) {
                    iMin2 = java.lang.Math.max(i13, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i14 = eVar.f53701s;
                if (i14 > 0) {
                    iMin2 = java.lang.Math.min(i14, iMin2);
                }
                if (!z15) {
                    if (z16) {
                        iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                    }
                } else if (z16) {
                    iMin2 = (int) ((iMin / eVar.f53655Q) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i15 = -1;
            }
            if (baseline != i15) {
                i16 = 1;
            } else {
                i16 = i10;
            }
            if (measuredWidth2 == aVar.f54046c) {
                z17 = 1;
            } else {
                z17 = 1;
            }
            aVar.f54052i = z17;
            if (bVar3.f20782Y) {
                z18 = 1;
            } else {
                z18 = i16;
            }
            if (z18 != 0) {
                aVar.f54052i = true;
            }
            aVar.f54048e = measuredWidth2;
            aVar.f54049f = measuredHeight2;
            aVar.f54051h = z18;
            aVar.f54050g = baseline;
        }

        public void c(int i6, int i10, int i11, int i12, int i13, int i14) {
            this.f20827b = i11;
            this.f20828c = i12;
            this.f20829d = i13;
            this.f20830e = i14;
            this.f20831f = i6;
            this.f20832g = i10;
        }
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20734C = new android.util.SparseArray();
        this.f20735D = new java.util.ArrayList(4);
        this.f20736E = new p172r1.f();
        this.f20737F = 0;
        this.f20738G = 0;
        this.f20739H = Integer.MAX_VALUE;
        this.f20740I = Integer.MAX_VALUE;
        this.f20741J = true;
        this.f20742K = 263;
        this.f20743L = null;
        this.f20744M = null;
        this.f20745N = -1;
        this.f20746O = new java.util.HashMap();
        this.f20747P = -1;
        this.f20748Q = -1;
        this.f20749R = -1;
        this.f20750S = -1;
        this.f20751T = 0;
        this.f20752U = 0;
        this.f20753V = new android.util.SparseArray();
        this.f20754W = new androidx.constraintlayout.widget.ConstraintLayout.c(this);
        this.f20755a0 = 0;
        this.f20756b0 = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f20734C = new android.util.SparseArray();
        this.f20735D = new java.util.ArrayList(4);
        this.f20736E = new p172r1.f();
        this.f20737F = 0;
        this.f20738G = 0;
        this.f20739H = Integer.MAX_VALUE;
        this.f20740I = Integer.MAX_VALUE;
        this.f20741J = true;
        this.f20742K = 263;
        this.f20743L = null;
        this.f20744M = null;
        this.f20745N = -1;
        this.f20746O = new java.util.HashMap();
        this.f20747P = -1;
        this.f20748Q = -1;
        this.f20749R = -1;
        this.f20750S = -1;
        this.f20751T = 0;
        this.f20752U = 0;
        this.f20753V = new android.util.SparseArray();
        this.f20754W = new androidx.constraintlayout.widget.ConstraintLayout.c(this);
        this.f20755a0 = 0;
        this.f20756b0 = 0;
        j(attributeSet, i6, 0);
    }

    private final p172r1.e g(int i6) {
        if (i6 == 0) {
            return this.f20736E;
        }
        android.view.View viewFindViewById = (android.view.View) this.f20734C.get(i6);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i6)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f20736E;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.b) viewFindViewById.getLayoutParams()).f20811n0;
    }

    private int getPaddingWidth() {
        int iMax = java.lang.Math.max(0, getPaddingLeft()) + java.lang.Math.max(0, getPaddingRight());
        int iMax2 = java.lang.Math.max(0, getPaddingStart()) + java.lang.Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(android.util.AttributeSet attributeSet, int i6, int i10) {
        this.f20736E.c0(this);
        this.f20736E.f1(this.f20754W);
        this.f20734C.put(getId(), this);
        this.f20743L = null;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1, i6, i10);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f21205k1) {
                    this.f20737F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20737F);
                } else if (index == androidx.constraintlayout.widget.i.f21212l1) {
                    this.f20738G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20738G);
                } else if (index == androidx.constraintlayout.widget.i.f21191i1) {
                    this.f20739H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20739H);
                } else if (index == androidx.constraintlayout.widget.i.f21198j1) {
                    this.f20740I = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20740I);
                } else if (index == androidx.constraintlayout.widget.i.f21046L2) {
                    this.f20742K = typedArrayObtainStyledAttributes.getInt(index, this.f20742K);
                } else if (index == androidx.constraintlayout.widget.i.f21051M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            this.f20744M = null;
                        }
                    }
                } else if (index == androidx.constraintlayout.widget.i.f21261s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        this.f20743L = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.f20743L = null;
                    }
                    this.f20745N = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f20736E.g1(this.f20742K);
    }

    private void l() {
        this.f20741J = true;
        this.f20747P = -1;
        this.f20748Q = -1;
        this.f20749R = -1;
        this.f20750S = -1;
        this.f20751T = 0;
        this.f20752U = 0;
    }

    private void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            p172r1.e eVarI = i(getChildAt(i6));
            if (eVarI != null) {
                eVarI.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = getChildAt(i10);
                try {
                    java.lang.String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, java.lang.Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f20745N != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).getId();
            }
        }
        androidx.constraintlayout.widget.e eVar = this.f20743L;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f20736E.M0();
        int size = this.f20735D.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((androidx.constraintlayout.widget.c) this.f20735D.get(i12)).l(this);
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13);
        }
        this.f20753V.clear();
        this.f20753V.put(0, this.f20736E);
        this.f20753V.put(getId(), this.f20736E);
        for (int i14 = 0; i14 < childCount; i14++) {
            android.view.View childAt2 = getChildAt(i14);
            this.f20753V.put(childAt2.getId(), i(childAt2));
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            android.view.View childAt3 = getChildAt(i15);
            p172r1.e eVarI2 = i(childAt3);
            if (eVarI2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) childAt3.getLayoutParams();
                this.f20736E.b(eVarI2);
                c(zIsInEditMode, childAt3, eVarI2, bVar, this.f20753V);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            if (getChildAt(i6).isLayoutRequested()) {
                z6 = true;
                break;
            }
        }
        if (z6) {
            p();
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
    }

    protected void c(boolean z6, android.view.View view, p172r1.e eVar, androidx.constraintlayout.widget.ConstraintLayout.b bVar, android.util.SparseArray sparseArray) {
        float f6;
        p172r1.e eVar2;
        r1.d.b bVar2;
        r1.d.b bVar3;
        int i6;
        p172r1.e eVar3;
        r1.d.b bVar4;
        int i10;
        r1.d.b bVar5;
        p172r1.e eVar4;
        r1.d.b bVar6;
        r1.d.b bVar7;
        int i11;
        int i12;
        p172r1.e eVar5;
        r1.d.b bVar8;
        int i13;
        int i14;
        r1.d.b bVar9;
        int i15;
        bVar.a();
        bVar.f20813o0 = false;
        eVar.D0(view.getVisibility());
        if (bVar.f20787b0) {
            eVar.p0(true);
            eVar.D0(8);
        }
        eVar.c0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(eVar, this.f20736E.a1());
        }
        if (bVar.f20783Z) {
            p172r1.h hVar = (p172r1.h) eVar;
            int i16 = bVar.f20805k0;
            int i17 = bVar.f20807l0;
            float f10 = bVar.f20809m0;
            if (f10 != -1.0f) {
                hVar.Q0(f10);
                return;
            } else if (i16 != -1) {
                hVar.O0(i16);
                return;
            } else {
                if (i17 != -1) {
                    hVar.P0(i17);
                    return;
                }
                return;
            }
        }
        int i18 = bVar.f20791d0;
        int i19 = bVar.f20793e0;
        int i20 = bVar.f20795f0;
        int i21 = bVar.f20797g0;
        int i22 = bVar.f20799h0;
        int i23 = bVar.f20801i0;
        float f11 = bVar.f20803j0;
        int i24 = bVar.f20808m;
        if (i24 != -1) {
            p172r1.e eVar6 = (p172r1.e) sparseArray.get(i24);
            if (eVar6 != null) {
                eVar.k(eVar6, bVar.f20812o, bVar.f20810n);
            }
        } else {
            if (i18 != -1) {
                eVar2 = (p172r1.e) sparseArray.get(i18);
                if (eVar2 != null) {
                    bVar3 = r1.d.b.LEFT;
                    bVar2 = bVar3;
                    f6 = f11;
                    i6 = ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    eVar.T(bVar2, eVar2, bVar3, i6, i22);
                } else {
                    f6 = f11;
                }
            } else {
                f6 = f11;
                if (i19 != -1 && (eVar2 = (p172r1.e) sparseArray.get(i19)) != null) {
                    bVar2 = r1.d.b.LEFT;
                    bVar3 = r1.d.b.RIGHT;
                    i6 = ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    eVar.T(bVar2, eVar2, bVar3, i6, i22);
                }
            }
            if (i20 != -1) {
                eVar3 = (p172r1.e) sparseArray.get(i20);
                if (eVar3 != null) {
                    bVar5 = r1.d.b.RIGHT;
                    bVar4 = r1.d.b.LEFT;
                    i10 = ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    eVar.T(bVar5, eVar3, bVar4, i10, i23);
                }
            } else if (i21 != -1 && (eVar3 = (p172r1.e) sparseArray.get(i21)) != null) {
                bVar4 = r1.d.b.RIGHT;
                i10 = ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin;
                bVar5 = bVar4;
                eVar.T(bVar5, eVar3, bVar4, i10, i23);
            }
            int i25 = bVar.f20798h;
            if (i25 != -1) {
                eVar4 = (p172r1.e) sparseArray.get(i25);
                if (eVar4 != null) {
                    bVar7 = r1.d.b.TOP;
                    i11 = ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i12 = bVar.f20819u;
                    bVar6 = bVar7;
                    eVar.T(bVar6, eVar4, bVar7, i11, i12);
                }
            } else {
                int i26 = bVar.f20800i;
                if (i26 != -1 && (eVar4 = (p172r1.e) sparseArray.get(i26)) != null) {
                    bVar6 = r1.d.b.TOP;
                    bVar7 = r1.d.b.BOTTOM;
                    i11 = ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i12 = bVar.f20819u;
                    eVar.T(bVar6, eVar4, bVar7, i11, i12);
                }
            }
            int i27 = bVar.f20802j;
            if (i27 != -1) {
                eVar5 = (p172r1.e) sparseArray.get(i27);
                if (eVar5 != null) {
                    bVar9 = r1.d.b.BOTTOM;
                    bVar8 = r1.d.b.TOP;
                    i13 = ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i14 = bVar.f20821w;
                    eVar.T(bVar9, eVar5, bVar8, i13, i14);
                }
            } else {
                int i28 = bVar.f20804k;
                if (i28 != -1 && (eVar5 = (p172r1.e) sparseArray.get(i28)) != null) {
                    bVar8 = r1.d.b.BOTTOM;
                    i13 = ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i14 = bVar.f20821w;
                    bVar9 = bVar8;
                    eVar.T(bVar9, eVar5, bVar8, i13, i14);
                }
            }
            int i29 = bVar.f20806l;
            if (i29 != -1) {
                android.view.View view2 = (android.view.View) this.f20734C.get(i29);
                p172r1.e eVar7 = (p172r1.e) sparseArray.get(bVar.f20806l);
                if (eVar7 != null && view2 != null && (view2.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.b)) {
                    androidx.constraintlayout.widget.ConstraintLayout.b bVar10 = (androidx.constraintlayout.widget.ConstraintLayout.b) view2.getLayoutParams();
                    bVar.f20782Y = true;
                    bVar10.f20782Y = true;
                    r1.d.b bVar11 = r1.d.b.BASELINE;
                    eVar.m(bVar11).b(eVar7.m(bVar11), 0, -1, true);
                    eVar.g0(true);
                    bVar10.f20811n0.g0(true);
                    eVar.m(r1.d.b.TOP).l();
                    eVar.m(r1.d.b.BOTTOM).l();
                }
            }
            float f12 = f6;
            if (f12 >= 0.0f) {
                eVar.i0(f12);
            }
            float f13 = bVar.f20758A;
            if (f13 >= 0.0f) {
                eVar.x0(f13);
            }
        }
        if (z6 && ((i15 = bVar.f20774Q) != -1 || bVar.f20775R != -1)) {
            eVar.v0(i15, bVar.f20775R);
        }
        if (bVar.f20780W) {
            eVar.l0(r1.e.b.FIXED);
            eVar.E0(((android.view.ViewGroup.MarginLayoutParams) bVar).width);
            if (((android.view.ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.l0(r1.e.b.WRAP_CONTENT);
            }
        } else if (((android.view.ViewGroup.MarginLayoutParams) bVar).width == -1) {
            eVar.l0(bVar.f20777T ? r1.e.b.MATCH_CONSTRAINT : r1.e.b.MATCH_PARENT);
            eVar.m(r1.d.b.LEFT).f53624e = ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.m(r1.d.b.RIGHT).f53624e = ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.l0(r1.e.b.MATCH_CONSTRAINT);
            eVar.E0(0);
        }
        if (bVar.f20781X) {
            eVar.A0(r1.e.b.FIXED);
            eVar.h0(((android.view.ViewGroup.MarginLayoutParams) bVar).height);
            if (((android.view.ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.A0(r1.e.b.WRAP_CONTENT);
            }
        } else if (((android.view.ViewGroup.MarginLayoutParams) bVar).height == -1) {
            eVar.A0(bVar.f20778U ? r1.e.b.MATCH_CONSTRAINT : r1.e.b.MATCH_PARENT);
            eVar.m(r1.d.b.TOP).f53624e = ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.m(r1.d.b.BOTTOM).f53624e = ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.A0(r1.e.b.MATCH_CONSTRAINT);
            eVar.h0(0);
        }
        eVar.e0(bVar.f20759B);
        eVar.n0(bVar.f20762E);
        eVar.C0(bVar.f20763F);
        eVar.j0(bVar.f20764G);
        eVar.y0(bVar.f20765H);
        eVar.m0(bVar.f20766I, bVar.f20768K, bVar.f20770M, bVar.f20772O);
        eVar.B0(bVar.f20767J, bVar.f20769L, bVar.f20771N, bVar.f20773P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.constraintlayout.widget.ConstraintLayout.b generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        int size;
        java.util.ArrayList arrayList = this.f20735D;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.c) this.f20735D.get(i6)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] strArrSplit = ((java.lang.String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i12 = java.lang.Integer.parseInt(strArrSplit[1]);
                        int i13 = java.lang.Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        int i16 = (int) ((java.lang.Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(-65536);
                        float f6 = i14;
                        float f10 = i15;
                        float f11 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f6, f10, f11, f10, paint);
                        float f12 = i15 + i16;
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f6, f12, paint);
                        canvas.drawLine(f6, f12, f6, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f10, f11, f12, paint);
                        canvas.drawLine(f6, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.constraintlayout.widget.ConstraintLayout.b generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(getContext(), attributeSet);
    }

    public java.lang.Object f(int i6, java.lang.Object obj) {
        if (i6 != 0 || !(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) obj;
        java.util.HashMap map = this.f20746O;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f20746O.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f20740I;
    }

    public int getMaxWidth() {
        return this.f20739H;
    }

    public int getMinHeight() {
        return this.f20738G;
    }

    public int getMinWidth() {
        return this.f20737F;
    }

    public int getOptimizationLevel() {
        return this.f20736E.V0();
    }

    public android.view.View h(int i6) {
        return (android.view.View) this.f20734C.get(i6);
    }

    public final p172r1.e i(android.view.View view) {
        if (view == this) {
            return this.f20736E;
        }
        if (view == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams()).f20811n0;
    }

    protected boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void m(int i6) {
        this.f20744M = new androidx.constraintlayout.widget.d(getContext(), this, i6);
    }

    protected void n(int i6, int i10, int i11, int i12, boolean z6, boolean z10) {
        androidx.constraintlayout.widget.ConstraintLayout.c cVar = this.f20754W;
        int i13 = cVar.f20830e;
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(i11 + cVar.f20829d, i6, 0);
        int iResolveSizeAndState2 = android.view.View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215;
        int iMin = java.lang.Math.min(this.f20739H, iResolveSizeAndState & 16777215);
        int iMin2 = java.lang.Math.min(this.f20740I, iResolveSizeAndState2);
        if (z6) {
            iMin |= 16777216;
        }
        if (z10) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f20747P = iMin;
        this.f20748Q = iMin2;
    }

    protected void o(p172r1.f fVar, int i6, int i10, int i11) {
        int iMax;
        int mode = android.view.View.MeasureSpec.getMode(i10);
        int size = android.view.View.MeasureSpec.getSize(i10);
        int mode2 = android.view.View.MeasureSpec.getMode(i11);
        int size2 = android.view.View.MeasureSpec.getSize(i11);
        int iMax2 = java.lang.Math.max(0, getPaddingTop());
        int iMax3 = java.lang.Math.max(0, getPaddingBottom());
        int i12 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.f20754W.c(i10, i11, iMax2, iMax3, paddingWidth, i12);
        int iMax4 = java.lang.Math.max(0, getPaddingStart());
        int iMax5 = java.lang.Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = k() ? iMax5 : iMax4;
        } else {
            iMax = java.lang.Math.max(0, getPaddingLeft());
        }
        int i13 = size - paddingWidth;
        int i14 = size2 - i12;
        r(fVar, mode, i13, mode2, i14);
        fVar.c1(i6, mode, i13, mode2, i14, this.f20747P, this.f20748Q, iMax, iMax2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) childAt.getLayoutParams();
            p172r1.e eVar = bVar.f20811n0;
            if ((childAt.getVisibility() != 8 || bVar.f20783Z || bVar.f20785a0 || bVar.f20789c0 || zIsInEditMode) && !bVar.f20787b0) {
                int iQ = eVar.Q();
                int iR = eVar.R();
                childAt.layout(iQ, iR, eVar.P() + iQ, eVar.v() + iR);
            }
        }
        int size = this.f20735D.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((androidx.constraintlayout.widget.c) this.f20735D.get(i14)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        this.f20755a0 = i6;
        this.f20756b0 = i10;
        this.f20736E.h1(k());
        if (this.f20741J) {
            this.f20741J = false;
            if (s()) {
                this.f20736E.j1();
            }
        }
        o(this.f20736E, this.f20742K, i6, i10);
        n(i6, i10, this.f20736E.P(), this.f20736E.v(), this.f20736E.b1(), this.f20736E.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        p172r1.e eVarI = i(view);
        if ((view instanceof androidx.constraintlayout.widget.g) && !(eVarI instanceof p172r1.h)) {
            androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams();
            p172r1.h hVar = new p172r1.h();
            bVar.f20811n0 = hVar;
            bVar.f20783Z = true;
            hVar.R0(bVar.f20776S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((androidx.constraintlayout.widget.ConstraintLayout.b) view.getLayoutParams()).f20785a0 = true;
            if (!this.f20735D.contains(cVar)) {
                this.f20735D.add(cVar);
            }
        }
        this.f20734C.put(view.getId(), view);
        this.f20741J = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f20734C.remove(view.getId());
        this.f20736E.L0(i(view));
        this.f20735D.remove(view);
        this.f20741J = true;
    }

    public void q(int i6, java.lang.Object obj, java.lang.Object obj2) {
        if (i6 == 0 && (obj instanceof java.lang.String) && (obj2 instanceof java.lang.Integer)) {
            if (this.f20746O == null) {
                this.f20746O = new java.util.HashMap();
            }
            java.lang.String strSubstring = (java.lang.String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            java.lang.Integer num = (java.lang.Integer) obj2;
            num.intValue();
            this.f20746O.put(strSubstring, num);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[PHI: r9
  0x0027: PHI (r9v2 r1.e$b) = (r9v1 r1.e$b), (r9v8 r1.e$b) binds: [B:13:0x0030, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[PHI: r2
  0x0047: PHI (r2v2 r1.e$b) = (r2v1 r1.e$b), (r2v4 r1.e$b) binds: [B:24:0x0050, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    protected void r(p172r1.f fVar, int i6, int i10, int i11, int i12) {
        r1.e.b bVar;
        androidx.constraintlayout.widget.ConstraintLayout.c cVar = this.f20754W;
        int i13 = cVar.f20830e;
        int i14 = cVar.f20829d;
        r1.e.b bVar2 = r1.e.b.FIXED;
        int childCount = getChildCount();
        if (i6 != Integer.MIN_VALUE) {
            if (i6 == 0) {
                bVar = r1.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i10 = java.lang.Math.max(0, this.f20737F);
                }
            } else if (i6 != 1073741824) {
                bVar = bVar2;
            } else {
                i10 = java.lang.Math.min(this.f20739H - i14, i10);
                bVar = bVar2;
            }
            i10 = 0;
        } else {
            bVar = r1.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i10 = java.lang.Math.max(0, this.f20737F);
            }
        }
        if (i11 != Integer.MIN_VALUE) {
            if (i11 == 0) {
                bVar2 = r1.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i12 = java.lang.Math.max(0, this.f20738G);
                }
            } else if (i11 == 1073741824) {
                i12 = java.lang.Math.min(this.f20740I - i13, i12);
            }
            i12 = 0;
        } else {
            bVar2 = r1.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = java.lang.Math.max(0, this.f20738G);
            }
        }
        if (i10 != fVar.P() || i12 != fVar.v()) {
            fVar.Y0();
        }
        fVar.F0(0);
        fVar.G0(0);
        fVar.s0(this.f20739H - i14);
        fVar.r0(this.f20740I - i13);
        fVar.u0(0);
        fVar.t0(0);
        fVar.l0(bVar);
        fVar.E0(i10);
        fVar.A0(bVar2);
        fVar.h0(i12);
        fVar.u0(this.f20737F - i14);
        fVar.t0(this.f20738G - i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.e eVar) {
        this.f20743L = eVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        this.f20734C.remove(getId());
        super.setId(i6);
        this.f20734C.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.f20740I) {
            return;
        }
        this.f20740I = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f20739H) {
            return;
        }
        this.f20739H = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f20738G) {
            return;
        }
        this.f20738G = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f20737F) {
            return;
        }
        this.f20737F = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.f fVar) {
        androidx.constraintlayout.widget.d dVar = this.f20744M;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i6) {
        this.f20742K = i6;
        this.f20736E.g1(i6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
