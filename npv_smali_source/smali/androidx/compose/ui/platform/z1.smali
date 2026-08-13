.class public abstract synthetic Landroidx/compose/ui/platform/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/compose/ui/platform/A1;)F
    .locals 0

    const/high16 p0, 0x41800000    # 16.0f

    return p0
.end method

.method public static b(Landroidx/compose/ui/platform/A1;)F
    .locals 0

    const/high16 p0, 0x40000000    # 2.0f

    return p0
.end method

.method public static c(Landroidx/compose/ui/platform/A1;)F
    .locals 0

    const p0, 0x7f7fffff    # Float.MAX_VALUE

    return p0
.end method

.method public static d(Landroidx/compose/ui/platform/A1;)J
    .locals 2

    const/16 p0, 0x30

    int-to-float p0, p0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    invoke-static {v0, p0}, LY0/j;->b(FF)J

    move-result-wide v0

    return-wide v0
.end method
