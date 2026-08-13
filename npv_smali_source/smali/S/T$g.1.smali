.class final LS/T$g;
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

.field final synthetic E:LT/f;

.field final synthetic F:LS/Q;

.field final synthetic G:LS/M;


# direct methods
.method constructor <init>(LS/U;LT/f;LS/Q;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$g;->D:LS/U;

    iput-object p2, p0, LS/T$g;->E:LT/f;

    iput-object p3, p0, LS/T$g;->F:LS/Q;

    iput-object p4, p0, LS/T$g;->G:LS/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 13

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:211)"

    const v2, -0x6db7473a

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p2}, LS/U;->f()Ljava/lang/Long;

    move-result-object v0

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p2}, LS/U;->e()J

    move-result-wide v1

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p2}, LS/U;->b()I

    move-result v3

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p2

    iget-object v4, p0, LS/T$g;->D:LS/U;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez p2, :cond_3

    sget-object p2, LV/n;->a:LV/n$a;

    invoke-virtual {p2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v5, p2, :cond_4

    :cond_3
    new-instance v5, LS/T$g$a;

    invoke-direct {v5, v4}, LS/T$g$a;-><init>(LS/U;)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v5

    check-cast v4, Lx7/l;

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p2

    iget-object v5, p0, LS/T$g;->D:LS/U;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez p2, :cond_5

    sget-object p2, LV/n;->a:LV/n$a;

    invoke-virtual {p2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v6, p2, :cond_6

    :cond_5
    new-instance v6, LS/T$g$b;

    invoke-direct {v6, v5}, LS/T$g$b;-><init>(LS/U;)V

    invoke-interface {p1, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v5, v6

    check-cast v5, Lx7/l;

    iget-object v6, p0, LS/T$g;->E:LT/f;

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p2}, LS/U;->g()LE7/i;

    move-result-object v7

    iget-object v8, p0, LS/T$g;->F:LS/Q;

    iget-object p2, p0, LS/T$g;->D:LS/U;

    invoke-interface {p2}, LS/U;->d()LS/P0;

    move-result-object v9

    iget-object v10, p0, LS/T$g;->G:LS/M;

    const/4 v12, 0x0

    move-object v11, p1

    invoke-static/range {v0 .. v12}, LS/T;->w(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
