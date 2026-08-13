.class final Lt/l$d$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/l$d;->e(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/I;


# direct methods
.method constructor <init>(Lu/I;)V
    .locals 0

    iput-object p1, p0, Lt/l$d$b;->D:Lu/I;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;LV/n;I)Lu/I;
    .locals 2

    .prologue
    const p1, 0x1a218d63

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lt/l$d$b;->D:Lu/I;

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/s0$b;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lt/l$d$b;->a(Lu/s0$b;LV/n;I)Lu/I;

    move-result-object p1

    return-object p1
.end method
