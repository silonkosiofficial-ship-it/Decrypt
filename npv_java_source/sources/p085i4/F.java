package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.S2 f46665a;

    public F(com.google.android.gms.measurement.internal.S2 s6) {
        this.f46665a = s6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            this.f46665a.j().L().a("App receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        if (action == null) {
            this.f46665a.j().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f46665a.j().L().a("App receiver called with unknown action");
            return;
        }
        final com.google.android.gms.measurement.internal.S2 s6 = this.f46665a;
        if (com.google.android.gms.internal.measurement.C6066l7.a() && s6.z().H(null, com.google.android.gms.measurement.internal.G.f41829J0)) {
            s6.j().K().a("App receiver notified triggers are available");
            s6.l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.f6
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.S2 s10 = s6;
                    if (!s10.L().X0()) {
                        s10.j().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final com.google.android.gms.measurement.internal.F3 f3H = s10.H();
                    j$.util.Objects.requireNonNull(f3H);
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            f3H.E0();
                        }
                    }).start();
                }
            });
        }
    }
}
