package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Q3 extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f48323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f48324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f48325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.R3 f48326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q3(j$.util.stream.R3 r6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2, boolean z6) {
        super(interfaceC6810q2);
        this.f48326e = r6;
        this.f48325d = z6;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        boolean z6 = true;
        if (!this.f48324c) {
            boolean z10 = !this.f48326e.f48339m.test(obj);
            this.f48324c = z10;
            if (!z10) {
                z6 = false;
            }
        }
        boolean z11 = this.f48325d;
        if (z11 && !z6) {
            this.f48323b++;
        }
        if (z11 || z6) {
            this.f48510a.accept(obj);
        }
    }
}
