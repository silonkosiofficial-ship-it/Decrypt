.class final LS/q1$e$b$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$e$b$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/c;

.field final synthetic E:Z


# direct methods
.method constructor <init>(LS/c;Z)V
    .locals 0

    iput-object p1, p0, LS/q1$e$b$a$b;->D:LS/c;

    iput-boolean p2, p0, LS/q1$e$b$a$b;->E:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

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

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)"

    const v2, -0xc3f235d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LS/q1;->L()Lr/l;

    move-result-object p2

    invoke-virtual {p2}, Lr/l;->b()I

    move-result p2

    iget-object v6, p0, LS/q1$e$b$a$b;->D:LS/c;

    iget-boolean v7, p0, LS/q1$e$b$a$b;->E:Z

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, p2, :cond_5

    invoke-static {}, LS/q1;->L()Lr/l;

    move-result-object v0

    invoke-virtual {v0, v9}, Lr/l;->a(I)I

    move-result v2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, v9}, LV/n;->i(I)Z

    move-result v1

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, LS/q1$e$b$a$b$a;

    invoke-direct {v3, v9}, LS/q1$e$b$a$b$a;-><init>(I)V

    invoke-interface {p1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lx7/l;

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v8, v3, v4, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v5, 0x0

    move-object v1, v6

    move v3, v7

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LS/q1;->w(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_5
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$e$b$a$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
