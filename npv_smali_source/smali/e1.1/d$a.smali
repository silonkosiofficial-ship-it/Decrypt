.class public final Le1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/d;
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

    invoke-direct {p0}, Le1/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le1/d;Le1/i;Le1/i;F)Le1/b;
    .locals 1

    const-string v0, "linearSystem"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variableA"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variableC"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le1/d;->v()Le1/b;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4}, Le1/b;->j(Le1/i;Le1/i;F)Le1/b;

    move-result-object p1

    return-object p1
.end method

.method public final b()Le1/e;
    .locals 1

    invoke-virtual {p0}, Le1/d$a;->d()Le1/e;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    invoke-static {}, Le1/d;->a()Z

    move-result v0

    return v0
.end method

.method public final d()Le1/e;
    .locals 1

    invoke-static {}, Le1/d;->b()Le1/e;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Z
    .locals 1

    invoke-static {}, Le1/d;->c()Z

    move-result v0

    return v0
.end method

.method public final f(Z)V
    .locals 0

    invoke-static {p1}, Le1/d;->d(Z)V

    return-void
.end method
