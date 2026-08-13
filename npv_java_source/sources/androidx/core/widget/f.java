package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class f extends androidx.core.widget.a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final android.widget.ListView f21874U;

    public f(android.widget.ListView listView) {
        super(listView);
        this.f21874U = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i6) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i6) {
        android.widget.ListView listView = this.f21874U;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (i6 > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i6 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void t(int i6, int i10) {
        this.f21874U.scrollListBy(i10);
    }
}
