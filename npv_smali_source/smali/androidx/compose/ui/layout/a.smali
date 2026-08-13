.class public abstract Landroidx/compose/ui/layout/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LD0/G;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p0}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LD0/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LD0/w;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, LD0/w;->Q()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/LayoutIdElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/layout/LayoutIdElement;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
