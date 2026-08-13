.class final LC9/p$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p$f;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LC9/g;

.field final synthetic D:Lt/b;


# direct methods
.method constructor <init>(LC9/g;Lt/b;)V
    .locals 0

    iput-object p1, p0, LC9/p$f$a;->C:LC9/g;

    iput-object p2, p0, LC9/p$f$a;->D:Lt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    const-string v1, "moe.tlaster.precompose.navigation.NavHostContent.<anonymous>.<anonymous> (NavHost.kt:277)"

    const v2, -0x2ca448b4

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LC9/p$f$a;->C:LC9/g;

    iget-object v0, p0, LC9/p$f$a;->D:Lt/b;

    const/4 v1, 0x0

    invoke-static {p2, v0, p1, v1}, LC9/p;->u(LC9/g;Lt/b;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LC9/p$f$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
