package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.C6575q f45126b;

    e1(android.app.Application application, p055f4.C6575q c6575q) {
        this.f45125a = application;
        this.f45126b = c6575q;
    }

    final p055f4.C6568m0 c(android.app.Activity activity, L4.d dVar) {
        L4.a aVarA = dVar.a();
        if (aVarA == null) {
            aVarA = new L4.a.C0152a(this.f45125a).a();
        }
        return p055f4.i1.a(new p055f4.i1(this, activity, aVarA, dVar, null));
    }
}
