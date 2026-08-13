package Q3;

/* JADX INFO: loaded from: classes.dex */
final class B extends Q3.D {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Intent f8853C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f8854D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f8855E;

    B(android.content.Intent intent, android.app.Activity activity, int i6) {
        this.f8853C = intent;
        this.f8854D = activity;
        this.f8855E = i6;
    }

    @Override // Q3.D
    public final void a() {
        android.content.Intent intent = this.f8853C;
        if (intent != null) {
            this.f8854D.startActivityForResult(intent, this.f8855E);
        }
    }
}
