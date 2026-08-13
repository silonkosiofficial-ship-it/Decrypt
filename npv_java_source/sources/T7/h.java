package T7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String b(p138n8.b bVar) {
        java.lang.String strB = bVar.i().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strQ = S8.r.Q(strB, '.', '$', false, 4, null);
        if (bVar.h().d()) {
            return strQ;
        }
        return bVar.h() + '.' + strQ;
    }
}
