package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements S5.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final S5.G.a f12475b = new S5.G.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q4.f f12476a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public G(Q4.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        this.f12476a = fVar;
    }

    private final java.lang.Object b(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return p087i7.M.f46721a;
        } catch (java.lang.IllegalArgumentException e6) {
            return 0;
        }
    }

    @Override // S5.F
    public void a(android.os.Messenger messenger, android.content.ServiceConnection serviceConnection) {
        boolean zBindService;
        p247y7.AbstractC7350t.f(messenger, "callback");
        p247y7.AbstractC7350t.f(serviceConnection, "serviceConnection");
        android.content.Context applicationContext = this.f12476a.k().getApplicationContext();
        p247y7.AbstractC7350t.e(applicationContext, "firebaseApp.applicationContext.applicationContext");
        android.content.Intent intent = new android.content.Intent(applicationContext, (java.lang.Class<?>) com.google.firebase.sessions.SessionLifecycleService.class);
        intent.setAction(java.lang.String.valueOf(android.os.Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (java.lang.SecurityException e6) {
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        b(applicationContext, serviceConnection);
    }
}
