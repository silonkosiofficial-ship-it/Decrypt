.class public final LN/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/k$a;
    }
.end annotation


# instance fields
.field private final a:LN/k$a;

.field private final b:LN/k$a;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LN/k$a;LN/k$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/k;->a:LN/k$a;

    iput-object p2, p0, LN/k;->b:LN/k$a;

    iput-boolean p3, p0, LN/k;->c:Z

    return-void
.end method

.method public static synthetic b(LN/k;LN/k$a;LN/k$a;ZILjava/lang/Object;)LN/k;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, LN/k;->a:LN/k$a;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LN/k;->b:LN/k$a;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, LN/k;->c:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LN/k;->a(LN/k$a;LN/k$a;Z)LN/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LN/k$a;LN/k$a;Z)LN/k;
    .locals 1

    new-instance v0, LN/k;

    invoke-direct {v0, p1, p2, p3}, LN/k;-><init>(LN/k$a;LN/k$a;Z)V

    return-object v0
.end method

.method public final c()LN/k$a;
    .locals 1

    iget-object v0, p0, LN/k;->b:LN/k$a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LN/k;->c:Z

    return v0
.end method

.method public final e()LN/k$a;
    .locals 1

    iget-object v0, p0, LN/k;->a:LN/k$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LN/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LN/k;

    iget-object v1, p0, LN/k;->a:LN/k$a;

    iget-object v3, p1, LN/k;->a:LN/k$a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LN/k;->b:LN/k$a;

    iget-object v3, p1, LN/k;->b:LN/k$a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LN/k;->c:Z

    iget-boolean p1, p1, LN/k;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LN/k;->a:LN/k$a;

    invoke-virtual {v0}, LN/k$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN/k;->b:LN/k$a;

    invoke-virtual {v1}, LN/k$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LN/k;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Selection(start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN/k;->a:LN/k$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN/k;->b:LN/k$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", handlesCrossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LN/k;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
