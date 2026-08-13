package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1916w extends android.widget.RatingBar {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1914u f18584C;

    public C1916w(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48617E);
    }

    public C1916w(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1914u c1914u = new androidx.appcompat.widget.C1914u(this);
        this.f18584C = c1914u;
        c1914u.c(attributeSet, i6);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        android.graphics.Bitmap bitmapB = this.f18584C.b();
        if (bitmapB != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i6, 0), getMeasuredHeight());
        }
    }
}
