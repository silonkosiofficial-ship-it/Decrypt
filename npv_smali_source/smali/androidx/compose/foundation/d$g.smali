.class final Landroidx/compose/foundation/d$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->h(LF0/E0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/K;


# direct methods
.method constructor <init>(Ly7/K;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/d$g;->D:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/E0;)Ljava/lang/Boolean;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/d$g;->D:Ly7/K;

    iget-boolean v1, v0, Ly7/K;->C:Z

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lx/x;

    invoke-virtual {p1}, Lx/x;->T1()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v2

    :goto_1
    iput-boolean p1, v0, Ly7/K;->C:Z

    iget-object p1, p0, Landroidx/compose/foundation/d$g;->D:Ly7/K;

    iget-boolean p1, p1, Ly7/K;->C:Z

    xor-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/E0;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/d$g;->a(LF0/E0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
