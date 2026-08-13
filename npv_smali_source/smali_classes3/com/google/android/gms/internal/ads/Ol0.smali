.class public final Lcom/google/android/gms/internal/ads/Ol0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rt0;

.field private final b:Ljava/util/List;

.field private final c:Lcom/google/android/gms/internal/ads/Cp0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/rt0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ol0;->b:Ljava/util/List;

    sget-object p1, Lcom/google/android/gms/internal/ads/Cp0;->b:Lcom/google/android/gms/internal/ads/Cp0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ol0;->c:Lcom/google/android/gms/internal/ads/Cp0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rt0;Ljava/util/List;Lcom/google/android/gms/internal/ads/Cp0;Lcom/google/android/gms/internal/ads/Nl0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ol0;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ol0;->c:Lcom/google/android/gms/internal/ads/Cp0;

    return-void
.end method

.method static final a(Lcom/google/android/gms/internal/ads/rt0;)Lcom/google/android/gms/internal/ads/Ol0;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Ol0;->h(Lcom/google/android/gms/internal/ads/rt0;)V

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Ol0;->g(Lcom/google/android/gms/internal/ads/rt0;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Ol0;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/Ol0;-><init>(Lcom/google/android/gms/internal/ads/rt0;Ljava/util/List;)V

    return-object v1
.end method

.method public static final b(Lcom/google/android/gms/internal/ads/Sl0;)Lcom/google/android/gms/internal/ads/Ol0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Ll0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ll0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Jl0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/Jl0;-><init>(Lcom/google/android/gms/internal/ads/Sl0;Lcom/google/android/gms/internal/ads/Nl0;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Jl0;->d()Lcom/google/android/gms/internal/ads/Jl0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Jl0;->c()Lcom/google/android/gms/internal/ads/Jl0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Ll0;->a(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Ll0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ll0;->b()Lcom/google/android/gms/internal/ads/Ol0;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/rt0;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Ol0;->h(Lcom/google/android/gms/internal/ads/rt0;)V

    return-void
.end method

.method private final f(Lcom/google/android/gms/internal/ads/lp0;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 10

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/Zl0;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt0;->c0()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt0;->h0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    move v5, v4

    move v6, v3

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x3

    if-eqz v7, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/ads/pt0;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->k0()I

    move-result v9

    if-ne v9, v8, :cond_0

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->j0()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v8

    sget-object v9, Lcom/google/android/gms/internal/ads/Kt0;->D:Lcom/google/android/gms/internal/ads/Kt0;

    if-eq v8, v9, :cond_5

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->k0()I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result v8

    if-ne v8, v1, :cond_2

    if-nez v5, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "keyset contains multiple primary keys"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/ft0;->c0()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/ads/dt0;->G:Lcom/google/android/gms/internal/ads/dt0;

    if-eq v7, v8, :cond_3

    move v7, v2

    goto :goto_2

    :cond_3
    move v7, v3

    :goto_2
    and-int/2addr v6, v7

    add-int/2addr v4, v3

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v2

    const-string p2, "key %d has unknown status"

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v2

    const-string p2, "key %d has unknown prefix"

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v2

    const-string p2, "key %d has no key data"

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-eqz v4, :cond_e

    if-nez v5, :cond_9

    if-eqz v6, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_3
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/vq0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/sq0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ol0;->c:Lcom/google/android/gms/internal/ads/Cp0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sq0;->c(Lcom/google/android/gms/internal/ads/Cp0;)Lcom/google/android/gms/internal/ads/sq0;

    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ol0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_d

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/rt0;->e0(I)Lcom/google/android/gms/internal/ads/pt0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pt0;->k0()I

    move-result v4

    if-ne v4, v8, :cond_c

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Ol0;->b:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/Ml0;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Ml0;->a()Lcom/google/android/gms/internal/ads/El0;

    move-result-object v4

    :try_start_0
    invoke-virtual {p1, v4, p3}, Lcom/google/android/gms/internal/ads/lp0;->b(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result v6

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/rt0;->c0()I

    move-result v7

    if-ne v6, v7, :cond_a

    invoke-virtual {v0, v5, v4, v1}, Lcom/google/android/gms/internal/ads/sq0;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/El0;Lcom/google/android/gms/internal/ads/pt0;)Lcom/google/android/gms/internal/ads/sq0;

    goto :goto_5

    :cond_a
    invoke-virtual {v0, v5, v4, v1}, Lcom/google/android/gms/internal/ads/sq0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/El0;Lcom/google/android/gms/internal/ads/pt0;)Lcom/google/android/gms/internal/ads/sq0;

    goto :goto_5

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ft0;->g0()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to get primitive "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for key of type "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", see https://developers.google.com/tink/faq/registration_errors"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/ft0;->g0()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Key parsing of key with index "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and type_url "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " failed, unable to get primitive"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_5
    add-int/2addr v2, v3

    goto/16 :goto_4

    :cond_d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sq0;->d()Lcom/google/android/gms/internal/ads/vq0;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/lp0;->c(Lcom/google/android/gms/internal/ads/vq0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "keyset must contain at least one ENABLED key"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static g(Lcom/google/android/gms/internal/ads/rt0;)Ljava/util/List;
    .locals 11

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rt0;->b0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rt0;->h0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/pt0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result v6

    const/4 v9, 0x0

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    if-ne v4, v5, :cond_0

    move-object v3, v9

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/ft0;->g0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/ft0;->f0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/ft0;->c0()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object v7

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v8

    invoke-static {v4, v5, v7, v8, v3}, Lcom/google/android/gms/internal/ads/xq0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/Kt0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v5

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/Zp0;->j(Lcom/google/android/gms/internal/ads/Cq0;)Z

    move-result v7

    if-nez v7, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/ads/yp0;

    invoke-direct {v4, v3, v5}, Lcom/google/android/gms/internal/ads/yp0;-><init>(Lcom/google/android/gms/internal/ads/xq0;Lcom/google/android/gms/internal/ads/Wl0;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/internal/ads/Zp0;->a(Lcom/google/android/gms/internal/ads/Cq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/El0;

    move-result-object v3

    move-object v4, v3

    :goto_2
    new-instance v10, Lcom/google/android/gms/internal/ads/Ml0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->k0()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v5, 0x2

    if-eq v2, v5, :cond_3

    const/4 v5, 0x3

    if-ne v2, v5, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/ads/Gl0;->d:Lcom/google/android/gms/internal/ads/Gl0;

    :goto_3
    move-object v5, v2

    goto :goto_4

    :cond_2
    new-instance v2, Ljava/security/GeneralSecurityException;

    const-string v3, "Unknown key status"

    invoke-direct {v2, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/ads/Gl0;->c:Lcom/google/android/gms/internal/ads/Gl0;

    goto :goto_3

    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/ads/Gl0;->b:Lcom/google/android/gms/internal/ads/Gl0;

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rt0;->c0()I

    move-result v2

    if-ne v6, v2, :cond_5

    move v7, v3

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    move v7, v2

    :goto_5
    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/Ml0;-><init>(Lcom/google/android/gms/internal/ads/El0;Lcom/google/android/gms/internal/ads/Gl0;IZLcom/google/android/gms/internal/ads/Nl0;)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static h(Lcom/google/android/gms/internal/ads/rt0;)V
    .locals 1

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rt0;->b0()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method final c()Lcom/google/android/gms/internal/ads/rt0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    return-object v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/yl0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/lp0;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/lp0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/Ol0;->f(Lcom/google/android/gms/internal/ads/lp0;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "No wrapper found for "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/Zl0;->a:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/xt0;->b0()Lcom/google/android/gms/internal/ads/st0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ol0;->a:Lcom/google/android/gms/internal/ads/rt0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rt0;->c0()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/st0;->A(I)Lcom/google/android/gms/internal/ads/st0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rt0;->h0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/pt0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/vt0;->b0()Lcom/google/android/gms/internal/ads/tt0;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->c0()Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/ft0;->g0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/tt0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/tt0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->k0()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/tt0;->C(I)Lcom/google/android/gms/internal/ads/tt0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/tt0;->A(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/tt0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pt0;->b0()I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/tt0;->z(I)Lcom/google/android/gms/internal/ads/tt0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vt0;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/st0;->z(Lcom/google/android/gms/internal/ads/vt0;)Lcom/google/android/gms/internal/ads/st0;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/xt0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
