package p239x9;

/* JADX INFO: renamed from: x9.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7313l0 {
    public static final int a(p219v9.f fVar, p219v9.f[] fVarArr) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(fVarArr, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + java.util.Arrays.hashCode(fVarArr);
        java.lang.Iterable iterableA = p219v9.j.a(fVar);
        java.util.Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i6 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i10 = i6 * 31;
            java.lang.String strA = ((p219v9.f) it.next()).a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i6 = i10 + iHashCode3;
        }
        java.util.Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i11 = iHashCode2 * 31;
            p219v9.m mVarJ = ((p219v9.f) it2.next()).j();
            iHashCode2 = i11 + (mVarJ != null ? mVarJ.hashCode() : 0);
        }
        return (((iHashCode * 31) + i6) * 31) + iHashCode2;
    }
}
