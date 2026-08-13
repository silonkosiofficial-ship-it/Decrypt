.class public final LO6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO6/i;
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

    invoke-direct {p0}, LO6/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()La7/i;
    .locals 1

    invoke-static {}, LO6/i;->s()La7/i;

    move-result-object v0

    return-object v0
.end method

.method public final b()La7/i;
    .locals 1

    invoke-static {}, LO6/i;->t()La7/i;

    move-result-object v0

    return-object v0
.end method
