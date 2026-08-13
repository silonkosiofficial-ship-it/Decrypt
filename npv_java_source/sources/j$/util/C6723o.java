package j$.util;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6723o implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f48172a;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48172a.accept(new j$.util.C6724p((java.util.Map.Entry) obj));
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }
}
