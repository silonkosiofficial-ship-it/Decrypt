.class public final Lb0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/b;
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

    invoke-direct {p0}, Lb0/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LY/g;
    .locals 1

    invoke-static {}, Lb0/b;->g()Lb0/b;

    move-result-object v0

    return-object v0
.end method
