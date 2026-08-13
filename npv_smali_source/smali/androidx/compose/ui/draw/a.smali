.class final Landroidx/compose/ui/draw/a;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Ll0/c;
.implements LF0/i0;
.implements Ll0/b;


# instance fields
.field private final P:Ll0/d;

.field private Q:Z

.field private R:Landroidx/compose/ui/draw/f;

.field private S:Lx7/l;


# direct methods
.method public constructor <init>(Ll0/d;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/a;->P:Ll0/d;

    iput-object p2, p0, Landroidx/compose/ui/draw/a;->S:Lx7/l;

    invoke-virtual {p1, p0}, Ll0/d;->t(Ll0/b;)V

    new-instance p2, Landroidx/compose/ui/draw/a$a;

    invoke-direct {p2, p0}, Landroidx/compose/ui/draw/a$a;-><init>(Landroidx/compose/ui/draw/a;)V

    invoke-virtual {p1, p2}, Ll0/d;->F(Lx7/a;)V

    return-void
.end method

.method private final V1(Lq0/c;)Ll0/h;
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/draw/a;->Q:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->P:Ll0/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll0/d;->C(Ll0/h;)V

    invoke-virtual {v0, p1}, Ll0/d;->y(Lq0/c;)V

    new-instance p1, Landroidx/compose/ui/draw/a$b;

    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/draw/a$b;-><init>(Landroidx/compose/ui/draw/a;Ll0/d;)V

    invoke-static {p0, p1}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    invoke-virtual {v0}, Ll0/d;->f()Ll0/h;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/draw/a;->Q:Z

    goto :goto_0

    :cond_0
    const-string p1, "DrawResult not defined, did you forget to call onDraw?"

    invoke-static {p1}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/draw/a;->P:Ll0/d;

    invoke-virtual {p1}, Ll0/d;->f()Ll0/h;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public E1()V
    .locals 1

    .prologue
    invoke-super {p0}, Landroidx/compose/ui/d$c;->E1()V

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->R:Landroidx/compose/ui/draw/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->d()V

    :cond_0
    return-void
.end method

.method public L0()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->N()V

    return-void
.end method

.method public N()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->R:Landroidx/compose/ui/draw/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->d()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/draw/a;->Q:Z

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->P:Ll0/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll0/d;->C(Ll0/h;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public final T1()Lx7/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->S:Lx7/l;

    return-object v0
.end method

.method public final U1()Lo0/C1;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->R:Landroidx/compose/ui/draw/f;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/draw/f;

    invoke-direct {v0}, Landroidx/compose/ui/draw/f;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/draw/a;->R:Landroidx/compose/ui/draw/f;

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->c()Lo0/C1;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {p0}, LF0/k;->j(LF0/j;)Lo0/C1;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/draw/f;->e(Lo0/C1;)V

    :cond_1
    return-object v0
.end method

.method public final W1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draw/a;->S:Lx7/l;

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->N()V

    return-void
.end method

.method public getDensity()LY0/e;
    .locals 1

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    invoke-static {p0}, LF0/k;->l(LF0/j;)LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/u;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public m0()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->N()V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/compose/ui/draw/a;->V1(Lq0/c;)Ll0/h;

    move-result-object v0

    invoke-virtual {v0}, Ll0/h;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
