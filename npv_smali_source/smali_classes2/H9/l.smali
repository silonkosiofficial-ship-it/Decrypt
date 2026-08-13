.class public final LH9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/l$a;,
        LH9/l$b;
    }
.end annotation


# static fields
.field public static final e:LH9/l$b;

.field private static final f:[LH9/i;

.field private static final g:[LH9/i;

.field public static final h:LH9/l;

.field public static final i:LH9/l;

.field public static final j:LH9/l;

.field public static final k:LH9/l;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, LH9/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH9/l$b;-><init>(Ly7/k;)V

    sput-object v0, LH9/l;->e:LH9/l$b;

    sget-object v0, LH9/i;->o1:LH9/i;

    sget-object v1, LH9/i;->p1:LH9/i;

    sget-object v2, LH9/i;->q1:LH9/i;

    sget-object v3, LH9/i;->a1:LH9/i;

    sget-object v4, LH9/i;->e1:LH9/i;

    sget-object v5, LH9/i;->b1:LH9/i;

    sget-object v6, LH9/i;->f1:LH9/i;

    sget-object v7, LH9/i;->l1:LH9/i;

    sget-object v8, LH9/i;->k1:LH9/i;

    const/16 v9, 0x9

    new-array v10, v9, [LH9/i;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v12, 0x1

    aput-object v1, v10, v12

    const/4 v13, 0x2

    aput-object v2, v10, v13

    const/4 v14, 0x3

    aput-object v3, v10, v14

    const/4 v15, 0x4

    aput-object v4, v10, v15

    const/16 v16, 0x5

    aput-object v5, v10, v16

    const/16 v17, 0x6

    aput-object v6, v10, v17

    const/16 v18, 0x7

    aput-object v7, v10, v18

    const/16 v19, 0x8

    aput-object v8, v10, v19

    sput-object v10, LH9/l;->f:[LH9/i;

    const/16 v9, 0x10

    new-array v9, v9, [LH9/i;

    aput-object v0, v9, v11

    aput-object v1, v9, v12

    aput-object v2, v9, v13

    aput-object v3, v9, v14

    aput-object v4, v9, v15

    aput-object v5, v9, v16

    aput-object v6, v9, v17

    aput-object v7, v9, v18

    aput-object v8, v9, v19

    sget-object v0, LH9/i;->L0:LH9/i;

    const/16 v1, 0x9

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->M0:LH9/i;

    const/16 v1, 0xa

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->j0:LH9/i;

    const/16 v1, 0xb

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->k0:LH9/i;

    const/16 v1, 0xc

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->H:LH9/i;

    const/16 v1, 0xd

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->L:LH9/i;

    const/16 v1, 0xe

    aput-object v0, v9, v1

    sget-object v0, LH9/i;->l:LH9/i;

    const/16 v1, 0xf

    aput-object v0, v9, v1

    sput-object v9, LH9/l;->g:[LH9/i;

    new-instance v0, LH9/l$a;

    invoke-direct {v0, v12}, LH9/l$a;-><init>(Z)V

    array-length v1, v10

    invoke-static {v10, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LH9/i;

    invoke-virtual {v0, v1}, LH9/l$a;->b([LH9/i;)LH9/l$a;

    move-result-object v0

    sget-object v1, LH9/E;->E:LH9/E;

    sget-object v2, LH9/E;->F:LH9/E;

    new-array v3, v13, [LH9/E;

    aput-object v1, v3, v11

    aput-object v2, v3, v12

    invoke-virtual {v0, v3}, LH9/l$a;->e([LH9/E;)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0, v12}, LH9/l$a;->d(Z)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/l$a;->a()LH9/l;

    move-result-object v0

    sput-object v0, LH9/l;->h:LH9/l;

    new-instance v0, LH9/l$a;

    invoke-direct {v0, v12}, LH9/l$a;-><init>(Z)V

    array-length v3, v9

    invoke-static {v9, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [LH9/i;

    invoke-virtual {v0, v3}, LH9/l$a;->b([LH9/i;)LH9/l$a;

    move-result-object v0

    new-array v3, v13, [LH9/E;

    aput-object v1, v3, v11

    aput-object v2, v3, v12

    invoke-virtual {v0, v3}, LH9/l$a;->e([LH9/E;)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0, v12}, LH9/l$a;->d(Z)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/l$a;->a()LH9/l;

    move-result-object v0

    sput-object v0, LH9/l;->i:LH9/l;

    new-instance v0, LH9/l$a;

    invoke-direct {v0, v12}, LH9/l$a;-><init>(Z)V

    array-length v3, v9

    invoke-static {v9, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [LH9/i;

    invoke-virtual {v0, v3}, LH9/l$a;->b([LH9/i;)LH9/l$a;

    move-result-object v0

    new-array v3, v15, [LH9/E;

    aput-object v1, v3, v11

    aput-object v2, v3, v12

    sget-object v1, LH9/E;->G:LH9/E;

    aput-object v1, v3, v13

    sget-object v1, LH9/E;->H:LH9/E;

    aput-object v1, v3, v14

    invoke-virtual {v0, v3}, LH9/l$a;->e([LH9/E;)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0, v12}, LH9/l$a;->d(Z)LH9/l$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/l$a;->a()LH9/l;

    move-result-object v0

    sput-object v0, LH9/l;->j:LH9/l;

    new-instance v0, LH9/l$a;

    invoke-direct {v0, v11}, LH9/l$a;-><init>(Z)V

    invoke-virtual {v0}, LH9/l$a;->a()LH9/l;

    move-result-object v0

    sput-object v0, LH9/l;->k:LH9/l;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LH9/l;->a:Z

    iput-boolean p2, p0, LH9/l;->b:Z

    iput-object p3, p0, LH9/l;->c:[Ljava/lang/String;

    iput-object p4, p0, LH9/l;->d:[Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(LH9/l;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LH9/l;->c:[Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic b(LH9/l;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LH9/l;->d:[Ljava/lang/String;

    return-object p0
.end method

.method private final g(Ljavax/net/ssl/SSLSocket;Z)LH9/l;
    .locals 4

    .prologue
    iget-object v0, p0, LH9/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "sslSocket.enabledCipherSuites"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LH9/l;->c:[Ljava/lang/String;

    sget-object v2, LH9/i;->b:LH9/i$b;

    invoke-virtual {v2}, LH9/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v1, v2}, LI9/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, LH9/l;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "sslSocket.enabledProtocols"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LH9/l;->d:[Ljava/lang/String;

    invoke-static {}, Ll7/a;->f()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v1, v2, v3}, LI9/d;->E([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p1

    const-string v2, "supportedCipherSuites"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LH9/i;->b:LH9/i$b;

    invoke-virtual {v2}, LH9/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    const-string v3, "TLS_FALLBACK_SCSV"

    invoke-static {p1, v3, v2}, LI9/d;->x([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I

    move-result v2

    const-string v3, "cipherSuitesIntersection"

    if-eqz p2, :cond_2

    const/4 p2, -0x1

    if-eq v2, p2, :cond_2

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object p1, p1, v2

    const-string p2, "supportedCipherSuites[indexOfFallbackScsv]"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LI9/d;->o([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :cond_2
    new-instance p1, LH9/l$a;

    invoke-direct {p1, p0}, LH9/l$a;-><init>(LH9/l;)V

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, v0

    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, LH9/l$a;->c([Ljava/lang/String;)LH9/l$a;

    move-result-object p1

    const-string p2, "tlsVersionsIntersection"

    invoke-static {v1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, v1

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, LH9/l$a;->f([Ljava/lang/String;)LH9/l$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/l$a;->a()LH9/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    .prologue
    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LH9/l;->g(Ljavax/net/ssl/SSLSocket;Z)LH9/l;

    move-result-object p2

    invoke-virtual {p2}, LH9/l;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p2, LH9/l;->d:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, LH9/l;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p2, p2, LH9/l;->c:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 6

    .prologue
    iget-object v0, p0, LH9/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, LH9/i;->b:LH9/i$b;

    invoke-virtual {v5, v4}, LH9/i$b;->b(Ljava/lang/String;)LH9/i;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final e(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    .prologue
    const-string v0, "socket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LH9/l;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LH9/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ll7/a;->f()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v2, v3}, LI9/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LH9/l;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    sget-object v2, LH9/i;->b:LH9/i$b;

    invoke-virtual {v2}, LH9/i$b;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, p1, v2}, LI9/d;->u([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    instance-of v0, p1, LH9/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    iget-boolean v2, p0, LH9/l;->a:Z

    check-cast p1, LH9/l;

    iget-boolean v3, p1, LH9/l;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, LH9/l;->c:[Ljava/lang/String;

    iget-object v3, p1, LH9/l;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, LH9/l;->d:[Ljava/lang/String;

    iget-object v3, p1, LH9/l;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, LH9/l;->b:Z

    iget-boolean p1, p1, LH9/l;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LH9/l;->a:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LH9/l;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-boolean v0, p0, LH9/l;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LH9/l;->c:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, LH9/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :cond_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, LH9/l;->b:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    goto :goto_1

    :cond_2
    const/16 v2, 0x11

    :goto_1
    return v2
.end method

.method public final i()Ljava/util/List;
    .locals 6

    .prologue
    iget-object v0, p0, LH9/l;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, LH9/E;->D:LH9/E$a;

    invoke-virtual {v5, v4}, LH9/E$a;->a(Ljava/lang/String;)LH9/E;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    iget-boolean v0, p0, LH9/l;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionSpec(cipherSuites="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LH9/l;->d()Ljava/util/List;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Lj$/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LH9/l;->i()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2}, Lj$/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LH9/l;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
