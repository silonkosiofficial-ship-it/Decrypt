package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6803p0 implements java.util.function.Supplier, java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48529c;

    public /* synthetic */ C6803p0(int i6, java.lang.Object obj, java.lang.Object obj2) {
        this.f48527a = i6;
        this.f48528b = obj;
        this.f48529c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f48527a) {
            case 1:
                ((j$.util.stream.C6801o3) this.f48528b).b((java.util.function.Consumer) this.f48529c, obj);
                break;
            case 2:
                if (obj != null) {
                    ((j$.util.concurrent.ConcurrentHashMap) this.f48529c).putIfAbsent(obj, java.lang.Boolean.TRUE);
                } else {
                    ((java.util.concurrent.atomic.AtomicBoolean) this.f48528b).set(true);
                }
                break;
            default:
                ((java.util.function.BiConsumer) this.f48528b).accept(this.f48529c, obj);
                break;
        }
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.f48527a) {
            case 1:
                break;
            case 2:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
        return new j$.util.stream.C6808q0((j$.util.stream.EnumC6832v0) this.f48528b, (java.util.function.Predicate) this.f48529c);
    }
}
