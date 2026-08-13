package androidx.appcompat.view.menu;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements androidx.appcompat.view.menu.p, androidx.appcompat.view.menu.m, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.graphics.Rect f17917C;

    k() {
    }

    protected static int o(android.widget.ListAdapter listAdapter, android.view.ViewGroup viewGroup, android.content.Context context, int i6) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        android.view.View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i6) {
                return i6;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    protected static boolean x(androidx.appcompat.view.menu.g gVar) {
        int size = gVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.MenuItem item = gVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static androidx.appcompat.view.menu.f y(android.widget.ListAdapter listAdapter) {
        return listAdapter instanceof android.widget.HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(android.content.Context context, androidx.appcompat.view.menu.g gVar) {
    }

    public abstract void l(androidx.appcompat.view.menu.g gVar);

    protected boolean m() {
        return true;
    }

    public android.graphics.Rect n() {
        return this.f17917C;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        y(listAdapter).f17837C.M((android.view.MenuItem) listAdapter.getItem(i6), this, m() ? 0 : 4);
    }

    public abstract void p(android.view.View view);

    public void q(android.graphics.Rect rect) {
        this.f17917C = rect;
    }

    public abstract void r(boolean z6);

    public abstract void s(int i6);

    public abstract void t(int i6);

    public abstract void u(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z6);

    public abstract void w(int i6);
}
