.class final LD/q$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/q$a;->c()Lx7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/q;

.field final synthetic E:LD/q$a;


# direct methods
.method constructor <init>(LD/q;LD/q$a;)V
    .locals 0

    iput-object p1, p0, LD/q$a$a;->D:LD/q;

    iput-object p2, p0, LD/q$a$a;->E:LD/q$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

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

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    const v0, 0x53af4291

    const-string v2, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LD/q$a$a;->D:LD/q;

    invoke-virtual {p2}, LD/q;->d()Lx7/a;

    move-result-object p2

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, LD/s;

    iget-object p2, p0, LD/q$a$a;->E:LD/q$a;

    invoke-virtual {p2}, LD/q$a;->f()I

    move-result p2

    invoke-interface {v2}, LD/s;->a()I

    move-result v0

    if-ge p2, v0, :cond_4

    invoke-interface {v2, p2}, LD/s;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LD/q$a$a;->E:LD/q$a;

    invoke-virtual {v3}, LD/q$a;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move v4, p2

    goto :goto_3

    :cond_4
    :goto_2
    iget-object p2, p0, LD/q$a$a;->E:LD/q$a;

    invoke-virtual {p2}, LD/q$a;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, p2}, LD/s;->d(Ljava/lang/Object;)I

    move-result p2

    if-eq p2, v1, :cond_3

    iget-object v0, p0, LD/q$a$a;->E:LD/q$a;

    invoke-static {v0, p2}, LD/q$a;->a(LD/q$a;I)V

    goto :goto_1

    :goto_3
    if-eq v4, v1, :cond_5

    const p2, -0x275e1e87

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object p2, p0, LD/q$a$a;->D:LD/q;

    invoke-static {p2}, LD/q;->a(LD/q;)Le0/d;

    move-result-object p2

    invoke-static {p2}, LD/S;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object p2, p0, LD/q$a$a;->E:LD/q$a;

    invoke-virtual {p2}, LD/q$a;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LD/S;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v7}, LD/r;->b(LD/s;Ljava/lang/Object;ILjava/lang/Object;LV/n;I)V

    :goto_4
    invoke-interface {p1}, LV/n;->J()V

    goto :goto_5

    :cond_5
    const p2, -0x275af3af

    invoke-interface {p1, p2}, LV/n;->T(I)V

    goto :goto_4

    :goto_5
    iget-object p2, p0, LD/q$a$a;->E:LD/q$a;

    invoke-virtual {p2}, LD/q$a;->g()Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, LD/q$a$a;->E:LD/q$a;

    invoke-interface {p1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LD/q$a$a;->E:LD/q$a;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, LD/q$a$a$a;

    invoke-direct {v2, v1}, LD/q$a$a$a;-><init>(LD/q$a;)V

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lx7/l;

    const/4 v0, 0x0

    invoke-static {p2, v2, p1, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    :goto_6
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD/q$a$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
