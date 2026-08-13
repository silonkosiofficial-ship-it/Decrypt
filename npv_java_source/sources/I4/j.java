package I4;

/* JADX INFO: loaded from: classes3.dex */
final class j extends K4.v {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final K4.x f5035C = new K4.x("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p115l4.C6932m f5036D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ I4.k f5037E;

    j(I4.k kVar, p115l4.C6932m c6932m) {
        this.f5037E = kVar;
        this.f5036D = c6932m;
    }

    @Override // K4.w
    public final void k3(android.os.Bundle bundle) {
        this.f5037E.f5040c.v(this.f5036D);
        this.f5035C.c("onRequestIntegrityToken", new java.lang.Object[0]);
        int i6 = bundle.getInt("error");
        if (i6 != 0) {
            this.f5036D.d(new I4.C1244c(i6, null));
            return;
        }
        java.lang.String string = bundle.getString("token");
        if (string == null) {
            this.f5036D.d(new I4.C1244c(-100, null));
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) (android.os.Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", android.app.PendingIntent.class) : bundle.getParcelable("dialog.intent"));
        p115l4.C6932m c6932m = this.f5036D;
        I4.f fVar = new I4.f();
        fVar.c(string);
        fVar.b(this.f5035C);
        fVar.a(pendingIntent);
        c6932m.e(fVar.d());
    }
}
