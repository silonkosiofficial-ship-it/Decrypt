package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends p239x9.C7311k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f56935m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(java.lang.String str, p239x9.E e6) {
        super(str, e6, 1);
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(e6, "generatedSerializer");
        this.f56935m = true;
    }

    @Override // p239x9.C7311k0
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p239x9.F) {
            p219v9.f fVar = (p219v9.f) obj;
            if (p247y7.AbstractC7350t.b(a(), fVar.a())) {
                p239x9.F f6 = (p239x9.F) obj;
                if (f6.m() && java.util.Arrays.equals(w(), f6.w()) && e() == fVar.e()) {
                    int iE = e();
                    for (int i6 = 0; i6 < iE; i6++) {
                        if (p247y7.AbstractC7350t.b(h(i6).a(), fVar.h(i6).a()) && p247y7.AbstractC7350t.b(h(i6).j(), fVar.h(i6).j())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p239x9.C7311k0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p239x9.C7311k0, p219v9.f
    public boolean m() {
        return this.f56935m;
    }
}
