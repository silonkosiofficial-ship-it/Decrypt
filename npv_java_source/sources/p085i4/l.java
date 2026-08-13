package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.l.a f46667a;

    public interface a {
        void a(android.content.Context context, android.content.Intent intent);
    }

    public l(i4.l.a aVar) {
        Q3.AbstractC1477p.l(aVar);
        this.f46667a = aVar;
    }

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.C6428n2 c6428n2J = com.google.android.gms.measurement.internal.S2.c(context, null, null).j();
        if (intent == null) {
            c6428n2J.L().a("Receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        c6428n2J.K().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c6428n2J.L().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c6428n2J.K().a("Starting wakeful intent.");
            this.f46667a.a(context, className);
        }
    }
}
