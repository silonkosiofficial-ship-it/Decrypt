.class Lp8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private C:I

.field private final D:I

.field final synthetic E:Lp8/c;


# direct methods
.method private constructor <init>(Lp8/c;)V
    .locals 1

    iput-object p1, p0, Lp8/c$b;->E:Lp8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lp8/c;->W()I

    move-result v0

    iput v0, p0, Lp8/c$b;->C:I

    invoke-virtual {p1}, Lp8/c;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lp8/c$b;->D:I

    return-void
.end method

.method synthetic constructor <init>(Lp8/c;Lp8/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp8/c$b;-><init>(Lp8/c;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p0}, Lp8/c$b;->g()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public g()B
    .locals 3

    .prologue
    iget v0, p0, Lp8/c$b;->C:I

    iget v1, p0, Lp8/c$b;->D:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lp8/c$b;->E:Lp8/c;

    iget-object v1, v1, Lp8/o;->D:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lp8/c$b;->C:I

    aget-byte v0, v1, v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Lp8/c$b;->C:I

    iget v1, p0, Lp8/c$b;->D:I

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

    invoke-virtual {p0}, Lp8/c$b;->b()Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
