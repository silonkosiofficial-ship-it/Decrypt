package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U extends p239x9.B0 {
    protected abstract java.lang.String c0(java.lang.String str, java.lang.String str2);

    protected java.lang.String d0(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return fVar.f(i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.B0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final java.lang.String X(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return f0(d0(fVar, i6));
    }

    protected final java.lang.String f0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "nestedName");
        java.lang.String str2 = (java.lang.String) W();
        if (str2 == null) {
            str2 = "";
        }
        return c0(str2, str);
    }

    protected final java.lang.String g0() {
        return Y().isEmpty() ? "$" : p097j7.AbstractC6879v.r0(Y(), ".", "$.", null, 0, null, null, 60, null);
    }
}
