.class final Li1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private C:Li1/f;

.field private D:I


# direct methods
.method public constructor <init>(Li1/f;)V
    .locals 1

    const-string v0, "mObject"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/f$a;->C:Li1/f;

    return-void
.end method


# virtual methods
.method public b()Li1/d;
    .locals 2

    iget-object v0, p0, Li1/f$a;->C:Li1/f;

    invoke-virtual {v0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Li1/f$a;->D:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Li1/d;

    iget v1, p0, Li1/f$a;->D:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Li1/f$a;->D:I

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Li1/f$a;->D:I

    iget-object v1, p0, Li1/f$a;->C:Li1/f;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li1/f$a;->b()Li1/d;

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
