package I2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I2.u {

    public static final class a extends I2.u.a {
        public a(java.lang.Class cls) {
            super(cls);
            this.f4999c.f8806d = androidx.work.OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // I2.u.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public I2.l c() {
            if (this.f4997a && this.f4999c.f8812j.h()) {
                throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new I2.l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // I2.u.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public I2.l.a d() {
            return this;
        }
    }

    l(I2.l.a aVar) {
        super(aVar.f4998b, aVar.f4999c, aVar.f5000d);
    }

    public static I2.l d(java.lang.Class cls) {
        return (I2.l) new I2.l.a(cls).b();
    }
}
