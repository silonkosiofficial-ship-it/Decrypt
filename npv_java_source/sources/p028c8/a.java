package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends F8.AbstractC0961w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.p0 f24434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p028c8.c f24435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f24436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.Set f24438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F8.M f24439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(F8.p0 p0Var, p028c8.c cVar, boolean z6, boolean z10, java.util.Set set, F8.M m6) {
        super(p0Var, set, m6);
        p247y7.AbstractC7350t.f(p0Var, "howThisTypeIsUsed");
        p247y7.AbstractC7350t.f(cVar, "flexibility");
        this.f24434d = p0Var;
        this.f24435e = cVar;
        this.f24436f = z6;
        this.f24437g = z10;
        this.f24438h = set;
        this.f24439i = m6;
    }

    public /* synthetic */ a(F8.p0 p0Var, p028c8.c cVar, boolean z6, boolean z10, java.util.Set set, F8.M m6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(p0Var, (i6 & 2) != 0 ? p028c8.c.INFLEXIBLE : cVar, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? false : z10, (i6 & 16) != 0 ? null : set, (i6 & 32) != 0 ? null : m6);
    }

    public static /* synthetic */ p028c8.a f(p028c8.a aVar, F8.p0 p0Var, p028c8.c cVar, boolean z6, boolean z10, java.util.Set set, F8.M m6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            p0Var = aVar.f24434d;
        }
        if ((i6 & 2) != 0) {
            cVar = aVar.f24435e;
        }
        p028c8.c cVar2 = cVar;
        if ((i6 & 4) != 0) {
            z6 = aVar.f24436f;
        }
        boolean z11 = z6;
        if ((i6 & 8) != 0) {
            z10 = aVar.f24437g;
        }
        boolean z12 = z10;
        if ((i6 & 16) != 0) {
            set = aVar.f24438h;
        }
        java.util.Set set2 = set;
        if ((i6 & 32) != 0) {
            m6 = aVar.f24439i;
        }
        return aVar.e(p0Var, cVar2, z11, z12, set2, m6);
    }

    @Override // F8.AbstractC0961w
    public F8.M a() {
        return this.f24439i;
    }

    @Override // F8.AbstractC0961w
    public F8.p0 b() {
        return this.f24434d;
    }

    @Override // F8.AbstractC0961w
    public java.util.Set c() {
        return this.f24438h;
    }

    public final p028c8.a e(F8.p0 p0Var, p028c8.c cVar, boolean z6, boolean z10, java.util.Set set, F8.M m6) {
        p247y7.AbstractC7350t.f(p0Var, "howThisTypeIsUsed");
        p247y7.AbstractC7350t.f(cVar, "flexibility");
        return new p028c8.a(p0Var, cVar, z6, z10, set, m6);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p028c8.a)) {
            return false;
        }
        p028c8.a aVar = (p028c8.a) obj;
        return p247y7.AbstractC7350t.b(aVar.a(), a()) && aVar.b() == b() && aVar.f24435e == this.f24435e && aVar.f24436f == this.f24436f && aVar.f24437g == this.f24437g;
    }

    public final p028c8.c g() {
        return this.f24435e;
    }

    public final boolean h() {
        return this.f24437g;
    }

    @Override // F8.AbstractC0961w
    public int hashCode() {
        F8.M mA = a();
        int iHashCode = mA != null ? mA.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f24435e.hashCode();
        int i6 = iHashCode3 + (iHashCode3 * 31) + (this.f24436f ? 1 : 0);
        return i6 + (i6 * 31) + (this.f24437g ? 1 : 0);
    }

    public final boolean i() {
        return this.f24436f;
    }

    public final p028c8.a j(boolean z6) {
        return f(this, null, null, z6, false, null, null, 59, null);
    }

    public p028c8.a k(F8.M m6) {
        return f(this, null, null, false, false, null, m6, 31, null);
    }

    public final p028c8.a l(p028c8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "flexibility");
        return f(this, null, cVar, false, false, null, null, 61, null);
    }

    @Override // F8.AbstractC0961w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p028c8.a d(O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        return f(this, null, null, false, false, c() != null ? p097j7.Z.k(c(), f0Var) : p097j7.Z.c(f0Var), null, 47, null);
    }

    public java.lang.String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f24434d + ", flexibility=" + this.f24435e + ", isRaw=" + this.f24436f + ", isForAnnotationParameter=" + this.f24437g + ", visitedTypeParameters=" + this.f24438h + ", defaultType=" + this.f24439i + ')';
    }
}
