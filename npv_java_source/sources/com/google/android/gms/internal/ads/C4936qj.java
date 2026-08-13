package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4936qj implements p204u3.InterfaceC7200b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f38305a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f38306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.InterfaceC7076a f38307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.util.Map f38308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ java.util.Map f38309e;

    C4936qj(com.google.android.gms.internal.ads.C5265tj c5265tj, boolean z6, p184s3.InterfaceC7076a interfaceC7076a, java.util.Map map, java.util.Map map2) {
        this.f38306b = z6;
        this.f38307c = interfaceC7076a;
        this.f38308d = map;
        this.f38309e = map2;
    }

    @Override // p204u3.InterfaceC7200b
    public final void B(int i6) {
    }

    @Override // p204u3.InterfaceC7200b
    public final void a(boolean z6) {
        if (this.f38305a) {
            return;
        }
        if (z6 && this.f38306b) {
            ((com.google.android.gms.internal.ads.MG) this.f38307c).p0();
        }
        this.f38305a = true;
        this.f38308d.put((java.lang.String) this.f38309e.get("event_id"), java.lang.Boolean.valueOf(z6));
        ((com.google.android.gms.internal.ads.InterfaceC5817yk) this.f38307c).O("openIntentAsync", this.f38308d);
    }
}
