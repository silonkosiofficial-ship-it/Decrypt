.class public final LS0/Z$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS0/Z;->o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LS0/Z;


# direct methods
.method constructor <init>(LS0/Z;)V
    .locals 0

    iput-object p1, p0, LS0/Z$d;->a:LS0/Z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v0}, LS0/Z;->j(LS0/Z;)Landroid/view/inputmethod/BaseInputConnection;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public b(ZZZZZZ)V
    .locals 8

    iget-object v0, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v0}, LS0/Z;->k(LS0/Z;)LS0/e;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, LS0/e;->b(ZZZZZZ)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v0}, LS0/Z;->n(LS0/Z;)Lx7/l;

    move-result-object v0

    invoke-static {p1}, LS0/r;->j(I)LS0/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v0}, LS0/Z;->m(LS0/Z;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e(LS0/Q;)V
    .locals 3

    .prologue
    iget-object v0, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v0}, LS0/Z;->l(LS0/Z;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {v2}, LS0/Z;->l(LS0/Z;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, LS0/Z$d;->a:LS0/Z;

    invoke-static {p1}, LS0/Z;->l(LS0/Z;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
