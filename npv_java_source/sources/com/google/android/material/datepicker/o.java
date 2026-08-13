package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
class o extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final int f43304G = com.google.android.material.datepicker.z.k().getMaximum(4);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f43305H = (com.google.android.material.datepicker.z.k().getMaximum(5) + com.google.android.material.datepicker.z.k().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.material.datepicker.n f43306C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.Collection f43307D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    com.google.android.material.datepicker.c f43308E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final com.google.android.material.datepicker.C6515a f43309F;

    o(com.google.android.material.datepicker.n nVar, com.google.android.material.datepicker.d dVar, com.google.android.material.datepicker.C6515a c6515a, com.google.android.material.datepicker.h hVar) {
        this.f43306C = nVar;
        this.f43309F = c6515a;
        this.f43307D = dVar.o();
    }

    private java.lang.String c(android.content.Context context, long j6) {
        return com.google.android.material.datepicker.f.a(context, j6, j(j6), i(j6), g(j6));
    }

    private void f(android.content.Context context) {
        if (this.f43308E == null) {
            this.f43308E = new com.google.android.material.datepicker.c(context);
        }
    }

    private boolean h(long j6) {
        throw null;
    }

    private boolean j(long j6) {
        return com.google.android.material.datepicker.z.i().getTimeInMillis() == j6;
    }

    private void m(android.widget.TextView textView, long j6, int i6) {
        com.google.android.material.datepicker.b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j6));
        if (this.f43309F.f().n(j6)) {
            textView.setEnabled(true);
            boolean zH = h(j6);
            textView.setSelected(zH);
            if (zH) {
                bVar = this.f43308E.f43208b;
            } else {
                bVar = j(j6) ? this.f43308E.f43209c : this.f43308E.f43207a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f43308E.f43213g;
        }
        bVar.b(textView);
    }

    private void n(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView, long j6) {
        if (com.google.android.material.datepicker.n.m(j6).equals(this.f43306C)) {
            int iT = this.f43306C.t(j6);
            m((android.widget.TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iT) - materialCalendarGridView.getFirstVisiblePosition()), j6, iT);
        }
    }

    int a(int i6) {
        return b() + (i6 - 1);
    }

    int b() {
        return this.f43306C.r(this.f43309F.i());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Long getItem(int i6) {
        if (i6 < b() || i6 > k()) {
            return null;
        }
        return java.lang.Long.valueOf(this.f43306C.s(l(i6)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        int i10;
        f(viewGroup.getContext());
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(p125m4.g.f50663k, viewGroup, false);
        }
        int iB = i6 - b();
        if (iB >= 0) {
            com.google.android.material.datepicker.n nVar = this.f43306C;
            if (iB >= nVar.f43301G) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i10 = -1;
            } else {
                i10 = iB + 1;
                textView.setTag(nVar);
                textView.setText(java.lang.String.format(textView.getResources().getConfiguration().locale, "%d", java.lang.Integer.valueOf(i10)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i10 = -1;
        }
        java.lang.Long item = getItem(i6);
        if (item == null) {
            return textView;
        }
        m(textView, item.longValue(), i10);
        return textView;
    }

    boolean g(long j6) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f43305H;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6 / this.f43306C.f43300F;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j6) {
        throw null;
    }

    int k() {
        return (b() + this.f43306C.f43301G) - 1;
    }

    int l(int i6) {
        return (i6 - b()) + 1;
    }

    public void o(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView) {
        java.util.Iterator it = this.f43307D.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((java.lang.Long) it.next()).longValue());
        }
    }

    boolean p(int i6) {
        return i6 >= b() && i6 <= k();
    }
}
