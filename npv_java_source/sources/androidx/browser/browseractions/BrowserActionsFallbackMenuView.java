package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f18592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f18593D;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18592C = getResources().getDimensionPixelOffset(p160q.a.f52910b);
        this.f18593D = getResources().getDimensionPixelOffset(p160q.a.f52909a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.f18592C * 2), this.f18593D), 1073741824), i10);
    }
}
