.class final Li9/c0;
.super Lk9/A;
.source "SourceFile"


# instance fields
.field private final f:Li9/K;

.field private final g:Z


# direct methods
.method public constructor <init>(Li9/K;Z)V
    .locals 7

    .prologue
    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/i;->a:Li9/i;

    invoke-virtual {v0}, Li9/i;->d()Lk9/q;

    move-result-object v2

    sget-object v0, Li9/K;->D:Li9/K;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v0, Li9/K;->E:Li9/K;

    if-ne p1, v0, :cond_1

    move-object v5, v6

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    move-object v5, v0

    :goto_1
    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lk9/A;-><init>(Lk9/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    iput-object p1, p0, Li9/c0;->f:Li9/K;

    iput-boolean p2, p0, Li9/c0;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Li9/K;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Li9/c0;-><init>(Li9/K;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li9/c0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li9/c0;->f:Li9/K;

    check-cast p1, Li9/c0;

    iget-object v1, p1, Li9/c0;->f:Li9/K;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Li9/c0;->g:Z

    iget-boolean p1, p1, Li9/c0;->g:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li9/c0;->f:Li9/K;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Li9/c0;->g:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
