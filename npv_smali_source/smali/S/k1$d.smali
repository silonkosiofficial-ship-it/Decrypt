.class final LS/k1$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/k1;->j(Landroidx/compose/ui/d;LV/G1;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;


# direct methods
.method constructor <init>(LV/G1;)V
    .locals 0

    iput-object p1, p0, LS/k1$d;->D:LV/G1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    iget-object v1, v0, LS/k1$d;->D:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv/g;

    invoke-virtual {v1}, Lv/g;->b()F

    move-result v1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, LY0/e;->B0(F)F

    move-result v8

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float v3, v8, v3

    sub-float/2addr v1, v3

    iget-object v3, v0, LS/k1$d;->D:LV/G1;

    invoke-interface {v3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv/g;

    invoke-virtual {v3}, Lv/g;->a()Lo0/n0;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v1}, Ln0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ln0/m;->i(J)F

    move-result v6

    invoke-static {v6, v1}, Ln0/h;->a(FF)J

    move-result-wide v6

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lq0/f;->h(Lq0/g;Lo0/n0;JJFILo0/R1;FLo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, LS/k1$d;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
