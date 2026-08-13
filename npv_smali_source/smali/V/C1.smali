.class final LV/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# instance fields
.field private final C:LV/h1;

.field private final D:I

.field private final E:LV/W;

.field private final F:LV/D1;

.field private final G:I

.field private H:I


# direct methods
.method public constructor <init>(LV/h1;ILV/W;LV/D1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/C1;->C:LV/h1;

    iput p2, p0, LV/C1;->D:I

    iput-object p4, p0, LV/C1;->F:LV/D1;

    invoke-virtual {p1}, LV/h1;->R()I

    move-result p1

    iput p1, p0, LV/C1;->G:I

    return-void
.end method


# virtual methods
.method public b()Lg0/b;
    .locals 7

    .prologue
    iget-object v0, p0, LV/C1;->E:LV/W;

    invoke-virtual {v0}, LV/W;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, LV/C1;->H:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LV/C1;->H:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v1, v0, LV/d;

    if-eqz v1, :cond_1

    new-instance v1, LV/i1;

    iget-object v2, p0, LV/C1;->C:LV/h1;

    check-cast v0, LV/d;

    invoke-virtual {v0}, LV/d;->a()I

    move-result v0

    iget v3, p0, LV/C1;->G:I

    invoke-direct {v1, v2, v0, v3}, LV/i1;-><init>(LV/h1;II)V

    goto :goto_1

    :cond_1
    instance-of v1, v0, LV/W;

    if-eqz v1, :cond_2

    new-instance v1, LV/E1;

    iget-object v2, p0, LV/C1;->C:LV/h1;

    iget v3, p0, LV/C1;->D:I

    check-cast v0, LV/W;

    new-instance v4, LV/X0;

    iget-object v5, p0, LV/C1;->F:LV/D1;

    iget v6, p0, LV/C1;->H:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {v4, v5, v6}, LV/X0;-><init>(LV/D1;I)V

    invoke-direct {v1, v2, v3, v0, v4}, LV/E1;-><init>(LV/h1;ILV/W;LV/D1;)V

    :goto_1
    return-object v1

    :cond_2
    const-string v0, "Unexpected group information structure"

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 3

    .prologue
    iget-object v0, p0, LV/C1;->E:LV/W;

    invoke-virtual {v0}, LV/W;->b()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, p0, LV/C1;->H:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/C1;->b()Lg0/b;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
