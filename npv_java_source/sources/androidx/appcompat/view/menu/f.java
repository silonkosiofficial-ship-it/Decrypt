package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class f extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    androidx.appcompat.view.menu.g f17837C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17838D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f17839E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f17840F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.view.LayoutInflater f17841G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f17842H;

    public f(androidx.appcompat.view.menu.g gVar, android.view.LayoutInflater layoutInflater, boolean z6, int i6) {
        this.f17840F = z6;
        this.f17841G = layoutInflater;
        this.f17837C = gVar;
        this.f17842H = i6;
        a();
    }

    void a() {
        androidx.appcompat.view.menu.i iVarV = this.f17837C.v();
        if (iVarV != null) {
            java.util.ArrayList arrayListZ = this.f17837C.z();
            int size = arrayListZ.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((androidx.appcompat.view.menu.i) arrayListZ.get(i6)) == iVarV) {
                    this.f17838D = i6;
                    return;
                }
            }
        }
        this.f17838D = -1;
    }

    public androidx.appcompat.view.menu.g b() {
        return this.f17837C;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.view.menu.i getItem(int i6) {
        java.util.ArrayList arrayListZ = this.f17840F ? this.f17837C.z() : this.f17837C.E();
        int i10 = this.f17838D;
        if (i10 >= 0 && i6 >= i10) {
            i6++;
        }
        return (androidx.appcompat.view.menu.i) arrayListZ.get(i6);
    }

    public void d(boolean z6) {
        this.f17839E = z6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayListZ = this.f17840F ? this.f17837C.z() : this.f17837C.E();
        int i6 = this.f17838D;
        int size = arrayListZ.size();
        return i6 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f17841G.inflate(this.f17842H, viewGroup, false);
        }
        int groupId = getItem(i6).getGroupId();
        int i10 = i6 - 1;
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f17837C.F() && groupId != (i10 >= 0 ? getItem(i10).getGroupId() : groupId));
        androidx.appcompat.view.menu.n.a aVar = (androidx.appcompat.view.menu.n.a) view;
        if (this.f17839E) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.f(getItem(i6), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
