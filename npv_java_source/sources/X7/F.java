package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static final java.util.List a(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        java.lang.String strG = fVar.g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        if (X7.A.c(strG)) {
            return p097j7.AbstractC6879v.q(b(fVar));
        }
        return X7.A.d(strG) ? f(fVar) : X7.C1829g.f16014a.b(fVar);
    }

    public static final p138n8.f b(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "methodName");
        p138n8.f fVarE = e(fVar, "get", false, null, 12, null);
        return fVarE == null ? e(fVar, "is", false, null, 8, null) : fVarE;
    }

    public static final p138n8.f c(p138n8.f fVar, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "methodName");
        return e(fVar, "set", false, z6 ? "is" : null, 4, null);
    }

    private static final p138n8.f d(p138n8.f fVar, java.lang.String str, boolean z6, java.lang.String str2) {
        if (fVar.q()) {
            return null;
        }
        java.lang.String strM = fVar.m();
        p247y7.AbstractC7350t.e(strM, "getIdentifier(...)");
        if (!S8.r.V(strM, str, false, 2, null) || strM.length() == str.length()) {
            return null;
        }
        char cCharAt = strM.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return p138n8.f.o(str2 + S8.r.J0(strM, str));
        }
        if (!z6) {
            return fVar;
        }
        java.lang.String strC = N8.a.c(S8.r.J0(strM, str), true);
        if (p138n8.f.r(strC)) {
            return p138n8.f.o(strC);
        }
        return null;
    }

    static /* synthetic */ p138n8.f e(p138n8.f fVar, java.lang.String str, boolean z6, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        if ((i6 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z6, str2);
    }

    public static final java.util.List f(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "methodName");
        return p097j7.AbstractC6879v.r(c(fVar, false), c(fVar, true));
    }
}
