package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class e implements androidx.appcompat.view.menu.m, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.content.Context f17826C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    android.view.LayoutInflater f17827D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    androidx.appcompat.view.menu.g f17828E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    androidx.appcompat.view.menu.ExpandedMenuView f17829F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f17830G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f17831H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f17832I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f17833J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f17834K;

    private class a extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f17835C = -1;

        public a() {
            a();
        }

        void a() {
            androidx.appcompat.view.menu.i iVarV = androidx.appcompat.view.menu.e.this.f17828E.v();
            if (iVarV != null) {
                java.util.ArrayList arrayListZ = androidx.appcompat.view.menu.e.this.f17828E.z();
                int size = arrayListZ.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (((androidx.appcompat.view.menu.i) arrayListZ.get(i6)) == iVarV) {
                        this.f17835C = i6;
                        return;
                    }
                }
            }
            this.f17835C = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.appcompat.view.menu.i getItem(int i6) {
            java.util.ArrayList arrayListZ = androidx.appcompat.view.menu.e.this.f17828E.z();
            int i10 = i6 + androidx.appcompat.view.menu.e.this.f17830G;
            int i11 = this.f17835C;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return (androidx.appcompat.view.menu.i) arrayListZ.get(i10);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = androidx.appcompat.view.menu.e.this.f17828E.z().size() - androidx.appcompat.view.menu.e.this.f17830G;
            return this.f17835C < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
            if (view == null) {
                androidx.appcompat.view.menu.e eVar = androidx.appcompat.view.menu.e.this;
                view = eVar.f17827D.inflate(eVar.f17832I, viewGroup, false);
            }
            ((androidx.appcompat.view.menu.n.a) view).f(getItem(i6), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i6, int i10) {
        this.f17832I = i6;
        this.f17831H = i10;
    }

    public e(android.content.Context context, int i6) {
        this(i6, 0);
        this.f17826C = context;
        this.f17827D = android.view.LayoutInflater.from(context);
    }

    public android.widget.ListAdapter a() {
        if (this.f17834K == null) {
            this.f17834K = new androidx.appcompat.view.menu.e.a();
        }
        return this.f17834K;
    }

    public androidx.appcompat.view.menu.n b(android.view.ViewGroup viewGroup) {
        if (this.f17829F == null) {
            this.f17829F = (androidx.appcompat.view.menu.ExpandedMenuView) this.f17827D.inflate(p090j.g.f48765g, viewGroup, false);
            if (this.f17834K == null) {
                this.f17834K = new androidx.appcompat.view.menu.e.a();
            }
            this.f17829F.setAdapter((android.widget.ListAdapter) this.f17834K);
            this.f17829F.setOnItemClickListener(this);
        }
        return this.f17829F;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        androidx.appcompat.view.menu.m.a aVar = this.f17833J;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        androidx.appcompat.view.menu.e.a aVar = this.f17834K;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
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
    public void h(androidx.appcompat.view.menu.m.a aVar) {
        this.f17833J = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    public void i(android.content.Context context, androidx.appcompat.view.menu.g gVar) {
        android.view.LayoutInflater layoutInflaterFrom;
        androidx.appcompat.view.menu.e.a aVar;
        if (this.f17831H == 0) {
            if (this.f17826C != null) {
                this.f17826C = context;
                if (this.f17827D == null) {
                    layoutInflaterFrom = android.view.LayoutInflater.from(context);
                }
            }
            this.f17828E = gVar;
            aVar = this.f17834K;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, this.f17831H);
        this.f17826C = contextThemeWrapper;
        layoutInflaterFrom = android.view.LayoutInflater.from(contextThemeWrapper);
        this.f17827D = layoutInflaterFrom;
        this.f17828E = gVar;
        aVar = this.f17834K;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new androidx.appcompat.view.menu.h(rVar).b(null);
        androidx.appcompat.view.menu.m.a aVar = this.f17833J;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
        this.f17828E.M(this.f17834K.getItem(i6), this, 0);
    }
}
