.class public abstract LF0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/s;)V
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object p0

    invoke-virtual {p0}, LF0/d0;->y2()V

    :cond_0
    return-void
.end method
