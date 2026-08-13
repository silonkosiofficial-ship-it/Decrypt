.class final Lcom/google/android/gms/internal/ads/qH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/WH0;
.implements Lcom/google/android/gms/internal/ads/TF0;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/internal/ads/VH0;

.field private c:Lcom/google/android/gms/internal/ads/SF0;

.field final synthetic d:Lcom/google/android/gms/internal/ads/sH0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/sH0;Ljava/lang/Object;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/kH0;->p(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/kH0;->n(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->c:Lcom/google/android/gms/internal/ads/SF0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qH0;->a:Ljava/lang/Object;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;
    .locals 12

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qH0;->a:Ljava/lang/Object;

    iget-wide v8, p1, Lcom/google/android/gms/internal/ads/HH0;->c:J

    invoke-virtual {v0, v1, v8, v9, p2}, Lcom/google/android/gms/internal/ads/sH0;->B(Ljava/lang/Object;JLcom/google/android/gms/internal/ads/LH0;)J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qH0;->a:Ljava/lang/Object;

    iget-wide v10, p1, Lcom/google/android/gms/internal/ads/HH0;->d:J

    invoke-virtual {v0, v1, v10, v11, p2}, Lcom/google/android/gms/internal/ads/sH0;->B(Ljava/lang/Object;JLcom/google/android/gms/internal/ads/LH0;)J

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/HH0;->c:J

    cmp-long p2, v8, v0

    if-nez p2, :cond_0

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/HH0;->d:J

    cmp-long p2, v10, v0

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    iget v4, p1, Lcom/google/android/gms/internal/ads/HH0;->a:I

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/HH0;->b:Lcom/google/android/gms/internal/ads/D;

    new-instance p1, Lcom/google/android/gms/internal/ads/HH0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x1

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/HH0;-><init>(IILcom/google/android/gms/internal/ads/D;ILjava/lang/Object;JJ)V

    return-object p1
.end method

.method private final x(ILcom/google/android/gms/internal/ads/LH0;)Z
    .locals 2

    .prologue
    const/4 p1, 0x0

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qH0;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/sH0;->C(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return p1

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qH0;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/sH0;->A(Ljava/lang/Object;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    iget v1, v0, Lcom/google/android/gms/internal/ads/VH0;->a:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/VH0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-static {v0, p2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/kH0;->q(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->c:Lcom/google/android/gms/internal/ads/SF0;

    iget v1, v0, Lcom/google/android/gms/internal/ads/SF0;->a:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/SF0;->b:Lcom/google/android/gms/internal/ads/LH0;

    invoke-static {v0, p2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qH0;->d:Lcom/google/android/gms/internal/ads/sH0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/kH0;->o(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->c:Lcom/google/android/gms/internal/ads/SF0;

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final B(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/qH0;->x(ILcom/google/android/gms/internal/ads/LH0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {p0, p3, p2}, Lcom/google/android/gms/internal/ads/qH0;->a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/VH0;->d(Lcom/google/android/gms/internal/ads/HH0;)V

    :cond_0
    return-void
.end method

.method public final F(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 0

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/qH0;->x(ILcom/google/android/gms/internal/ads/LH0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {p0, p4, p2}, Lcom/google/android/gms/internal/ads/qH0;->a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lcom/google/android/gms/internal/ads/VH0;->g(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public final i(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/qH0;->x(ILcom/google/android/gms/internal/ads/LH0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {p0, p4, p2}, Lcom/google/android/gms/internal/ads/qH0;->a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/VH0;->e(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    :cond_0
    return-void
.end method

.method public final t(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/qH0;->x(ILcom/google/android/gms/internal/ads/LH0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {p0, p4, p2}, Lcom/google/android/gms/internal/ads/qH0;->a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/VH0;->h(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    :cond_0
    return-void
.end method

.method public final y(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/qH0;->x(ILcom/google/android/gms/internal/ads/LH0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/qH0;->b:Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {p0, p4, p2}, Lcom/google/android/gms/internal/ads/qH0;->a(Lcom/google/android/gms/internal/ads/HH0;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/HH0;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/VH0;->f(Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    :cond_0
    return-void
.end method
