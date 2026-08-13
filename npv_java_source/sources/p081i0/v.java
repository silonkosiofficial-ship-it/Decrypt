package p081i0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends android.view.autofill.AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p081i0.v f46624a = new p081i0.v();

    private v() {
    }

    public final void a(p081i0.d dVar) {
        dVar.a().registerCallback(p081i0.s.a(this));
    }

    public final void b(p081i0.d dVar) {
        dVar.a().unregisterCallback(p081i0.s.a(this));
    }

    public void onAutofillEvent(android.view.View view, int i6, int i10) {
        super.onAutofillEvent(view, i6, i10);
        if (i10 == 1 || i10 == 2 || i10 != 3) {
        }
    }
}
