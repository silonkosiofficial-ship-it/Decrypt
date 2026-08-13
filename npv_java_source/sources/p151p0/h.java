package p151p0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p0.h.a f52647g = new p0.h.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p151p0.c f52648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p151p0.c f52649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p151p0.c f52650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p151p0.c f52651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f52652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f52653f;

    public static final class a {

        /* JADX INFO: renamed from: p0.h$a$a, reason: collision with other inner class name */
        public static final class C0679a extends p151p0.h {
            C0679a(p151p0.c cVar, int i6) {
                super(cVar, cVar, i6, null);
            }

            @Override // p151p0.h
            public long a(long j6) {
                return j6;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(p151p0.c cVar, p151p0.c cVar2, int i6) {
            if (!p151p0.n.e(i6, p151p0.n.f52675a.a())) {
                return null;
            }
            long jE = cVar.e();
            p0.b.a aVar = p151p0.b.f52614a;
            boolean zE = p151p0.b.e(jE, aVar.b());
            boolean zE2 = p151p0.b.e(cVar2.e(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                cVar = cVar2;
            }
            p247y7.AbstractC7350t.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            p151p0.x xVar = (p151p0.x) cVar;
            float[] fArrC = zE ? xVar.N().c() : p151p0.k.f52658a.c();
            float[] fArrC2 = zE2 ? xVar.N().c() : p151p0.k.f52658a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final p151p0.h c(p151p0.c cVar) {
            return new p0.h.a.C0679a(cVar, p151p0.n.f52675a.c());
        }
    }

    public static final class b extends p151p0.h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final p151p0.x f52654h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p151p0.x f52655i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f52656j;

        private b(p151p0.x xVar, p151p0.x xVar2, int i6) {
            super(xVar, xVar2, xVar, xVar2, i6, null, null);
            this.f52654h = xVar;
            this.f52655i = xVar2;
            this.f52656j = b(xVar, xVar2, i6);
        }

        public /* synthetic */ b(p151p0.x xVar, p151p0.x xVar2, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(xVar, xVar2, i6);
        }

        private final float[] b(p151p0.x xVar, p151p0.x xVar2, int i6) {
            if (p151p0.d.f(xVar.N(), xVar2.N())) {
                return p151p0.d.l(xVar2.G(), xVar.M());
            }
            float[] fArrM = xVar.M();
            float[] fArrG = xVar2.G();
            float[] fArrC = xVar.N().c();
            float[] fArrC2 = xVar2.N().c();
            p151p0.z zVarN = xVar.N();
            p151p0.k kVar = p151p0.k.f52658a;
            if (!p151p0.d.f(zVarN, kVar.b())) {
                float[] fArrB = p151p0.AbstractC7025a.f52609b.a().b();
                float[] fArrC3 = kVar.c();
                float[] fArrCopyOf = java.util.Arrays.copyOf(fArrC3, fArrC3.length);
                p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(this, size)");
                fArrM = p151p0.d.l(p151p0.d.e(fArrB, fArrC, fArrCopyOf), xVar.M());
            }
            if (!p151p0.d.f(xVar2.N(), kVar.b())) {
                float[] fArrB2 = p151p0.AbstractC7025a.f52609b.a().b();
                float[] fArrC4 = kVar.c();
                float[] fArrCopyOf2 = java.util.Arrays.copyOf(fArrC4, fArrC4.length);
                p247y7.AbstractC7350t.e(fArrCopyOf2, "copyOf(this, size)");
                fArrG = p151p0.d.k(p151p0.d.l(p151p0.d.e(fArrB2, fArrC2, fArrCopyOf2), xVar2.M()));
            }
            if (p151p0.n.e(i6, p151p0.n.f52675a.a())) {
                fArrM = p151p0.d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrM);
            }
            return p151p0.d.l(fArrG, fArrM);
        }

        @Override // p151p0.h
        public long a(long j6) {
            float fT = p141o0.C7016y0.t(j6);
            float fS = p141o0.C7016y0.s(j6);
            float fQ = p141o0.C7016y0.q(j6);
            float fP = p141o0.C7016y0.p(j6);
            float fA = (float) this.f52654h.E().a(fT);
            float fA2 = (float) this.f52654h.E().a(fS);
            float fA3 = (float) this.f52654h.E().a(fQ);
            float[] fArr = this.f52656j;
            return p141o0.A0.a((float) this.f52655i.I().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.f52655i.I().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.f52655i.I().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fP, this.f52655i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private h(p151p0.c cVar, p151p0.c cVar2, int i6) {
        long jE = cVar.e();
        p0.b.a aVar = p151p0.b.f52614a;
        this(cVar, cVar2, p151p0.b.e(jE, aVar.b()) ? p151p0.d.d(cVar, p151p0.k.f52658a.b(), null, 2, null) : cVar, p151p0.b.e(cVar2.e(), aVar.b()) ? p151p0.d.d(cVar2, p151p0.k.f52658a.b(), null, 2, null) : cVar2, i6, f52647g.b(cVar, cVar2, i6), null);
    }

    public /* synthetic */ h(p151p0.c cVar, p151p0.c cVar2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, cVar2, i6);
    }

    private h(p151p0.c cVar, p151p0.c cVar2, p151p0.c cVar3, p151p0.c cVar4, int i6, float[] fArr) {
        this.f52648a = cVar;
        this.f52649b = cVar2;
        this.f52650c = cVar3;
        this.f52651d = cVar4;
        this.f52652e = i6;
        this.f52653f = fArr;
    }

    public /* synthetic */ h(p151p0.c cVar, p151p0.c cVar2, p151p0.c cVar3, p151p0.c cVar4, int i6, float[] fArr, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, cVar2, cVar3, cVar4, i6, fArr);
    }

    public long a(long j6) {
        float fT = p141o0.C7016y0.t(j6);
        float fS = p141o0.C7016y0.s(j6);
        float fQ = p141o0.C7016y0.q(j6);
        float fP = p141o0.C7016y0.p(j6);
        long jH = this.f52650c.h(fT, fS, fQ);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jH & 4294967295L));
        float fI = this.f52650c.i(fT, fS, fQ);
        float[] fArr = this.f52653f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fI *= fArr[2];
        }
        float f6 = fIntBitsToFloat;
        return this.f52651d.j(f6, fIntBitsToFloat2, fI, fP, this.f52649b);
    }
}
