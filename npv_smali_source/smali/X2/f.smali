.class final LX2/f;
.super LX2/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/f$b;
    }
.end annotation


# instance fields
.field private final a:LX2/s;

.field private final b:LX2/p$b;


# direct methods
.method private constructor <init>(LX2/s;LX2/p$b;)V
    .locals 0

    invoke-direct {p0}, LX2/p;-><init>()V

    iput-object p1, p0, LX2/f;->a:LX2/s;

    iput-object p2, p0, LX2/f;->b:LX2/p$b;

    return-void
.end method

.method synthetic constructor <init>(LX2/s;LX2/p$b;LX2/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LX2/f;-><init>(LX2/s;LX2/p$b;)V

    return-void
.end method


# virtual methods
.method public b()LX2/s;
    .locals 1

    iget-object v0, p0, LX2/f;->a:LX2/s;

    return-object v0
.end method

.method public c()LX2/p$b;
    .locals 1

    iget-object v0, p0, LX2/f;->b:LX2/p$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LX2/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, LX2/p;

    iget-object v1, p0, LX2/f;->a:LX2/s;

    if-nez v1, :cond_1

    invoke-virtual {p1}, LX2/p;->b()LX2/s;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LX2/p;->b()LX2/s;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, LX2/f;->b:LX2/p$b;

    invoke-virtual {p1}, LX2/p;->c()LX2/p$b;

    move-result-object p1

    if-nez v1, :cond_2

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, LX2/f;->a:LX2/s;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int/2addr v0, v2

    iget-object v2, p0, LX2/f;->b:LX2/p$b;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ComplianceData{privacyContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX2/f;->a:LX2/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productIdOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX2/f;->b:LX2/p$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
