.class final Li9/H;
.super Lk9/r;
.source "SourceFile"


# instance fields
.field private final d:Li9/I;


# direct methods
.method public constructor <init>(Li9/I;)V
    .locals 3

    const-string v0, "names"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/i;->a:Li9/i;

    invoke-virtual {v0}, Li9/i;->c()Lk9/D;

    move-result-object v0

    invoke-virtual {p1}, Li9/I;->b()Ljava/util/List;

    move-result-object v1

    const-string v2, "monthName"

    invoke-direct {p0, v0, v1, v2}, Lk9/r;-><init>(Lk9/D;Ljava/util/List;Ljava/lang/String;)V

    iput-object p1, p0, Li9/H;->d:Li9/I;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Li9/H;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li9/H;->d:Li9/I;

    invoke-virtual {v0}, Li9/I;->b()Ljava/util/List;

    move-result-object v0

    check-cast p1, Li9/H;

    iget-object p1, p1, Li9/H;->d:Li9/I;

    invoke-virtual {p1}, Li9/I;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li9/H;->d:Li9/I;

    invoke-virtual {v0}, Li9/I;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
