.class public final LM1/e;
.super LM1/v;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p3, v0}, LM1/v;-><init>(ILy7/k;)V

    iput-object p1, p0, LM1/e;->b:Ljava/lang/Object;

    iput p2, p0, LM1/e;->c:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .prologue
    iget-object v0, p0, LM1/e;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LM1/e;->c:I

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM1/e;->b:Ljava/lang/Object;

    return-object v0
.end method
