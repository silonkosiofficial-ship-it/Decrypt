package O7;

/* JADX INFO: renamed from: O7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1422c implements O7.f0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final O7.f0 f8150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final O7.InterfaceC1432m f8151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f8152E;

    public C1422c(O7.f0 f0Var, O7.InterfaceC1432m interfaceC1432m, int i6) {
        p247y7.AbstractC7350t.f(f0Var, "originalDescriptor");
        p247y7.AbstractC7350t.f(interfaceC1432m, "declarationDescriptor");
        this.f8150C = f0Var;
        this.f8151D = interfaceC1432m;
        this.f8152E = i6;
    }

    @Override // O7.f0
    public boolean K() {
        return this.f8150C.K();
    }

    @Override // O7.InterfaceC1432m
    public O7.f0 a() {
        O7.f0 f0VarA = this.f8150C.a();
        p247y7.AbstractC7350t.e(f0VarA, "getOriginal(...)");
        return f0VarA;
    }

    @Override // O7.InterfaceC1433n, O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        return this.f8151D;
    }

    @Override // O7.f0
    public int getIndex() {
        return this.f8152E + this.f8150C.getIndex();
    }

    @Override // O7.I
    public p138n8.f getName() {
        return this.f8150C.getName();
    }

    @Override // O7.f0
    public java.util.List getUpperBounds() {
        return this.f8150C.getUpperBounds();
    }

    @Override // P7.a
    public P7.g k() {
        return this.f8150C.k();
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        return this.f8150C.o();
    }

    @Override // O7.f0, O7.InterfaceC1427h
    public F8.e0 p() {
        return this.f8150C.p();
    }

    @Override // O7.f0
    public E8.n p0() {
        return this.f8150C.p0();
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return this.f8150C.r0(interfaceC1434o, obj);
    }

    @Override // O7.f0
    public F8.u0 s() {
        return this.f8150C.s();
    }

    public java.lang.String toString() {
        return this.f8150C + "[inner-copy]";
    }

    @Override // O7.InterfaceC1427h
    public F8.M w() {
        return this.f8150C.w();
    }

    @Override // O7.f0
    public boolean x0() {
        return true;
    }
}
