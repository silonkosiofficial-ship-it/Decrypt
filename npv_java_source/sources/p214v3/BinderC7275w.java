package p214v3;

/* JADX INFO: renamed from: v3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class BinderC7275w extends p184s3.G0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Context f55978C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p214v3.C7280z f55979D;

    BinderC7275w(p214v3.C7280z c7280z, android.content.Context context) {
        this.f55978C = context;
        this.f55979D = c7280z;
    }

    @Override // p184s3.H0
    public final void V1(p184s3.W0 w6) {
        if (w6 == null) {
            return;
        }
        this.f55979D.i(this.f55978C, w6.f54146D, true, true);
    }
}
