.class final Landroidx/compose/foundation/layout/c;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/r0;


# instance fields
.field private P:Lh0/c;

.field private Q:Z


# direct methods
.method public constructor <init>(Lh0/c;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/c;->P:Lh0/c;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/c;->Q:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/layout/c;->V1(LY0/e;Ljava/lang/Object;)Landroidx/compose/foundation/layout/c;

    move-result-object p1

    return-object p1
.end method

.method public final T1()Lh0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/c;->P:Lh0/c;

    return-object v0
.end method

.method public final U1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/c;->Q:Z

    return v0
.end method

.method public V1(LY0/e;Ljava/lang/Object;)Landroidx/compose/foundation/layout/c;
    .locals 0

    return-object p0
.end method

.method public final W1(Lh0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/c;->P:Lh0/c;

    return-void
.end method

.method public final X1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/c;->Q:Z

    return-void
.end method
