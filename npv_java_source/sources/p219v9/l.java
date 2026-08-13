package p219v9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static final p219v9.f b(java.lang.String str, p219v9.d dVar) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(dVar, "kind");
        if (!S8.r.s0(str)) {
            return p239x9.r0.a(str, dVar);
        }
        throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final p219v9.f c(java.lang.String str, p219v9.m mVar, p219v9.f[] fVarArr, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(mVar, "kind");
        p247y7.AbstractC7350t.f(fVarArr, "typeParameters");
        p247y7.AbstractC7350t.f(lVar, "builder");
        if (!(!S8.r.s0(str))) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!p247y7.AbstractC7350t.b(mVar, v9.n.a.f56058a))) {
            throw new java.lang.IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        p219v9.a aVar = new p219v9.a(str);
        lVar.l(aVar);
        return new p219v9.i(str, mVar, aVar.f().size(), p097j7.AbstractC6872n.R0(fVarArr), aVar);
    }

    public static /* synthetic */ p219v9.f d(java.lang.String str, p219v9.m mVar, p219v9.f[] fVarArr, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            lVar = new p237x7.l() { // from class: v9.k
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj2) {
                    return p219v9.l.e((p219v9.a) obj2);
                }
            };
        }
        return c(str, mVar, fVarArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M e(p219v9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        return p087i7.M.f46721a;
    }
}
