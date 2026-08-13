package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f23845b = I2.j.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.work.b f23846c = new androidx.work.b.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.Map f23847a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.Map f23848a = new java.util.HashMap();

        public androidx.work.b a() throws java.lang.Throwable {
            androidx.work.b bVar = new androidx.work.b(this.f23848a);
            androidx.work.b.k(bVar);
            return bVar;
        }

        public androidx.work.b.a b(java.lang.String str, java.lang.Object obj) {
            if (obj == null) {
                this.f23848a.put(str, null);
            } else {
                java.lang.Class<?> cls = obj.getClass();
                if (cls == java.lang.Boolean.class || cls == java.lang.Byte.class || cls == java.lang.Integer.class || cls == java.lang.Long.class || cls == java.lang.Float.class || cls == java.lang.Double.class || cls == java.lang.String.class || cls == java.lang.Boolean[].class || cls == java.lang.Byte[].class || cls == java.lang.Integer[].class || cls == java.lang.Long[].class || cls == java.lang.Float[].class || cls == java.lang.Double[].class || cls == java.lang.String[].class) {
                    this.f23848a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f23848a.put(str, androidx.work.b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f23848a.put(str, androidx.work.b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f23848a.put(str, androidx.work.b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f23848a.put(str, androidx.work.b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f23848a.put(str, androidx.work.b.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f23848a.put(str, androidx.work.b.c((double[]) obj));
                }
            }
            return this;
        }

        public androidx.work.b.a c(androidx.work.b bVar) {
            d(bVar.f23847a);
            return this;
        }

        public androidx.work.b.a d(java.util.Map map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                b((java.lang.String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public androidx.work.b.a e(java.lang.String str, java.lang.String str2) {
            this.f23848a.put(str, str2);
            return this;
        }
    }

    public b(androidx.work.b bVar) {
        this.f23847a = new java.util.HashMap(bVar.f23847a);
    }

    public b(java.util.Map map) {
        this.f23847a = new java.util.HashMap(map);
    }

    public static java.lang.Boolean[] a(boolean[] zArr) {
        java.lang.Boolean[] boolArr = new java.lang.Boolean[zArr.length];
        for (int i6 = 0; i6 < zArr.length; i6++) {
            boolArr[i6] = java.lang.Boolean.valueOf(zArr[i6]);
        }
        return boolArr;
    }

    public static java.lang.Byte[] b(byte[] bArr) {
        java.lang.Byte[] bArr2 = new java.lang.Byte[bArr.length];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            bArr2[i6] = java.lang.Byte.valueOf(bArr[i6]);
        }
        return bArr2;
    }

    public static java.lang.Double[] c(double[] dArr) {
        java.lang.Double[] dArr2 = new java.lang.Double[dArr.length];
        for (int i6 = 0; i6 < dArr.length; i6++) {
            dArr2[i6] = java.lang.Double.valueOf(dArr[i6]);
        }
        return dArr2;
    }

    public static java.lang.Float[] d(float[] fArr) {
        java.lang.Float[] fArr2 = new java.lang.Float[fArr.length];
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr2[i6] = java.lang.Float.valueOf(fArr[i6]);
        }
        return fArr2;
    }

    public static java.lang.Integer[] e(int[] iArr) {
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            numArr[i6] = java.lang.Integer.valueOf(iArr[i6]);
        }
        return numArr;
    }

    public static java.lang.Long[] f(long[] jArr) {
        java.lang.Long[] lArr = new java.lang.Long[jArr.length];
        for (int i6 = 0; i6 < jArr.length; i6++) {
            lArr[i6] = java.lang.Long.valueOf(jArr[i6]);
        }
        return lArr;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static androidx.work.b g(byte[] bArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.ObjectInputStream objectInputStream;
        if (bArr.length > 10240) {
            throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        java.util.HashMap map = new java.util.HashMap();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i6 = objectInputStream.readInt(); i6 > 0; i6--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (java.io.IOException e6) {
                            java.lang.String str = f23845b;
                        }
                        byteArrayInputStream.close();
                    } catch (java.io.IOException e10) {
                        java.lang.String str2 = f23845b;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.io.IOException e11) {
                                java.lang.String str3 = f23845b;
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (java.lang.ClassNotFoundException e12) {
                        java.lang.String str4 = f23845b;
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (java.io.IOException e13) {
                            java.lang.String str5 = f23845b;
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (java.io.IOException e14) {
                        java.lang.String str6 = f23845b;
                        throw th;
                    }
                }
            } catch (java.io.IOException e15) {
                e = e15;
                objectInputStream = null;
                java.lang.String str7 = f23845b;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new androidx.work.b(map);
            } catch (java.lang.ClassNotFoundException e16) {
                e = e16;
                objectInputStream = null;
                java.lang.String str8 = f23845b;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new androidx.work.b(map);
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (java.io.IOException e17) {
            java.lang.String str9 = f23845b;
        }
        return new androidx.work.b(map);
    }

    public static byte[] k(androidx.work.b bVar) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            try {
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(bVar.j());
                    for (java.util.Map.Entry entry : bVar.f23847a.entrySet()) {
                        objectOutputStream2.writeUTF((java.lang.String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (java.io.IOException e6) {
                        java.lang.String str = f23845b;
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e10) {
                        java.lang.String str2 = f23845b;
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (java.io.IOException e11) {
                    objectOutputStream = objectOutputStream2;
                    java.lang.String str3 = f23845b;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (java.io.IOException e12) {
                            java.lang.String str4 = f23845b;
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e13) {
                        java.lang.String str5 = f23845b;
                    }
                    return byteArray;
                } catch (java.lang.Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (java.io.IOException e14) {
                            java.lang.String str6 = f23845b;
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (java.io.IOException e15) {
                        java.lang.String str7 = f23845b;
                        throw th;
                    }
                }
            } catch (java.io.IOException e16) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.work.b.class != obj.getClass()) {
            return false;
        }
        androidx.work.b bVar = (androidx.work.b) obj;
        java.util.Set<java.lang.String> setKeySet = this.f23847a.keySet();
        if (!setKeySet.equals(bVar.f23847a.keySet())) {
            return false;
        }
        for (java.lang.String str : setKeySet) {
            java.lang.Object obj2 = this.f23847a.get(str);
            java.lang.Object obj3 = bVar.f23847a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof java.lang.Object[]) && (obj3 instanceof java.lang.Object[])) ? java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public java.util.Map h() {
        return j$.util.DesugarCollections.unmodifiableMap(this.f23847a);
    }

    public int hashCode() {
        return this.f23847a.hashCode() * 31;
    }

    public java.lang.String i(java.lang.String str) {
        java.lang.Object obj = this.f23847a.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public int j() {
        return this.f23847a.size();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Data {");
        if (!this.f23847a.isEmpty()) {
            for (java.lang.String str : this.f23847a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                java.lang.Object obj = this.f23847a.get(str);
                if (obj instanceof java.lang.Object[]) {
                    sb.append(java.util.Arrays.toString((java.lang.Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
