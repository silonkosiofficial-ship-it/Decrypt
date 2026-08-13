package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class r extends android.os.AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p174r3.u f53882a;

    /* synthetic */ r(p174r3.u uVar, p174r3.t tVar) {
        this.f53882a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.String doInBackground(java.lang.Void... voidArr) {
        try {
            p174r3.u uVar = this.f53882a;
            uVar.f53896J = (com.google.android.gms.internal.ads.Z9) uVar.f53891E.get(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
            p224w3.p.h("", e6);
        }
        return this.f53882a.q();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        p174r3.u uVar = this.f53882a;
        java.lang.String str = (java.lang.String) obj;
        if (uVar.f53894H == null || str == null) {
            return;
        }
        uVar.f53894H.loadUrl(str);
    }
}
