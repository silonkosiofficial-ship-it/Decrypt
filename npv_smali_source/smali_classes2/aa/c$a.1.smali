.class public final Laa/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/c;
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

    invoke-direct {p0}, Laa/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)Laa/c;
    .locals 4

    .prologue
    float-to-double v0, p1

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_0

    sget-object p1, Laa/c;->E:Laa/c;

    goto :goto_0

    :cond_0
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_1

    sget-object p1, Laa/c;->F:Laa/c;

    goto :goto_0

    :cond_1
    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_2

    sget-object p1, Laa/c;->G:Laa/c;

    goto :goto_0

    :cond_2
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_3

    sget-object p1, Laa/c;->H:Laa/c;

    goto :goto_0

    :cond_3
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_4

    sget-object p1, Laa/c;->I:Laa/c;

    goto :goto_0

    :cond_4
    sget-object p1, Laa/c;->J:Laa/c;

    :goto_0
    return-object p1
.end method

.method public final b(I)Laa/c;
    .locals 2

    .prologue
    sget-object v0, Laa/c;->E:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()I

    move-result v1

    if-gt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Laa/c;->F:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()I

    move-result v1

    if-gt p1, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Laa/c;->G:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()I

    move-result v1

    if-gt p1, v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Laa/c;->H:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()I

    move-result v1

    if-gt p1, v1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Laa/c;->I:Laa/c;

    invoke-virtual {v0}, Laa/c;->g()I

    move-result v1

    if-gt p1, v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v0, Laa/c;->J:Laa/c;

    :goto_0
    return-object v0
.end method
