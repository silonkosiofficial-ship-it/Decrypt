.class final LB/n$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/n;->g(ILjava/lang/Object;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB/n;

.field final synthetic E:I


# direct methods
.method constructor <init>(LB/n;I)V
    .locals 0

    iput-object p1, p0, LB/n$a;->D:LB/n;

    iput p2, p0, LB/n$a;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 3

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

    const-string v1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)"

    const v2, -0x3128503e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LB/n$a;->D:LB/n;

    invoke-static {p2}, LB/n;->j(LB/n;)LB/k;

    move-result-object p2

    iget v0, p0, LB/n$a;->E:I

    iget-object v1, p0, LB/n$a;->D:LB/n;

    invoke-virtual {p2}, LD/o;->f()LD/d;

    move-result-object p2

    invoke-interface {p2, v0}, LD/d;->get(I)LD/d$a;

    move-result-object p2

    invoke-virtual {p2}, LD/d$a;->b()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p2}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LB/j;

    invoke-virtual {p2}, LB/j;->a()Lx7/r;

    move-result-object p2

    invoke-virtual {v1}, LB/n;->f()Landroidx/compose/foundation/lazy/a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v1, v0, p1, v2}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LB/n$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
