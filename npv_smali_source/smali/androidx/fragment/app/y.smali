.class Landroidx/fragment/app/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;
.implements Lx2/f;
.implements Landroidx/lifecycle/Y;


# instance fields
.field private final C:Landroidx/fragment/app/f;

.field private final D:Landroidx/lifecycle/X;

.field private E:Landroidx/lifecycle/V$c;

.field private F:Landroidx/lifecycle/t;

.field private G:Lx2/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f;Landroidx/lifecycle/X;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    iput-object v0, p0, Landroidx/fragment/app/y;->G:Lx2/e;

    iput-object p1, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    iput-object p2, p0, Landroidx/fragment/app/y;->D:Landroidx/lifecycle/X;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/k$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method c()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    invoke-static {p0}, Lx2/e;->a(Lx2/f;)Lx2/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/y;->G:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->c()V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/y;->G:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method f(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/y;->G:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method g(Landroidx/lifecycle/k$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->n(Landroidx/lifecycle/k$b;)V

    return-void
.end method

.method public j()Landroidx/lifecycle/V$c;
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->j()Landroidx/lifecycle/V$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->y0:Landroidx/lifecycle/V$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Landroidx/fragment/app/y;->E:Landroidx/lifecycle/V$c;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/y;->E:Landroidx/lifecycle/V$c;

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Landroidx/lifecycle/O;

    iget-object v2, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v2}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Landroidx/lifecycle/O;-><init>(Landroid/app/Application;Lx2/f;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/y;->E:Landroidx/lifecycle/V$c;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/y;->E:Landroidx/lifecycle/V$c;

    return-object v0
.end method

.method public k()Lc2/a;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Lc2/d;

    invoke-direct {v1}, Lc2/d;-><init>()V

    if-eqz v0, :cond_2

    sget-object v2, Landroidx/lifecycle/V$a;->g:Lc2/a$b;

    invoke-virtual {v1, v2, v0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Landroidx/lifecycle/L;->a:Lc2/a$b;

    iget-object v2, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v1, v0, v2}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/L;->b:Lc2/a$b;

    invoke-virtual {v1, v0, p0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/lifecycle/L;->c:Lc2/a$b;

    iget-object v2, p0, Landroidx/fragment/app/y;->C:Landroidx/fragment/app/f;

    invoke-virtual {v2}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method public n()Landroidx/lifecycle/X;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->c()V

    iget-object v0, p0, Landroidx/fragment/app/y;->D:Landroidx/lifecycle/X;

    return-object v0
.end method

.method public p()Lx2/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->c()V

    iget-object v0, p0, Landroidx/fragment/app/y;->G:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->b()Lx2/d;

    move-result-object v0

    return-object v0
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->c()V

    iget-object v0, p0, Landroidx/fragment/app/y;->F:Landroidx/lifecycle/t;

    return-object v0
.end method
