.class public final LR0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LR0/h;

.field private final b:LR0/q;

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LR0/h;LR0/q;IILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/F;->a:LR0/h;

    iput-object p2, p0, LR0/F;->b:LR0/q;

    iput p3, p0, LR0/F;->c:I

    iput p4, p0, LR0/F;->d:I

    iput-object p5, p0, LR0/F;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LR0/h;LR0/q;IILjava/lang/Object;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LR0/F;-><init>(LR0/h;LR0/q;IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LR0/F;LR0/h;LR0/q;IILjava/lang/Object;ILjava/lang/Object;)LR0/F;
    .locals 3

    .prologue
    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LR0/F;->a:LR0/h;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LR0/F;->b:LR0/q;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, LR0/F;->c:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, LR0/F;->d:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, LR0/F;->e:Ljava/lang/Object;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, LR0/F;->a(LR0/h;LR0/q;IILjava/lang/Object;)LR0/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LR0/h;LR0/q;IILjava/lang/Object;)LR0/F;
    .locals 8

    new-instance v7, LR0/F;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, LR0/F;-><init>(LR0/h;LR0/q;IILjava/lang/Object;Ly7/k;)V

    return-object v7
.end method

.method public final c()LR0/h;
    .locals 1

    iget-object v0, p0, LR0/F;->a:LR0/h;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LR0/F;->c:I

    return v0
.end method

.method public final e()LR0/q;
    .locals 1

    iget-object v0, p0, LR0/F;->b:LR0/q;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/F;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LR0/F;

    iget-object v1, p0, LR0/F;->a:LR0/h;

    iget-object v3, p1, LR0/F;->a:LR0/h;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LR0/F;->b:LR0/q;

    iget-object v3, p1, LR0/F;->b:LR0/q;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LR0/F;->c:I

    iget v3, p1, LR0/F;->c:I

    invoke-static {v1, v3}, LR0/o;->f(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, LR0/F;->d:I

    iget v3, p1, LR0/F;->d:I

    invoke-static {v1, v3}, LR0/p;->h(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LR0/F;->e:Ljava/lang/Object;

    iget-object p1, p1, LR0/F;->e:Ljava/lang/Object;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, LR0/F;->a:LR0/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LR0/F;->b:LR0/q;

    invoke-virtual {v2}, LR0/q;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, LR0/F;->c:I

    invoke-static {v2}, LR0/o;->g(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, LR0/F;->d:I

    invoke-static {v2}, LR0/p;->i(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LR0/F;->e:Ljava/lang/Object;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TypefaceRequest(fontFamily="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/F;->a:LR0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/F;->b:LR0/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/F;->c:I

    invoke-static {v1}, LR0/o;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontSynthesis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/F;->d:I

    invoke-static {v1}, LR0/p;->j(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resourceLoaderCacheKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR0/F;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
