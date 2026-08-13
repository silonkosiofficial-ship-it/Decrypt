package p197t7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final long a(java.io.Reader reader, java.io.Writer writer, int i6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(reader, "<this>");
        p247y7.AbstractC7350t.f(writer, "out");
        char[] cArr = new char[i6];
        int i10 = reader.read(cArr);
        long j6 = 0;
        while (i10 >= 0) {
            writer.write(cArr, 0, i10);
            j6 += (long) i10;
            i10 = reader.read(cArr);
        }
        return j6;
    }

    public static /* synthetic */ long b(java.io.Reader reader, java.io.Writer writer, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 8192;
        }
        return a(reader, writer, i6);
    }

    public static final java.lang.String c(java.io.Reader reader) {
        p247y7.AbstractC7350t.f(reader, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        b(reader, stringWriter, 0, 2, null);
        java.lang.String string = stringWriter.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
