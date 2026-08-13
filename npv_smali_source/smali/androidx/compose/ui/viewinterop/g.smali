.class final Landroidx/compose/ui/viewinterop/g;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lm0/j;
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private P:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    return-void
.end method

.method private final T1()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 11

    .prologue
    const/16 v0, 0x400

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "visitLocalDescendants called on an unattached node"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, v0

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    move-object v5, v1

    move-object v6, v4

    :goto_1
    if-eqz v5, :cond_9

    instance-of v7, v5, Landroidx/compose/ui/focus/FocusTargetNode;

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    check-cast v5, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v3, :cond_1

    return-object v5

    :cond_1
    move v3, v8

    goto :goto_4

    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v0

    if-eqz v7, :cond_8

    instance-of v7, v5, LF0/m;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, LF0/m;

    invoke-virtual {v7}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v7

    move v9, v2

    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v8, :cond_3

    move-object v5, v7

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, LX/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/d$c;

    invoke-direct {v6, v10, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v5, v4

    :cond_5
    invoke-virtual {v6, v7}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_2

    :cond_7
    if-ne v9, v8, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v6}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find focus target of embedded view wrapper"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public D1()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/d$c;->D1()V

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public E1()V
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/viewinterop/g;->P:Landroid/view/View;

    invoke-super {p0}, Landroidx/compose/ui/d$c;->E1()V

    return-void
.end method

.method public final U1(I)Landroidx/compose/ui/focus/n;
    .locals 4

    .prologue
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.View"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/View;

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, v2, v0}, Landroidx/compose/ui/viewinterop/f;->b(Lm0/i;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroidx/compose/ui/focus/f;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->a()Landroidx/compose/ui/focus/n;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    :goto_1
    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1
.end method

.method public final V1(I)Landroidx/compose/ui/focus/n;
    .locals 7

    .prologue
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.View"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/View;

    instance-of v3, v0, Landroid/view/ViewGroup;

    const-string v4, "host view did not take focus"

    if-nez v3, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/viewinterop/f;->b(Lm0/i;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {p1}, Landroidx/compose/ui/focus/f;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_3
    const/16 p1, 0x82

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v3

    iget-object v5, p0, Landroidx/compose/ui/viewinterop/g;->P:Landroid/view/View;

    if-eqz v5, :cond_4

    move-object v6, v2

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v3, v6, v5, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    goto :goto_1

    :cond_4
    move-object v5, v2

    check-cast v5, Landroid/view/ViewGroup;

    invoke-virtual {v3, v5, v1, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_5

    invoke-static {v0, v3}, Landroidx/compose/ui/viewinterop/f;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v3, p1, v1}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->a()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->y(Z)V

    new-instance v0, Landroidx/compose/ui/viewinterop/g$a;

    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/g$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->r(Lx7/l;)V

    new-instance v0, Landroidx/compose/ui/viewinterop/g$b;

    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/g$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->v(Lx7/l;)V

    return-void
.end method

.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 6

    .prologue
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->n0()LF0/o0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/d$c;)Landroid/view/View;

    move-result-object v0

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getFocusOwner()Lm0/i;

    move-result-object v1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v0, p1}, Landroidx/compose/ui/viewinterop/f;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    move p1, v3

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p2, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0, p2}, Landroidx/compose/ui/viewinterop/f;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v4

    :goto_1
    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    :cond_3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/g;->P:Landroid/view/View;

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_6

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/g;->P:Landroid/view/View;

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/g;->T1()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object p2

    invoke-virtual {p2}, Lm0/o;->e()Z

    move-result p2

    if-nez p2, :cond_7

    invoke-interface {v1}, Lm0/i;->g()Lm0/s;

    move-result-object p2

    :try_start_0
    invoke-static {p2}, Lm0/s;->e(Lm0/s;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, Lm0/s;->b(Lm0/s;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {p2}, Lm0/s;->a(Lm0/s;)V

    invoke-static {p1}, Landroidx/compose/ui/focus/r;->i(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, Lm0/s;->c(Lm0/s;)V

    goto :goto_4

    :goto_3
    invoke-static {p2}, Lm0/s;->c(Lm0/s;)V

    throw p1

    :cond_6
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/g;->P:Landroid/view/View;

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/g;->T1()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusTargetNode;->a2()Lm0/o;

    move-result-object p1

    invoke-virtual {p1}, Lm0/o;->g()Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result p1

    invoke-interface {v1, v4, v3, v4, p1}, Lm0/i;->e(ZZZI)Z

    :cond_7
    :goto_4
    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    return-void
.end method
