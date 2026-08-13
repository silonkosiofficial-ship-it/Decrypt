package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    class a extends I2.i {
        a() {
        }

        @Override // I2.i
        public I2.h a(java.lang.String str) {
            return null;
        }
    }

    public static I2.i c() {
        return new I2.i.a();
    }

    public abstract I2.h a(java.lang.String str);

    public final I2.h b(java.lang.String str) {
        I2.h hVarA = a(str);
        return hVarA == null ? I2.h.a(str) : hVarA;
    }
}
