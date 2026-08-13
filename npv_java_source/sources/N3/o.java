package N3;

/* JADX INFO: loaded from: classes.dex */
final class o extends p035d4.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f7676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ N3.C1394g f7677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(N3.C1394g c1394g, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        this.f7677c = c1394g;
        this.f7676b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i6 = message.what;
        if (i6 != 1) {
            java.lang.String str = "Don't know how to handle this message: " + i6;
            return;
        }
        N3.C1394g c1394g = this.f7677c;
        int iG = c1394g.g(this.f7676b);
        if (c1394g.j(iG)) {
            this.f7677c.o(this.f7676b, iG);
        }
    }
}
