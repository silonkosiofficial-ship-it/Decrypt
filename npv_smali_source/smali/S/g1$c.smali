.class final LS/g1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1;->b(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/q;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/g1$c;->D:Lx7/p;

    iput-object p2, p0, LS/g1$c;->E:Lx7/p;

    iput-object p3, p0, LS/g1$c;->F:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 5

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)"

    const v2, -0x606c2e20

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/g1$c;->D:Lx7/p;

    invoke-interface {p1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LS/g1$c;->E:Lx7/p;

    invoke-interface {p1, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, LS/g1$c;->F:Lx7/q;

    invoke-interface {p1, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, LS/g1$c;->D:Lx7/p;

    iget-object v2, p0, LS/g1$c;->E:Lx7/p;

    iget-object v3, p0, LS/g1$c;->F:Lx7/q;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, LS/g1$c$a;

    invoke-direct {v4, v1, v2, v3}, LS/g1$c$a;-><init>(Lx7/p;Lx7/p;Lx7/q;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lx7/p;

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p2, v4, p1, v0, v1}, LD0/g0;->b(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/g1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
