.class public La0/d;
.super Lj7/f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/d$a;
    }
.end annotation


# static fields
.field public static final F:La0/d$a;

.field public static final G:I

.field private static final H:La0/d;


# instance fields
.field private final D:La0/t;

.field private final E:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/d$a;-><init>(Ly7/k;)V

    sput-object v0, La0/d;->F:La0/d$a;

    const/16 v0, 0x8

    sput v0, La0/d;->G:I

    new-instance v0, La0/d;

    sget-object v1, La0/t;->e:La0/t$a;

    invoke-virtual {v1}, La0/t$a;->a()La0/t;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La0/d;-><init>(La0/t;I)V

    sput-object v0, La0/d;->H:La0/d;

    return-void
.end method

.method public constructor <init>(La0/t;I)V
    .locals 0

    invoke-direct {p0}, Lj7/f;-><init>()V

    iput-object p1, p0, La0/d;->D:La0/t;

    iput p2, p0, La0/d;->E:I

    return-void
.end method

.method public static final synthetic o()La0/d;
    .locals 1

    sget-object v0, La0/d;->H:La0/d;

    return-object v0
.end method

.method private final p()LY/e;
    .locals 1

    new-instance v0, La0/n;

    invoke-direct {v0, p0}, La0/n;-><init>(La0/d;)V

    return-object v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    iget-object v0, p0, La0/d;->D:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, La0/t;->k(ILjava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, La0/d;->p()LY/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, La0/d;->q()LY/e;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, La0/d;->E:I

    return v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, La0/d;->D:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, La0/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, La0/d;->s()LY/b;

    move-result-object v0

    return-object v0
.end method

.method public q()LY/e;
    .locals 1

    new-instance v0, La0/p;

    invoke-direct {v0, p0}, La0/p;-><init>(La0/d;)V

    return-object v0
.end method

.method public final r()La0/t;
    .locals 1

    iget-object v0, p0, La0/d;->D:La0/t;

    return-object v0
.end method

.method public s()LY/b;
    .locals 1

    new-instance v0, La0/r;

    invoke-direct {v0, p0}, La0/r;-><init>(La0/d;)V

    return-object v0
.end method

.method public t(Ljava/lang/Object;Ljava/lang/Object;)La0/d;
    .locals 3

    .prologue
    iget-object v0, p0, La0/d;->D:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, p2, v1}, La0/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)La0/t$b;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance p2, La0/d;

    invoke-virtual {p1}, La0/t$b;->a()La0/t;

    move-result-object v0

    invoke-virtual {p0}, Lj7/f;->size()I

    move-result v1

    invoke-virtual {p1}, La0/t$b;->b()I

    move-result p1

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, La0/d;-><init>(La0/t;I)V

    return-object p2
.end method

.method public u(Ljava/lang/Object;)La0/d;
    .locals 3

    .prologue
    iget-object v0, p0, La0/d;->D:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, La0/t;->Q(ILjava/lang/Object;I)La0/t;

    move-result-object p1

    iget-object v0, p0, La0/d;->D:La0/t;

    if-ne v0, p1, :cond_1

    return-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, La0/d;->F:La0/d$a;

    invoke-virtual {p1}, La0/d$a;->a()La0/d;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, La0/d;

    invoke-virtual {p0}, Lj7/f;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v0, p1, v1}, La0/d;-><init>(La0/t;I)V

    return-object v0
.end method
