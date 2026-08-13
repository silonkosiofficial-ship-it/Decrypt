.class final LF0/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/compose/ui/d$c;

.field private b:I

.field private c:LX/b;

.field private d:LX/b;

.field private e:Z

.field final synthetic f:LF0/b0;


# direct methods
.method public constructor <init>(LF0/b0;Landroidx/compose/ui/d$c;ILX/b;LX/b;Z)V
    .locals 0

    iput-object p1, p0, LF0/b0$a;->f:LF0/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    iput p3, p0, LF0/b0$a;->b:I

    iput-object p4, p0, LF0/b0$a;->c:LX/b;

    iput-object p5, p0, LF0/b0$a;->d:LX/b;

    iput-boolean p6, p0, LF0/b0$a;->e:Z

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .prologue
    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p2, p0, LF0/b0$a;->f:LF0/b0;

    invoke-static {p2}, LF0/b0;->d(LF0/b0;)LF0/b0$b;

    const/4 p2, 0x2

    invoke-static {p2}, LF0/f0;->a(I)I

    move-result p2

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    and-int/2addr p2, v0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    invoke-virtual {p2}, LF0/d0;->o2()LF0/d0;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, LF0/d0;->S2(LF0/d0;)V

    :goto_0
    invoke-virtual {p2, v0}, LF0/d0;->T2(LF0/d0;)V

    iget-object v0, p0, LF0/b0$a;->f:LF0/b0;

    iget-object v1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-static {v0, v1, p2}, LF0/b0;->e(LF0/b0;Landroidx/compose/ui/d$c;LF0/d0;)V

    :cond_1
    iget-object p2, p0, LF0/b0$a;->f:LF0/b0;

    invoke-static {p2, p1}, LF0/b0;->b(LF0/b0;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p1

    iput-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    return-void
.end method

.method public b(II)Z
    .locals 2

    .prologue
    iget-object v0, p0, LF0/b0$a;->c:LX/b;

    iget v1, p0, LF0/b0$a;->b:I

    add-int/2addr v1, p1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    check-cast p1, Landroidx/compose/ui/d$b;

    iget-object v0, p0, LF0/b0$a;->d:LX/b;

    iget v1, p0, LF0/b0$a;->b:I

    add-int/2addr v1, p2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p2

    aget-object p2, p2, v1

    check-cast p2, Landroidx/compose/ui/d$b;

    invoke-static {p1, p2}, LF0/c0;->d(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(II)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object v0, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    iget-object v0, p0, LF0/b0$a;->c:LX/b;

    iget v1, p0, LF0/b0$a;->b:I

    add-int/2addr v1, p1

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    check-cast p1, Landroidx/compose/ui/d$b;

    iget-object v0, p0, LF0/b0$a;->d:LX/b;

    iget v1, p0, LF0/b0$a;->b:I

    add-int/2addr v1, p2

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p2

    aget-object p2, p2, v1

    check-cast p2, Landroidx/compose/ui/d$b;

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LF0/b0$a;->f:LF0/b0;

    iget-object v1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-static {v0, p1, p2, v1}, LF0/b0;->f(LF0/b0;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V

    :cond_0
    iget-object p1, p0, LF0/b0$a;->f:LF0/b0;

    invoke-static {p1}, LF0/b0;->d(LF0/b0;)LF0/b0$b;

    return-void
.end method

.method public d(I)V
    .locals 3

    .prologue
    iget v0, p0, LF0/b0$a;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    iget-object v1, p0, LF0/b0$a;->f:LF0/b0;

    iget-object v2, p0, LF0/b0$a;->d:LX/b;

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    aget-object v0, v2, v0

    check-cast v0, Landroidx/compose/ui/d$b;

    invoke-static {v1, v0, p1}, LF0/b0;->a(LF0/b0;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;

    move-result-object p1

    iput-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    iget-object p1, p0, LF0/b0$a;->f:LF0/b0;

    invoke-static {p1}, LF0/b0;->d(LF0/b0;)LF0/b0$b;

    iget-boolean p1, p0, LF0/b0$a;->e:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-static {v0}, LF0/k;->d(Landroidx/compose/ui/d$c;)LF0/E;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LF0/F;

    iget-object v2, p0, LF0/b0$a;->f:LF0/b0;

    invoke-virtual {v2}, LF0/b0;->m()LF0/J;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LF0/F;-><init>(LF0/J;LF0/E;)V

    iget-object v0, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    iget-object v0, p0, LF0/b0$a;->f:LF0/b0;

    iget-object v2, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-static {v0, v2, v1}, LF0/b0;->e(LF0/b0;Landroidx/compose/ui/d$c;LF0/d0;)V

    invoke-virtual {p1}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    invoke-virtual {v1, v0}, LF0/d0;->T2(LF0/d0;)V

    invoke-virtual {v1, p1}, LF0/d0;->S2(LF0/d0;)V

    invoke-virtual {p1, v1}, LF0/d0;->T2(LF0/d0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/d$c;->S1(LF0/d0;)V

    :goto_0
    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->B1()V

    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->H1()V

    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    invoke-static {p1}, LF0/g0;->a(Landroidx/compose/ui/d$c;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/compose/ui/d$c;->M1(Z)V

    :goto_1
    return-void
.end method

.method public final e(LX/b;)V
    .locals 0

    iput-object p1, p0, LF0/b0$a;->d:LX/b;

    return-void
.end method

.method public final f(LX/b;)V
    .locals 0

    iput-object p1, p0, LF0/b0$a;->c:LX/b;

    return-void
.end method

.method public final g(Landroidx/compose/ui/d$c;)V
    .locals 0

    iput-object p1, p0, LF0/b0$a;->a:Landroidx/compose/ui/d$c;

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, LF0/b0$a;->b:I

    return-void
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, LF0/b0$a;->e:Z

    return-void
.end method
