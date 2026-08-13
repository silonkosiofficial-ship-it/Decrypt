.class public final Laa/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Laa/i;

.field private final b:Laa/l;

.field private final c:Laa/C;

.field private final d:Laa/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Laa/i;Laa/l;Laa/C;Laa/c;)V
    .locals 1

    const-string v0, "language"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/n;->a:Laa/i;

    iput-object p2, p0, Laa/n;->b:Laa/l;

    iput-object p3, p0, Laa/n;->c:Laa/C;

    iput-object p4, p0, Laa/n;->d:Laa/c;

    return-void
.end method


# virtual methods
.method public final a()Laa/c;
    .locals 1

    iget-object v0, p0, Laa/n;->d:Laa/c;

    return-object v0
.end method

.method public final b()Laa/i;
    .locals 1

    iget-object v0, p0, Laa/n;->a:Laa/i;

    return-object v0
.end method

.method public final c()Laa/l;
    .locals 1

    iget-object v0, p0, Laa/n;->b:Laa/l;

    return-object v0
.end method

.method public final d()Laa/C;
    .locals 1

    iget-object v0, p0, Laa/n;->c:Laa/C;

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

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Laa/n;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Laa/n;

    iget-object v2, p0, Laa/n;->a:Laa/i;

    iget-object v3, p1, Laa/n;->a:Laa/i;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Laa/n;->b:Laa/l;

    iget-object v3, p1, Laa/n;->b:Laa/l;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Laa/n;->c:Laa/C;

    iget-object v3, p1, Laa/n;->c:Laa/C;

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Laa/n;->d:Laa/c;

    iget-object p1, p1, Laa/n;->d:Laa/c;

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Laa/n;->a:Laa/i;

    invoke-virtual {v0}, Laa/i;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laa/n;->b:Laa/l;

    invoke-virtual {v1}, Laa/l;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laa/n;->c:Laa/C;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laa/n;->d:Laa/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
