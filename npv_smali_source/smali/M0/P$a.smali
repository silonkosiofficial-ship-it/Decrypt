.class public final LM0/P$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/P;
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

    invoke-direct {p0}, LM0/P$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LM0/P;
    .locals 1

    invoke-static {}, LM0/P;->a()LM0/P;

    move-result-object v0

    return-object v0
.end method
