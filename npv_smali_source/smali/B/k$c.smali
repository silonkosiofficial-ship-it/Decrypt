.class final LB/k$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/k;->c(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/q;


# direct methods
.method constructor <init>(Lx7/q;)V
    .locals 0

    iput-object p1, p0, LB/k$c;->D:Lx7/q;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/d;ILV/n;I)V
    .locals 2

    .prologue
    and-int/lit8 p2, p4, 0x6

    if-nez p2, :cond_1

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p4, p2

    :cond_1
    and-int/lit16 p2, p4, 0x83

    const/16 v0, 0x82

    if-ne p2, v0, :cond_3

    invoke-interface {p3}, LV/n;->u()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, -0x1

    const-string v0, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)"

    const v1, -0x3c36593a

    invoke-static {v1, p4, p2, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p2, p0, LB/k$c;->D:Lx7/q;

    and-int/lit8 p4, p4, 0xe

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p1, p3, p4}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB/d;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LB/k$c;->a(LB/d;ILV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
