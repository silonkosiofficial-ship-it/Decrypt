package D;

/* JADX INFO: loaded from: classes.dex */
public final class x implements D.w, D0.M {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D.C0880q f1733C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final D0.j0 f1734D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final D.InterfaceC0881s f1735E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.HashMap f1736F = new java.util.HashMap();

    public x(D.C0880q c0880q, D0.j0 j0Var) {
        this.f1733C = c0880q;
        this.f1734D = j0Var;
        this.f1735E = (D.InterfaceC0881s) c0880q.d().b();
    }

    @Override // D0.InterfaceC0896o
    public boolean A0() {
        return this.f1734D.A0();
    }

    @Override // Y0.e
    public float B0(float f6) {
        return this.f1734D.B0(f6);
    }

    @Override // Y0.e
    public int K0(long j6) {
        return this.f1734D.K0(j6);
    }

    @Override // Y0.n
    public long O(float f6) {
        return this.f1734D.O(f6);
    }

    @Override // D0.M
    public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
        return this.f1734D.O0(i6, i10, map, lVar, lVar2);
    }

    @Override // Y0.e
    public long P(long j6) {
        return this.f1734D.P(j6);
    }

    @Override // Y0.e
    public int S0(float f6) {
        return this.f1734D.S0(f6);
    }

    @Override // Y0.n
    public float X(long j6) {
        return this.f1734D.X(j6);
    }

    @Override // Y0.e
    public long b1(long j6) {
        return this.f1734D.b1(j6);
    }

    @Override // D0.M
    public D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
        return this.f1734D.f0(i6, i10, map, lVar);
    }

    @Override // Y0.e
    public float g1(long j6) {
        return this.f1734D.g1(j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f1734D.getDensity();
    }

    @Override // D0.InterfaceC0896o
    public Y0.v getLayoutDirection() {
        return this.f1734D.getLayoutDirection();
    }

    @Override // Y0.e
    public long k0(float f6) {
        return this.f1734D.k0(f6);
    }

    @Override // Y0.e
    public float o0(int i6) {
        return this.f1734D.o0(i6);
    }

    @Override // D.w
    public java.util.List p0(int i6, long j6) {
        java.util.List list = (java.util.List) this.f1736F.get(java.lang.Integer.valueOf(i6));
        if (list != null) {
            return list;
        }
        java.lang.Object objB = this.f1735E.b(i6);
        java.util.List listC1 = this.f1734D.c1(objB, this.f1733C.b(i6, objB, this.f1735E.e(i6)));
        int size = listC1.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((D0.G) listC1.get(i10)).U(j6));
        }
        this.f1736F.put(java.lang.Integer.valueOf(i6), arrayList);
        return arrayList;
    }

    @Override // Y0.e
    public float q0(float f6) {
        return this.f1734D.q0(f6);
    }

    @Override // Y0.n
    public float v0() {
        return this.f1734D.v0();
    }
}
