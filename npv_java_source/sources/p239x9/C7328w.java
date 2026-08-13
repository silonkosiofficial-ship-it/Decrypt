package p239x9;

/* JADX INFO: renamed from: x9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7328w extends p239x9.C7311k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p219v9.m f57055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57056n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7328w(final java.lang.String str, final int i6) {
        super(str, null, i6, 2, null);
        p247y7.AbstractC7350t.f(str, "name");
        this.f57055m = v9.m.b.f56057a;
        this.f57056n = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: x9.v
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.C7328w.B(i6, str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f[] B(int i6, java.lang.String str, p239x9.C7328w c7328w) {
        p219v9.f[] fVarArr = new p219v9.f[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            fVarArr[i10] = p219v9.l.d(str + '.' + c7328w.f(i10), v9.n.d.f56061a, new p219v9.f[0], null, 8, null);
        }
        return fVarArr;
    }

    private final p219v9.f[] C() {
        return (p219v9.f[]) this.f57056n.getValue();
    }

    @Override // p239x9.C7311k0
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p219v9.f)) {
            return false;
        }
        p219v9.f fVar = (p219v9.f) obj;
        return fVar.j() == v9.m.b.f56057a && p247y7.AbstractC7350t.b(a(), fVar.a()) && p247y7.AbstractC7350t.b(p239x9.AbstractC7299e0.a(this), p239x9.AbstractC7299e0.a(fVar));
    }

    @Override // p239x9.C7311k0, p219v9.f
    public p219v9.f h(int i6) {
        return C()[i6];
    }

    @Override // p239x9.C7311k0
    public int hashCode() {
        int iHashCode = a().hashCode();
        int iHashCode2 = 1;
        for (java.lang.String str : p219v9.j.b(this)) {
            int i6 = iHashCode2 * 31;
            iHashCode2 = i6 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p239x9.C7311k0, p219v9.f
    public p219v9.m j() {
        return this.f57055m;
    }

    @Override // p239x9.C7311k0
    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(p219v9.j.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
