.class public final LV/U0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/U0;
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

    invoke-direct {p0}, LV/U0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LV/U0$a;LV/U0$c;)V
    .locals 0

    invoke-direct {p0, p1}, LV/U0$a;->c(LV/U0$c;)V

    return-void
.end method

.method public static final synthetic b(LV/U0$a;LV/U0$c;)V
    .locals 0

    invoke-direct {p0, p1}, LV/U0$a;->d(LV/U0$c;)V

    return-void
.end method

.method private final c(LV/U0$c;)V
    .locals 3

    .prologue
    :cond_0
    invoke-static {}, LV/U0;->I()LZ8/y;

    move-result-object v0

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY/g;

    invoke-interface {v0, p1}, LY/g;->add(Ljava/lang/Object;)LY/g;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LV/U0;->I()LZ8/y;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method private final d(LV/U0$c;)V
    .locals 3

    .prologue
    :cond_0
    invoke-static {}, LV/U0;->I()LZ8/y;

    move-result-object v0

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY/g;

    invoke-interface {v0, p1}, LY/g;->remove(Ljava/lang/Object;)LY/g;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LV/U0;->I()LZ8/y;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method
