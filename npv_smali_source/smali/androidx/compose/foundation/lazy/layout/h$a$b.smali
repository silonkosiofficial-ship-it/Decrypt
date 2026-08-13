.class final Landroidx/compose/foundation/lazy/layout/h$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/h$a;->h()Landroidx/compose/foundation/lazy/layout/h$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;


# direct methods
.method constructor <init>(Ly7/O;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/h$a$b;->D:Ly7/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/E0;)LF0/D0;
    .locals 3

    .prologue
    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/foundation/lazy/layout/i;

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/i;->T1()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a$b;->D:Ly7/O;

    iget-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Landroidx/compose/foundation/lazy/layout/d;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_0
    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, LF0/D0;->D:LF0/D0;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/E0;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/h$a$b;->a(LF0/E0;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
