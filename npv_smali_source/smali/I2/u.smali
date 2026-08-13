.class public abstract LI2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/u$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:LQ2/p;

.field private c:Ljava/util/Set;


# direct methods
.method protected constructor <init>(Ljava/util/UUID;LQ2/p;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/u;->a:Ljava/util/UUID;

    iput-object p2, p0, LI2/u;->b:LQ2/p;

    iput-object p3, p0, LI2/u;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI2/u;->a:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LI2/u;->c:Ljava/util/Set;

    return-object v0
.end method

.method public c()LQ2/p;
    .locals 1

    iget-object v0, p0, LI2/u;->b:LQ2/p;

    return-object v0
.end method
