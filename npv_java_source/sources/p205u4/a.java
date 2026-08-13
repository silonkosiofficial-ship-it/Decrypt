package p205u4;

/* JADX INFO: loaded from: classes3.dex */
public class a implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Dialog f55536C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f55537D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f55538E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f55539F;

    public a(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.f55536C = dialog;
        this.f55537D = rect.left;
        this.f55538E = rect.top;
        this.f55539F = android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View viewFindViewById = view.findViewById(android.R.id.content);
        int left = this.f55537D + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f55538E + viewFindViewById.getTop();
        if (new android.graphics.RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i6 = this.f55539F;
            motionEventObtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f55536C.onTouchEvent(motionEventObtain);
    }
}
