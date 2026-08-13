package p151p0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p151p0.g f52623a = new p151p0.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f52624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f52625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p151p0.y f52626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p151p0.y f52627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p151p0.x f52628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p151p0.x f52629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p151p0.x f52630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p151p0.x f52631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p151p0.x f52632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p151p0.x f52633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p151p0.x f52634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p151p0.x f52635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p151p0.x f52636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final p151p0.x f52637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p151p0.x f52638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p151p0.x f52639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p151p0.x f52640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p151p0.x f52641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p151p0.c f52642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p151p0.c f52643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final p151p0.x f52644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p151p0.c f52645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final p151p0.c[] f52646x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f52624b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f52625c = fArr2;
        p151p0.y yVar = new p151p0.y(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f52626d = yVar;
        p151p0.y yVar2 = new p151p0.y(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f52627e = yVar2;
        p151p0.k kVar = p151p0.k.f52658a;
        p151p0.x xVar = new p151p0.x("sRGB IEC61966-2.1", fArr, kVar.e(), yVar, 0);
        f52628f = xVar;
        p151p0.x xVar2 = new p151p0.x("sRGB IEC61966-2.1 (Linear)", fArr, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f52629g = xVar2;
        p151p0.x xVar3 = new p151p0.x("scRGB-nl IEC 61966-2-2:2003", fArr, kVar.e(), null, new p151p0.j() { // from class: p0.e
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.g.c(d6);
            }
        }, new p151p0.j() { // from class: p0.f
            @Override // p151p0.j
            public final double a(double d6) {
                return p151p0.g.d(d6);
            }
        }, -0.799f, 2.399f, yVar, 2);
        f52630h = xVar3;
        p151p0.x xVar4 = new p151p0.x("scRGB IEC 61966-2-2:2003", fArr, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f52631i = xVar4;
        p151p0.x xVar5 = new p151p0.x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new p151p0.y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f52632j = xVar5;
        p151p0.x xVar6 = new p151p0.x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new p151p0.y(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f52633k = xVar6;
        p151p0.x xVar7 = new p151p0.x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new p151p0.z(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f52634l = xVar7;
        p151p0.x xVar8 = new p151p0.x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), yVar, 7);
        f52635m = xVar8;
        p151p0.x xVar9 = new p151p0.x("NTSC (1953)", fArr2, kVar.a(), new p151p0.y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f52636n = xVar9;
        p151p0.x xVar10 = new p151p0.x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new p151p0.y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f52637o = xVar10;
        p151p0.x xVar11 = new p151p0.x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f52638p = xVar11;
        p151p0.x xVar12 = new p151p0.x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new p151p0.y(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f52639q = xVar12;
        p151p0.x xVar13 = new p151p0.x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f52640r = xVar13;
        p151p0.x xVar14 = new p151p0.x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f52641s = xVar14;
        p151p0.A a6 = new p151p0.A("Generic XYZ", 14);
        f52642t = a6;
        p151p0.l lVar = new p151p0.l("Generic L*a*b*", 15);
        f52643u = lVar;
        p151p0.x xVar15 = new p151p0.x("None", fArr, kVar.e(), yVar2, 16);
        f52644v = xVar15;
        p151p0.m mVar = new p151p0.m("Oklab", 17);
        f52645w = mVar;
        f52646x = new p151p0.c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, a6, lVar, xVar15, mVar};
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d6) {
        return p151p0.d.a(d6, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d6) {
        return p151p0.d.b(d6, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final p151p0.x e() {
        return f52640r;
    }

    public final p151p0.x f() {
        return f52641s;
    }

    public final p151p0.x g() {
        return f52638p;
    }

    public final p151p0.x h() {
        return f52633k;
    }

    public final p151p0.x i() {
        return f52632j;
    }

    public final p151p0.c j() {
        return f52643u;
    }

    public final p151p0.c k() {
        return f52642t;
    }

    public final p151p0.c[] l() {
        return f52646x;
    }

    public final p151p0.x m() {
        return f52634l;
    }

    public final p151p0.x n() {
        return f52635m;
    }

    public final p151p0.x o() {
        return f52630h;
    }

    public final p151p0.x p() {
        return f52631i;
    }

    public final p151p0.x q() {
        return f52629g;
    }

    public final p151p0.x r() {
        return f52636n;
    }

    public final float[] s() {
        return f52625c;
    }

    public final p151p0.c t() {
        return f52645w;
    }

    public final p151p0.x u() {
        return f52639q;
    }

    public final p151p0.x v() {
        return f52637o;
    }

    public final p151p0.x w() {
        return f52628f;
    }

    public final float[] x() {
        return f52624b;
    }

    public final p151p0.x y() {
        return f52644v;
    }
}
