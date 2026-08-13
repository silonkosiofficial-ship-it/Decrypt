package p204u3;

/* JADX INFO: loaded from: classes.dex */
final class q extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final p214v3.C7273v f55504C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f55505D;

    public q(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(context);
        p214v3.C7273v c7273v = new p214v3.C7273v(context, str);
        this.f55504C = c7273v;
        c7273v.o(str2);
        c7273v.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f55505D) {
            return false;
        }
        this.f55504C.m(motionEvent);
        return false;
    }
}
