.class public final LM0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM0/z;

.field private final b:LM0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LM0/z;LM0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM0/A;->a:LM0/z;

    iput-object p2, p0, LM0/A;->b:LM0/y;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    new-instance v0, LM0/y;

    invoke-direct {v0, p1}, LM0/y;-><init>(Z)V

    const/4 p1, 0x0

    invoke-direct {p0, p1, v0}, LM0/A;-><init>(LM0/z;LM0/y;)V

    return-void
.end method


# virtual methods
.method public final a()LM0/y;
    .locals 1

    iget-object v0, p0, LM0/A;->b:LM0/y;

    return-object v0
.end method

.method public final b()LM0/z;
    .locals 1

    iget-object v0, p0, LM0/A;->a:LM0/z;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LM0/A;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, LM0/A;->b:LM0/y;

    check-cast p1, LM0/A;

    iget-object v3, p1, LM0/A;->b:LM0/y;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LM0/A;->a:LM0/z;

    iget-object p1, p1, LM0/A;->a:LM0/z;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, LM0/A;->a:LM0/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM0/z;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LM0/A;->b:LM0/y;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LM0/y;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PlatformTextStyle(spanStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/A;->a:LM0/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paragraphSyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/A;->b:LM0/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
