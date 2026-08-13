.class final LC9/p$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p;->r(Lt/b;Le0/d;LC9/g;LV/n;I)V
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

    iput-object p1, p0, LC9/p$f;->C:LC9/g;

    iput-object p2, p0, LC9/p$f;->D:Lt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "moe.tlaster.precompose.navigation.NavHostContent.<anonymous> (NavHost.kt:273)"

    const v4, -0x687c1bf4

    invoke-static {v4, p2, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, La2/a;->a()LV/O0;

    move-result-object p2

    iget-object v1, p0, LC9/p$f;->C:LC9/g;

    invoke-virtual {p2, v1}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    sget-object v1, Ld2/a;->a:Ld2/a;

    iget-object v3, p0, LC9/p$f;->C:LC9/g;

    invoke-virtual {v1, v3}, Ld2/a;->b(Landroidx/lifecycle/Y;)LV/P0;

    move-result-object v1

    new-array v2, v2, [LV/P0;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    aput-object v1, v2, v0

    new-instance p2, LC9/p$f$a;

    iget-object v1, p0, LC9/p$f;->C:LC9/g;

    iget-object v3, p0, LC9/p$f;->D:Lt/b;

    invoke-direct {p2, v1, v3}, LC9/p$f$a;-><init>(LC9/g;Lt/b;)V

    const/16 v1, 0x36

    const v3, -0x2ca448b4

    invoke-static {v3, v0, p2, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object p2

    sget v0, LV/P0;->i:I

    or-int/lit8 v0, v0, 0x30

    invoke-static {v2, p2, p1, v0}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LC9/p$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
