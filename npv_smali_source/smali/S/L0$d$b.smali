.class final LS/L0$d$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0$d;->a(LD0/j0;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/S;

.field final synthetic E:LD0/j0;

.field final synthetic F:Ljava/util/List;

.field final synthetic G:I

.field final synthetic H:Ljava/util/List;

.field final synthetic I:Ljava/lang/Integer;

.field final synthetic J:Lx7/q;


# direct methods
.method constructor <init>(LA/S;LD0/j0;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/L0$d$b;->D:LA/S;

    iput-object p2, p0, LS/L0$d$b;->E:LD0/j0;

    iput-object p3, p0, LS/L0$d$b;->F:Ljava/util/List;

    iput p4, p0, LS/L0$d$b;->G:I

    iput-object p5, p0, LS/L0$d$b;->H:Ljava/util/List;

    iput-object p6, p0, LS/L0$d$b;->I:Ljava/lang/Integer;

    iput-object p7, p0, LS/L0$d$b;->J:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 4

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)"

    const v2, -0x48526920

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LS/L0$d$b;->D:LA/S;

    iget-object v0, p0, LS/L0$d$b;->E:LD0/j0;

    invoke-static {p2, v0}, LA/U;->b(LA/S;LY0/e;)LA/B;

    move-result-object p2

    iget-object v0, p0, LS/L0$d$b;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, LA/B;->d()F

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LS/L0$d$b;->E:LD0/j0;

    iget v1, p0, LS/L0$d$b;->G:I

    invoke-interface {v0, v1}, LY0/e;->o0(I)F

    move-result v0

    :goto_1
    iget-object v1, p0, LS/L0$d$b;->H:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LS/L0$d$b;->I:Ljava/lang/Integer;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, LS/L0$d$b;->E:LD0/j0;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v2, v1}, LY0/e;->o0(I)F

    move-result v1

    goto :goto_3

    :cond_5
    :goto_2
    invoke-interface {p2}, LA/B;->c()F

    move-result v1

    :goto_3
    iget-object v2, p0, LS/L0$d$b;->E:LD0/j0;

    invoke-interface {v2}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-static {p2, v2}, Landroidx/compose/foundation/layout/m;->g(LA/B;LY0/v;)F

    move-result v2

    iget-object v3, p0, LS/L0$d$b;->E:LD0/j0;

    invoke-interface {v3}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-static {p2, v3}, Landroidx/compose/foundation/layout/m;->f(LA/B;LY0/v;)F

    move-result p2

    invoke-static {v2, v0, p2, v1}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object p2

    iget-object v0, p0, LS/L0$d$b;->J:Lx7/q;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p2, p1, v1}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    :goto_4
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/L0$d$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
