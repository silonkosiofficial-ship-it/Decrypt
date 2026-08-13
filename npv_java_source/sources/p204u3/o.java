package p204u3;

/* JADX INFO: loaded from: classes.dex */
final class o implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p204u3.x f55503C;

    o(p204u3.x xVar) {
        this.f55503C = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p204u3.x xVar = this.f55503C;
        xVar.f55535X = 2;
        xVar.f55514C.finish();
    }
}
