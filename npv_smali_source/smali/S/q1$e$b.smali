.class final LS/q1$e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1$e;->a(Lr/l;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/o1;

.field final synthetic E:Lr/l;

.field final synthetic F:LS/c;

.field final synthetic G:Z


# direct methods
.method constructor <init>(LS/o1;Lr/l;LS/c;Z)V
    .locals 0

    iput-object p1, p0, LS/q1$e$b;->D:LS/o1;

    iput-object p2, p0, LS/q1$e$b;->E:Lr/l;

    iput-object p3, p0, LS/q1$e$b;->F:LS/c;

    iput-boolean p4, p0, LS/q1$e$b;->G:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 4

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

    const-string v1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)"

    const v2, -0x131782f0

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object p2

    iget-object v0, p0, LS/q1$e$b;->D:LS/o1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LS/o1;->a(Z)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-virtual {p2, v0}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v0, LS/q1$e$b$a;

    iget-object v1, p0, LS/q1$e$b;->E:Lr/l;

    iget-object v2, p0, LS/q1$e$b;->F:LS/c;

    iget-boolean v3, p0, LS/q1$e$b;->G:Z

    invoke-direct {v0, v1, v2, v3}, LS/q1$e$b$a;-><init>(Lr/l;LS/c;Z)V

    const/16 v1, 0x36

    const v2, 0x76c8d1d0

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

    invoke-virtual {p0, p1, p2}, LS/q1$e$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
