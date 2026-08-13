package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {
    public static java.lang.Object a(java.lang.Object obj) {
        java.io.ObjectInputStream objectInputStream;
        java.io.ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        java.lang.Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return object;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        Q3.AbstractC1477p.l(strArr);
        Q3.AbstractC1477p.l(strArr2);
        int iMin = java.lang.Math.min(strArr.length, strArr2.length);
        for (int i6 = 0; i6 < iMin; i6++) {
            java.lang.String str2 = strArr[i6];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i6];
            }
        }
        return null;
    }
}
