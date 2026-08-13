.class public final LH/g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field final synthetic D:LH/C;


# direct methods
.method public constructor <init>(LH/C;)V
    .locals 0

    iput-object p1, p0, LH/g;->D:LH/C;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)Ljava/lang/String;
    .locals 3

    .prologue
    const v0, -0x567dd55d

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, LH/g;->D:LH/C;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LH/C;->g(LV/n;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p2
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/g;->a(LV/n;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
