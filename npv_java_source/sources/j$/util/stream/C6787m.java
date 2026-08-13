package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6787m extends j$.util.stream.AbstractC6790m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48506b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f48507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.Object f48508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6787m(j$.util.stream.P3 p6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48508d = p6;
        this.f48507c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6787m(j$.util.stream.C6755f2 c6755f2, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
        this.f48508d = c6755f2;
    }

    public /* synthetic */ C6787m(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(interfaceC6810q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) throws java.lang.Exception {
        switch (this.f48506b) {
            case 0:
                j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48510a;
                if (obj != null) {
                    java.lang.Object obj2 = this.f48508d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.f48507c) {
                        return;
                    }
                    this.f48507c = true;
                    obj = null;
                }
                this.f48508d = obj;
                interfaceC6810q2.accept(obj);
                return;
            case 1:
                j$.util.stream.Stream stream = (j$.util.stream.Stream) ((j$.util.stream.C6755f2) this.f48508d).f48447n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z6 = this.f48507c;
                        j$.util.stream.InterfaceC6810q2 interfaceC6810q3 = this.f48510a;
                        if (z6) {
                            j$.util.Spliterator spliterator = ((j$.util.stream.Stream) stream.sequential()).spliterator();
                            while (!interfaceC6810q3.m() && spliterator.tryAdvance(interfaceC6810q3)) {
                            }
                        } else {
                            ((j$.util.stream.Stream) stream.sequential()).forEach(interfaceC6810q3);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f48507c) {
                    boolean zTest = ((j$.util.stream.P3) this.f48508d).f48315m.test(obj);
                    this.f48507c = zTest;
                    if (zTest) {
                        this.f48510a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public void j() {
        switch (this.f48506b) {
            case 0:
                this.f48507c = false;
                this.f48508d = null;
                this.f48510a.j();
                break;
            default:
                super.j();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        switch (this.f48506b) {
            case 0:
                this.f48507c = false;
                this.f48508d = null;
                this.f48510a.k(-1L);
                break;
            case 1:
                this.f48510a.k(-1L);
                break;
            default:
                this.f48510a.k(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public boolean m() {
        switch (this.f48506b) {
            case 1:
                this.f48507c = true;
                return this.f48510a.m();
            case 2:
                return !this.f48507c || this.f48510a.m();
            default:
                return super.m();
        }
    }
}
