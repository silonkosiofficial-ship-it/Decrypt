.class public final Lh9/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lh9/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lh9/o;
    .locals 2

    invoke-static {}, Lj$/time/ZoneId;->systemDefault()Lj$/time/ZoneId;

    move-result-object v0

    const-string v1, "systemDefault(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lh9/o$a;->e(Lj$/time/ZoneId;)Lh9/o;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    invoke-static {}, Lj$/time/ZoneId;->getAvailableZoneIds()Ljava/util/Set;

    move-result-object v0

    const-string v1, "getAvailableZoneIds(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Lh9/e;
    .locals 1

    invoke-static {}, Lh9/o;->a()Lh9/e;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lh9/o;
    .locals 1

    .prologue
    const-string v0, "zoneId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p1

    const-string v0, "of(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lh9/o$a;->e(Lj$/time/ZoneId;)Lh9/o;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    instance-of v0, p1, Lj$/time/DateTimeException;

    if-eqz v0, :cond_0

    new-instance v0, Lh9/f;

    invoke-direct {v0, p1}, Lh9/f;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    throw p1
.end method

.method public final e(Lj$/time/ZoneId;)Lh9/o;
    .locals 4

    .prologue
    const-string v0, "zoneId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj$/time/ZoneOffset;

    if-eqz v0, :cond_0

    new-instance v0, Lh9/e;

    new-instance v1, Lh9/r;

    check-cast p1, Lj$/time/ZoneOffset;

    invoke-direct {v1, p1}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    invoke-direct {v0, v1}, Lh9/e;-><init>(Lh9/r;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lh9/q;->a(Lj$/time/ZoneId;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lh9/e;

    new-instance v1, Lh9/r;

    invoke-virtual {p1}, Lj$/time/ZoneId;->normalized()Lj$/time/ZoneId;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.time.ZoneOffset"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lj$/time/ZoneOffset;

    invoke-direct {v1, v2}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    invoke-direct {v0, v1, p1}, Lh9/e;-><init>(Lh9/r;Lj$/time/ZoneId;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lh9/o;

    invoke-direct {v0, p1}, Lh9/o;-><init>(Lj$/time/ZoneId;)V

    :goto_0
    return-object v0
.end method

.method public final serializer()Lt9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/b;"
        }
    .end annotation

    sget-object v0, Ln9/f;->a:Ln9/f;

    return-object v0
.end method
