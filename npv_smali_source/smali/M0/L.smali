.class public final LM0/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM0/C;

.field private final b:LM0/C;

.field private final c:LM0/C;

.field private final d:LM0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LM0/C;LM0/C;LM0/C;LM0/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/L;->a:LM0/C;

    iput-object p2, p0, LM0/L;->b:LM0/C;

    iput-object p3, p0, LM0/L;->c:LM0/C;

    iput-object p4, p0, LM0/L;->d:LM0/C;

    return-void
.end method


# virtual methods
.method public final a()LM0/C;
    .locals 1

    iget-object v0, p0, LM0/L;->b:LM0/C;

    return-object v0
.end method

.method public final b()LM0/C;
    .locals 1

    iget-object v0, p0, LM0/L;->c:LM0/C;

    return-object v0
.end method

.method public final c()LM0/C;
    .locals 1

    iget-object v0, p0, LM0/L;->d:LM0/C;

    return-object v0
.end method

.method public final d()LM0/C;
    .locals 1

    iget-object v0, p0, LM0/L;->a:LM0/C;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    instance-of v2, p1, LM0/L;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LM0/L;->a:LM0/C;

    check-cast p1, LM0/L;

    iget-object v3, p1, LM0/L;->a:LM0/C;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, LM0/L;->b:LM0/C;

    iget-object v3, p1, LM0/L;->b:LM0/C;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, LM0/L;->c:LM0/C;

    iget-object v3, p1, LM0/L;->c:LM0/C;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, LM0/L;->d:LM0/C;

    iget-object p1, p1, LM0/L;->d:LM0/C;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, LM0/L;->a:LM0/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM0/C;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LM0/L;->b:LM0/C;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LM0/C;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LM0/L;->c:LM0/C;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LM0/C;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LM0/L;->d:LM0/C;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LM0/C;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method
