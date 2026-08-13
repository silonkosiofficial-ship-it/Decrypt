package p190t;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.o f54416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p190t.y f54417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p190t.i f54418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p190t.v f54419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f54420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f54421f;

    public C(p190t.o oVar, p190t.y yVar, p190t.i iVar, p190t.v vVar, boolean z6, java.util.Map map) {
        this.f54416a = oVar;
        this.f54417b = yVar;
        this.f54418c = iVar;
        this.f54419d = vVar;
        this.f54420e = z6;
        this.f54421f = map;
    }

    public /* synthetic */ C(p190t.o oVar, p190t.y yVar, p190t.i iVar, p190t.v vVar, boolean z6, java.util.Map map, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : oVar, (i6 & 2) != 0 ? null : yVar, (i6 & 4) != 0 ? null : iVar, (i6 & 8) == 0 ? vVar : null, (i6 & 16) != 0 ? false : z6, (i6 & 32) != 0 ? p097j7.S.h() : map);
    }

    public final p190t.i a() {
        return this.f54418c;
    }

    public final java.util.Map b() {
        return this.f54421f;
    }

    public final p190t.o c() {
        return this.f54416a;
    }

    public final boolean d() {
        return this.f54420e;
    }

    public final p190t.v e() {
        return this.f54419d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p190t.C)) {
            return false;
        }
        p190t.C c6 = (p190t.C) obj;
        return p247y7.AbstractC7350t.b(this.f54416a, c6.f54416a) && p247y7.AbstractC7350t.b(this.f54417b, c6.f54417b) && p247y7.AbstractC7350t.b(this.f54418c, c6.f54418c) && p247y7.AbstractC7350t.b(this.f54419d, c6.f54419d) && this.f54420e == c6.f54420e && p247y7.AbstractC7350t.b(this.f54421f, c6.f54421f);
    }

    public final p190t.y f() {
        return this.f54417b;
    }

    public int hashCode() {
        p190t.o oVar = this.f54416a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        p190t.y yVar = this.f54417b;
        int iHashCode2 = (iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        p190t.i iVar = this.f54418c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        p190t.v vVar = this.f54419d;
        return ((((iHashCode3 + (vVar != null ? vVar.hashCode() : 0)) * 31) + p190t.h.a(this.f54420e)) * 31) + this.f54421f.hashCode();
    }

    public java.lang.String toString() {
        return "TransitionData(fade=" + this.f54416a + ", slide=" + this.f54417b + ", changeSize=" + this.f54418c + ", scale=" + this.f54419d + ", hold=" + this.f54420e + ", effectsMap=" + this.f54421f + ')';
    }
}
