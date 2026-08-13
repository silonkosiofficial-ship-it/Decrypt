.class final Lcom/google/android/gms/internal/ads/r6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:[Lcom/google/android/gms/internal/ads/a1;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r6;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/a1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r6;->b:[Lcom/google/android/gms/internal/ads/a1;

    return-void
.end method


# virtual methods
.method public final a(JLcom/google/android/gms/internal/ads/sR;)V
    .locals 4

    .prologue
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/r6;->b:[Lcom/google/android/gms/internal/ads/a1;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/e0;->b(JLcom/google/android/gms/internal/ads/sR;[Lcom/google/android/gms/internal/ads/a1;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/r6;->b:[Lcom/google/android/gms/internal/ads/a1;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/r6;->a:Ljava/util/List;

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

    new-instance v5, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v4, v3, Lcom/google/android/gms/internal/ads/D;->e:I

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/oK0;->D(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/D;->d:Ljava/lang/String;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/oK0;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v4, v3, Lcom/google/android/gms/internal/ads/D;->I:I

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/oK0;->p0(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/D;->r:Ljava/util/List;

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/r6;->b:[Lcom/google/android/gms/internal/ads/a1;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
