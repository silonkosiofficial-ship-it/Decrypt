.class final LS/Z0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->c(Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLo0/e2;JJJJLx7/p;LV/n;II)V
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

.field final synthetic H:J

.field final synthetic I:J


# direct methods
.method constructor <init>(ZLx7/p;Lx7/p;Lx7/p;JJ)V
    .locals 0

    iput-boolean p1, p0, LS/Z0$d;->D:Z

    iput-object p2, p0, LS/Z0$d;->E:Lx7/p;

    iput-object p3, p0, LS/Z0$d;->F:Lx7/p;

    iput-object p4, p0, LS/Z0$d;->G:Lx7/p;

    iput-wide p5, p0, LS/Z0$d;->H:J

    iput-wide p7, p0, LS/Z0$d;->I:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

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

    const-string v1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)"

    const v2, -0x6d0e72d6

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->i()LU/L;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v0

    invoke-virtual {p2}, LU/B;->b()LU/L;

    move-result-object p2

    invoke-static {p2, p1, v1}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v7

    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object p2

    invoke-virtual {p2, v0}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v0, LS/Z0$d$a;

    iget-boolean v3, p0, LS/Z0$d;->D:Z

    iget-object v4, p0, LS/Z0$d;->E:Lx7/p;

    iget-object v5, p0, LS/Z0$d;->F:Lx7/p;

    iget-object v6, p0, LS/Z0$d;->G:Lx7/p;

    iget-wide v8, p0, LS/Z0$d;->H:J

    iget-wide v10, p0, LS/Z0$d;->I:J

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, LS/Z0$d$a;-><init>(ZLx7/p;Lx7/p;Lx7/p;LM0/P;JJ)V

    const/16 v1, 0x36

    const v2, 0x31d2b1ea

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v1, LV/P0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LS/Z0$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
