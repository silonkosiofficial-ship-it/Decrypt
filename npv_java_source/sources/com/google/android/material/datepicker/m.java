package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
public final class m<S> extends com.google.android.material.datepicker.r {

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f43294G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private com.google.android.material.datepicker.C6515a f43295H0;

    class a extends com.google.android.material.datepicker.q {
        a() {
        }
    }

    static com.google.android.material.datepicker.m F1(com.google.android.material.datepicker.d dVar, int i6, com.google.android.material.datepicker.C6515a c6515a) {
        com.google.android.material.datepicker.m mVar = new com.google.android.material.datepicker.m();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c6515a);
        mVar.v1(bundle);
        return mVar;
    }

    @Override // androidx.fragment.app.f
    public void K0(android.os.Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f43294G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f43295H0);
    }

    @Override // androidx.fragment.app.f
    public void o0(android.os.Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.f43294G0 = bundle.getInt("THEME_RES_ID_KEY");
        androidx.appcompat.app.D.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f43295H0 = (com.google.android.material.datepicker.C6515a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.f
    public android.view.View s0(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(t(), this.f43294G0));
        new com.google.android.material.datepicker.m.a();
        throw null;
    }
}
