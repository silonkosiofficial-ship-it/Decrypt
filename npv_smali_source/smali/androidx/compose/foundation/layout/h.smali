.class public abstract Landroidx/compose/foundation/layout/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;LA/y;)Landroidx/compose/ui/d;
    .locals 3

    .prologue
    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/compose/foundation/layout/h$a;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/layout/h$a;-><init>(LA/y;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Landroidx/compose/foundation/layout/IntrinsicWidthElement;-><init>(LA/y;ZLx7/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
