package p211v0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p211v0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f55757a;

    public c(android.view.View view) {
        this.f55757a = view;
    }

    @Override // p211v0.a
    public void a(int i6) {
        android.view.View view;
        int i10;
        v0.b.a aVar = p211v0.b.f55756a;
        if (p211v0.b.b(i6, aVar.a())) {
            view = this.f55757a;
            i10 = 0;
        } else {
            if (!p211v0.b.b(i6, aVar.b())) {
                return;
            }
            view = this.f55757a;
            i10 = 9;
        }
        view.performHapticFeedback(i10);
    }
}
