.class public final Lcom/google/android/gms/internal/ads/d6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:[Lcom/google/android/gms/internal/ads/a1;

.field private final c:Lcom/google/android/gms/internal/ads/nd0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d6;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d6;->b:[Lcom/google/android/gms/internal/ads/a1;

    new-instance p1, Lcom/google/android/gms/internal/ads/nd0;

    new-instance v0, Lcom/google/android/gms/internal/ads/c6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/c6;-><init>(Lcom/google/android/gms/internal/ads/d6;)V

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/nd0;-><init>(Lcom/google/android/gms/internal/ads/mc0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d6;->c:Lcom/google/android/gms/internal/ads/nd0;

    return-void
.end method


# virtual methods
.method public final a(JLcom/google/android/gms/internal/ads/sR;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d6;->c:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/nd0;->b(JLcom/google/android/gms/internal/ads/sR;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/d6;->b:[Lcom/google/android/gms/internal/ads/a1;

    array-length v2, v2

    if-ge v1, v2, :cond_3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/d6;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/D;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string v5, "application/cea-608"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_1

    const-string v5, "application/cea-708"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    move v6, v0

    :cond_1
    :goto_1
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "Invalid closed caption MIME type provided: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/ads/LC;->e(ZLjava/lang/Object;)V

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/D;->a:Ljava/lang/String;

    if-nez v5, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v5

    :cond_2
    new-instance v6, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v4, v3, Lcom/google/android/gms/internal/ads/D;->e:I

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->D(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/D;->d:Ljava/lang/String;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v4, v3, Lcom/google/android/gms/internal/ads/D;->I:I

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->p0(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/D;->r:Ljava/util/List;

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/d6;->b:[Lcom/google/android/gms/internal/ads/a1;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d6;->c:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nd0;->c()V

    return-void
.end method

.method final synthetic d(JLcom/google/android/gms/internal/ads/sR;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d6;->b:[Lcom/google/android/gms/internal/ads/a1;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/e0;->a(JLcom/google/android/gms/internal/ads/sR;[Lcom/google/android/gms/internal/ads/a1;)V

    return-void
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d6;->c:Lcom/google/android/gms/internal/ads/nd0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/nd0;->d(I)V

    return-void
.end method
