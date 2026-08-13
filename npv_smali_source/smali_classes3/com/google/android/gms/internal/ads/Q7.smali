.class public final Lcom/google/android/gms/internal/ads/Q7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/gms/internal/ads/o5;

.field public final c:Lcom/google/android/gms/internal/ads/N4;

.field public final d:Lcom/google/android/gms/internal/ads/Y9;

.field public final e:Lcom/google/android/gms/internal/ads/K2;

.field public final f:Lcom/google/android/gms/internal/ads/q6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/I1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/I1;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/I1;->c()Lcom/google/android/gms/internal/ads/Q7;

    const/4 v0, 0x0

    const/16 v1, 0x24

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/k3;Lcom/google/android/gms/internal/ads/o5;Lcom/google/android/gms/internal/ads/N4;Lcom/google/android/gms/internal/ads/Y9;Lcom/google/android/gms/internal/ads/q6;Lcom/google/android/gms/internal/ads/p7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q7;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Q7;->c:Lcom/google/android/gms/internal/ads/N4;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Q7;->d:Lcom/google/android/gms/internal/ads/Y9;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Q7;->e:Lcom/google/android/gms/internal/ads/K2;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Q7;->f:Lcom/google/android/gms/internal/ads/q6;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/ads/Q7;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/Q7;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/Q7;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->e:Lcom/google/android/gms/internal/ads/K2;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/Q7;->e:Lcom/google/android/gms/internal/ads/K2;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/K2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->c:Lcom/google/android/gms/internal/ads/N4;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/Q7;->c:Lcom/google/android/gms/internal/ads/N4;

    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->d:Lcom/google/android/gms/internal/ads/Y9;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/Q7;->d:Lcom/google/android/gms/internal/ads/Y9;

    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->f:Lcom/google/android/gms/internal/ads/q6;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Q7;->f:Lcom/google/android/gms/internal/ads/q6;

    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q7;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/o5;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->c:Lcom/google/android/gms/internal/ads/N4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/N4;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->e:Lcom/google/android/gms/internal/ads/K2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/K2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q7;->d:Lcom/google/android/gms/internal/ads/Y9;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Y9;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
