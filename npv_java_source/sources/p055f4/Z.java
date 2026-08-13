package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Activity f45091a;

    public Z(android.app.Application application) {
        super(application);
    }

    public final void a(android.app.Activity activity) {
        this.f45091a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        android.app.Activity activity = this.f45091a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        android.app.Activity activity = this.f45091a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
