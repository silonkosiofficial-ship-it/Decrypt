.class final Lu/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
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

    invoke-direct {p0}, Lu/g0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lu/n;
    .locals 1

    invoke-static {}, Lu/g0;->n()Lu/n;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lu/n;
    .locals 1

    invoke-static {}, Lu/g0;->p()Lu/n;

    move-result-object v0

    return-object v0
.end method
