.class Lp8/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private final C:Lp8/t$c;

.field private D:Lp8/d$a;

.field E:I

.field final synthetic F:Lp8/t;


# direct methods
.method private constructor <init>(Lp8/t;)V
    .locals 2

    iput-object p1, p0, Lp8/t$d;->F:Lp8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp8/t$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lp8/t$c;-><init>(Lp8/d;Lp8/t$a;)V

    iput-object v0, p0, Lp8/t$d;->C:Lp8/t$c;

    invoke-virtual {v0}, Lp8/t$c;->d()Lp8/o;

    move-result-object v0

    invoke-virtual {v0}, Lp8/o;->Y()Lp8/d$a;

    move-result-object v0

    iput-object v0, p0, Lp8/t$d;->D:Lp8/d$a;

    invoke-virtual {p1}, Lp8/t;->size()I

    move-result p1

    iput p1, p0, Lp8/t$d;->E:I

    return-void
.end method

.method synthetic constructor <init>(Lp8/t;Lp8/t$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp8/t$d;-><init>(Lp8/t;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p0}, Lp8/t$d;->g()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public g()B
    .locals 1

    .prologue
    iget-object v0, p0, Lp8/t$d;->D:Lp8/d$a;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp8/t$d;->C:Lp8/t$c;

    invoke-virtual {v0}, Lp8/t$c;->d()Lp8/o;

    move-result-object v0

    invoke-virtual {v0}, Lp8/o;->Y()Lp8/d$a;

    move-result-object v0

    iput-object v0, p0, Lp8/t$d;->D:Lp8/d$a;

    :cond_0
    iget v0, p0, Lp8/t$d;->E:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lp8/t$d;->E:I

    iget-object v0, p0, Lp8/t$d;->D:Lp8/d$a;

    invoke-interface {v0}, Lp8/d$a;->g()B

    move-result v0

    return v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    iget v0, p0, Lp8/t$d;->E:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp8/t$d;->b()Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
