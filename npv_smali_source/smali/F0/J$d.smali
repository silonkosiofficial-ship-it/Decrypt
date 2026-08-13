.class public final LF0/J$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LF0/J$d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/a;
    .locals 1

    invoke-static {}, LF0/J;->q()Lx7/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/Comparator;
    .locals 1

    invoke-static {}, LF0/J;->r()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method
