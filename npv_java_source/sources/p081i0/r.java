package p081i0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p081i0.r f46623a = new p081i0.r();

    private r() {
    }

    public final android.view.autofill.AutofillId a(android.view.ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean b(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean c(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean d(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean e(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void f(android.view.ViewStructure viewStructure, java.lang.String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(android.view.ViewStructure viewStructure, android.view.autofill.AutofillId autofillId, int i6) {
        viewStructure.setAutofillId(autofillId, i6);
    }

    public final void h(android.view.ViewStructure viewStructure, int i6) {
        viewStructure.setAutofillType(i6);
    }

    public final java.lang.CharSequence i(android.view.autofill.AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
