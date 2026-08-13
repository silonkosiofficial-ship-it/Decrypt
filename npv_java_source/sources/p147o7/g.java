package p147o7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    private static final void a(int i6, int i10) {
        if (i10 <= i6) {
            return;
        }
        throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: " + i6 + ", got " + i10 + ". Please update the Kotlin standard library.").toString());
    }

    private static final p147o7.f b(p147o7.a aVar) {
        return (p147o7.f) com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a.wuzl(aVar.getClass(), p147o7.f.class);
    }

    private static final int c(p147o7.a aVar) {
        try {
            java.lang.reflect.Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(aVar);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static final java.lang.StackTraceElement d(p147o7.a aVar) {
        java.lang.String strC;
        p247y7.AbstractC7350t.f(aVar, "<this>");
        p147o7.f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        int iC = c(aVar);
        int i6 = iC < 0 ? -1 : fVarB.l()[iC];
        java.lang.String strB = p147o7.i.f52555a.b(aVar);
        if (strB == null) {
            strC = fVarB.c();
        } else {
            strC = strB + '/' + fVarB.c();
        }
        return new java.lang.StackTraceElement(strC, fVarB.m(), fVarB.f(), i6);
    }
}
