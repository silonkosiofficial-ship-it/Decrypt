.class public Lha/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa/d;


# instance fields
.field private final C:Ljava/lang/String;

.field private volatile D:Lfa/d;

.field private E:Ljava/lang/Boolean;

.field private F:Ljava/lang/reflect/Method;

.field private G:Lga/a;

.field private final H:Ljava/util/Queue;

.field public final I:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Queue;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha/k;->C:Ljava/lang/String;

    iput-object p2, p0, Lha/k;->H:Ljava/util/Queue;

    iput-boolean p3, p0, Lha/k;->I:Z

    return-void
.end method

.method private i()Lfa/d;
    .locals 2

    .prologue
    iget-object v0, p0, Lha/k;->G:Lga/a;

    if-nez v0, :cond_0

    new-instance v0, Lga/a;

    iget-object v1, p0, Lha/k;->H:Ljava/util/Queue;

    invoke-direct {v0, p0, v1}, Lga/a;-><init>(Lha/k;Ljava/util/Queue;)V

    iput-object v0, p0, Lha/k;->G:Lga/a;

    :cond_0
    iget-object v0, p0, Lha/k;->G:Lga/a;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0}, Lfa/d;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0}, Lfa/d;->b()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0}, Lfa/d;->c()Z

    move-result v0

    return v0
.end method

.method public d(Lga/b;)Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lfa/d;->d(Lga/b;)Z

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0}, Lfa/d;->e()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lha/k;

    iget-object v2, p0, Lha/k;->C:Ljava/lang/String;

    iget-object p1, p1, Lha/k;->C:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0}, Lfa/d;->f()Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lha/k;->h()Lfa/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lfa/d;->g(Ljava/lang/String;)V

    return-void
.end method

.method public h()Lfa/d;
    .locals 1

    .prologue
    iget-object v0, p0, Lha/k;->D:Lfa/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lha/k;->D:Lfa/d;

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lha/k;->I:Z

    if-eqz v0, :cond_1

    sget-object v0, Lha/e;->C:Lha/e;

    return-object v0

    :cond_1
    invoke-direct {p0}, Lha/k;->i()Lfa/d;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lha/k;->C:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lha/k;->C:Ljava/lang/String;

    return-object v0
.end method

.method public k()Z
    .locals 5

    .prologue
    iget-object v0, p0, Lha/k;->E:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lha/k;->D:Lfa/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Lga/c;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lha/k;->F:Ljava/lang/reflect/Method;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lha/k;->E:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lha/k;->E:Ljava/lang/Boolean;

    :goto_0
    iget-object v0, p0, Lha/k;->E:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lha/k;->D:Lfa/d;

    instance-of v0, v0, Lha/e;

    return v0
.end method

.method public m()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lha/k;->D:Lfa/d;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(Lga/c;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lha/k;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lha/k;->F:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lha/k;->D:Lfa/d;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public o(Lfa/d;)V
    .locals 0

    iput-object p1, p0, Lha/k;->D:Lfa/d;

    return-void
.end method
