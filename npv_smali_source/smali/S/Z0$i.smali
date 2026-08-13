.class final LS/Z0$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->d(LS/U0;Landroidx/compose/ui/d;ZLo0/e2;JJJJJLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;


# direct methods
.method constructor <init>(LS/U0;)V
    .locals 0

    iput-object p1, p0, LS/Z0$i;->D:LS/U0;

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

    const-string v1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)"

    const v2, -0x6c0a98b1

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LS/Z0$i;->D:LS/U0;

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, LS/Z0$i;->D:LS/U0;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_3

    sget-object p2, LV/n;->a:LV/n$a;

    invoke-virtual {p2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_4

    :cond_3
    new-instance v1, LS/Z0$i$a;

    invoke-direct {v1, v0}, LS/Z0$i$a;-><init>(LS/U0;)V

    invoke-interface {p1, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v2, v1

    check-cast v2, Lx7/a;

    sget-object p2, LS/G;->a:LS/G;

    invoke-virtual {p2}, LS/G;->a()Lx7/p;

    move-result-object v7

    const/high16 v9, 0x30000

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, p1

    invoke-static/range {v2 .. v10}, LS/h0;->a(Lx7/a;Landroidx/compose/ui/d;ZLS/f0;Lz/l;Lx7/p;LV/n;II)V

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

    invoke-virtual {p0, p1, p2}, LS/Z0$i;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
