.class public final Lk8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/h;
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

    invoke-direct {p0}, Lk8/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/w;)Lk8/h;
    .locals 2

    .prologue
    const-string v0, "table"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/w;->v()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk8/h$a;->b()Lk8/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lk8/h;

    invoke-virtual {p1}, Li8/w;->w()Ljava/util/List;

    move-result-object p1

    const-string v1, "getRequirementList(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk8/h;-><init>(Ljava/util/List;Ly7/k;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final b()Lk8/h;
    .locals 1

    invoke-static {}, Lk8/h;->a()Lk8/h;

    move-result-object v0

    return-object v0
.end method
