package p068g8;

/* JADX INFO: renamed from: g8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6621c {
    public static final p068g8.w a(p088i8.n nVar, p108k8.c cVar, p108k8.g gVar, boolean z6, boolean z10, boolean z11) {
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p8.i.f fVar = p118l8.a.f50075d;
        p247y7.AbstractC7350t.e(fVar, "propertySignature");
        l8.a.d dVar = (l8.a.d) p108k8.e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z6) {
            m8.d.a aVarC = p128m8.i.f51228a.c(nVar, cVar, gVar, z11);
            if (aVarC == null) {
                return null;
            }
            return p068g8.w.f45708b.b(aVarC);
        }
        if (!z10 || !dVar.I()) {
            return null;
        }
        g8.w.a aVar = p068g8.w.f45708b;
        l8.a.c cVarD = dVar.D();
        p247y7.AbstractC7350t.e(cVarD, "getSyntheticMethod(...)");
        return aVar.c(cVar, cVarD);
    }

    public static /* synthetic */ p068g8.w b(p088i8.n nVar, p108k8.c cVar, p108k8.g gVar, boolean z6, boolean z10, boolean z11, int i6, java.lang.Object obj) {
        boolean z12 = (i6 & 8) != 0 ? false : z6;
        boolean z13 = (i6 & 16) != 0 ? false : z10;
        if ((i6 & 32) != 0) {
            z11 = true;
        }
        return a(nVar, cVar, gVar, z12, z13, z11);
    }
}
