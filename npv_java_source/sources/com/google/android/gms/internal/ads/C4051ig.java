package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4051ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.MotionEvent f36329a = android.view.MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.MotionEvent f36330b = android.view.MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f36331c;

    public C4051ig(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.C4270kg c4270kg, com.google.android.gms.internal.ads.Q90 q90) {
        this.f36331c = scheduledExecutorService;
    }

    public final P4.d a() {
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null)), ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2200Bg.f26003c.e()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f36331c);
    }

    public final void b(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f36329a.getEventTime()) {
            this.f36329a = android.view.MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f36330b.getEventTime()) {
                return;
            }
            this.f36330b = android.view.MotionEvent.obtain(motionEvent);
        }
    }
}
