package T6;

/* JADX INFO: renamed from: T6.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1669q extends W6.B {
    public C1669q(int i6) {
        super(true, i6);
    }

    public /* synthetic */ C1669q(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 8 : i6);
    }

    @Override // W6.B
    protected void o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        super.o(str);
        T6.C1673v.f13241a.a(str);
    }

    @Override // W6.B
    protected void p(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        super.p(str);
        T6.C1673v.f13241a.b(str);
    }

    public T6.InterfaceC1668p q() {
        return new T6.r(l());
    }
}
