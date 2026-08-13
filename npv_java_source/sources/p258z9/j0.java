package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j0 {
    public static final p219v9.f a(p219v9.f fVar, A9.b bVar) {
        p219v9.f fVarA;
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(bVar, "module");
        if (!p247y7.AbstractC7350t.b(fVar.j(), v9.m.a.f56056a)) {
            return fVar.m() ? a(fVar.h(0), bVar) : fVar;
        }
        p219v9.f fVarB = p219v9.b.b(bVar, fVar);
        return (fVarB == null || (fVarA = a(fVarB, bVar)) == null) ? fVar : fVarA;
    }

    public static final p258z9.i0 b(p249y9.AbstractC7358b abstractC7358b, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(abstractC7358b, "<this>");
        p247y7.AbstractC7350t.f(fVar, "desc");
        p219v9.m mVarJ = fVar.j();
        if (mVarJ instanceof p219v9.c) {
            return p258z9.i0.POLY_OBJ;
        }
        if (!p247y7.AbstractC7350t.b(mVarJ, v9.n.b.f56059a)) {
            if (!p247y7.AbstractC7350t.b(mVarJ, v9.n.c.f56060a)) {
                return p258z9.i0.OBJ;
            }
            p219v9.f fVarA = a(fVar.h(0), abstractC7358b.f());
            p219v9.m mVarJ2 = fVarA.j();
            if ((mVarJ2 instanceof p219v9.d) || p247y7.AbstractC7350t.b(mVarJ2, v9.m.b.f56057a)) {
                return p258z9.i0.MAP;
            }
            if (!abstractC7358b.e().c()) {
                throw p258z9.G.d(fVarA);
            }
        }
        return p258z9.i0.LIST;
    }
}
