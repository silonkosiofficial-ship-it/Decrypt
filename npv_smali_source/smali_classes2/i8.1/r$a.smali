.class final Li8/r$a;
.super Lp8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp8/b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lp8/e;Lp8/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/r$a;->j(Lp8/e;Lp8/g;)Li8/r;

    move-result-object p1

    return-object p1
.end method

.method public j(Lp8/e;Lp8/g;)Li8/r;
    .locals 2

    new-instance v0, Li8/r;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Li8/r;-><init>(Lp8/e;Lp8/g;Li8/a;)V

    return-object v0
.end method
