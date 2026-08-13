package p040e;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6524a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p040e.C6524a f44360a = new p040e.C6524a();

    private C6524a() {
    }

    public final android.window.BackEvent a(float f6, float f10, float f11, int i6) {
        return new android.window.BackEvent(f6, f10, f11, i6);
    }

    public final float b(android.window.BackEvent backEvent) {
        p247y7.AbstractC7350t.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(android.window.BackEvent backEvent) {
        p247y7.AbstractC7350t.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(android.window.BackEvent backEvent) {
        p247y7.AbstractC7350t.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(android.window.BackEvent backEvent) {
        p247y7.AbstractC7350t.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
