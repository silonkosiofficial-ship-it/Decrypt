.class public final LK/s0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK/k0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/s0;->g(Landroid/view/inputmethod/EditorInfo;)LK/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/s0;


# direct methods
.method constructor <init>(LK/s0;)V
    .locals 0

    iput-object p1, p0, LK/s0$b;->a:LK/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v0}, LK/s0;->b(LK/s0;)Landroid/view/inputmethod/BaseInputConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public b(ZZZZZZ)V
    .locals 8

    iget-object v0, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v0}, LK/s0;->c(LK/s0;)LK/p0;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, LK/p0;->b(ZZZZZZ)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v0}, LK/s0;->f(LK/s0;)Lx7/l;

    move-result-object v0

    invoke-static {p1}, LS0/r;->j(I)LS0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v0}, LK/s0;->e(LK/s0;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e(LK/w0;)V
    .locals 3

    .prologue
    iget-object v0, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v0}, LK/s0;->d(LK/s0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LK/s0$b;->a:LK/s0;

    invoke-static {v2}, LK/s0;->d(LK/s0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, LK/s0$b;->a:LK/s0;

    invoke-static {p1}, LK/s0;->d(LK/s0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
