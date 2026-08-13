.class public final Landroidx/compose/ui/platform/r$d;
.super Landroidx/core/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;->Y(Landroidx/compose/ui/viewinterop/c;LF0/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroidx/compose/ui/platform/r;

.field final synthetic e:LF0/J;

.field final synthetic f:Landroidx/compose/ui/platform/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/r;LF0/J;Landroidx/compose/ui/platform/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/r$d;->e:LF0/J;

    iput-object p3, p0, Landroidx/compose/ui/platform/r$d;->f:Landroidx/compose/ui/platform/r;

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;LC1/B;)V
    .locals 4

    .prologue
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;LC1/B;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-static {p1}, Landroidx/compose/ui/platform/r;->I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LC1/B;->Z0(Z)V

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/platform/r$d;->e:LF0/J;

    sget-object v0, Landroidx/compose/ui/platform/r$d$a;->D:Landroidx/compose/ui/platform/r$d$a;

    invoke-static {p1, v0}, LK0/p;->f(LF0/J;Lx7/l;)LF0/J;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LF0/J;->q0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v0, -0x1

    if-eqz p1, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LK0/q;

    move-result-object v1

    invoke-virtual {v1}, LK0/q;->a()LK0/o;

    move-result-object v1

    invoke-virtual {v1}, LK0/o;->o()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_3

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->f:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, v1, p1}, LC1/B;->I0(Landroid/view/View;I)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r$d;->e:LF0/J;

    invoke-virtual {p1}, LF0/J;->q0()I

    move-result p1

    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-static {v1}, Landroidx/compose/ui/platform/r;->I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/platform/x;->e0()Lr/A;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lr/k;->e(II)I

    move-result v1

    if-eq v1, v0, :cond_5

    iget-object v2, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/ui/platform/q1;->h(Landroidx/compose/ui/platform/f0;I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p2, v2}, LC1/B;->W0(Landroid/view/View;)V

    goto :goto_1

    :cond_4
    iget-object v2, p0, Landroidx/compose/ui/platform/r$d;->f:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2, v2, v1}, LC1/B;->X0(Landroid/view/View;I)V

    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2}, LC1/B;->a1()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-static {v3}, Landroidx/compose/ui/platform/r;->I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/platform/x;->c0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, p1, v2, v3}, Landroidx/compose/ui/platform/r;->E(Landroidx/compose/ui/platform/r;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-static {v1}, Landroidx/compose/ui/platform/r;->I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/platform/x;->d0()Lr/A;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lr/k;->e(II)I

    move-result v1

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/f0;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/q1;->h(Landroidx/compose/ui/platform/f0;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2, v0}, LC1/B;->U0(Landroid/view/View;)V

    goto :goto_2

    :cond_6
    iget-object v0, p0, Landroidx/compose/ui/platform/r$d;->f:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2, v0, v1}, LC1/B;->V0(Landroid/view/View;I)V

    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2}, LC1/B;->a1()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p2

    iget-object v1, p0, Landroidx/compose/ui/platform/r$d;->d:Landroidx/compose/ui/platform/r;

    invoke-static {v1}, Landroidx/compose/ui/platform/r;->I(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/platform/x;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Landroidx/compose/ui/platform/r;->E(Landroidx/compose/ui/platform/r;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    :cond_7
    return-void
.end method
