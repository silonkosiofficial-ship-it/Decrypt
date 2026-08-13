.class public abstract Landroidx/compose/foundation/layout/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetPxElement;

    new-instance v1, Landroidx/compose/foundation/layout/k$a;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/k$a;-><init>(Lx7/l;)V

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Landroidx/compose/foundation/layout/OffsetPxElement;-><init>(Lx7/l;ZLx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
