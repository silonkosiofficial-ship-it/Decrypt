.class public final Lj1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/d;
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

    invoke-direct {p0}, Lj1/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lj1/d;
    .locals 2

    new-instance v0, Lj1/d;

    const-string v1, "FIXED_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/d;->b(I)Lj1/d;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lj1/d;
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj1/d;

    const-string v1, "FIXED_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/d;->c(Ljava/lang/Object;)Lj1/d;

    return-object v0
.end method

.method public final c()Lj1/d;
    .locals 2

    new-instance v0, Lj1/d;

    const-string v1, "PARENT_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final d(Ljava/lang/Object;F)Lj1/d;
    .locals 2

    new-instance v0, Lj1/d;

    const-string v1, "PERCENT_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lj1/d;->i(Ljava/lang/Object;F)Lj1/d;

    return-object v0
.end method

.method public final e(Ljava/lang/String;)Lj1/d;
    .locals 2

    const-string v0, "ratio"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj1/d;

    const-string v1, "RATIO_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/d;->j(Ljava/lang/String;)Lj1/d;

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)Lj1/d;
    .locals 1

    const-string v0, "startValue"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj1/d;

    invoke-direct {v0}, Lj1/d;-><init>()V

    invoke-virtual {v0, p1}, Lj1/d;->l(Ljava/lang/Object;)Lj1/d;

    return-object v0
.end method

.method public final g()Lj1/d;
    .locals 2

    new-instance v0, Lj1/d;

    const-string v1, "WRAP_DIMENSION"

    invoke-direct {v0, v1}, Lj1/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
