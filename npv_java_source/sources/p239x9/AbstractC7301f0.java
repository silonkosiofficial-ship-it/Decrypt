package p239x9;

/* JADX INFO: renamed from: x9.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7301f0 {
    public static final void a(int i6, int i10, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i11 = (~i6) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(fVar.f(i12));
            }
            i11 >>>= 1;
        }
        throw new p199t9.c(arrayList, fVar.a());
    }
}
