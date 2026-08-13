.class final Landroidx/compose/foundation/layout/s$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/s;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/layout/s;

.field final synthetic E:I

.field final synthetic F:LD0/X;

.field final synthetic G:I

.field final synthetic H:LD0/M;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/s;ILD0/X;ILD0/M;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/s$a;->D:Landroidx/compose/foundation/layout/s;

    iput p2, p0, Landroidx/compose/foundation/layout/s$a;->E:I

    iput-object p3, p0, Landroidx/compose/foundation/layout/s$a;->F:LD0/X;

    iput p4, p0, Landroidx/compose/foundation/layout/s$a;->G:I

    iput-object p5, p0, Landroidx/compose/foundation/layout/s$a;->H:LD0/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/foundation/layout/s$a;->D:Landroidx/compose/foundation/layout/s;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/s;->T1()Lx7/p;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/layout/s$a;->E:I

    iget-object v2, p0, Landroidx/compose/foundation/layout/s$a;->F:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Landroidx/compose/foundation/layout/s$a;->G:I

    iget-object v3, p0, Landroidx/compose/foundation/layout/s$a;->F:LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, LY0/u;->a(II)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/layout/s$a;->H:LD0/M;

    invoke-interface {v2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/p;

    invoke-virtual {v0}, LY0/p;->n()J

    move-result-wide v3

    iget-object v2, p0, Landroidx/compose/foundation/layout/s$a;->F:LD0/X;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/s$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
