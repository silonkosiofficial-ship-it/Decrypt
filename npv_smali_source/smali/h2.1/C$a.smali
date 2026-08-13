.class public final Lh2/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/C;
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

    invoke-direct {p0}, Lh2/C$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh2/x$b;)Lh2/C;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, Lh2/C;

    invoke-direct {v0, p1}, Lh2/C;-><init>(Lh2/x$b;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lh2/C;->e()Lh2/C;

    move-result-object v0

    const-string p1, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>"

    invoke-static {v0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
