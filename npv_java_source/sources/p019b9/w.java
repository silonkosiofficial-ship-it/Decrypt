package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static final void a(p237x7.l lVar, java.lang.Object obj, p127m7.i iVar) {
        p019b9.S sB = b(lVar, obj, null);
        if (sB != null) {
            W8.L.a(iVar, sB);
        }
    }

    public static final p019b9.S b(p237x7.l lVar, java.lang.Object obj, p019b9.S s6) {
        try {
            lVar.l(obj);
        } catch (java.lang.Throwable th) {
            if (s6 == null || s6.getCause() == th) {
                return new p019b9.S("Exception in undelivered element handler for " + obj, th);
            }
            p087i7.AbstractC6661g.a(s6, th);
        }
        return s6;
    }

    public static /* synthetic */ p019b9.S c(p237x7.l lVar, java.lang.Object obj, p019b9.S s6, int i6, java.lang.Object obj2) {
        if ((i6 & 2) != 0) {
            s6 = null;
        }
        return b(lVar, obj, s6);
    }
}
