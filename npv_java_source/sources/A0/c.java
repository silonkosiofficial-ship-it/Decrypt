package A0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0.c.a f176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0.a[] f178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f182h;

    public enum a {
        Lsq2,
        Impulse
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186a;

        static {
            int[] iArr = new int[A0.c.a.values().length];
            try {
                iArr[A0.c.a.Impulse.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[A0.c.a.Lsq2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f186a = iArr;
        }
    }

    public c(boolean z6, A0.c.a aVar) {
        this.f175a = z6;
        this.f176b = aVar;
        if (z6 && aVar.equals(A0.c.a.Lsq2)) {
            throw new java.lang.IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i6 = A0.c.b.f186a[aVar.ordinal()];
        int i10 = 2;
        if (i6 != 1) {
            if (i6 != 2) {
                throw new p087i7.s();
            }
            i10 = 3;
        }
        this.f177c = i10;
        this.f178d = new A0.a[20];
        this.f180f = new float[20];
        this.f181g = new float[20];
        this.f182h = new float[3];
    }

    public /* synthetic */ c(boolean z6, A0.c.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? A0.c.a.Lsq2 : aVar);
    }

    private final float b(float[] fArr, float[] fArr2, int i6) {
        try {
            return A0.e.i(fArr2, fArr, i6, 2, this.f182h)[1];
        } catch (java.lang.IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j6, float f6) {
        int i6 = (this.f179e + 1) % 20;
        this.f179e = i6;
        A0.e.j(this.f178d, i6, j6, f6);
    }

    public final float c() {
        float f6;
        float[] fArr = this.f180f;
        float[] fArr2 = this.f181g;
        int i6 = this.f179e;
        A0.a aVar = this.f178d[i6];
        if (aVar == null) {
            return 0.0f;
        }
        int i10 = 0;
        A0.a aVar2 = aVar;
        while (true) {
            A0.a aVar3 = this.f178d[i6];
            if (aVar3 == null) {
                break;
            }
            float fB = aVar.b() - aVar3.b();
            float fAbs = java.lang.Math.abs(aVar3.b() - aVar2.b());
            A0.a aVar4 = (this.f176b == A0.c.a.Lsq2 || this.f175a) ? aVar3 : aVar;
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i10] = aVar3.a();
            fArr2[i10] = -fB;
            if (i6 == 0) {
                i6 = 20;
            }
            i6--;
            i10++;
            if (i10 >= 20) {
                break;
            }
            aVar2 = aVar4;
        }
        if (i10 < this.f177c) {
            return 0.0f;
        }
        int i11 = A0.c.b.f186a[this.f176b.ordinal()];
        if (i11 == 1) {
            f6 = A0.e.f(fArr, fArr2, i10, this.f175a);
        } else {
            if (i11 != 2) {
                throw new p087i7.s();
            }
            f6 = b(fArr, fArr2, i10);
        }
        return f6 * 1000;
    }

    public final float d(float f6) {
        if (!(f6 > 0.0f)) {
            C0.a.b("maximumVelocity should be a positive value. You specified=" + f6);
        }
        float fC = c();
        if (fC == 0.0f || java.lang.Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? E7.j.f(fC, f6) : E7.j.c(fC, -f6);
    }

    public final void e() {
        p097j7.AbstractC6872n.B(this.f178d, null, 0, 0, 6, null);
        this.f179e = 0;
    }
}
