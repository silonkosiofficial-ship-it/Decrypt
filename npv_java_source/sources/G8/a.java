package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final F8.d0 a(boolean z6, boolean z10, G8.b bVar, G8.f fVar, G8.g gVar) {
        p247y7.AbstractC7350t.f(bVar, "typeSystemContext");
        p247y7.AbstractC7350t.f(fVar, "kotlinTypePreparator");
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return new F8.d0(z6, z10, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ F8.d0 b(boolean z6, boolean z10, G8.b bVar, G8.f fVar, G8.g gVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z10 = true;
        }
        if ((i6 & 4) != 0) {
            bVar = G8.o.f3161a;
        }
        if ((i6 & 8) != 0) {
            fVar = G8.f.a.f3135a;
        }
        if ((i6 & 16) != 0) {
            gVar = G8.g.a.f3136a;
        }
        return a(z6, z10, bVar, fVar, gVar);
    }
}
