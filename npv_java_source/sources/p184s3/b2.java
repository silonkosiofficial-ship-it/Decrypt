package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p184s3.b2 f54193a = new p184s3.b2();

    protected b2() {
    }

    public final p184s3.X1 a(android.content.Context context, p184s3.C7093f1 c7093f1) {
        java.lang.String strS;
        java.lang.String strI = c7093f1.i();
        java.util.Set setN = c7093f1.n();
        java.util.List listUnmodifiableList = !setN.isEmpty() ? j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(setN)) : null;
        boolean zQ = c7093f1.q(context);
        android.os.Bundle bundleE = c7093f1.e(com.google.ads.mediation.admob.AdMobAdapter.class);
        java.lang.String strJ = c7093f1.j();
        c7093f1.g();
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            java.lang.String packageName = applicationContext.getPackageName();
            p184s3.C7147y.b();
            strS = p224w3.g.s(java.lang.Thread.currentThread().getStackTrace(), packageName);
        } else {
            strS = null;
        }
        boolean zP = c7093f1.p();
        p104k3.t tVarE = p184s3.C7120o1.h().e();
        return new p184s3.X1(8, -1L, bundleE, -1, listUnmodifiableList, zQ, java.lang.Math.max(c7093f1.b(), tVarE.c()), false, strJ, null, null, strI, c7093f1.f(), c7093f1.d(), j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(c7093f1.m())), c7093f1.k(), strS, zP, null, tVarE.d(), (java.lang.String) java.util.Collections.max(java.util.Arrays.asList(null, tVarE.a()), new java.util.Comparator() { // from class: s3.a2
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                java.util.List list = p104k3.t.f49496f;
                return list.indexOf((java.lang.String) obj) - list.indexOf((java.lang.String) obj2);
            }
        }), c7093f1.l(), c7093f1.a(), c7093f1.h(), tVarE.b().e(), c7093f1.c());
    }
}
