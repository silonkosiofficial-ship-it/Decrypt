.class final Li9/M;
.super Lk9/E;
.source "SourceFile"


# instance fields
.field private final e:Li9/K;


# direct methods
.method public constructor <init>(Li9/K;)V
    .locals 4

    .prologue
    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/O;->a:Li9/O;

    invoke-virtual {v0}, Li9/O;->d()Lk9/D;

    move-result-object v0

    sget-object v1, Li9/K;->D:Li9/K;

    const/4 v2, 0x2

    if-ne p1, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    sget-object v3, Li9/K;->E:Li9/K;

    if-ne p1, v3, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-direct {p0, v0, v1, v2}, Lk9/E;-><init>(Lk9/D;ILjava/lang/Integer;)V

    iput-object p1, p0, Li9/M;->e:Li9/K;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Li9/M;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li9/M;->e:Li9/K;

    check-cast p1, Li9/M;

    iget-object p1, p1, Li9/M;->e:Li9/K;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li9/M;->e:Li9/K;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
