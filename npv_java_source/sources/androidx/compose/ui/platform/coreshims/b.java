package androidx.compose.ui.platform.coreshims;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f20088a;

    private b(android.view.autofill.AutofillId autofillId) {
        this.f20088a = autofillId;
    }

    public static androidx.compose.ui.platform.coreshims.b b(android.view.autofill.AutofillId autofillId) {
        return new androidx.compose.ui.platform.coreshims.b(autofillId);
    }

    public android.view.autofill.AutofillId a() {
        return androidx.compose.ui.platform.coreshims.a.a(this.f20088a);
    }
}
