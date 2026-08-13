.class public Lk3/g$a;
.super Lk3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk3/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Lk3/a;
    .locals 1

    invoke-virtual {p0}, Lk3/g$a;->h()Lk3/g$a;

    move-result-object v0

    return-object v0
.end method

.method public g()Lk3/g;
    .locals 1

    new-instance v0, Lk3/g;

    invoke-direct {v0, p0}, Lk3/g;-><init>(Lk3/a;)V

    return-object v0
.end method

.method public h()Lk3/g$a;
    .locals 0

    return-object p0
.end method
