.class final Landroidx/compose/foundation/c;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/s;
.implements LF0/i0;


# instance fields
.field private P:J

.field private Q:Lo0/n0;

.field private R:F

.field private S:Lo0/e2;

.field private T:J

.field private U:LY0/v;

.field private V:Lo0/L1;

.field private W:Lo0/e2;


# direct methods
.method private constructor <init>(JLo0/n0;FLo0/e2;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-wide p1, p0, Landroidx/compose/foundation/c;->P:J

    iput-object p3, p0, Landroidx/compose/foundation/c;->Q:Lo0/n0;

    iput p4, p0, Landroidx/compose/foundation/c;->R:F

    iput-object p5, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    sget-object p1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p1}, Ln0/m$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/c;->T:J

    return-void
.end method

.method public synthetic constructor <init>(JLo0/n0;FLo0/e2;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/c;-><init>(JLo0/n0;FLo0/e2;)V

    return-void
.end method

.method private final T1(Lq0/c;)V
    .locals 11

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->V1(Lq0/c;)Lo0/L1;

    move-result-object v10

    iget-wide v0, p0, Landroidx/compose/foundation/c;->P:J

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->g()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v2, p0, Landroidx/compose/foundation/c;->P:J

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, v10

    invoke-static/range {v0 .. v9}, Lo0/M1;->d(Lq0/g;Lo0/L1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_0
    iget-object v2, p0, Landroidx/compose/foundation/c;->Q:Lo0/n0;

    if-eqz v2, :cond_1

    iget v3, p0, Landroidx/compose/foundation/c;->R:F

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, v10

    invoke-static/range {v0 .. v8}, Lo0/M1;->b(Lq0/g;Lo0/L1;Lo0/n0;FLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final U1(Lq0/c;)V
    .locals 27

    .prologue
    move-object/from16 v0, p0

    iget-wide v1, v0, Landroidx/compose/foundation/c;->P:J

    sget-object v3, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v3}, Lo0/y0$a;->g()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lo0/y0;->o(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v3, v0, Landroidx/compose/foundation/c;->P:J

    const/16 v13, 0x7e

    const/4 v14, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v14}, Lq0/f;->m(Lq0/g;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_0
    iget-object v1, v0, Landroidx/compose/foundation/c;->Q:Lo0/n0;

    if-eqz v1, :cond_1

    iget v2, v0, Landroidx/compose/foundation/c;->R:F

    const/16 v25, 0x76

    const/16 v26, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v15, p1

    move-object/from16 v16, v1

    move/from16 v21, v2

    invoke-static/range {v15 .. v26}, Lq0/f;->l(Lq0/g;Lo0/n0;JJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final V1(Lq0/c;)Lo0/L1;
    .locals 5

    .prologue
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/compose/foundation/c;->T:J

    invoke-static {v1, v2, v3, v4}, Ln0/m;->f(JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/c;->U:LY0/v;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/c;->W:Lo0/e2;

    iget-object v2, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/c;->V:Lo0/L1;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/foundation/c$a;

    invoke-direct {v1, v0, p0, p1}, Landroidx/compose/foundation/c$a;-><init>(Ly7/O;Landroidx/compose/foundation/c;Lq0/c;)V

    invoke-static {p0, v1}, LF0/j0;->a(Landroidx/compose/ui/d$c;Lx7/a;)V

    :goto_0
    iget-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lo0/L1;

    iput-object v1, p0, Landroidx/compose/foundation/c;->V:Lo0/L1;

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/foundation/c;->T:J

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/c;->U:LY0/v;

    iget-object p1, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    iput-object p1, p0, Landroidx/compose/foundation/c;->W:Lo0/e2;

    iget-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, Lo0/L1;

    return-object p1
.end method


# virtual methods
.method public L0()V
    .locals 2

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/foundation/c;->T:J

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/c;->U:LY0/v;

    iput-object v0, p0, Landroidx/compose/foundation/c;->V:Lo0/L1;

    iput-object v0, p0, Landroidx/compose/foundation/c;->W:Lo0/e2;

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public final W1()Lo0/e2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    return-object v0
.end method

.method public final X1(Lo0/n0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c;->Q:Lo0/n0;

    return-void
.end method

.method public final Y1(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/c;->P:J

    return-void
.end method

.method public final b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/c;->R:F

    return-void
.end method

.method public final l0(Lo0/e2;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    return-void
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/c;->S:Lo0/e2;

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->U1(Lq0/c;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/foundation/c;->T1(Lq0/c;)V

    :goto_0
    invoke-interface {p1}, Lq0/c;->l1()V

    return-void
.end method
