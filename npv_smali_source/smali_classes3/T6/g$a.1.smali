.class public final LT6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/g;
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

    invoke-direct {p0}, LT6/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LT6/g;
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LT6/n;->c:LT6/n$a;

    invoke-static {p1}, LT6/u;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT6/l;

    invoke-virtual {p1}, LT6/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LT6/l;->a()Ljava/util/List;

    move-result-object p1

    new-instance v1, LT6/g;

    invoke-direct {v1, v0, p1}, LT6/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method
