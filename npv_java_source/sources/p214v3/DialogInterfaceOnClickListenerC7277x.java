package p214v3;

/* JADX INFO: renamed from: v3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC7277x implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Context f55982C;

    DialogInterfaceOnClickListenerC7277x(p214v3.RunnableC7279y runnableC7279y, android.content.Context context) {
        this.f55982C = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        p174r3.v.t();
        p214v3.E0.u(this.f55982C, android.net.Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
