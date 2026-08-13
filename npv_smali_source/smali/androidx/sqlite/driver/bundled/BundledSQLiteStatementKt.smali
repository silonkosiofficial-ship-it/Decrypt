.class public abstract Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00a8"
    }
    d2 = {
        "",
        "\u00a9",
        "",
        "\u00aa",
        "\u00ab",
        "\u00ac",
        "\u00ad",
        "\u00ae",
        "",
        "\u00af",
        "\u00b0",
        "",
        "\u00b1",
        "\u00b2",
        "\u00b3",
        "\u00b4",
        "\u00b5",
        "\u00b6",
        "\u00b7",
        "\u00b8",
        "\u00b9",
        "\u00ba",
        "\u00bb",
        "\u00bc",
        "\u00bd",
        "\u00be",
        "\u00bf"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(JIJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeBindLong(JIJ)V

    return-void
.end method

.method public static final synthetic b(JILjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeBindText(JILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic c(J)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeClose(J)V

    return-void
.end method

.method public static final synthetic d(J)I
    .locals 0

    invoke-static {p0, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeGetColumnCount(J)I

    move-result p0

    return p0
.end method

.method public static final synthetic e(JI)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeGetColumnName(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(JI)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeGetColumnType(JI)I

    move-result p0

    return p0
.end method

.method public static final synthetic g(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeGetLong(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic h(JI)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeGetText(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(J)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeReset(J)V

    return-void
.end method

.method public static final synthetic j(J)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteStatementKt;->nativeStep(J)Z

    move-result p0

    return p0
.end method

.method private static final native nativeBindLong(JIJ)V
.end method

.method private static final native nativeBindText(JILjava/lang/String;)V
.end method

.method private static final native nativeClose(J)V
.end method

.method private static final native nativeGetColumnCount(J)I
.end method

.method private static final native nativeGetColumnName(JI)Ljava/lang/String;
.end method

.method private static final native nativeGetColumnType(JI)I
.end method

.method private static final native nativeGetLong(JI)J
.end method

.method private static final native nativeGetText(JI)Ljava/lang/String;
.end method

.method private static final native nativeReset(J)V
.end method

.method private static final native nativeStep(J)Z
.end method
