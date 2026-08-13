package p214v3;

/* JADX INFO: renamed from: v3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC7279y implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Context f55985C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f55986D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ boolean f55987E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f55988F;

    RunnableC7279y(p214v3.C7280z c7280z, android.content.Context context, java.lang.String str, boolean z6, boolean z10) {
        this.f55985C = context;
        this.f55986D = str;
        this.f55987E = z6;
        this.f55988F = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(this.f55985C);
        builderL.setMessage(this.f55986D);
        builderL.setTitle(this.f55987E ? "Error" : "Info");
        if (this.f55988F) {
            builderL.setNeutralButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new p214v3.DialogInterfaceOnClickListenerC7277x(this, this.f55985C));
            builderL.setNegativeButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}
