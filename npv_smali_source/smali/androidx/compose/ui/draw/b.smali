.class public abstract Landroidx/compose/ui/draw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/l;)Ll0/c;
    .locals 2

    new-instance v0, Landroidx/compose/ui/draw/a;

    new-instance v1, Ll0/d;

    invoke-direct {v1}, Ll0/d;-><init>()V

    invoke-direct {v0, v1, p0}, Landroidx/compose/ui/draw/a;-><init>(Ll0/d;Lx7/l;)V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawBehindElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawBehindElement;-><init>(Lx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithCacheElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithCacheElement;-><init>(Lx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithContentElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithContentElement;-><init>(Lx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
