package p115l4;

/* JADX INFO: renamed from: l4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6923d extends java.lang.IllegalStateException {
    private C6923d(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static java.lang.IllegalStateException a(p115l4.AbstractC6931l abstractC6931l) {
        java.lang.String strConcat;
        if (!abstractC6931l.n()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception excK = abstractC6931l.k();
        if (excK != null) {
            strConcat = "failure";
        } else if (abstractC6931l.o()) {
            strConcat = "result ".concat(java.lang.String.valueOf(abstractC6931l.l()));
        } else {
            strConcat = abstractC6931l.m() ? "cancellation" : "unknown issue";
        }
        return new p115l4.C6923d("Complete with: ".concat(strConcat), excK);
    }
}
