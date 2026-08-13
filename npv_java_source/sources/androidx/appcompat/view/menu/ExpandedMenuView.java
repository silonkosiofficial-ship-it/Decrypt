package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.g.b, androidx.appcompat.view.menu.n, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f17736E = {android.R.attr.background, android.R.attr.divider};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f17737C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17738D;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.listViewStyle);
    }

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        androidx.appcompat.widget.c0 c0VarV = androidx.appcompat.widget.c0.v(context, attributeSet, f17736E, i6, 0);
        if (c0VarV.s(0)) {
            setBackgroundDrawable(c0VarV.g(0));
        }
        if (c0VarV.s(1)) {
            setDivider(c0VarV.g(1));
        }
        c0VarV.w();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        return this.f17737C.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
        this.f17737C = gVar;
    }

    public int getWindowAnimations() {
        return this.f17738D;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
        a((androidx.appcompat.view.menu.i) getAdapter().getItem(i6));
    }
}
