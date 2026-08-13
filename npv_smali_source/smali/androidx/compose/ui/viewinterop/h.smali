.class final Landroidx/compose/ui/viewinterop/h;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lm0/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method


# virtual methods
.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->y(Z)V

    return-void
.end method
