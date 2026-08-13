package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(java.lang.CharSequence charSequence, int i6, int i10) {
        int iA = 0;
        while (i6 < i10) {
            iA = (iA * 10) + p099j9.f.a(charSequence.charAt(i6));
            i6++;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer e(java.lang.CharSequence charSequence, int i6, int i10) {
        int iA = 0;
        while (i6 < i10) {
            iA = (iA * 10) + p099j9.f.a(charSequence.charAt(i6));
            if (iA < 0) {
                return null;
            }
            i6++;
        }
        return java.lang.Integer.valueOf(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p129m9.g f(p129m9.a aVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objC = aVar.c(obj, obj2);
        if (objC == null) {
            return null;
        }
        return new m9.g.a(objC);
    }
}
