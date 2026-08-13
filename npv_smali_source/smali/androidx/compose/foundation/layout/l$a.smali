.class final Landroidx/compose/foundation/layout/l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/l;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/layout/l;

.field final synthetic E:LD0/M;

.field final synthetic F:LD0/X;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/l;LD0/M;LD0/X;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/l$a;->D:Landroidx/compose/foundation/layout/l;

    iput-object p2, p0, Landroidx/compose/foundation/layout/l$a;->E:LD0/M;

    iput-object p3, p0, Landroidx/compose/foundation/layout/l$a;->F:LD0/X;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/l$a;->D:Landroidx/compose/foundation/layout/l;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/l;->T1()Lx7/l;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/foundation/layout/l$a;->E:LD0/M;

    invoke-interface {v1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/p;

    invoke-virtual {v1}, LY0/p;->n()J

    move-result-wide v1

    iget-object v3, v0, Landroidx/compose/foundation/layout/l$a;->D:Landroidx/compose/foundation/layout/l;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/l;->U1()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v5, v0, Landroidx/compose/foundation/layout/l$a;->F:LD0/X;

    invoke-static {v1, v2}, LY0/p;->h(J)I

    move-result v6

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v7

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v11}, LD0/X$a;->p(LD0/X$a;LD0/X;IIFLx7/l;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v13, v0, Landroidx/compose/foundation/layout/l$a;->F:LD0/X;

    invoke-static {v1, v2}, LY0/p;->h(J)I

    move-result v14

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v15

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v19}, LD0/X$a;->v(LD0/X$a;LD0/X;IIFLx7/l;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/l$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
