.class final Landroidx/compose/foundation/layout/o$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/o;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:LD0/M;

.field final synthetic F:Landroidx/compose/foundation/layout/o;


# direct methods
.method constructor <init>(LD0/X;LD0/M;Landroidx/compose/foundation/layout/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/o$a;->D:LD0/X;

    iput-object p2, p0, Landroidx/compose/foundation/layout/o$a;->E:LD0/M;

    iput-object p3, p0, Landroidx/compose/foundation/layout/o$a;->F:Landroidx/compose/foundation/layout/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/o$a;->D:LD0/X;

    iget-object v0, p0, Landroidx/compose/foundation/layout/o$a;->E:LD0/M;

    iget-object v2, p0, Landroidx/compose/foundation/layout/o$a;->F:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/o;->T1()LA/B;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/foundation/layout/o$a;->E:LD0/M;

    invoke-interface {v3}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-interface {v2, v3}, LA/B;->a(LY0/v;)F

    move-result v2

    invoke-interface {v0, v2}, LY0/e;->S0(F)I

    move-result v2

    iget-object v0, p0, Landroidx/compose/foundation/layout/o$a;->E:LD0/M;

    iget-object v3, p0, Landroidx/compose/foundation/layout/o$a;->F:Landroidx/compose/foundation/layout/o;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/o;->T1()LA/B;

    move-result-object v3

    invoke-interface {v3}, LA/B;->d()F

    move-result v3

    invoke-interface {v0, v3}, LY0/e;->S0(F)I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/o$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
