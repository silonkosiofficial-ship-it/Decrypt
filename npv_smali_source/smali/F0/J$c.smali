.class public final LF0/J$c;
.super LF0/J$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-string v0, "Undefined intrinsics block and it is required"

    invoke-direct {p0, v0}, LF0/J$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LF0/J$c;->i(LD0/M;Ljava/util/List;J)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, LD0/K;

    return-object p1
.end method

.method public i(LD0/M;Ljava/util/List;J)Ljava/lang/Void;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Undefined measure and it is required"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
