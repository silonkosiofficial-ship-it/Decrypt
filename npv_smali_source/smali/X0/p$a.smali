.class public final LX0/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX0/p;
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

    invoke-direct {p0}, LX0/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LX0/p;
    .locals 1

    invoke-static {}, LX0/p;->a()LX0/p;

    move-result-object v0

    return-object v0
.end method
