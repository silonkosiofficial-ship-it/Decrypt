package p239x9;

/* JADX INFO: renamed from: x9.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7299e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p219v9.f[] f56995a = new p219v9.f[0];

    public static final java.util.Set a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        if (fVar instanceof p239x9.InterfaceC7310k) {
            return ((p239x9.InterfaceC7310k) fVar).b();
        }
        java.util.HashSet hashSet = new java.util.HashSet(fVar.e());
        int iE = fVar.e();
        for (int i6 = 0; i6 < iE; i6++) {
            hashSet.add(fVar.f(i6));
        }
        return hashSet;
    }

    public static final p219v9.f[] b(java.util.List list) {
        p219v9.f[] fVarArr;
        java.util.List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (p219v9.f[]) list.toArray(new p219v9.f[0])) == null) ? f56995a : fVarArr;
    }
}
