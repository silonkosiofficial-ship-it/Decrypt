package U0;

/* JADX INFO: loaded from: classes.dex */
final class j extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.AbstractC1336h f14435a;

    public j(M0.AbstractC1336h abstractC1336h) {
        this.f14435a = abstractC1336h;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        this.f14435a.a();
    }
}
