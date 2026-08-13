package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4860q implements android.hardware.display.DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.hardware.display.DisplayManager f38121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5079s f38122b;

    public C4860q(com.google.android.gms.internal.ads.C5079s c5079s, android.hardware.display.DisplayManager displayManager) {
        this.f38122b = c5079s;
        this.f38121a = displayManager;
    }

    private final android.view.Display c() {
        return this.f38121a.getDisplay(0);
    }

    public final void a() {
        this.f38121a.registerDisplayListener(this, com.google.android.gms.internal.ads.EW.Q(null));
        com.google.android.gms.internal.ads.C5079s.b(this.f38122b, c());
    }

    public final void b() {
        this.f38121a.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i6) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i6) {
        if (i6 == 0) {
            com.google.android.gms.internal.ads.C5079s.b(this.f38122b, c());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i6) {
    }
}
