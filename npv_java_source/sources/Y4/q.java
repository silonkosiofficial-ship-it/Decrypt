package Y4;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y4.k f16406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z4.a f16407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f16408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f16409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f16410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f16411f;

    class a implements com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4.k f16412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z4.a f16413b;

        a(Y4.k kVar, Z4.a aVar) {
            this.f16412a = kVar;
            this.f16413b = aVar;
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a
        public void a(boolean z6) {
            Y4.q.this.f16408c = z6;
            if (z6) {
                this.f16412a.c();
            } else if (Y4.q.this.f()) {
                this.f16412a.g(Y4.q.this.f16410e - this.f16413b.a());
            }
        }
    }

    q(android.content.Context context, Y4.h hVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this((android.content.Context) Q3.AbstractC1477p.l(context), new Y4.k((Y4.h) Q3.AbstractC1477p.l(hVar), executor, scheduledExecutorService), new Z4.a.C0312a());
    }

    q(android.content.Context context, Y4.k kVar, Z4.a aVar) {
        this.f16406a = kVar;
        this.f16407b = aVar;
        this.f16410e = -1L;
        com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.c((android.app.Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().a(new Y4.q.a(kVar, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return this.f16411f && !this.f16408c && this.f16409d > 0 && this.f16410e != -1;
    }

    public void d(V4.c cVar) {
        Y4.b bVarD = cVar instanceof Y4.b ? (Y4.b) cVar : Y4.b.d(cVar.b());
        this.f16410e = bVarD.h() + ((long) (bVarD.f() * 0.5d)) + 300000;
        if (this.f16410e > bVarD.a()) {
            this.f16410e = bVarD.a() - 60000;
        }
        if (f()) {
            this.f16406a.g(this.f16410e - this.f16407b.a());
        }
    }

    public void e(boolean z6) {
        this.f16411f = z6;
    }
}
