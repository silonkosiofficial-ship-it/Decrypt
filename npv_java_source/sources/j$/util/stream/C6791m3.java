package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6791m3 extends j$.util.stream.AbstractC6796n3 implements java.util.function.Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object[] f48511b;

    C6791m3(int i6) {
        this.f48511b = new java.lang.Object[i6];
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i6 = this.f48514a;
        this.f48514a = i6 + 1;
        this.f48511b[i6] = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }
}
