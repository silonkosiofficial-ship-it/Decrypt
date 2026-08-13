.class final LC/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m;->g(ILjava/lang/Object;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/m;

.field final synthetic E:I


# direct methods
.method constructor <init>(LC/m;I)V
    .locals 0

    iput-object p1, p0, LC/m$a;->D:LC/m;

    iput p2, p0, LC/m$a;->E:I

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

    const-string v1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)"

    const v2, 0x2b48c518

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LC/m$a;->D:LC/m;

    invoke-static {p2}, LC/m;->j(LC/m;)LC/j;

    move-result-object p2

    iget v0, p0, LC/m$a;->E:I

    invoke-virtual {p2}, LD/o;->f()LD/d;

    move-result-object p2

    invoke-interface {p2, v0}, LD/d;->get(I)LD/d$a;

    move-result-object p2

    invoke-virtual {p2}, LD/d$a;->b()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p2}, LD/d$a;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LC/i;

    invoke-virtual {p2}, LC/i;->a()Lx7/r;

    move-result-object p2

    sget-object v1, LC/p;->a:LC/p;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x6

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

    invoke-virtual {p0, p1, p2}, LC/m$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
