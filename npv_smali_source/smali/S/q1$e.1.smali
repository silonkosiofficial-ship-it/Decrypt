.class final LS/q1$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->c(LS/c;LS/o1;ZLV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/o1;

.field final synthetic E:LS/c;

.field final synthetic F:Z


# direct methods
.method constructor <init>(LS/o1;LS/c;Z)V
    .locals 0

    iput-object p1, p0, LS/q1$e;->D:LS/o1;

    iput-object p2, p0, LS/q1$e;->E:LS/c;

    iput-boolean p3, p0, LS/q1$e;->F:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/l;LV/n;I)V
    .locals 10

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)"

    const v2, -0x3cea9528

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->b()F

    move-result v0

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object p3

    sget-object v0, LS/q1$e$a;->D:LS/q1$e$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p3, v2, v0, v3, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {}, LS/q1;->Q()F

    move-result v5

    new-instance p3, LS/q1$e$b;

    iget-object v0, p0, LS/q1$e;->D:LS/o1;

    iget-object v1, p0, LS/q1$e;->E:LS/c;

    iget-boolean v2, p0, LS/q1$e;->F:Z

    invoke-direct {p3, v0, p1, v1, v2}, LS/q1$e$b;-><init>(LS/o1;Lr/l;LS/c;Z)V

    const/16 p1, 0x36

    const v0, -0x131782f0

    invoke-static {v0, v3, p3, p2, p1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v6

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    move-object v7, p2

    invoke-static/range {v4 .. v9}, LS/q1;->u(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/l;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/q1$e;->a(Lr/l;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
