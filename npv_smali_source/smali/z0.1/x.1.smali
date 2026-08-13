.class public abstract Lz0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lz0/w;Z)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;-><init>(Lz0/w;Z)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/d;Lz0/w;ZILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lz0/x;->a(Landroidx/compose/ui/d;Lz0/w;Z)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
