package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p092j1.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Y0.e f24129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f24130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Y0.v f24131o;

    public z(Y0.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "density");
        this.f24129m = eVar;
        this.f24130n = Y0.c.b(0, 0, 0, 0, 15, null);
        this.f24131o = Y0.v.Ltr;
        w(new p092j1.c() { // from class: b1.y
            @Override // p092j1.c
            public final float a(float f6) {
                return p012b1.z.F(this.f24128a, f6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float F(p012b1.z zVar, float f6) {
        p247y7.AbstractC7350t.f(zVar, "this$0");
        return zVar.f24129m.getDensity() * f6;
    }

    public final long G() {
        return this.f24130n;
    }

    public final void H(long j6) {
        this.f24130n = j6;
    }

    @Override // p092j1.g
    public int e(java.lang.Object obj) {
        return obj instanceof Y0.i ? this.f24129m.S0(((Y0.i) obj).v()) : super.e(obj);
    }
}
