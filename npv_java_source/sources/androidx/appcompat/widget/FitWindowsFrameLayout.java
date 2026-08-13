package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.widget.M f18122C;

    public FitWindowsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        androidx.appcompat.widget.M m6 = this.f18122C;
        if (m6 != null) {
            m6.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.M m6) {
    }
}
