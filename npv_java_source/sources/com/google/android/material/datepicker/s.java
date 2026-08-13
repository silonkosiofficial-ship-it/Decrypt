package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
abstract class s extends androidx.recyclerview.widget.LinearLayoutManager {

    class a extends androidx.recyclerview.widget.g {
        a(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(android.util.DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    s(android.content.Context context, int i6, boolean z6) {
        super(context, i6, z6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void M1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        com.google.android.material.datepicker.s.a aVar = new com.google.android.material.datepicker.s.a(recyclerView.getContext());
        aVar.p(i6);
        N1(aVar);
    }
}
