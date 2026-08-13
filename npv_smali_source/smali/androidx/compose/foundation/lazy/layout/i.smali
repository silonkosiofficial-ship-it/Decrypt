.class final Landroidx/compose/foundation/lazy/layout/i;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;


# instance fields
.field private P:Landroidx/compose/foundation/lazy/layout/d;

.field private final Q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->P:Landroidx/compose/foundation/lazy/layout/d;

    const-string p1, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->Q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic K()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/i;->U1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final T1()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/i;->P:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public U1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/i;->Q:Ljava/lang/String;

    return-object v0
.end method

.method public final V1(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/i;->P:Landroidx/compose/foundation/lazy/layout/d;

    return-void
.end method
