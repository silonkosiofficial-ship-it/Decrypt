package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
class A extends androidx.recyclerview.widget.RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.j f43182d;

    public static class a extends androidx.recyclerview.widget.RecyclerView.D {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final android.widget.TextView f43183u;

        a(android.widget.TextView textView) {
            super(textView);
            this.f43183u = textView;
        }
    }

    A(com.google.android.material.datepicker.j jVar) {
        this.f43182d = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f43182d.M1().m();
    }

    int u(int i6) {
        return i6 - this.f43182d.M1().l().f43299E;
    }

    int v(int i6) {
        return this.f43182d.M1().l().f43299E + i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void j(com.google.android.material.datepicker.A.a aVar, int i6) {
        int iV = v(i6);
        aVar.f43183u.setText(java.lang.String.format(java.util.Locale.getDefault(), "%d", java.lang.Integer.valueOf(iV)));
        android.widget.TextView textView = aVar.f43183u;
        textView.setContentDescription(com.google.android.material.datepicker.f.e(textView.getContext(), iV));
        com.google.android.material.datepicker.c cVarN1 = this.f43182d.N1();
        if (com.google.android.material.datepicker.z.i().get(1) == iV) {
            com.google.android.material.datepicker.b bVar = cVarN1.f43212f;
        } else {
            com.google.android.material.datepicker.b bVar2 = cVarN1.f43210d;
        }
        this.f43182d.P1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.datepicker.A.a l(android.view.ViewGroup viewGroup, int i6) {
        return new com.google.android.material.datepicker.A.a((android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(p125m4.g.f50668p, viewGroup, false));
    }
}
