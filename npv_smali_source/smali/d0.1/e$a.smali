.class public final Ld0/e$a;
.super La0/f;
.source "SourceFile"

# interfaces
.implements LV/H0$a;
.implements Lj$/util/Map;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private I:Ld0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ld0/e;)V
    .locals 0

    invoke-direct {p0, p1}, La0/f;-><init>(La0/d;)V

    iput-object p1, p0, Ld0/e$a;->I:Ld0/e;

    return-void
.end method


# virtual methods
.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LV/w;

    invoke-virtual {p0, p1}, Ld0/e$a;->q(LV/w;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LV/M1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LV/M1;

    invoke-virtual {p0, p1}, Ld0/e$a;->r(LV/M1;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic e()La0/d;
    .locals 1

    invoke-virtual {p0}, Ld0/e$a;->p()Ld0/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LV/w;

    invoke-virtual {p0, p1}, Ld0/e$a;->s(LV/w;)LV/M1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, LV/w;

    check-cast p2, LV/M1;

    invoke-virtual {p0, p1, p2}, Ld0/e$a;->t(LV/w;LV/M1;)LV/M1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()LV/H0;
    .locals 1

    invoke-virtual {p0}, Ld0/e$a;->p()Ld0/e;

    move-result-object v0

    return-object v0
.end method

.method public p()Ld0/e;
    .locals 3

    .prologue
    invoke-virtual {p0}, La0/f;->g()La0/t;

    move-result-object v0

    iget-object v1, p0, Ld0/e$a;->I:Ld0/e;

    invoke-virtual {v1}, La0/d;->r()La0/t;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld0/e$a;->I:Ld0/e;

    goto :goto_0

    :cond_0
    new-instance v0, Lc0/e;

    invoke-direct {v0}, Lc0/e;-><init>()V

    invoke-virtual {p0, v0}, La0/f;->m(Lc0/e;)V

    new-instance v0, Ld0/e;

    invoke-virtual {p0}, La0/f;->g()La0/t;

    move-result-object v1

    invoke-virtual {p0}, Lj7/i;->size()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ld0/e;-><init>(La0/t;I)V

    :goto_0
    iput-object v0, p0, Ld0/e$a;->I:Ld0/e;

    return-object v0
.end method

.method public bridge q(LV/w;)Z
    .locals 0

    invoke-super {p0, p1}, La0/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge r(LV/M1;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LV/w;

    invoke-virtual {p0, p1}, Ld0/e$a;->u(LV/w;)LV/M1;

    move-result-object p1

    return-object p1
.end method

.method public bridge s(LV/w;)LV/M1;
    .locals 0

    invoke-super {p0, p1}, La0/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/M1;

    return-object p1
.end method

.method public bridge t(LV/w;LV/M1;)LV/M1;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/M1;

    return-object p1
.end method

.method public bridge u(LV/w;)LV/M1;
    .locals 0

    invoke-super {p0, p1}, La0/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/M1;

    return-object p1
.end method
