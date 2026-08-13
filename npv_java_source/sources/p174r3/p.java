package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class p implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p174r3.u f53880C;

    p(p174r3.u uVar) {
        this.f53880C = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        p174r3.u uVar = this.f53880C;
        if (uVar.f53896J == null) {
            return false;
        }
        uVar.f53896J.d(motionEvent);
        return false;
    }
}
