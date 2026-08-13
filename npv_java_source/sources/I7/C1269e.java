package I7;

/* JADX INFO: renamed from: I7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1269e extends R7.AbstractC1506l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I7.AbstractC1278n f5354a;

    public C1269e(I7.AbstractC1278n abstractC1278n) {
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        this.f5354a = abstractC1278n;
    }

    @Override // R7.AbstractC1506l, O7.InterfaceC1434o
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public I7.AbstractC1274j d(O7.InterfaceC1443y interfaceC1443y, p087i7.M m6) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
        p247y7.AbstractC7350t.f(m6, "data");
        return new I7.o(this.f5354a, interfaceC1443y);
    }

    @Override // O7.InterfaceC1434o
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public I7.AbstractC1274j h(O7.U u6, p087i7.M m6) {
        p247y7.AbstractC7350t.f(u6, "descriptor");
        p247y7.AbstractC7350t.f(m6, "data");
        int i6 = (u6.m0() != null ? 1 : 0) + (u6.v0() != null ? 1 : 0);
        if (u6.t0()) {
            if (i6 == 0) {
                return new I7.p(this.f5354a, u6);
            }
            if (i6 == 1) {
                return new I7.q(this.f5354a, u6);
            }
            if (i6 == 2) {
                return new I7.r(this.f5354a, u6);
            }
        } else {
            if (i6 == 0) {
                return new I7.v(this.f5354a, u6);
            }
            if (i6 == 1) {
                return new I7.w(this.f5354a, u6);
            }
            if (i6 == 2) {
                return new I7.x(this.f5354a, u6);
            }
        }
        throw new I7.D("Unsupported property: " + u6);
    }
}
