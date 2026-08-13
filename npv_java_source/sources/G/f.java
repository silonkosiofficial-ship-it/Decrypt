package G;

/* JADX INFO: loaded from: classes.dex */
public final class f extends G.a {
    public f(G.b bVar, G.b bVar2, G.b bVar3, G.b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // G.a
    public p141o0.L1 d(long j6, float f6, float f10, float f11, float f12, Y0.v vVar) {
        if (f6 + f10 + f11 + f12 == 0.0f) {
            return new o0.L1.b(p131n0.n.c(j6));
        }
        p131n0.i iVarC = p131n0.n.c(j6);
        Y0.v vVar2 = Y0.v.Ltr;
        return new o0.L1.c(p131n0.l.b(iVarC, p131n0.b.b(vVar == vVar2 ? f6 : f10, 0.0f, 2, null), p131n0.b.b(vVar == vVar2 ? f10 : f6, 0.0f, 2, null), p131n0.b.b(vVar == vVar2 ? f11 : f12, 0.0f, 2, null), p131n0.b.b(vVar == vVar2 ? f12 : f11, 0.0f, 2, null)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G.f)) {
            return false;
        }
        G.f fVar = (G.f) obj;
        return p247y7.AbstractC7350t.b(h(), fVar.h()) && p247y7.AbstractC7350t.b(g(), fVar.g()) && p247y7.AbstractC7350t.b(e(), fVar.e()) && p247y7.AbstractC7350t.b(f(), fVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // G.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public G.f b(G.b bVar, G.b bVar2, G.b bVar3, G.b bVar4) {
        return new G.f(bVar, bVar2, bVar3, bVar4);
    }

    public java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
