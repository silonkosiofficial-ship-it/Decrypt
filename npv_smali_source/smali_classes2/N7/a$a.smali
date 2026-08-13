.class public final LN7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN7/a;
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

    invoke-direct {p0}, LN7/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln8/f;
    .locals 1

    invoke-static {}, LN7/a;->m()Ln8/f;

    move-result-object v0

    return-object v0
.end method
