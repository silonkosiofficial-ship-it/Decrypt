.class Landroidx/fragment/app/g$a;
.super Landroidx/fragment/app/k;
.source "SourceFile"

# interfaces
.implements Landroidx/core/content/b;
.implements Landroidx/core/content/c;
.implements Landroidx/core/app/n;
.implements Landroidx/core/app/o;
.implements Landroidx/lifecycle/Y;
.implements Le/A;
.implements Lh/f;
.implements Lx2/f;
.implements LV1/k;
.implements Landroidx/core/view/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic H:Landroidx/fragment/app/g;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-direct {p0, p1}, Landroidx/fragment/app/k;-><init>(Landroidx/fragment/app/g;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/g$a;->B()V

    return-void
.end method

.method public B()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/j;->U()V

    return-void
.end method

.method public C()Landroidx/fragment/app/g;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    return-object v0
.end method

.method public a(Landroidx/fragment/app/n;Landroidx/fragment/app/f;)V
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/g;->n0(Landroidx/fragment/app/f;)V

    return-void
.end method

.method public b()Le/x;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/j;->b()Le/x;

    move-result-object v0

    return-object v0
.end method

.method public c(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->c(LB1/a;)V

    return-void
.end method

.method public d(Landroidx/core/view/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->d(Landroidx/core/view/z;)V

    return-void
.end method

.method public e(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->e(LB1/a;)V

    return-void
.end method

.method public f(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->f(LB1/a;)V

    return-void
.end method

.method public h(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public i(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->i(LB1/a;)V

    return-void
.end method

.method public j()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->l(LB1/a;)V

    return-void
.end method

.method public m()Lh/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/j;->m()Lh/e;

    move-result-object v0

    return-object v0
.end method

.method public n()Landroidx/lifecycle/X;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/j;->n()Landroidx/lifecycle/X;

    move-result-object v0

    return-object v0
.end method

.method public p()Lx2/d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Le/j;->p()Lx2/d;

    move-result-object v0

    return-object v0
.end method

.method public q(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->q(LB1/a;)V

    return-void
.end method

.method public s(Landroidx/core/view/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->s(Landroidx/core/view/z;)V

    return-void
.end method

.method public t(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->t(LB1/a;)V

    return-void
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    iget-object v0, v0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public v(LB1/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1}, Le/j;->v(LB1/a;)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/g;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic x()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/g$a;->C()Landroidx/fragment/app/g;

    move-result-object v0

    return-object v0
.end method

.method public y()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/g$a;->H:Landroidx/fragment/app/g;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method
