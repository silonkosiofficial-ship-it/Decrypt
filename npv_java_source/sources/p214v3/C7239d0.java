package p214v3;

/* JADX INFO: renamed from: v3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7239d0 extends p214v3.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f55878c;

    C7239d0(android.content.Context context) {
        this.f55878c = context;
    }

    @Override // p214v3.B
    public final void a() {
        boolean zC;
        try {
            zC = p144o3.a.c(this.f55878c);
        } catch (N3.C1396i | java.io.IOException | java.lang.IllegalStateException e6) {
            p224w3.p.e("Fail to get isAdIdFakeForDebugLogging", e6);
            zC = false;
        }
        p224w3.m.j(zC);
        p224w3.p.g("Update ad debug logging enablement as " + zC);
    }
}
