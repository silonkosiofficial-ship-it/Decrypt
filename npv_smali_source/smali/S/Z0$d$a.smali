.class final LS/Z0$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0$d;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/p;

.field final synthetic H:LM0/P;

.field final synthetic I:J

.field final synthetic J:J


# direct methods
.method constructor <init>(ZLx7/p;Lx7/p;Lx7/p;LM0/P;JJ)V
    .locals 0

    iput-boolean p1, p0, LS/Z0$d$a;->D:Z

    iput-object p2, p0, LS/Z0$d$a;->E:Lx7/p;

    iput-object p3, p0, LS/Z0$d$a;->F:Lx7/p;

    iput-object p4, p0, LS/Z0$d$a;->G:Lx7/p;

    iput-object p5, p0, LS/Z0$d$a;->H:LM0/P;

    iput-wide p6, p0, LS/Z0$d$a;->I:J

    iput-wide p8, p0, LS/Z0$d$a;->J:J

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

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)"

    const v2, 0x31d2b1ea

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, LS/Z0$d$a;->D:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, LS/Z0$d$a;->E:Lx7/p;

    if-eqz p2, :cond_3

    const p2, -0x305288fb

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object v0, p0, LS/Z0$d$a;->F:Lx7/p;

    iget-object v1, p0, LS/Z0$d$a;->E:Lx7/p;

    iget-object v2, p0, LS/Z0$d$a;->G:Lx7/p;

    iget-object v3, p0, LS/Z0$d$a;->H:LM0/P;

    iget-wide v4, p0, LS/Z0$d$a;->I:J

    iget-wide v6, p0, LS/Z0$d$a;->J:J

    const/4 v9, 0x0

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/Z0;->e(Lx7/p;Lx7/p;Lx7/p;LM0/P;JJLV/n;I)V

    :goto_1
    invoke-interface {p1}, LV/n;->J()V

    goto :goto_2

    :cond_3
    const p2, -0x3052538c

    invoke-interface {p1, p2}, LV/n;->T(I)V

    iget-object v0, p0, LS/Z0$d$a;->F:Lx7/p;

    iget-object v1, p0, LS/Z0$d$a;->E:Lx7/p;

    iget-object v2, p0, LS/Z0$d$a;->G:Lx7/p;

    iget-object v3, p0, LS/Z0$d$a;->H:LM0/P;

    iget-wide v4, p0, LS/Z0$d$a;->I:J

    iget-wide v6, p0, LS/Z0$d$a;->J:J

    const/4 v9, 0x0

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/Z0;->f(Lx7/p;Lx7/p;Lx7/p;LM0/P;JJLV/n;I)V

    goto :goto_1

    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/Z0$d$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
