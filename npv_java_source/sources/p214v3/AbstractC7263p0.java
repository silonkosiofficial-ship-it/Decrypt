package p214v3;

/* JADX INFO: renamed from: v3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7263p0 {
    public static void a(android.content.Context context) {
        int i6 = p224w3.m.f56249g;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5809yg.f40122a.e()).booleanValue()) {
            try {
                if (android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || p224w3.m.l()) {
                    return;
                }
                P4.d dVarB = new p214v3.C7239d0(context).b();
                p224w3.p.f("Updating ad debug logging enablement.");
                com.google.android.gms.internal.ads.AbstractC3854gr.a(dVarB, "AdDebugLogUpdater.updateEnablement");
            } catch (java.lang.Exception e6) {
                p224w3.p.h("Fail to determine debug setting.", e6);
            }
        }
    }
}
