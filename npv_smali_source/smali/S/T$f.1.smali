.class final LS/T$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->b(LS/U;Landroidx/compose/ui/d;LS/Q;Lx7/p;Lx7/p;ZLS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U;


# direct methods
.method constructor <init>(LS/U;)V
    .locals 0

    iput-object p1, p0, LS/T$f;->D:LS/U;

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

    const-string v1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:198)"

    const v2, 0x76266147

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {}, LS/T;->H()LA/B;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/m;->h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LS/T$f;->D:LS/U;

    invoke-interface {v0}, LS/U;->b()I

    move-result v0

    iget-object v1, p0, LS/T$f;->D:LS/U;

    invoke-interface {p1, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LS/T$f;->D:LS/U;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, LS/T$f$a;

    invoke-direct {v3, v2}, LS/T$f$a;-><init>(LS/U;)V

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lx7/l;

    const/4 v1, 0x6

    invoke-static {p2, v0, v3, p1, v1}, LS/T;->h(Landroidx/compose/ui/d;ILx7/l;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LS/T$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
