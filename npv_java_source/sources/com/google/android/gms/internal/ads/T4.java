package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T4 implements com.google.android.gms.internal.ads.InterfaceC5088s4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f31844b = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f31845c = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f31846d = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final java.util.regex.Pattern f31847e = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final java.util.regex.Pattern f31848f = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f31849g = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.regex.Pattern f31850h = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.R4 f31851i = new com.google.android.gms.internal.ads.R4(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.xmlpull.v1.XmlPullParserFactory f31852a;

    public T4() {
        try {
            org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.f31852a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e6) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long c(java.lang.String str, com.google.android.gms.internal.ads.R4 r6) throws com.google.android.gms.internal.ads.C4649o4 {
        double d6;
        double d10;
        java.util.regex.Matcher matcher = f31844b.matcher(str);
        byte b6 = 2;
        if (matcher.matches()) {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            long j6 = java.lang.Long.parseLong(strGroup) * 3600;
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j10 = java.lang.Long.parseLong(strGroup2) * 60;
            java.lang.String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d11 = j6 + j10;
            double d12 = java.lang.Long.parseLong(strGroup3);
            java.lang.String strGroup4 = matcher.group(4);
            double d13 = 0.0d;
            double d14 = strGroup4 != null ? java.lang.Double.parseDouble(strGroup4) : 0.0d;
            double d15 = d11 + d12;
            java.lang.String strGroup5 = matcher.group(5);
            double d16 = strGroup5 != null ? java.lang.Long.parseLong(strGroup5) / r6.f31114a : 0.0d;
            double d17 = d15 + d14;
            java.lang.String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d13 = (java.lang.Long.parseLong(strGroup6) / ((double) r6.f31115b)) / ((double) r6.f31114a);
            }
            return (long) ((d17 + d16 + d13) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = f31845c.matcher(str);
        if (!matcher2.matches()) {
            throw new com.google.android.gms.internal.ads.C4649o4("Malformed time expression: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d18 = java.lang.Double.parseDouble(strGroup7);
        java.lang.String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b6 = 5;
                            } else {
                                b6 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b6 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b6 = 3;
                    } else {
                        b6 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b6 = 1;
                } else {
                    b6 = -1;
                }
            } else if (strGroup8.equals("h")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
        } else if (strGroup8.equals("f")) {
            b6 = 4;
        } else {
            b6 = -1;
        }
        if (b6 != 0) {
            if (b6 != 1) {
                if (b6 == 3) {
                    d10 = 1000.0d;
                } else if (b6 == 4) {
                    d10 = r6.f31114a;
                } else if (b6 == 5) {
                    d10 = r6.f31116c;
                }
                d18 /= d10;
            } else {
                d6 = 60.0d;
            }
            return (long) (d18 * 1000000.0d);
        }
        d6 = 3600.0d;
        d18 *= d6;
        return (long) (d18 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static android.text.Layout.Alignment d(java.lang.String str) {
        byte b6;
        switch (com.google.android.gms.internal.ads.AbstractC3723fg0.a(str)) {
            case "center":
                b6 = 4;
                break;
            case "end":
                b6 = 3;
                break;
            case "left":
                b6 = 0;
                break;
            case "right":
                b6 = 2;
                break;
            case "start":
                b6 = 1;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0 || b6 == 1) {
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        if (b6 == 2 || b6 == 3) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b6 != 4) {
            return null;
        }
        return android.text.Layout.Alignment.ALIGN_CENTER;
    }

    private static com.google.android.gms.internal.ads.W4 e(com.google.android.gms.internal.ads.W4 w6) {
        return w6 == null ? new com.google.android.gms.internal.ads.W4() : w6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static com.google.android.gms.internal.ads.W4 f(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.gms.internal.ads.W4 w6) {
        ?? r10;
        java.lang.String strValueOf;
        java.lang.String str;
        java.util.regex.Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z6 = false;
        com.google.android.gms.internal.ads.W4 w4E = w6;
        int i6 = 0;
        while (i6 < attributeCount) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i6);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i6);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
             = -1;
             = -1;
            ?? r15 = -1;
            r11 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r10 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1224696685:
                    r10 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r10 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -879295043:
                    r10 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r10 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r10 = !attributeName.equals("id") ? -1 : z6;
                    break;
                case 3511770:
                    r10 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r10 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r10 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r10 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r10 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r10 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r10 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r10 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r10 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r10 = -1;
                    break;
            }
            switch (r10) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        w4E = e(w4E);
                        w4E.C(attributeValue);
                        continue;
                    }
                    i6++;
                    z6 = false;
                    break;
                case 1:
                    w4E = e(w4E);
                    try {
                        w4E.w(com.google.android.gms.internal.ads.AbstractC4669oE.b(attributeValue));
                        continue;
                    } catch (java.lang.IllegalArgumentException unused) {
                        strValueOf = java.lang.String.valueOf(attributeValue);
                        str = "Failed parsing background value: ";
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str.concat(strValueOf));
                    }
                    i6++;
                    z6 = false;
                    break;
                case 2:
                    w4E = e(w4E);
                    try {
                        w4E.y(com.google.android.gms.internal.ads.AbstractC4669oE.b(attributeValue));
                        continue;
                    } catch (java.lang.IllegalArgumentException unused2) {
                        strValueOf = java.lang.String.valueOf(attributeValue);
                        str = "Failed parsing color value: ";
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str.concat(strValueOf));
                    }
                    i6++;
                    z6 = false;
                    break;
                case 3:
                    w4E = e(w4E);
                    w4E.z(attributeValue);
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 4:
                    try {
                        w4E = e(w4E);
                        int i10 = com.google.android.gms.internal.ads.EW.f27061a;
                        java.lang.String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = f31846d.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new com.google.android.gms.internal.ads.C4649o4("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = f31846d.matcher(strArrSplit[1]);
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new com.google.android.gms.internal.ads.C4649o4("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        java.lang.String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    r11 = 0;
                                }
                            } else if (strGroup.equals("em")) {
                                r11 = 1;
                            }
                        } else if (strGroup.equals("%")) {
                            r11 = 2;
                        }
                        if (r11 == 0) {
                            w4E.B(1);
                        } else if (r11 == 1) {
                            w4E.B(2);
                        } else {
                            if (r11 != 2) {
                                throw new com.google.android.gms.internal.ads.C4649o4("Invalid unit for fontSize: '" + strGroup + "'.");
                            }
                            w4E.B(3);
                        }
                        java.lang.String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        w4E.A(java.lang.Float.parseFloat(strGroup2));
                        continue;
                        i6++;
                        z6 = false;
                    } catch (com.google.android.gms.internal.ads.C4649o4 unused3) {
                        strValueOf = java.lang.String.valueOf(attributeValue);
                        str = "Failed parsing fontSize value: ";
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str.concat(strValueOf));
                    }
                    break;
                case 5:
                    w4E = e(w4E);
                    w4E.x("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 6:
                    w4E = e(w4E);
                    w4E.D("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 7:
                    w4E = e(w4E);
                    w4E.J(d(attributeValue));
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 8:
                    w4E = e(w4E);
                    w4E.F(d(attributeValue));
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 9:
                    java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3723fg0.a(attributeValue);
                    int iHashCode2 = strA.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strA.equals("none")) {
                            r15 = z6;
                        }
                    } else if (strA.equals("all")) {
                        r15 = 1;
                    }
                    if (r15 == 0) {
                        w4E = e(w4E);
                        w4E.a(z6);
                    } else if (r15 == 1) {
                        w4E = e(w4E);
                        w4E.a(true);
                        continue;
                    }
                    i6++;
                    z6 = false;
                    break;
                case 10:
                    java.lang.String strA2 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(attributeValue);
                    switch (strA2.hashCode()) {
                        case -618561360:
                            if (strA2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strA2.equals("container")) {
                                r14 = z6;
                            }
                            break;
                        case -250518009:
                            if (strA2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strA2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strA2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strA2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        w4E = e(w4E);
                        w4E.H(1);
                    } else if (r14 == 1 || r14 == 2) {
                        w4E = e(w4E);
                        w4E.H(2);
                    } else if (r14 == 3 || r14 == 4) {
                        w4E = e(w4E);
                        w4E.H(3);
                    } else if (r14 == 5) {
                        w4E = e(w4E);
                        w4E.H(4);
                        continue;
                    }
                    i6++;
                    z6 = false;
                    break;
                case 11:
                    java.lang.String strA3 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(attributeValue);
                    int iHashCode3 = strA3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strA3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strA3.equals("before")) {
                        r13 = z6;
                    }
                    if (r13 == 0) {
                        w4E = e(w4E);
                        w4E.G(1);
                    } else if (r13 == 1) {
                        w4E = e(w4E);
                        w4E.G(2);
                        continue;
                    }
                    i6++;
                    z6 = false;
                    break;
                case 12:
                    java.lang.String strA4 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(attributeValue);
                    switch (strA4.hashCode()) {
                        case -1461280213:
                            if (strA4.equals("nounderline")) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strA4.equals("underline")) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strA4.equals("nolinethrough")) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strA4.equals("linethrough")) {
                                r12 = z6;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        w4E = e(w4E);
                        w4E.E(true);
                    } else if (r12 == 1) {
                        w4E = e(w4E);
                        w4E.E(z6);
                    } else if (r12 == 2) {
                        w4E = e(w4E);
                        w4E.c(true);
                    } else if (r12 == 3) {
                        w4E = e(w4E);
                        w4E.c(z6);
                        continue;
                    }
                    i6++;
                    z6 = false;
                    break;
                case 13:
                    w4E = e(w4E);
                    w4E.b(com.google.android.gms.internal.ads.P4.a(attributeValue));
                    continue;
                    i6++;
                    z6 = false;
                    break;
                case 14:
                    com.google.android.gms.internal.ads.W4 w4E2 = e(w4E);
                    java.util.regex.Matcher matcher2 = f31847e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            java.lang.String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat(strGroup3)));
                        } catch (java.lang.NumberFormatException e6) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.g("TtmlParser", "Failed to parse shear: ".concat(java.lang.String.valueOf(attributeValue)), e6);
                        }
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", "Invalid value for shear: ".concat(java.lang.String.valueOf(attributeValue)));
                    }
                    w4E2.I(fMin);
                    w4E = w4E2;
                    continue;
                    i6++;
                    z6 = false;
                    break;
                default:
                    continue;
                    i6++;
                    z6 = false;
                    break;
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str.concat(strValueOf));
            i6++;
            z6 = false;
        }
        return w4E;
    }

    private static java.lang.String[] g(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new java.lang.String[0];
        }
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5088s4
    public final void a(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.C4978r4 c4978r4, com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        com.google.android.gms.internal.ads.AbstractC4319l4.a(b(bArr, i6, i10), c4978r4, interfaceC5000rF);
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0497 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:73:0x01a8, B:92:0x0204, B:95:0x0212, B:97:0x0218, B:99:0x0220, B:101:0x0228, B:103:0x0230, B:105:0x0238, B:107:0x0240, B:109:0x0246, B:111:0x024e, B:113:0x0256, B:115:0x025c, B:117:0x0262, B:119:0x0268, B:121:0x0270, B:124:0x0279, B:422:0x07df, B:126:0x02ab, B:128:0x02b1, B:130:0x02ba, B:132:0x02c9, B:134:0x02d4, B:136:0x02e8, B:138:0x02ee, B:286:0x0596, B:140:0x0307, B:142:0x030f, B:144:0x0315, B:146:0x031e, B:148:0x0326, B:151:0x0337, B:155:0x0358, B:284:0x058c, B:159:0x0377, B:161:0x037f, B:165:0x039c, B:167:0x03a2, B:169:0x03af, B:189:0x041a, B:191:0x0420, B:194:0x042f, B:196:0x0435, B:198:0x0442, B:216:0x048f, B:218:0x0497, B:238:0x04dd, B:240:0x04e5, B:266:0x052c, B:201:0x0453, B:202:0x0454, B:203:0x0458, B:204:0x045c, B:207:0x0466, B:210:0x046c, B:212:0x0472, B:214:0x047d, B:269:0x0539, B:270:0x053a, B:271:0x0540, B:172:0x03c5, B:173:0x03c6, B:174:0x03d4, B:177:0x03e0, B:181:0x03f7, B:183:0x03fd, B:185:0x0404, B:187:0x040a, B:276:0x0554, B:280:0x055e, B:279:0x055d, B:281:0x0564, B:291:0x05d2, B:294:0x05f4, B:328:0x065e, B:330:0x0666, B:349:0x06b0, B:337:0x067d, B:340:0x0687, B:344:0x0695, B:397:0x0756, B:347:0x06a0, B:348:0x06a8, B:354:0x06c1, B:384:0x072d, B:386:0x073b, B:388:0x0740, B:375:0x0711, B:76:0x01b1, B:78:0x01bd, B:79:0x01c3, B:82:0x01c8, B:84:0x01ce, B:86:0x01d9, B:88:0x01e6, B:89:0x01e7, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:62:0x0168, B:64:0x016f, B:72:0x01a0, B:68:0x0194, B:71:0x019f, B:401:0x077c, B:405:0x078f, B:408:0x0793, B:410:0x079d, B:412:0x07a7, B:414:0x07b5, B:417:0x07cf, B:420:0x07da), top: B:466:0x0010, inners: #2, #3, #7, #15 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:227:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:229:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:230:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:235:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:236:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e5 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:73:0x01a8, B:92:0x0204, B:95:0x0212, B:97:0x0218, B:99:0x0220, B:101:0x0228, B:103:0x0230, B:105:0x0238, B:107:0x0240, B:109:0x0246, B:111:0x024e, B:113:0x0256, B:115:0x025c, B:117:0x0262, B:119:0x0268, B:121:0x0270, B:124:0x0279, B:422:0x07df, B:126:0x02ab, B:128:0x02b1, B:130:0x02ba, B:132:0x02c9, B:134:0x02d4, B:136:0x02e8, B:138:0x02ee, B:286:0x0596, B:140:0x0307, B:142:0x030f, B:144:0x0315, B:146:0x031e, B:148:0x0326, B:151:0x0337, B:155:0x0358, B:284:0x058c, B:159:0x0377, B:161:0x037f, B:165:0x039c, B:167:0x03a2, B:169:0x03af, B:189:0x041a, B:191:0x0420, B:194:0x042f, B:196:0x0435, B:198:0x0442, B:216:0x048f, B:218:0x0497, B:238:0x04dd, B:240:0x04e5, B:266:0x052c, B:201:0x0453, B:202:0x0454, B:203:0x0458, B:204:0x045c, B:207:0x0466, B:210:0x046c, B:212:0x0472, B:214:0x047d, B:269:0x0539, B:270:0x053a, B:271:0x0540, B:172:0x03c5, B:173:0x03c6, B:174:0x03d4, B:177:0x03e0, B:181:0x03f7, B:183:0x03fd, B:185:0x0404, B:187:0x040a, B:276:0x0554, B:280:0x055e, B:279:0x055d, B:281:0x0564, B:291:0x05d2, B:294:0x05f4, B:328:0x065e, B:330:0x0666, B:349:0x06b0, B:337:0x067d, B:340:0x0687, B:344:0x0695, B:397:0x0756, B:347:0x06a0, B:348:0x06a8, B:354:0x06c1, B:384:0x072d, B:386:0x073b, B:388:0x0740, B:375:0x0711, B:76:0x01b1, B:78:0x01bd, B:79:0x01c3, B:82:0x01c8, B:84:0x01ce, B:86:0x01d9, B:88:0x01e6, B:89:0x01e7, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:62:0x0168, B:64:0x016f, B:72:0x01a0, B:68:0x0194, B:71:0x019f, B:401:0x077c, B:405:0x078f, B:408:0x0793, B:410:0x079d, B:412:0x07a7, B:414:0x07b5, B:417:0x07cf, B:420:0x07da), top: B:466:0x0010, inners: #2, #3, #7, #15 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:245:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x0506  */
    /* JADX WARN: Code duplicated, block: B:253:0x050e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0510  */
    /* JADX WARN: Code duplicated, block: B:256:0x0518  */
    /* JADX WARN: Code duplicated, block: B:257:0x051b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0524  */
    /* JADX WARN: Code duplicated, block: B:265:0x052a  */
    /* JADX WARN: Code duplicated, block: B:284:0x058c A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e7, B:33:0x00f5, B:35:0x00fc, B:37:0x0108, B:39:0x0113, B:73:0x01a8, B:92:0x0204, B:95:0x0212, B:97:0x0218, B:99:0x0220, B:101:0x0228, B:103:0x0230, B:105:0x0238, B:107:0x0240, B:109:0x0246, B:111:0x024e, B:113:0x0256, B:115:0x025c, B:117:0x0262, B:119:0x0268, B:121:0x0270, B:124:0x0279, B:422:0x07df, B:126:0x02ab, B:128:0x02b1, B:130:0x02ba, B:132:0x02c9, B:134:0x02d4, B:136:0x02e8, B:138:0x02ee, B:286:0x0596, B:140:0x0307, B:142:0x030f, B:144:0x0315, B:146:0x031e, B:148:0x0326, B:151:0x0337, B:155:0x0358, B:284:0x058c, B:159:0x0377, B:161:0x037f, B:165:0x039c, B:167:0x03a2, B:169:0x03af, B:189:0x041a, B:191:0x0420, B:194:0x042f, B:196:0x0435, B:198:0x0442, B:216:0x048f, B:218:0x0497, B:238:0x04dd, B:240:0x04e5, B:266:0x052c, B:201:0x0453, B:202:0x0454, B:203:0x0458, B:204:0x045c, B:207:0x0466, B:210:0x046c, B:212:0x0472, B:214:0x047d, B:269:0x0539, B:270:0x053a, B:271:0x0540, B:172:0x03c5, B:173:0x03c6, B:174:0x03d4, B:177:0x03e0, B:181:0x03f7, B:183:0x03fd, B:185:0x0404, B:187:0x040a, B:276:0x0554, B:280:0x055e, B:279:0x055d, B:281:0x0564, B:291:0x05d2, B:294:0x05f4, B:328:0x065e, B:330:0x0666, B:349:0x06b0, B:337:0x067d, B:340:0x0687, B:344:0x0695, B:397:0x0756, B:347:0x06a0, B:348:0x06a8, B:354:0x06c1, B:384:0x072d, B:386:0x073b, B:388:0x0740, B:375:0x0711, B:76:0x01b1, B:78:0x01bd, B:79:0x01c3, B:82:0x01c8, B:84:0x01ce, B:86:0x01d9, B:88:0x01e6, B:89:0x01e7, B:43:0x012c, B:46:0x013a, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:62:0x0168, B:64:0x016f, B:72:0x01a0, B:68:0x0194, B:71:0x019f, B:401:0x077c, B:405:0x078f, B:408:0x0793, B:410:0x079d, B:412:0x07a7, B:414:0x07b5, B:417:0x07cf, B:420:0x07da), top: B:466:0x0010, inners: #2, #3, #7, #15 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x0594  */
    /* JADX WARN: Code duplicated, block: B:289:0x05a6 A[LOOP:1: B:128:0x02b1->B:289:0x05a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:372:0x0702  */
    /* JADX WARN: Code duplicated, block: B:373:0x070b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:374:0x070d  */
    /* JADX WARN: Code duplicated, block: B:378:0x0717  */
    /* JADX WARN: Code duplicated, block: B:382:0x0722  */
    /* JADX WARN: Code duplicated, block: B:383:0x0727  */
    /* JADX WARN: Code duplicated, block: B:388:0x0740 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, o4 -> 0x0744, TRY_LEAVE, TryCatch #11 {o4 -> 0x0744, blocks: (B:386:0x073b, B:388:0x0740), top: B:454:0x073b }] */
    /* JADX WARN: Code duplicated, block: B:478:0x059c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final com.google.android.gms.internal.ads.InterfaceC4539n4 b(byte[] bArr, int i6, int i10) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashMap map;
        java.util.HashMap map2;
        ?? r10;
        java.util.ArrayDeque arrayDeque;
        java.util.HashMap map3;
        int i11;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r31;
        java.lang.String str4;
        java.util.HashMap map4;
        java.util.HashMap map5;
        java.util.HashMap map6;
        com.google.android.gms.internal.ads.S4 s6;
        com.google.android.gms.internal.ads.C4649o4 c4649o4;
        com.google.android.gms.internal.ads.Q4 q6;
        long j6;
        com.google.android.gms.internal.ads.Q4 q10;
        long j10;
        long j11;
        com.google.android.gms.internal.ads.Q4 q4B;
        long j12;
        java.lang.Object obj;
        byte b6;
        ?? r16;
        java.lang.String str5;
        ?? r17;
        java.lang.String str6;
        java.lang.String strConcat;
        ?? r18;
        com.google.android.gms.internal.ads.U4 u6;
        float f6;
        float f10;
        float f11;
        float f12;
        ?? r19;
        java.lang.String strA;
        float f13;
        int i12;
        java.lang.String strA2;
        int i13;
        java.lang.String strA3;
        int iHashCode;
        byte b10;
        java.lang.String strA4;
        int iHashCode2;
        byte b11;
        ?? r20;
        java.util.HashMap map7;
        java.lang.String str7;
        ?? r21;
        ?? r22;
        float f14;
        boolean z6;
        java.lang.String strConcat2;
        java.lang.String str8 = "Ignoring region with malformed extent: ";
        java.lang.String str9 = "Ignoring region with missing tts:extent: ";
        java.lang.String str10 = "Ignoring region with malformed origin: ";
        java.lang.String str11 = "id";
        java.lang.String str12 = "image";
        java.lang.String str13 = "http://www.w3.org/ns/ttml#parameter";
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.f31852a.newPullParser();
            java.util.HashMap map8 = new java.util.HashMap();
            java.util.HashMap map9 = new java.util.HashMap();
            java.util.HashMap map10 = new java.util.HashMap();
            map9.put("", new com.google.android.gms.internal.ads.U4("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i6, i10), null);
            java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            com.google.android.gms.internal.ads.R4 r6 = f31851i;
            com.google.android.gms.internal.ads.X4 x6 = null;
            com.google.android.gms.internal.ads.S4 s10 = null;
            int i14 = 15;
            int i15 = 0;
            int i16 = 1;
            ?? r23 = str8;
            while (eventType != i16) {
                com.google.android.gms.internal.ads.Q4 q11 = (com.google.android.gms.internal.ads.Q4) arrayDeque2.peek();
                com.google.android.gms.internal.ads.R4 r24 = r6;
                if (i15 == 0) {
                    java.lang.String name = xmlPullParserNewPullParser.getName();
                    java.util.ArrayDeque arrayDeque3 = arrayDeque2;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            java.lang.String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str13, "frameRate");
                            int i17 = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
                            map4 = map9;
                            java.lang.String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str13, "frameRateMultiplier");
                            ?? r32 = r23;
                            if (attributeValue2 != null) {
                                int i18 = com.google.android.gms.internal.ads.EW.f27061a;
                                java.lang.String[] strArrSplit = attributeValue2.split(" ", -1);
                                com.google.android.gms.internal.ads.LC.e(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f14 = java.lang.Integer.parseInt(strArrSplit[0]) / java.lang.Integer.parseInt(strArrSplit[1]);
                            } else {
                                f14 = 1.0f;
                            }
                            com.google.android.gms.internal.ads.R4 r25 = f31851i;
                            int i19 = r25.f31115b;
                            java.lang.String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str13, "subFrameRate");
                            int i20 = attributeValue3 != null ? java.lang.Integer.parseInt(attributeValue3) : i19;
                            int i21 = r25.f31116c;
                            java.lang.String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str13, "tickRate");
                            com.google.android.gms.internal.ads.R4 r26 = new com.google.android.gms.internal.ads.R4(i17 * f14, i20, attributeValue4 != null ? java.lang.Integer.parseInt(attributeValue4) : i21);
                            java.lang.String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str13, "cellResolution");
                            if (attributeValue5 == null) {
                                r24 = r26;
                                str4 = str11;
                                str3 = str13;
                                i14 = 15;
                            } else {
                                java.util.regex.Matcher matcher = f31850h.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        java.lang.String strGroup = matcher.group(1);
                                        if (strGroup == null) {
                                            throw null;
                                        }
                                        int i22 = java.lang.Integer.parseInt(strGroup);
                                        r24 = r26;
                                        try {
                                            java.lang.String strGroup2 = matcher.group(2);
                                            if (strGroup2 == null) {
                                                throw null;
                                            }
                                            int i23 = java.lang.Integer.parseInt(strGroup2);
                                            str3 = str13;
                                            if (i22 == 0) {
                                                z6 = false;
                                            } else if (i23 != 0) {
                                                z6 = true;
                                            } else {
                                                i23 = 0;
                                                z6 = false;
                                            }
                                            try {
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                str4 = str11;
                                                try {
                                                    sb.append("Invalid cell resolution ");
                                                    sb.append(i22);
                                                    sb.append(" ");
                                                    sb.append(i23);
                                                    com.google.android.gms.internal.ads.LC.e(z6, sb.toString());
                                                    i14 = i23;
                                                } catch (java.lang.NumberFormatException unused) {
                                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                    i14 = 15;
                                                }
                                            } catch (java.lang.NumberFormatException unused2) {
                                                str4 = str11;
                                            }
                                        } catch (java.lang.NumberFormatException unused3) {
                                            str4 = str11;
                                            str3 = str13;
                                        }
                                    } catch (java.lang.NumberFormatException unused4) {
                                        r24 = r26;
                                    }
                                    str4 = str11;
                                    str3 = str13;
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i14 = 15;
                                } else {
                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    r24 = r26;
                                    str4 = str11;
                                    str3 = str13;
                                    i14 = 15;
                                }
                            }
                            java.lang.String strA5 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "extent");
                            if (strA5 == null) {
                                s10 = null;
                                r31 = r32;
                            } else {
                                java.util.regex.Matcher matcher2 = f31849g.matcher(strA5);
                                if (matcher2.matches()) {
                                    try {
                                        java.lang.String strGroup3 = matcher2.group(1);
                                        if (strGroup3 != null) {
                                            int i24 = java.lang.Integer.parseInt(strGroup3);
                                            java.lang.String strGroup4 = matcher2.group(2);
                                            if (strGroup4 != null) {
                                                s10 = new com.google.android.gms.internal.ads.S4(i24, java.lang.Integer.parseInt(strGroup4));
                                                r31 = r32;
                                            }
                                        }
                                        throw null;
                                    } catch (java.lang.NumberFormatException unused5) {
                                        strConcat2 = "Ignoring malformed tts extent: ".concat(strA5);
                                        com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", strConcat2);
                                        s10 = null;
                                        r31 = r32;
                                    }
                                } else {
                                    strConcat2 = "Ignoring non-pixel tts extent: ".concat(strA5);
                                }
                                com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", strConcat2);
                                s10 = null;
                                r31 = r32;
                            }
                        } else {
                            map10 = map10;
                            r31 = r23;
                            str9 = str9;
                            str10 = str10;
                            str4 = str11;
                            str3 = str13;
                            map4 = map9;
                        }
                        com.google.android.gms.internal.ads.R4 r27 = r24;
                        com.google.android.gms.internal.ads.S4 s11 = s10;
                        i14 = i14;
                        java.lang.String str14 = "metadata";
                        java.lang.String strGroup5 = "region";
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals(str12) || name.equals("data") || name.equals("information")) {
                            ?? r33 = r31;
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, "style")) {
                                        java.lang.String strA6 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "style");
                                        com.google.android.gms.internal.ads.W4 w4F = f(xmlPullParserNewPullParser, new com.google.android.gms.internal.ads.W4());
                                        if (strA6 != null) {
                                            java.lang.String[] strArrG = g(strA6);
                                            int i25 = 0;
                                            for (int length = strArrG.length; i25 < length; length = length) {
                                                w4F.v((com.google.android.gms.internal.ads.W4) map8.get(strArrG[i25]));
                                                i25++;
                                            }
                                        }
                                        java.lang.String strE = w4F.e();
                                        if (strE != null) {
                                            map8.put(strE, w4F);
                                        }
                                    } else {
                                        r27 = r27;
                                        if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, strGroup5)) {
                                            java.util.HashMap map11 = map10;
                                            java.lang.String str15 = str4;
                                            java.lang.String strA7 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, str15);
                                            if (strA7 == null) {
                                                str = str15;
                                                str5 = str14;
                                                str2 = str12;
                                                map5 = map8;
                                                str6 = str10;
                                            } else {
                                                java.lang.String strA8 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "origin");
                                                if (strA8 != null) {
                                                    java.util.regex.Pattern pattern = f31848f;
                                                    str = str15;
                                                    java.util.regex.Matcher matcher3 = pattern.matcher(strA8);
                                                    str5 = str14;
                                                    java.util.regex.Pattern pattern2 = f31849g;
                                                    str2 = str12;
                                                    ?? Matcher = pattern2.matcher(strA8);
                                                    if (matcher3.matches()) {
                                                        map5 = map8;
                                                        try {
                                                            java.lang.String strGroup6 = matcher3.group(1);
                                                            if (strGroup6 != null) {
                                                                float f15 = java.lang.Float.parseFloat(strGroup6) / 100.0f;
                                                                java.lang.String strGroup7 = matcher3.group(2);
                                                                if (strGroup7 != null) {
                                                                    strGroup5 = strGroup5;
                                                                    f10 = f15;
                                                                    str9 = str9;
                                                                    f6 = java.lang.Float.parseFloat(strGroup7) / 100.0f;
                                                                    map6 = map11;
                                                                    str6 = str10;
                                                                }
                                                            }
                                                            throw null;
                                                        } catch (java.lang.NumberFormatException unused6) {
                                                            str6 = str10;
                                                            com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str6.concat(strA8));
                                                            u6 = null;
                                                            map6 = map11;
                                                            r20 = r33;
                                                        }
                                                    } else {
                                                        map5 = map8;
                                                        str6 = str10;
                                                        if (Matcher.matches()) {
                                                            if (s11 == null) {
                                                                str9 = str9;
                                                                com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", str9.concat(strA8));
                                                                strGroup5 = strGroup5;
                                                                map6 = map11;
                                                                r18 = r33;
                                                            } else {
                                                                str9 = str9;
                                                                map6 = map11;
                                                                try {
                                                                    strGroup5 = Matcher.group(1);
                                                                    try {
                                                                        if (strGroup5 == null) {
                                                                            throw null;
                                                                        }
                                                                        int i26 = java.lang.Integer.parseInt(strGroup5);
                                                                        strGroup5 = strGroup5;
                                                                        try {
                                                                            java.lang.String strGroup8 = Matcher.group(2);
                                                                            if (strGroup8 == null) {
                                                                                throw null;
                                                                            }
                                                                            int i27 = java.lang.Integer.parseInt(strGroup8);
                                                                            float f16 = i26 / s11.f31532a;
                                                                            f6 = i27 / s11.f31533b;
                                                                            f10 = f16;
                                                                        } catch (java.lang.NumberFormatException unused7) {
                                                                            Matcher = r33;
                                                                            strConcat = str6.concat(strA8);
                                                                            r17 = Matcher;
                                                                        }
                                                                    } catch (java.lang.NumberFormatException unused8) {
                                                                        strConcat = str6.concat(strA8);
                                                                        r17 = Matcher;
                                                                    }
                                                                } catch (java.lang.NumberFormatException unused9) {
                                                                    strGroup5 = strGroup5;
                                                                }
                                                                Matcher = r33;
                                                                strConcat = str6.concat(strA8);
                                                                r17 = Matcher;
                                                            }
                                                            u6 = null;
                                                            r20 = r18;
                                                            if (u6 != null) {
                                                                map = map4;
                                                                map.put(u6.f32098a, u6);
                                                                r21 = r20;
                                                            } else {
                                                                map = map4;
                                                                r21 = r20;
                                                            }
                                                        } else {
                                                            strGroup5 = strGroup5;
                                                            r17 = r33;
                                                            str9 = str9;
                                                            map6 = map11;
                                                            strConcat = "Ignoring region with unsupported origin: ".concat(strA8);
                                                        }
                                                    }
                                                    java.lang.String strA9 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "extent");
                                                    if (strA9 != null) {
                                                        java.util.regex.Matcher matcher4 = pattern.matcher(strA9);
                                                        java.util.regex.Matcher matcher5 = pattern2.matcher(strA9);
                                                        if (matcher4.matches()) {
                                                            try {
                                                                java.lang.String strGroup9 = matcher4.group(1);
                                                                if (strGroup9 != null) {
                                                                    float f17 = java.lang.Float.parseFloat(strGroup9) / 100.0f;
                                                                    java.lang.String strGroup10 = matcher4.group(2);
                                                                    if (strGroup10 != null) {
                                                                        f11 = java.lang.Float.parseFloat(strGroup10) / 100.0f;
                                                                        f12 = f17;
                                                                        r19 = r33;
                                                                        strA = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strA != null) {
                                                                            strA4 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(strA);
                                                                            iHashCode2 = strA4.hashCode();
                                                                            if (iHashCode2 != -1364013995) {
                                                                                if (iHashCode2 != 92734940 && strA4.equals("after")) {
                                                                                    b11 = 1;
                                                                                } else {
                                                                                    b11 = -1;
                                                                                }
                                                                            } else if (strA4.equals("center")) {
                                                                                b11 = 0;
                                                                            } else {
                                                                                b11 = -1;
                                                                            }
                                                                            if (b11 != 0) {
                                                                                f13 = f6 + (f11 / 2.0f);
                                                                                i12 = 1;
                                                                            } else if (b11 != 1) {
                                                                                f13 = f6;
                                                                                i12 = 0;
                                                                            } else {
                                                                                f13 = f6 + f11;
                                                                                i12 = 2;
                                                                            }
                                                                        } else {
                                                                            f13 = f6;
                                                                            i12 = 0;
                                                                        }
                                                                        float f18 = 1.0f / i14;
                                                                        strA2 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "writingMode");
                                                                        if (strA2 != null) {
                                                                            strA3 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(strA2);
                                                                            iHashCode = strA3.hashCode();
                                                                            if (iHashCode != 3694) {
                                                                                if (iHashCode != 3553396) {
                                                                                    if (iHashCode != 3553576 && strA3.equals("tbrl")) {
                                                                                        b10 = 2;
                                                                                    } else {
                                                                                        b10 = -1;
                                                                                    }
                                                                                } else if (strA3.equals("tblr")) {
                                                                                    b10 = 1;
                                                                                } else {
                                                                                    b10 = -1;
                                                                                }
                                                                            } else if (strA3.equals("tb")) {
                                                                                b10 = 0;
                                                                            } else {
                                                                                b10 = -1;
                                                                            }
                                                                            if (b10 != 0 || b10 == 1) {
                                                                                i13 = 2;
                                                                            } else if (b10 != 2) {
                                                                                i13 = Integer.MIN_VALUE;
                                                                            } else {
                                                                                i13 = 1;
                                                                            }
                                                                        } else {
                                                                            i13 = Integer.MIN_VALUE;
                                                                        }
                                                                        u6 = new com.google.android.gms.internal.ads.U4(strA7, f10, f13, 0, i12, f12, f11, 1, f18, i13);
                                                                        r20 = r19;
                                                                        if (u6 != null) {
                                                                            map = map4;
                                                                            map.put(u6.f32098a, u6);
                                                                            r21 = r20;
                                                                        } else {
                                                                            map = map4;
                                                                            r21 = r20;
                                                                        }
                                                                    }
                                                                }
                                                                throw null;
                                                            } catch (java.lang.NumberFormatException unused10) {
                                                                ?? r28 = r33;
                                                                strConcat = r28.concat(strA8);
                                                                r17 = r28;
                                                                com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", strConcat);
                                                                r18 = r17;
                                                                u6 = null;
                                                                r20 = r18;
                                                            }
                                                        } else {
                                                            ?? r29 = r33;
                                                            if (!matcher5.matches()) {
                                                                strConcat = "Ignoring region with unsupported extent: ".concat(strA8);
                                                                r17 = r29;
                                                            } else if (s11 == null) {
                                                                strConcat = str9.concat(strA8);
                                                                r17 = r29;
                                                            } else {
                                                                try {
                                                                    java.lang.String strGroup11 = matcher5.group(1);
                                                                    if (strGroup11 != null) {
                                                                        int i28 = java.lang.Integer.parseInt(strGroup11);
                                                                        java.lang.String strGroup12 = matcher5.group(2);
                                                                        if (strGroup12 != null) {
                                                                            int i29 = java.lang.Integer.parseInt(strGroup12);
                                                                            float f19 = i28 / s11.f31532a;
                                                                            f11 = i29 / s11.f31533b;
                                                                            f12 = f19;
                                                                            r19 = r29;
                                                                            strA = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "displayAlign");
                                                                            if (strA != null) {
                                                                                strA4 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(strA);
                                                                                iHashCode2 = strA4.hashCode();
                                                                                if (iHashCode2 != -1364013995) {
                                                                                    if (iHashCode2 != 92734940) {
                                                                                        b11 = -1;
                                                                                    } else {
                                                                                        b11 = 1;
                                                                                    }
                                                                                } else if (strA4.equals("center")) {
                                                                                    b11 = 0;
                                                                                } else {
                                                                                    b11 = -1;
                                                                                }
                                                                                if (b11 != 0) {
                                                                                    f13 = f6 + (f11 / 2.0f);
                                                                                    i12 = 1;
                                                                                } else if (b11 != 1) {
                                                                                    f13 = f6;
                                                                                    i12 = 0;
                                                                                } else {
                                                                                    f13 = f6 + f11;
                                                                                    i12 = 2;
                                                                                }
                                                                            } else {
                                                                                f13 = f6;
                                                                                i12 = 0;
                                                                            }
                                                                            float f110 = 1.0f / i14;
                                                                            strA2 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, "writingMode");
                                                                            if (strA2 != null) {
                                                                                strA3 = com.google.android.gms.internal.ads.AbstractC3723fg0.a(strA2);
                                                                                iHashCode = strA3.hashCode();
                                                                                if (iHashCode != 3694) {
                                                                                    if (iHashCode != 3553396) {
                                                                                        if (iHashCode != 3553576) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 2;
                                                                                        }
                                                                                    } else if (strA3.equals("tblr")) {
                                                                                        b10 = 1;
                                                                                    } else {
                                                                                        b10 = -1;
                                                                                    }
                                                                                } else if (strA3.equals("tb")) {
                                                                                    b10 = 0;
                                                                                } else {
                                                                                    b10 = -1;
                                                                                }
                                                                                if (b10 != 0) {
                                                                                    i13 = 2;
                                                                                } else {
                                                                                    i13 = 2;
                                                                                }
                                                                            } else {
                                                                                i13 = Integer.MIN_VALUE;
                                                                            }
                                                                            u6 = new com.google.android.gms.internal.ads.U4(strA7, f10, f13, 0, i12, f12, f11, 1, f110, i13);
                                                                            r20 = r19;
                                                                            if (u6 != null) {
                                                                                map = map4;
                                                                                map.put(u6.f32098a, u6);
                                                                                r21 = r20;
                                                                            } else {
                                                                                map = map4;
                                                                                r21 = r20;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw null;
                                                                } catch (java.lang.NumberFormatException unused11) {
                                                                    strConcat = r29.concat(strA8);
                                                                    r17 = r29;
                                                                    com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", strConcat);
                                                                    r18 = r17;
                                                                    u6 = null;
                                                                    r20 = r18;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        r17 = r33;
                                                        strConcat = "Ignoring region without an extent";
                                                    }
                                                } else {
                                                    str = str15;
                                                    str5 = str14;
                                                    strGroup5 = strGroup5;
                                                    str2 = str12;
                                                    map5 = map8;
                                                    r17 = r33;
                                                    str9 = str9;
                                                    str6 = str10;
                                                    map6 = map11;
                                                    strConcat = "Ignoring region without an origin";
                                                }
                                                com.google.android.gms.internal.ads.AbstractC3586eM.f("TtmlParser", strConcat);
                                                r18 = r17;
                                                u6 = null;
                                                r20 = r18;
                                                if (u6 != null) {
                                                    map = map4;
                                                    map.put(u6.f32098a, u6);
                                                    r21 = r20;
                                                } else {
                                                    map = map4;
                                                    r21 = r20;
                                                }
                                            }
                                            u6 = null;
                                            map6 = map11;
                                            r20 = r33;
                                            if (u6 != null) {
                                                map = map4;
                                                map.put(u6.f32098a, u6);
                                                r21 = r20;
                                            } else {
                                                map = map4;
                                                r21 = r20;
                                            }
                                        } else if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, str14)) {
                                            while (true) {
                                                xmlPullParserNewPullParser.next();
                                                if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, str12)) {
                                                    str7 = str4;
                                                    java.lang.String strA10 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, str7);
                                                    if (strA10 != null) {
                                                        map7 = map10;
                                                        map7.put(strA10, xmlPullParserNewPullParser.nextText());
                                                    } else {
                                                        map7 = map10;
                                                    }
                                                } else {
                                                    map7 = map10;
                                                    str7 = str4;
                                                }
                                                if (com.google.android.gms.internal.ads.AbstractC3707fX.b(xmlPullParserNewPullParser, str14)) {
                                                    str = str7;
                                                    str5 = str14;
                                                    strGroup5 = strGroup5;
                                                    str2 = str12;
                                                    map5 = map8;
                                                    map = map4;
                                                    r21 = r33;
                                                    str9 = str9;
                                                    str6 = str10;
                                                    map6 = map7;
                                                } else {
                                                    str4 = str7;
                                                    map10 = map7;
                                                }
                                            }
                                        }
                                        if (com.google.android.gms.internal.ads.AbstractC3707fX.b(xmlPullParserNewPullParser, "head")) {
                                            str10 = str6;
                                            s6 = s11;
                                            r6 = r27;
                                            arrayDeque = arrayDeque3;
                                            r16 = r21;
                                        } else {
                                            str14 = str5;
                                            str10 = str6;
                                            map4 = map;
                                            r33 = r21;
                                            r27 = r27;
                                            strGroup5 = strGroup5;
                                            str4 = str;
                                            str12 = str2;
                                            map10 = map6;
                                            str9 = str9;
                                            map8 = map5;
                                        }
                                    }
                                    str5 = str14;
                                    strGroup5 = strGroup5;
                                    str2 = str12;
                                    map5 = map8;
                                    map = map4;
                                    r21 = r33;
                                    str9 = str9;
                                    str6 = str10;
                                    map6 = map10;
                                    str = str4;
                                    if (com.google.android.gms.internal.ads.AbstractC3707fX.b(xmlPullParserNewPullParser, "head")) {
                                        str10 = str6;
                                        s6 = s11;
                                        r6 = r27;
                                        arrayDeque = arrayDeque3;
                                        r16 = r21;
                                    } else {
                                        str14 = str5;
                                        str10 = str6;
                                        map4 = map;
                                        r33 = r21;
                                        r27 = r27;
                                        strGroup5 = strGroup5;
                                        str4 = str;
                                        str12 = str2;
                                        map10 = map6;
                                        str9 = str9;
                                        map8 = map5;
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.ads.R4 r30 = r27;
                                java.lang.Object obj2 = "region";
                                str2 = str12;
                                map5 = map8;
                                map = map4;
                                ?? r34 = r31;
                                str9 = str9;
                                java.lang.String str16 = str10;
                                map6 = map10;
                                str = str4;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    com.google.android.gms.internal.ads.W4 w4F2 = f(xmlPullParserNewPullParser, null);
                                    java.lang.String str17 = "";
                                    int i30 = 0;
                                    long jC = -9223372036854775807L;
                                    long jC2 = -9223372036854775807L;
                                    long jC3 = -9223372036854775807L;
                                    java.lang.String[] strArr = null;
                                    java.lang.String strSubstring = null;
                                    while (i30 < attributeCount) {
                                        try {
                                            java.lang.String attributeName = xmlPullParserNewPullParser.getAttributeName(i30);
                                            java.lang.String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i30);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj2;
                                                    b6 = attributeName.equals(obj) ? (byte) 4 : (byte) -1;
                                                    break;
                                                case 99841:
                                                    if (attributeName.equals("dur")) {
                                                        obj = obj2;
                                                        b6 = 2;
                                                    } else {
                                                        obj = obj2;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (attributeName.equals("end")) {
                                                        obj = obj2;
                                                        b6 = 1;
                                                    } else {
                                                        obj = obj2;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (attributeName.equals("begin")) {
                                                        b6 = 0;
                                                        obj = obj2;
                                                    } else {
                                                        obj = obj2;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (attributeName.equals("style")) {
                                                        obj = obj2;
                                                        b6 = 3;
                                                    } else {
                                                        obj = obj2;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        obj = obj2;
                                                        b6 = 5;
                                                    } else {
                                                        obj = obj2;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj2;
                                                    break;
                                            }
                                            if (b6 == 0) {
                                                r6 = r30;
                                                jC2 = c(attributeValue6, r6);
                                            } else if (b6 == 1) {
                                                r6 = r30;
                                                jC = c(attributeValue6, r6);
                                            } else if (b6 != 2) {
                                                if (b6 == 3) {
                                                    java.lang.String[] strArrG2 = g(attributeValue6);
                                                    if (strArrG2.length > 0) {
                                                        strArr = strArrG2;
                                                    }
                                                } else if (b6 != 4) {
                                                    if (b6 == 5 && attributeValue6.startsWith("#")) {
                                                        strSubstring = attributeValue6.substring(1);
                                                    }
                                                } else if (map.containsKey(attributeValue6)) {
                                                    str17 = attributeValue6;
                                                }
                                                r6 = r30;
                                            } else {
                                                r6 = r30;
                                                jC3 = c(attributeValue6, r6);
                                            }
                                            try {
                                                i30++;
                                                obj2 = obj;
                                                r30 = r6;
                                            } catch (com.google.android.gms.internal.ads.C4649o4 e6) {
                                                e = e6;
                                                str10 = str16;
                                                s6 = s11;
                                                arrayDeque = arrayDeque3;
                                                c4649o4 = e;
                                                com.google.android.gms.internal.ads.AbstractC3586eM.g("TtmlParser", "Suppressing parser error", c4649o4);
                                                s10 = s6;
                                                map2 = map6;
                                                map3 = map5;
                                                r22 = r34;
                                                i11 = 1;
                                                i15 = 1;
                                                r14 = r22;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                i16 = i11;
                                                arrayDeque2 = arrayDeque;
                                                map10 = map2;
                                                map9 = map;
                                                r23 = r14;
                                                str10 = str10;
                                                str11 = str;
                                                str13 = str3;
                                                str12 = str2;
                                                java.lang.String str18 = str9;
                                                map8 = map3;
                                                str9 = str18;
                                            }
                                        } catch (com.google.android.gms.internal.ads.C4649o4 e10) {
                                            e = e10;
                                            r6 = r30;
                                        }
                                    }
                                    r6 = r30;
                                    try {
                                        try {
                                            if (q11 != null) {
                                                q6 = q11;
                                                long j13 = q6.f30877d;
                                                if (j13 != -9223372036854775807L) {
                                                    j6 = jC2 != -9223372036854775807L ? jC2 + j13 : -9223372036854775807L;
                                                    if (jC != -9223372036854775807L) {
                                                        jC += j13;
                                                        q10 = q6;
                                                    } else {
                                                        q10 = q6;
                                                        j10 = -9223372036854775807L;
                                                        jC = -9223372036854775807L;
                                                    }
                                                    if (jC == j10) {
                                                        str10 = str16;
                                                        s6 = s11;
                                                        j11 = jC;
                                                    } else if (jC3 != j10) {
                                                        str10 = str16;
                                                        s6 = s11;
                                                        j11 = j6 + jC3;
                                                    } else {
                                                        if (q10 != null) {
                                                            str10 = str16;
                                                            s6 = s11;
                                                            try {
                                                                j12 = q10.f30878e;
                                                                if (j12 != j10) {
                                                                    j11 = j12;
                                                                }
                                                            } catch (com.google.android.gms.internal.ads.C4649o4 e11) {
                                                                c4649o4 = e11;
                                                                arrayDeque = arrayDeque3;
                                                                com.google.android.gms.internal.ads.AbstractC3586eM.g("TtmlParser", "Suppressing parser error", c4649o4);
                                                                s10 = s6;
                                                                map2 = map6;
                                                                map3 = map5;
                                                                r22 = r34;
                                                                i11 = 1;
                                                                i15 = 1;
                                                                r14 = r22;
                                                            }
                                                        } else {
                                                            str10 = str16;
                                                            s6 = s11;
                                                        }
                                                        j11 = j10;
                                                    }
                                                    q4B = com.google.android.gms.internal.ads.Q4.b(xmlPullParserNewPullParser.getName(), j6, j11, w4F2, strArr, str17, strSubstring, q10);
                                                    arrayDeque = arrayDeque3;
                                                    arrayDeque.push(q4B);
                                                    r16 = r34;
                                                    if (q6 != null) {
                                                        q6.f(q4B);
                                                        r16 = r34;
                                                    }
                                                } else {
                                                    q10 = q6;
                                                    j6 = jC2;
                                                }
                                            } else {
                                                q6 = q11;
                                                j6 = jC2;
                                                q10 = null;
                                            }
                                            arrayDeque.push(q4B);
                                            r16 = r34;
                                            if (q6 != null) {
                                                q6.f(q4B);
                                                r16 = r34;
                                            }
                                        } catch (com.google.android.gms.internal.ads.C4649o4 e12) {
                                            e = e12;
                                            c4649o4 = e;
                                            com.google.android.gms.internal.ads.AbstractC3586eM.g("TtmlParser", "Suppressing parser error", c4649o4);
                                            s10 = s6;
                                            map2 = map6;
                                            map3 = map5;
                                            r22 = r34;
                                            i11 = 1;
                                            i15 = 1;
                                            r14 = r22;
                                        }
                                        q4B = com.google.android.gms.internal.ads.Q4.b(xmlPullParserNewPullParser.getName(), j6, j11, w4F2, strArr, str17, strSubstring, q10);
                                        arrayDeque = arrayDeque3;
                                    } catch (com.google.android.gms.internal.ads.C4649o4 e13) {
                                        e = e13;
                                        arrayDeque = arrayDeque3;
                                        c4649o4 = e;
                                        com.google.android.gms.internal.ads.AbstractC3586eM.g("TtmlParser", "Suppressing parser error", c4649o4);
                                        s10 = s6;
                                        map2 = map6;
                                        map3 = map5;
                                        r22 = r34;
                                        i11 = 1;
                                        i15 = 1;
                                        r14 = r22;
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        i16 = i11;
                                        arrayDeque2 = arrayDeque;
                                        map10 = map2;
                                        map9 = map;
                                        r23 = r14;
                                        str10 = str10;
                                        str11 = str;
                                        str13 = str3;
                                        str12 = str2;
                                        java.lang.String str19 = str9;
                                        map8 = map3;
                                        str9 = str19;
                                    }
                                    j10 = -9223372036854775807L;
                                    if (jC == j10) {
                                        str10 = str16;
                                        s6 = s11;
                                        j11 = jC;
                                    } else if (jC3 != j10) {
                                        str10 = str16;
                                        s6 = s11;
                                        j11 = j6 + jC3;
                                    } else {
                                        if (q10 != null) {
                                            str10 = str16;
                                            s6 = s11;
                                            j12 = q10.f30878e;
                                            if (j12 != j10) {
                                                j11 = j12;
                                            }
                                        } else {
                                            str10 = str16;
                                            s6 = s11;
                                        }
                                        j11 = j10;
                                    }
                                } catch (com.google.android.gms.internal.ads.C4649o4 e14) {
                                    e = e14;
                                    str10 = str16;
                                    s6 = s11;
                                    r6 = r30;
                                }
                            }
                            s10 = s6;
                            i14 = i14;
                            map2 = map6;
                            map3 = map5;
                            r15 = r16;
                        } else {
                            com.google.android.gms.internal.ads.AbstractC3586eM.e("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            r6 = r27;
                            s10 = s11;
                            str2 = str12;
                            map3 = map8;
                            arrayDeque = arrayDeque3;
                            map = map4;
                            r22 = r31;
                            str9 = str9;
                            map2 = map10;
                            str = str4;
                        }
                        i11 = 1;
                        i15 = 1;
                        r14 = r22;
                    } else {
                        java.util.HashMap map12 = map10;
                        str10 = str10;
                        str = str11;
                        str2 = str12;
                        str3 = str13;
                        java.util.HashMap map13 = map8;
                        map = map9;
                        arrayDeque = arrayDeque3;
                        ?? r35 = r23;
                        str9 = str9;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    com.google.android.gms.internal.ads.Q4 q12 = (com.google.android.gms.internal.ads.Q4) arrayDeque.peek();
                                    if (q12 == null) {
                                        throw null;
                                    }
                                    map2 = map12;
                                    map3 = map13;
                                    x6 = new com.google.android.gms.internal.ads.X4(q12, map3, map, map2);
                                } else {
                                    map2 = map12;
                                    map3 = map13;
                                }
                                arrayDeque.pop();
                                r6 = r24;
                                r15 = r35;
                            }
                            map2 = map12;
                            map3 = map13;
                            i11 = 1;
                            r12 = r35;
                        } else {
                            if (q11 == null) {
                                throw null;
                            }
                            q11.f(com.google.android.gms.internal.ads.Q4.c(xmlPullParserNewPullParser.getText()));
                            map2 = map12;
                            map3 = map13;
                            i11 = 1;
                            r12 = r35;
                        }
                        r12 = r10;
                        r11 = r12;
                        r6 = r24;
                        r14 = r11;
                    }
                    i11 = 1;
                    r13 = r15;
                    r14 = r13;
                } else {
                    str10 = str10;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    map = map9;
                    map2 = map10;
                    r10 = r23;
                    arrayDeque = arrayDeque2;
                    java.util.HashMap map14 = map8;
                    str9 = str9;
                    map3 = map14;
                    if (eventType == 2) {
                        i11 = 1;
                        i15++;
                        r6 = r24;
                        r13 = r10;
                        r14 = r13;
                    } else {
                        i11 = 1;
                        if (eventType == 3) {
                            r12 = r10;
                            i15--;
                            r11 = r10;
                        } else {
                            r12 = r10;
                            r11 = r12;
                        }
                        r6 = r24;
                        r14 = r11;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                i16 = i11;
                arrayDeque2 = arrayDeque;
                map10 = map2;
                map9 = map;
                r23 = r14;
                str10 = str10;
                str11 = str;
                str13 = str3;
                str12 = str2;
                java.lang.String str110 = str9;
                map8 = map3;
                str9 = str110;
            }
            if (x6 != null) {
                return x6;
            }
            throw null;
        } catch (java.io.IOException e15) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e15);
        } catch (org.xmlpull.v1.XmlPullParserException e16) {
            throw new java.lang.IllegalStateException("Unable to decode source", e16);
        }
    }
}
