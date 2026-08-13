.class public abstract Lr1/m;
.super Lr1/e;
.source "SourceFile"


# instance fields
.field public w0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lr1/e;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public abstract K0()V
.end method

.method public L0(Lr1/e;)V
    .locals 1

    iget-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr1/e;->w0(Lr1/e;)V

    return-void
.end method

.method public M0()V
    .locals 1

    iget-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public Y()V
    .locals 1

    iget-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lr1/e;->Y()V

    return-void
.end method

.method public a0(Lq1/c;)V
    .locals 3

    .prologue
    invoke-super {p0, p1}, Lr1/e;->a0(Lq1/c;)V

    iget-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/e;

    invoke-virtual {v2, p1}, Lr1/e;->a0(Lq1/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lr1/e;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lr1/m;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lr1/e;->G()Lr1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lr1/e;->G()Lr1/e;

    move-result-object v0

    check-cast v0, Lr1/m;

    invoke-virtual {v0, p1}, Lr1/m;->L0(Lr1/e;)V

    :cond_0
    invoke-virtual {p1, p0}, Lr1/e;->w0(Lr1/e;)V

    return-void
.end method
