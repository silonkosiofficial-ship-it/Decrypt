package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends p141o0.AbstractC6984n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.Shader f52185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f52186d;

    public a2() {
        super(null);
        this.f52186d = p131n0.m.f51333b.a();
    }

    @Override // p141o0.AbstractC6984n0
    public final void a(long j6, p141o0.N1 n6, float f6) {
        android.graphics.Shader shaderB = this.f52185c;
        if (shaderB == null || !p131n0.m.f(this.f52186d, j6)) {
            if (p131n0.m.k(j6)) {
                shaderB = null;
                this.f52185c = null;
                j6 = p131n0.m.f51333b.a();
            } else {
                shaderB = b(j6);
                this.f52185c = shaderB;
            }
            this.f52186d = j6;
        }
        long jC = n6.c();
        p141o0.C7016y0.a aVar = p141o0.C7016y0.f52264b;
        if (!p141o0.C7016y0.o(jC, aVar.a())) {
            n6.G(aVar.a());
        }
        if (!p247y7.AbstractC7350t.b(n6.y(), shaderB)) {
            n6.x(shaderB);
        }
        if (n6.a() == f6) {
            return;
        }
        n6.b(f6);
    }

    public abstract android.graphics.Shader b(long j6);
}
