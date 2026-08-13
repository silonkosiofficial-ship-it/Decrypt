.class final LS/w0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/w0;->a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:LS/u0;


# direct methods
.method constructor <init>(LV/G1;LS/u0;)V
    .locals 0

    iput-object p1, p0, LS/w0$c;->D:LV/G1;

    iput-object p2, p0, LS/w0$c;->E:LS/u0;

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:265)"

    const v2, -0x1c472dfb

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v0, "indicator"

    invoke-static {p2, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/w0$c;->D:LV/G1;

    invoke-interface {p1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LS/w0$c;->D:LV/G1;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, LS/w0$c$a;

    invoke-direct {v2, v1}, LS/w0$c$a;-><init>(LV/G1;)V

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lx7/l;

    invoke-static {p2, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/w0$c;->E:LS/u0;

    invoke-virtual {v0}, LS/u0;->a()J

    move-result-wide v0

    sget-object v2, LU/r;->a:LU/r;

    invoke-virtual {v2}, LU/r;->d()LU/z;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, p1, v3}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v2

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/d;JLo0/e2;)Landroidx/compose/ui/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/d;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LS/w0$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
