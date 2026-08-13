package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.M0 f19883a = new androidx.compose.ui.platform.M0();

    private M0() {
    }

    public final boolean a(android.view.MotionEvent motionEvent, int i6) {
        float rawX = motionEvent.getRawX(i6);
        if (!java.lang.Float.isInfinite(rawX) && !java.lang.Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i6);
            if (!java.lang.Float.isInfinite(rawY) && !java.lang.Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
