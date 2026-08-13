package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f20876d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static android.util.SparseIntArray f20877e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashMap f20878a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20879b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.HashMap f20880c = new java.util.HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.constraintlayout.widget.e.d f20882b = new androidx.constraintlayout.widget.e.d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.constraintlayout.widget.e.c f20883c = new androidx.constraintlayout.widget.e.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.e.b f20884d = new androidx.constraintlayout.widget.e.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.constraintlayout.widget.e.C0399e f20885e = new androidx.constraintlayout.widget.e.C0399e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public java.util.HashMap f20886f = new java.util.HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i6, androidx.constraintlayout.widget.ConstraintLayout.b bVar) {
            this.f20881a = i6;
            androidx.constraintlayout.widget.e.b bVar2 = this.f20884d;
            bVar2.f20928h = bVar.f20790d;
            bVar2.f20930i = bVar.f20792e;
            bVar2.f20932j = bVar.f20794f;
            bVar2.f20934k = bVar.f20796g;
            bVar2.f20935l = bVar.f20798h;
            bVar2.f20936m = bVar.f20800i;
            bVar2.f20937n = bVar.f20802j;
            bVar2.f20938o = bVar.f20804k;
            bVar2.f20939p = bVar.f20806l;
            bVar2.f20940q = bVar.f20814p;
            bVar2.f20941r = bVar.f20815q;
            bVar2.f20942s = bVar.f20816r;
            bVar2.f20943t = bVar.f20817s;
            bVar2.f20944u = bVar.f20824z;
            bVar2.f20945v = bVar.f20758A;
            bVar2.f20946w = bVar.f20759B;
            bVar2.f20947x = bVar.f20808m;
            bVar2.f20948y = bVar.f20810n;
            bVar2.f20949z = bVar.f20812o;
            bVar2.f20888A = bVar.f20774Q;
            bVar2.f20889B = bVar.f20775R;
            bVar2.f20890C = bVar.f20776S;
            bVar2.f20926g = bVar.f20788c;
            bVar2.f20922e = bVar.f20784a;
            bVar2.f20924f = bVar.f20786b;
            bVar2.f20918c = ((android.view.ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f20920d = ((android.view.ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f20891D = ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f20892E = ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f20893F = ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f20894G = ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f20903P = bVar.f20763F;
            bVar2.f20904Q = bVar.f20762E;
            bVar2.f20906S = bVar.f20765H;
            bVar2.f20905R = bVar.f20764G;
            bVar2.f20929h0 = bVar.f20777T;
            bVar2.f20931i0 = bVar.f20778U;
            bVar2.f20907T = bVar.f20766I;
            bVar2.f20908U = bVar.f20767J;
            bVar2.f20909V = bVar.f20770M;
            bVar2.f20910W = bVar.f20771N;
            bVar2.f20911X = bVar.f20768K;
            bVar2.f20912Y = bVar.f20769L;
            bVar2.f20913Z = bVar.f20772O;
            bVar2.f20915a0 = bVar.f20773P;
            bVar2.f20927g0 = bVar.f20779V;
            bVar2.f20898K = bVar.f20819u;
            bVar2.f20900M = bVar.f20821w;
            bVar2.f20897J = bVar.f20818t;
            bVar2.f20899L = bVar.f20820v;
            bVar2.f20902O = bVar.f20822x;
            bVar2.f20901N = bVar.f20823y;
            bVar2.f20895H = bVar.getMarginEnd();
            this.f20884d.f20896I = bVar.getMarginStart();
        }

        public void b(androidx.constraintlayout.widget.ConstraintLayout.b bVar) {
            androidx.constraintlayout.widget.e.b bVar2 = this.f20884d;
            bVar.f20790d = bVar2.f20928h;
            bVar.f20792e = bVar2.f20930i;
            bVar.f20794f = bVar2.f20932j;
            bVar.f20796g = bVar2.f20934k;
            bVar.f20798h = bVar2.f20935l;
            bVar.f20800i = bVar2.f20936m;
            bVar.f20802j = bVar2.f20937n;
            bVar.f20804k = bVar2.f20938o;
            bVar.f20806l = bVar2.f20939p;
            bVar.f20814p = bVar2.f20940q;
            bVar.f20815q = bVar2.f20941r;
            bVar.f20816r = bVar2.f20942s;
            bVar.f20817s = bVar2.f20943t;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f20891D;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f20892E;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f20893F;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f20894G;
            bVar.f20822x = bVar2.f20902O;
            bVar.f20823y = bVar2.f20901N;
            bVar.f20819u = bVar2.f20898K;
            bVar.f20821w = bVar2.f20900M;
            bVar.f20824z = bVar2.f20944u;
            bVar.f20758A = bVar2.f20945v;
            bVar.f20808m = bVar2.f20947x;
            bVar.f20810n = bVar2.f20948y;
            bVar.f20812o = bVar2.f20949z;
            bVar.f20759B = bVar2.f20946w;
            bVar.f20774Q = bVar2.f20888A;
            bVar.f20775R = bVar2.f20889B;
            bVar.f20763F = bVar2.f20903P;
            bVar.f20762E = bVar2.f20904Q;
            bVar.f20765H = bVar2.f20906S;
            bVar.f20764G = bVar2.f20905R;
            bVar.f20777T = bVar2.f20929h0;
            bVar.f20778U = bVar2.f20931i0;
            bVar.f20766I = bVar2.f20907T;
            bVar.f20767J = bVar2.f20908U;
            bVar.f20770M = bVar2.f20909V;
            bVar.f20771N = bVar2.f20910W;
            bVar.f20768K = bVar2.f20911X;
            bVar.f20769L = bVar2.f20912Y;
            bVar.f20772O = bVar2.f20913Z;
            bVar.f20773P = bVar2.f20915a0;
            bVar.f20776S = bVar2.f20890C;
            bVar.f20788c = bVar2.f20926g;
            bVar.f20784a = bVar2.f20922e;
            bVar.f20786b = bVar2.f20924f;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).width = bVar2.f20918c;
            ((android.view.ViewGroup.MarginLayoutParams) bVar).height = bVar2.f20920d;
            java.lang.String str = bVar2.f20927g0;
            if (str != null) {
                bVar.f20779V = str;
            }
            bVar.setMarginStart(bVar2.f20896I);
            bVar.setMarginEnd(this.f20884d.f20895H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.constraintlayout.widget.e.a clone() {
            androidx.constraintlayout.widget.e.a aVar = new androidx.constraintlayout.widget.e.a();
            aVar.f20884d.a(this.f20884d);
            aVar.f20883c.a(this.f20883c);
            aVar.f20882b.a(this.f20882b);
            aVar.f20885e.a(this.f20885e);
            aVar.f20881a = this.f20881a;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private static android.util.SparseIntArray f20887k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20920d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f20923e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public java.lang.String f20925f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public java.lang.String f20927g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20914a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20916b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20922e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20924f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f20926g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20928h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20930i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20932j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20934k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20935l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f20936m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20937n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f20938o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f20939p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f20940q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f20941r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f20942s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f20943t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f20944u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f20945v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public java.lang.String f20946w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f20947x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f20948y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f20949z = 0.0f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f20888A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f20889B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f20890C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f20891D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f20892E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f20893F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f20894G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f20895H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f20896I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f20897J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f20898K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f20899L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f20900M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f20901N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f20902O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f20903P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f20904Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f20905R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f20906S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f20907T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f20908U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f20909V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f20910W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f20911X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f20912Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f20913Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f20915a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f20917b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f20919c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f20921d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f20929h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f20931i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f20933j0 = true;

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            f20887k0 = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f21083R3, 24);
            f20887k0.append(androidx.constraintlayout.widget.i.f21089S3, 25);
            f20887k0.append(androidx.constraintlayout.widget.i.f21101U3, 28);
            f20887k0.append(androidx.constraintlayout.widget.i.f21107V3, 29);
            f20887k0.append(androidx.constraintlayout.widget.i.f21138a4, 35);
            f20887k0.append(androidx.constraintlayout.widget.i.f21131Z3, 34);
            f20887k0.append(androidx.constraintlayout.widget.i.f20993C3, 4);
            f20887k0.append(androidx.constraintlayout.widget.i.f20987B3, 3);
            f20887k0.append(androidx.constraintlayout.widget.i.f21309z3, 1);
            f20887k0.append(androidx.constraintlayout.widget.i.f21173f4, 6);
            f20887k0.append(androidx.constraintlayout.widget.i.f21180g4, 7);
            f20887k0.append(androidx.constraintlayout.widget.i.f21035J3, 17);
            f20887k0.append(androidx.constraintlayout.widget.i.f21041K3, 18);
            f20887k0.append(androidx.constraintlayout.widget.i.f21047L3, 19);
            f20887k0.append(androidx.constraintlayout.widget.i.f21207k3, 26);
            f20887k0.append(androidx.constraintlayout.widget.i.f21113W3, 31);
            f20887k0.append(androidx.constraintlayout.widget.i.f21119X3, 32);
            f20887k0.append(androidx.constraintlayout.widget.i.f21029I3, 10);
            f20887k0.append(androidx.constraintlayout.widget.i.f21023H3, 9);
            f20887k0.append(androidx.constraintlayout.widget.i.f21201j4, 13);
            f20887k0.append(androidx.constraintlayout.widget.i.f21222m4, 16);
            f20887k0.append(androidx.constraintlayout.widget.i.f21208k4, 14);
            f20887k0.append(androidx.constraintlayout.widget.i.f21187h4, 11);
            f20887k0.append(androidx.constraintlayout.widget.i.f21215l4, 15);
            f20887k0.append(androidx.constraintlayout.widget.i.f21194i4, 12);
            f20887k0.append(androidx.constraintlayout.widget.i.f21159d4, 38);
            f20887k0.append(androidx.constraintlayout.widget.i.f21071P3, 37);
            f20887k0.append(androidx.constraintlayout.widget.i.f21065O3, 39);
            f20887k0.append(androidx.constraintlayout.widget.i.f21152c4, 40);
            f20887k0.append(androidx.constraintlayout.widget.i.f21059N3, 20);
            f20887k0.append(androidx.constraintlayout.widget.i.f21145b4, 36);
            f20887k0.append(androidx.constraintlayout.widget.i.f21017G3, 5);
            f20887k0.append(androidx.constraintlayout.widget.i.f21077Q3, 76);
            f20887k0.append(androidx.constraintlayout.widget.i.f21125Y3, 76);
            f20887k0.append(androidx.constraintlayout.widget.i.f21095T3, 76);
            f20887k0.append(androidx.constraintlayout.widget.i.f20981A3, 76);
            f20887k0.append(androidx.constraintlayout.widget.i.f21303y3, 76);
            f20887k0.append(androidx.constraintlayout.widget.i.f21228n3, 23);
            f20887k0.append(androidx.constraintlayout.widget.i.f21242p3, 27);
            f20887k0.append(androidx.constraintlayout.widget.i.f21256r3, 30);
            f20887k0.append(androidx.constraintlayout.widget.i.f21263s3, 8);
            f20887k0.append(androidx.constraintlayout.widget.i.f21235o3, 33);
            f20887k0.append(androidx.constraintlayout.widget.i.f21249q3, 2);
            f20887k0.append(androidx.constraintlayout.widget.i.f21214l3, 22);
            f20887k0.append(androidx.constraintlayout.widget.i.f21221m3, 21);
            f20887k0.append(androidx.constraintlayout.widget.i.f20999D3, 61);
            f20887k0.append(androidx.constraintlayout.widget.i.f21011F3, 62);
            f20887k0.append(androidx.constraintlayout.widget.i.f21005E3, 63);
            f20887k0.append(androidx.constraintlayout.widget.i.f21166e4, 69);
            f20887k0.append(androidx.constraintlayout.widget.i.f21053M3, 70);
            f20887k0.append(androidx.constraintlayout.widget.i.f21291w3, 71);
            f20887k0.append(androidx.constraintlayout.widget.i.f21277u3, 72);
            f20887k0.append(androidx.constraintlayout.widget.i.f21284v3, 73);
            f20887k0.append(androidx.constraintlayout.widget.i.f21297x3, 74);
            f20887k0.append(androidx.constraintlayout.widget.i.f21270t3, 75);
        }

        public void a(androidx.constraintlayout.widget.e.b bVar) {
            this.f20914a = bVar.f20914a;
            this.f20918c = bVar.f20918c;
            this.f20916b = bVar.f20916b;
            this.f20920d = bVar.f20920d;
            this.f20922e = bVar.f20922e;
            this.f20924f = bVar.f20924f;
            this.f20926g = bVar.f20926g;
            this.f20928h = bVar.f20928h;
            this.f20930i = bVar.f20930i;
            this.f20932j = bVar.f20932j;
            this.f20934k = bVar.f20934k;
            this.f20935l = bVar.f20935l;
            this.f20936m = bVar.f20936m;
            this.f20937n = bVar.f20937n;
            this.f20938o = bVar.f20938o;
            this.f20939p = bVar.f20939p;
            this.f20940q = bVar.f20940q;
            this.f20941r = bVar.f20941r;
            this.f20942s = bVar.f20942s;
            this.f20943t = bVar.f20943t;
            this.f20944u = bVar.f20944u;
            this.f20945v = bVar.f20945v;
            this.f20946w = bVar.f20946w;
            this.f20947x = bVar.f20947x;
            this.f20948y = bVar.f20948y;
            this.f20949z = bVar.f20949z;
            this.f20888A = bVar.f20888A;
            this.f20889B = bVar.f20889B;
            this.f20890C = bVar.f20890C;
            this.f20891D = bVar.f20891D;
            this.f20892E = bVar.f20892E;
            this.f20893F = bVar.f20893F;
            this.f20894G = bVar.f20894G;
            this.f20895H = bVar.f20895H;
            this.f20896I = bVar.f20896I;
            this.f20897J = bVar.f20897J;
            this.f20898K = bVar.f20898K;
            this.f20899L = bVar.f20899L;
            this.f20900M = bVar.f20900M;
            this.f20901N = bVar.f20901N;
            this.f20902O = bVar.f20902O;
            this.f20903P = bVar.f20903P;
            this.f20904Q = bVar.f20904Q;
            this.f20905R = bVar.f20905R;
            this.f20906S = bVar.f20906S;
            this.f20907T = bVar.f20907T;
            this.f20908U = bVar.f20908U;
            this.f20909V = bVar.f20909V;
            this.f20910W = bVar.f20910W;
            this.f20911X = bVar.f20911X;
            this.f20912Y = bVar.f20912Y;
            this.f20913Z = bVar.f20913Z;
            this.f20915a0 = bVar.f20915a0;
            this.f20917b0 = bVar.f20917b0;
            this.f20919c0 = bVar.f20919c0;
            this.f20921d0 = bVar.f20921d0;
            this.f20927g0 = bVar.f20927g0;
            int[] iArr = bVar.f20923e0;
            if (iArr != null) {
                this.f20923e0 = java.util.Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f20923e0 = null;
            }
            this.f20925f0 = bVar.f20925f0;
            this.f20929h0 = bVar.f20929h0;
            this.f20931i0 = bVar.f20931i0;
            this.f20933j0 = bVar.f20933j0;
        }

        void b(android.content.Context context, android.util.AttributeSet attributeSet) {
            java.lang.StringBuilder sb;
            java.lang.String str;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21200j3);
            this.f20916b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                int i10 = f20887k0.get(index);
                if (i10 == 80) {
                    this.f20929h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f20929h0);
                } else if (i10 != 81) {
                    switch (i10) {
                        case 1:
                            this.f20939p = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20939p);
                            break;
                        case 2:
                            this.f20894G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20894G);
                            break;
                        case 3:
                            this.f20938o = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20938o);
                            break;
                        case 4:
                            this.f20937n = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20937n);
                            break;
                        case 5:
                            this.f20946w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f20888A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20888A);
                            break;
                        case 7:
                            this.f20889B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20889B);
                            break;
                        case 8:
                            this.f20895H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20895H);
                            break;
                        case 9:
                            this.f20943t = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20943t);
                            break;
                        case 10:
                            this.f20942s = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20942s);
                            break;
                        case 11:
                            this.f20900M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20900M);
                            break;
                        case 12:
                            this.f20901N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20901N);
                            break;
                        case 13:
                            this.f20897J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20897J);
                            break;
                        case 14:
                            this.f20899L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20899L);
                            break;
                        case 15:
                            this.f20902O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20902O);
                            break;
                        case 16:
                            this.f20898K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20898K);
                            break;
                        case 17:
                            this.f20922e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20922e);
                            break;
                        case 18:
                            this.f20924f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f20924f);
                            break;
                        case 19:
                            this.f20926g = typedArrayObtainStyledAttributes.getFloat(index, this.f20926g);
                            break;
                        case 20:
                            this.f20944u = typedArrayObtainStyledAttributes.getFloat(index, this.f20944u);
                            break;
                        case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                            this.f20920d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f20920d);
                            break;
                        case 22:
                            this.f20918c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f20918c);
                            break;
                        case 23:
                            this.f20891D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20891D);
                            break;
                        case 24:
                            this.f20928h = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20928h);
                            break;
                        case 25:
                            this.f20930i = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20930i);
                            break;
                        case 26:
                            this.f20890C = typedArrayObtainStyledAttributes.getInt(index, this.f20890C);
                            break;
                        case 27:
                            this.f20892E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20892E);
                            break;
                        case 28:
                            this.f20932j = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20932j);
                            break;
                        case 29:
                            this.f20934k = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20934k);
                            break;
                        case 30:
                            this.f20896I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20896I);
                            break;
                        case 31:
                            this.f20940q = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20940q);
                            break;
                        case 32:
                            this.f20941r = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20941r);
                            break;
                        case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                            this.f20893F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20893F);
                            break;
                        case 34:
                            this.f20936m = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20936m);
                            break;
                        case 35:
                            this.f20935l = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20935l);
                            break;
                        case 36:
                            this.f20945v = typedArrayObtainStyledAttributes.getFloat(index, this.f20945v);
                            break;
                        case 37:
                            this.f20904Q = typedArrayObtainStyledAttributes.getFloat(index, this.f20904Q);
                            break;
                        case 38:
                            this.f20903P = typedArrayObtainStyledAttributes.getFloat(index, this.f20903P);
                            break;
                        case 39:
                            this.f20905R = typedArrayObtainStyledAttributes.getInt(index, this.f20905R);
                            break;
                        case 40:
                            this.f20906S = typedArrayObtainStyledAttributes.getInt(index, this.f20906S);
                            break;
                        default:
                            switch (i10) {
                                case 54:
                                    this.f20907T = typedArrayObtainStyledAttributes.getInt(index, this.f20907T);
                                    break;
                                case 55:
                                    this.f20908U = typedArrayObtainStyledAttributes.getInt(index, this.f20908U);
                                    break;
                                case 56:
                                    this.f20909V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20909V);
                                    break;
                                case 57:
                                    this.f20910W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20910W);
                                    break;
                                case 58:
                                    this.f20911X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20911X);
                                    break;
                                case 59:
                                    this.f20912Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20912Y);
                                    break;
                                default:
                                    switch (i10) {
                                        case 61:
                                            this.f20947x = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20947x);
                                            break;
                                        case 62:
                                            this.f20948y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20948y);
                                            break;
                                        case 63:
                                            this.f20949z = typedArrayObtainStyledAttributes.getFloat(index, this.f20949z);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 69:
                                                    this.f20913Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f20915a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    continue;
                                                case 72:
                                                    this.f20917b0 = typedArrayObtainStyledAttributes.getInt(index, this.f20917b0);
                                                    continue;
                                                case 73:
                                                    this.f20919c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f20919c0);
                                                    continue;
                                                case 74:
                                                    this.f20925f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f20933j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f20933j0);
                                                    continue;
                                                case 76:
                                                    sb = new java.lang.StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f20927g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new java.lang.StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(java.lang.Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f20887k0.get(index));
                                            sb.toString();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f20931i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f20931i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static android.util.SparseIntArray f20950h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20951a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20952b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f20953c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20954d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20955e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f20956f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f20957g = Float.NaN;

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            f20950h = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f21298x4, 1);
            f20950h.append(androidx.constraintlayout.widget.i.f21310z4, 2);
            f20950h.append(androidx.constraintlayout.widget.i.f20982A4, 3);
            f20950h.append(androidx.constraintlayout.widget.i.f21292w4, 4);
            f20950h.append(androidx.constraintlayout.widget.i.f21285v4, 5);
            f20950h.append(androidx.constraintlayout.widget.i.f21304y4, 6);
        }

        public void a(androidx.constraintlayout.widget.e.c cVar) {
            this.f20951a = cVar.f20951a;
            this.f20952b = cVar.f20952b;
            this.f20953c = cVar.f20953c;
            this.f20954d = cVar.f20954d;
            this.f20955e = cVar.f20955e;
            this.f20957g = cVar.f20957g;
            this.f20956f = cVar.f20956f;
        }

        void b(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21278u4);
            this.f20951a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                switch (f20950h.get(index)) {
                    case 1:
                        this.f20957g = typedArrayObtainStyledAttributes.getFloat(index, this.f20957g);
                        break;
                    case 2:
                        this.f20954d = typedArrayObtainStyledAttributes.getInt(index, this.f20954d);
                        break;
                    case 3:
                        this.f20953c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : p142o1.a.f52288c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f20955e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f20952b = androidx.constraintlayout.widget.e.m(typedArrayObtainStyledAttributes, index, this.f20952b);
                        break;
                    case 6:
                        this.f20956f = typedArrayObtainStyledAttributes.getFloat(index, this.f20956f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20958a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20959b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20960c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20961d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f20962e = Float.NaN;

        public void a(androidx.constraintlayout.widget.e.d dVar) {
            this.f20958a = dVar.f20958a;
            this.f20959b = dVar.f20959b;
            this.f20961d = dVar.f20961d;
            this.f20962e = dVar.f20962e;
            this.f20960c = dVar.f20960c;
        }

        void b(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21036J4);
            this.f20958a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21048L4) {
                    this.f20961d = typedArrayObtainStyledAttributes.getFloat(index, this.f20961d);
                } else if (index == androidx.constraintlayout.widget.i.f21042K4) {
                    this.f20959b = typedArrayObtainStyledAttributes.getInt(index, this.f20959b);
                    this.f20959b = androidx.constraintlayout.widget.e.f20876d[this.f20959b];
                } else if (index == androidx.constraintlayout.widget.i.f21060N4) {
                    this.f20960c = typedArrayObtainStyledAttributes.getInt(index, this.f20960c);
                } else if (index == androidx.constraintlayout.widget.i.f21054M4) {
                    this.f20962e = typedArrayObtainStyledAttributes.getFloat(index, this.f20962e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0399e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static android.util.SparseIntArray f20963n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20964a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f20965b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20966c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20967d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f20968e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f20969f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f20970g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f20971h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f20972i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f20973j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f20974k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20975l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f20976m = 0.0f;

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            f20963n = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f21188h5, 1);
            f20963n.append(androidx.constraintlayout.widget.i.f21195i5, 2);
            f20963n.append(androidx.constraintlayout.widget.i.f21202j5, 3);
            f20963n.append(androidx.constraintlayout.widget.i.f21174f5, 4);
            f20963n.append(androidx.constraintlayout.widget.i.f21181g5, 5);
            f20963n.append(androidx.constraintlayout.widget.i.f21146b5, 6);
            f20963n.append(androidx.constraintlayout.widget.i.f21153c5, 7);
            f20963n.append(androidx.constraintlayout.widget.i.f21160d5, 8);
            f20963n.append(androidx.constraintlayout.widget.i.f21167e5, 9);
            f20963n.append(androidx.constraintlayout.widget.i.f21209k5, 10);
            f20963n.append(androidx.constraintlayout.widget.i.f21216l5, 11);
        }

        public void a(androidx.constraintlayout.widget.e.C0399e c0399e) {
            this.f20964a = c0399e.f20964a;
            this.f20965b = c0399e.f20965b;
            this.f20966c = c0399e.f20966c;
            this.f20967d = c0399e.f20967d;
            this.f20968e = c0399e.f20968e;
            this.f20969f = c0399e.f20969f;
            this.f20970g = c0399e.f20970g;
            this.f20971h = c0399e.f20971h;
            this.f20972i = c0399e.f20972i;
            this.f20973j = c0399e.f20973j;
            this.f20974k = c0399e.f20974k;
            this.f20975l = c0399e.f20975l;
            this.f20976m = c0399e.f20976m;
        }

        void b(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21139a5);
            this.f20964a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                switch (f20963n.get(index)) {
                    case 1:
                        this.f20965b = typedArrayObtainStyledAttributes.getFloat(index, this.f20965b);
                        break;
                    case 2:
                        this.f20966c = typedArrayObtainStyledAttributes.getFloat(index, this.f20966c);
                        break;
                    case 3:
                        this.f20967d = typedArrayObtainStyledAttributes.getFloat(index, this.f20967d);
                        break;
                    case 4:
                        this.f20968e = typedArrayObtainStyledAttributes.getFloat(index, this.f20968e);
                        break;
                    case 5:
                        this.f20969f = typedArrayObtainStyledAttributes.getFloat(index, this.f20969f);
                        break;
                    case 6:
                        this.f20970g = typedArrayObtainStyledAttributes.getDimension(index, this.f20970g);
                        break;
                    case 7:
                        this.f20971h = typedArrayObtainStyledAttributes.getDimension(index, this.f20971h);
                        break;
                    case 8:
                        this.f20972i = typedArrayObtainStyledAttributes.getDimension(index, this.f20972i);
                        break;
                    case 9:
                        this.f20973j = typedArrayObtainStyledAttributes.getDimension(index, this.f20973j);
                        break;
                    case 10:
                        this.f20974k = typedArrayObtainStyledAttributes.getDimension(index, this.f20974k);
                        break;
                    case 11:
                        this.f20975l = true;
                        this.f20976m = typedArrayObtainStyledAttributes.getDimension(index, this.f20976m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f20877e = sparseIntArray;
        sparseIntArray.append(androidx.constraintlayout.widget.i.f21274u0, 25);
        f20877e.append(androidx.constraintlayout.widget.i.f21281v0, 26);
        f20877e.append(androidx.constraintlayout.widget.i.f21294x0, 29);
        f20877e.append(androidx.constraintlayout.widget.i.f21300y0, 30);
        f20877e.append(androidx.constraintlayout.widget.i.f21002E0, 36);
        f20877e.append(androidx.constraintlayout.widget.i.f20996D0, 35);
        f20877e.append(androidx.constraintlayout.widget.i.f21148c0, 4);
        f20877e.append(androidx.constraintlayout.widget.i.f21141b0, 3);
        f20877e.append(androidx.constraintlayout.widget.i.f21127Z, 1);
        f20877e.append(androidx.constraintlayout.widget.i.f21050M0, 6);
        f20877e.append(androidx.constraintlayout.widget.i.f21056N0, 7);
        f20877e.append(androidx.constraintlayout.widget.i.f21197j0, 17);
        f20877e.append(androidx.constraintlayout.widget.i.f21204k0, 18);
        f20877e.append(androidx.constraintlayout.widget.i.f21211l0, 19);
        f20877e.append(androidx.constraintlayout.widget.i.f21259s, 27);
        f20877e.append(androidx.constraintlayout.widget.i.f21306z0, 32);
        f20877e.append(androidx.constraintlayout.widget.i.f20978A0, 33);
        f20877e.append(androidx.constraintlayout.widget.i.f21190i0, 10);
        f20877e.append(androidx.constraintlayout.widget.i.f21183h0, 9);
        f20877e.append(androidx.constraintlayout.widget.i.f21074Q0, 13);
        f20877e.append(androidx.constraintlayout.widget.i.f21092T0, 16);
        f20877e.append(androidx.constraintlayout.widget.i.f21080R0, 14);
        f20877e.append(androidx.constraintlayout.widget.i.f21062O0, 11);
        f20877e.append(androidx.constraintlayout.widget.i.f21086S0, 15);
        f20877e.append(androidx.constraintlayout.widget.i.f21068P0, 12);
        f20877e.append(androidx.constraintlayout.widget.i.f21020H0, 40);
        f20877e.append(androidx.constraintlayout.widget.i.f21260s0, 39);
        f20877e.append(androidx.constraintlayout.widget.i.f21253r0, 41);
        f20877e.append(androidx.constraintlayout.widget.i.f21014G0, 42);
        f20877e.append(androidx.constraintlayout.widget.i.f21246q0, 20);
        f20877e.append(androidx.constraintlayout.widget.i.f21008F0, 37);
        f20877e.append(androidx.constraintlayout.widget.i.f21176g0, 5);
        f20877e.append(androidx.constraintlayout.widget.i.f21267t0, 82);
        f20877e.append(androidx.constraintlayout.widget.i.f20990C0, 82);
        f20877e.append(androidx.constraintlayout.widget.i.f21288w0, 82);
        f20877e.append(androidx.constraintlayout.widget.i.f21134a0, 82);
        f20877e.append(androidx.constraintlayout.widget.i.f21121Y, 82);
        f20877e.append(androidx.constraintlayout.widget.i.f21293x, 24);
        f20877e.append(androidx.constraintlayout.widget.i.f21305z, 28);
        f20877e.append(androidx.constraintlayout.widget.i.f21043L, 31);
        f20877e.append(androidx.constraintlayout.widget.i.f21049M, 8);
        f20877e.append(androidx.constraintlayout.widget.i.f21299y, 34);
        f20877e.append(androidx.constraintlayout.widget.i.f20977A, 2);
        f20877e.append(androidx.constraintlayout.widget.i.f21280v, 23);
        f20877e.append(androidx.constraintlayout.widget.i.f21287w, 21);
        f20877e.append(androidx.constraintlayout.widget.i.f21273u, 22);
        f20877e.append(androidx.constraintlayout.widget.i.f20983B, 43);
        f20877e.append(androidx.constraintlayout.widget.i.f21061O, 44);
        f20877e.append(androidx.constraintlayout.widget.i.f21031J, 45);
        f20877e.append(androidx.constraintlayout.widget.i.f21037K, 46);
        f20877e.append(androidx.constraintlayout.widget.i.f21025I, 60);
        f20877e.append(androidx.constraintlayout.widget.i.f21013G, 47);
        f20877e.append(androidx.constraintlayout.widget.i.f21019H, 48);
        f20877e.append(androidx.constraintlayout.widget.i.f20989C, 49);
        f20877e.append(androidx.constraintlayout.widget.i.f20995D, 50);
        f20877e.append(androidx.constraintlayout.widget.i.f21001E, 51);
        f20877e.append(androidx.constraintlayout.widget.i.f21007F, 52);
        f20877e.append(androidx.constraintlayout.widget.i.f21055N, 53);
        f20877e.append(androidx.constraintlayout.widget.i.f21026I0, 54);
        f20877e.append(androidx.constraintlayout.widget.i.f21218m0, 55);
        f20877e.append(androidx.constraintlayout.widget.i.f21032J0, 56);
        f20877e.append(androidx.constraintlayout.widget.i.f21225n0, 57);
        f20877e.append(androidx.constraintlayout.widget.i.f21038K0, 58);
        f20877e.append(androidx.constraintlayout.widget.i.f21232o0, 59);
        f20877e.append(androidx.constraintlayout.widget.i.f21155d0, 61);
        f20877e.append(androidx.constraintlayout.widget.i.f21169f0, 62);
        f20877e.append(androidx.constraintlayout.widget.i.f21162e0, 63);
        f20877e.append(androidx.constraintlayout.widget.i.f21067P, 64);
        f20877e.append(androidx.constraintlayout.widget.i.f21116X0, 65);
        f20877e.append(androidx.constraintlayout.widget.i.f21103V, 66);
        f20877e.append(androidx.constraintlayout.widget.i.f21122Y0, 67);
        f20877e.append(androidx.constraintlayout.widget.i.f21104V0, 79);
        f20877e.append(androidx.constraintlayout.widget.i.f21266t, 38);
        f20877e.append(androidx.constraintlayout.widget.i.f21098U0, 68);
        f20877e.append(androidx.constraintlayout.widget.i.f21044L0, 69);
        f20877e.append(androidx.constraintlayout.widget.i.f21239p0, 70);
        f20877e.append(androidx.constraintlayout.widget.i.f21091T, 71);
        f20877e.append(androidx.constraintlayout.widget.i.f21079R, 72);
        f20877e.append(androidx.constraintlayout.widget.i.f21085S, 73);
        f20877e.append(androidx.constraintlayout.widget.i.f21097U, 74);
        f20877e.append(androidx.constraintlayout.widget.i.f21073Q, 75);
        f20877e.append(androidx.constraintlayout.widget.i.f21110W0, 76);
        f20877e.append(androidx.constraintlayout.widget.i.f20984B0, 77);
        f20877e.append(androidx.constraintlayout.widget.i.f21128Z0, 78);
        f20877e.append(androidx.constraintlayout.widget.i.f21115X, 80);
        f20877e.append(androidx.constraintlayout.widget.i.f21109W, 81);
    }

    private int[] h(android.view.View view, java.lang.String str) {
        int iIntValue;
        java.lang.Object objF;
        java.lang.String[] strArrSplit = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i6 = 0;
        int i10 = 0;
        while (i6 < strArrSplit.length) {
            java.lang.String strTrim = strArrSplit[i6].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.h.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (objF = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof java.lang.Integer)) {
                iIntValue = ((java.lang.Integer) objF).intValue();
            }
            iArr[i10] = iIntValue;
            i6++;
            i10++;
        }
        return i10 != strArrSplit.length ? java.util.Arrays.copyOf(iArr, i10) : iArr;
    }

    private androidx.constraintlayout.widget.e.a i(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.widget.e.a aVar = new androidx.constraintlayout.widget.e.a();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21252r);
        n(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private androidx.constraintlayout.widget.e.a j(int i6) {
        if (!this.f20880c.containsKey(java.lang.Integer.valueOf(i6))) {
            this.f20880c.put(java.lang.Integer.valueOf(i6), new androidx.constraintlayout.widget.e.a());
        }
        return (androidx.constraintlayout.widget.e.a) this.f20880c.get(java.lang.Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(android.content.res.TypedArray typedArray, int i6, int i10) {
        int resourceId = typedArray.getResourceId(i6, i10);
        return resourceId == -1 ? typedArray.getInt(i6, -1) : resourceId;
    }

    private void n(android.content.Context context, androidx.constraintlayout.widget.e.a aVar, android.content.res.TypedArray typedArray) {
        androidx.constraintlayout.widget.e.c cVar;
        java.lang.String string;
        java.lang.StringBuilder sb;
        java.lang.String str;
        int indexCount = typedArray.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            if (index != androidx.constraintlayout.widget.i.f21266t && androidx.constraintlayout.widget.i.f21043L != index && androidx.constraintlayout.widget.i.f21049M != index) {
                aVar.f20883c.f20951a = true;
                aVar.f20884d.f20916b = true;
                aVar.f20882b.f20958a = true;
                aVar.f20885e.f20964a = true;
            }
            switch (f20877e.get(index)) {
                case 1:
                    androidx.constraintlayout.widget.e.b bVar = aVar.f20884d;
                    bVar.f20939p = m(typedArray, index, bVar.f20939p);
                    continue;
                    break;
                case 2:
                    androidx.constraintlayout.widget.e.b bVar2 = aVar.f20884d;
                    bVar2.f20894G = typedArray.getDimensionPixelSize(index, bVar2.f20894G);
                    continue;
                    break;
                case 3:
                    androidx.constraintlayout.widget.e.b bVar3 = aVar.f20884d;
                    bVar3.f20938o = m(typedArray, index, bVar3.f20938o);
                    continue;
                    break;
                case 4:
                    androidx.constraintlayout.widget.e.b bVar4 = aVar.f20884d;
                    bVar4.f20937n = m(typedArray, index, bVar4.f20937n);
                    continue;
                    break;
                case 5:
                    aVar.f20884d.f20946w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    androidx.constraintlayout.widget.e.b bVar5 = aVar.f20884d;
                    bVar5.f20888A = typedArray.getDimensionPixelOffset(index, bVar5.f20888A);
                    continue;
                    break;
                case 7:
                    androidx.constraintlayout.widget.e.b bVar6 = aVar.f20884d;
                    bVar6.f20889B = typedArray.getDimensionPixelOffset(index, bVar6.f20889B);
                    continue;
                    break;
                case 8:
                    androidx.constraintlayout.widget.e.b bVar7 = aVar.f20884d;
                    bVar7.f20895H = typedArray.getDimensionPixelSize(index, bVar7.f20895H);
                    continue;
                    break;
                case 9:
                    androidx.constraintlayout.widget.e.b bVar8 = aVar.f20884d;
                    bVar8.f20943t = m(typedArray, index, bVar8.f20943t);
                    continue;
                    break;
                case 10:
                    androidx.constraintlayout.widget.e.b bVar9 = aVar.f20884d;
                    bVar9.f20942s = m(typedArray, index, bVar9.f20942s);
                    continue;
                    break;
                case 11:
                    androidx.constraintlayout.widget.e.b bVar10 = aVar.f20884d;
                    bVar10.f20900M = typedArray.getDimensionPixelSize(index, bVar10.f20900M);
                    continue;
                    break;
                case 12:
                    androidx.constraintlayout.widget.e.b bVar11 = aVar.f20884d;
                    bVar11.f20901N = typedArray.getDimensionPixelSize(index, bVar11.f20901N);
                    continue;
                    break;
                case 13:
                    androidx.constraintlayout.widget.e.b bVar12 = aVar.f20884d;
                    bVar12.f20897J = typedArray.getDimensionPixelSize(index, bVar12.f20897J);
                    continue;
                    break;
                case 14:
                    androidx.constraintlayout.widget.e.b bVar13 = aVar.f20884d;
                    bVar13.f20899L = typedArray.getDimensionPixelSize(index, bVar13.f20899L);
                    continue;
                    break;
                case 15:
                    androidx.constraintlayout.widget.e.b bVar14 = aVar.f20884d;
                    bVar14.f20902O = typedArray.getDimensionPixelSize(index, bVar14.f20902O);
                    continue;
                    break;
                case 16:
                    androidx.constraintlayout.widget.e.b bVar15 = aVar.f20884d;
                    bVar15.f20898K = typedArray.getDimensionPixelSize(index, bVar15.f20898K);
                    continue;
                    break;
                case 17:
                    androidx.constraintlayout.widget.e.b bVar16 = aVar.f20884d;
                    bVar16.f20922e = typedArray.getDimensionPixelOffset(index, bVar16.f20922e);
                    continue;
                    break;
                case 18:
                    androidx.constraintlayout.widget.e.b bVar17 = aVar.f20884d;
                    bVar17.f20924f = typedArray.getDimensionPixelOffset(index, bVar17.f20924f);
                    continue;
                    break;
                case 19:
                    androidx.constraintlayout.widget.e.b bVar18 = aVar.f20884d;
                    bVar18.f20926g = typedArray.getFloat(index, bVar18.f20926g);
                    continue;
                    break;
                case 20:
                    androidx.constraintlayout.widget.e.b bVar19 = aVar.f20884d;
                    bVar19.f20944u = typedArray.getFloat(index, bVar19.f20944u);
                    continue;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    androidx.constraintlayout.widget.e.b bVar20 = aVar.f20884d;
                    bVar20.f20920d = typedArray.getLayoutDimension(index, bVar20.f20920d);
                    continue;
                    break;
                case 22:
                    androidx.constraintlayout.widget.e.d dVar = aVar.f20882b;
                    dVar.f20959b = typedArray.getInt(index, dVar.f20959b);
                    androidx.constraintlayout.widget.e.d dVar2 = aVar.f20882b;
                    dVar2.f20959b = f20876d[dVar2.f20959b];
                    continue;
                    break;
                case 23:
                    androidx.constraintlayout.widget.e.b bVar21 = aVar.f20884d;
                    bVar21.f20918c = typedArray.getLayoutDimension(index, bVar21.f20918c);
                    continue;
                    break;
                case 24:
                    androidx.constraintlayout.widget.e.b bVar22 = aVar.f20884d;
                    bVar22.f20891D = typedArray.getDimensionPixelSize(index, bVar22.f20891D);
                    continue;
                    break;
                case 25:
                    androidx.constraintlayout.widget.e.b bVar23 = aVar.f20884d;
                    bVar23.f20928h = m(typedArray, index, bVar23.f20928h);
                    continue;
                    break;
                case 26:
                    androidx.constraintlayout.widget.e.b bVar24 = aVar.f20884d;
                    bVar24.f20930i = m(typedArray, index, bVar24.f20930i);
                    continue;
                    break;
                case 27:
                    androidx.constraintlayout.widget.e.b bVar25 = aVar.f20884d;
                    bVar25.f20890C = typedArray.getInt(index, bVar25.f20890C);
                    continue;
                    break;
                case 28:
                    androidx.constraintlayout.widget.e.b bVar26 = aVar.f20884d;
                    bVar26.f20892E = typedArray.getDimensionPixelSize(index, bVar26.f20892E);
                    continue;
                    break;
                case 29:
                    androidx.constraintlayout.widget.e.b bVar27 = aVar.f20884d;
                    bVar27.f20932j = m(typedArray, index, bVar27.f20932j);
                    continue;
                    break;
                case 30:
                    androidx.constraintlayout.widget.e.b bVar28 = aVar.f20884d;
                    bVar28.f20934k = m(typedArray, index, bVar28.f20934k);
                    continue;
                    break;
                case 31:
                    androidx.constraintlayout.widget.e.b bVar29 = aVar.f20884d;
                    bVar29.f20896I = typedArray.getDimensionPixelSize(index, bVar29.f20896I);
                    continue;
                    break;
                case 32:
                    androidx.constraintlayout.widget.e.b bVar30 = aVar.f20884d;
                    bVar30.f20940q = m(typedArray, index, bVar30.f20940q);
                    continue;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    androidx.constraintlayout.widget.e.b bVar31 = aVar.f20884d;
                    bVar31.f20941r = m(typedArray, index, bVar31.f20941r);
                    continue;
                    break;
                case 34:
                    androidx.constraintlayout.widget.e.b bVar32 = aVar.f20884d;
                    bVar32.f20893F = typedArray.getDimensionPixelSize(index, bVar32.f20893F);
                    continue;
                    break;
                case 35:
                    androidx.constraintlayout.widget.e.b bVar33 = aVar.f20884d;
                    bVar33.f20936m = m(typedArray, index, bVar33.f20936m);
                    continue;
                    break;
                case 36:
                    androidx.constraintlayout.widget.e.b bVar34 = aVar.f20884d;
                    bVar34.f20935l = m(typedArray, index, bVar34.f20935l);
                    continue;
                    break;
                case 37:
                    androidx.constraintlayout.widget.e.b bVar35 = aVar.f20884d;
                    bVar35.f20945v = typedArray.getFloat(index, bVar35.f20945v);
                    continue;
                    break;
                case 38:
                    aVar.f20881a = typedArray.getResourceId(index, aVar.f20881a);
                    continue;
                    break;
                case 39:
                    androidx.constraintlayout.widget.e.b bVar36 = aVar.f20884d;
                    bVar36.f20904Q = typedArray.getFloat(index, bVar36.f20904Q);
                    continue;
                    break;
                case 40:
                    androidx.constraintlayout.widget.e.b bVar37 = aVar.f20884d;
                    bVar37.f20903P = typedArray.getFloat(index, bVar37.f20903P);
                    continue;
                    break;
                case 41:
                    androidx.constraintlayout.widget.e.b bVar38 = aVar.f20884d;
                    bVar38.f20905R = typedArray.getInt(index, bVar38.f20905R);
                    continue;
                    break;
                case 42:
                    androidx.constraintlayout.widget.e.b bVar39 = aVar.f20884d;
                    bVar39.f20906S = typedArray.getInt(index, bVar39.f20906S);
                    continue;
                    break;
                case 43:
                    androidx.constraintlayout.widget.e.d dVar3 = aVar.f20882b;
                    dVar3.f20961d = typedArray.getFloat(index, dVar3.f20961d);
                    continue;
                    break;
                case 44:
                    androidx.constraintlayout.widget.e.C0399e c0399e = aVar.f20885e;
                    c0399e.f20975l = true;
                    c0399e.f20976m = typedArray.getDimension(index, c0399e.f20976m);
                    continue;
                    break;
                case 45:
                    androidx.constraintlayout.widget.e.C0399e c0399e2 = aVar.f20885e;
                    c0399e2.f20966c = typedArray.getFloat(index, c0399e2.f20966c);
                    continue;
                    break;
                case 46:
                    androidx.constraintlayout.widget.e.C0399e c0399e3 = aVar.f20885e;
                    c0399e3.f20967d = typedArray.getFloat(index, c0399e3.f20967d);
                    continue;
                    break;
                case 47:
                    androidx.constraintlayout.widget.e.C0399e c0399e4 = aVar.f20885e;
                    c0399e4.f20968e = typedArray.getFloat(index, c0399e4.f20968e);
                    continue;
                    break;
                case 48:
                    androidx.constraintlayout.widget.e.C0399e c0399e5 = aVar.f20885e;
                    c0399e5.f20969f = typedArray.getFloat(index, c0399e5.f20969f);
                    continue;
                    break;
                case 49:
                    androidx.constraintlayout.widget.e.C0399e c0399e6 = aVar.f20885e;
                    c0399e6.f20970g = typedArray.getDimension(index, c0399e6.f20970g);
                    continue;
                    break;
                case 50:
                    androidx.constraintlayout.widget.e.C0399e c0399e7 = aVar.f20885e;
                    c0399e7.f20971h = typedArray.getDimension(index, c0399e7.f20971h);
                    continue;
                    break;
                case 51:
                    androidx.constraintlayout.widget.e.C0399e c0399e8 = aVar.f20885e;
                    c0399e8.f20972i = typedArray.getDimension(index, c0399e8.f20972i);
                    continue;
                    break;
                case 52:
                    androidx.constraintlayout.widget.e.C0399e c0399e9 = aVar.f20885e;
                    c0399e9.f20973j = typedArray.getDimension(index, c0399e9.f20973j);
                    continue;
                    break;
                case 53:
                    androidx.constraintlayout.widget.e.C0399e c0399e10 = aVar.f20885e;
                    c0399e10.f20974k = typedArray.getDimension(index, c0399e10.f20974k);
                    continue;
                    break;
                case 54:
                    androidx.constraintlayout.widget.e.b bVar40 = aVar.f20884d;
                    bVar40.f20907T = typedArray.getInt(index, bVar40.f20907T);
                    continue;
                    break;
                case 55:
                    androidx.constraintlayout.widget.e.b bVar41 = aVar.f20884d;
                    bVar41.f20908U = typedArray.getInt(index, bVar41.f20908U);
                    continue;
                    break;
                case 56:
                    androidx.constraintlayout.widget.e.b bVar42 = aVar.f20884d;
                    bVar42.f20909V = typedArray.getDimensionPixelSize(index, bVar42.f20909V);
                    continue;
                    break;
                case 57:
                    androidx.constraintlayout.widget.e.b bVar43 = aVar.f20884d;
                    bVar43.f20910W = typedArray.getDimensionPixelSize(index, bVar43.f20910W);
                    continue;
                    break;
                case 58:
                    androidx.constraintlayout.widget.e.b bVar44 = aVar.f20884d;
                    bVar44.f20911X = typedArray.getDimensionPixelSize(index, bVar44.f20911X);
                    continue;
                    break;
                case 59:
                    androidx.constraintlayout.widget.e.b bVar45 = aVar.f20884d;
                    bVar45.f20912Y = typedArray.getDimensionPixelSize(index, bVar45.f20912Y);
                    continue;
                    break;
                case 60:
                    androidx.constraintlayout.widget.e.C0399e c0399e11 = aVar.f20885e;
                    c0399e11.f20965b = typedArray.getFloat(index, c0399e11.f20965b);
                    continue;
                    break;
                case 61:
                    androidx.constraintlayout.widget.e.b bVar46 = aVar.f20884d;
                    bVar46.f20947x = m(typedArray, index, bVar46.f20947x);
                    continue;
                    break;
                case 62:
                    androidx.constraintlayout.widget.e.b bVar47 = aVar.f20884d;
                    bVar47.f20948y = typedArray.getDimensionPixelSize(index, bVar47.f20948y);
                    continue;
                    break;
                case 63:
                    androidx.constraintlayout.widget.e.b bVar48 = aVar.f20884d;
                    bVar48.f20949z = typedArray.getFloat(index, bVar48.f20949z);
                    continue;
                    break;
                case 64:
                    androidx.constraintlayout.widget.e.c cVar2 = aVar.f20883c;
                    cVar2.f20952b = m(typedArray, index, cVar2.f20952b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f20883c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f20883c;
                        string = p142o1.a.f52288c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f20953c = string;
                    continue;
                    break;
                case 66:
                    aVar.f20883c.f20955e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    androidx.constraintlayout.widget.e.c cVar3 = aVar.f20883c;
                    cVar3.f20957g = typedArray.getFloat(index, cVar3.f20957g);
                    continue;
                    break;
                case 68:
                    androidx.constraintlayout.widget.e.d dVar4 = aVar.f20882b;
                    dVar4.f20962e = typedArray.getFloat(index, dVar4.f20962e);
                    continue;
                    break;
                case 69:
                    aVar.f20884d.f20913Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f20884d.f20915a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    continue;
                    break;
                case 72:
                    androidx.constraintlayout.widget.e.b bVar49 = aVar.f20884d;
                    bVar49.f20917b0 = typedArray.getInt(index, bVar49.f20917b0);
                    continue;
                    break;
                case 73:
                    androidx.constraintlayout.widget.e.b bVar50 = aVar.f20884d;
                    bVar50.f20919c0 = typedArray.getDimensionPixelSize(index, bVar50.f20919c0);
                    continue;
                    break;
                case 74:
                    aVar.f20884d.f20925f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    androidx.constraintlayout.widget.e.b bVar51 = aVar.f20884d;
                    bVar51.f20933j0 = typedArray.getBoolean(index, bVar51.f20933j0);
                    continue;
                    break;
                case 76:
                    androidx.constraintlayout.widget.e.c cVar4 = aVar.f20883c;
                    cVar4.f20954d = typedArray.getInt(index, cVar4.f20954d);
                    continue;
                    break;
                case 77:
                    aVar.f20884d.f20927g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    androidx.constraintlayout.widget.e.d dVar5 = aVar.f20882b;
                    dVar5.f20960c = typedArray.getInt(index, dVar5.f20960c);
                    continue;
                    break;
                case 79:
                    androidx.constraintlayout.widget.e.c cVar5 = aVar.f20883c;
                    cVar5.f20956f = typedArray.getFloat(index, cVar5.f20956f);
                    continue;
                    break;
                case 80:
                    androidx.constraintlayout.widget.e.b bVar52 = aVar.f20884d;
                    bVar52.f20929h0 = typedArray.getBoolean(index, bVar52.f20929h0);
                    continue;
                    break;
                case 81:
                    androidx.constraintlayout.widget.e.b bVar53 = aVar.f20884d;
                    bVar53.f20931i0 = typedArray.getBoolean(index, bVar53.f20931i0);
                    continue;
                    break;
                case 82:
                    sb = new java.lang.StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new java.lang.StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(java.lang.Integer.toHexString(index));
            sb.append("   ");
            sb.append(f20877e.get(index));
            sb.toString();
        }
    }

    public void c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, boolean z6) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashSet<java.lang.Integer> hashSet = new java.util.HashSet(this.f20880c.keySet());
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = constraintLayout.getChildAt(i6);
            int id = childAt.getId();
            if (!this.f20880c.containsKey(java.lang.Integer.valueOf(id))) {
                java.lang.String str = "id unknown " + p152p1.a.a(childAt);
            } else {
                if (this.f20879b && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f20880c.containsKey(java.lang.Integer.valueOf(id))) {
                        hashSet.remove(java.lang.Integer.valueOf(id));
                        androidx.constraintlayout.widget.e.a aVar = (androidx.constraintlayout.widget.e.a) this.f20880c.get(java.lang.Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f20884d.f20921d0 = 1;
                        }
                        int i10 = aVar.f20884d.f20921d0;
                        if (i10 != -1 && i10 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f20884d.f20917b0);
                            aVar2.setMargin(aVar.f20884d.f20919c0);
                            aVar2.setAllowsGoneWidget(aVar.f20884d.f20933j0);
                            androidx.constraintlayout.widget.e.b bVar = aVar.f20884d;
                            int[] iArr = bVar.f20923e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                java.lang.String str2 = bVar.f20925f0;
                                if (str2 != null) {
                                    bVar.f20923e0 = h(aVar2, str2);
                                    aVar2.setReferencedIds(aVar.f20884d.f20923e0);
                                }
                            }
                        }
                        androidx.constraintlayout.widget.ConstraintLayout.b bVar2 = (androidx.constraintlayout.widget.ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z6) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f20886f);
                        }
                        childAt.setLayoutParams(bVar2);
                        androidx.constraintlayout.widget.e.d dVar = aVar.f20882b;
                        if (dVar.f20960c == 0) {
                            childAt.setVisibility(dVar.f20959b);
                        }
                        childAt.setAlpha(aVar.f20882b.f20961d);
                        childAt.setRotation(aVar.f20885e.f20965b);
                        childAt.setRotationX(aVar.f20885e.f20966c);
                        childAt.setRotationY(aVar.f20885e.f20967d);
                        childAt.setScaleX(aVar.f20885e.f20968e);
                        childAt.setScaleY(aVar.f20885e.f20969f);
                        if (!java.lang.Float.isNaN(aVar.f20885e.f20970g)) {
                            childAt.setPivotX(aVar.f20885e.f20970g);
                        }
                        if (!java.lang.Float.isNaN(aVar.f20885e.f20971h)) {
                            childAt.setPivotY(aVar.f20885e.f20971h);
                        }
                        childAt.setTranslationX(aVar.f20885e.f20972i);
                        childAt.setTranslationY(aVar.f20885e.f20973j);
                        childAt.setTranslationZ(aVar.f20885e.f20974k);
                        androidx.constraintlayout.widget.e.C0399e c0399e = aVar.f20885e;
                        if (c0399e.f20975l) {
                            childAt.setElevation(c0399e.f20976m);
                        }
                    } else {
                        java.lang.String str3 = "WARNING NO CONSTRAINTS for view " + id;
                    }
                }
            }
        }
        for (java.lang.Integer num : hashSet) {
            androidx.constraintlayout.widget.e.a aVar3 = (androidx.constraintlayout.widget.e.a) this.f20880c.get(num);
            int i11 = aVar3.f20884d.f20921d0;
            if (i11 != -1 && i11 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                androidx.constraintlayout.widget.e.b bVar3 = aVar3.f20884d;
                int[] iArr2 = bVar3.f20923e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    java.lang.String str4 = bVar3.f20925f0;
                    if (str4 != null) {
                        bVar3.f20923e0 = h(aVar4, str4);
                        aVar4.setReferencedIds(aVar3.f20884d.f20923e0);
                    }
                }
                aVar4.setType(aVar3.f20884d.f20917b0);
                aVar4.setMargin(aVar3.f20884d.f20919c0);
                androidx.constraintlayout.widget.ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                aVar4.m();
                aVar3.b(bVarD);
                constraintLayout.addView(aVar4, bVarD);
            }
            if (aVar3.f20884d.f20914a) {
                android.view.View gVar = new androidx.constraintlayout.widget.g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                androidx.constraintlayout.widget.ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.b(bVarD2);
                constraintLayout.addView(gVar, bVarD2);
            }
        }
    }

    public void e(android.content.Context context, int i6) {
        f((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(i6, (android.view.ViewGroup) null));
    }

    public void f(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f20880c.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = constraintLayout.getChildAt(i6);
            androidx.constraintlayout.widget.ConstraintLayout.b bVar = (androidx.constraintlayout.widget.ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f20879b && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f20880c.containsKey(java.lang.Integer.valueOf(id))) {
                this.f20880c.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.e.a());
            }
            androidx.constraintlayout.widget.e.a aVar = (androidx.constraintlayout.widget.e.a) this.f20880c.get(java.lang.Integer.valueOf(id));
            aVar.f20886f = androidx.constraintlayout.widget.b.a(this.f20878a, childAt);
            aVar.d(id, bVar);
            aVar.f20882b.f20959b = childAt.getVisibility();
            aVar.f20882b.f20961d = childAt.getAlpha();
            aVar.f20885e.f20965b = childAt.getRotation();
            aVar.f20885e.f20966c = childAt.getRotationX();
            aVar.f20885e.f20967d = childAt.getRotationY();
            aVar.f20885e.f20968e = childAt.getScaleX();
            aVar.f20885e.f20969f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                androidx.constraintlayout.widget.e.C0399e c0399e = aVar.f20885e;
                c0399e.f20970g = pivotX;
                c0399e.f20971h = pivotY;
            }
            aVar.f20885e.f20972i = childAt.getTranslationX();
            aVar.f20885e.f20973j = childAt.getTranslationY();
            aVar.f20885e.f20974k = childAt.getTranslationZ();
            androidx.constraintlayout.widget.e.C0399e c0399e2 = aVar.f20885e;
            if (c0399e2.f20975l) {
                c0399e2.f20976m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f20884d.f20933j0 = aVar2.n();
                aVar.f20884d.f20923e0 = aVar2.getReferencedIds();
                aVar.f20884d.f20917b0 = aVar2.getType();
                aVar.f20884d.f20919c0 = aVar2.getMargin();
            }
        }
    }

    public void g(int i6, int i10, int i11, float f6) {
        androidx.constraintlayout.widget.e.b bVar = j(i6).f20884d;
        bVar.f20947x = i10;
        bVar.f20948y = i11;
        bVar.f20949z = f6;
    }

    public void k(android.content.Context context, int i6) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    androidx.constraintlayout.widget.e.a aVarI = i(context, android.util.Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f20884d.f20914a = true;
                    }
                    this.f20880c.put(java.lang.Integer.valueOf(aVarI.f20881a), aVarI);
                }
            }
        } catch (java.io.IOException e6) {
            e6.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    public void l(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            androidx.constraintlayout.widget.e.a aVarI = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarI = i(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                aVarI = i(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                androidx.constraintlayout.widget.e.b bVar = aVarI.f20884d;
                                bVar.f20914a = true;
                                bVar.f20916b = true;
                                break;
                            case "Barrier":
                                aVarI = i(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                aVarI.f20884d.f20921d0 = 1;
                                break;
                            case "PropertySet":
                                if (aVarI == null) {
                                    throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f20882b.b(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Transform":
                                if (aVarI == null) {
                                    throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f20885e.b(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Layout":
                                if (aVarI == null) {
                                    throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f20884d.b(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Motion":
                                if (aVarI == null) {
                                    throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f20883c.b(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "CustomAttribute":
                                if (aVarI == null) {
                                    throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.b.b(context, xmlPullParser, aVarI.f20886f);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        java.lang.String name = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f20880c.put(java.lang.Integer.valueOf(aVarI.f20881a), aVarI);
                            aVarI = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException e6) {
            e6.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
