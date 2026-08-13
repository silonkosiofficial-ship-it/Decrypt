.class public final LM0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM0/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/M;

    invoke-direct {v0}, LM0/M;-><init>()V

    sput-object v0, LM0/M;->a:LM0/M;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo0/q0;LM0/K;)V
    .locals 13

    .prologue
    invoke-virtual {p2}, LM0/K;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LM0/K;->l()LM0/J;

    move-result-object v0

    invoke-virtual {v0}, LM0/J;->f()I

    move-result v0

    sget-object v2, LX0/u;->a:LX0/u$a;

    invoke-virtual {v2}, LX0/u$a;->c()I

    move-result v2

    invoke-static {v0, v2}, LX0/u;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p2}, LM0/K;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, LM0/K;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    int-to-float v3, v3

    sget-object v4, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v4}, Ln0/g$a;->c()J

    move-result-wide v4

    invoke-static {v2, v3}, Ln0/n;->a(FF)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ln0/j;->b(JJ)Ln0/i;

    move-result-object v2

    invoke-interface {p1}, Lo0/q0;->m()V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v3, v4}, Lo0/p0;->e(Lo0/q0;Ln0/i;IILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, LM0/K;->l()LM0/J;

    move-result-object v1

    invoke-virtual {v1}, LM0/J;->i()LM0/P;

    move-result-object v1

    invoke-virtual {v1}, LM0/P;->y()LM0/C;

    move-result-object v1

    invoke-virtual {v1}, LM0/C;->s()LX0/k;

    move-result-object v2

    if-nez v2, :cond_2

    sget-object v2, LX0/k;->b:LX0/k$a;

    invoke-virtual {v2}, LX0/k$a;->c()LX0/k;

    move-result-object v2

    :cond_2
    move-object v8, v2

    invoke-virtual {v1}, LM0/C;->r()Lo0/c2;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {v2}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object v2

    :cond_3
    move-object v7, v2

    invoke-virtual {v1}, LM0/C;->h()Lq0/h;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, Lq0/l;->a:Lq0/l;

    :cond_4
    move-object v9, v2

    :try_start_0
    invoke-virtual {v1}, LM0/C;->f()Lo0/n0;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v1}, LM0/C;->t()LX0/o;

    move-result-object v2

    sget-object v3, LX0/o$b;->b:LX0/o$b;

    if-eq v2, v3, :cond_5

    invoke-virtual {v1}, LM0/C;->t()LX0/o;

    move-result-object v1

    invoke-interface {v1}, LX0/o;->a()F

    move-result v1

    :goto_1
    move v6, v1

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_6

    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :goto_2
    invoke-virtual {p2}, LM0/K;->w()LM0/j;

    move-result-object v3

    const/16 v11, 0x40

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LM0/j;->F(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, LM0/C;->t()LX0/o;

    move-result-object v2

    sget-object v3, LX0/o$b;->b:LX0/o$b;

    if-eq v2, v3, :cond_7

    invoke-virtual {v1}, LM0/C;->t()LX0/o;

    move-result-object v1

    invoke-interface {v1}, LX0/o;->c()J

    move-result-wide v1

    :goto_3
    move-wide v5, v1

    goto :goto_4

    :cond_7
    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v1

    goto :goto_3

    :goto_4
    invoke-virtual {p2}, LM0/K;->w()LM0/j;

    move-result-object v3

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LM0/j;->D(LM0/j;Lo0/q0;JLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_5
    if-eqz v0, :cond_8

    invoke-interface {p1}, Lo0/q0;->s()V

    :cond_8
    return-void

    :goto_6
    if-eqz v0, :cond_9

    invoke-interface {p1}, Lo0/q0;->s()V

    :cond_9
    throw p2
.end method
