package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6798o0 implements java.util.function.Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.util.stream.EnumC6832v0 f48516b;

    public /* synthetic */ C6798o0(j$.util.stream.EnumC6832v0 enumC6832v0, int i6) {
        this.f48515a = i6;
        this.f48516b = enumC6832v0;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.f48515a) {
            case 0:
                return new j$.util.stream.C6817s0(this.f48516b);
            case 1:
                return new j$.util.stream.C6812r0(this.f48516b);
            default:
                return new j$.util.stream.C6822t0(this.f48516b);
        }
    }
}
