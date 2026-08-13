.class public final Lcom/google/android/gms/internal/ads/Ll0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lcom/google/android/gms/internal/ads/Cp0;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    sget-object v0, Lcom/google/android/gms/internal/ads/Cp0;->b:Lcom/google/android/gms/internal/ads/Cp0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Ll0;->b:Lcom/google/android/gms/internal/ads/Cp0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Ll0;->c:Z

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Ll0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ll0;->d()V

    return-void
.end method

.method private final d()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Jl0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/Jl0;->i(Lcom/google/android/gms/internal/ads/Jl0;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Ll0;
    .locals 1

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Jl0;->f(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Ll0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Jl0;->j(Lcom/google/android/gms/internal/ads/Jl0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ll0;->d()V

    :cond_0
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/Jl0;->h(Lcom/google/android/gms/internal/ads/Jl0;Lcom/google/android/gms/internal/ads/Ll0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lcom/google/android/gms/internal/ads/Ol0;
    .locals 23

    .prologue
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Ll0;->c:Z

    if-nez v1, :cond_14

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/Ll0;->c:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rt0;->d0()Lcom/google/android/gms/internal/ads/nt0;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ge v6, v7, :cond_2

    add-int/lit8 v7, v6, 0x1

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/Jl0;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/Jl0;->e(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kl0;->a()Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v8

    if-ne v6, v8, :cond_1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/Jl0;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/Jl0;->e(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kl0;->a()Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v8

    if-ne v6, v8, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_1
    move v6, v7

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/Ll0;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/ads/Jl0;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->b(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Gl0;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->e(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v10

    if-eqz v10, :cond_11

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->e(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kl0;->a()Lcom/google/android/gms/internal/ads/Kl0;

    move-result-object v11

    const/4 v12, 0x3

    const/4 v13, 0x4

    if-ne v10, v11, :cond_5

    move v10, v5

    :goto_3
    if-eqz v10, :cond_3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    :cond_3
    new-instance v10, Ljava/security/SecureRandom;

    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    new-array v11, v13, [B

    move v14, v5

    :goto_4
    if-nez v14, :cond_4

    invoke-virtual {v10, v11}, Ljava/security/SecureRandom;->nextBytes([B)V

    aget-byte v14, v11, v5

    and-int/lit16 v14, v14, 0xff

    aget-byte v15, v11, v1

    and-int/lit16 v15, v15, 0xff

    const/16 v16, 0x2

    aget-byte v5, v11, v16

    and-int/lit16 v5, v5, 0xff

    aget-byte v13, v11, v12

    and-int/lit16 v13, v13, 0xff

    shl-int/lit8 v14, v14, 0x18

    shl-int/lit8 v15, v15, 0x10

    or-int/2addr v14, v15

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v5, v14

    or-int v14, v5, v13

    const/4 v5, 0x0

    const/4 v13, 0x4

    goto :goto_4

    :cond_4
    move v10, v14

    goto :goto_3

    :cond_5
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->e(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Kl0;

    const/4 v10, 0x0

    :cond_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->a(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/El0;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->g(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/Sl0;->a()Z

    move-result v11

    if-eq v1, v11, :cond_7

    const/4 v11, 0x0

    goto :goto_5

    :cond_7
    move-object v11, v5

    :goto_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v13

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->g(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object v14

    invoke-virtual {v13, v14, v11}, Lcom/google/android/gms/internal/ads/Pp0;->a(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/El0;

    move-result-object v11

    new-instance v13, Lcom/google/android/gms/internal/ads/Ml0;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->b(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Gl0;

    move-result-object v19

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->j(Lcom/google/android/gms/internal/ads/Jl0;)Z

    move-result v21

    const/16 v22, 0x0

    move-object/from16 v17, v13

    move-object/from16 v18, v11

    move/from16 v20, v10

    invoke-direct/range {v17 .. v22}, Lcom/google/android/gms/internal/ads/Ml0;-><init>(Lcom/google/android/gms/internal/ads/El0;Lcom/google/android/gms/internal/ads/Gl0;IZLcom/google/android/gms/internal/ads/Nl0;)V

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->b(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Gl0;

    move-result-object v14

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v15

    const-class v1, Lcom/google/android/gms/internal/ads/xq0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v12

    invoke-virtual {v15, v11, v1, v12}, Lcom/google/android/gms/internal/ads/Zp0;->d(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/xq0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xq0;->e()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_9

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-ne v11, v10, :cond_8

    goto :goto_6

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Wrong ID set for key with ID requirement"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_6
    sget-object v11, Lcom/google/android/gms/internal/ads/Gl0;->b:Lcom/google/android/gms/internal/ads/Gl0;

    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/4 v12, 0x3

    goto :goto_7

    :cond_a
    sget-object v12, Lcom/google/android/gms/internal/ads/Gl0;->c:Lcom/google/android/gms/internal/ads/Gl0;

    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/4 v12, 0x4

    goto :goto_7

    :cond_b
    sget-object v12, Lcom/google/android/gms/internal/ads/Gl0;->d:Lcom/google/android/gms/internal/ads/Gl0;

    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/4 v12, 0x5

    :goto_7
    invoke-static {}, Lcom/google/android/gms/internal/ads/pt0;->d0()Lcom/google/android/gms/internal/ads/ot0;

    move-result-object v14

    invoke-static {}, Lcom/google/android/gms/internal/ads/ft0;->b0()Lcom/google/android/gms/internal/ads/ct0;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xq0;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/ads/ct0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xq0;->d()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v7

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/ads/ct0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xq0;->b()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object v7

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/ads/ct0;->z(Lcom/google/android/gms/internal/ads/dt0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/ot0;->z(Lcom/google/android/gms/internal/ads/ct0;)Lcom/google/android/gms/internal/ads/ot0;

    invoke-virtual {v14, v12}, Lcom/google/android/gms/internal/ads/ot0;->C(I)Lcom/google/android/gms/internal/ads/ot0;

    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/ot0;->A(I)Lcom/google/android/gms/internal/ads/ot0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xq0;->c()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/ot0;->B(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/ot0;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/pt0;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/nt0;->z(Lcom/google/android/gms/internal/ads/pt0;)Lcom/google/android/gms/internal/ads/nt0;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->j(Lcom/google/android/gms/internal/ads/Jl0;)Z

    move-result v1

    if-eqz v1, :cond_e

    if-nez v8, :cond_d

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Jl0;->b(Lcom/google/android/gms/internal/ads/Jl0;)Lcom/google/android/gms/internal/ads/Gl0;

    move-result-object v1

    if-ne v1, v11, :cond_c

    move-object v8, v5

    goto :goto_8

    :cond_c
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Primary key is not enabled"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Two primaries were set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    :goto_8
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    const/4 v5, 0x0

    goto/16 :goto_2

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unknown key status"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Ljava/security/GeneralSecurityException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " is used twice in the keyset"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "No ID was set (with withFixedId or withRandomId)"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    if-eqz v8, :cond_13

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/nt0;->A(I)Lcom/google/android/gms/internal/ads/nt0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rt0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Ol0;->e(Lcom/google/android/gms/internal/ads/rt0;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Ll0;->b:Lcom/google/android/gms/internal/ads/Cp0;

    new-instance v3, Lcom/google/android/gms/internal/ads/Ol0;

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v2, v5}, Lcom/google/android/gms/internal/ads/Ol0;-><init>(Lcom/google/android/gms/internal/ads/rt0;Ljava/util/List;Lcom/google/android/gms/internal/ads/Cp0;Lcom/google/android/gms/internal/ads/Nl0;)V

    return-object v3

    :cond_13
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "No primary was set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "KeysetHandle.Builder#build must only be called once"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
