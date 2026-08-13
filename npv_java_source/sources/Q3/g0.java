package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Q3.Q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Q3.AbstractC1464c abstractC1464c, int i6, android.os.Bundle bundle) {
        super(abstractC1464c, i6, null);
        this.f8965g = abstractC1464c;
    }

    @Override // Q3.Q
    protected final void f(N3.C1389b c1389b) {
        if (this.f8965g.t() && Q3.AbstractC1464c.h0(this.f8965g)) {
            Q3.AbstractC1464c.d0(this.f8965g, 16);
        } else {
            this.f8965g.f8904p.a(c1389b);
            this.f8965g.L(c1389b);
        }
    }

    @Override // Q3.Q
    protected final boolean g() {
        this.f8965g.f8904p.a(N3.C1389b.f7645G);
        return true;
    }
}
