package p219v9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final F7.c a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        if (fVar instanceof p239x9.t0) {
            return a(((p239x9.t0) fVar).l());
        }
        return null;
    }

    public static final p219v9.f b(A9.b bVar, p219v9.f fVar) {
        p199t9.b bVarC;
        p247y7.AbstractC7350t.f(bVar, "<this>");
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        F7.c cVarA = a(fVar);
        if (cVarA == null || (bVarC = A9.b.c(bVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.a();
    }
}
