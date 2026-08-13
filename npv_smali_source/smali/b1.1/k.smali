.class final Lb1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/w;


# instance fields
.field private final C:Lb1/f;

.field private final D:Lx7/l;

.field private final E:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb1/f;Lx7/l;)V
    .locals 1

    const-string v0, "ref"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constrain"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/k;->C:Lb1/f;

    iput-object p2, p0, Lb1/k;->D:Lx7/l;

    invoke-virtual {p1}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lb1/k;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public Q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/k;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final a()Lx7/l;
    .locals 1

    iget-object v0, p0, Lb1/k;->D:Lx7/l;

    return-object v0
.end method

.method public final b()Lb1/f;
    .locals 1

    iget-object v0, p0, Lb1/k;->C:Lb1/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lb1/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/k;->C:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast p1, Lb1/k;

    iget-object v1, p1, Lb1/k;->C:Lb1/f;

    invoke-virtual {v1}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/k;->D:Lx7/l;

    iget-object p1, p1, Lb1/k;->D:Lx7/l;

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
    .locals 2

    iget-object v0, p0, Lb1/k;->C:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lb1/k;->D:Lx7/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
