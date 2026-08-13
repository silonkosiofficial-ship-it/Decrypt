package Q3;

/* JADX INFO: loaded from: classes.dex */
final class C extends Q3.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Intent f8856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ P3.InterfaceC1449e f8857D;

    C(android.content.Intent intent, P3.InterfaceC1449e interfaceC1449e, int i6) {
        this.f8856C = intent;
        this.f8857D = interfaceC1449e;
    }

    @Override // Q3.D
    public final void a() {
        android.content.Intent intent = this.f8856C;
        if (intent != null) {
            this.f8857D.startActivityForResult(intent, 2);
        }
    }
}
