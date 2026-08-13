.class public final LM8/o;
.super LM8/c;
.source "SourceFile"


# instance fields
.field private final C:Ljava/lang/Object;

.field private final D:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LM8/c;-><init>(Ly7/k;)V

    iput-object p1, p0, LM8/o;->C:Ljava/lang/Object;

    iput p2, p0, LM8/o;->D:I

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(ILjava/lang/Object;)V
    .locals 0

    const-string p1, "value"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LM8/o;->D:I

    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM8/o;->C:Ljava/lang/Object;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    iget v0, p0, LM8/o;->D:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LM8/o;->C:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LM8/o$a;

    invoke-direct {v0, p0}, LM8/o$a;-><init>(LM8/o;)V

    return-object v0
.end method
