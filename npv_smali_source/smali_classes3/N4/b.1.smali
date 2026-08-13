.class public abstract LN4/b;
.super LN4/S;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/b$b;
    }
.end annotation


# instance fields
.field private C:LN4/b$b;

.field private D:Ljava/lang/Object;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, LN4/S;-><init>()V

    sget-object v0, LN4/b$b;->D:LN4/b$b;

    iput-object v0, p0, LN4/b;->C:LN4/b$b;

    return-void
.end method

.method private d()Z
    .locals 2

    .prologue
    sget-object v0, LN4/b$b;->F:LN4/b$b;

    iput-object v0, p0, LN4/b;->C:LN4/b$b;

    invoke-virtual {p0}, LN4/b;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LN4/b;->D:Ljava/lang/Object;

    iget-object v0, p0, LN4/b;->C:LN4/b$b;

    sget-object v1, LN4/b$b;->E:LN4/b$b;

    if-eq v0, v1, :cond_0

    sget-object v0, LN4/b$b;->C:LN4/b$b;

    iput-object v0, p0, LN4/b;->C:LN4/b$b;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected abstract b()Ljava/lang/Object;
.end method

.method protected final c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LN4/b$b;->E:LN4/b$b;

    iput-object v0, p0, LN4/b;->C:LN4/b$b;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    .prologue
    iget-object v0, p0, LN4/b;->C:LN4/b$b;

    sget-object v1, LN4/b$b;->F:LN4/b$b;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LM4/h;->n(Z)V

    sget-object v0, LN4/b$a;->a:[I

    iget-object v1, p0, LN4/b;->C:LN4/b$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v3, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, LN4/b;->d()Z

    move-result v0

    return v0

    :cond_1
    return v3

    :cond_2
    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LN4/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LN4/b$b;->D:LN4/b$b;

    iput-object v0, p0, LN4/b;->C:LN4/b$b;

    iget-object v0, p0, LN4/b;->D:Ljava/lang/Object;

    invoke-static {v0}, LN4/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LN4/b;->D:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
