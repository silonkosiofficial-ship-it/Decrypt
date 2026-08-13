.class public abstract Lu/P;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/platform/A0;->j:Landroidx/compose/ui/platform/A0$a;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {p0, p1}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
