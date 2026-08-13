.class final LS/T$e;
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

.field final synthetic E:LS/Q;


# direct methods
.method constructor <init>(LS/U;LS/Q;)V
    .locals 0

    iput-object p1, p0, LS/T$e;->D:LS/U;

    iput-object p2, p0, LS/T$e;->E:LS/Q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

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

    const-string v1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:179)"

    const v2, -0x6a194f29

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v3, LS/N;->a:LS/N;

    iget-object p2, p0, LS/T$e;->D:LS/U;

    invoke-interface {p2}, LS/U;->f()Ljava/lang/Long;

    move-result-object v4

    iget-object p2, p0, LS/T$e;->D:LS/U;

    invoke-interface {p2}, LS/U;->b()I

    move-result v5

    iget-object v6, p0, LS/T$e;->E:LS/Q;

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {}, LS/T;->B()LA/B;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/m;->h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;

    move-result-object v7

    const/16 v9, 0x6c00

    const/4 v10, 0x0

    move-object v8, p1

    invoke-virtual/range {v3 .. v10}, LS/N;->a(Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
