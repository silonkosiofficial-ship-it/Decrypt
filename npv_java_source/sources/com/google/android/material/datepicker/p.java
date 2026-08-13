package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
class p extends androidx.recyclerview.widget.RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.C6515a f43310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.material.datepicker.j.m f43311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43312f;

    class a implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView f43313C;

        a(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView) {
            this.f43313C = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i6, long j6) {
            if (this.f43313C.getAdapter().p(i6)) {
                com.google.android.material.datepicker.p.this.f43311e.a(this.f43313C.getAdapter().getItem(i6).longValue());
            }
        }
    }

    public static class b extends androidx.recyclerview.widget.RecyclerView.D {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final android.widget.TextView f43315u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final com.google.android.material.datepicker.MaterialCalendarGridView f43316v;

        b(android.widget.LinearLayout linearLayout, boolean z6) {
            super(linearLayout);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(p125m4.e.f50645u);
            this.f43315u = textView;
            androidx.core.view.X.o0(textView, true);
            this.f43316v = (com.google.android.material.datepicker.MaterialCalendarGridView) linearLayout.findViewById(p125m4.e.f50641q);
            if (z6) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    p(android.content.Context context, com.google.android.material.datepicker.d dVar, com.google.android.material.datepicker.C6515a c6515a, com.google.android.material.datepicker.h hVar, com.google.android.material.datepicker.j.m mVar) {
        com.google.android.material.datepicker.n nVarL = c6515a.l();
        com.google.android.material.datepicker.n nVarH = c6515a.h();
        com.google.android.material.datepicker.n nVarK = c6515a.k();
        if (nVarL.compareTo(nVarK) > 0) {
            throw new java.lang.IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVarK.compareTo(nVarH) > 0) {
            throw new java.lang.IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f43312f = (com.google.android.material.datepicker.o.f43304G * com.google.android.material.datepicker.j.Q1(context)) + (com.google.android.material.datepicker.l.b2(context) ? com.google.android.material.datepicker.j.Q1(context) : 0);
        this.f43310d = c6515a;
        this.f43311e = mVar;
        s(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f43310d.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long e(int i6) {
        return this.f43310d.l().w(i6).v();
    }

    com.google.android.material.datepicker.n v(int i6) {
        return this.f43310d.l().w(i6);
    }

    java.lang.CharSequence w(int i6) {
        return v(i6).u();
    }

    int x(com.google.android.material.datepicker.n nVar) {
        return this.f43310d.l().x(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void j(com.google.android.material.datepicker.p.b bVar, int i6) {
        com.google.android.material.datepicker.n nVarW = this.f43310d.l().w(i6);
        bVar.f43315u.setText(nVarW.u());
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = (com.google.android.material.datepicker.MaterialCalendarGridView) bVar.f43316v.findViewById(p125m4.e.f50641q);
        if (materialCalendarGridView.getAdapter() == null || !nVarW.equals(materialCalendarGridView.getAdapter().f43306C)) {
            com.google.android.material.datepicker.o oVar = new com.google.android.material.datepicker.o(nVarW, null, this.f43310d, null);
            materialCalendarGridView.setNumColumns(nVarW.f43300F);
            materialCalendarGridView.setAdapter((android.widget.ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new com.google.android.material.datepicker.p.a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.datepicker.p.b l(android.view.ViewGroup viewGroup, int i6) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(p125m4.g.f50666n, viewGroup, false);
        if (!com.google.android.material.datepicker.l.b2(viewGroup.getContext())) {
            return new com.google.android.material.datepicker.p.b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.q(-1, this.f43312f));
        return new com.google.android.material.datepicker.p.b(linearLayout, true);
    }
}
