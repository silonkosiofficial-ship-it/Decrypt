.class final LS/q1$G;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->V(Landroidx/compose/ui/d;LS/c;LS/o1;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/c;

.field final synthetic E:LS/o1;


# direct methods
.method constructor <init>(LS/c;LS/o1;)V
    .locals 0

    iput-object p1, p0, LS/q1$G;->D:LS/c;

    iput-object p2, p0, LS/q1$G;->E:LS/o1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, LS/q1$G;->D:LS/c;

    invoke-static {v1}, LS/q1;->X(LS/c;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/k;->e(J)F

    move-result v1

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v1

    iget-object v2, v0, LS/q1$G;->D:LS/c;

    invoke-static {v2}, LS/q1;->X(LS/c;)J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/k;->f(J)F

    move-result v2

    invoke-interface {v15, v2}, LY0/e;->B0(F)F

    move-result v2

    invoke-static {v1, v2}, Ln0/h;->a(FF)J

    move-result-wide v13

    sget-object v16, LU/E;->a:LU/E;

    invoke-virtual/range {v16 .. v16}, LU/E;->g()F

    move-result v1

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v12, v2

    div-float v17, v1, v12

    iget-object v1, v0, LS/q1$G;->E:LS/o1;

    invoke-virtual {v1}, LS/o1;->d()J

    move-result-wide v18

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v2

    sget-object v20, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual/range {v20 .. v20}, Lo0/f0$a;->a()I

    move-result v10

    const/16 v11, 0x38

    const/16 v21, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p1

    move/from16 v4, v17

    move-wide v5, v13

    move/from16 v22, v12

    move-object/from16 v12, v21

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    invoke-virtual/range {v20 .. v20}, Lo0/f0$a;->C()I

    move-result v10

    const/4 v12, 0x0

    move-wide/from16 v2, v18

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    invoke-virtual/range {v16 .. v16}, LU/E;->h()F

    move-result v1

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v8

    iget-object v1, v0, LS/q1$G;->D:LS/c;

    invoke-virtual {v1}, LS/c;->v()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v17

    iget-object v2, v0, LS/q1$G;->D:LS/c;

    invoke-virtual {v2}, LS/c;->v()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v17

    invoke-static {v1, v2}, Ln0/h;->a(FF)J

    move-result-wide v1

    invoke-static {v13, v14, v1, v2}, Ln0/g;->q(JJ)J

    move-result-wide v6

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/n;->b(J)J

    move-result-wide v4

    invoke-virtual/range {v20 .. v20}, Lo0/f0$a;->B()I

    move-result v21

    const/16 v23, 0xf0

    const/16 v24, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v1, p1

    move-wide/from16 v2, v18

    move-wide/from16 v25, v13

    move/from16 v13, v21

    move/from16 v14, v23

    move-object v0, v15

    move-object/from16 v15, v24

    invoke-static/range {v1 .. v15}, Lq0/f;->i(Lq0/g;JJJFILo0/R1;FLo0/z0;IILjava/lang/Object;)V

    invoke-virtual/range {v16 .. v16}, LU/E;->e()F

    move-result v1

    invoke-interface {v0, v1}, LY0/e;->B0(F)F

    move-result v1

    div-float v4, v1, v22

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/n;->b(J)J

    move-result-wide v5

    const/16 v11, 0x78

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p1

    move-wide/from16 v2, v18

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v1, v0, LS/q1$G;->E:LS/o1;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LS/o1;->a(Z)J

    move-result-wide v2

    invoke-virtual/range {v20 .. v20}, Lo0/f0$a;->k()I

    move-result v10

    const/16 v11, 0x38

    move-object/from16 v1, p1

    move/from16 v4, v17

    move-wide/from16 v5, v25

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, LS/q1$G;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
