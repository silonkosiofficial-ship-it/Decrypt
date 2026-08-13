package p214v3;

/* JADX INFO: loaded from: classes.dex */
final class C0 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p214v3.E0 f55823a;

    /* synthetic */ C0(p214v3.E0 e6, p214v3.D0 d6) {
        this.f55823a = e6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        p214v3.E0 e6;
        boolean z6;
        if (j$.util.Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            e6 = this.f55823a;
            z6 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            e6 = this.f55823a;
            z6 = false;
        }
        e6.f55831e = z6;
    }
}
