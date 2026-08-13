.class public final LP8/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/g;
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

    invoke-direct {p0}, LP8/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LP8/g;
    .locals 2

    new-instance v0, LP8/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/g;-><init>(Ly7/k;)V

    return-object v0
.end method

.method public final b(Ljava/util/Collection;)LP8/g;
    .locals 2

    const-string v0, "set"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP8/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/g;-><init>(Ly7/k;)V

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
