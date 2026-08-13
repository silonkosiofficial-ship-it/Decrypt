.class final LS/F0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/F0;->a(ZLx7/a;Landroidx/compose/ui/d;ZLS/D0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:LV/G1;


# direct methods
.method constructor <init>(LV/G1;LV/G1;)V
    .locals 0

    iput-object p1, p0, LS/F0$a;->D:LV/G1;

    iput-object p2, p0, LS/F0$a;->E:LV/G1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v13, p1

    invoke-static {}, LS/F0;->b()F

    move-result v1

    invoke-interface {v13, v1}, LY0/e;->B0(F)F

    move-result v3

    iget-object v1, v0, LS/F0$a;->D:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v10

    sget-object v1, LU/y;->a:LU/y;

    invoke-virtual {v1}, LU/y;->c()F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-interface {v13, v1}, LY0/e;->B0(F)F

    move-result v1

    div-float v14, v3, v2

    sub-float v12, v1, v14

    new-instance v15, Lq0/m;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v15

    invoke-direct/range {v2 .. v9}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    const/16 v16, 0x6c

    const/16 v17, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p1

    move-wide v2, v10

    move v4, v12

    move-object v8, v15

    move/from16 v10, v18

    move/from16 v11, v16

    move-object/from16 v12, v17

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    iget-object v1, v0, LS/F0$a;->E:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/i;

    invoke-virtual {v1}, LY0/i;->v()F

    move-result v1

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v1, v2}, LY0/i;->o(FF)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, v0, LS/F0$a;->D:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v2

    iget-object v1, v0, LS/F0$a;->E:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/i;

    invoke-virtual {v1}, LY0/i;->v()F

    move-result v1

    invoke-interface {v13, v1}, LY0/e;->B0(F)F

    move-result v1

    sub-float v4, v1, v14

    sget-object v8, Lq0/l;->a:Lq0/l;

    const/16 v11, 0x6c

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v12}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LS/F0$a;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
