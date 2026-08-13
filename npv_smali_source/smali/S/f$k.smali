.class final LS/f$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/q;


# direct methods
.method constructor <init>(Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/f$k;->D:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)"

    const v2, 0x51ac10ea

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LA/b;->a:LA/b;

    invoke-virtual {p2}, LA/b;->c()LA/b$e;

    move-result-object p2

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v0

    iget-object v1, p0, LS/f$k;->D:Lx7/q;

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/16 v3, 0x36

    invoke-static {p2, v0, p1, v3}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0}, LV/k;->a(LV/n;I)I

    move-result v0

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {p1, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LV/n;->H()V

    :goto_1
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, p2, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object p2

    invoke-static {v5, v3, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object p2

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, p2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object p2

    invoke-static {v5, v2, p2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, LA/M;->a:LA/M;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p2, p1, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f$k;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
