package C1;

/* JADX INFO: renamed from: C1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840a extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1.B f1271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1272c;

    public C0840a(int i6, C1.B b6, int i10) {
        this.f1270a = i6;
        this.f1271b = b6;
        this.f1272c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1270a);
        this.f1271b.c0(this.f1272c, bundle);
    }
}
