package p251z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final void a(long j6, p237x7.l lVar) {
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(j6, j6, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        lVar.l(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(p251z0.C7380p c7380p, long j6, p237x7.l lVar) {
        d(c7380p, j6, lVar, true);
    }

    public static final void c(p251z0.C7380p c7380p, long j6, p237x7.l lVar) {
        d(c7380p, j6, lVar, false);
    }

    private static final void d(p251z0.C7380p c7380p, long j6, p237x7.l lVar, boolean z6) {
        android.view.MotionEvent motionEventE = c7380p.e();
        if (motionEventE == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEventE.getAction();
        if (z6) {
            motionEventE.setAction(3);
        }
        motionEventE.offsetLocation(-p131n0.g.m(j6), -p131n0.g.n(j6));
        lVar.l(motionEventE);
        motionEventE.offsetLocation(p131n0.g.m(j6), p131n0.g.n(j6));
        motionEventE.setAction(action);
    }
}
