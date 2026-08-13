.class final LS/L0$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/q;

.field final synthetic G:Lx7/p;

.field final synthetic H:Lx7/p;

.field final synthetic I:LT/v;

.field final synthetic J:Lx7/p;


# direct methods
.method constructor <init>(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LT/v;Lx7/p;)V
    .locals 0

    iput p1, p0, LS/L0$b;->D:I

    iput-object p2, p0, LS/L0$b;->E:Lx7/p;

    iput-object p3, p0, LS/L0$b;->F:Lx7/q;

    iput-object p4, p0, LS/L0$b;->G:Lx7/p;

    iput-object p5, p0, LS/L0$b;->H:Lx7/p;

    iput-object p6, p0, LS/L0$b;->I:LT/v;

    iput-object p7, p0, LS/L0$b;->J:Lx7/p;

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

    const-string v1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)"

    const v2, -0x75f846d6

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget v3, p0, LS/L0$b;->D:I

    iget-object v4, p0, LS/L0$b;->E:Lx7/p;

    iget-object v5, p0, LS/L0$b;->F:Lx7/q;

    iget-object v6, p0, LS/L0$b;->G:Lx7/p;

    iget-object v7, p0, LS/L0$b;->H:Lx7/p;

    iget-object v8, p0, LS/L0$b;->I:LT/v;

    iget-object v9, p0, LS/L0$b;->J:Lx7/p;

    const/4 v11, 0x0

    move-object v10, p1

    invoke-static/range {v3 .. v11}, LS/L0;->c(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LS/L0$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
