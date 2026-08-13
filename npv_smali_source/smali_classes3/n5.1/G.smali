.class public abstract Ln5/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/G$a;,
        Ln5/G$c;,
        Ln5/G$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ln5/G$a;Ln5/G$c;Ln5/G$b;)Ln5/G;
    .locals 1

    new-instance v0, Ln5/B;

    invoke-direct {v0, p0, p1, p2}, Ln5/B;-><init>(Ln5/G$a;Ln5/G$c;Ln5/G$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ln5/G$a;
.end method

.method public abstract c()Ln5/G$b;
.end method

.method public abstract d()Ln5/G$c;
.end method
