package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class B1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f40449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ android.app.Activity f40450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1.c f40451I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(com.google.android.gms.internal.measurement.C5997e1.c cVar, android.os.Bundle bundle, android.app.Activity activity) {
        super(com.google.android.gms.internal.measurement.C5997e1.this);
        this.f40449G = bundle;
        this.f40450H = activity;
        this.f40451I = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        android.os.Bundle bundle;
        if (this.f40449G != null) {
            bundle = new android.os.Bundle();
            if (this.f40449G.containsKey("com.google.app_measurement.screen_service")) {
                java.lang.Object obj = this.f40449G.get("com.google.app_measurement.screen_service");
                if (obj instanceof android.os.Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (android.os.Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(com.google.android.gms.internal.measurement.C5997e1.this.f40867i)).onActivityCreated(X3.b.c2(this.f40450H), bundle, this.f40869D);
    }
}
