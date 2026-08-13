.class final Landroidx/compose/foundation/h$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lv/G;

.field final synthetic E:Lz/j;


# direct methods
.method constructor <init>(Lv/G;Lz/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/h$c;->D:Lv/G;

    iput-object p2, p0, Landroidx/compose/foundation/h$c;->E:Lz/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    const p1, -0x15193045

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/h$c;->D:Lv/G;

    iget-object p3, p0, Landroidx/compose/foundation/h$c;->E:Lz/j;

    const/4 v0, 0x0

    invoke-interface {p1, p3, p2, v0}, Lv/G;->b(Lz/j;LV/n;I)Lv/H;

    move-result-object p1

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    new-instance v0, Landroidx/compose/foundation/i;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/i;-><init>(Lv/H;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Landroidx/compose/foundation/i;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p2}, LV/n;->J()V

    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/h$c;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
