.class final LV/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr/K;


# direct methods
.method private synthetic constructor <init>(Lr/K;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/v0;->a:Lr/K;

    return-void
.end method

.method public static final synthetic a(Lr/K;)LV/v0;
    .locals 1

    new-instance v0, LV/v0;

    invoke-direct {v0, p0}, LV/v0;-><init>(Lr/K;)V

    return-object v0
.end method

.method public static b(Lr/K;)Lr/K;
    .locals 0

    return-object p0
.end method

.method public static c(Lr/K;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LV/v0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LV/v0;

    invoke-virtual {p1}, LV/v0;->h()Lr/K;

    move-result-object p1

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Lr/K;)I
    .locals 0

    invoke-virtual {p0}, Lr/U;->hashCode()I

    move-result p0

    return p0
.end method

.method public static final e(Lr/K;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Ly7/W;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ly7/W;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const-string p0, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1"

    invoke-static {v0, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public static final f(Lr/K;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1}, Lr/K;->l(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    if-eqz v3, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lr/U;->c:[Ljava/lang/Object;

    aget-object v4, v4, v2

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v4}, Ly7/W;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v0, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>"

    invoke-static {v4, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ly7/W;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p2, v0

    goto :goto_2

    :cond_3
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v0

    aput-object p2, v5, v1

    invoke-static {v5}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_2
    if-eqz v3, :cond_4

    not-int v0, v2

    iget-object v1, p0, Lr/U;->b:[Ljava/lang/Object;

    aput-object p1, v1, v0

    iget-object p0, p0, Lr/U;->c:[Ljava/lang/Object;

    aput-object p2, p0, v0

    goto :goto_3

    :cond_4
    iget-object p0, p0, Lr/U;->c:[Ljava/lang/Object;

    aput-object p2, p0, v2

    :goto_3
    return-void
.end method

.method public static g(Lr/K;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MutableScatterMultiMap(map="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LV/v0;->a:Lr/K;

    invoke-static {v0, p1}, LV/v0;->c(Lr/K;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()Lr/K;
    .locals 1

    iget-object v0, p0, LV/v0;->a:Lr/K;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LV/v0;->a:Lr/K;

    invoke-static {v0}, LV/v0;->d(Lr/K;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LV/v0;->a:Lr/K;

    invoke-static {v0}, LV/v0;->g(Lr/K;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
