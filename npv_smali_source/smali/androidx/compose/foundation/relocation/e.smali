.class public final Landroidx/compose/foundation/relocation/e;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"


# instance fields
.field private P:LE/b;

.field private final Q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/e;->P:LE/b;

    return-void
.end method

.method private final T1()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/relocation/e;->P:LE/b;

    instance-of v1, v0, Landroidx/compose/foundation/relocation/a;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/foundation/relocation/a;

    invoke-virtual {v0}, Landroidx/compose/foundation/relocation/a;->b()LX/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LX/b;->A(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public D1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/e;->P:LE/b;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/relocation/e;->U1(LE/b;)V

    return-void
.end method

.method public E1()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/relocation/e;->T1()V

    return-void
.end method

.method public final U1(LE/b;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/compose/foundation/relocation/e;->T1()V

    instance-of v0, p1, Landroidx/compose/foundation/relocation/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/relocation/a;

    invoke-virtual {v0}, Landroidx/compose/foundation/relocation/a;->b()LX/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_0
    iput-object p1, p0, Landroidx/compose/foundation/relocation/e;->P:LE/b;

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/e;->Q:Z

    return v0
.end method
