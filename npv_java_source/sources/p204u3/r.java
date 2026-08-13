package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f55507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f55508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.Context f55509d;

    public r(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) throws p204u3.p {
        this.f55507b = interfaceC2698Ot.getLayoutParams();
        android.view.ViewParent parent = interfaceC2698Ot.getParent();
        this.f55509d = interfaceC2698Ot.r0();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            throw new p204u3.p("Could not get the parent of the WebView for an overlay.");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.f55508c = viewGroup;
        this.f55506a = viewGroup.indexOfChild(interfaceC2698Ot.N());
        viewGroup.removeView(interfaceC2698Ot.N());
        interfaceC2698Ot.f1(true);
    }
}
