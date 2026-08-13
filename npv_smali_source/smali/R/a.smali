.class public final LR/a;
.super LR/o;
.source "SourceFile"

# interfaces
.implements LV/Z0;
.implements LR/k;


# instance fields
.field private final E:Z

.field private final F:F

.field private final G:LV/G1;

.field private final H:LV/G1;

.field private final I:Landroid/view/ViewGroup;

.field private J:LR/j;

.field private final K:LV/w0;

.field private final L:LV/w0;

.field private M:J

.field private N:I

.field private final O:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZFLV/G1;LV/G1;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0, p1, p4}, LR/o;-><init>(ZLV/G1;)V

    iput-boolean p1, p0, LR/a;->E:Z

    iput p2, p0, LR/a;->F:F

    iput-object p3, p0, LR/a;->G:LV/G1;

    iput-object p4, p0, LR/a;->H:LV/G1;

    iput-object p5, p0, LR/a;->I:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LR/a;->K:LV/w0;

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LR/a;->L:LV/w0;

    sget-object p1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p1}, Ln0/m$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LR/a;->M:J

    const/4 p1, -0x1

    iput p1, p0, LR/a;->N:I

    new-instance p1, LR/a$a;

    invoke-direct {p1, p0}, LR/a$a;-><init>(LR/a;)V

    iput-object p1, p0, LR/a;->O:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(ZFLV/G1;LV/G1;Landroid/view/ViewGroup;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LR/a;-><init>(ZFLV/G1;LV/G1;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static final synthetic i(LR/a;)Z
    .locals 0

    invoke-direct {p0}, LR/a;->l()Z

    move-result p0

    return p0
.end method

.method public static final synthetic j(LR/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, LR/a;->o(Z)V

    return-void
.end method

.method private final k()V
    .locals 1

    .prologue
    iget-object v0, p0, LR/a;->J:LR/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LR/j;->a(LR/k;)V

    :cond_0
    return-void
.end method

.method private final l()Z
    .locals 1

    iget-object v0, p0, LR/a;->L:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final m()LR/j;
    .locals 1

    .prologue
    iget-object v0, p0, LR/a;->J:LR/j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LR/a;->I:Landroid/view/ViewGroup;

    invoke-static {v0}, LR/t;->a(Landroid/view/ViewGroup;)LR/j;

    move-result-object v0

    iput-object v0, p0, LR/a;->J:LR/j;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final n()LR/n;
    .locals 1

    iget-object v0, p0, LR/a;->K:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/n;

    return-object v0
.end method

.method private final o(Z)V
    .locals 1

    iget-object v0, p0, LR/a;->L:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final p(LR/n;)V
    .locals 1

    iget-object v0, p0, LR/a;->K:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lq0/c;)V
    .locals 8

    .prologue
    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    iput-wide v0, p0, LR/a;->M:J

    iget v0, p0, LR/a;->F:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LR/a;->E:Z

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, LR/i;->a(LY0/e;ZJ)F

    move-result v0

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, LR/a;->F:F

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    :goto_0
    iput v0, p0, LR/a;->N:I

    iget-object v0, p0, LR/a;->G:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/y0;

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v4

    iget-object v0, p0, LR/a;->H:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/g;

    invoke-virtual {v0}, LR/g;->d()F

    move-result v6

    invoke-interface {p1}, Lq0/c;->l1()V

    iget v0, p0, LR/a;->F:F

    invoke-virtual {p0, p1, v0, v4, v5}, LR/o;->f(Lq0/g;FJ)V

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-direct {p0}, LR/a;->l()Z

    invoke-direct {p0}, LR/a;->n()LR/n;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v2

    move-object v1, v7

    invoke-virtual/range {v1 .. v6}, LR/n;->f(JJF)V

    invoke-static {v0}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v7, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, LR/a;->k()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, LR/a;->k()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lz/n$b;LW8/N;)V
    .locals 10

    invoke-direct {p0}, LR/a;->m()LR/j;

    move-result-object p2

    invoke-virtual {p2, p0}, LR/j;->b(LR/k;)LR/n;

    move-result-object p2

    iget-boolean v2, p0, LR/a;->E:Z

    iget-wide v3, p0, LR/a;->M:J

    iget v5, p0, LR/a;->N:I

    iget-object v0, p0, LR/a;->G:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/y0;

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v6

    iget-object v0, p0, LR/a;->H:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/g;

    invoke-virtual {v0}, LR/g;->d()F

    move-result v8

    iget-object v9, p0, LR/a;->O:Lx7/a;

    move-object v0, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v9}, LR/n;->b(Lz/n$b;ZJIJFLx7/a;)V

    invoke-direct {p0, p2}, LR/a;->p(LR/n;)V

    return-void
.end method

.method public g(Lz/n$b;)V
    .locals 0

    .prologue
    invoke-direct {p0}, LR/a;->n()LR/n;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LR/n;->e()V

    :cond_0
    return-void
.end method

.method public i0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LR/a;->p(LR/n;)V

    return-void
.end method
