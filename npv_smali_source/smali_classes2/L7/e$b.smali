.class public final LL7/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LL7/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LL7/e;
    .locals 1

    invoke-static {}, LL7/e;->F0()Li7/n;

    move-result-object v0

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL7/e;

    return-object v0
.end method
