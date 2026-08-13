package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5974b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f40801a;

    static {
        char[] cArr = new char[80];
        f40801a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String a(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(interfaceC5965a5, sb, 0);
        return sb.toString();
    }

    private static void b(int i6, java.lang.StringBuilder sb) {
        while (i6 > 0) {
            char[] cArr = f40801a;
            int length = i6 > cArr.length ? cArr.length : i6;
            sb.append(cArr, 0, length);
            i6 -= length;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203  */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0166, please report this as an issue */
    private static void c(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, java.lang.StringBuilder sb, int i6) {
        int i10;
        int i11;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.Object objS;
        boolean zBooleanValue;
        java.lang.Object obj;
        boolean zEquals;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = interfaceC5965a5.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i12];
            if (!java.lang.reflect.Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i12++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i10);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (java.lang.reflect.Method) entry.getValue()) == null || !method4.getReturnType().equals(java.util.List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (java.lang.reflect.Method) entry.getValue()) == null || !method3.getReturnType().equals(java.util.Map.class) || method3.isAnnotationPresent(java.lang.Deprecated.class) || !java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    i11 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (java.lang.reflect.Method) entry.getValue();
                                method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                                if (method != null) {
                                    objS = com.google.android.gms.internal.measurement.AbstractC6130t4.s(method, interfaceC5965a5, new java.lang.Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = true;
                                        if (objS instanceof java.lang.Boolean) {
                                            if (((java.lang.Boolean) objS).booleanValue()) {
                                                zEquals = false;
                                            } else {
                                                zEquals = true;
                                            }
                                        } else if (objS instanceof java.lang.Integer) {
                                            if (((java.lang.Integer) objS).intValue() == 0) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else if (objS instanceof java.lang.Float) {
                                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objS).floatValue()) == 0) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else if (objS instanceof java.lang.Double) {
                                            if (objS instanceof java.lang.String) {
                                                obj = "";
                                            } else if (objS instanceof com.google.android.gms.internal.measurement.L3) {
                                                obj = com.google.android.gms.internal.measurement.L3.f40566D;
                                            } else if ((objS instanceof com.google.android.gms.internal.measurement.InterfaceC5965a5) ? !((objS instanceof java.lang.Enum) && ((java.lang.Enum) objS).ordinal() == 0) : objS != ((com.google.android.gms.internal.measurement.InterfaceC5965a5) objS).b()) {
                                                zEquals = false;
                                            } else {
                                                zEquals = true;
                                            }
                                            zEquals = objS.equals(obj);
                                        } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objS).doubleValue()) == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.measurement.AbstractC6130t4.s(method2, interfaceC5965a5, new java.lang.Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        d(sb, i6, strSubstring, objS);
                                    }
                                }
                            }
                        } else {
                            method = (java.lang.reflect.Method) entry.getValue();
                            method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objS = com.google.android.gms.internal.measurement.AbstractC6130t4.s(method, interfaceC5965a5, new java.lang.Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = true;
                                    if (objS instanceof java.lang.Boolean) {
                                        if (((java.lang.Boolean) objS).booleanValue()) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objS instanceof java.lang.Integer) {
                                        if (((java.lang.Integer) objS).intValue() == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objS instanceof java.lang.Float) {
                                        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objS).floatValue()) == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objS instanceof java.lang.Double) {
                                        if (objS instanceof java.lang.String) {
                                            obj = "";
                                        } else if (objS instanceof com.google.android.gms.internal.measurement.L3) {
                                            obj = com.google.android.gms.internal.measurement.L3.f40566D;
                                        } else if (objS instanceof com.google.android.gms.internal.measurement.InterfaceC5965a5) {
                                            zEquals = false;
                                        } else {
                                            zEquals = false;
                                        }
                                        zEquals = objS.equals(obj);
                                    } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objS).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                    if (zEquals) {
                                        zBooleanValue = false;
                                    }
                                } else {
                                    zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.measurement.AbstractC6130t4.s(method2, interfaceC5965a5, new java.lang.Object[0])).booleanValue();
                                }
                                if (zBooleanValue) {
                                    d(sb, i6, strSubstring, objS);
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    d(sb, i6, strSubstring.substring(0, strSubstring.length() - 3), com.google.android.gms.internal.measurement.AbstractC6130t4.s(method3, interfaceC5965a5, new java.lang.Object[0]));
                }
                i10 = i11;
            } else {
                d(sb, i6, strSubstring.substring(0, strSubstring.length() - 4), com.google.android.gms.internal.measurement.AbstractC6130t4.s(method4, interfaceC5965a5, new java.lang.Object[0]));
                i10 = 3;
            }
        }
        com.google.android.gms.internal.measurement.E5 e6 = ((com.google.android.gms.internal.measurement.AbstractC6130t4) interfaceC5965a5).zzb;
        if (e6 != null) {
            e6.h(sb, i6);
        }
    }

    static void d(java.lang.StringBuilder sb, int i6, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i6, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i6, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (java.lang.Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.B5.a(com.google.android.gms.internal.measurement.L3.o((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.L3) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.B5.a((com.google.android.gms.internal.measurement.L3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.AbstractC6130t4) {
            sb.append(" {");
            c((com.google.android.gms.internal.measurement.AbstractC6130t4) obj, sb, i6 + 2);
            sb.append("\n");
            b(i6, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i11 = i6 + 2;
        d(sb, i11, "key", entry.getKey());
        d(sb, i11, "value", entry.getValue());
        sb.append("\n");
        b(i6, sb);
        sb.append("}");
    }
}
