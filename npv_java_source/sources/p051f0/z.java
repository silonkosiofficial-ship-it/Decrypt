package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements p051f0.y {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.C1716h f44908C = new V.C1716h(0);

    public final boolean q(int i6) {
        return (i6 & p051f0.g.a(this.f44908C.get())) != 0;
    }

    public final void r(int i6) {
        int iA;
        do {
            iA = p051f0.g.a(this.f44908C.get());
            if ((iA & i6) != 0) {
                return;
            }
        } while (!this.f44908C.compareAndSet(iA, p051f0.g.a(iA | i6)));
    }

    @Override // p051f0.y
    public /* synthetic */ p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        return p051f0.x.a(this, a6, a10, a11);
    }
}
