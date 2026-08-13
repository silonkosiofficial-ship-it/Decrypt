package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.widget.M f18123C;

    public FitWindowsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect rect) {
        androidx.appcompat.widget.M m6 = this.f18123C;
        if (m6 != null) {
            m6.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.M m6) {
    }
}
