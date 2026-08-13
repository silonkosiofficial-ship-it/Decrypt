.class public final Lu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo0/E1;

.field private b:Lo0/q0;

.field private c:LY0/e;

.field private d:LY0/v;

.field private e:J

.field private f:I

.field private final g:Lq0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LY0/v;->C:LY0/v;

    iput-object v0, p0, Lu0/a;->d:LY0/v;

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-virtual {v0}, LY0/t$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lu0/a;->e:J

    sget-object v0, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v0}, Lo0/F1$a;->b()I

    move-result v0

    iput v0, p0, Lu0/a;->f:I

    new-instance v0, Lq0/a;

    invoke-direct {v0}, Lq0/a;-><init>()V

    iput-object v0, p0, Lu0/a;->g:Lq0/a;

    return-void
.end method

.method private final a(Lq0/g;)V
    .locals 14

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->a()J

    move-result-wide v2

    sget-object v0, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v0}, Lo0/f0$a;->a()I

    move-result v11

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, Lq0/f;->m(Lq0/g;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(IJLY0/e;LY0/v;Lx7/l;)V
    .locals 14

    .prologue
    move-object v0, p0

    move v8, p1

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    iput-object v9, v0, Lu0/a;->c:LY0/e;

    iput-object v10, v0, Lu0/a;->d:LY0/v;

    iget-object v1, v0, Lu0/a;->a:Lo0/E1;

    iget-object v2, v0, Lu0/a;->b:Lo0/q0;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-static/range {p2 .. p3}, LY0/t;->g(J)I

    move-result v3

    invoke-interface {v1}, Lo0/E1;->getWidth()I

    move-result v4

    if-gt v3, v4, :cond_1

    invoke-static/range {p2 .. p3}, LY0/t;->f(J)I

    move-result v3

    invoke-interface {v1}, Lo0/E1;->getHeight()I

    move-result v4

    if-gt v3, v4, :cond_1

    iget v3, v0, Lu0/a;->f:I

    invoke-static {v3, p1}, Lo0/F1;->i(II)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-wide/from16 v3, p2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static/range {p2 .. p3}, LY0/t;->g(J)I

    move-result v1

    invoke-static/range {p2 .. p3}, LY0/t;->f(J)I

    move-result v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, p1

    invoke-static/range {v1 .. v7}, Lo0/G1;->b(IIIZLp0/c;ILjava/lang/Object;)Lo0/E1;

    move-result-object v1

    invoke-static {v1}, Lo0/s0;->a(Lo0/E1;)Lo0/q0;

    move-result-object v2

    iput-object v1, v0, Lu0/a;->a:Lo0/E1;

    iput-object v2, v0, Lu0/a;->b:Lo0/q0;

    iput v8, v0, Lu0/a;->f:I

    goto :goto_0

    :goto_2
    iput-wide v3, v0, Lu0/a;->e:J

    iget-object v5, v0, Lu0/a;->g:Lq0/a;

    invoke-static/range {p2 .. p3}, LY0/u;->d(J)J

    move-result-wide v3

    invoke-virtual {v5}, Lq0/a;->H()Lq0/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lq0/a$a;->a()LY0/e;

    move-result-object v7

    invoke-virtual {v6}, Lq0/a$a;->b()LY0/v;

    move-result-object v8

    invoke-virtual {v6}, Lq0/a$a;->c()Lo0/q0;

    move-result-object v11

    invoke-virtual {v6}, Lq0/a$a;->d()J

    move-result-wide v12

    invoke-virtual {v5}, Lq0/a;->H()Lq0/a$a;

    move-result-object v6

    invoke-virtual {v6, v9}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v6, v10}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v6, v2}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v6, v3, v4}, Lq0/a$a;->l(J)V

    invoke-interface {v2}, Lo0/q0;->m()V

    invoke-direct {p0, v5}, Lu0/a;->a(Lq0/g;)V

    move-object/from16 v3, p6

    invoke-interface {v3, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Lo0/q0;->s()V

    invoke-virtual {v5}, Lq0/a;->H()Lq0/a$a;

    move-result-object v2

    invoke-virtual {v2, v7}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v2, v8}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v2, v11}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v2, v12, v13}, Lq0/a$a;->l(J)V

    invoke-interface {v1}, Lo0/E1;->a()V

    return-void
.end method

.method public final c(Lq0/g;FLo0/z0;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget-object v2, v0, Lu0/a;->a:Lo0/E1;

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-wide v5, v0, Lu0/a;->e:J

    const/16 v16, 0x35a

    const/16 v17, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p1

    move/from16 v11, p2

    move-object/from16 v13, p3

    invoke-static/range {v1 .. v17}, Lq0/f;->f(Lq0/g;Lo0/E1;JJJJFLq0/h;Lo0/z0;IIILjava/lang/Object;)V

    return-void
.end method

.method public final d()Lo0/E1;
    .locals 1

    iget-object v0, p0, Lu0/a;->a:Lo0/E1;

    return-object v0
.end method
