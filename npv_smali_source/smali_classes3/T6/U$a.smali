.class public final LT6/U$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/U;
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

    invoke-direct {p0}, LT6/U$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LT6/U;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LW6/E;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LT6/U;->c:LT6/U$a;

    invoke-virtual {v0}, LT6/U$a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT6/U;

    if-nez v0, :cond_0

    new-instance v0, LT6/U;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LT6/U;-><init>(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    invoke-static {}, LT6/U;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final c()LT6/U;
    .locals 1

    invoke-static {}, LT6/U;->b()LT6/U;

    move-result-object v0

    return-object v0
.end method
