package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.Map f21662a = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());

    private static class a {
        static float a(android.view.VelocityTracker velocityTracker, int i6) {
            return velocityTracker.getAxisVelocity(i6);
        }

        static float b(android.view.VelocityTracker velocityTracker, int i6, int i10) {
            return velocityTracker.getAxisVelocity(i6, i10);
        }

        static boolean c(android.view.VelocityTracker velocityTracker, int i6) {
            return velocityTracker.isAxisSupported(i6);
        }
    }

    public static void a(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f21662a.containsKey(velocityTracker)) {
                f21662a.put(velocityTracker, new androidx.core.view.V());
            }
            ((androidx.core.view.V) f21662a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(android.view.VelocityTracker velocityTracker, int i6) {
        c(velocityTracker, i6, Float.MAX_VALUE);
    }

    public static void c(android.view.VelocityTracker velocityTracker, int i6, float f6) {
        velocityTracker.computeCurrentVelocity(i6, f6);
        androidx.core.view.V vE = e(velocityTracker);
        if (vE != null) {
            vE.c(i6, f6);
        }
    }

    public static float d(android.view.VelocityTracker velocityTracker, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.U.a.a(velocityTracker, i6);
        }
        if (i6 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i6 == 1) {
            return velocityTracker.getYVelocity();
        }
        androidx.core.view.V vE = e(velocityTracker);
        if (vE != null) {
            return vE.d(i6);
        }
        return 0.0f;
    }

    private static androidx.core.view.V e(android.view.VelocityTracker velocityTracker) {
        return (androidx.core.view.V) f21662a.get(velocityTracker);
    }
}
