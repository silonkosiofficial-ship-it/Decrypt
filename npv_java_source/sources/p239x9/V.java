package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V extends p239x9.C0 {
    protected abstract java.lang.String Y(java.lang.String str, java.lang.String str2);

    protected abstract java.lang.String Z(p219v9.f fVar, int i6);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.C0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final java.lang.String V(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return b0(Z(fVar, i6));
    }

    protected final java.lang.String b0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "nestedName");
        java.lang.String str2 = (java.lang.String) U();
        if (str2 == null) {
            str2 = "";
        }
        return Y(str2, str);
    }
}
