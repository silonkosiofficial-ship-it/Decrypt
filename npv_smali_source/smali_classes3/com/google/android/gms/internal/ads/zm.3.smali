.class public final Lcom/google/android/gms/internal/ads/zm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/p;


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:I

.field private final c:Ljava/util/Set;

.field private final d:Z

.field private final e:Landroid/location/Location;

.field private final f:I

.field private final g:Lcom/google/android/gms/internal/ads/dh;

.field private final h:Ljava/util/List;

.field private final i:Z

.field private final j:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/internal/ads/dh;Ljava/util/List;ZILjava/lang/String;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zm;->a:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zm;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zm;->c:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zm;->e:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zm;->d:Z

    iput p6, p0, Lcom/google/android/gms/internal/ads/zm;->f:I

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zm;->g:Lcom/google/android/gms/internal/ads/dh;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zm;->i:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zm;->h:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zm;->j:Ljava/util/Map;

    if-eqz p8, :cond_3

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, "custom:"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, ":"

    const/4 p4, 0x3

    invoke-virtual {p2, p3, p4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    array-length p3, p2

    if-ne p3, p4, :cond_0

    const/4 p3, 0x2

    aget-object p4, p2, p3

    const-string p5, "true"

    invoke-virtual {p5, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    const/4 p5, 0x1

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zm;->j:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    aget-object p3, p2, p3

    const-string p4, "false"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zm;->j:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zm;->h:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zm;->j:Ljava/util/Map;

    return-object v0
.end method

.method public final b()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zm;->h:Ljava/util/List;

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lcom/google/android/gms/ads/nativead/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zm;->g:Lcom/google/android/gms/internal/ads/dh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dh;->e(Lcom/google/android/gms/internal/ads/dh;)Lcom/google/android/gms/ads/nativead/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zm;->f:I

    return v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zm;->h:Ljava/util/List;

    const-string v1, "6"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zm;->i:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zm;->d:Z

    return v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zm;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final i()Ln3/e;
    .locals 4

    .prologue
    new-instance v0, Ln3/e$a;

    invoke-direct {v0}, Ln3/e$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zm;->g:Lcom/google/android/gms/internal/ads/dh;

    if-nez v1, :cond_0

    :goto_0
    invoke-virtual {v0}, Ln3/e$a;->a()Ln3/e;

    move-result-object v0

    goto :goto_2

    :cond_0
    iget v2, v1, Lcom/google/android/gms/internal/ads/dh;->C:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/dh;->I:Z

    invoke-virtual {v0, v2}, Ln3/e$a;->e(Z)Ln3/e$a;

    iget v2, v1, Lcom/google/android/gms/internal/ads/dh;->J:I

    invoke-virtual {v0, v2}, Ln3/e$a;->d(I)Ln3/e$a;

    :cond_2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/dh;->H:Ls3/Q1;

    if-eqz v2, :cond_3

    new-instance v3, Lk3/x;

    invoke-direct {v3, v2}, Lk3/x;-><init>(Ls3/Q1;)V

    invoke-virtual {v0, v3}, Ln3/e$a;->h(Lk3/x;)Ln3/e$a;

    :cond_3
    iget v2, v1, Lcom/google/android/gms/internal/ads/dh;->G:I

    invoke-virtual {v0, v2}, Ln3/e$a;->b(I)Ln3/e$a;

    :goto_1
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/dh;->D:Z

    invoke-virtual {v0, v2}, Ln3/e$a;->g(Z)Ln3/e$a;

    iget v2, v1, Lcom/google/android/gms/internal/ads/dh;->E:I

    invoke-virtual {v0, v2}, Ln3/e$a;->c(I)Ln3/e$a;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/dh;->F:Z

    invoke-virtual {v0, v1}, Ln3/e$a;->f(Z)Ln3/e$a;

    goto :goto_0

    :goto_2
    return-object v0
.end method
