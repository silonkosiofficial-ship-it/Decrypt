.class public final LR/b;
.super LR/q;
.source "SourceFile"

# interfaces
.implements LR/k;


# instance fields
.field private a0:LR/j;

.field private b0:LR/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lz/j;ZFLo0/B0;Lx7/a;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, LR/q;-><init>(Lz/j;ZFLo0/B0;Lx7/a;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Lz/j;ZFLo0/B0;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LR/b;-><init>(Lz/j;ZFLo0/B0;Lx7/a;)V

    return-void
.end method

.method private final h2()LR/j;
    .locals 1

    .prologue
    iget-object v0, p0, LR/b;->a0:LR/j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object v0

    invoke-static {p0, v0}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, LR/t;->b(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {v0}, LR/t;->a(Landroid/view/ViewGroup;)LR/j;

    move-result-object v0

    iput-object v0, p0, LR/b;->a0:LR/j;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final i2(LR/n;)V
    .locals 0

    iput-object p1, p0, LR/b;->b0:LR/n;

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method


# virtual methods
.method public E1()V
    .locals 1

    .prologue
    iget-object v0, p0, LR/b;->a0:LR/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LR/j;->a(LR/k;)V

    :cond_0
    return-void
.end method

.method public Y1(Lz/n$b;JF)V
    .locals 11

    invoke-direct {p0}, LR/b;->h2()LR/j;

    move-result-object v0

    invoke-virtual {v0, p0}, LR/j;->b(LR/k;)LR/n;

    move-result-object v0

    invoke-virtual {p0}, LR/q;->a2()Z

    move-result v3

    invoke-static {p4}, LA7/a;->d(F)I

    move-result v6

    invoke-virtual {p0}, LR/q;->c2()J

    move-result-wide v7

    invoke-virtual {p0}, LR/q;->b2()Lx7/a;

    move-result-object p4

    invoke-interface {p4}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LR/g;

    invoke-virtual {p4}, LR/g;->d()F

    move-result v9

    new-instance v10, LR/b$a;

    invoke-direct {v10, p0}, LR/b$a;-><init>(LR/b;)V

    move-object v1, v0

    move-object v2, p1

    move-wide v4, p2

    invoke-virtual/range {v1 .. v10}, LR/n;->b(Lz/n$b;ZJIJFLx7/a;)V

    invoke-direct {p0, v0}, LR/b;->i2(LR/n;)V

    return-void
.end method

.method public Z1(Lq0/g;)V
    .locals 7

    .prologue
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    iget-object v6, p0, LR/b;->b0:LR/n;

    if-eqz v6, :cond_0

    invoke-virtual {p0}, LR/q;->d2()J

    move-result-wide v1

    invoke-virtual {p0}, LR/q;->c2()J

    move-result-wide v3

    invoke-virtual {p0}, LR/q;->b2()Lx7/a;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/g;

    invoke-virtual {v0}, LR/g;->d()F

    move-result v5

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, LR/n;->f(JJF)V

    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v6, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public f2(Lz/n$b;)V
    .locals 0

    .prologue
    iget-object p1, p0, LR/b;->b0:LR/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LR/n;->e()V

    :cond_0
    return-void
.end method

.method public i0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LR/b;->i2(LR/n;)V

    return-void
.end method
