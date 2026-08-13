.class public abstract Lm0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;
    .locals 0

    invoke-static {p0}, Lm0/r;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;
    .locals 0

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LF0/J;->n0()LF0/o0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lm0/i;->g()Lm0/s;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v0

    invoke-interface {v0, p0}, Lm0/i;->a(Landroidx/compose/ui/focus/FocusTargetNode;)V

    return-void
.end method

.method public static final d(Landroidx/compose/ui/focus/FocusTargetNode;)Lm0/s;
    .locals 0

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object p0

    invoke-interface {p0}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object p0

    invoke-interface {p0}, Lm0/i;->g()Lm0/s;

    move-result-object p0

    return-object p0
.end method
