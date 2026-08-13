package p081i0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p081i0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f46619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p081i0.w f46620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.autofill.AutofillManager f46621c;

    public d(android.view.View view, p081i0.w wVar) {
        this.f46619a = view;
        this.f46620b = wVar;
        android.view.autofill.AutofillManager autofillManagerA = p081i0.b.a(view.getContext().getSystemService(p081i0.a.a()));
        if (autofillManagerA == null) {
            throw new java.lang.IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f46621c = autofillManagerA;
        view.setImportantForAutofill(1);
    }

    public final android.view.autofill.AutofillManager a() {
        return this.f46621c;
    }

    public final p081i0.w b() {
        return this.f46620b;
    }

    public final android.view.View c() {
        return this.f46619a;
    }
}
