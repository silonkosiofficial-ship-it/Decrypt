.class public abstract Landroidx/compose/ui/focus/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/FocusPropertiesElement;

    new-instance v1, Landroidx/compose/ui/focus/l$a;

    invoke-direct {v1, p1}, Landroidx/compose/ui/focus/l$a;-><init>(Lx7/l;)V

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/FocusPropertiesElement;-><init>(Lm0/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
