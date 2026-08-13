.class final Landroidx/compose/foundation/layout/n$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/n;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/layout/n;

.field final synthetic E:LD0/X;

.field final synthetic F:LD0/M;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/n;LD0/X;LD0/M;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    iput-object p2, p0, Landroidx/compose/foundation/layout/n$a;->E:LD0/X;

    iput-object p3, p0, Landroidx/compose/foundation/layout/n$a;->F:LD0/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/n;->T1()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v3, v0, Landroidx/compose/foundation/layout/n$a;->E:LD0/X;

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->F:LD0/M;

    iget-object v2, v0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/n;->U1()F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v4

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->F:LD0/M;

    iget-object v2, v0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/n;->V1()F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v10, v0, Landroidx/compose/foundation/layout/n$a;->E:LD0/X;

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->F:LD0/M;

    iget-object v2, v0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/n;->U1()F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v11

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->F:LD0/M;

    iget-object v2, v0, Landroidx/compose/foundation/layout/n$a;->D:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/n;->V1()F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/n$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
