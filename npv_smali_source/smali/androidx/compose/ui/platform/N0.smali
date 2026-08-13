.class final Landroidx/compose/ui/platform/N0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:LR0/q;

.field private d:LR0/o;

.field private e:LR0/p;

.field private f:LR0/h;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:LX0/a;

.field private j:LX0/p;

.field private k:LT0/h;

.field private l:J

.field private m:LX0/k;

.field private n:Lo0/c2;


# direct methods
.method private constructor <init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Landroidx/compose/ui/platform/N0;->a:J

    move-wide v1, p3

    iput-wide v1, v0, Landroidx/compose/ui/platform/N0;->b:J

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->c:LR0/q;

    move-object v1, p6

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->d:LR0/o;

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->e:LR0/p;

    move-object v1, p8

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->f:LR0/h;

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->g:Ljava/lang/String;

    move-wide v1, p10

    iput-wide v1, v0, Landroidx/compose/ui/platform/N0;->h:J

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->i:LX0/a;

    move-object/from16 v1, p13

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->j:LX0/p;

    move-object/from16 v1, p14

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->k:LT0/h;

    move-wide/from16 v1, p15

    iput-wide v1, v0, Landroidx/compose/ui/platform/N0;->l:J

    move-object/from16 v1, p17

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->m:LX0/k;

    move-object/from16 v1, p18

    iput-object v1, v0, Landroidx/compose/ui/platform/N0;->n:Lo0/c2;

    return-void
.end method

.method public synthetic constructor <init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;ILy7/k;)V
    .locals 19

    .prologue
    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->g()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    sget-object v3, LY0/x;->b:LY0/x$a;

    invoke-virtual {v3}, LY0/x$a;->a()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    sget-object v11, LY0/x;->b:LY0/x$a;

    invoke-virtual {v11}, LY0/x$a;->a()J

    move-result-wide v11

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    and-int/lit16 v6, v0, 0x800

    if-eqz v6, :cond_b

    sget-object v6, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v6}, Lo0/y0$a;->g()J

    move-result-wide v16

    goto :goto_b

    :cond_b
    move-wide/from16 v16, p15

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v6, p17

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v0, p18

    :goto_d
    const/16 v18, 0x0

    move-object/from16 p20, v18

    move-object/from16 p1, p0

    move-wide/from16 p2, v1

    move-wide/from16 p4, v3

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-wide/from16 p16, v16

    move-object/from16 p18, v6

    move-object/from16 p19, v0

    invoke-direct/range {p1 .. p20}, Landroidx/compose/ui/platform/N0;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p18}, Landroidx/compose/ui/platform/N0;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/N0;->l:J

    return-void
.end method

.method public final b(LX0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->i:LX0/a;

    return-void
.end method

.method public final c(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/N0;->a:J

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->g:Ljava/lang/String;

    return-void
.end method

.method public final e(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/N0;->b:J

    return-void
.end method

.method public final f(LR0/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->d:LR0/o;

    return-void
.end method

.method public final g(LR0/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->e:LR0/p;

    return-void
.end method

.method public final h(LR0/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->c:LR0/q;

    return-void
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/N0;->h:J

    return-void
.end method

.method public final j(Lo0/c2;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->n:Lo0/c2;

    return-void
.end method

.method public final k(LX0/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->m:LX0/k;

    return-void
.end method

.method public final l(LX0/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/N0;->j:LX0/p;

    return-void
.end method

.method public final m()LM0/C;
    .locals 28

    move-object/from16 v0, p0

    new-instance v24, LM0/C;

    move-object/from16 v1, v24

    iget-wide v2, v0, Landroidx/compose/ui/platform/N0;->a:J

    iget-wide v4, v0, Landroidx/compose/ui/platform/N0;->b:J

    iget-object v6, v0, Landroidx/compose/ui/platform/N0;->c:LR0/q;

    iget-object v7, v0, Landroidx/compose/ui/platform/N0;->d:LR0/o;

    iget-object v8, v0, Landroidx/compose/ui/platform/N0;->e:LR0/p;

    iget-object v9, v0, Landroidx/compose/ui/platform/N0;->f:LR0/h;

    iget-object v10, v0, Landroidx/compose/ui/platform/N0;->g:Ljava/lang/String;

    iget-wide v11, v0, Landroidx/compose/ui/platform/N0;->h:J

    iget-object v13, v0, Landroidx/compose/ui/platform/N0;->i:LX0/a;

    iget-object v14, v0, Landroidx/compose/ui/platform/N0;->j:LX0/p;

    iget-object v15, v0, Landroidx/compose/ui/platform/N0;->k:LT0/h;

    move-object/from16 v25, v1

    move-wide/from16 v26, v2

    iget-wide v1, v0, Landroidx/compose/ui/platform/N0;->l:J

    move-wide/from16 v16, v1

    iget-object v1, v0, Landroidx/compose/ui/platform/N0;->m:LX0/k;

    move-object/from16 v18, v1

    iget-object v1, v0, Landroidx/compose/ui/platform/N0;->n:Lo0/c2;

    move-object/from16 v19, v1

    const v22, 0xc000

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, v25

    move-wide/from16 v2, v26

    invoke-direct/range {v1 .. v23}, LM0/C;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;ILy7/k;)V

    return-object v24
.end method
