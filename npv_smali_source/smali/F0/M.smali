.class public abstract LF0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LF0/j;)Landroidx/compose/ui/d$c;
    .locals 0

    invoke-static {p0}, LF0/M;->b(LF0/j;)Landroidx/compose/ui/d$c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LF0/j;)Landroidx/compose/ui/d$c;
    .locals 4

    .prologue
    const/4 v0, 0x4

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    const/4 v2, 0x0

    if-nez p0, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v3

    and-int/2addr v3, v0

    if-nez v3, :cond_1

    return-object v2

    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_3

    return-object p0

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_0

    :cond_4
    return-object v2
.end method
