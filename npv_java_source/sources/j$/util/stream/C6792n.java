package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6792n extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.Object f48513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6792n(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.InterfaceC6810q2 interfaceC6810q2, int i6) {
        super(interfaceC6810q2);
        this.f48512b = i6;
        this.f48513c = abstractC6732b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6792n(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48512b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f48512b) {
            case 0:
                if (!((java.util.HashSet) this.f48513c).contains(obj)) {
                    ((java.util.HashSet) this.f48513c).add(obj);
                    this.f48510a.accept(obj);
                }
                break;
            case 1:
                ((java.util.function.Consumer) ((j$.util.stream.C6826u) this.f48513c).f48557n).accept(obj);
                this.f48510a.accept(obj);
                break;
            case 2:
                if (((java.util.function.Predicate) ((j$.util.stream.C6826u) this.f48513c).f48557n).test(obj)) {
                    this.f48510a.accept(obj);
                }
                break;
            case 3:
                this.f48510a.accept(((j$.util.stream.C6755f2) this.f48513c).f48447n.apply(obj));
                break;
            case 4:
                this.f48510a.accept(((java.util.function.ToIntFunction) ((j$.util.stream.X) this.f48513c).f48388n).applyAsInt(obj));
                break;
            case 5:
                this.f48510a.accept(((java.util.function.ToLongFunction) ((j$.util.stream.C6763h0) this.f48513c).f48478n).applyAsLong(obj));
                break;
            default:
                this.f48510a.accept(((java.util.function.ToDoubleFunction) ((j$.util.stream.C6831v) this.f48513c).f48564n).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public void j() {
        switch (this.f48512b) {
            case 0:
                this.f48513c = null;
                this.f48510a.j();
                break;
            default:
                super.j();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public void k(long j6) {
        switch (this.f48512b) {
            case 0:
                this.f48513c = new java.util.HashSet();
                this.f48510a.k(-1L);
                break;
            case 1:
            default:
                super.k(j6);
                break;
            case 2:
                this.f48510a.k(-1L);
                break;
        }
    }
}
