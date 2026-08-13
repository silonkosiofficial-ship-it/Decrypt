package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6808q0 extends j$.util.stream.AbstractC6827u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.EnumC6832v0 f48535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.util.function.Predicate f48536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6808q0(j$.util.stream.EnumC6832v0 enumC6832v0, java.util.function.Predicate predicate) {
        super(enumC6832v0);
        this.f48535c = enumC6832v0;
        this.f48536d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.f48558a) {
            return;
        }
        boolean zTest = this.f48536d.test(obj);
        j$.util.stream.EnumC6832v0 enumC6832v0 = this.f48535c;
        if (zTest == enumC6832v0.f48566a) {
            this.f48558a = true;
            this.f48559b = enumC6832v0.f48567b;
        }
    }
}
