.class public abstract Lt0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo0/N1;

.field private b:Z

.field private c:Lo0/z0;

.field private d:F

.field private e:LY0/v;

.field private final f:Lx7/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lt0/b;->d:F

    sget-object v0, LY0/v;->C:LY0/v;

    iput-object v0, p0, Lt0/b;->e:LY0/v;

    new-instance v0, Lt0/b$a;

    invoke-direct {v0, p0}, Lt0/b$a;-><init>(Lt0/b;)V

    iput-object v0, p0, Lt0/b;->f:Lx7/l;

    return-void
.end method

.method private final d(F)V
    .locals 1

    .prologue
    iget v0, p0, Lt0/b;->d:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p0, p1}, Lt0/b;->a(F)Z

    move-result v0

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lt0/b;->a:Lo0/N1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lo0/N1;->b(F)V

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lt0/b;->b:Z

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lt0/b;->i()Lo0/N1;

    move-result-object v0

    invoke-interface {v0, p1}, Lo0/N1;->b(F)V

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    iput p1, p0, Lt0/b;->d:F

    :goto_3
    return-void
.end method

.method private final e(Lo0/z0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lt0/b;->c:Lo0/z0;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lt0/b;->b(Lo0/z0;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_1

    iget-object v0, p0, Lt0/b;->a:Lo0/N1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo0/N1;->A(Lo0/z0;)V

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lt0/b;->b:Z

    goto :goto_2

    :cond_1
    invoke-direct {p0}, Lt0/b;->i()Lo0/N1;

    move-result-object v0

    invoke-interface {v0, p1}, Lo0/N1;->A(Lo0/z0;)V

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    iput-object p1, p0, Lt0/b;->c:Lo0/z0;

    :cond_3
    return-void
.end method

.method private final f(LY0/v;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lt0/b;->e:LY0/v;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Lt0/b;->c(LY0/v;)Z

    iput-object p1, p0, Lt0/b;->e:LY0/v;

    :cond_0
    return-void
.end method

.method private final i()Lo0/N1;
    .locals 1

    .prologue
    iget-object v0, p0, Lt0/b;->a:Lo0/N1;

    if-nez v0, :cond_0

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v0

    iput-object v0, p0, Lt0/b;->a:Lo0/N1;

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected abstract a(F)Z
.end method

.method protected abstract b(Lo0/z0;)Z
.end method

.method protected c(LY0/v;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lq0/g;JFLo0/z0;)V
    .locals 4

    .prologue
    invoke-direct {p0, p4}, Lt0/b;->d(F)V

    invoke-direct {p0, p5}, Lt0/b;->e(Lo0/z0;)V

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object p5

    invoke-direct {p0, p5}, Lt0/b;->f(LY0/v;)V

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result p5

    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result v0

    sub-float/2addr p5, v0

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->g(J)F

    move-result v0

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v1

    invoke-interface {v1}, Lq0/d;->c()Lq0/j;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2, v2, p5, v0}, Lq0/j;->f(FFFF)V

    cmpl-float p4, p4, v2

    const/high16 v1, -0x80000000

    if-lez p4, :cond_1

    :try_start_0
    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_1

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_1

    iget-boolean p4, p0, Lt0/b;->b:Z

    if-eqz p4, :cond_0

    sget-object p4, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p4}, Ln0/g$a;->c()J

    move-result-wide v2

    invoke-static {p2, p3}, Ln0/m;->i(J)F

    move-result p4

    invoke-static {p2, p3}, Ln0/m;->g(J)F

    move-result p2

    invoke-static {p4, p2}, Ln0/n;->a(FF)J

    move-result-wide p2

    invoke-static {v2, v3, p2, p3}, Ln0/j;->b(JJ)Ln0/i;

    move-result-object p2

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p3

    invoke-interface {p3}, Lq0/d;->h()Lo0/q0;

    move-result-object p3

    invoke-direct {p0}, Lt0/b;->i()Lo0/N1;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p3, p2, p4}, Lo0/q0;->u(Ln0/i;Lo0/N1;)V

    invoke-virtual {p0, p1}, Lt0/b;->j(Lq0/g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p3}, Lo0/q0;->s()V

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-interface {p3}, Lo0/q0;->s()V

    throw p2

    :cond_0
    invoke-virtual {p0, p1}, Lt0/b;->j(Lq0/g;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->c()Lq0/j;

    move-result-object p1

    neg-float p3, p5

    neg-float p4, v0

    invoke-interface {p1, v1, v1, p3, p4}, Lq0/j;->f(FFFF)V

    throw p2

    :cond_1
    :goto_1
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->c()Lq0/j;

    move-result-object p1

    neg-float p2, p5

    neg-float p3, v0

    invoke-interface {p1, v1, v1, p2, p3}, Lq0/j;->f(FFFF)V

    return-void
.end method

.method public abstract h()J
.end method

.method protected abstract j(Lq0/g;)V
.end method
