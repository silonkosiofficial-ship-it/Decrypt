package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class q implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p174r3.u f53881a;

    q(p174r3.u uVar) {
        this.f53881a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        p174r3.u uVar = this.f53881a;
        return new com.google.android.gms.internal.ads.Z9(com.google.android.gms.internal.ads.X9.y(uVar.f53892F, new com.google.android.gms.internal.ads.V9(uVar.f53889C.f56217C, false)));
    }
}
