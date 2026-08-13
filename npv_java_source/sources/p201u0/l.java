package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p237x7.l f55311a;

    private l() {
    }

    public /* synthetic */ l(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract void a(p161q0.g gVar);

    public p237x7.l b() {
        return this.f55311a;
    }

    public final void c() {
        p237x7.l lVarB = b();
        if (lVarB != null) {
            lVarB.l(this);
        }
    }

    public void d(p237x7.l lVar) {
        this.f55311a = lVar;
    }
}
