.class public abstract Landroidx/sqlite/driver/bundled/BundledSQLiteConnectionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0099"
    }
    d2 = {
        "",
        "\u009a",
        "",
        "\u009b",
        "\u009c",
        "\u009d",
        "\u009e",
        "\u009f",
        "\u00a0",
        "\u00a1"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteConnectionKt;->nativeClose(J)V

    return-void
.end method

.method public static final synthetic b(JLjava/lang/String;)J
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/sqlite/driver/bundled/BundledSQLiteConnectionKt;->nativePrepare(JLjava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final native nativeClose(J)V
.end method

.method private static final native nativePrepare(JLjava/lang/String;)J
.end method
